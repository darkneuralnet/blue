package com.stripe.android.paymentsheet.model;

import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"currency", "", "Lcom/stripe/android/model/StripeIntent;", "getCurrency", "(Lcom/stripe/android/model/StripeIntent;)Ljava/lang/String;", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class IntentKt {
    public static final String getCurrency(StripeIntent stripeIntent) {
        Intrinsics.checkNotNullParameter(stripeIntent, "<this>");
        if (stripeIntent instanceof PaymentIntent) {
            return ((PaymentIntent) stripeIntent).getCurrency();
        }
        return null;
    }
}
