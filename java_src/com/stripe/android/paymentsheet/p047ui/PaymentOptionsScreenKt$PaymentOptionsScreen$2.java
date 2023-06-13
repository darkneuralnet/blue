package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsScreenKt$PaymentOptionsScreen$2 */
/* loaded from: classes7.dex */
public final class PaymentOptionsScreenKt$PaymentOptionsScreen$2 extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ PaymentOptionsViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsScreenKt$PaymentOptionsScreen$2(PaymentOptionsViewModel paymentOptionsViewModel) {
        super(3);
        this.$viewModel = paymentOptionsViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC41563gV2 scrollModifier, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(scrollModifier, "scrollModifier");
        if ((i & 14) == 0) {
            i |= interfaceC32720Et0.mo89539n(scrollModifier) ? 4 : 2;
        }
        if ((i & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(486385061, i, -1, "com.stripe.android.paymentsheet.ui.PaymentOptionsScreen.<anonymous> (PaymentOptionsScreen.kt:31)");
        }
        PaymentOptionsScreenKt.PaymentOptionsScreenContent(this.$viewModel, scrollModifier, interfaceC32720Et0, ((i << 3) & 112) | 8, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
