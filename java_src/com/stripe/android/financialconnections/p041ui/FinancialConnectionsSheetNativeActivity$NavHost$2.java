package com.stripe.android.financialconnections.p041ui;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity$NavHost$2 */
/* loaded from: classes7.dex */
public final class FinancialConnectionsSheetNativeActivity$NavHost$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ FinancialConnectionsSessionManifest.Pane $initialPane;
    final /* synthetic */ boolean $reducedBranding;
    final /* synthetic */ FinancialConnectionsSheetNativeActivity $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetNativeActivity$NavHost$2(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity, FinancialConnectionsSessionManifest.Pane pane, boolean z, int i) {
        super(2);
        this.$tmp0_rcvr = financialConnectionsSheetNativeActivity;
        this.$initialPane = pane;
        this.$reducedBranding = z;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        this.$tmp0_rcvr.NavHost(this.$initialPane, this.$reducedBranding, interfaceC32720Et0, this.$$changed | 1);
    }
}