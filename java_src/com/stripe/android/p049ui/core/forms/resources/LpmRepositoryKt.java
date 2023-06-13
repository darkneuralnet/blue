package com.stripe.android.p049ui.core.forms.resources;

import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m28432d2 = {"payPalRequiresMandate", "", "Lcom/stripe/android/model/StripeIntent;", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.forms.resources.LpmRepositoryKt */
/* loaded from: classes7.dex */
public final class LpmRepositoryKt {
    public static final /* synthetic */ boolean access$payPalRequiresMandate(StripeIntent stripeIntent) {
        return payPalRequiresMandate(stripeIntent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean payPalRequiresMandate(StripeIntent stripeIntent) {
        if (stripeIntent instanceof PaymentIntent) {
            if (((PaymentIntent) stripeIntent).getSetupFutureUsage() != null) {
                return true;
            }
            return false;
        } else if (stripeIntent instanceof SetupIntent) {
            return true;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
