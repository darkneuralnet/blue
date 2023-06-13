package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.debug.DebugConfiguration;
/* loaded from: classes7.dex */
public final class NativeAuthFlowRouter_Factory implements InterfaceC48812sj1<NativeAuthFlowRouter> {
    private final Y94<DebugConfiguration> debugConfigurationProvider;
    private final Y94<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;

    public NativeAuthFlowRouter_Factory(Y94<FinancialConnectionsAnalyticsTracker> y94, Y94<DebugConfiguration> y942) {
        this.eventTrackerProvider = y94;
        this.debugConfigurationProvider = y942;
    }

    public static NativeAuthFlowRouter_Factory create(Y94<FinancialConnectionsAnalyticsTracker> y94, Y94<DebugConfiguration> y942) {
        return new NativeAuthFlowRouter_Factory(y94, y942);
    }

    public static NativeAuthFlowRouter newInstance(FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, DebugConfiguration debugConfiguration) {
        return new NativeAuthFlowRouter(financialConnectionsAnalyticsTracker, debugConfiguration);
    }

    @Override // p000.Y94
    public NativeAuthFlowRouter get() {
        return newInstance(this.eventTrackerProvider.get(), this.debugConfigurationProvider.get());
    }
}
