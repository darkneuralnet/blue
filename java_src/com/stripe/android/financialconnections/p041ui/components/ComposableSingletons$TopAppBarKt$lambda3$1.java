package com.stripe.android.financialconnections.p041ui.components;

import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p000.EP1;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt$lambda-3$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$TopAppBarKt$lambda3$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$TopAppBarKt$lambda3$1 INSTANCE = new ComposableSingletons$TopAppBarKt$lambda3$1();

    public ComposableSingletons$TopAppBarKt$lambda3$1() {
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
            C35528Qt0.m87816Z(-1472540659, i, -1, "com.stripe.android.financialconnections.ui.components.ComposableSingletons$TopAppBarKt.lambda-3.<anonymous> (TopAppBar.kt:49)");
        }
        DP1.m110534a(C1177Co.m111558a(EP1.C1822a.f7416a), "Back icon", null, FinancialConnectionsTheme.INSTANCE.getColors(interfaceC32720Et0, 6).m116474getTextSecondary0d7_KjU(), interfaceC32720Et0, 48, 4);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
