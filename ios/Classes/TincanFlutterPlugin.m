#import "TincanFlutterPlugin.h"
#import <tincan_flutter/tincan_flutter-Swift.h>

@implementation TincanFlutterPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftTincanFlutterPlugin registerWithRegistrar:registrar];
}
@end
