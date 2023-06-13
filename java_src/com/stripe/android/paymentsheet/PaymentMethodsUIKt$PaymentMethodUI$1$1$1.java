package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentMethodsUIKt$PaymentMethodUI$1$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ int $itemIndex;
    final /* synthetic */ Function1<Integer, Unit> $onItemSelectedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsUIKt$PaymentMethodUI$1$1$1(Function1<? super Integer, Unit> function1, int i) {
        super(0);
        this.$onItemSelectedListener = function1;
        this.$itemIndex = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onItemSelectedListener.invoke(Integer.valueOf(this.$itemIndex));
    }
}
