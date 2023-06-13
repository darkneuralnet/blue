package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.p041ui.components.TopAppBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PartnerAuthScreenKt$PartnerAuthScreenMainContent$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ PartnerAuthState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAuthScreenKt$PartnerAuthScreenMainContent$1(PartnerAuthState partnerAuthState, Function0<Unit> function0, int i) {
        super(2);
        this.$state = partnerAuthState;
        this.$onCloseClick = function0;
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
            C35528Qt0.m87816Z(418406334, i, -1, "com.stripe.android.financialconnections.features.partnerauth.PartnerAuthScreenMainContent.<anonymous> (PartnerAuthScreen.kt:195)");
        }
        TopAppBarKt.m116437FinancialConnectionsTopAppBarDzVHIIc(false, 0.0f, this.$state.getCanNavigateBack(), this.$onCloseClick, interfaceC32720Et0, (this.$$dirty << 6) & 7168, 3);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
