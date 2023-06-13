package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public /* synthetic */ class InstitutionPickerScreenKt$InstitutionPickerScreen$4 extends FunctionReferenceImpl implements Function2<FinancialConnectionsInstitution, Boolean, Unit> {
    public InstitutionPickerScreenKt$InstitutionPickerScreen$4(Object obj) {
        super(2, obj, InstitutionPickerViewModel.class, "onInstitutionSelected", "onInstitutionSelected(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(FinancialConnectionsInstitution financialConnectionsInstitution, Boolean bool) {
        invoke(financialConnectionsInstitution, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(FinancialConnectionsInstitution p0, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InstitutionPickerViewModel) this.receiver).onInstitutionSelected(p0, z);
    }
}
