/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trademyway.autotrade.nse.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 *
 * @author vhebbar
 */
public class FOPreMarketStock {
    @SerializedName("caAct")
    private String caAct;
    @SerializedName("chn")
    private String valueChange;
    @SerializedName("finQnty")
    private String quantity;
    @SerializedName("iep")
    private String currentPrice;
    @SerializedName("iVal")
    private String valueInLakhs;
    @SerializedName("mktCap")
    private String marketCap;
    @SerializedName("pCls")
    private String previousClose;
    @SerializedName("perChn")
    private String percentChange;
    @SerializedName("sumfinQnty")
    private String sumfinQnty; 
    @SerializedName("sumQnty")
    private String sumQnty; 
    @SerializedName("sumVal")
    private String sumValue;
    @SerializedName("symbol")
    private String symbol;
    @SerializedName("trdQnty")
    private String tradedQuantity; 
    @SerializedName("xDt")
    private String xDt; 
    @SerializedName("yHigh")
    private String yearHigh; 
    @SerializedName("yLow")
    private String yearLow;

    public String getCaAct() {
        return caAct;
    }

    public void setCaAct(String caAct) {
        this.caAct = caAct;
    }

    public String getValueChange() {
        return valueChange;
    }

    public void setValueChange(String valueChange) {
        this.valueChange = valueChange;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getValueInLakhs() {
        return valueInLakhs;
    }

    public void setValueInLakhs(String valueInLakhs) {
        this.valueInLakhs = valueInLakhs;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    public String getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(String previousClose) {
        this.previousClose = previousClose;
    }

    public String getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(String percentChange) {
        this.percentChange = percentChange;
    }

    public String getSumfinQnty() {
        return sumfinQnty;
    }

    public void setSumfinQnty(String sumfinQnty) {
        this.sumfinQnty = sumfinQnty;
    }

    public String getSumQnty() {
        return sumQnty;
    }

    public void setSumQnty(String sumQnty) {
        this.sumQnty = sumQnty;
    }

    public String getSumValue() {
        return sumValue;
    }

    public void setSumValue(String sumValue) {
        this.sumValue = sumValue;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getTradedQuantity() {
        return tradedQuantity;
    }

    public void setTradedQuantity(String tradedQuantity) {
        this.tradedQuantity = tradedQuantity;
    }

    public String getxDt() {
        return xDt;
    }

    public void setxDt(String xDt) {
        this.xDt = xDt;
    }

    public String getYearHigh() {
        return yearHigh;
    }

    public void setYearHigh(String yearHigh) {
        this.yearHigh = yearHigh;
    }

    public String getYearLow() {
        return yearLow;
    }

    public void setYearLow(String yearLow) {
        this.yearLow = yearLow;
    }

    @Override
    public String toString() {
        return "FOPreMarketStock{" + "caAct=" + caAct + ", valueChange=" + valueChange + ", quantity=" + quantity + ", currentPrice=" + currentPrice + ", valueInLakhs=" + valueInLakhs + ", marketCap=" + marketCap + ", previousClose=" + previousClose + ", percentChange=" + percentChange + ", sumfinQnty=" + sumfinQnty + ", sumQnty=" + sumQnty + ", sumValue=" + sumValue + ", symbol=" + symbol + ", tradedQuantity=" + tradedQuantity + ", xDt=" + xDt + ", yearHigh=" + yearHigh + ", yearLow=" + yearLow + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.caAct);
        hash = 97 * hash + Objects.hashCode(this.valueChange);
        hash = 97 * hash + Objects.hashCode(this.quantity);
        hash = 97 * hash + Objects.hashCode(this.currentPrice);
        hash = 97 * hash + Objects.hashCode(this.valueInLakhs);
        hash = 97 * hash + Objects.hashCode(this.marketCap);
        hash = 97 * hash + Objects.hashCode(this.previousClose);
        hash = 97 * hash + Objects.hashCode(this.percentChange);
        hash = 97 * hash + Objects.hashCode(this.sumfinQnty);
        hash = 97 * hash + Objects.hashCode(this.sumQnty);
        hash = 97 * hash + Objects.hashCode(this.sumValue);
        hash = 97 * hash + Objects.hashCode(this.symbol);
        hash = 97 * hash + Objects.hashCode(this.tradedQuantity);
        hash = 97 * hash + Objects.hashCode(this.xDt);
        hash = 97 * hash + Objects.hashCode(this.yearHigh);
        hash = 97 * hash + Objects.hashCode(this.yearLow);
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
        final FOPreMarketStock other = (FOPreMarketStock) obj;
        if (!Objects.equals(this.caAct, other.caAct)) {
            return false;
        }
        if (!Objects.equals(this.valueChange, other.valueChange)) {
            return false;
        }
        if (!Objects.equals(this.quantity, other.quantity)) {
            return false;
        }
        if (!Objects.equals(this.currentPrice, other.currentPrice)) {
            return false;
        }
        if (!Objects.equals(this.valueInLakhs, other.valueInLakhs)) {
            return false;
        }
        if (!Objects.equals(this.marketCap, other.marketCap)) {
            return false;
        }
        if (!Objects.equals(this.previousClose, other.previousClose)) {
            return false;
        }
        if (!Objects.equals(this.percentChange, other.percentChange)) {
            return false;
        }
        if (!Objects.equals(this.sumfinQnty, other.sumfinQnty)) {
            return false;
        }
        if (!Objects.equals(this.sumQnty, other.sumQnty)) {
            return false;
        }
        if (!Objects.equals(this.sumValue, other.sumValue)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (!Objects.equals(this.tradedQuantity, other.tradedQuantity)) {
            return false;
        }
        if (!Objects.equals(this.xDt, other.xDt)) {
            return false;
        }
        if (!Objects.equals(this.yearHigh, other.yearHigh)) {
            return false;
        }
        if (!Objects.equals(this.yearLow, other.yearLow)) {
            return false;
        }
        return true;
    }
    
        
    
    
}
