package com.stripe.android.view;

import com.google.android.material.progressindicator.LinearProgressIndicator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsActivity.kt\ncom/stripe/android/view/PaymentMethodsActivity$onCreate$5\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,304:1\n262#2,2:305\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsActivity.kt\ncom/stripe/android/view/PaymentMethodsActivity$onCreate$5\n*L\n114#1:305,2\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentMethodsActivity$onCreate$5 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$onCreate$5(PaymentMethodsActivity paymentMethodsActivity) {
        super(1);
        this.this$0 = paymentMethodsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean it) {
        LinearProgressIndicator linearProgressIndicator = this.this$0.getViewBinding$payments_core_release().progressBar;
        Intrinsics.checkNotNullExpressionValue(linearProgressIndicator, "viewBinding.progressBar");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        linearProgressIndicator.setVisibility(it.booleanValue() ? 0 : 8);
    }
}
