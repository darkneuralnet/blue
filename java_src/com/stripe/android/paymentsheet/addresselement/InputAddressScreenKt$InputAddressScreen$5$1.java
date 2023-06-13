package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InputAddressScreenKt$InputAddressScreen$5$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ InterfaceC48627sP5<Boolean> $checkboxChecked$delegate;
    final /* synthetic */ InterfaceC48627sP5<Map<IdentifierSpec, FormFieldEntry>> $completeValues$delegate;
    final /* synthetic */ InputAddressViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputAddressScreenKt$InputAddressScreen$5$1(InputAddressViewModel inputAddressViewModel, InterfaceC48627sP5<? extends Map<IdentifierSpec, FormFieldEntry>> interfaceC48627sP5, InterfaceC48627sP5<Boolean> interfaceC48627sP52) {
        super(0);
        this.$viewModel = inputAddressViewModel;
        this.$completeValues$delegate = interfaceC48627sP5;
        this.$checkboxChecked$delegate = interfaceC48627sP52;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Map<IdentifierSpec, FormFieldEntry> InputAddressScreen$lambda$5$lambda$2;
        boolean InputAddressScreen$lambda$5$lambda$4;
        InputAddressViewModel inputAddressViewModel = this.$viewModel;
        InputAddressScreen$lambda$5$lambda$2 = InputAddressScreenKt.InputAddressScreen$lambda$5$lambda$2(this.$completeValues$delegate);
        InputAddressScreen$lambda$5$lambda$4 = InputAddressScreenKt.InputAddressScreen$lambda$5$lambda$4(this.$checkboxChecked$delegate);
        inputAddressViewModel.clickPrimaryButton(InputAddressScreen$lambda$5$lambda$2, InputAddressScreen$lambda$5$lambda$4);
    }
}
