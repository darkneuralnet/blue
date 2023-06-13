package com.stripe.android.p049ui.core.elements;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.ui.core.elements.HyperlinkedTextKt$HyperlinkedText$3 */
/* loaded from: classes7.dex */
public final class HyperlinkedTextKt$HyperlinkedText$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ G26 $style;
    final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HyperlinkedTextKt$HyperlinkedText$3(String str, InterfaceC41563gV2 interfaceC41563gV2, long j, G26 g26, int i, int i2) {
        super(2);
        this.$text = str;
        this.$modifier = interfaceC41563gV2;
        this.$color = j;
        this.$style = g26;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        HyperlinkedTextKt.m116663HyperlinkedTextcf5BqRc(this.$text, this.$modifier, this.$color, this.$style, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
