package com.stripe.android.financialconnections.features.institutionpicker;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$InstitutionPickerScreen$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ InterfaceC32037Bv1 $focusManager;
    final /* synthetic */ InstitutionPickerViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPickerScreenKt$InstitutionPickerScreen$1(InterfaceC32037Bv1 interfaceC32037Bv1, InstitutionPickerViewModel institutionPickerViewModel) {
        super(0);
        this.$focusManager = interfaceC32037Bv1;
        this.$viewModel = institutionPickerViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        InterfaceC32037Bv1.m113331e(this.$focusManager, false, 1, null);
        this.$viewModel.onCancelSearchClick();
    }
}
