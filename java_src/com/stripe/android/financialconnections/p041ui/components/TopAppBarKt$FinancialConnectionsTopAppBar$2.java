package com.stripe.android.financialconnections.p041ui.components;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.components.TopAppBarKt$FinancialConnectionsTopAppBar$2 */
/* loaded from: classes7.dex */
public final class TopAppBarKt$FinancialConnectionsTopAppBar$2 extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $onCloseClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopAppBarKt$FinancialConnectionsTopAppBar$2(Function0<Unit> function0, int i) {
        super(3);
        this.$onCloseClick = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC37486Zc5 TopAppBar, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1955077106, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar.<anonymous> (TopAppBar.kt:60)");
        }
        C47438qP1.m17541a(this.$onCloseClick, null, false, null, ComposableSingletons$TopAppBarKt.INSTANCE.m116427getLambda4$financial_connections_release(), interfaceC32720Et0, ((this.$$dirty >> 9) & 14) | 24576, 14);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
