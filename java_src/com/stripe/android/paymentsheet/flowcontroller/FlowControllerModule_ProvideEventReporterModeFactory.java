package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.analytics.EventReporter;
/* loaded from: classes7.dex */
public final class FlowControllerModule_ProvideEventReporterModeFactory implements InterfaceC48812sj1<EventReporter.Mode> {

    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final FlowControllerModule_ProvideEventReporterModeFactory INSTANCE = new FlowControllerModule_ProvideEventReporterModeFactory();

        private InstanceHolder() {
        }
    }

    public static FlowControllerModule_ProvideEventReporterModeFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventReporter.Mode provideEventReporterMode() {
        return (EventReporter.Mode) C51679xZ3.m5002e(FlowControllerModule.INSTANCE.provideEventReporterMode());
    }

    @Override // p000.Y94
    public EventReporter.Mode get() {
        return provideEventReporterMode();
    }
}
