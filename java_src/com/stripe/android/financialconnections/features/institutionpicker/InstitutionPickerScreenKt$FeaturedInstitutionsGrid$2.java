package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$FeaturedInstitutionsGrid$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function2<FinancialConnectionsInstitution, Boolean, Unit> $onInstitutionSelected;
    final /* synthetic */ AbstractC19862dp<InstitutionPickerState.Payload> $payload;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstitutionPickerScreenKt$FeaturedInstitutionsGrid$2(InterfaceC41563gV2 interfaceC41563gV2, AbstractC19862dp<InstitutionPickerState.Payload> abstractC19862dp, Function2<? super FinancialConnectionsInstitution, ? super Boolean, Unit> function2, int i) {
        super(2);
        this.$modifier = interfaceC41563gV2;
        this.$payload = abstractC19862dp;
        this.$onInstitutionSelected = function2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InstitutionPickerScreenKt.FeaturedInstitutionsGrid(this.$modifier, this.$payload, this.$onInstitutionSelected, interfaceC32720Et0, this.$$changed | 1);
    }
}
