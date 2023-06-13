package com.stripe.android.financialconnections.features.institutionpicker;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$FinancialConnectionsSearchRow$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onCancelSearchClick;
    final /* synthetic */ Function1<F16, Unit> $onQueryChanged;
    final /* synthetic */ Function0<Unit> $onSearchFocused;
    final /* synthetic */ F16 $query;
    final /* synthetic */ boolean $searchMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstitutionPickerScreenKt$FinancialConnectionsSearchRow$2(F16 f16, Function1<? super F16, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, boolean z, int i) {
        super(2);
        this.$query = f16;
        this.$onQueryChanged = function1;
        this.$onCancelSearchClick = function0;
        this.$onSearchFocused = function02;
        this.$searchMode = z;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InstitutionPickerScreenKt.FinancialConnectionsSearchRow(this.$query, this.$onQueryChanged, this.$onCancelSearchClick, this.$onSearchFocused, this.$searchMode, interfaceC32720Et0, this.$$changed | 1);
    }
}
