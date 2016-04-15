## CordovaCanCallPlugin

Simple plugin to determine if your device can make a phone call in android or iOS

##### Example Usage: 

        var onSuccess = function() {
             //Do something if we can call 
        }
        
        var onError = function(result) {
             //Do something if we cannot call 
             //You might want to display the 
             //result:  'This device does not have phone capabilities.'
             //or whatever you want.
        }
        
        window.plugins.TelephonyChecker.canCall(onSuccess,onError);
