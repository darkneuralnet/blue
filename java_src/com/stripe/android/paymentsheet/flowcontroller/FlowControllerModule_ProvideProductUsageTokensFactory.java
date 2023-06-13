package com.stripe.android.paymentsheet.flowcontroller;

import java.util.Set;
/* loaded from: classes7.dex */
public final class FlowControllerModule_ProvideProductUsageTokensFactory implements InterfaceC48812sj1<Set<String>> {

    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final FlowControllerModule_ProvideProductUsageTokensFactory INSTANCE = new FlowControllerModule_ProvideProductUsageTokensFactory();

        private InstanceHolder() {
        }
    }

    public static FlowControllerModule_ProvideProductUsageTokensFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> provideProductUsageTokens() {
        return (Set) C51679xZ3.m5002e(FlowControllerModule.INSTANCE.provideProductUsageTokens());
    }

    @Override // p000.Y94
    public Set<String> get() {
        return provideProductUsageTokens();
    }
}
