package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$InstitutionResultTile$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ FinancialConnectionsInstitution $institution;
    final /* synthetic */ Function1<FinancialConnectionsInstitution, Unit> $onInstitutionSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstitutionPickerScreenKt$InstitutionResultTile$3(Function1<? super FinancialConnectionsInstitution, Unit> function1, FinancialConnectionsInstitution financialConnectionsInstitution, int i) {
        super(2);
        this.$onInstitutionSelected = function1;
        this.$institution = financialConnectionsInstitution;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InstitutionPickerScreenKt.InstitutionResultTile(this.$onInstitutionSelected, this.$institution, interfaceC32720Et0, this.$$changed | 1);
    }
}
