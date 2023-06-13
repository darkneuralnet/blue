package com.stripe.android.payments.core.injection;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import dagger.BindsInstance;
import dagger.Component;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
@Component(modules = {PaymentLauncherModule.class, CoreCommonModule.class})
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;", "", "authenticatorRegistry", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "getAuthenticatorRegistry", "()Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "inject", "", "factory", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory;", "Builder", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface PaymentLauncherComponent {

    @Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH'J\u0012\u0010\t\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\nH'J\u0012\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\rH'J\u0018\u0010\u000e\u001a\u00020\u00002\u000e\b\u0001\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH'J\u0018\u0010\u0011\u001a\u00020\u00002\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012H'J\u001a\u0010\u0013\u001a\u00020\u00002\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0012H'J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015H'J\u0012\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\u0016\u001a\u00020\rH'¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent$Builder;", "", "analyticsRequestFactory", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING, "", "ioContext", "workContext", "Lkotlin/coroutines/CoroutineContext;", NamedConstantsKt.PRODUCT_USAGE, "", "", "publishableKeyProvider", "Lkotlin/Function0;", "stripeAccountIdProvider", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "uiContext", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @Component.Builder
    /* loaded from: classes7.dex */
    public interface Builder {
        @BindsInstance
        Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

        PaymentLauncherComponent build();

        @BindsInstance
        Builder context(Context context);

        @BindsInstance
        Builder enableLogging(boolean z);

        @BindsInstance
        Builder ioContext(@IOContext CoroutineContext coroutineContext);

        @BindsInstance
        Builder productUsage(Set<String> set);

        @BindsInstance
        Builder publishableKeyProvider(Function0<String> function0);

        @BindsInstance
        Builder stripeAccountIdProvider(Function0<String> function0);

        @BindsInstance
        Builder stripeRepository(StripeRepository stripeRepository);

        @BindsInstance
        Builder uiContext(@UIContext CoroutineContext coroutineContext);
    }

    PaymentAuthenticatorRegistry getAuthenticatorRegistry();

    void inject(PaymentLauncherViewModel.Factory factory);
}
