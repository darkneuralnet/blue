package com.stripe.android.model;

import com.stripe.android.StripePaymentController;
import com.stripe.android.model.PaymentMethod;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\f\u0010\b\u001a\u00020\t*\u00020\u0007H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\n"}, m28432d2 = {"REFRESHABLE_PAYMENT_METHODS", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "getREFRESHABLE_PAYMENT_METHODS", "()Ljava/util/Set;", "getRequestCode", "", "Lcom/stripe/android/model/StripeIntent;", "shouldRefresh", "", "payments-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class StripeIntentKtxKt {
    private static final Set<PaymentMethod.Type> REFRESHABLE_PAYMENT_METHODS;

    static {
        Set<PaymentMethod.Type> of;
        of = SetsKt__SetsJVMKt.setOf(PaymentMethod.Type.WeChatPay);
        REFRESHABLE_PAYMENT_METHODS = of;
    }

    public static final Set<PaymentMethod.Type> getREFRESHABLE_PAYMENT_METHODS() {
        return REFRESHABLE_PAYMENT_METHODS;
    }

    public static final int getRequestCode(StripeIntent stripeIntent) {
        Intrinsics.checkNotNullParameter(stripeIntent, "<this>");
        return StripePaymentController.Companion.getRequestCode$payments_core_release(stripeIntent);
    }

    public static final boolean shouldRefresh(StripeIntent stripeIntent) {
        PaymentMethod.Type type;
        boolean contains;
        Intrinsics.checkNotNullParameter(stripeIntent, "<this>");
        if (stripeIntent instanceof PaymentIntent) {
            Set<PaymentMethod.Type> set = REFRESHABLE_PAYMENT_METHODS;
            PaymentMethod paymentMethod = stripeIntent.getPaymentMethod();
            if (paymentMethod != null) {
                type = paymentMethod.type;
            } else {
                type = null;
            }
            contains = CollectionsKt___CollectionsKt.contains(set, type);
            if (contains && stripeIntent.requiresAction()) {
                return true;
            }
        }
        return false;
    }
}
