package com.stripe.android.view;

import com.stripe.android.databinding.PaymentAuthWebViewActivityBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentAuthWebViewActivity$viewBinding$2 extends Lambda implements Function0<PaymentAuthWebViewActivityBinding> {
    final /* synthetic */ PaymentAuthWebViewActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebViewActivity$viewBinding$2(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
        super(0);
        this.this$0 = paymentAuthWebViewActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PaymentAuthWebViewActivityBinding invoke() {
        PaymentAuthWebViewActivityBinding inflate = PaymentAuthWebViewActivityBinding.inflate(this.this$0.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        return inflate;
    }
}