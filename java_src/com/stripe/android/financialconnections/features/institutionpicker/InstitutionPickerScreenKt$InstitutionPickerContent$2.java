package com.stripe.android.financialconnections.features.institutionpicker;

import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerState;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.InstitutionResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$InstitutionPickerContent$2 extends Lambda implements Function3<PD3, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<AbstractC19862dp<InstitutionResponse>> $institutionsProvider;
    final /* synthetic */ Function0<Unit> $onCancelSearchClick;
    final /* synthetic */ Function2<FinancialConnectionsInstitution, Boolean, Unit> $onInstitutionSelected;
    final /* synthetic */ Function0<Unit> $onManualEntryClick;
    final /* synthetic */ Function1<String, Unit> $onQueryChanged;
    final /* synthetic */ Function0<Unit> $onSearchFocused;
    final /* synthetic */ AbstractC19862dp<InstitutionPickerState.Payload> $payload;
    final /* synthetic */ boolean $searchMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InstitutionPickerScreenKt$InstitutionPickerContent$2(boolean z, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<? extends AbstractC19862dp<InstitutionResponse>> function03, Function2<? super FinancialConnectionsInstitution, ? super Boolean, Unit> function2, AbstractC19862dp<InstitutionPickerState.Payload> abstractC19862dp, Function0<Unit> function04, int i) {
        super(3);
        this.$searchMode = z;
        this.$onQueryChanged = function1;
        this.$onSearchFocused = function0;
        this.$onCancelSearchClick = function02;
        this.$institutionsProvider = function03;
        this.$onInstitutionSelected = function2;
        this.$payload = abstractC19862dp;
        this.$onManualEntryClick = function04;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PD3 pd3, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(pd3, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PD3 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1065412547, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerContent.<anonymous> (InstitutionPickerScreen.kt:127)");
        }
        boolean z = this.$searchMode;
        Function1<String, Unit> function1 = this.$onQueryChanged;
        Function0<Unit> function0 = this.$onSearchFocused;
        Function0<Unit> function02 = this.$onCancelSearchClick;
        Function0<AbstractC19862dp<InstitutionResponse>> function03 = this.$institutionsProvider;
        Function2<FinancialConnectionsInstitution, Boolean, Unit> function2 = this.$onInstitutionSelected;
        AbstractC19862dp<InstitutionPickerState.Payload> abstractC19862dp = this.$payload;
        Function0<Unit> function04 = this.$onManualEntryClick;
        int i2 = this.$$dirty;
        InstitutionPickerScreenKt.LoadedContent(z, function1, function0, function02, function03, function2, abstractC19862dp, function04, interfaceC32720Et0, ((i2 >> 6) & 14) | 2097152 | ((i2 >> 6) & 112) | ((i2 >> 15) & 896) | ((i2 >> 6) & 7168) | ((i2 << 9) & 57344) | ((i2 << 3) & ImageMetadata.JPEG_GPS_COORDINATES) | ((i2 >> 3) & 29360128));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
