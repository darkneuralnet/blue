package com.stripe.android.financialconnections.features.institutionpicker;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$SearchInstitutionsFailedRow$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $manualEntryEnabled;
    final /* synthetic */ Function0<Unit> $onManualEntryClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPickerScreenKt$SearchInstitutionsFailedRow$2(boolean z, Function0<Unit> function0, int i) {
        super(2);
        this.$manualEntryEnabled = z;
        this.$onManualEntryClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InstitutionPickerScreenKt.SearchInstitutionsFailedRow(this.$manualEntryEnabled, this.$onManualEntryClick, interfaceC32720Et0, this.$$changed | 1);
    }
}