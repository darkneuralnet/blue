package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$ExpandedPaymentDetails$2 */
/* loaded from: classes7.dex */
public final class WalletScreenKt$ExpandedPaymentDetails$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onAddNewPaymentMethodClick;
    final /* synthetic */ Function0<Unit> $onCollapse;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onItemSelected;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onMenuButtonClick;
    final /* synthetic */ WalletUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$ExpandedPaymentDetails$2(WalletUiState walletUiState, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function1, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function12, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$uiState = walletUiState;
        this.$onItemSelected = function1;
        this.$onMenuButtonClick = function12;
        this.$onAddNewPaymentMethodClick = function0;
        this.$onCollapse = function02;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        WalletScreenKt.ExpandedPaymentDetails(this.$uiState, this.$onItemSelected, this.$onMenuButtonClick, this.$onAddNewPaymentMethodClick, this.$onCollapse, interfaceC32720Et0, this.$$changed | 1);
    }
}
