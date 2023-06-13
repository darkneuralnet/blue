package com.stripe.android.financialconnections.domain;
/* loaded from: classes7.dex */
public final class NativeAuthFlowCoordinator_Factory implements InterfaceC48812sj1<NativeAuthFlowCoordinator> {

    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final NativeAuthFlowCoordinator_Factory INSTANCE = new NativeAuthFlowCoordinator_Factory();

        private InstanceHolder() {
        }
    }

    public static NativeAuthFlowCoordinator_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static NativeAuthFlowCoordinator newInstance() {
        return new NativeAuthFlowCoordinator();
    }

    @Override // p000.Y94
    public NativeAuthFlowCoordinator get() {
        return newInstance();
    }
}
