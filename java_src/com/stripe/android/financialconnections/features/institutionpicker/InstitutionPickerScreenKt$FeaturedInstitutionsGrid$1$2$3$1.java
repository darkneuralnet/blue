package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$2$3$1 extends Lambda implements Function3<InterfaceC41875h10, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ FinancialConnectionsInstitution $institution;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPickerScreenKt$FeaturedInstitutionsGrid$1$2$3$1(FinancialConnectionsInstitution financialConnectionsInstitution) {
        super(3);
        this.$institution = financialConnectionsInstitution;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC41875h10 interfaceC41875h10, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC41875h10, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC41875h10 StripeImage, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(StripeImage, "$this$StripeImage");
        if ((i & 14) == 0) {
            i2 = (interfaceC32720Et0.mo89539n(StripeImage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-388858015, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.FeaturedInstitutionsGrid.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InstitutionPickerScreen.kt:466)");
        }
        InterfaceC41563gV2 mo35388c = StripeImage.mo35388c(InterfaceC41563gV2.f82354b0, InterfaceC4360K9.f19170a.m99141e());
        String name = this.$institution.getName();
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        C38909c26.m62000e(name, mo35388c, financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116473getTextPrimary0d7_KjU(), 0L, null, null, null, 0L, null, C47801r06.m16685g(C47801r06.f106195b.m16678a()), 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(interfaceC32720Et0, 6).getBodyEmphasized(), interfaceC32720Et0, 0, 0, 32248);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
