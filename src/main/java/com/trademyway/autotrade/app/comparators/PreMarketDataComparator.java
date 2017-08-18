/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trademyway.autotrade.app.comparators;

import com.trademyway.autotrade.nse.model.FOPreMarketStock;
import java.util.Comparator;

/**
 *
 * @author vhebbar
 */
public class PreMarketDataComparator implements Comparator<FOPreMarketStock>{

    @Override
    public int compare(FOPreMarketStock o1, FOPreMarketStock o2) {
        double price1=Double.parseDouble(o1.getPercentChange());
        double price2=Double.parseDouble(o2.getPercentChange());
        if(price1==price2){
            return 0;
        }else if(price1>price2){
            return 1;
        }else{
            return -1;
        }
    }

    
}
