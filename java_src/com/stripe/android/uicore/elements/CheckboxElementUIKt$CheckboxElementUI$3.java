package com.stripe.android.uicore.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CheckboxElementUIKt$CheckboxElementUI$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $automationTestTag;
    final /* synthetic */ boolean $isChecked;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ String $label;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function1<Boolean, Unit> $onValueChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckboxElementUIKt$CheckboxElementUI$3(InterfaceC41563gV2 interfaceC41563gV2, String str, boolean z, String str2, boolean z2, Function1<? super Boolean, Unit> function1, int i, int i2) {
        super(2);
        this.$modifier = interfaceC41563gV2;
        this.$automationTestTag = str;
        this.$isChecked = z;
        this.$label = str2;
        this.$isEnabled = z2;
        this.$onValueChange = function1;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        CheckboxElementUIKt.CheckboxElementUI(this.$modifier, this.$automationTestTag, this.$isChecked, this.$label, this.$isEnabled, this.$onValueChange, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
