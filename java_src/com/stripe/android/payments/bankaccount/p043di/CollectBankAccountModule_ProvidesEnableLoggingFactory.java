package com.stripe.android.payments.bankaccount.p043di;
/* renamed from: com.stripe.android.payments.bankaccount.di.CollectBankAccountModule_ProvidesEnableLoggingFactory */
/* loaded from: classes7.dex */
public final class CollectBankAccountModule_ProvidesEnableLoggingFactory implements InterfaceC48812sj1<Boolean> {

    /* renamed from: com.stripe.android.payments.bankaccount.di.CollectBankAccountModule_ProvidesEnableLoggingFactory$InstanceHolder */
    /* loaded from: classes7.dex */
    public static final class InstanceHolder {
        private static final CollectBankAccountModule_ProvidesEnableLoggingFactory INSTANCE = new CollectBankAccountModule_ProvidesEnableLoggingFactory();

        private InstanceHolder() {
        }
    }

    public static CollectBankAccountModule_ProvidesEnableLoggingFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static boolean providesEnableLogging() {
        return CollectBankAccountModule.INSTANCE.providesEnableLogging();
    }

    @Override // p000.Y94
    public Boolean get() {
        return Boolean.valueOf(providesEnableLogging());
    }
}
