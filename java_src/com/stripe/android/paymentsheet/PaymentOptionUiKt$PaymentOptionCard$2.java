package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentOptionUiKt$PaymentOptionCard$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $iconRes;
    final /* synthetic */ C47063pm0 $iconTint;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ String $labelText;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function0<Unit> $onItemSelectedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionUiKt$PaymentOptionCard$2(boolean z, boolean z2, int i, C47063pm0 c47063pm0, String str, Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, int i2, int i3) {
        super(2);
        this.$isSelected = z;
        this.$isEnabled = z2;
        this.$iconRes = i;
        this.$iconTint = c47063pm0;
        this.$labelText = str;
        this.$onItemSelectedListener = function0;
        this.$modifier = interfaceC41563gV2;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PaymentOptionUiKt.m116598PaymentOptionCardflo8M7A(this.$isSelected, this.$isEnabled, this.$iconRes, this.$iconTint, this.$labelText, this.$onItemSelectedListener, this.$modifier, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
