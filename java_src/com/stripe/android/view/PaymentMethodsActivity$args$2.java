package com.stripe.android.view;

import android.content.Intent;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethodsActivity$args$2 extends Lambda implements Function0<PaymentMethodsActivityStarter.Args> {
    final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$args$2(PaymentMethodsActivity paymentMethodsActivity) {
        super(0);
        this.this$0 = paymentMethodsActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PaymentMethodsActivityStarter.Args invoke() {
        PaymentMethodsActivityStarter.Args.Companion companion = PaymentMethodsActivityStarter.Args.Companion;
        Intent intent = this.this$0.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        return companion.create$payments_core_release(intent);
    }
}