package com.stripe.android.paymentsheet.p047ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$PaymentSheetTopBar$4 */
/* loaded from: classes7.dex */
public final class PaymentSheetTopBarKt$PaymentSheetTopBar$4 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ PaymentSheetTopBarState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetTopBarKt$PaymentSheetTopBar$4(PaymentSheetTopBarState paymentSheetTopBarState) {
        super(2);
        this.$state = paymentSheetTopBarState;
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
            C35528Qt0.m87816Z(-547937488, i, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:77)");
        }
        if (this.$state.getShowTestModeLabel()) {
            PaymentSheetTopBarKt.TestModeBadge(interfaceC32720Et0, 0);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
