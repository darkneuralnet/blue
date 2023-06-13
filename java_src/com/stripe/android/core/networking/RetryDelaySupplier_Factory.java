package com.stripe.android.core.networking;
/* loaded from: classes6.dex */
public final class RetryDelaySupplier_Factory implements InterfaceC48812sj1<RetryDelaySupplier> {

    /* loaded from: classes6.dex */
    public static final class InstanceHolder {
        private static final RetryDelaySupplier_Factory INSTANCE = new RetryDelaySupplier_Factory();

        private InstanceHolder() {
        }
    }

    public static RetryDelaySupplier_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static RetryDelaySupplier newInstance() {
        return new RetryDelaySupplier();
    }

    @Override // p000.Y94
    public RetryDelaySupplier get() {
        return newInstance();
    }
}
