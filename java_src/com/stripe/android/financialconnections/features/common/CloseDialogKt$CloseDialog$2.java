package com.stripe.android.financialconnections.features.common;

import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CloseDialogKt$CloseDialog$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $onDismissClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseDialogKt$CloseDialog$2(Function0<Unit> function0, int i) {
        super(2);
        this.$onDismissClick = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(581072415, i, -1, "com.stripe.android.financialconnections.features.common.CloseDialog.<anonymous> (CloseDialog.kt:43)");
        }
        C43714k70.m29276c(this.$onDismissClick, null, false, null, null, null, null, C42528i70.f86761a.m34433g(0L, FinancialConnectionsTheme.INSTANCE.getColors(interfaceC32720Et0, 6).m116473getTextPrimary0d7_KjU(), 0L, interfaceC32720Et0, C42528i70.f86772l << 9, 5), null, ComposableSingletons$CloseDialogKt.INSTANCE.m116365getLambda2$financial_connections_release(), interfaceC32720Et0, ((this.$$dirty >> 3) & 14) | 805306368, 382);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
