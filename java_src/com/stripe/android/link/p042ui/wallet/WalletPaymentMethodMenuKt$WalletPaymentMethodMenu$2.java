package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletPaymentMethodMenuKt$WalletPaymentMethodMenu$2 */
/* loaded from: classes7.dex */
public final class WalletPaymentMethodMenuKt$WalletPaymentMethodMenu$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onCancelClick;
    final /* synthetic */ Function0<Unit> $onEditClick;
    final /* synthetic */ Function0<Unit> $onRemoveClick;
    final /* synthetic */ Function0<Unit> $onSetDefaultClick;
    final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $paymentDetails;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletPaymentMethodMenuKt$WalletPaymentMethodMenu$2(ConsumerPaymentDetails.PaymentDetails paymentDetails, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, int i) {
        super(2);
        this.$paymentDetails = paymentDetails;
        this.$onEditClick = function0;
        this.$onSetDefaultClick = function02;
        this.$onRemoveClick = function03;
        this.$onCancelClick = function04;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        WalletPaymentMethodMenuKt.WalletPaymentMethodMenu(this.$paymentDetails, this.$onEditClick, this.$onSetDefaultClick, this.$onRemoveClick, this.$onCancelClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
