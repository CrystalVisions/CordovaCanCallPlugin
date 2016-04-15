package com.sparetimegames.telephonychecker;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;


import android.content.Context;
import android.telephony.TelephonyManager;




/**
* Just check to see if this device has telephony
*/

public class TelephonyChecker extends CordovaPlugin {



  @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

    if(action.equalsIgnoreCase("checkTelephony")) {
        boolean canCall = checkTelephony();

        if(canCall) {
           callbackContext.success();
        }
        else {
           callbackContext.error("This device does not have phone capabilities.");
        }

    }



    return true;
  }

   private boolean checkTelephony() {
    TelephonyManager telephonyManager = (TelephonyManager) cordova.getActivity().getSystemService(Context.TELEPHONY_SERVICE);
    return telephonyManager != null && telephonyManager.getPhoneType() != TelephonyManager.PHONE_TYPE_NONE;
  }






}
