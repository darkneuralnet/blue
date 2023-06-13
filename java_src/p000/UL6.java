package p000;

import android.support.annotation.NonNull;
/* renamed from: UL6 */
/* loaded from: classes8.dex */
public enum UL6 {
    CMID_EXCEPTION_MESSAGE("PayPal-Client-Metadata-Id exceeds the maximum length allowed. This is your own unique identifier for the payload. If you do not pass in this value, a new PayPal-Client-Metadata-Id is generated per method call. ***Maximum length: 32 characters***"),
    APPGUID_EXCEPTION_MESSAGE("Application’s Globally Unique Identifier (AppGUID) exceeds maximum length allowed, This is a string that identifies the merchant application that sets up Magnes on the mobile device. If the merchant app does not pass an AppGuid, Magnes creates one to identify the app. An AppGuid is an application identifier per-installation; that is, if a new instance of the app is installed on the mobile device, or the app is reinstalled, it will have a new AppGuid. ***Maximum length: 36 characters***");
    

    /* renamed from: b */
    public final String f37279b;

    UL6(String str) {
        this.f37279b = str;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f37279b;
    }
}
