package com.stripe.android.paymentsheet.paymentdatacollection.polling;
/* loaded from: classes7.dex */
public final class DefaultTimeProvider_Factory implements InterfaceC48812sj1<DefaultTimeProvider> {

    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final DefaultTimeProvider_Factory INSTANCE = new DefaultTimeProvider_Factory();

        private InstanceHolder() {
        }
    }

    public static DefaultTimeProvider_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static DefaultTimeProvider newInstance() {
        return new DefaultTimeProvider();
    }

    @Override // p000.Y94
    public DefaultTimeProvider get() {
        return newInstance();
    }
}
