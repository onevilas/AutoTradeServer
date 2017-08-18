/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trademyway.autotrade.upstox.model;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author vhebbar
 */
public class HistoricalData {
    public String timeStamp;
    public double open;
    public double high;
    public double low;
    public double close;
    public long volume;
    public List<HistoricalData> dataArrayList = new ArrayList<HistoricalData>();

    public void parseResponse(JSONObject response) throws JSONException{
        JSONObject data = response.getJSONObject("data");
        JSONArray candleArray = data.getJSONArray("candles");
        for(int i = 0; i < candleArray.length(); i++){
            JSONArray itemArray = candleArray.getJSONArray(i);
            HistoricalData historicalData = new HistoricalData();
            historicalData.timeStamp = itemArray.getString(0);
            historicalData.open = itemArray.getDouble(1);
            historicalData.high = itemArray.getDouble(2);
            historicalData.low = itemArray.getDouble(3);
            historicalData.close = itemArray.getDouble(4);
            historicalData.volume = itemArray.getLong(5);
            dataArrayList.add(historicalData);
        }
    }
}
