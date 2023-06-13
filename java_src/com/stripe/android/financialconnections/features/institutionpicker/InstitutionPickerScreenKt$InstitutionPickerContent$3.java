package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$InstitutionPickerContent$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<AbstractC19862dp<InstitutionResponse>> $institutionsProvider;
    final /* synthetic */ Function0<Unit> $onCancelSearchClick;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ Function2<FinancialConnectionsInstitution, Boolean, Unit> $onInstitutionSelected;
    final /* synthetic */ Function0<Unit> $onManualEntryClick;
    final /* synthetic */ Function1<String, Unit> $onQueryChanged;
    final /* synthetic */ Function0<Unit> $onSearchFocused;
    final /* synthetic */ AbstractC19862dp<InstitutionPickerState.Payload> $payload;
    final /* synthetic */ boolean $searchMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstitutionPickerScreenKt$InstitutionPickerContent$3(AbstractC19862dp<InstitutionPickerState.Payload> abstractC19862dp, Function0<? extends AbstractC19862dp<InstitutionResponse>> function0, boolean z, Function1<? super String, Unit> function1, Function2<? super FinancialConnectionsInstitution, ? super Boolean, Unit> function2, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, int i) {
        super(2);
        this.$payload = abstractC19862dp;
        this.$institutionsProvider = function0;
        this.$searchMode = z;
        this.$onQueryChanged = function1;
        this.$onInstitutionSelected = function2;
        this.$onCancelSearchClick = function02;
        this.$onCloseClick = function03;
        this.$onSearchFocused = function04;
        this.$onManualEntryClick = function05;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InstitutionPickerScreenKt.InstitutionPickerContent(this.$payload, this.$institutionsProvider, this.$searchMode, this.$onQueryChanged, this.$onInstitutionSelected, this.$onCancelSearchClick, this.$onCloseClick, this.$onSearchFocused, this.$onManualEntryClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
