package com.stripe.android.uicore.text;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class HtmlKt$ClickableText$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ Map<String, L22> $inlineContent;
    final /* synthetic */ int $maxLines;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function1<Integer, Unit> $onClick;
    final /* synthetic */ Function1<C42484i26, Unit> $onTextLayout;
    final /* synthetic */ int $overflow;
    final /* synthetic */ boolean $softWrap;
    final /* synthetic */ G26 $style;
    final /* synthetic */ C1577Df $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HtmlKt$ClickableText$3(C1577Df c1577Df, long j, G26 g26, InterfaceC41563gV2 interfaceC41563gV2, Map<String, L22> map, boolean z, int i, int i2, Function1<? super C42484i26, Unit> function1, Function1<? super Integer, Unit> function12, int i3, int i4) {
        super(2);
        this.$text = c1577Df;
        this.$color = j;
        this.$style = g26;
        this.$modifier = interfaceC41563gV2;
        this.$inlineContent = map;
        this.$softWrap = z;
        this.$overflow = i;
        this.$maxLines = i2;
        this.$onTextLayout = function1;
        this.$onClick = function12;
        this.$$changed = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        HtmlKt.m116768ClickableTextmZk19tU(this.$text, this.$color, this.$style, this.$modifier, this.$inlineContent, this.$softWrap, this.$overflow, this.$maxLines, this.$onTextLayout, this.$onClick, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
