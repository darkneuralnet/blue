package com.stripe.android.uicore.elements.menu;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CheckboxKt$Checkbox$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckboxKt$Checkbox$1(boolean z, Function1<? super Boolean, Unit> function1, InterfaceC41563gV2 interfaceC41563gV2, boolean z2, int i, int i2) {
        super(2);
        this.$checked = z;
        this.$onCheckedChange = function1;
        this.$modifier = interfaceC41563gV2;
        this.$enabled = z2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        CheckboxKt.Checkbox(this.$checked, this.$onCheckedChange, this.$modifier, this.$enabled, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}