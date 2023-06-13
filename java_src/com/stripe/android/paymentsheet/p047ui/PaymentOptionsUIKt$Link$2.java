package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsUIKt$Link$2 */
/* loaded from: classes7.dex */
public final class PaymentOptionsUIKt$Link$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function1<PaymentSelection, Unit> $onItemSelected;
    final /* synthetic */ float $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOptionsUIKt$Link$2(float f, boolean z, boolean z2, Function1<? super PaymentSelection, Unit> function1, InterfaceC41563gV2 interfaceC41563gV2, int i, int i2) {
        super(2);
        this.$width = f;
        this.$isEnabled = z;
        this.$isSelected = z2;
        this.$onItemSelected = function1;
        this.$modifier = interfaceC41563gV2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PaymentOptionsUIKt.m116642LinkPBTpf3Q(this.$width, this.$isEnabled, this.$isSelected, this.$onItemSelected, this.$modifier, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
