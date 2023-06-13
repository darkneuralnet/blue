package com.stripe.android.financialconnections.features.manualentry;

import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ManualEntryScreenKt$InputWithError$4 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $hint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManualEntryScreenKt$InputWithError$4(String str, int i) {
        super(2);
        this.$hint = str;
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
            C35528Qt0.m87816Z(313126292, i, -1, "com.stripe.android.financialconnections.features.manualentry.InputWithError.<anonymous> (ManualEntryScreen.kt:280)");
        }
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        G26 body = financialConnectionsTheme.getTypography(interfaceC32720Et0, 6).getBody();
        C38909c26.m62000e(this.$hint, null, financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116471getTextDisabled0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, body, interfaceC32720Et0, (this.$$dirty >> 9) & 14, 0, 32762);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
