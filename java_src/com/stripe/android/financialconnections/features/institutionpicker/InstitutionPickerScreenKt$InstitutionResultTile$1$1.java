package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$InstitutionResultTile$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ FinancialConnectionsInstitution $institution;
    final /* synthetic */ Function1<FinancialConnectionsInstitution, Unit> $onInstitutionSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstitutionPickerScreenKt$InstitutionResultTile$1$1(Function1<? super FinancialConnectionsInstitution, Unit> function1, FinancialConnectionsInstitution financialConnectionsInstitution) {
        super(0);
        this.$onInstitutionSelected = function1;
        this.$institution = financialConnectionsInstitution;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onInstitutionSelected.invoke(this.$institution);
    }
}
