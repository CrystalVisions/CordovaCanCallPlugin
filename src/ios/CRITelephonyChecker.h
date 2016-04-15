#import <Cordova/CDVPlugin.h>

@interface CRITelephonyChecker : CDVPlugin

- (void) checkTelephony:(CDVInvokedUrlCommand*)command;

@end
