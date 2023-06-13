package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentOptionUiKt$PaymentOptionUi$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $description;
    final /* synthetic */ int $iconRes;
    final /* synthetic */ C47063pm0 $iconTint;
    final /* synthetic */ boolean $isEditing;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ Integer $labelIcon;
    final /* synthetic */ String $labelText;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function0<Unit> $onItemSelectedListener;
    final /* synthetic */ String $onRemoveAccessibilityDescription;
    final /* synthetic */ Function0<Unit> $onRemoveListener;
    final /* synthetic */ String $removePmDialogTitle;
    final /* synthetic */ float $viewWidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionUiKt$PaymentOptionUi$3(float f, boolean z, boolean z2, boolean z3, int i, InterfaceC41563gV2 interfaceC41563gV2, C47063pm0 c47063pm0, Integer num, String str, String str2, String str3, Function0<Unit> function0, String str4, Function0<Unit> function02, int i2, int i3, int i4) {
        super(2);
        this.$viewWidth = f;
        this.$isSelected = z;
        this.$isEditing = z2;
        this.$isEnabled = z3;
        this.$iconRes = i;
        this.$modifier = interfaceC41563gV2;
        this.$iconTint = c47063pm0;
        this.$labelIcon = num;
        this.$labelText = str;
        this.$removePmDialogTitle = str2;
        this.$description = str3;
        this.$onRemoveListener = function0;
        this.$onRemoveAccessibilityDescription = str4;
        this.$onItemSelectedListener = function02;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PaymentOptionUiKt.m116599PaymentOptionUiVPtddqc(this.$viewWidth, this.$isSelected, this.$isEditing, this.$isEnabled, this.$iconRes, this.$modifier, this.$iconTint, this.$labelIcon, this.$labelText, this.$removePmDialogTitle, this.$description, this.$onRemoveListener, this.$onRemoveAccessibilityDescription, this.$onItemSelectedListener, interfaceC32720Et0, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
