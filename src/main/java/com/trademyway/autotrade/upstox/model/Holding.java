/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trademyway.autotrade.upstox.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author vhebbar
 */
public class Holding {

    @SerializedName("product")
    public String product;
    @SerializedName("last_price")
    public String lastPrice;
    @SerializedName("price")
    public String price;
    @SerializedName("tradingsymbol")
    public String tradingSymbol;
    @SerializedName("t1_quantity")
    public String t1Quantity;
    @SerializedName("collateral_quantity")
    public String collateralQuantity;
    @SerializedName("collateral_type")
    public String collateraltype;
    @SerializedName("account_id")
    public String accountId;
    @SerializedName("isin")
    public String isin;
    @SerializedName("pnl")
    public String pnl;
    @SerializedName("quantity")
    public String quantity;
    @SerializedName("realised_quantity")
    public String realisedQuantity;
    /*@SerializedName("net_value")
    public String netValue;*/
    @SerializedName("average_price")
    public String averagePrice;
    @SerializedName("exchange")
    public String exchange;
    @SerializedName("instrument_token")
    public String instrumentToken;

    public List<Holding> holdings = new ArrayList<Holding>();

    public Holding() {
    }

    /**
     * parses holdings response and create POJO
     *
     * @param response
     * @throws JSONException
     */
    public void parseHoldingsResponse(JSONObject response) throws JSONException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        holdings = Arrays.asList(gson.fromJson(String.valueOf(response.get("data")), Holding[].class));
    }
}
