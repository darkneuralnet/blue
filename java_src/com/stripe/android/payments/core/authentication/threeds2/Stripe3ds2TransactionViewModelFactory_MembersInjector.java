package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent;
import dagger.MembersInjector;
/* loaded from: classes7.dex */
public final class Stripe3ds2TransactionViewModelFactory_MembersInjector implements MembersInjector<Stripe3ds2TransactionViewModelFactory> {
    private final Y94<Stripe3ds2TransactionViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public Stripe3ds2TransactionViewModelFactory_MembersInjector(Y94<Stripe3ds2TransactionViewModelSubcomponent.Builder> y94) {
        this.subComponentBuilderProvider = y94;
    }

    public static MembersInjector<Stripe3ds2TransactionViewModelFactory> create(Y94<Stripe3ds2TransactionViewModelSubcomponent.Builder> y94) {
        return new Stripe3ds2TransactionViewModelFactory_MembersInjector(y94);
    }

    public static void injectSubComponentBuilder(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory, Stripe3ds2TransactionViewModelSubcomponent.Builder builder) {
        stripe3ds2TransactionViewModelFactory.subComponentBuilder = builder;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(Stripe3ds2TransactionViewModelFactory stripe3ds2TransactionViewModelFactory) {
        injectSubComponentBuilder(stripe3ds2TransactionViewModelFactory, this.subComponentBuilderProvider.get());
    }
}
