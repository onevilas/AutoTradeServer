/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trademyway.autotrade.nse.connect;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vhebbar
 */
public class NSERoutes {

    public Map<String, String> routes;
    private static String _rootUrl = "https://www.nseindia.com/live_market/dynaContent";
    
    public static final String PRE_OPEN_FO="pre_open_fo";

    public NSERoutes() {
        routes = new HashMap<String, String>() {
            {
                put(PRE_OPEN_FO, "/live_analysis/pre_open/fo.json");
            }
        };
    }
    
    public String get(String key){
        return _rootUrl + routes.get(key);
    }
}
