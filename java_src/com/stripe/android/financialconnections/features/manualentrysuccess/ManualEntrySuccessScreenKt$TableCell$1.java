package com.stripe.android.financialconnections.features.manualentrysuccess;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ManualEntrySuccessScreenKt$TableCell$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $color;
    final /* synthetic */ boolean $highlight;
    final /* synthetic */ String $text;
    final /* synthetic */ InterfaceC37486Zc5 $this_TableCell;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntrySuccessScreenKt$TableCell$1(InterfaceC37486Zc5 interfaceC37486Zc5, String str, long j, boolean z, int i) {
        super(2);
        this.$this_TableCell = interfaceC37486Zc5;
        this.$text = str;
        this.$color = j;
        this.$highlight = z;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ManualEntrySuccessScreenKt.m116404TableCellFNF3uiM(this.$this_TableCell, this.$text, this.$color, this.$highlight, interfaceC32720Et0, this.$$changed | 1);
    }
}
