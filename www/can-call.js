var TelephonyChecker = function(){};

TelephonyChecker.prototype.canCall = function(success, failure){
    cordova.exec(success, failure, "PhoneCheck", "checkTelephony", []);
};


cordova.addConstructor(function() {

    if (!window.Cordova) {
        window.Cordova = cordova;
    };

    if(!window.plugins) window.plugins = {};
    window.plugins.TelephonyChecker = new TelephonyChecker();
});
