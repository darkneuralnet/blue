package com.stripe.android.uicore.elements;

import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"", Entry.TYPE_TEXT, "LgV2;", "modifier", "", "enabled", "", "FormLabel", "(Ljava/lang/String;LgV2;ZLEt0;II)V", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FormLabelKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FormLabel(String text, InterfaceC41563gV2 interfaceC41563gV2, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        InterfaceC41563gV2.C20912a c20912a;
        boolean z3;
        long m18743m;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC41563gV2 interfaceC41563gV22;
        boolean z4;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(text, "text");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(614662995);
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
        int i9 = i2 & 2;
        if (i9 != 0) {
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
                z2 = z;
                if (mo89518u.mo89536o(z2)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
                i8 = i3;
                if ((i8 & 731) != 146 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    interfaceC32720Et02 = mo89518u;
                    interfaceC41563gV22 = obj;
                    z4 = z2;
                } else {
                    if (i9 != 0) {
                        c20912a = InterfaceC41563gV2.f82354b0;
                    } else {
                        c20912a = obj;
                    }
                    if (i6 != 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87816Z(614662995, i8, -1, "com.stripe.android.uicore.elements.FormLabel (FormLabel.kt:10)");
                    }
                    TM2 tm2 = TM2.f35372a;
                    int i10 = TM2.f35373b;
                    long m116699getPlaceholderText0d7_KjU = StripeThemeKt.getStripeColors(tm2, mo89518u, i10).m116699getPlaceholderText0d7_KjU();
                    if (z3) {
                        m18743m = m116699getPlaceholderText0d7_KjU;
                    } else {
                        m18743m = C47063pm0.m18743m(m116699getPlaceholderText0d7_KjU, C36986Wz0.f42427a.m77588b(mo89518u, C36986Wz0.f42428b), 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    interfaceC32720Et02 = mo89518u;
                    C38909c26.m62000e(text, c20912a, m18743m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, tm2.m83729c(mo89518u, i10).m104957k(), interfaceC32720Et02, (i8 & 14) | (i8 & 112), 0, 32760);
                    if (C35528Qt0.m87827O()) {
                        C35528Qt0.m87817Y();
                    }
                    interfaceC41563gV22 = c20912a;
                    z4 = z3;
                }
                mo89512w = interfaceC32720Et02.mo89512w();
                if (mo89512w != null) {
                    mo89512w.mo20405a(new FormLabelKt$FormLabel$1(text, interfaceC41563gV22, z4, i, i2));
                    return;
                }
                return;
            }
            z2 = z;
            i8 = i3;
            if ((i8 & 731) != 146) {
            }
            if (i9 != 0) {
            }
            if (i6 != 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            TM2 tm22 = TM2.f35372a;
            int i102 = TM2.f35373b;
            long m116699getPlaceholderText0d7_KjU2 = StripeThemeKt.getStripeColors(tm22, mo89518u, i102).m116699getPlaceholderText0d7_KjU();
            if (z3) {
            }
            interfaceC32720Et02 = mo89518u;
            C38909c26.m62000e(text, c20912a, m18743m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, tm22.m83729c(mo89518u, i102).m104957k(), interfaceC32720Et02, (i8 & 14) | (i8 & 112), 0, 32760);
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV22 = c20912a;
            z4 = z3;
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w != null) {
            }
        }
        obj = interfaceC41563gV2;
        i6 = i2 & 4;
        if (i6 == 0) {
        }
        z2 = z;
        i8 = i3;
        if ((i8 & 731) != 146) {
        }
        if (i9 != 0) {
        }
        if (i6 != 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        TM2 tm222 = TM2.f35372a;
        int i1022 = TM2.f35373b;
        long m116699getPlaceholderText0d7_KjU22 = StripeThemeKt.getStripeColors(tm222, mo89518u, i1022).m116699getPlaceholderText0d7_KjU();
        if (z3) {
        }
        interfaceC32720Et02 = mo89518u;
        C38909c26.m62000e(text, c20912a, m18743m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, tm222.m83729c(mo89518u, i1022).m104957k(), interfaceC32720Et02, (i8 & 14) | (i8 & 112), 0, 32760);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV22 = c20912a;
        z4 = z3;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
        }
    }
}
