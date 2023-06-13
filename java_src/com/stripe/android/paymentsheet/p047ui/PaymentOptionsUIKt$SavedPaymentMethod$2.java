package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.PaymentOptionsStateFactoryKt;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsUIKt$SavedPaymentMethod$2 */
/* loaded from: classes7.dex */
public final class PaymentOptionsUIKt$SavedPaymentMethod$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1<PaymentSelection, Unit> $onItemSelected;
    final /* synthetic */ PaymentOptionsItem.SavedPaymentMethod $paymentMethod;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOptionsUIKt$SavedPaymentMethod$2(Function1<? super PaymentSelection, Unit> function1, PaymentOptionsItem.SavedPaymentMethod savedPaymentMethod) {
        super(0);
        this.$onItemSelected = function1;
        this.$paymentMethod = savedPaymentMethod;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onItemSelected.invoke(PaymentOptionsStateFactoryKt.toPaymentSelection(this.$paymentMethod));
    }
}
