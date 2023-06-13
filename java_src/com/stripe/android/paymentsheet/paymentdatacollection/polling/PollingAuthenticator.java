package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.authentication.PaymentAuthenticator;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingContract;
import com.stripe.android.view.AuthActivityStarterHost;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0094@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingAuthenticator;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "host", "authenticatable", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "", "performAuthentication", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lu5;", "activityResultCaller", "Lt5;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "activityResultCallback", "onNewActivityResultCaller", "onLauncherInvalidated", "LB5;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/PollingContract$Args;", "pollingLauncher", "LB5;", "<init>", "()V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PollingAuthenticator extends PaymentAuthenticator<StripeIntent> {
    private AbstractC0407B5<PollingContract.Args> pollingLauncher;

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator, com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onLauncherInvalidated() {
        AbstractC0407B5<PollingContract.Args> abstractC0407B5 = this.pollingLauncher;
        if (abstractC0407B5 != null) {
            abstractC0407B5.mo67435c();
        }
        this.pollingLauncher = null;
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator, com.stripe.android.payments.core.ActivityResultLauncherHost
    public void onNewActivityResultCaller(InterfaceC29050u5 activityResultCaller, InterfaceC28515t5<PaymentFlowResult.Unvalidated> activityResultCallback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(activityResultCallback, "activityResultCallback");
        this.pollingLauncher = activityResultCaller.registerForActivityResult(new PollingContract(), activityResultCallback);
    }

    @Override // com.stripe.android.payments.core.authentication.PaymentAuthenticator
    public /* bridge */ /* synthetic */ Object performAuthentication(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation continuation) {
        return performAuthentication2(authActivityStarterHost, stripeIntent, options, (Continuation<? super Unit>) continuation);
    }

    /* renamed from: performAuthentication  reason: avoid collision after fix types in other method */
    public Object performAuthentication2(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        String clientSecret = stripeIntent.getClientSecret();
        if (clientSecret != null) {
            PollingContract.Args args = new PollingContract.Args(clientSecret, authActivityStarterHost.getStatusBarColor(), 300, 5, 12);
            AbstractC0407B5<PollingContract.Args> abstractC0407B5 = this.pollingLauncher;
            if (abstractC0407B5 != null) {
                abstractC0407B5.m114705a(args);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
