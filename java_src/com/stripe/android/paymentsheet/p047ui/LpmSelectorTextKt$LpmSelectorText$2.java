package com.stripe.android.paymentsheet.p047ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.LpmSelectorTextKt$LpmSelectorText$2 */
/* loaded from: classes7.dex */
public final class LpmSelectorTextKt$LpmSelectorText$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Integer $icon;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ String $text;
    final /* synthetic */ long $textColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LpmSelectorTextKt$LpmSelectorText$2(Integer num, String str, long j, InterfaceC41563gV2 interfaceC41563gV2, boolean z, int i, int i2) {
        super(2);
        this.$icon = num;
        this.$text = str;
        this.$textColor = j;
        this.$modifier = interfaceC41563gV2;
        this.$isEnabled = z;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        LpmSelectorTextKt.m116639LpmSelectorTextT042LqI(this.$icon, this.$text, this.$textColor, this.$modifier, this.$isEnabled, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
