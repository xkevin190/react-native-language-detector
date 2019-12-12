
#import <Foundation/Foundation.h>

#import "React/RCTBridgeModule.h"

@interface RCT_EXTERN_MODULE(LanguageDectector, NSObject)

+ (BOOL)requiresMainQueueSetup
{
    return YES;
}
@end

