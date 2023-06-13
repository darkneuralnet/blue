package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsUIKt$PaymentOption$1 */
/* loaded from: classes7.dex */
public final class PaymentOptionsUIKt$PaymentOption$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $isEditing;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ PaymentOptionsItem $item;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function0<Unit> $onAddCardPressed;
    final /* synthetic */ Function1<PaymentMethod, Unit> $onItemRemoved;
    final /* synthetic */ Function1<PaymentSelection, Unit> $onItemSelected;
    final /* synthetic */ float $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentOptionsUIKt$PaymentOption$1(PaymentOptionsItem paymentOptionsItem, float f, boolean z, boolean z2, boolean z3, Function0<Unit> function0, Function1<? super PaymentSelection, Unit> function1, Function1<? super PaymentMethod, Unit> function12, InterfaceC41563gV2 interfaceC41563gV2, int i, int i2) {
        super(2);
        this.$item = paymentOptionsItem;
        this.$width = f;
        this.$isEnabled = z;
        this.$isEditing = z2;
        this.$isSelected = z3;
        this.$onAddCardPressed = function0;
        this.$onItemSelected = function1;
        this.$onItemRemoved = function12;
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
        PaymentOptionsUIKt.m116643PaymentOptioniWtaglI(this.$item, this.$width, this.$isEnabled, this.$isEditing, this.$isSelected, this.$onAddCardPressed, this.$onItemSelected, this.$onItemRemoved, this.$modifier, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
