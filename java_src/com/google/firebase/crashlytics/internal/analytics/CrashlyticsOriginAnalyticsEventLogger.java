package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
/* loaded from: classes6.dex */
public class CrashlyticsOriginAnalyticsEventLogger implements AnalyticsEventLogger {
    static final String FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS = "clx";
    private final InterfaceC12447ba analyticsConnector;

    public CrashlyticsOriginAnalyticsEventLogger(InterfaceC12447ba interfaceC12447ba) {
        this.analyticsConnector = interfaceC12447ba;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(String str, Bundle bundle) {
        this.analyticsConnector.mo61209a(FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS, str, bundle);
    }
}
