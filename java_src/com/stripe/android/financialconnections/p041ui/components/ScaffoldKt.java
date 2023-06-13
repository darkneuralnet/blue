package com.stripe.android.financialconnections.p041ui.components;

import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lkotlin/Function0;", "", "topBar", "Lkotlin/Function1;", "LPD3;", "content", "FinancialConnectionsScaffold", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LEt0;I)V", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.ui.components.ScaffoldKt */
/* loaded from: classes7.dex */
public final class ScaffoldKt {
    public static final void FinancialConnectionsScaffold(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> topBar, Function3<? super PD3, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(topBar, "topBar");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1374211054);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(topBar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(content)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        int i5 = i2;
        if ((i5 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1374211054, i5, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsScaffold (Scaffold.kt:10)");
            }
            FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
            interfaceC32720Et02 = mo89518u;
            C36604Vi5.m79545a(null, null, topBar, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, financialConnectionsTheme.getColors(mo89518u, 6).m116461getBackgroundSurface0d7_KjU(), financialConnectionsTheme.getColors(mo89518u, 6).m116473getTextPrimary0d7_KjU(), content, interfaceC32720Et02, (i5 << 6) & 896, (i5 << 18) & 29360128, 32763);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ScaffoldKt$FinancialConnectionsScaffold$1(topBar, content, i));
        }
    }
}
