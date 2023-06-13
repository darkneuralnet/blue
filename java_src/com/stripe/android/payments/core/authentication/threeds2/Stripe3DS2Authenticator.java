package com.stripe.android.payments.core.authentication.threeds2;

import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018\u0012\u000e\b\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b\u0012\u000e\b\u0001\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001e¢\u0006\u0004\b/\u00100J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J+\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010#\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b#\u0010$\u0012\u0004\b)\u0010*\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3DS2Authenticator;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "Lu5;", "activityResultCaller", "Lt5;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "activityResultCallback", "", "onNewActivityResultCaller", "onLauncherInvalidated", "Lcom/stripe/android/view/AuthActivityStarterHost;", "host", "authenticatable", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "performAuthentication", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/PaymentAuthConfig;", "config", "Lcom/stripe/android/PaymentAuthConfig;", "", NamedConstantsKt.ENABLE_LOGGING, "Z", "", "injectorKey", "Ljava/lang/String;", "Lkotlin/Function0;", "publishableKeyProvider", "Lkotlin/jvm/functions/Function0;", "", com.stripe.android.payments.core.injection.NamedConstantsKt.PRODUCT_USAGE, "Ljava/util/Set;", "LB5;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "stripe3ds2CompletionLauncher", "LB5;", "getStripe3ds2CompletionLauncher$payments_core_release", "()LB5;", "setStripe3ds2CompletionLauncher$payments_core_release", "(LB5;)V", "getStripe3ds2CompletionLauncher$payments_core_release$annotations", "()V", "Lkotlin/Function1;", "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionStarter;", "stripe3ds2CompletionStarterFactory", "Lkotlin/jvm/functions/Function1;", "<init>", "(Lcom/stripe/android/PaymentAuthConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/util/Set;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class Stripe3DS2Authenticator extends PaymentAuthenticator<StripeIntent> {
    private final PaymentAuthConfig config;
    private final boolean enableLogging;
    private final String injectorKey;
    private final Set<String> productUsage;
    private final Function0<String> publishableKeyProvider;
    private AbstractC0407B5<Stripe3ds2TransactionContract.Args> stripe3ds2CompletionLauncher;
    private final Function1<AuthActivityStarterHost, Stripe3ds2TransactionStarter> stripe3ds2CompletionStarterFactory;

    public Stripe3DS2Authenticator(PaymentAuthConfig config, boolean z, @InjectorKey String injectorKey, Function0<String> publishableKeyProvider, Set<String> productUsage) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(productUsage, "productUsage");
        this.config = config;
        this.enableLogging = z;
        this.injectorKey = injectorKey;
        this.publishableKeyProvider = publishableKeyProvider;
        this.productUsage = productUsage;
        this.stripe3ds2CompletionStarterFactory = new Stripe3DS2Authenticator$stripe3ds2CompletionStarterFactory$1(this);
    }

    /* renamed from: getStripe3ds2CompletionLauncher$payments_core_release$annotations */
    public static /* synthetic */ void m45453xe40a204() {
    }

    public final AbstractC0407B5<Stripe3ds2TransactionContract.Args> getStripe3ds2CompletionLauncher$payments_core_release() {
        return this.stripe3ds2CompletionLauncher;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator, com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        AbstractC0407B5<Stripe3ds2TransactionContract.Args> abstractC0407B5 = this.stripe3ds2CompletionLauncher;
        if (abstractC0407B5 != null) {
            abstractC0407B5.mo67435c();
        }
        this.stripe3ds2CompletionLauncher = null;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator, com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(InterfaceC29050u5 activityResultCaller, InterfaceC28515t5<PaymentFlowResult.Unvalidated> activityResultCallback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(activityResultCallback, "activityResultCallback");
        this.stripe3ds2CompletionLauncher = activityResultCaller.registerForActivityResult(new Stripe3ds2TransactionContract(), activityResultCallback);
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator
    public /* bridge */ /* synthetic */ Object performAuthentication(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation continuation) {
        return performAuthentication2(authActivityStarterHost, stripeIntent, options, (Continuation<? super Unit>) continuation);
    }

    public final void setStripe3ds2CompletionLauncher$payments_core_release(AbstractC0407B5<Stripe3ds2TransactionContract.Args> abstractC0407B5) {
        this.stripe3ds2CompletionLauncher = abstractC0407B5;
    }

    /* renamed from: performAuthentication  reason: avoid collision after fix types in other method */
    public Object performAuthentication2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        SdkTransactionId create = SdkTransactionId.Companion.create();
        PaymentAuthConfig.Stripe3ds2Config stripe3ds2Config$payments_core_release = this.config.getStripe3ds2Config$payments_core_release();
        StripeIntent.NextActionData nextActionData = stripeIntent.getNextActionData();
        Intrinsics.checkNotNull(nextActionData, "null cannot be cast to non-null type com.stripe.android.model.StripeIntent.NextActionData.SdkData.Use3DS2");
        this.stripe3ds2CompletionStarterFactory.invoke(authActivityStarterHost).start(new Stripe3ds2TransactionContract.Args(create, stripe3ds2Config$payments_core_release, stripeIntent, (StripeIntent.NextActionData.SdkData.Use3DS2) nextActionData, options, this.enableLogging, authActivityStarterHost.getStatusBarColor(), this.injectorKey, this.publishableKeyProvider.invoke(), this.productUsage));
        return Unit.INSTANCE;
    }
}
