package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.features.institutionpicker.ComposableSingletons$InstitutionPickerScreenKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$InstitutionPickerScreenKt$lambda2$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$InstitutionPickerScreenKt$lambda2$1 INSTANCE = new ComposableSingletons$InstitutionPickerScreenKt$lambda2$1();

    public ComposableSingletons$InstitutionPickerScreenKt$lambda2$1() {
        super(2);
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
            C35528Qt0.m87816Z(-1786093263, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.ComposableSingletons$InstitutionPickerScreenKt.lambda-2.<anonymous> (InstitutionPickerScreen.kt:238)");
        }
        String m41310c = C40946fS5.m41310c(C18634R.string.stripe_search, interfaceC32720Et0, 0);
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        C38909c26.m62000e(m41310c, null, financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116471getTextDisabled0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(interfaceC32720Et0, 6).getBody(), interfaceC32720Et0, 0, 0, 32762);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
