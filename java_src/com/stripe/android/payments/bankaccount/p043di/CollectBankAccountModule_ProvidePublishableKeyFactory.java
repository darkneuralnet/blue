package com.stripe.android.payments.bankaccount.p043di;

import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import kotlin.jvm.functions.Function0;
/* renamed from: com.stripe.android.payments.bankaccount.di.CollectBankAccountModule_ProvidePublishableKeyFactory */
/* loaded from: classes7.dex */
public final class CollectBankAccountModule_ProvidePublishableKeyFactory implements InterfaceC48812sj1<Function0<String>> {
    private final Y94<CollectBankAccountContract.Args> argsProvider;

    public CollectBankAccountModule_ProvidePublishableKeyFactory(Y94<CollectBankAccountContract.Args> y94) {
        this.argsProvider = y94;
    }

    public static CollectBankAccountModule_ProvidePublishableKeyFactory create(Y94<CollectBankAccountContract.Args> y94) {
        return new CollectBankAccountModule_ProvidePublishableKeyFactory(y94);
    }

    public static Function0<String> providePublishableKey(CollectBankAccountContract.Args args) {
        return (Function0) C51679xZ3.m5002e(CollectBankAccountModule.INSTANCE.providePublishableKey(args));
    }

    @Override // p000.Y94
    public Function0<String> get() {
        return providePublishableKey(this.argsProvider.get());
    }
}
