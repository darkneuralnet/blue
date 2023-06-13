package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aA\u0010\r\u001a\u00020\n2\n\b\u0003\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"", "icon", "", Entry.TYPE_TEXT, "Lpm0;", "textColor", "LgV2;", "modifier", "", "isEnabled", "", "LpmSelectorText-T042LqI", "(Ljava/lang/Integer;Ljava/lang/String;JLgV2;ZLEt0;II)V", "LpmSelectorText", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLpmSelectorText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LpmSelectorText.kt\ncom/stripe/android/paymentsheet/ui/LpmSelectorTextKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,46:1\n75#2,6:47\n81#2:79\n85#2:85\n75#3:53\n76#3,11:55\n89#3:84\n76#4:54\n460#5,13:66\n473#5,3:81\n154#6:80\n*S KotlinDebug\n*F\n+ 1 LpmSelectorText.kt\ncom/stripe/android/paymentsheet/ui/LpmSelectorTextKt\n*L\n25#1:47,6\n25#1:79\n25#1:85\n25#1:53\n25#1:55,11\n25#1:84\n25#1:54\n25#1:66,13\n25#1:81,3\n31#1:80\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.LpmSelectorTextKt */
/* loaded from: classes7.dex */
public final class LpmSelectorTextKt {
    /* renamed from: LpmSelectorText-T042LqI  reason: not valid java name */
    public static final void m116639LpmSelectorTextT042LqI(Integer num, String text, long j, InterfaceC41563gV2 modifier, boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Object obj;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Integer num2;
        int i9;
        long m18743m;
        InterfaceC32720Et0 interfaceC32720Et02;
        Integer num3;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-470687082);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            obj = num;
        } else if ((i & 14) == 0) {
            obj = num;
            if (mo89518u.mo89539n(obj)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            obj = num;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (mo89518u.mo89539n(text)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (mo89518u.mo89524s(j)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(modifier)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (mo89518u.mo89536o(z)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        int i11 = i3;
        if ((46811 & i11) == 9362 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            num3 = obj;
            interfaceC32720Et02 = mo89518u;
        } else {
            if (i10 != 0) {
                num2 = null;
            } else {
                num2 = obj;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-470687082, i11, -1, "com.stripe.android.paymentsheet.ui.LpmSelectorText (LpmSelectorText.kt:17)");
            }
            InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
            int i12 = ((i11 >> 9) & 14) | 384;
            mo89518u.mo89638F(693286680);
            int i13 = i12 >> 3;
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h, mo89518u, (i13 & 14) | (i13 & 112));
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(modifier);
            int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
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
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i14 >> 3) & 112));
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-678309503);
            if (((i14 >> 9) & 14 & 11) == 2 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                interfaceC32720Et02 = mo89518u;
            } else {
                C38066ad5 c38066ad5 = C38066ad5.f50835a;
                mo89518u.mo89638F(1634818810);
                if (((((i12 >> 6) & 112) | 6) & 81) == 16 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                    interfaceC32720Et02 = mo89518u;
                } else {
                    mo89518u.mo89638F(1758886802);
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        DP1.m110533b(C46748pE3.m19793d(intValue, mo89518u, 0), null, ND3.m94182k(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(4), 0.0f, 2, null), TM2.f35372a.m83731a(mo89518u, TM2.f35373b).m94901i(), mo89518u, 440, 0);
                    }
                    mo89518u.mo89605Q();
                    G26 m104962f = TM2.f35372a.m83729c(mo89518u, TM2.f35373b).m104962f();
                    if (z) {
                        m18743m = j;
                        i9 = i11;
                    } else {
                        i9 = i11;
                        m18743m = C47063pm0.m18743m(j, 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    interfaceC32720Et02 = mo89518u;
                    int i15 = (i9 >> 3) & 14;
                    C38909c26.m62000e(text, null, m18743m, 0L, null, null, null, 0L, null, null, 0L, C45449n26.f99264a.m24539b(), false, 1, null, m104962f, interfaceC32720Et02, i15, 3120, 22522);
                }
                interfaceC32720Et02.mo89605Q();
            }
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89563f();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            num3 = num2;
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new LpmSelectorTextKt$LpmSelectorText$2(num3, text, j, modifier, z, i, i2));
        }
    }
}
