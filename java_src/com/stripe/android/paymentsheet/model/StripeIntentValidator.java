package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/StripeIntentValidator;", "", "()V", "requireValid", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeIntentValidator {
    public final /* synthetic */ StripeIntent requireValid(StripeIntent stripeIntent) {
        String trimIndent;
        String trimIndent2;
        String trimIndent3;
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        boolean z = stripeIntent instanceof PaymentIntent;
        if (z) {
            PaymentIntent paymentIntent = (PaymentIntent) stripeIntent;
            if (paymentIntent.getConfirmationMethod() != PaymentIntent.ConfirmationMethod.Automatic) {
                PaymentIntent.ConfirmationMethod confirmationMethod = paymentIntent.getConfirmationMethod();
                trimIndent3 = StringsKt__IndentKt.trimIndent("\n                        PaymentIntent with confirmation_method='automatic' is required.\n                        The current PaymentIntent has confirmation_method '" + confirmationMethod + "'.\n                        See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-confirmation_method.\n                    ");
                throw new IllegalStateException(trimIndent3.toString());
            }
        }
        if (z && (stripeIntent.getStatus() == StripeIntent.Status.Canceled || stripeIntent.getStatus() == StripeIntent.Status.Succeeded || stripeIntent.getStatus() == StripeIntent.Status.RequiresCapture)) {
            StripeIntent.Status status = stripeIntent.getStatus();
            trimIndent2 = StringsKt__IndentKt.trimIndent("\n                        PaymentSheet cannot set up a PaymentIntent in status '" + status + "'.\n                        See https://stripe.com/docs/api/payment_intents/object#payment_intent_object-status.\n                    ");
            throw new IllegalStateException(trimIndent2.toString());
        } else if ((stripeIntent instanceof SetupIntent) && (stripeIntent.getStatus() == StripeIntent.Status.Canceled || stripeIntent.getStatus() == StripeIntent.Status.Succeeded)) {
            StripeIntent.Status status2 = stripeIntent.getStatus();
            trimIndent = StringsKt__IndentKt.trimIndent("\n                        PaymentSheet cannot set up a SetupIntent in status '" + status2 + "'.\n                        See https://stripe.com/docs/api/setup_intents/object#setup_intent_object-status\n                    ");
            throw new IllegalStateException(trimIndent.toString());
        } else {
            return stripeIntent;
        }
    }
}
