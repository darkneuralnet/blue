package com.stripe.android.payments.paymentlauncher;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.injection.WeakMapInjectorRegistry;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.injection.DaggerPaymentLauncherComponent;
import com.stripe.android.payments.core.injection.PaymentLauncherComponent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\b\u0001\u0012\u000e\b\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f\u0012\u000e\b\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010+\u001a\u00020*\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0001\u0010-\u001a\u00020,\u0012\b\b\u0001\u0010.\u001a\u00020,\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00102\u001a\u000201\u0012\u000e\b\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a¢\u0006\u0004\b3\u00104J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020 8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b&\u0010'\u0012\u0004\b(\u0010)¨\u00065"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "Lcom/stripe/android/core/injection/Injector;", "Lcom/stripe/android/core/injection/Injectable;", "injectable", "", "inject", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "params", "confirm", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "", "clientSecret", "handleNextActionForPaymentIntent", "handleNextActionForSetupIntent", "Lkotlin/Function0;", "publishableKeyProvider", "Lkotlin/jvm/functions/Function0;", "stripeAccountIdProvider", "LB5;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "hostActivityLauncher", "LB5;", "", NamedConstantsKt.ENABLE_LOGGING, "Z", "", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "Ljava/util/Set;", "Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;", "paymentLauncherComponent", "Lcom/stripe/android/payments/core/injection/PaymentLauncherComponent;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "authenticatorRegistry$delegate", "Lkotlin/Lazy;", "getAuthenticatorRegistry", "()Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "authenticatorRegistry", "injectorKey", "Ljava/lang/String;", "getInjectorKey$annotations", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/coroutines/CoroutineContext;", "ioContext", "uiContext", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LB5;Landroid/content/Context;ZLkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Ljava/util/Set;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class StripePaymentLauncher implements PaymentLauncher, Injector {
    public static final int $stable = 8;
    private final Lazy authenticatorRegistry$delegate;
    private final boolean enableLogging;
    private final AbstractC0407B5<PaymentLauncherContract.Args> hostActivityLauncher;
    private final String injectorKey;
    private final PaymentLauncherComponent paymentLauncherComponent;
    private final Set<String> productUsage;
    private final Function0<String> publishableKeyProvider;
    private final Function0<String> stripeAccountIdProvider;

    public StripePaymentLauncher(Function0<String> publishableKeyProvider, Function0<String> stripeAccountIdProvider, AbstractC0407B5<PaymentLauncherContract.Args> hostActivityLauncher, Context context, boolean z, @IOContext CoroutineContext ioContext, @UIContext CoroutineContext uiContext, StripeRepository stripeRepository, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, Set<String> productUsage) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeAccountIdProvider, "stripeAccountIdProvider");
        Intrinsics.checkNotNullParameter(hostActivityLauncher, "hostActivityLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ioContext, "ioContext");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeAccountIdProvider = stripeAccountIdProvider;
        this.hostActivityLauncher = hostActivityLauncher;
        this.enableLogging = z;
        this.productUsage = productUsage;
        this.paymentLauncherComponent = DaggerPaymentLauncherComponent.builder().context(context).enableLogging(z).ioContext(ioContext).uiContext(uiContext).stripeRepository(stripeRepository).analyticsRequestFactory(paymentAnalyticsRequestFactory).publishableKeyProvider(publishableKeyProvider).stripeAccountIdProvider(stripeAccountIdProvider).productUsage(productUsage).build();
        lazy = LazyKt__LazyJVMKt.lazy(new StripePaymentLauncher$authenticatorRegistry$2(this));
        this.authenticatorRegistry$delegate = lazy;
        WeakMapInjectorRegistry weakMapInjectorRegistry = WeakMapInjectorRegistry.INSTANCE;
        String simpleName = Reflection.getOrCreateKotlinClass(PaymentLauncher.class).getSimpleName();
        if (simpleName != null) {
            String nextKey = weakMapInjectorRegistry.nextKey(simpleName);
            this.injectorKey = nextKey;
            weakMapInjectorRegistry.register(this, nextKey);
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @InjectorKey
    private static /* synthetic */ void getInjectorKey$annotations() {
    }

    @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncher
    public void confirm(ConfirmPaymentIntentParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.hostActivityLauncher.m114705a(new PaymentLauncherContract.Args.IntentConfirmationArgs(this.injectorKey, this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), this.enableLogging, this.productUsage, params, null, 64, null));
    }

    public final PaymentAuthenticatorRegistry getAuthenticatorRegistry() {
        return (PaymentAuthenticatorRegistry) this.authenticatorRegistry$delegate.getValue();
    }

    @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncher
    public void handleNextActionForPaymentIntent(String clientSecret) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        this.hostActivityLauncher.m114705a(new PaymentLauncherContract.Args.PaymentIntentNextActionArgs(this.injectorKey, this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), this.enableLogging, this.productUsage, clientSecret, null, 64, null));
    }

    @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncher
    public void handleNextActionForSetupIntent(String clientSecret) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        this.hostActivityLauncher.m114705a(new PaymentLauncherContract.Args.SetupIntentNextActionArgs(this.injectorKey, this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), this.enableLogging, this.productUsage, clientSecret, null, 64, null));
    }

    @Override // com.stripe.android.core.injection.Injector
    public void inject(Injectable<?> injectable) {
        Intrinsics.checkNotNullParameter(injectable, "injectable");
        if (injectable instanceof PaymentLauncherViewModel.Factory) {
            this.paymentLauncherComponent.inject((PaymentLauncherViewModel.Factory) injectable);
            return;
        }
        throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
    }

    @Override // com.stripe.android.payments.paymentlauncher.PaymentLauncher
    public void confirm(ConfirmSetupIntentParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.hostActivityLauncher.m114705a(new PaymentLauncherContract.Args.IntentConfirmationArgs(this.injectorKey, this.publishableKeyProvider.invoke(), this.stripeAccountIdProvider.invoke(), this.enableLogging, this.productUsage, params, null, 64, null));
    }
}
