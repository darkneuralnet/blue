package com.stripe.android.link.p042ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.LinkTermsKt$LinkTerms$1 */
/* loaded from: classes7.dex */
public final class LinkTermsKt$LinkTerms$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ int $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkTermsKt$LinkTerms$1(InterfaceC41563gV2 interfaceC41563gV2, int i, int i2, int i3) {
        super(2);
        this.$modifier = interfaceC41563gV2;
        this.$textAlign = i;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        LinkTermsKt.m116553LinkTerms5stqomU(this.$modifier, this.$textAlign, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}