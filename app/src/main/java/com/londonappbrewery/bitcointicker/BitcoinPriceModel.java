package com.londonappbrewery.bitcointicker;

import org.json.JSONObject;

/**
 * Created by bigmike2 on 3/14/2018.
 */

public class BitcoinPriceModel {
    private static String mPrice;

    public static  BitcoinPriceModel fromJson(JSONObject jsonobject){
        BitcoinPriceModel bitcoinmodel = new BitcoinPriceModel();
        try{
            bitcoinmodel.mPrice = jsonobject.getString("ask");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return bitcoinmodel;
    }

    public static String getmPrice() {
        return mPrice;
    }
}
