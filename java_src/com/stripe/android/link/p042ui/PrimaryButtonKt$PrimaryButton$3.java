package com.stripe.android.link.p042ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.PrimaryButtonKt$PrimaryButton$3 */
/* loaded from: classes7.dex */
public final class PrimaryButtonKt$PrimaryButton$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Integer $iconEnd;
    final /* synthetic */ Integer $iconStart;
    final /* synthetic */ String $label;
    final /* synthetic */ Function0<Unit> $onButtonClick;
    final /* synthetic */ PrimaryButtonState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonKt$PrimaryButton$3(String str, PrimaryButtonState primaryButtonState, Function0<Unit> function0, Integer num, Integer num2, int i, int i2) {
        super(2);
        this.$label = str;
        this.$state = primaryButtonState;
        this.$onButtonClick = function0;
        this.$iconStart = num;
        this.$iconEnd = num2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        PrimaryButtonKt.PrimaryButton(this.$label, this.$state, this.$onButtonClick, this.$iconStart, this.$iconEnd, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}