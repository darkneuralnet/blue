package com.stripe.android.financialconnections.p041ui;

import com.stripe.android.financialconnections.p041ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"", "reducedBrandingOverride", "Lkotlin/Function0;", "", "content", "FinancialConnectionsPreview", "(ZLkotlin/jvm/functions/Function2;LEt0;II)V", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.ui.CompositionLocalKt */
/* loaded from: classes7.dex */
public final class CompositionLocalKt {
    public static final void FinancialConnectionsPreview(boolean z, Function2<? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(967078932);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(content)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (i6 != 0) {
                z = false;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(967078932, i3, -1, "com.stripe.android.financialconnections.ui.FinancialConnectionsPreview (CompositionLocal.kt:18)");
            }
            ThemeKt.FinancialConnectionsTheme(C43575jt0.m29791b(mo89518u, -2034057758, true, new CompositionLocalKt$FinancialConnectionsPreview$1(PY2.m90122e(new AbstractC39507d13[0], mo89518u, 8), z, content, i3)), mo89518u, 6);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new CompositionLocalKt$FinancialConnectionsPreview$2(z, content, i, i2));
        }
    }
}
