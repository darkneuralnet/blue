package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.p049ui.core.elements.CvcController;
import com.stripe.android.uicore.elements.TextFieldController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$15 */
/* loaded from: classes7.dex */
public final class WalletScreenKt$WalletBody$15 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ CvcController $cvcController;
    final /* synthetic */ TextFieldController $expiryDateController;
    final /* synthetic */ Function0<Unit> $onAddNewPaymentMethodClick;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onDeletePaymentMethod;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onEditPaymentMethod;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onItemSelected;
    final /* synthetic */ Function0<Unit> $onPayAnotherWayClick;
    final /* synthetic */ Function0<Unit> $onPrimaryButtonClick;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onSetDefault;
    final /* synthetic */ String $primaryButtonLabel;
    final /* synthetic */ Function1<Boolean, Unit> $setExpanded;
    final /* synthetic */ Function1<Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> $showBottomSheetContent;
    final /* synthetic */ WalletUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$WalletBody$15(WalletUiState walletUiState, String str, TextFieldController textFieldController, CvcController cvcController, Function1<? super Boolean, Unit> function1, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function12, Function0<Unit> function0, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function13, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function14, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function15, Function0<Unit> function02, Function0<Unit> function03, Function1<? super Function3<? super InterfaceC35231Pm0, ? super InterfaceC32720Et0, ? super Integer, Unit>, Unit> function16, int i, int i2) {
        super(2);
        this.$uiState = walletUiState;
        this.$primaryButtonLabel = str;
        this.$expiryDateController = textFieldController;
        this.$cvcController = cvcController;
        this.$setExpanded = function1;
        this.$onItemSelected = function12;
        this.$onAddNewPaymentMethodClick = function0;
        this.$onEditPaymentMethod = function13;
        this.$onSetDefault = function14;
        this.$onDeletePaymentMethod = function15;
        this.$onPrimaryButtonClick = function02;
        this.$onPayAnotherWayClick = function03;
        this.$showBottomSheetContent = function16;
        this.$$changed = i;
        this.$$changed1 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        WalletScreenKt.WalletBody(this.$uiState, this.$primaryButtonLabel, this.$expiryDateController, this.$cvcController, this.$setExpanded, this.$onItemSelected, this.$onAddNewPaymentMethodClick, this.$onEditPaymentMethod, this.$onSetDefault, this.$onDeletePaymentMethod, this.$onPrimaryButtonClick, this.$onPayAnotherWayClick, this.$showBottomSheetContent, interfaceC32720Et0, this.$$changed | 1, this.$$changed1);
    }
}
