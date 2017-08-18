/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trademyway.autotrade.nse.http;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.trademyway.autotrade.upstox.connect.UpStoxConnect;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author vhebbar
 */
public class NSERequest {

    public NSERequest() {

    }

    /**
     * GET request using UniRest library without parameters.
     */
    public JSONObject getRequest(String url) throws JSONException {

        try {
            if (UpStoxConnect.httpHost != null) {
                Unirest.setProxy(UpStoxConnect.httpHost);
            }
            System.out.println("URL "+url);
            HttpResponse<JsonNode> response = Unirest.get(url)
                    .header("accept", "application/json")
                    .asJson();

            JsonNode body = response.getBody();
            JSONObject jsonObject = body.getObject();
            int code = response.getStatus();

            if (code == 200) {
                return jsonObject;
            }

        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * POST request using UniRest library.
     */
    public JSONObject postRequest(String url, Map<String, Object> params) throws JSONException {
        try {
            if (UpStoxConnect.httpHost != null) {
                Unirest.setProxy(UpStoxConnect.httpHost);
            }
            HttpResponse<JsonNode> response;
            response = Unirest.post(url)
                    .header("accept", "application/json")
                    .fields(params)
                    .asJson();

            JsonNode body = response.getBody();
            JSONObject jsonObject = body.getObject();
            int code = response.getStatus();

            if (code == 200) {
                return jsonObject;
            }
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return null;
    }

}
