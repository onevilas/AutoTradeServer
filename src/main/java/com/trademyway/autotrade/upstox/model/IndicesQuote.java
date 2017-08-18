/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trademyway.autotrade.upstox.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author vhebbar
 */
public class IndicesQuote {
    

    @SerializedName("change")
    public double change;
    @SerializedName("change_percent")
    public double changePercent;
    @SerializedName("last_price")
    public double lastPrice;
    @SerializedName("close")
    public double close;
    @SerializedName("open")
    public double open;

    /**
     * Parses response from quotes API.
     * @return Quote is POJO sent back to user.
     * @param response JSON response from server.
     * @throws JSONException JSON parsing error.
     */
    public IndicesQuote parseIndicesResponse(JSONObject response) throws JSONException {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        IndicesQuote indicesQuote = gson.fromJson(String.valueOf(response.get("data")), IndicesQuote.class);
        return indicesQuote;
    }
}
