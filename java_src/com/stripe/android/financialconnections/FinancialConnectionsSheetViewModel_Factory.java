package com.stripe.android.financialconnections;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.FetchFinancialConnectionsSessionForToken;
import com.stripe.android.financialconnections.domain.NativeAuthFlowRouter;
import com.stripe.android.financialconnections.domain.SynchronizeFinancialConnectionsSession;
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetViewModel_Factory implements InterfaceC48812sj1<FinancialConnectionsSheetViewModel> {
    private final Y94<String> applicationIdProvider;
    private final Y94<FinancialConnectionsEventReporter> eventReporterProvider;
    private final Y94<FetchFinancialConnectionsSessionForToken> fetchFinancialConnectionsSessionForTokenProvider;
    private final Y94<FetchFinancialConnectionsSession> fetchFinancialConnectionsSessionProvider;
    private final Y94<FinancialConnectionsSheetState> initialStateProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<NativeAuthFlowRouter> nativeRouterProvider;
    private final Y94<SynchronizeFinancialConnectionsSession> synchronizeFinancialConnectionsSessionProvider;

    public FinancialConnectionsSheetViewModel_Factory(Y94<String> y94, Y94<SynchronizeFinancialConnectionsSession> y942, Y94<FetchFinancialConnectionsSession> y943, Y94<FetchFinancialConnectionsSessionForToken> y944, Y94<Logger> y945, Y94<FinancialConnectionsEventReporter> y946, Y94<NativeAuthFlowRouter> y947, Y94<FinancialConnectionsSheetState> y948) {
        this.applicationIdProvider = y94;
        this.synchronizeFinancialConnectionsSessionProvider = y942;
        this.fetchFinancialConnectionsSessionProvider = y943;
        this.fetchFinancialConnectionsSessionForTokenProvider = y944;
        this.loggerProvider = y945;
        this.eventReporterProvider = y946;
        this.nativeRouterProvider = y947;
        this.initialStateProvider = y948;
    }

    public static FinancialConnectionsSheetViewModel_Factory create(Y94<String> y94, Y94<SynchronizeFinancialConnectionsSession> y942, Y94<FetchFinancialConnectionsSession> y943, Y94<FetchFinancialConnectionsSessionForToken> y944, Y94<Logger> y945, Y94<FinancialConnectionsEventReporter> y946, Y94<NativeAuthFlowRouter> y947, Y94<FinancialConnectionsSheetState> y948) {
        return new FinancialConnectionsSheetViewModel_Factory(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    public static FinancialConnectionsSheetViewModel newInstance(String str, SynchronizeFinancialConnectionsSession synchronizeFinancialConnectionsSession, FetchFinancialConnectionsSession fetchFinancialConnectionsSession, FetchFinancialConnectionsSessionForToken fetchFinancialConnectionsSessionForToken, Logger logger, FinancialConnectionsEventReporter financialConnectionsEventReporter, NativeAuthFlowRouter nativeAuthFlowRouter, FinancialConnectionsSheetState financialConnectionsSheetState) {
        return new FinancialConnectionsSheetViewModel(str, synchronizeFinancialConnectionsSession, fetchFinancialConnectionsSession, fetchFinancialConnectionsSessionForToken, logger, financialConnectionsEventReporter, nativeAuthFlowRouter, financialConnectionsSheetState);
    }

    @Override // p000.Y94
    public FinancialConnectionsSheetViewModel get() {
        return newInstance(this.applicationIdProvider.get(), this.synchronizeFinancialConnectionsSessionProvider.get(), this.fetchFinancialConnectionsSessionProvider.get(), this.fetchFinancialConnectionsSessionForTokenProvider.get(), this.loggerProvider.get(), this.eventReporterProvider.get(), this.nativeRouterProvider.get(), this.initialStateProvider.get());
    }
}
