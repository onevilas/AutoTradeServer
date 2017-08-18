/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trademyway.autotrade.upstox.model;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author vhebbar
 */
public class OHLC {

    @SerializedName("high")
    public double high;
    @SerializedName("low")
    public double low;
    @SerializedName("close")
    public double close;
    @SerializedName("open")
    public double open;
}
