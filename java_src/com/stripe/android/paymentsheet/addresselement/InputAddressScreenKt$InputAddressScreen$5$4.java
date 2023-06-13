package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import com.stripe.android.uicore.elements.CheckboxElementUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InputAddressScreenKt$InputAddressScreen$5$4 extends Lambda implements Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ InterfaceC48627sP5<Boolean> $checkboxChecked$delegate;
    final /* synthetic */ InterfaceC48627sP5<Boolean> $formEnabled$delegate;
    final /* synthetic */ InputAddressViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputAddressScreenKt$InputAddressScreen$5$4(InputAddressViewModel inputAddressViewModel, InterfaceC48627sP5<Boolean> interfaceC48627sP5, InterfaceC48627sP5<Boolean> interfaceC48627sP52) {
        super(3);
        this.$viewModel = inputAddressViewModel;
        this.$checkboxChecked$delegate = interfaceC48627sP5;
        this.$formEnabled$delegate = interfaceC48627sP52;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC35231Pm0 interfaceC35231Pm0, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC35231Pm0, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC35231Pm0 InputAddressScreen, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        boolean InputAddressScreen$lambda$5$lambda$4;
        boolean InputAddressScreen$lambda$5$lambda$3;
        AddressLauncher.AdditionalFieldsConfiguration additionalFields;
        Intrinsics.checkNotNullParameter(InputAddressScreen, "$this$InputAddressScreen");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1056300209, i, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous>.<anonymous> (InputAddressScreen.kt:127)");
        }
        AddressLauncher.Configuration config$paymentsheet_release = this.$viewModel.getArgs().getConfig$paymentsheet_release();
        String checkboxLabel = (config$paymentsheet_release == null || (additionalFields = config$paymentsheet_release.getAdditionalFields()) == null) ? null : additionalFields.getCheckboxLabel();
        if (checkboxLabel != null) {
            InterfaceC48627sP5<Boolean> interfaceC48627sP5 = this.$checkboxChecked$delegate;
            InterfaceC48627sP5<Boolean> interfaceC48627sP52 = this.$formEnabled$delegate;
            InputAddressViewModel inputAddressViewModel = this.$viewModel;
            InputAddressScreen$lambda$5$lambda$4 = InputAddressScreenKt.InputAddressScreen$lambda$5$lambda$4(interfaceC48627sP5);
            InputAddressScreen$lambda$5$lambda$3 = InputAddressScreenKt.InputAddressScreen$lambda$5$lambda$3(interfaceC48627sP52);
            CheckboxElementUIKt.CheckboxElementUI(null, null, InputAddressScreen$lambda$5$lambda$4, checkboxLabel, InputAddressScreen$lambda$5$lambda$3, new InputAddressScreenKt$InputAddressScreen$5$4$1$1(inputAddressViewModel, interfaceC48627sP5), interfaceC32720Et0, 0, 3);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
