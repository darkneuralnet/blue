package com.stripe.android.financialconnections.features.institutionpicker;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class SearchFooterKt$SearchFooterRow$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $icon;
    final /* synthetic */ long $iconBackgroundColor;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ String $title;
    final /* synthetic */ long $titleColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFooterKt$SearchFooterRow$2(String str, long j, int i, long j2, long j3, InterfaceC41563gV2 interfaceC41563gV2, int i2, int i3) {
        super(2);
        this.$title = str;
        this.$titleColor = j;
        this.$icon = i;
        this.$iconColor = j2;
        this.$iconBackgroundColor = j3;
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
        SearchFooterKt.m116392SearchFooterRowtjc1scY(this.$title, this.$titleColor, this.$icon, this.$iconColor, this.$iconBackgroundColor, this.$modifier, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
