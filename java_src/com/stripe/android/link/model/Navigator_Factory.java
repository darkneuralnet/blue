package com.stripe.android.link.model;
/* loaded from: classes7.dex */
public final class Navigator_Factory implements InterfaceC48812sj1<Navigator> {

    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final Navigator_Factory INSTANCE = new Navigator_Factory();

        private InstanceHolder() {
        }
    }

    public static Navigator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Navigator newInstance() {
        return new Navigator();
    }

    @Override // p000.Y94
    public Navigator get() {
        return newInstance();
    }
}
