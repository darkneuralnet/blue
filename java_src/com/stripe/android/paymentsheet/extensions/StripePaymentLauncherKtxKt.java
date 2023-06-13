package com.stripe.android.paymentsheet.extensions;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.paymentlauncher.StripePaymentLauncher;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingAuthenticator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0004"}, m28432d2 = {"registerPollingAuthenticator", "", "Lcom/stripe/android/payments/paymentlauncher/StripePaymentLauncher;", "unregisterPollingAuthenticator", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripePaymentLauncherKtxKt {
    public static final void registerPollingAuthenticator(StripePaymentLauncher stripePaymentLauncher) {
        Intrinsics.checkNotNullParameter(stripePaymentLauncher, "<this>");
        stripePaymentLauncher.getAuthenticatorRegistry().registerAuthenticator(StripeIntent.NextActionData.UpiAwaitNotification.class, new PollingAuthenticator());
    }

    public static final void unregisterPollingAuthenticator(StripePaymentLauncher stripePaymentLauncher) {
        Intrinsics.checkNotNullParameter(stripePaymentLauncher, "<this>");
        stripePaymentLauncher.getAuthenticatorRegistry().unregisterAuthenticator(StripeIntent.NextActionData.UpiAwaitNotification.class);
    }
}
