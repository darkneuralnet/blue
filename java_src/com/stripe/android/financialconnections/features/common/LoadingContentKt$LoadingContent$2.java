package com.stripe.android.financialconnections.features.common;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class LoadingContentKt$LoadingContent$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $content;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingContentKt$LoadingContent$2(InterfaceC41563gV2 interfaceC41563gV2, String str, String str2, int i, int i2) {
        super(2);
        this.$modifier = interfaceC41563gV2;
        this.$title = str;
        this.$content = str2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        LoadingContentKt.LoadingContent(this.$modifier, this.$title, this.$content, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
