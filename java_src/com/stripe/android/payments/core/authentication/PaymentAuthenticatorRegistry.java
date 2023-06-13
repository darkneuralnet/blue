package com.stripe.android.payments.core.authentication;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.ActivityResultLauncherHost;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0004H&¢\u0006\u0002\u0010\u0006J&\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H&J\u0018\u0010\u000e\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\nH&¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "Lcom/stripe/android/payments/core/ActivityResultLauncherHost;", "getAuthenticator", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "Authenticatable", "authenticatable", "(Ljava/lang/Object;)Lcom/stripe/android/payments/core/authentication/PaymentAuthenticator;", "registerAuthenticator", "", "key", "Ljava/lang/Class;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "authenticator", "Lcom/stripe/android/model/StripeIntent;", "unregisterAuthenticator", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface PaymentAuthenticatorRegistry extends ActivityResultLauncherHost {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static void onLauncherInvalidated(PaymentAuthenticatorRegistry paymentAuthenticatorRegistry) {
            ActivityResultLauncherHost.DefaultImpls.onLauncherInvalidated(paymentAuthenticatorRegistry);
        }

        public static void onNewActivityResultCaller(PaymentAuthenticatorRegistry paymentAuthenticatorRegistry, InterfaceC29050u5 activityResultCaller, InterfaceC28515t5<PaymentFlowResult.Unvalidated> activityResultCallback) {
            Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
            Intrinsics.checkNotNullParameter(activityResultCallback, "activityResultCallback");
            ActivityResultLauncherHost.DefaultImpls.onNewActivityResultCaller(paymentAuthenticatorRegistry, activityResultCaller, activityResultCallback);
        }
    }

    <Authenticatable> PaymentAuthenticator<Authenticatable> getAuthenticator(Authenticatable authenticatable);

    void registerAuthenticator(Class<? extends StripeIntent.NextActionData> cls, PaymentAuthenticator<StripeIntent> paymentAuthenticator);

    void unregisterAuthenticator(Class<? extends StripeIntent.NextActionData> cls);
}
