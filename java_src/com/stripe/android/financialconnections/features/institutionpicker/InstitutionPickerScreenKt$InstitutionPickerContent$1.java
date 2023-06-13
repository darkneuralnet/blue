package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.p041ui.components.TopAppBarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$InstitutionPickerContent$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $onCloseClick;
    final /* synthetic */ boolean $searchMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPickerScreenKt$InstitutionPickerContent$1(boolean z, Function0<Unit> function0, int i) {
        super(2);
        this.$searchMode = z;
        this.$onCloseClick = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1798466297, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerContent.<anonymous> (InstitutionPickerScreen.kt:120)");
        }
        if (!this.$searchMode) {
            TopAppBarKt.m116437FinancialConnectionsTopAppBarDzVHIIc(false, 0.0f, false, this.$onCloseClick, interfaceC32720Et0, (this.$$dirty >> 9) & 7168, 7);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
