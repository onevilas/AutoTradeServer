/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trademyway.autotrade.app.controller;

import com.rainmatter.kitehttp.exceptions.KiteException;
import com.trademyway.autotrade.app.comparators.PreMarketDataComparator;
import com.trademyway.autotrade.app.utils.AppConstants;
import com.trademyway.autotrade.app.utils.NSEConstants;
import com.trademyway.autotrade.nse.connect.NSEConnect;
import com.trademyway.autotrade.nse.model.FOPreMarketData;
import com.trademyway.autotrade.nse.model.FOPreMarketStock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;

/**
 *
 * @author vhebbar
 */
public class FnOPreMarketFetchController {

    private NSEConnect connect;
    private int strategy;
    private FOPreMarketData preMarketData;

    public FnOPreMarketFetchController() {
        connect = new NSEConnect();
    }

    public void setStrategy(int strategy) {
        this.strategy = strategy;
    }

    public void getFnOPreMarketList() {
        try {
            preMarketData = connect.getFnOPreMarketData();

            //We have a pre market data now.
            //Lets sort the data based on percentage change.
            Collections.sort(preMarketData.getData(), new PreMarketDataComparator());

            //Lets pick the stocks for us
            selectStocksForTrading(AppConstants.STRATEGY_TYPE_GAP_UP_DOWN_TARGET);

        } catch (JSONException ex) {
            Logger.getLogger(FnOPreMarketFetchController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void selectStocksForTrading(int st) {
        switch (st) {
            case AppConstants.STRATEGY_TYPE_GAP_UP_DOWN_TARGET:
                selectStocksForGapUpDownTargetTrading();
                break;
        }
    }

    /**
     * For this strategy we select the stocks from gap up/ down from (-)1% to (-)2.5%
     * @param st 
     */
    private void selectStocksForGapUpDownTargetTrading() {
       
       
        List<FOPreMarketStock> stockList=new ArrayList<>();
       
       //We have data in preMarketData. Lets get the stocks based on our condition.
       double perChange;
       for(FOPreMarketStock stock:preMarketData.getData()){
           perChange=Double.parseDouble(stock.getPercentChange());
           if((perChange >=NSEConstants.MIN_POSITIVE_PERCENT && perChange<=NSEConstants.MAX_POSITIVE_PERCENT) ||
                   (perChange <=NSEConstants.MIN_NEGATIVE_PERCENT && perChange>=NSEConstants.MAX_NEGATIVE_PERCENT)){
               stockList.add(stock);
               System.out.println("Symbol "+stock.getSymbol()+" Percent Change "+stock.getPercentChange()+" "+
                       stock.getSymbol()+" AUG FUT");
           }
       }
       
       List<FOPreMarketStock> newList=filterStocksBasedOnPrice(stockList);
       
       
       //We have stock list with selected stocks for trading now. Lets start placing orders.
       //Its better not to use CO or BO.
       
    }

    private List<FOPreMarketStock> filterStocksBasedOnPrice(List<FOPreMarketStock> stockList) {
        double stockPrice;
        List<FOPreMarketStock> newList=new ArrayList<>();
        for(FOPreMarketStock stock:stockList){
            stockPrice=Double.parseDouble(stock.getCurrentPrice());
            if(stockPrice>=NSEConstants.MIN_STOCK_PRICE && stockPrice<=NSEConstants.MAX_STOCK_PRICE){
                newList.add(stock);
            }
        }
        stockList=null;
        return newList;
    }

}
