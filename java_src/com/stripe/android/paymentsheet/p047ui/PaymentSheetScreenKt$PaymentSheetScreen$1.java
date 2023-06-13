package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$PaymentSheetScreen$1 */
/* loaded from: classes7.dex */
public final class PaymentSheetScreenKt$PaymentSheetScreen$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ PaymentSheetViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetScreenKt$PaymentSheetScreen$1(PaymentSheetViewModel paymentSheetViewModel) {
        super(2);
        this.$viewModel = paymentSheetViewModel;
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
            C35528Qt0.m87816Z(483576206, i, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:44)");
        }
        PaymentSheetTopBarKt.m116653PaymentSheetTopBarrAjV9yQ(this.$viewModel, 0.0f, interfaceC32720Et0, 8, 2);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
