package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.injection.PaymentSheetViewModelSubcomponent;
import dagger.MembersInjector;
/* loaded from: classes7.dex */
public final class PaymentSheetViewModel_Factory_MembersInjector implements MembersInjector<PaymentSheetViewModel.Factory> {
    private final Y94<PaymentSheetViewModelSubcomponent.Builder> subComponentBuilderProvider;

    public PaymentSheetViewModel_Factory_MembersInjector(Y94<PaymentSheetViewModelSubcomponent.Builder> y94) {
        this.subComponentBuilderProvider = y94;
    }

    public static MembersInjector<PaymentSheetViewModel.Factory> create(Y94<PaymentSheetViewModelSubcomponent.Builder> y94) {
        return new PaymentSheetViewModel_Factory_MembersInjector(y94);
    }

    public static void injectSubComponentBuilderProvider(PaymentSheetViewModel.Factory factory, Y94<PaymentSheetViewModelSubcomponent.Builder> y94) {
        factory.subComponentBuilderProvider = y94;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(PaymentSheetViewModel.Factory factory) {
        injectSubComponentBuilderProvider(factory, this.subComponentBuilderProvider);
    }
}
