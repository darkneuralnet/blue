package com.stripe.android.payments.core.authentication;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.PaymentRelayContract;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.injection.WeakMapInjectorRegistry;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory;
import com.stripe.android.payments.core.injection.AuthenticationComponent;
import com.stripe.android.payments.core.injection.DaggerAuthenticationComponent;
import com.stripe.android.payments.core.injection.IntentAuthenticatorMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0001DBJ\b\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012/\b\u0001\u0010$\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0002\b\n0#¢\u0006\u0004\bB\u0010CJ3\u0010\r\u001a\u00020\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003j\u0002`\u00052\u0015\u0010\u000b\u001a\u0011\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0002\b\nH\u0016J\u001c\u0010\u000e\u001a\u00020\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0016J#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\b\u0010\u0019\u001a\u00020\fH\u0016J\u0014\u0010\u001c\u001a\u00020\f2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001aH\u0016R\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R;\u0010$\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0002\b\n0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R;\u0010'\u001a)\u0012\u0010\u0012\u000e\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003j\u0002`\u0005\u0012\u0013\u0012\u0011\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t¢\u0006\u0002\b\n0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u00108\u001a\n\u0012\u0004\u0012\u000207\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R(\u0010A\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020<0\u00070;8@X\u0081\u0004¢\u0006\f\u0012\u0004\b?\u0010@\u001a\u0004\b=\u0010>¨\u0006E"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "Lcom/stripe/android/core/injection/Injector;", "Ljava/lang/Class;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "Lcom/stripe/android/payments/core/authentication/AuthenticatorKey;", "key", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/payments/core/authentication/Authenticator;", "Lkotlin/jvm/JvmSuppressWildcards;", "authenticator", "", "registerAuthenticator", "unregisterAuthenticator", "Authenticatable", "authenticatable", "getAuthenticator", "(Ljava/lang/Object;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lu5;", "activityResultCaller", "Lt5;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "activityResultCallback", "onNewActivityResultCaller", "onLauncherInvalidated", "Lcom/stripe/android/core/injection/Injectable;", "injectable", "inject", "Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;", "noOpIntentAuthenticator", "Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;", "Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;", "sourceAuthenticator", "Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;", "", "paymentAuthenticators", "Ljava/util/Map;", "", "additionalAuthenticators", "Lcom/stripe/android/payments/core/injection/AuthenticationComponent;", "authenticationComponent", "Lcom/stripe/android/payments/core/injection/AuthenticationComponent;", "getAuthenticationComponent", "()Lcom/stripe/android/payments/core/injection/AuthenticationComponent;", "setAuthenticationComponent", "(Lcom/stripe/android/payments/core/injection/AuthenticationComponent;)V", "LB5;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "paymentRelayLauncher", "LB5;", "getPaymentRelayLauncher$payments_core_release", "()LB5;", "setPaymentRelayLauncher$payments_core_release", "(LB5;)V", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "paymentBrowserAuthLauncher", "getPaymentBrowserAuthLauncher$payments_core_release", "setPaymentBrowserAuthLauncher$payments_core_release", "", "Lcom/stripe/android/core/model/StripeModel;", "getAllAuthenticators$payments_core_release", "()Ljava/util/Set;", "getAllAuthenticators$payments_core_release$annotations", "()V", "allAuthenticators", "<init>", "(Lcom/stripe/android/payments/core/authentication/NoOpIntentAuthenticator;Lcom/stripe/android/payments/core/authentication/SourceAuthenticator;Ljava/util/Map;)V", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDefaultPaymentAuthenticatorRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultPaymentAuthenticatorRegistry.kt\ncom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n1855#2,2:182\n1855#2,2:184\n*S KotlinDebug\n*F\n+ 1 DefaultPaymentAuthenticatorRegistry.kt\ncom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry\n*L\n112#1:182,2\n126#1:184,2\n*E\n"})
/* loaded from: classes7.dex */
public final class DefaultPaymentAuthenticatorRegistry implements PaymentAuthenticatorRegistry, Injector {
    public static final Companion Companion = new Companion(null);
    private final Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>> additionalAuthenticators;
    public AuthenticationComponent authenticationComponent;
    private final NoOpIntentAuthenticator noOpIntentAuthenticator;
    private final Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>> paymentAuthenticators;
    private AbstractC0407B5<PaymentBrowserAuthContract.Args> paymentBrowserAuthLauncher;
    private AbstractC0407B5<PaymentRelayStarter.Args> paymentRelayLauncher;
    private final SourceAuthenticator sourceAuthenticator;

