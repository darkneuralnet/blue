package com.stripe.android.link.p042ui.paymentmethod;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt$PaymentMethodBody$5$1$1$1$1 */
/* loaded from: classes7.dex */
public final class PaymentMethodBodyKt$PaymentMethodBody$5$1$1$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<SupportedPaymentMethod, Unit> $onPaymentMethodSelected;
    final /* synthetic */ SupportedPaymentMethod $paymentMethod;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodBodyKt$PaymentMethodBody$5$1$1$1$1(Function1<? super SupportedPaymentMethod, Unit> function1, SupportedPaymentMethod supportedPaymentMethod) {
        super(0);
        this.$onPaymentMethodSelected = function1;
        this.$paymentMethod = supportedPaymentMethod;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onPaymentMethodSelected.invoke(this.$paymentMethod);
    }
}
