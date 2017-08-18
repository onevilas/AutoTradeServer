/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trademyway.autotrade.nse.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.trademyway.autotrade.upstox.model.Quote;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author vhebbar
 */
public class FOPreMarketData {
    private int advances;
    private int declines;
    private int noChange;
    private List<FOPreMarketStock> data;
    
    public int getAdvances() {
        return advances;
    }

    public void setAdvances(int advances) {
        this.advances = advances;
    }

    public int getDeclines() {
        return declines;
    }

    public void setDeclines(int declines) {
        this.declines = declines;
    }

    public int getNoChange() {
        return noChange;
    }

    public void setNoChange(int noChange) {
        this.noChange = noChange;
    }

    public List<FOPreMarketStock> getData() {
        return data;
    }

    public void setData(List<FOPreMarketStock> data) {
        this.data = data;
    }
    
    public FOPreMarketData parsePreMarketFnOData(JSONObject response) throws JSONException{
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        FOPreMarketData preMarketDataFO = gson.fromJson(response.toString(), FOPreMarketData.class);
        setData(preMarketDataFO.data);
        return preMarketDataFO;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.advances;
        hash = 47 * hash + this.declines;
        hash = 47 * hash + this.noChange;
        hash = 47 * hash + Objects.hashCode(this.data);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FOPreMarketData other = (FOPreMarketData) obj;
        if (this.advances != other.advances) {
            return false;
        }
        if (this.declines != other.declines) {
            return false;
        }
        if (this.noChange != other.noChange) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }
    
    
}
