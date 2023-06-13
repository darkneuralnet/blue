package com.stripe.android.financialconnections.p041ui.components;

import androidx.activity.OnBackPressedDispatcher;
import com.stripe.android.financialconnections.p041ui.CompositionLocalKt;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\r\u0010\f\"\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u000e8@X\u0080\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00118@X\u0080\u0004ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, m28432d2 = {"", "hideStripeLogo", "Lk61;", "elevation", "showBack", "Lkotlin/Function0;", "", "onCloseClick", "FinancialConnectionsTopAppBar-DzVHIIc", "(ZFZLkotlin/jvm/functions/Function0;LEt0;II)V", "FinancialConnectionsTopAppBar", "TopAppBarNoStripeLogoPreview", "(LEt0;I)V", "FinancialConnectionsTopAppBarPreview", "LXp5;", "getElevation", "(LXp5;)F", "LCo2;", "(LCo2;)F", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTopAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopAppBar.kt\ncom/stripe/android/financialconnections/ui/components/TopAppBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,113:1\n76#2:114\n76#2:116\n154#3:115\n154#3:117\n174#3:118\n*S KotlinDebug\n*F\n+ 1 TopAppBar.kt\ncom/stripe/android/financialconnections/ui/components/TopAppBarKt\n*L\n28#1:114\n35#1:116\n29#1:115\n80#1:117\n90#1:118\n*E\n"})
/* renamed from: com.stripe.android.financialconnections.ui.components.TopAppBarKt */
/* loaded from: classes7.dex */
public final class TopAppBarKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* renamed from: FinancialConnectionsTopAppBar-DzVHIIc  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m116437FinancialConnectionsTopAppBarDzVHIIc(boolean z, float f, boolean z2, Function0<Unit> onCloseClick, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        boolean z3;
        int i3;
        float f2;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        float f3;
        boolean z5;
        int i8;
        float f4;
        InterfaceC39270cf3 m31645a;
        OnBackPressedDispatcher onBackPressedDispatcher;
        OY2 oy2;
        Function2<InterfaceC32720Et0, Integer, Unit> m116425getLambda2$financial_connections_release;
        InterfaceC42389ht0 interfaceC42389ht0;
        InterfaceC36874Wm5 mo89512w;
        int i9;
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1942829731);
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                z3 = z;
                if (mo89518u.mo89536o(z3)) {
                    i9 = 4;
                    i3 = i9 | i;
                }
            } else {
                z3 = z;
            }
            i9 = 2;
            i3 = i9 | i;
        } else {
            z3 = z;
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            f2 = f;
            if (mo89518u.mo89533p(f2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
            i5 = i2 & 4;
            if (i5 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                z4 = z2;
                if (mo89518u.mo89536o(z4)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i3 |= i6;
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    if (mo89518u.mo89539n(onCloseClick)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i3 & 5851) != 1170 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    f4 = f2;
                } else {
                    mo89518u.mo89626J();
                    if ((i & 1) == 0 && !mo89518u.mo89545l()) {
                        mo89518u.mo89548k();
                        if ((i2 & 1) != 0) {
                            i3 &= -15;
                        }
                        i8 = i3;
                        f4 = f2;
                        z5 = z4;
                    } else {
                        if ((i2 & 1) != 0) {
                            z3 = ((Boolean) mo89518u.mo89572c(FinancialConnectionsSheetNativeActivityKt.getLocalReducedBranding())).booleanValue();
                            i3 &= -15;
                        }
                        if (i10 != 0) {
                            f3 = C43705k61.m29303g(0);
                        } else {
                            f3 = f2;
                        }
                        if (i5 != 0) {
                            z5 = true;
                        } else {
                            z5 = z4;
                        }
                        float f5 = f3;
                        i8 = i3;
                        f4 = f5;
                    }
                    mo89518u.mo89650B();
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(-1942829731, i8, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBar (TopAppBar.kt:26)");
                    }
                    m31645a = C43004iv2.f91709a.m31645a(mo89518u, C43004iv2.f91711c);
                    if (m31645a != null) {
                        onBackPressedDispatcher = m31645a.getOnBackPressedDispatcher();
                    } else {
                        onBackPressedDispatcher = null;
                    }
                    oy2 = (OY2) mo89518u.mo89572c(FinancialConnectionsSheetNativeActivityKt.getLocalNavHostController());
                    ComposableSingletons$TopAppBarKt composableSingletons$TopAppBarKt = ComposableSingletons$TopAppBarKt.INSTANCE;
                    if (z3) {
                        m116425getLambda2$financial_connections_release = composableSingletons$TopAppBarKt.m116424getLambda1$financial_connections_release();
                    } else {
                        m116425getLambda2$financial_connections_release = composableSingletons$TopAppBarKt.m116425getLambda2$financial_connections_release();
                    }
                    if (oy2.m110256F() == null && z5) {
                        interfaceC42389ht0 = C43575jt0.m29791b(mo89518u, -1359544719, true, new TopAppBarKt$FinancialConnectionsTopAppBar$1(onBackPressedDispatcher));
                    } else {
                        interfaceC42389ht0 = null;
                    }
                    FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
                    int i11 = ((i8 << 15) & 3670016) | 3072;
                    C3727Ih.m101812c(m116425getLambda2$financial_connections_release, null, interfaceC42389ht0, C43575jt0.m29791b(mo89518u, -1955077106, true, new TopAppBarKt$FinancialConnectionsTopAppBar$2(onCloseClick, i8)), financialConnectionsTheme.getColors(mo89518u, 6).m116476getTextWhite0d7_KjU(), financialConnectionsTheme.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), f4, mo89518u, i11, 2);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    z4 = z5;
                }
                mo89512w = mo89518u.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new TopAppBarKt$FinancialConnectionsTopAppBar$3(z3, f4, z4, onCloseClick, i, i2));
                    return;
                }
                return;
            }
            z4 = z2;
            if ((i2 & 8) != 0) {
            }
            if ((i3 & 5851) != 1170) {
            }
            mo89518u.mo89626J();
            if ((i & 1) == 0) {
            }
            if ((i2 & 1) != 0) {
            }
            if (i10 != 0) {
            }
            if (i5 != 0) {
            }
            float f52 = f3;
            i8 = i3;
            f4 = f52;
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
            }
            m31645a = C43004iv2.f91709a.m31645a(mo89518u, C43004iv2.f91711c);
            if (m31645a != null) {
            }
            oy2 = (OY2) mo89518u.mo89572c(FinancialConnectionsSheetNativeActivityKt.getLocalNavHostController());
            ComposableSingletons$TopAppBarKt composableSingletons$TopAppBarKt2 = ComposableSingletons$TopAppBarKt.INSTANCE;
            if (z3) {
            }
            if (oy2.m110256F() == null) {
            }
            interfaceC42389ht0 = null;
            FinancialConnectionsTheme financialConnectionsTheme2 = FinancialConnectionsTheme.INSTANCE;
            int i112 = ((i8 << 15) & 3670016) | 3072;
            C3727Ih.m101812c(m116425getLambda2$financial_connections_release, null, interfaceC42389ht0, C43575jt0.m29791b(mo89518u, -1955077106, true, new TopAppBarKt$FinancialConnectionsTopAppBar$2(onCloseClick, i8)), financialConnectionsTheme2.getColors(mo89518u, 6).m116476getTextWhite0d7_KjU(), financialConnectionsTheme2.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), f4, mo89518u, i112, 2);
            if (C35528Qt0.m87827O()) {
            }
            z4 = z5;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w != null) {
            }
        }
        f2 = f;
        i5 = i2 & 4;
        if (i5 == 0) {
        }
        z4 = z2;
        if ((i2 & 8) != 0) {
        }
        if ((i3 & 5851) != 1170) {
        }
        mo89518u.mo89626J();
        if ((i & 1) == 0) {
        }
        if ((i2 & 1) != 0) {
        }
        if (i10 != 0) {
        }
        if (i5 != 0) {
        }
        float f522 = f3;
        i8 = i3;
        f4 = f522;
        mo89518u.mo89650B();
        if (C35528Qt0.m87827O()) {
        }
        m31645a = C43004iv2.f91709a.m31645a(mo89518u, C43004iv2.f91711c);
        if (m31645a != null) {
        }
        oy2 = (OY2) mo89518u.mo89572c(FinancialConnectionsSheetNativeActivityKt.getLocalNavHostController());
        ComposableSingletons$TopAppBarKt composableSingletons$TopAppBarKt22 = ComposableSingletons$TopAppBarKt.INSTANCE;
        if (z3) {
        }
        if (oy2.m110256F() == null) {
        }
        interfaceC42389ht0 = null;
        FinancialConnectionsTheme financialConnectionsTheme22 = FinancialConnectionsTheme.INSTANCE;
        int i1122 = ((i8 << 15) & 3670016) | 3072;
        C3727Ih.m101812c(m116425getLambda2$financial_connections_release, null, interfaceC42389ht0, C43575jt0.m29791b(mo89518u, -1955077106, true, new TopAppBarKt$FinancialConnectionsTopAppBar$2(onCloseClick, i8)), financialConnectionsTheme22.getColors(mo89518u, 6).m116476getTextWhite0d7_KjU(), financialConnectionsTheme22.getColors(mo89518u, 6).m116469getTextBrand0d7_KjU(), f4, mo89518u, i1122, 2);
        if (C35528Qt0.m87827O()) {
        }
        z4 = z5;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
        }
    }

    public static final void FinancialConnectionsTopAppBarPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1980947331);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1980947331, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsTopAppBarPreview (TopAppBar.kt:105)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$TopAppBarKt.INSTANCE.m116429getLambda6$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new TopAppBarKt$FinancialConnectionsTopAppBarPreview$1(i));
        }
    }

    public static final void TopAppBarNoStripeLogoPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(2059271070);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(2059271070, i, -1, "com.stripe.android.financialconnections.ui.components.TopAppBarNoStripeLogoPreview (TopAppBar.kt:97)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$TopAppBarKt.INSTANCE.m116428getLambda5$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new TopAppBarKt$TopAppBarNoStripeLogoPreview$1(i));
        }
    }

    public static final float getElevation(C37135Xp5 c37135Xp5) {
        Comparable minOf;
        Intrinsics.checkNotNullParameter(c37135Xp5, "<this>");
        minOf = ComparisonsKt___ComparisonsJvmKt.minOf(C43705k61.m29306d(C43705k61.m29303g(c37135Xp5.m76237m())), C43705k61.m29306d(C3207Hh.f13756a.m103531b()));
        return ((C43705k61) minOf).m29298l();
    }

    public static final float getElevation(C32209Co2 c32209Co2) {
        Comparable minOf;
        Intrinsics.checkNotNullParameter(c32209Co2, "<this>");
        if (c32209Co2.m111538o() == 0) {
            minOf = ComparisonsKt___ComparisonsJvmKt.minOf(C43705k61.m29306d(C43705k61.m29303g(c32209Co2.m111537p())), C43705k61.m29306d(C3207Hh.f13756a.m103531b()));
            return ((C43705k61) minOf).m29298l();
        }
        return C3207Hh.f13756a.m103531b();
    }
}
