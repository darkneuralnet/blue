package com.stripe.android.payments.paymentlauncher;

import com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import dagger.MembersInjector;
/* loaded from: classes7.dex */
public final class PaymentLauncherViewModel_Factory_MembersInjector implements MembersInjector<PaymentLauncherViewModel.Factory> {
    private final Y94<PaymentLauncherViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public PaymentLauncherViewModel_Factory_MembersInjector(Y94<PaymentLauncherViewModelSubcomponent.Builder> y94) {
        this.subComponentBuilderProvider = y94;
    }

    public static MembersInjector<PaymentLauncherViewModel.Factory> create(Y94<PaymentLauncherViewModelSubcomponent.Builder> y94) {
        return new PaymentLauncherViewModel_Factory_MembersInjector(y94);
    }

    public static void injectSubComponentBuilderProvider(PaymentLauncherViewModel.Factory factory, Y94<PaymentLauncherViewModelSubcomponent.Builder> y94) {
        factory.subComponentBuilderProvider = y94;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PaymentLauncherViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}
