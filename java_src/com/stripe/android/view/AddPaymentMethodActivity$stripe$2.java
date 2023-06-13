package com.stripe.android.view;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.Stripe;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/Stripe;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AddPaymentMethodActivity$stripe$2 extends Lambda implements Function0<Stripe> {
    final /* synthetic */ AddPaymentMethodActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivity$stripe$2(AddPaymentMethodActivity addPaymentMethodActivity) {
        super(0);
        this.this$0 = addPaymentMethodActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Stripe invoke() {
        AddPaymentMethodActivityStarter.Args args;
        args = this.this$0.getArgs();
        PaymentConfiguration paymentConfiguration$payments_core_release = args.getPaymentConfiguration$payments_core_release();
        if (paymentConfiguration$payments_core_release == null) {
            paymentConfiguration$payments_core_release = PaymentConfiguration.Companion.getInstance(this.this$0);
        }
        Context applicationContext = this.this$0.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        return new Stripe(applicationContext, paymentConfiguration$payments_core_release.getPublishableKey(), paymentConfiguration$payments_core_release.getStripeAccountId(), false, (Set) null, 24, (DefaultConstructorMarker) null);
    }
}
