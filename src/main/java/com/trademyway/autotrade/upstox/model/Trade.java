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
import org.json.JSONObject;

/**
 *
 * @author vhebbar
 */
public class Trade {
    @SerializedName("trade_id")
	public String tradeId;
	@SerializedName("order_id")
	public String orderId;
	@SerializedName("exchange_order_id")
	public String exchangeOrderId;
	@SerializedName("tradingsymbol")
	public String tradingSymbol;
	@SerializedName("exchange")
	public String exchange;
	@SerializedName("instrument_token")
	public String instrumentToken;
	@SerializedName("product")
	public String product;
	@SerializedName("average_price")
	public String averagePrice;
	@SerializedName("quantity")
	public String quantity;
	@SerializedName("order_timestamp")
	public String orderTimestamp;
	@SerializedName("exchange_timestamp")
	public String exchangeTimestamp;
	@SerializedName("transaction_type")
	public String transactionType;

	public Trade(){}
	public List<Trade> trades = new ArrayList<Trade>();

	public void parseListTradesResponse(JSONObject response){
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.create();
		trades = Arrays.asList(gson.fromJson(String.valueOf(response.get("data")), Trade[].class));
	}
}