    @Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jv\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u000e¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/DefaultPaymentAuthenticatorRegistry$Companion;", "", "()V", "createInstance", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", NamedConstantsKt.ENABLE_LOGGING, "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "threeDs1IntentReturnUrlMap", "", "", "publishableKeyProvider", "Lkotlin/Function0;", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "", com.stripe.android.payments.core.injection.NamedConstantsKt.IS_INSTANT_APP, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentAuthenticatorRegistry createInstance(Context context, StripeRepository stripeRepository, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, boolean z, CoroutineContext workContext, CoroutineContext uiContext, Map<String, String> threeDs1IntentReturnUrlMap, Function0<String> publishableKeyProvider, Set<String> productUsage, boolean z2) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
            Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
            Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            Intrinsics.checkNotNullParameter(uiContext, "uiContext");
            Intrinsics.checkNotNullParameter(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
            Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
            Intrinsics.checkNotNullParameter(productUsage, "productUsage");
            WeakMapInjectorRegistry weakMapInjectorRegistry = WeakMapInjectorRegistry.INSTANCE;
            String simpleName = Reflection.getOrCreateKotlinClass(PaymentAuthenticatorRegistry.class).getSimpleName();
            if (simpleName != null) {
                String nextKey = weakMapInjectorRegistry.nextKey(simpleName);
                AuthenticationComponent build = DaggerAuthenticationComponent.builder().context(context).stripeRepository(stripeRepository).analyticsRequestExecutor(analyticsRequestExecutor).analyticsRequestFactory(paymentAnalyticsRequestFactory).enableLogging(z).workContext(workContext).uiContext(uiContext).threeDs1IntentReturnUrlMap(threeDs1IntentReturnUrlMap).injectorKey(nextKey).publishableKeyProvider(publishableKeyProvider).productUsage(productUsage).isInstantApp(z2).build();
                DefaultPaymentAuthenticatorRegistry registry = build.getRegistry();
                registry.setAuthenticationComponent(build);
                weakMapInjectorRegistry.register(registry, nextKey);
                return registry;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        private Companion() {
        }
    }

    public DefaultPaymentAuthenticatorRegistry(NoOpIntentAuthenticator noOpIntentAuthenticator, SourceAuthenticator sourceAuthenticator, @IntentAuthenticatorMap Map<Class<? extends StripeIntent.NextActionData>, PaymentAuthenticator<StripeIntent>> paymentAuthenticators) {
        Intrinsics.checkNotNullParameter(noOpIntentAuthenticator, "noOpIntentAuthenticator");
        Intrinsics.checkNotNullParameter(sourceAuthenticator, "sourceAuthenticator");
        Intrinsics.checkNotNullParameter(paymentAuthenticators, "paymentAuthenticators");
        this.noOpIntentAuthenticator = noOpIntentAuthenticator;
        this.sourceAuthenticator = sourceAuthenticator;
        this.paymentAuthenticators = paymentAuthenticators;
        this.additionalAuthenticators = new LinkedHashMap();
    }

    public static /* synthetic */ void getAllAuthenticators$payments_core_release$annotations() {
    }

    public final Set<PaymentAuthenticator<? extends StripeModel>> getAllAuthenticators$payments_core_release() {
        Set createSetBuilder;
        Set<PaymentAuthenticator<? extends StripeModel>> build;
        createSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
        createSetBuilder.add(this.noOpIntentAuthenticator);
        createSetBuilder.add(this.sourceAuthenticator);
        createSetBuilder.addAll(this.paymentAuthenticators.values());
        createSetBuilder.addAll(this.additionalAuthenticators.values());
        build = SetsKt__SetsJVMKt.build(createSetBuilder);
        return build;
    }

    public final AuthenticationComponent getAuthenticationComponent() {
        AuthenticationComponent authenticationComponent = this.authenticationComponent;
        if (authenticationComponent != null) {
            return authenticationComponent;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authenticationComponent");
        return null;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry
    public <Authenticatable> PaymentAuthenticator<Authenticatable> getAuthenticator(Authenticatable authenticatable) {
        Map plus;
        PaymentAuthenticator<Authenticatable> paymentAuthenticator;
        if (authenticatable instanceof StripeIntent) {
            StripeIntent stripeIntent = (StripeIntent) authenticatable;
            if (stripeIntent.requiresAction()) {
                plus = MapsKt__MapsKt.plus(this.paymentAuthenticators, this.additionalAuthenticators);
                StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
                if (nextActionData == null || (paymentAuthenticator = (PaymentAuthenticator) plus.get(nextActionData.getClass())) == null) {
                    paymentAuthenticator = this.noOpIntentAuthenticator;
                }
                Intrinsics.checkNotNull(paymentAuthenticator, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentAuthenticator<Authenticatable of com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry.getAuthenticator>");
                return paymentAuthenticator;
            }
            NoOpIntentAuthenticator noOpIntentAuthenticator = this.noOpIntentAuthenticator;
            Intrinsics.checkNotNull(noOpIntentAuthenticator, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentAuthenticator<Authenticatable of com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry.getAuthenticator>");
            return noOpIntentAuthenticator;
        } else if (authenticatable instanceof Source) {
            SourceAuthenticator sourceAuthenticator = this.sourceAuthenticator;
            Intrinsics.checkNotNull(sourceAuthenticator, "null cannot be cast to non-null type com.stripe.android.payments.core.authentication.PaymentAuthenticator<Authenticatable of com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry.getAuthenticator>");
            return sourceAuthenticator;
        } else {
            throw new IllegalStateException(("No suitable PaymentAuthenticator for " + authenticatable).toString());
        }
    }

    public final AbstractC0407B5<PaymentBrowserAuthContract.Args> getPaymentBrowserAuthLauncher$payments_core_release() {
        return this.paymentBrowserAuthLauncher;
    }

    public final AbstractC0407B5<PaymentRelayStarter.Args> getPaymentRelayLauncher$payments_core_release() {
        return this.paymentRelayLauncher;
    }

    @Override // com.stripe.android.core.injection.Injector
    public void inject(Injectable<?> injectable) {
        Intrinsics.checkNotNullParameter(injectable, "injectable");
        if (injectable instanceof Stripe3ds2TransactionViewModelFactory) {
            getAuthenticationComponent().inject((Stripe3ds2TransactionViewModelFactory) injectable);
            return;
        }
        throw new IllegalArgumentException("invalid Injectable " + injectable + " requested in " + this);
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        Iterator<T> it = getAllAuthenticators$payments_core_release().iterator();
        while (it.hasNext()) {
            ((PaymentAuthenticator) it.next()).onLauncherInvalidated();
        }
        AbstractC0407B5<PaymentRelayStarter.Args> abstractC0407B5 = this.paymentRelayLauncher;
        if (abstractC0407B5 != null) {
            abstractC0407B5.mo67435c();
        }
        AbstractC0407B5<PaymentBrowserAuthContract.Args> abstractC0407B52 = this.paymentBrowserAuthLauncher;
        if (abstractC0407B52 != null) {
            abstractC0407B52.mo67435c();
        }
        this.paymentRelayLauncher = null;
        this.paymentBrowserAuthLauncher = null;
    }

    @Override // com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(InterfaceC29050u5 activityResultCaller, InterfaceC28515t5<PaymentFlowResult.Unvalidated> activityResultCallback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(activityResultCallback, "activityResultCallback");
        Iterator<T> it = getAllAuthenticators$payments_core_release().iterator();
        while (it.hasNext()) {
            ((PaymentAuthenticator) it.next()).onNewActivityResultCaller(activityResultCaller, activityResultCallback);
        }
        this.paymentRelayLauncher = activityResultCaller.registerForActivityResult(new PaymentRelayContract(), activityResultCallback);
        this.paymentBrowserAuthLauncher = activityResultCaller.registerForActivityResult(new PaymentBrowserAuthContract(), activityResultCallback);
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry
    public void registerAuthenticator(Class<? extends StripeIntent.NextActionData> key, PaymentAuthenticator<StripeIntent> authenticator) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(authenticator, "authenticator");
        this.additionalAuthenticators.put(key, authenticator);
    }

    public final void setAuthenticationComponent(AuthenticationComponent authenticationComponent) {
        Intrinsics.checkNotNullParameter(authenticationComponent, "<set-?>");
        this.authenticationComponent = authenticationComponent;
    }

    public final void setPaymentBrowserAuthLauncher$payments_core_release(AbstractC0407B5<PaymentBrowserAuthContract.Args> abstractC0407B5) {
        this.paymentBrowserAuthLauncher = abstractC0407B5;
    }

    public final void setPaymentRelayLauncher$payments_core_release(AbstractC0407B5<PaymentRelayStarter.Args> abstractC0407B5) {
        this.paymentRelayLauncher = abstractC0407B5;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry
    public void unregisterAuthenticator(Class<? extends StripeIntent.NextActionData> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.additionalAuthenticators.remove(key);
    }
}
