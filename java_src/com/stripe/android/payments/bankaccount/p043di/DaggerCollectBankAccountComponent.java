package com.stripe.android.payments.bankaccount.p043di;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.C11747p;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.CoreCommonModule_ProvideLoggerFactory;
import com.stripe.android.core.injection.CoroutineContextModule;
import com.stripe.android.core.injection.CoroutineContextModule_ProvideWorkContextFactory;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.bankaccount.domain.AttachFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.CreateFinancialConnectionsSession;
import com.stripe.android.payments.bankaccount.domain.RetrieveStripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.p043di.CollectBankAccountComponent;
import com.stripe.android.payments.bankaccount.p044ui.CollectBankAccountViewEffect;
import com.stripe.android.payments.bankaccount.p044ui.CollectBankAccountViewModel;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
/* renamed from: com.stripe.android.payments.bankaccount.di.DaggerCollectBankAccountComponent */
/* loaded from: classes7.dex */
public final class DaggerCollectBankAccountComponent {

    /* renamed from: com.stripe.android.payments.bankaccount.di.DaggerCollectBankAccountComponent$Builder */
    /* loaded from: classes7.dex */
    public static final class Builder implements CollectBankAccountComponent.Builder {
        private Application application;
        private CollectBankAccountContract.Args configuration;
        private C11747p savedStateHandle;
        private BX2<CollectBankAccountViewEffect> viewEffect;

        @Override // com.stripe.android.payments.bankaccount.p043di.CollectBankAccountComponent.Builder
        public CollectBankAccountComponent build() {
            C51679xZ3.m5006a(this.application, Application.class);
            C51679xZ3.m5006a(this.viewEffect, BX2.class);
            C51679xZ3.m5006a(this.savedStateHandle, C11747p.class);
            C51679xZ3.m5006a(this.configuration, CollectBankAccountContract.Args.class);
            return new CollectBankAccountComponentImpl(new CoroutineContextModule(), new CoreCommonModule(), this.application, this.viewEffect, this.savedStateHandle, this.configuration);
        }

        @Override // com.stripe.android.payments.bankaccount.p043di.CollectBankAccountComponent.Builder
        public /* bridge */ /* synthetic */ CollectBankAccountComponent.Builder viewEffect(BX2 bx2) {
            return viewEffect((BX2<CollectBankAccountViewEffect>) bx2);
        }

        private Builder() {
        }

        @Override // com.stripe.android.payments.bankaccount.p043di.CollectBankAccountComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) C51679xZ3.m5005b(application);
            return this;
        }

        @Override // com.stripe.android.payments.bankaccount.p043di.CollectBankAccountComponent.Builder
        public Builder configuration(CollectBankAccountContract.Args args) {
            this.configuration = (CollectBankAccountContract.Args) C51679xZ3.m5005b(args);
            return this;
        }

        @Override // com.stripe.android.payments.bankaccount.p043di.CollectBankAccountComponent.Builder
        public Builder savedStateHandle(C11747p c11747p) {
            this.savedStateHandle = (C11747p) C51679xZ3.m5005b(c11747p);
            return this;
        }

        @Override // com.stripe.android.payments.bankaccount.p043di.CollectBankAccountComponent.Builder
        public Builder viewEffect(BX2<CollectBankAccountViewEffect> bx2) {
            this.viewEffect = (BX2) C51679xZ3.m5005b(bx2);
            return this;
        }
    }

    /* renamed from: com.stripe.android.payments.bankaccount.di.DaggerCollectBankAccountComponent$CollectBankAccountComponentImpl */
    /* loaded from: classes7.dex */
    public static final class CollectBankAccountComponentImpl implements CollectBankAccountComponent {
        private final Application application;
        private final CollectBankAccountComponentImpl collectBankAccountComponentImpl;
        private final CollectBankAccountContract.Args configuration;
        private Y94<Logger> provideLoggerProvider;
        private Y94<CoroutineContext> provideWorkContextProvider;
        private final C11747p savedStateHandle;
        private final BX2<CollectBankAccountViewEffect> viewEffect;

        private AttachFinancialConnectionsSession attachFinancialConnectionsSession() {
            return new AttachFinancialConnectionsSession(stripeApiRepository());
        }

        private Context context() {
            return CollectBankAccountModule_ProvidesAppContextFactory.providesAppContext(this.application);
        }

        private CreateFinancialConnectionsSession createFinancialConnectionsSession() {
            return new CreateFinancialConnectionsSession(stripeApiRepository());
        }

        private DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor() {
            return new DefaultAnalyticsRequestExecutor(this.provideLoggerProvider.get(), this.provideWorkContextProvider.get());
        }

        private void initialize(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Application application, BX2<CollectBankAccountViewEffect> bx2, C11747p c11747p, CollectBankAccountContract.Args args) {
            this.provideWorkContextProvider = V51.m80429b(CoroutineContextModule_ProvideWorkContextFactory.create(coroutineContextModule));
            this.provideLoggerProvider = V51.m80429b(CoreCommonModule_ProvideLoggerFactory.create(coreCommonModule, CollectBankAccountModule_ProvidesEnableLoggingFactory.create()));
        }

        private Function0<String> namedFunction0OfString() {
            return CollectBankAccountModule_ProvidePublishableKeyFactory.providePublishableKey(this.configuration);
        }

        private PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory() {
            return new PaymentAnalyticsRequestFactory(context(), namedFunction0OfString(), CollectBankAccountModule_ProvidesProductUsageFactory.providesProductUsage());
        }

        private RetrieveStripeIntent retrieveStripeIntent() {
            return new RetrieveStripeIntent(stripeApiRepository());
        }

        private StripeApiRepository stripeApiRepository() {
            return new StripeApiRepository(context(), namedFunction0OfString(), this.provideWorkContextProvider.get(), CollectBankAccountModule_ProvidesProductUsageFactory.providesProductUsage(), paymentAnalyticsRequestFactory(), defaultAnalyticsRequestExecutor(), this.provideLoggerProvider.get());
        }

        @Override // com.stripe.android.payments.bankaccount.p043di.CollectBankAccountComponent
        public CollectBankAccountViewModel getViewModel() {
            return new CollectBankAccountViewModel(this.configuration, this.viewEffect, createFinancialConnectionsSession(), attachFinancialConnectionsSession(), retrieveStripeIntent(), this.savedStateHandle, this.provideLoggerProvider.get());
        }

        @Override // com.stripe.android.payments.bankaccount.p043di.CollectBankAccountComponent
        public void inject(CollectBankAccountViewModel.Factory factory) {
        }

        private CollectBankAccountComponentImpl(CoroutineContextModule coroutineContextModule, CoreCommonModule coreCommonModule, Application application, BX2<CollectBankAccountViewEffect> bx2, C11747p c11747p, CollectBankAccountContract.Args args) {
            this.collectBankAccountComponentImpl = this;
            this.configuration = args;
            this.viewEffect = bx2;
            this.application = application;
            this.savedStateHandle = c11747p;
            initialize(coroutineContextModule, coreCommonModule, application, bx2, c11747p, args);
        }
    }

    private DaggerCollectBankAccountComponent() {
    }

    public static CollectBankAccountComponent.Builder builder() {
        return new Builder();
    }
}
