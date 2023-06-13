package com.stripe.android.paymentsheet.model;
/* loaded from: classes7.dex */
public final class StripeIntentValidator_Factory implements InterfaceC48812sj1<StripeIntentValidator> {

    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final StripeIntentValidator_Factory INSTANCE = new StripeIntentValidator_Factory();

        private InstanceHolder() {
        }
    }

    public static StripeIntentValidator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static StripeIntentValidator newInstance() {
        return new StripeIntentValidator();
    }

    @Override // p000.Y94
    public StripeIntentValidator get() {
        return newInstance();
    }
}
