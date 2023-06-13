package com.stripe.android.financialconnections.p041ui.theme;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;", "", "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;", "getColors", "(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;", "colors", "Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;", "getTypography", "(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;", "typography", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Theme.kt\ncom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,205:1\n76#2:206\n76#2:207\n*S KotlinDebug\n*F\n+ 1 Theme.kt\ncom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme\n*L\n178#1:206\n181#1:207\n*E\n"})
/* renamed from: com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme */
/* loaded from: classes7.dex */
public final class FinancialConnectionsTheme {
    public static final FinancialConnectionsTheme INSTANCE = new FinancialConnectionsTheme();

    private FinancialConnectionsTheme() {
    }

    @JvmName(name = "getColors")
    public final FinancialConnectionsColors getColors(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        U94 u94;
        interfaceC32720Et0.mo89638F(-2124194779);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-2124194779, i, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme.<get-colors> (Theme.kt:177)");
        }
        u94 = ThemeKt.LocalFinancialConnectionsColors;
        FinancialConnectionsColors financialConnectionsColors = (FinancialConnectionsColors) interfaceC32720Et0.mo89572c(u94);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return financialConnectionsColors;
    }

    @JvmName(name = "getTypography")
    public final FinancialConnectionsTypography getTypography(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        U94 u94;
        interfaceC32720Et0.mo89638F(1649734758);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1649734758, i, -1, "com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme.<get-typography> (Theme.kt:180)");
        }
        u94 = ThemeKt.LocalFinancialConnectionsTypography;
        FinancialConnectionsTypography financialConnectionsTypography = (FinancialConnectionsTypography) interfaceC32720Et0.mo89572c(u94);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return financialConnectionsTypography;
    }
}
