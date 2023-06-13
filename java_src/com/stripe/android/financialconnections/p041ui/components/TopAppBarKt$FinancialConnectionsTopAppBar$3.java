package com.stripe.android.financialconnections.p041ui.components;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.components.TopAppBarKt$FinancialConnectionsTopAppBar$3 */
/* loaded from: classes7.dex */
public final class TopAppBarKt$FinancialConnectionsTopAppBar$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $elevation;
    final /* synthetic */ boolean $hideStripeLogo;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ boolean $showBack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopAppBarKt$FinancialConnectionsTopAppBar$3(boolean z, float f, boolean z2, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$hideStripeLogo = z;
        this.$elevation = f;
        this.$showBack = z2;
        this.$onCloseClick = function0;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        TopAppBarKt.m116437FinancialConnectionsTopAppBarDzVHIIc(this.$hideStripeLogo, this.$elevation, this.$showBack, this.$onCloseClick, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
