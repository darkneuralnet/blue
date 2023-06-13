package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class OTPElementUIKt$OTPInputBox$5 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ OTPElementColors $colors;
    final /* synthetic */ OTPElement $element;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC32037Bv1 $focusManager;
    final /* synthetic */ int $index;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPElementUIKt$OTPInputBox$5(String str, boolean z, OTPElement oTPElement, int i, InterfaceC32037Bv1 interfaceC32037Bv1, InterfaceC41563gV2 interfaceC41563gV2, boolean z2, OTPElementColors oTPElementColors, int i2) {
        super(2);
        this.$value = str;
        this.$isSelected = z;
        this.$element = oTPElement;
        this.$index = i;
        this.$focusManager = interfaceC32037Bv1;
        this.$modifier = interfaceC41563gV2;
        this.$enabled = z2;
        this.$colors = oTPElementColors;
        this.$$changed = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        OTPElementUIKt.OTPInputBox(this.$value, this.$isSelected, this.$element, this.$index, this.$focusManager, this.$modifier, this.$enabled, this.$colors, interfaceC32720Et0, this.$$changed | 1);
    }
}
