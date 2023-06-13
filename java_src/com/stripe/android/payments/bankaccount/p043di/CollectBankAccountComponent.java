package com.stripe.android.payments.bankaccount.p043di;

import android.app.Application;
import androidx.lifecycle.C11747p;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.p044ui.CollectBankAccountViewEffect;
import com.stripe.android.payments.bankaccount.p044ui.CollectBankAccountViewModel;
import com.stripe.android.payments.core.injection.StripeRepositoryModule;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
@Component(modules = {CoroutineContextModule.class, CollectBankAccountModule.class, StripeRepositoryModule.class, CoreCommonModule.class})
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent;", "", "viewModel", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;", "getViewModel", "()Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel;", "inject", "", "factory", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewModel$Factory;", "Builder", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent */
/* loaded from: classes7.dex */
public interface CollectBankAccountComponent {

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0006\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H'J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH'J\b\u0010\f\u001a\u00020\u000bH&¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent$Builder;", "", "Landroid/app/Application;", "application", "LBX2;", "Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountViewEffect;", "viewEffect", "Landroidx/lifecycle/p;", "savedStateHandle", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$Args;", "configuration", "Lcom/stripe/android/payments/bankaccount/di/CollectBankAccountComponent;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component.Builder
    /* renamed from: com.stripe.android.payments.bankaccount.di.CollectBankAccountComponent$Builder */
    /* loaded from: classes7.dex */
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        CollectBankAccountComponent build();

        @BindsInstance
        Builder configuration(CollectBankAccountContract.Args args);

        @BindsInstance
        Builder savedStateHandle(C11747p c11747p);

        @BindsInstance
        Builder viewEffect(BX2<CollectBankAccountViewEffect> bx2);
    }

    CollectBankAccountViewModel getViewModel();

    void inject(CollectBankAccountViewModel.Factory factory);
}
