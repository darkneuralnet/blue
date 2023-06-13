package com.stripe.android.view;

import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.databinding.PaymentAuthWebViewActivityBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "shouldHide", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentAuthWebViewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentAuthWebViewActivity.kt\ncom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,189:1\n304#2,2:190\n*S KotlinDebug\n*F\n+ 1 PaymentAuthWebViewActivity.kt\ncom/stripe/android/view/PaymentAuthWebViewActivity$onCreate$2\n*L\n85#1:190,2\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentAuthWebViewActivity$onCreate$2 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ PaymentAuthWebViewActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebViewActivity$onCreate$2(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
        super(1);
        this.this$0 = paymentAuthWebViewActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean shouldHide) {
        PaymentAuthWebViewActivityBinding viewBinding;
        Intrinsics.checkNotNullExpressionValue(shouldHide, "shouldHide");
        if (shouldHide.booleanValue()) {
            viewBinding = this.this$0.getViewBinding();
            CircularProgressIndicator circularProgressIndicator = viewBinding.progressBar;
            Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "viewBinding.progressBar");
            circularProgressIndicator.setVisibility(8);
        }
    }
}
