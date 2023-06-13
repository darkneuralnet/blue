package com.stripe.android.googlepaylauncher;

import android.content.Context;
/* loaded from: classes7.dex */
public final class PaymentsClientFactory_Factory implements InterfaceC48812sj1<PaymentsClientFactory> {
    private final Y94<Context> contextProvider;

    public PaymentsClientFactory_Factory(Y94<Context> y94) {
        this.contextProvider = y94;
    }

    public static PaymentsClientFactory_Factory create(Y94<Context> y94) {
        return new PaymentsClientFactory_Factory(y94);
    }

    public static PaymentsClientFactory newInstance(Context context) {
        return new PaymentsClientFactory(context);
    }

    @Override // p000.Y94
    public PaymentsClientFactory get() {
        return newInstance(this.contextProvider.get());
    }
}
