package com.stripe.android.link.p042ui;

import com.stripe.android.link.C18975R;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.text.HtmlKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\f\u0010\t\u001a\u00020\b*\u00020\bH\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\n"}, m28432d2 = {"LgV2;", "modifier", "Lr06;", "textAlign", "", "LinkTerms-5stqomU", "(LgV2;ILEt0;II)V", "LinkTerms", "", "replaceHyperlinks", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.link.ui.LinkTermsKt */
/* loaded from: classes7.dex */
public final class LinkTermsKt {
    /* renamed from: LinkTerms-5stqomU  reason: not valid java name */
    public static final void m116553LinkTerms5stqomU(InterfaceC41563gV2 interfaceC41563gV2, int i, InterfaceC32720Et0 interfaceC32720Et0, int i2, int i3) {
        Object obj;
        int i4;
        int i5;
        InterfaceC41563gV2 interfaceC41563gV22;
        int i6;
        InterfaceC41563gV2 interfaceC41563gV23;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i7;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1213797712);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            obj = interfaceC41563gV2;
        } else if ((i2 & 14) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            obj = interfaceC41563gV2;
            i4 = i2;
        }
        if ((i4 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            i7 = i;
            interfaceC32720Et02 = mo89518u;
        } else {
            mo89518u.mo89626J();
            if ((i2 & 1) != 0 && !mo89518u.mo89545l()) {
                mo89518u.mo89548k();
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                }
                i6 = i;
                interfaceC41563gV23 = obj;
            } else {
                if (i8 != 0) {
                    interfaceC41563gV22 = InterfaceC41563gV2.f82354b0;
                } else {
                    interfaceC41563gV22 = obj;
                }
                if ((i3 & 2) != 0) {
                    i4 &= -113;
                    interfaceC41563gV23 = interfaceC41563gV22;
                    i6 = C47801r06.f106195b.m16678a();
                } else {
                    i6 = i;
                    interfaceC41563gV23 = interfaceC41563gV22;
                }
            }
            mo89518u.mo89650B();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1213797712, i4, -1, "com.stripe.android.link.ui.LinkTerms (LinkTerms.kt:15)");
            }
            String replaceHyperlinks = replaceHyperlinks(C40946fS5.m41310c(C18975R.string.sign_up_terms, mo89518u, 0));
            TM2 tm2 = TM2.f35372a;
            int i9 = TM2.f35373b;
            interfaceC32720Et02 = mo89518u;
            HtmlKt.m116769Htmlm4MizFo(replaceHyperlinks, interfaceC41563gV23, null, StripeThemeKt.getStripeColors(tm2, mo89518u, i9).m116699getPlaceholderText0d7_KjU(), tm2.m83729c(mo89518u, i9).m104957k(), false, new GN5(tm2.m83731a(mo89518u, i9).m94900j(), 0L, (C33918Jw1) null, (C32748Ew1) null, (C32982Fw1) null, (AbstractC44199kw1) null, (String) null, 0L, (C3091HE) null, (L16) null, (C50119uv2) null, 0L, (R06) null, (C35335Px5) null, 16382, (DefaultConstructorMarker) null), 0, null, mo89518u, (i4 << 3) & 112, 420);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            obj = interfaceC41563gV23;
            i7 = i6;
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new LinkTermsKt$LinkTerms$1(obj, i7, i2, i3));
        }
    }

    private static final String replaceHyperlinks(String str) {
        String replace$default;
        String replace$default2;
        String replace$default3;
        String replace$default4;
        replace$default = StringsKt__StringsJVMKt.replace$default(str, "<terms>", "<a href=\"https://link.co/terms\">", false, 4, (Object) null);
        replace$default2 = StringsKt__StringsJVMKt.replace$default(replace$default, "</terms>", "</a>", false, 4, (Object) null);
        replace$default3 = StringsKt__StringsJVMKt.replace$default(replace$default2, "<privacy>", "<a href=\"https://link.co/privacy\">", false, 4, (Object) null);
        replace$default4 = StringsKt__StringsJVMKt.replace$default(replace$default3, "</privacy>", "</a>", false, 4, (Object) null);
        return replace$default4;
    }
}
