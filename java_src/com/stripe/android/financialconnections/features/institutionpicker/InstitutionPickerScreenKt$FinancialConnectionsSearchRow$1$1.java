package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p000.EP1;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ InterfaceC32037Bv1 $focusManager;
    final /* synthetic */ Function0<Unit> $onCancelSearchClick;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$1$1 */
    /* loaded from: classes7.dex */
    public static final class C187631 extends Lambda implements Function0<Unit> {
        final /* synthetic */ InterfaceC32037Bv1 $focusManager;
        final /* synthetic */ Function0<Unit> $onCancelSearchClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C187631(Function0<Unit> function0, InterfaceC32037Bv1 interfaceC32037Bv1) {
            super(0);
            this.$onCancelSearchClick = function0;
            this.$focusManager = interfaceC32037Bv1;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onCancelSearchClick.invoke();
            InterfaceC32037Bv1.m113331e(this.$focusManager, false, 1, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstitutionPickerScreenKt$FinancialConnectionsSearchRow$1$1(Function0<Unit> function0, InterfaceC32037Bv1 interfaceC32037Bv1) {
        super(2);
        this.$onCancelSearchClick = function0;
        this.$focusManager = interfaceC32037Bv1;
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
            C35528Qt0.m87816Z(1938846502, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.FinancialConnectionsSearchRow.<anonymous>.<anonymous> (InstitutionPickerScreen.kt:215)");
        }
        DP1.m110534a(C1177Co.m111558a(EP1.C1822a.f7416a), "Back button", C38131ak0.m70814e(InterfaceC41563gV2.f82354b0, false, null, null, new C187631(this.$onCancelSearchClick, this.$focusManager), 7, null), FinancialConnectionsTheme.INSTANCE.getColors(interfaceC32720Et0, 6).m116473getTextPrimary0d7_KjU(), interfaceC32720Et0, 48, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
