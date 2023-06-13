package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.app.Application;
import androidx.lifecycle.C11747p;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39383USBankAccountFormViewModel_Factory implements InterfaceC48812sj1<USBankAccountFormViewModel> {
    private final Y94<Application> applicationProvider;
    private final Y94<USBankAccountFormViewModel.Args> argsProvider;
    private final Y94<PaymentConfiguration> lazyPaymentConfigProvider;
    private final Y94<C11747p> savedStateHandleProvider;
    private final Y94<StripeRepository> stripeRepositoryProvider;

    public C39383USBankAccountFormViewModel_Factory(Y94<USBankAccountFormViewModel.Args> y94, Y94<Application> y942, Y94<StripeRepository> y943, Y94<PaymentConfiguration> y944, Y94<C11747p> y945) {
        this.argsProvider = y94;
        this.applicationProvider = y942;
        this.stripeRepositoryProvider = y943;
        this.lazyPaymentConfigProvider = y944;
        this.savedStateHandleProvider = y945;
    }

    public static C39383USBankAccountFormViewModel_Factory create(Y94<USBankAccountFormViewModel.Args> y94, Y94<Application> y942, Y94<StripeRepository> y943, Y94<PaymentConfiguration> y944, Y94<C11747p> y945) {
        return new C39383USBankAccountFormViewModel_Factory(y94, y942, y943, y944, y945);
    }

    public static USBankAccountFormViewModel newInstance(USBankAccountFormViewModel.Args args, Application application, StripeRepository stripeRepository, Y94<PaymentConfiguration> y94, C11747p c11747p) {
        return new USBankAccountFormViewModel(args, application, stripeRepository, y94, c11747p);
    }

    @Override // p000.Y94
    public USBankAccountFormViewModel get() {
        return newInstance(this.argsProvider.get(), this.applicationProvider.get(), this.stripeRepositoryProvider.get(), this.lazyPaymentConfigProvider, this.savedStateHandleProvider.get());
    }
}
