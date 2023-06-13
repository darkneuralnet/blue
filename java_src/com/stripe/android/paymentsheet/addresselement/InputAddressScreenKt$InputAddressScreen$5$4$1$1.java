package com.stripe.android.paymentsheet.addresselement;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InputAddressScreenKt$InputAddressScreen$5$4$1$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ InterfaceC48627sP5<Boolean> $checkboxChecked$delegate;
    final /* synthetic */ InputAddressViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputAddressScreenKt$InputAddressScreen$5$4$1$1(InputAddressViewModel inputAddressViewModel, InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        super(1);
        this.$viewModel = inputAddressViewModel;
        this.$checkboxChecked$delegate = interfaceC48627sP5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        boolean InputAddressScreen$lambda$5$lambda$4;
        InputAddressViewModel inputAddressViewModel = this.$viewModel;
        InputAddressScreen$lambda$5$lambda$4 = InputAddressScreenKt.InputAddressScreen$lambda$5$lambda$4(this.$checkboxChecked$delegate);
        inputAddressViewModel.clickCheckbox(!InputAddressScreen$lambda$5$lambda$4);
    }
}
