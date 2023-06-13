package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000.InterfaceC12447ba;
import p000.InterfaceC41597gZ0;
/* loaded from: classes6.dex */
public class AnalyticsDeferredProxy {
    private final InterfaceC41597gZ0<InterfaceC12447ba> analyticsConnectorDeferred;
    private volatile AnalyticsEventLogger analyticsEventLogger;
    private final List<BreadcrumbHandler> breadcrumbHandlerList;
    private volatile BreadcrumbSource breadcrumbSource;

    public AnalyticsDeferredProxy(InterfaceC41597gZ0<InterfaceC12447ba> interfaceC41597gZ0) {
        this(interfaceC41597gZ0, new DisabledBreadcrumbSource(), new UnavailableAnalyticsEventLogger());
    }

    private void init() {
        this.analyticsConnectorDeferred.mo16724a(new InterfaceC41597gZ0.InterfaceC20924a() { // from class: ia
            @Override // p000.InterfaceC41597gZ0.InterfaceC20924a
            /* renamed from: a */
            public final void mo18368a(X94 x94) {
                AnalyticsDeferredProxy.this.lambda$init$2(x94);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAnalyticsEventLogger$1(String str, Bundle bundle) {
        this.analyticsEventLogger.logEvent(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getDeferredBreadcrumbSource$0(BreadcrumbHandler breadcrumbHandler) {
        synchronized (this) {
            if (this.breadcrumbSource instanceof DisabledBreadcrumbSource) {
                this.breadcrumbHandlerList.add(breadcrumbHandler);
            }
            this.breadcrumbSource.registerBreadcrumbHandler(breadcrumbHandler);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(X94 x94) {
        Logger.getLogger().m47341d("AnalyticsConnector now available.");
        InterfaceC12447ba interfaceC12447ba = (InterfaceC12447ba) x94.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(interfaceC12447ba);
        CrashlyticsAnalyticsListener crashlyticsAnalyticsListener = new CrashlyticsAnalyticsListener();
        if (subscribeToAnalyticsEvents(interfaceC12447ba, crashlyticsAnalyticsListener) != null) {
            Logger.getLogger().m47341d("Registered Firebase Analytics listener.");
            BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
            BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (BreadcrumbHandler breadcrumbHandler : this.breadcrumbHandlerList) {
                    breadcrumbAnalyticsEventReceiver.registerBreadcrumbHandler(breadcrumbHandler);
                }
                crashlyticsAnalyticsListener.setBreadcrumbEventReceiver(breadcrumbAnalyticsEventReceiver);
                crashlyticsAnalyticsListener.setCrashlyticsOriginEventReceiver(blockingAnalyticsEventLogger);
                this.breadcrumbSource = breadcrumbAnalyticsEventReceiver;
                this.analyticsEventLogger = blockingAnalyticsEventLogger;
            }
            return;
        }
        Logger.getLogger().m47333w("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private static InterfaceC12447ba.InterfaceC12448a subscribeToAnalyticsEvents(InterfaceC12447ba interfaceC12447ba, CrashlyticsAnalyticsListener crashlyticsAnalyticsListener) {
        InterfaceC12447ba.InterfaceC12448a mo61207c = interfaceC12447ba.mo61207c("clx", crashlyticsAnalyticsListener);
        if (mo61207c == null) {
            Logger.getLogger().m47341d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            mo61207c = interfaceC12447ba.mo61207c("crash", crashlyticsAnalyticsListener);
            if (mo61207c != null) {
                Logger.getLogger().m47333w("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return mo61207c;
    }

    public AnalyticsEventLogger getAnalyticsEventLogger() {
        return new AnalyticsEventLogger() { // from class: ha
            @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
            public final void logEvent(String str, Bundle bundle) {
                AnalyticsDeferredProxy.this.lambda$getAnalyticsEventLogger$1(str, bundle);
            }
        };
    }

    public BreadcrumbSource getDeferredBreadcrumbSource() {
        return new BreadcrumbSource() { // from class: ga
            @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
            public final void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
                AnalyticsDeferredProxy.this.lambda$getDeferredBreadcrumbSource$0(breadcrumbHandler);
            }
        };
    }

    public AnalyticsDeferredProxy(InterfaceC41597gZ0<InterfaceC12447ba> interfaceC41597gZ0, BreadcrumbSource breadcrumbSource, AnalyticsEventLogger analyticsEventLogger) {
        this.analyticsConnectorDeferred = interfaceC41597gZ0;
        this.breadcrumbSource = breadcrumbSource;
        this.breadcrumbHandlerList = new ArrayList();
        this.analyticsEventLogger = analyticsEventLogger;
        init();
    }
}
