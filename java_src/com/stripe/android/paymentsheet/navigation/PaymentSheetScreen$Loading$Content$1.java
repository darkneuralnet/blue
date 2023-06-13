package com.stripe.android.paymentsheet.navigation;

import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class PaymentSheetScreen$Loading$Content$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ PaymentSheetScreen.Loading $tmp0_rcvr;
    final /* synthetic */ BaseSheetViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetScreen$Loading$Content$1(PaymentSheetScreen.Loading loading, BaseSheetViewModel baseSheetViewModel, InterfaceC41563gV2 interfaceC41563gV2, int i) {
        super(2);
        this.$tmp0_rcvr = loading;
        this.$viewModel = baseSheetViewModel;
        this.$modifier = interfaceC41563gV2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        this.$tmp0_rcvr.Content(this.$viewModel, this.$modifier, interfaceC32720Et0, this.$$changed | 1);
    }
}
