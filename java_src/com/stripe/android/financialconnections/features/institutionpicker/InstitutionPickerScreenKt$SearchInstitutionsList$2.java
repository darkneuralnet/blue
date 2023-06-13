package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$SearchInstitutionsList$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<AbstractC19862dp<InstitutionResponse>> $institutionsProvider;
    final /* synthetic */ boolean $manualEntryEnabled;
    final /* synthetic */ Function2<FinancialConnectionsInstitution, Boolean, Unit> $onInstitutionSelected;
    final /* synthetic */ Function0<Unit> $onManualEntryClick;
    final /* synthetic */ String $query;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstitutionPickerScreenKt$SearchInstitutionsList$2(Function0<? extends AbstractC19862dp<InstitutionResponse>> function0, Function2<? super FinancialConnectionsInstitution, ? super Boolean, Unit> function2, String str, Function0<Unit> function02, boolean z, int i) {
        super(2);
        this.$institutionsProvider = function0;
        this.$onInstitutionSelected = function2;
        this.$query = str;
        this.$onManualEntryClick = function02;
        this.$manualEntryEnabled = z;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InstitutionPickerScreenKt.SearchInstitutionsList(this.$institutionsProvider, this.$onInstitutionSelected, this.$query, this.$onManualEntryClick, this.$manualEntryEnabled, interfaceC32720Et0, this.$$changed | 1);
    }
}
