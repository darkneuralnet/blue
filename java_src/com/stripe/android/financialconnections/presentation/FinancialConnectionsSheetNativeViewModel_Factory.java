package com.stripe.android.financialconnections.presentation;

import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.p040di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.utils.UriUtils;
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeViewModel_Factory implements InterfaceC48812sj1<FinancialConnectionsSheetNativeViewModel> {
    private final Y94<FinancialConnectionsSheetNativeComponent> activityRetainedComponentProvider;
    private final Y94<String> applicationIdProvider;
    private final Y94<CompleteFinancialConnectionsSession> completeFinancialConnectionsSessionProvider;
    private final Y94<FinancialConnectionsAnalyticsTracker> eventTrackerProvider;
    private final Y94<FinancialConnectionsSheetNativeState> initialStateProvider;
    private final Y94<Logger> loggerProvider;
    private final Y94<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Y94<UriUtils> uriUtilsProvider;

    public FinancialConnectionsSheetNativeViewModel_Factory(Y94<FinancialConnectionsSheetNativeComponent> y94, Y94<NativeAuthFlowCoordinator> y942, Y94<UriUtils> y943, Y94<CompleteFinancialConnectionsSession> y944, Y94<FinancialConnectionsAnalyticsTracker> y945, Y94<Logger> y946, Y94<String> y947, Y94<FinancialConnectionsSheetNativeState> y948) {
        this.activityRetainedComponentProvider = y94;
        this.nativeAuthFlowCoordinatorProvider = y942;
        this.uriUtilsProvider = y943;
        this.completeFinancialConnectionsSessionProvider = y944;
        this.eventTrackerProvider = y945;
        this.loggerProvider = y946;
        this.applicationIdProvider = y947;
        this.initialStateProvider = y948;
    }

    public static FinancialConnectionsSheetNativeViewModel_Factory create(Y94<FinancialConnectionsSheetNativeComponent> y94, Y94<NativeAuthFlowCoordinator> y942, Y94<UriUtils> y943, Y94<CompleteFinancialConnectionsSession> y944, Y94<FinancialConnectionsAnalyticsTracker> y945, Y94<Logger> y946, Y94<String> y947, Y94<FinancialConnectionsSheetNativeState> y948) {
        return new FinancialConnectionsSheetNativeViewModel_Factory(y94, y942, y943, y944, y945, y946, y947, y948);
    }

    public static FinancialConnectionsSheetNativeViewModel newInstance(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, UriUtils uriUtils, CompleteFinancialConnectionsSession completeFinancialConnectionsSession, FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker, Logger logger, String str, FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState) {
        return new FinancialConnectionsSheetNativeViewModel(financialConnectionsSheetNativeComponent, nativeAuthFlowCoordinator, uriUtils, completeFinancialConnectionsSession, financialConnectionsAnalyticsTracker, logger, str, financialConnectionsSheetNativeState);
    }

    @Override // p000.Y94
    public FinancialConnectionsSheetNativeViewModel get() {
        return newInstance(this.activityRetainedComponentProvider.get(), this.nativeAuthFlowCoordinatorProvider.get(), this.uriUtilsProvider.get(), this.completeFinancialConnectionsSessionProvider.get(), this.eventTrackerProvider.get(), this.loggerProvider.get(), this.applicationIdProvider.get(), this.initialStateProvider.get());
    }
}
