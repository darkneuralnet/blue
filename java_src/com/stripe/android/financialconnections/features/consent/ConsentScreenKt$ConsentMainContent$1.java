package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.p041ui.components.TopAppBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nConsentScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,558:1\n76#2:559\n*S KotlinDebug\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$1\n*L\n176#1:559\n*E\n"})
/* loaded from: classes7.dex */
public final class ConsentScreenKt$ConsentMainContent$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ ConsentState.Payload $payload;
    final /* synthetic */ C37135Xp5 $scrollState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentScreenKt$ConsentMainContent$1(ConsentState.Payload payload, C37135Xp5 c37135Xp5, Function0<Unit> function0, int i) {
        super(2);
        this.$payload = payload;
        this.$scrollState = c37135Xp5;
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
            C35528Qt0.m87816Z(1431168558, i, -1, "com.stripe.android.financialconnections.features.consent.ConsentMainContent.<anonymous> (ConsentScreen.kt:171)");
        }
        interfaceC32720Et0.mo89638F(-236494605);
        boolean booleanValue = this.$payload.getShouldShowMerchantLogos() ? true : ((Boolean) interfaceC32720Et0.mo89572c(FinancialConnectionsSheetNativeActivityKt.getLocalReducedBranding())).booleanValue();
        interfaceC32720Et0.mo89605Q();
        TopAppBarKt.m116437FinancialConnectionsTopAppBarDzVHIIc(booleanValue, TopAppBarKt.getElevation(this.$scrollState), false, this.$onCloseClick, interfaceC32720Et0, (this.$$dirty >> 3) & 7168, 4);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
