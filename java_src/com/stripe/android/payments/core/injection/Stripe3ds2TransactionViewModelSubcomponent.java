package com.stripe.android.payments.core.injection;

import android.app.Application;
import androidx.lifecycle.C11747p;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModel;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;
@Subcomponent(modules = {Stripe3dsTransactionViewModelModule.class})
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent;", "", "viewModel", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;", "getViewModel", "()Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionViewModel;", "Builder", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface Stripe3ds2TransactionViewModelSubcomponent {

    @Subcomponent.Builder
    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H'J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H'J\b\u0010\n\u001a\u00020\tH&¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent$Builder;", "", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "args", "Landroidx/lifecycle/p;", "handle", "savedStateHandle", "Landroid/app/Application;", "application", "Lcom/stripe/android/payments/core/injection/Stripe3ds2TransactionViewModelSubcomponent;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        @BindsInstance
        Builder args(Stripe3ds2TransactionContract.Args args);

        Stripe3ds2TransactionViewModelSubcomponent build();

        @BindsInstance
        Builder savedStateHandle(C11747p c11747p);
    }

    Stripe3ds2TransactionViewModel getViewModel();
}
