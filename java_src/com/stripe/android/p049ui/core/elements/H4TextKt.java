package com.stripe.android.p049ui.core.elements;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"", Entry.TYPE_TEXT, "LgV2;", "modifier", "", "H4Text", "(Ljava/lang/String;LgV2;LEt0;II)V", "payments-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.H4TextKt */
/* loaded from: classes7.dex */
public final class H4TextKt {
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void H4Text(String text, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        InterfaceC41563gV2.C20912a c20912a;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(text, "text");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1723562927);
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
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            i6 = i3;
            if ((i6 & 91) != 18 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                interfaceC32720Et02 = mo89518u;
            } else {
                if (i7 == 0) {
                    c20912a = InterfaceC41563gV2.f82354b0;
                } else {
                    c20912a = obj;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1723562927, i6, -1, "com.stripe.android.ui.core.elements.H4Text (H4Text.kt:10)");
                }
                TM2 tm2 = TM2.f35372a;
                int i8 = TM2.f35373b;
                interfaceC32720Et02 = mo89518u;
                C38909c26.m62000e(text, c20912a, tm2.m83731a(mo89518u, i8).m94901i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, tm2.m83729c(mo89518u, i8).m104960h(), interfaceC32720Et02, (i6 & 14) | (i6 & 112), 0, 32760);
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                obj = c20912a;
            }
            mo89512w = interfaceC32720Et02.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new H4TextKt$H4Text$1(text, obj, i, i2));
                return;
            }
            return;
        }
        obj = interfaceC41563gV2;
        i6 = i3;
        if ((i6 & 91) != 18) {
        }
        if (i7 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        TM2 tm22 = TM2.f35372a;
        int i82 = TM2.f35373b;
        interfaceC32720Et02 = mo89518u;
        C38909c26.m62000e(text, c20912a, tm22.m83731a(mo89518u, i82).m94901i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, tm22.m83729c(mo89518u, i82).m104960h(), interfaceC32720Et02, (i6 & 14) | (i6 & 112), 0, 32760);
        if (C35528Qt0.m87827O()) {
        }
        obj = c20912a;
        mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
        }
    }
}
