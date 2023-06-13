package com.stripe.android.paymentsheet.injection;
/* loaded from: classes7.dex */
public final class PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory implements InterfaceC48812sj1<Boolean> {

    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory INSTANCE = new PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory();

        private InstanceHolder() {
        }
    }

    public static PaymentSheetCommonModule_Companion_ProvideEnabledLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean provideEnabledLogging() {
        return PaymentSheetCommonModule.Companion.provideEnabledLogging();
    }

    @Override // p000.Y94
    public Boolean get() {
        return Boolean.valueOf(provideEnabledLogging());
    }
}
