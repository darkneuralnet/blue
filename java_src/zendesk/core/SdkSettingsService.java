package zendesk.core;

import java.util.Map;
/* loaded from: classes8.dex */
interface SdkSettingsService {
    @NA1("/api/private/mobile_sdk/settings/{applicationId}.json")
    InterfaceC51431x80<Map<String, AbstractC52360yi2>> getSettings(@InterfaceC52701zH1("Accept-Language") String str, @InterfaceC39678dJ3("applicationId") String str2);
}
