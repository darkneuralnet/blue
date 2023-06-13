package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.state.PaymentSheetLoader;
import kotlin.coroutines.CoroutineContext;
/* loaded from: classes7.dex */
public final class FlowControllerConfigurationHandler_Factory implements InterfaceC48812sj1<FlowControllerConfigurationHandler> {
    private final Y94<EventReporter> eventReporterProvider;
    private final Y94<PaymentSheetLoader> paymentSheetLoaderProvider;
    private final Y94<CoroutineContext> uiContextProvider;
    private final Y94<FlowControllerViewModel> viewModelProvider;

    public FlowControllerConfigurationHandler_Factory(Y94<PaymentSheetLoader> y94, Y94<CoroutineContext> y942, Y94<EventReporter> y943, Y94<FlowControllerViewModel> y944) {
        this.paymentSheetLoaderProvider = y94;
        this.uiContextProvider = y942;
        this.eventReporterProvider = y943;
        this.viewModelProvider = y944;
    }

    public static FlowControllerConfigurationHandler_Factory create(Y94<PaymentSheetLoader> y94, Y94<CoroutineContext> y942, Y94<EventReporter> y943, Y94<FlowControllerViewModel> y944) {
        return new FlowControllerConfigurationHandler_Factory(y94, y942, y943, y944);
    }

    public static FlowControllerConfigurationHandler newInstance(PaymentSheetLoader paymentSheetLoader, CoroutineContext coroutineContext, EventReporter eventReporter, FlowControllerViewModel flowControllerViewModel) {
        return new FlowControllerConfigurationHandler(paymentSheetLoader, coroutineContext, eventReporter, flowControllerViewModel);
    }

    @Override // p000.Y94
    public FlowControllerConfigurationHandler get() {
        return newInstance(this.paymentSheetLoaderProvider.get(), this.uiContextProvider.get(), this.eventReporterProvider.get(), this.viewModelProvider.get());
    }
}
