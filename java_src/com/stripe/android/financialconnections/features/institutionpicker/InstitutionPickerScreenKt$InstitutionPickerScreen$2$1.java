package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.model.InstitutionResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$InstitutionPickerScreen$2$1 extends Lambda implements Function0<AbstractC19862dp<? extends InstitutionResponse>> {
    final /* synthetic */ InterfaceC48627sP5<InstitutionPickerState> $state$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPickerScreenKt$InstitutionPickerScreen$2$1(InterfaceC48627sP5<InstitutionPickerState> interfaceC48627sP5) {
        super(0);
        this.$state$delegate = interfaceC48627sP5;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final AbstractC19862dp<? extends InstitutionResponse> invoke2() {
        InstitutionPickerState InstitutionPickerScreen$lambda$0;
        InstitutionPickerScreen$lambda$0 = InstitutionPickerScreenKt.InstitutionPickerScreen$lambda$0(this.$state$delegate);
        return InstitutionPickerScreen$lambda$0.getSearchInstitutions();
    }
}
