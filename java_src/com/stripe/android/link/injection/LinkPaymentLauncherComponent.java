package com.stripe.android.link.injection;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.stripe.android.core.injection.CoreCommonModule;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.injection.LinkComponent;
import com.stripe.android.link.p042ui.inline.InlineSignupViewModel;
import com.stripe.android.link.p042ui.verification.VerificationViewModel;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.uicore.address.AddressRepository;
import dagger.BindsInstance;
import dagger.Component;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
@Component(modules = {LinkCommonModule.class, CoreCommonModule.class})
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH&J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001bH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;", "", "()V", "configuration", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "getConfiguration", "()Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", "injector", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "getInjector", "()Lcom/stripe/android/core/injection/NonFallbackInjector;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "getLinkAccountManager", "()Lcom/stripe/android/link/account/LinkAccountManager;", "linkComponentBuilder", "Lcom/stripe/android/link/injection/LinkComponent$Builder;", "getLinkComponentBuilder", "()Lcom/stripe/android/link/injection/LinkComponent$Builder;", "linkEventsReporter", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "getLinkEventsReporter", "()Lcom/stripe/android/link/analytics/LinkEventsReporter;", "inject", "", "factory", "Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;", "Lcom/stripe/android/link/ui/verification/VerificationViewModel$Factory;", "Builder", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class LinkPaymentLauncherComponent {
    private final NonFallbackInjector injector = new NonFallbackInjector() { // from class: com.stripe.android.link.injection.LinkPaymentLauncherComponent$injector$1
        @Override // com.stripe.android.core.injection.Injector
        public void inject(Injectable<?> injectable) {
            Intrinsics.checkNotNullParameter(injectable, "injectable");
            if (injectable instanceof VerificationViewModel.Factory) {
                LinkPaymentLauncherComponent.this.inject((VerificationViewModel.Factory) injectable);
            } else if (injectable instanceof InlineSignupViewModel.Factory) {
                LinkPaymentLauncherComponent.this.inject((InlineSignupViewModel.Factory) injectable);
            } else {
                throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
            }
        }
    };

    @Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH'J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH'J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH'J\u0012\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010\u000f\u001a\u00020\u0010H'J\u0012\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010\u0012\u001a\u00020\u0013H'J\u0018\u0010\u0014\u001a\u00020\u00002\u000e\b\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H'J\u0018\u0010\u0017\u001a\u00020\u00002\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H'J\u001a\u0010\u0019\u001a\u00020\u00002\u0010\b\u0001\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0018H'J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bH'J\u0012\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\u001c\u001a\u00020\u0013H'¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent$Builder;", "", "addressRepository", "Lcom/stripe/android/uicore/address/AddressRepository;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestFactory", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/stripe/android/link/injection/LinkPaymentLauncherComponent;", "configuration", "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING, "", "ioContext", "workContext", "Lkotlin/coroutines/CoroutineContext;", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", "", "publishableKeyProvider", "Lkotlin/Function0;", "stripeAccountIdProvider", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "uiContext", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @Component.Builder
    /* loaded from: classes7.dex */
    public interface Builder {
        @BindsInstance
        Builder addressRepository(AddressRepository addressRepository);

        @BindsInstance
        Builder analyticsRequestExecutor(AnalyticsRequestExecutor analyticsRequestExecutor);

        @BindsInstance
        Builder analyticsRequestFactory(PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory);

        LinkPaymentLauncherComponent build();

        @BindsInstance
        Builder configuration(LinkPaymentLauncher.Configuration configuration);

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

    public abstract LinkPaymentLauncher.Configuration getConfiguration();

    public final NonFallbackInjector getInjector() {
        return this.injector;
    }

    public abstract LinkAccountManager getLinkAccountManager();

    public abstract LinkComponent.Builder getLinkComponentBuilder();

    public abstract LinkEventsReporter getLinkEventsReporter();

    public abstract void inject(InlineSignupViewModel.Factory factory);

    public abstract void inject(VerificationViewModel.Factory factory);
}
