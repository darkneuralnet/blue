package com.stripe.android.uicore.elements.menu;

import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aA\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m28432d2 = {"", "checked", "Lkotlin/Function1;", "", "onCheckedChange", "LgV2;", "modifier", "enabled", "Checkbox", "(ZLkotlin/jvm/functions/Function1;LgV2;ZLEt0;II)V", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class CheckboxKt {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Checkbox(boolean z, Function1<? super Boolean, Unit> function1, InterfaceC41563gV2 interfaceC41563gV2, boolean z2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Object obj;
        int i7;
        int i8;
        boolean z3;
        int i9;
        InterfaceC41563gV2.C20912a c20912a;
        boolean z4;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC36874Wm5 mo89512w;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-340640888);
        if ((i2 & 1) != 0) {
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
            if (mo89518u.mo89539n(function1)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            i6 = i2 & 4;
            if (i6 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                obj = interfaceC41563gV2;
                if (mo89518u.mo89539n(obj)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i3 |= i7;
                i8 = i2 & 8;
                if (i8 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    z3 = z2;
                    if (mo89518u.mo89536o(z3)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i3 |= i9;
                    if ((i3 & 5851) != 1170 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                        interfaceC41563gV22 = obj;
                    } else {
                        if (i6 == 0) {
                            c20912a = InterfaceC41563gV2.f82354b0;
                        } else {
                            c20912a = obj;
                        }
                        if (i8 == 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87816Z(-340640888, i3, -1, "com.stripe.android.uicore.elements.menu.Checkbox (Checkbox.kt:11)");
                        }
                        C48801si0 c48801si0 = C48801si0.f109138a;
                        TM2 tm2 = TM2.f35372a;
                        int i10 = TM2.f35373b;
                        C49394ti0.m11902a(z, function1, c20912a, z4, null, c48801si0.m13807a(tm2.m83731a(mo89518u, i10).m94900j(), StripeThemeKt.getStripeColors(tm2, mo89518u, i10).m116700getSubtitle0d7_KjU(), tm2.m83731a(mo89518u, i10).m94896n(), 0L, 0L, mo89518u, C48801si0.f109139b << 15, 24), mo89518u, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168), 16);
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                        interfaceC41563gV22 = c20912a;
                        z3 = z4;
                    }
                    mo89512w = mo89518u.mo89512w();
                    if (mo89512w == null) {
                        mo89512w.mo20405a(new CheckboxKt$Checkbox$1(z, function1, interfaceC41563gV22, z3, i, i2));
                        return;
                    }
                    return;
                }
                z3 = z2;
                if ((i3 & 5851) != 1170) {
                }
                if (i6 == 0) {
                }
                if (i8 == 0) {
                }
                if (C35528Qt0.m87827O()) {
                }
                C48801si0 c48801si02 = C48801si0.f109138a;
                TM2 tm22 = TM2.f35372a;
                int i102 = TM2.f35373b;
                C49394ti0.m11902a(z, function1, c20912a, z4, null, c48801si02.m13807a(tm22.m83731a(mo89518u, i102).m94900j(), StripeThemeKt.getStripeColors(tm22, mo89518u, i102).m116700getSubtitle0d7_KjU(), tm22.m83731a(mo89518u, i102).m94896n(), 0L, 0L, mo89518u, C48801si0.f109139b << 15, 24), mo89518u, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168), 16);
                if (C35528Qt0.m87827O()) {
                }
                interfaceC41563gV22 = c20912a;
                z3 = z4;
                mo89512w = mo89518u.mo89512w();
                if (mo89512w == null) {
                }
            }
            obj = interfaceC41563gV2;
            i8 = i2 & 8;
            if (i8 != 0) {
            }
            z3 = z2;
            if ((i3 & 5851) != 1170) {
            }
            if (i6 == 0) {
            }
            if (i8 == 0) {
            }
            if (C35528Qt0.m87827O()) {
            }
            C48801si0 c48801si022 = C48801si0.f109138a;
            TM2 tm222 = TM2.f35372a;
            int i1022 = TM2.f35373b;
            C49394ti0.m11902a(z, function1, c20912a, z4, null, c48801si022.m13807a(tm222.m83731a(mo89518u, i1022).m94900j(), StripeThemeKt.getStripeColors(tm222, mo89518u, i1022).m116700getSubtitle0d7_KjU(), tm222.m83731a(mo89518u, i1022).m94896n(), 0L, 0L, mo89518u, C48801si0.f109139b << 15, 24), mo89518u, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168), 16);
            if (C35528Qt0.m87827O()) {
            }
            interfaceC41563gV22 = c20912a;
            z3 = z4;
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
            }
        }
        i6 = i2 & 4;
        if (i6 == 0) {
        }
        obj = interfaceC41563gV2;
        i8 = i2 & 8;
        if (i8 != 0) {
        }
        z3 = z2;
        if ((i3 & 5851) != 1170) {
        }
        if (i6 == 0) {
        }
        if (i8 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        C48801si0 c48801si0222 = C48801si0.f109138a;
        TM2 tm2222 = TM2.f35372a;
        int i10222 = TM2.f35373b;
        C49394ti0.m11902a(z, function1, c20912a, z4, null, c48801si0222.m13807a(tm2222.m83731a(mo89518u, i10222).m94900j(), StripeThemeKt.getStripeColors(tm2222, mo89518u, i10222).m116700getSubtitle0d7_KjU(), tm2222.m83731a(mo89518u, i10222).m94896n(), 0L, 0L, mo89518u, C48801si0.f109139b << 15, 24), mo89518u, (i3 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168), 16);
        if (C35528Qt0.m87827O()) {
        }
        interfaceC41563gV22 = c20912a;
        z3 = z4;
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }
}
