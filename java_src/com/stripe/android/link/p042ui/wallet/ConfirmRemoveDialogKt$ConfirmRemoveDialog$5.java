package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.ConfirmRemoveDialogKt$ConfirmRemoveDialog$5 */
/* loaded from: classes7.dex */
public final class ConfirmRemoveDialogKt$ConfirmRemoveDialog$5 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<Boolean, Unit> $onDialogDismissed;
    final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $paymentDetails;
    final /* synthetic */ boolean $showDialog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConfirmRemoveDialogKt$ConfirmRemoveDialog$5(ConsumerPaymentDetails.PaymentDetails paymentDetails, boolean z, Function1<? super Boolean, Unit> function1, int i) {
        super(2);
        this.$paymentDetails = paymentDetails;
        this.$showDialog = z;
        this.$onDialogDismissed = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        ConfirmRemoveDialogKt.ConfirmRemoveDialog(this.$paymentDetails, this.$showDialog, this.$onDialogDismissed, interfaceC32720Et0, this.$$changed | 1);
    }
}
