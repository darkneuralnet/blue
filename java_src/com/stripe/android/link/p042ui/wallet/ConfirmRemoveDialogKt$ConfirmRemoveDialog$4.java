package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.link.model.ConsumerPaymentDetailsKtxKt;
import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.ConfirmRemoveDialogKt$ConfirmRemoveDialog$4 */
/* loaded from: classes7.dex */
public final class ConfirmRemoveDialogKt$ConfirmRemoveDialog$4 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $paymentDetails;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmRemoveDialogKt$ConfirmRemoveDialog$4(ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        super(2);
        this.$paymentDetails = paymentDetails;
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
            C35528Qt0.m87816Z(791583580, i, -1, "com.stripe.android.link.ui.wallet.ConfirmRemoveDialog.<anonymous> (ConfirmRemoveDialog.kt:48)");
        }
        C38909c26.m62000e(C40946fS5.m41310c(ConsumerPaymentDetailsKtxKt.getRemoveConfirmation(this.$paymentDetails), interfaceC32720Et0, 0), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et0, 0, 0, 65534);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
