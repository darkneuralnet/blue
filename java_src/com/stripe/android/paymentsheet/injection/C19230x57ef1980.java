package com.stripe.android.paymentsheet.injection;

import com.stripe.android.paymentsheet.analytics.EventReporter;
/* renamed from: com.stripe.android.paymentsheet.injection.PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory */
/* loaded from: classes7.dex */
public final class C19230x57ef1980 implements InterfaceC48812sj1<EventReporter.Mode> {

    /* renamed from: com.stripe.android.paymentsheet.injection.PaymentSheetLauncherModule_Companion_ProvideEventReporterModeFactory$InstanceHolder */
    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final C19230x57ef1980 INSTANCE = new C19230x57ef1980();

        private InstanceHolder() {
        }
    }

    public static C19230x57ef1980 create() {
        return InstanceHolder.INSTANCE;
    }

    public static EventReporter.Mode provideEventReporterMode() {
        return (EventReporter.Mode) C51679xZ3.m5002e(PaymentSheetLauncherModule.Companion.provideEventReporterMode());
    }

    @Override // p000.Y94
    public EventReporter.Mode get() {
        return provideEventReporterMode();
    }
}
