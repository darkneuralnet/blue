package com.stripe.android.link.p042ui;

import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.p042ui.ErrorTextStyle;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.p049ui.core.elements.HyperlinkedTextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"", "ErrorTextPreview", "(LEt0;I)V", "", Entry.TYPE_TEXT, "LgV2;", "modifier", "Lcom/stripe/android/link/ui/ErrorTextStyle;", "style", "ErrorText", "(Ljava/lang/String;LgV2;Lcom/stripe/android/link/ui/ErrorTextStyle;LEt0;II)V", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nErrorText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorText.kt\ncom/stripe/android/link/ui/ErrorTextKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,95:1\n75#2,6:96\n81#2:128\n85#2:133\n75#3:102\n76#3,11:104\n89#3:132\n76#4:103\n460#5,13:115\n473#5,3:129\n*S KotlinDebug\n*F\n+ 1 ErrorText.kt\ncom/stripe/android/link/ui/ErrorTextKt\n*L\n74#1:96,6\n74#1:128\n74#1:133\n74#1:102\n74#1:104,11\n74#1:132\n74#1:103\n74#1:115,13\n74#1:129,3\n*E\n"})
/* renamed from: com.stripe.android.link.ui.ErrorTextKt */
/* loaded from: classes7.dex */
public final class ErrorTextKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErrorText(String text, InterfaceC41563gV2 interfaceC41563gV2, ErrorTextStyle errorTextStyle, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        Object obj2;
        int i7;
        InterfaceC41563gV2.C20912a c20912a;
        ErrorTextStyle.Medium medium;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC41563gV2 interfaceC41563gV22;
        ErrorTextStyle errorTextStyle2;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(text, "text");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-779530573);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(text)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            i6 = i2 & 4;
            if (i6 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj2 = errorTextStyle;
                if (mo89518u.mo89539n(obj2)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
                if ((i3 & 731) != 146 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    interfaceC41563gV22 = obj;
                    errorTextStyle2 = obj2;
                    interfaceC32720Et02 = mo89518u;
                } else {
                    if (i8 != 0) {
                        c20912a = InterfaceC41563gV2.f82354b0;
                    } else {
                        c20912a = obj;
                    }
                    if (i6 != 0) {
                        medium = ErrorTextStyle.Medium.INSTANCE;
                    } else {
                        medium = obj2;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(-779530573, i3, -1, "com.stripe.android.link.ui.ErrorText (ErrorText.kt:68)");
                    }
                    TM2 tm2 = TM2.f35372a;
                    int i9 = TM2.f35373b;
                    InterfaceC41563gV2 m62125c = C13342bw.m62125c(c20912a, ThemeKt.getLinkColors(tm2, mo89518u, i9).m116536getErrorComponentBackground0d7_KjU(), medium.getShape());
                    InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
                    mo89518u.mo89638F(693286680);
                    InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h, mo89518u, 48);
                    mo89518u.mo89638F(-1323940314);
                    InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                    EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                    InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                    InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                    Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                    Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m62125c);
                    if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                        C52468yt0.m2335c();
                    }
                    mo89518u.mo89557h();
                    if (mo89518u.mo89521t()) {
                        mo89518u.mo89617M(m113415a);
                    } else {
                        mo89518u.mo89566e();
                    }
                    mo89518u.mo89620L();
                    InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
                    C38680bf6.m64191b(m64192a, m74813a, c0757a.m113412d());
                    C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                    C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                    C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                    mo89518u.mo89530q();
                    m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                    mo89518u.mo89638F(2058660585);
                    mo89518u.mo89638F(-678309503);
                    C38066ad5 c38066ad5 = C38066ad5.f50835a;
                    mo89518u.mo89638F(-1347914033);
                    DP1.m110533b(C46748pE3.m19793d(C18975R.C18976drawable.ic_link_error, mo89518u, 0), null, medium.getIconModifier(), ThemeKt.getLinkColors(tm2, mo89518u, i9).m116537getErrorText0d7_KjU(), mo89518u, 56, 0);
                    InterfaceC41563gV2 interfaceC41563gV23 = c20912a;
                    interfaceC32720Et02 = mo89518u;
                    HyperlinkedTextKt.m116663HyperlinkedTextcf5BqRc(text, medium.getTextModifier(), ThemeKt.getLinkColors(tm2, mo89518u, i9).m116537getErrorText0d7_KjU(), medium.getTextStyle(), mo89518u, i3 & 14, 0);
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89563f();
                    interfaceC32720Et02.mo89605Q();
                    interfaceC32720Et02.mo89605Q();
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    interfaceC41563gV22 = interfaceC41563gV23;
                    errorTextStyle2 = medium;
                }
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new ErrorTextKt$ErrorText$2(text, interfaceC41563gV22, errorTextStyle2, i, i2));
                    return;
                }
                return;
            }
            obj2 = errorTextStyle;
            if ((i3 & 731) != 146) {
            }
            if (i8 != 0) {
            }
            if (i6 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            TM2 tm22 = TM2.f35372a;
            int i92 = TM2.f35373b;
            InterfaceC41563gV2 m62125c2 = C13342bw.m62125c(c20912a, ThemeKt.getLinkColors(tm22, mo89518u, i92).m116536getErrorComponentBackground0d7_KjU(), medium.getShape());
            InterfaceC4360K9.InterfaceC4363c m99138h2 = InterfaceC4360K9.f19170a.m99138h();
            mo89518u.mo89638F(693286680);
            InterfaceC51579xO2 m74813a2 = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h2, mo89518u, 48);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m62125c2);
            if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            }
            mo89518u.mo89557h();
            if (mo89518u.mo89521t()) {
            }
            mo89518u.mo89620L();
            InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
            C38680bf6.m64191b(m64192a2, m74813a2, c0757a2.m113412d());
            C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a2.m113414b());
            C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a2.m113413c());
            C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a2.m113410f());
            mo89518u.mo89530q();
            m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-678309503);
            C38066ad5 c38066ad52 = C38066ad5.f50835a;
            mo89518u.mo89638F(-1347914033);
            DP1.m110533b(C46748pE3.m19793d(C18975R.C18976drawable.ic_link_error, mo89518u, 0), null, medium.getIconModifier(), ThemeKt.getLinkColors(tm22, mo89518u, i92).m116537getErrorText0d7_KjU(), mo89518u, 56, 0);
            InterfaceC41563gV2 interfaceC41563gV232 = c20912a;
            interfaceC32720Et02 = mo89518u;
            HyperlinkedTextKt.m116663HyperlinkedTextcf5BqRc(text, medium.getTextModifier(), ThemeKt.getLinkColors(tm22, mo89518u, i92).m116537getErrorText0d7_KjU(), medium.getTextStyle(), mo89518u, i3 & 14, 0);
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89563f();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV22 = interfaceC41563gV232;
            errorTextStyle2 = medium;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w != null) {
            }
        }
        obj = interfaceC41563gV2;
        i6 = i2 & 4;
        if (i6 == 0) {
        }
        obj2 = errorTextStyle;
        if ((i3 & 731) != 146) {
        }
        if (i8 != 0) {
        }
        if (i6 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        TM2 tm222 = TM2.f35372a;
        int i922 = TM2.f35373b;
        InterfaceC41563gV2 m62125c22 = C13342bw.m62125c(c20912a, ThemeKt.getLinkColors(tm222, mo89518u, i922).m116536getErrorComponentBackground0d7_KjU(), medium.getShape());
        InterfaceC4360K9.InterfaceC4363c m99138h22 = InterfaceC4360K9.f19170a.m99138h();
        mo89518u.mo89638F(693286680);
        InterfaceC51579xO2 m74813a22 = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h22, mo89518u, 48);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g0122 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm222 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq622 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a22 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a22 = c0757a22.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a22 = C31723Am2.m115273a(m62125c22);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (mo89518u.mo89521t()) {
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a22 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a22, m74813a22, c0757a22.m113412d());
        C38680bf6.m64191b(m64192a22, interfaceC41273g0122, c0757a22.m113414b());
        C38680bf6.m64191b(m64192a22, enumC47065pm222, c0757a22.m113413c());
        C38680bf6.m64191b(m64192a22, interfaceC33869Jq622, c0757a22.m113410f());
        mo89518u.mo89530q();
        m115273a22.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-678309503);
        C38066ad5 c38066ad522 = C38066ad5.f50835a;
        mo89518u.mo89638F(-1347914033);
        DP1.m110533b(C46748pE3.m19793d(C18975R.C18976drawable.ic_link_error, mo89518u, 0), null, medium.getIconModifier(), ThemeKt.getLinkColors(tm222, mo89518u, i922).m116537getErrorText0d7_KjU(), mo89518u, 56, 0);
        InterfaceC41563gV2 interfaceC41563gV2322 = c20912a;
        interfaceC32720Et02 = mo89518u;
        HyperlinkedTextKt.m116663HyperlinkedTextcf5BqRc(text, medium.getTextModifier(), ThemeKt.getLinkColors(tm222, mo89518u, i922).m116537getErrorText0d7_KjU(), medium.getTextStyle(), mo89518u, i3 & 14, 0);
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89563f();
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV22 = interfaceC41563gV2322;
        errorTextStyle2 = medium;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ErrorTextPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1782541725);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1782541725, i, -1, "com.stripe.android.link.ui.ErrorTextPreview (ErrorText.kt:63)");
            }
            ErrorText("Test error message", null, null, mo89518u, 6, 6);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ErrorTextKt$ErrorTextPreview$1(i));
        }
    }
}
