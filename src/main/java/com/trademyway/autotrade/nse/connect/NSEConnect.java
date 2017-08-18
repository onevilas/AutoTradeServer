/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trademyway.autotrade.nse.connect;

import com.rainmatter.kitehttp.exceptions.KiteException;
import com.trademyway.autotrade.nse.http.NSERequest;
import com.trademyway.autotrade.nse.model.FOPreMarketData;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author vhebbar
 */
public class NSEConnect {
    
    private NSERoutes routes = new NSERoutes();
    
    public FOPreMarketData getFnOPreMarketData() throws JSONException {
        String url=routes.get(NSERoutes.PRE_OPEN_FO);
        JSONObject jsonObject = new NSERequest().getRequest(url);
        FOPreMarketData data=new FOPreMarketData();
        data.parsePreMarketFnOData(jsonObject);
        return data;
    }
    
}
