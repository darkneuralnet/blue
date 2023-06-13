package com.stripe.android.uicore.text;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class HtmlKt$Html$4 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ String $html;
    final /* synthetic */ int $imageAlign;
    final /* synthetic */ Map<String, EmbeddableImage> $imageLoader;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ G26 $style;
    final /* synthetic */ GN5 $urlSpanStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlKt$Html$4(String str, InterfaceC41563gV2 interfaceC41563gV2, Map<String, ? extends EmbeddableImage> map, long j, G26 g26, boolean z, GN5 gn5, int i, Function0<Unit> function0, int i2, int i3) {
        super(2);
        this.$html = str;
        this.$modifier = interfaceC41563gV2;
        this.$imageLoader = map;
        this.$color = j;
        this.$style = g26;
        this.$enabled = z;
        this.$urlSpanStyle = gn5;
        this.$imageAlign = i;
        this.$onClick = function0;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        HtmlKt.m116769Htmlm4MizFo(this.$html, this.$modifier, this.$imageLoader, this.$color, this.$style, this.$enabled, this.$urlSpanStyle, this.$imageAlign, this.$onClick, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
