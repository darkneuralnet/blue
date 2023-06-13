package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.features.common.ErrorContentKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PartnerAuthScreenKt$InstitutionalPrePaneContent$1$1$1 extends Lambda implements Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ InterfaceC41563gV2 $institutionIconModifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerAuthScreenKt$InstitutionalPrePaneContent$1$1$1(InterfaceC41563gV2 interfaceC41563gV2) {
        super(3);
        this.$institutionIconModifier = interfaceC41563gV2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41875h10 interfaceC41875h10, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC41875h10, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC41875h10 StripeImage, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(StripeImage, "$this$StripeImage");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1901002709, i, -1, "com.stripe.android.financialconnections.features.partnerauth.InstitutionalPrePaneContent.<anonymous>.<anonymous>.<anonymous> (PartnerAuthScreen.kt:323)");
        }
        ErrorContentKt.InstitutionPlaceholder(this.$institutionIconModifier, interfaceC32720Et0, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
