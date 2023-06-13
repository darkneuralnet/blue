package com.stripe.android.financialconnections.features.manualentry;

import com.stripe.android.financialconnections.p041ui.components.TopAppBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ManualEntryScreenKt$ManualEntryContent$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ C37135Xp5 $scrollState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntryScreenKt$ManualEntryContent$1(C37135Xp5 c37135Xp5, Function0<Unit> function0, int i) {
        super(2);
        this.$scrollState = c37135Xp5;
        this.$onCloseClick = function0;
        this.$$dirty1 = i;
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
            C35528Qt0.m87816Z(-1722057153, i, -1, "com.stripe.android.financialconnections.features.manualentry.ManualEntryContent.<anonymous> (ManualEntryScreen.kt:95)");
        }
        TopAppBarKt.m116437FinancialConnectionsTopAppBarDzVHIIc(false, TopAppBarKt.getElevation(this.$scrollState), false, this.$onCloseClick, interfaceC32720Et0, (this.$$dirty1 << 9) & 7168, 5);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
