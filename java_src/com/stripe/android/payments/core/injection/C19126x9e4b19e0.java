package com.stripe.android.payments.core.injection;

import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
/* renamed from: com.stripe.android.payments.core.injection.Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory */
/* loaded from: classes7.dex */
public final class C19126x9e4b19e0 implements InterfaceC48812sj1<MessageVersionRegistry> {

    /* renamed from: com.stripe.android.payments.core.injection.Stripe3ds2TransactionModule_Companion_ProvideMessageVersionRegistryFactory$InstanceHolder */
    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final C19126x9e4b19e0 INSTANCE = new C19126x9e4b19e0();

        private InstanceHolder() {
        }
    }

    public static C19126x9e4b19e0 create() {
        return InstanceHolder.INSTANCE;
    }

    public static MessageVersionRegistry provideMessageVersionRegistry() {
        return (MessageVersionRegistry) C51679xZ3.m5002e(Stripe3ds2TransactionModule.Companion.provideMessageVersionRegistry());
    }

    @Override // p000.Y94
    public MessageVersionRegistry get() {
        return provideMessageVersionRegistry();
    }
}
