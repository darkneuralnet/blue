package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt$PaymentSheetScreen$2 */
/* loaded from: classes7.dex */
public final class PaymentSheetScreenKt$PaymentSheetScreen$2 extends Lambda implements Function3<InterfaceC41563gV2, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ InterfaceC48627sP5<Boolean> $contentVisible$delegate;
    final /* synthetic */ PaymentSheetViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetScreenKt$PaymentSheetScreen$2(PaymentSheetViewModel paymentSheetViewModel, InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        super(3);
        this.$viewModel = paymentSheetViewModel;
        this.$contentVisible$delegate = interfaceC48627sP5;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC41563gV2, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC41563gV2 scrollModifier, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        boolean PaymentSheetScreen$lambda$0;
        Intrinsics.checkNotNullParameter(scrollModifier, "scrollModifier");
        if ((i & 14) == 0) {
            i |= interfaceC32720Et0.mo89539n(scrollModifier) ? 4 : 2;
        }
        if ((i & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1192175964, i, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen.<anonymous> (PaymentSheetScreen.kt:45)");
        }
        PaymentSheetScreen$lambda$0 = PaymentSheetScreenKt.PaymentSheetScreen$lambda$0(this.$contentVisible$delegate);
        if (PaymentSheetScreen$lambda$0) {
            PaymentSheetScreenKt.PaymentSheetScreenContent(this.$viewModel, scrollModifier, interfaceC32720Et0, ((i << 3) & 112) | 8, 0);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
