#import <Cordova/CDVPlugin.h>
#import "CRITelephonyChecker.h"

@implementation CRITelephonyChecker

- (void) checkTelephony:(CDVInvokedUrlCommand*)command {

    [self.commandDelegate runInBackground:^{

        CDVPluginResult* pluginResult = nil;



        if(![[UIApplication sharedApplication] canOpenURL:[NSURL URLWithString:number]]) {
            pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_ERROR messageAsString:@"This device does not have phone capabilities."];
        }
        else  {
            pluginResult = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK];
        }

        ß

        [self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];

    }];
}

@end
