package com.stripe.android.payments.bankaccount.p043di;

import java.util.Set;
/* renamed from: com.stripe.android.payments.bankaccount.di.CollectBankAccountModule_ProvidesProductUsageFactory */
/* loaded from: classes7.dex */
public final class CollectBankAccountModule_ProvidesProductUsageFactory implements InterfaceC48812sj1<Set<String>> {

    /* renamed from: com.stripe.android.payments.bankaccount.di.CollectBankAccountModule_ProvidesProductUsageFactory$InstanceHolder */
    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final CollectBankAccountModule_ProvidesProductUsageFactory INSTANCE = new CollectBankAccountModule_ProvidesProductUsageFactory();

        private InstanceHolder() {
        }
    }

    public static CollectBankAccountModule_ProvidesProductUsageFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Set<String> providesProductUsage() {
        return (Set) C51679xZ3.m5002e(CollectBankAccountModule.INSTANCE.providesProductUsage());
    }

    @Override // p000.Y94
    public Set<String> get() {
        return providesProductUsage();
    }
}
