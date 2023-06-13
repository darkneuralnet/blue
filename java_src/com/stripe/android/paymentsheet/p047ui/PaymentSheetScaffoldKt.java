package com.stripe.android.paymentsheet.p047ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0007\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m28432d2 = {"Lkotlin/Function0;", "", "topBar", "Lkotlin/Function1;", "LgV2;", "content", "modifier", "PaymentSheetScaffold", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;LgV2;LEt0;II)V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetScaffold.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,46:1\n25#2:47\n460#2,13:73\n473#2,3:87\n1057#3,6:48\n74#4,6:54\n80#4:86\n84#4:91\n75#5:60\n76#5,11:62\n89#5:90\n76#6:61\n76#7:92\n76#7:93\n*S KotlinDebug\n*F\n+ 1 PaymentSheetScaffold.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetScaffoldKt\n*L\n24#1:47\n36#1:73,13\n36#1:87,3\n24#1:48,6\n36#1:54,6\n36#1:86\n36#1:91\n36#1:60\n36#1:62,11\n36#1:90\n36#1:61\n24#1:92\n34#1:93\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetScaffoldKt */
/* loaded from: classes7.dex */
public final class PaymentSheetScaffoldKt {
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentSheetScaffold(Function2<? super InterfaceC32720Et0, ? super Integer, Unit> topBar, Function3<? super InterfaceC41563gV2, ? super InterfaceC32720Et0, ? super Integer, Unit> content, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        int i6;
        int i7;
        InterfaceC41563gV2.C20912a c20912a;
        C37135Xp5 m80790a;
        Object mo89635G;
        int i8;
        int i9;
        InterfaceC36874Wm5 mo89512w;
        Intrinsics.checkNotNullParameter(topBar, "topBar");
        Intrinsics.checkNotNullParameter(content, "content");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(40939524);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(topBar)) {
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
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            obj = interfaceC41563gV2;
            if (mo89518u.mo89539n(obj)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
            i7 = i3;
            if ((i7 & 731) != 146 && mo89518u.mo89575b()) {
                mo89518u.mo89548k();
                c20912a = obj;
            } else {
                if (i10 == 0) {
                    c20912a = InterfaceC41563gV2.f82354b0;
                } else {
                    c20912a = obj;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(40939524, i7, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScaffold (PaymentSheetScaffold.kt:16)");
                }
                m80790a = C36433Up5.m80790a(0, mo89518u, 0, 1);
                mo89518u.mo89638F(-492369756);
                mo89635G = mo89518u.mo89635G();
                if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G = GM5.m105204c(new PaymentSheetScaffoldKt$PaymentSheetScaffold$targetElevation$2$1(m80790a));
                    mo89518u.mo89503z(mo89635G);
                }
                mo89518u.mo89605Q();
                InterfaceC48627sP5<C43705k61> m100066c = C4171Je.m100066c(PaymentSheetScaffold$lambda$1((InterfaceC48627sP5) mo89635G), null, null, null, mo89518u, 0, 14);
                i8 = (i7 >> 6) & 14;
                mo89518u.mo89638F(-483455358);
                int i11 = i8 >> 3;
                InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, (i11 & 112) | (i11 & 14));
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
                i9 = ((((i8 << 3) & 112) << 9) & 7168) | 6;
                if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
                    C52468yt0.m2335c();
                }
                mo89518u.mo89557h();
                if (!mo89518u.mo89521t()) {
                    mo89518u.mo89617M(m113415a);
                } else {
                    mo89518u.mo89566e();
                }
                mo89518u.mo89620L();
                InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
                C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i9 >> 3) & 112));
                mo89518u.mo89638F(2058660585);
                mo89518u.mo89638F(-1163856341);
                if (((i9 >> 9) & 14 & 11) != 2 && mo89518u.mo89575b()) {
                    mo89518u.mo89548k();
                } else {
                    C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
                    mo89518u.mo89638F(-1920403378);
                    if (((((i8 >> 6) & 112) | 6) & 81) != 16 && mo89518u.mo89575b()) {
                        mo89518u.mo89548k();
                    } else {
                        float PaymentSheetScaffold$lambda$2 = PaymentSheetScaffold$lambda$2(m100066c);
                        InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
                        NV5.m93838a(C43822kI6.m29084a(c20912a2, 1.0f), null, 0L, 0L, null, PaymentSheetScaffold$lambda$2, C43575jt0.m29791b(mo89518u, 583402386, true, new PaymentSheetScaffoldKt$PaymentSheetScaffold$1$1(topBar, i7)), mo89518u, 1572870, 30);
                        content.invoke(C36433Up5.m80787d(c20912a2, m80790a, false, null, false, 14, null), mo89518u, Integer.valueOf(i7 & 112));
                    }
                    mo89518u.mo89605Q();
                }
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                mo89518u.mo89563f();
                mo89518u.mo89605Q();
                mo89518u.mo89605Q();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
            mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                mo89512w.mo20405a(new PaymentSheetScaffoldKt$PaymentSheetScaffold$2(topBar, content, c20912a, i, i2));
                return;
            }
            return;
        }
        obj = interfaceC41563gV2;
        i7 = i3;
        if ((i7 & 731) != 146) {
        }
        if (i10 == 0) {
        }
        if (C35528Qt0.m87827O()) {
        }
        m80790a = C36433Up5.m80790a(0, mo89518u, 0, 1);
        mo89518u.mo89638F(-492369756);
        mo89635G = mo89518u.mo89635G();
        if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
        }
        mo89518u.mo89605Q();
        InterfaceC48627sP5<C43705k61> m100066c2 = C4171Je.m100066c(PaymentSheetScaffold$lambda$1((InterfaceC48627sP5) mo89635G), null, null, null, mo89518u, 0, 14);
        i8 = (i7 >> 6) & 14;
        mo89518u.mo89638F(-483455358);
        int i112 = i8 >> 3;
        InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, (i112 & 112) | (i112 & 14));
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a2 = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a2.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(c20912a);
        i9 = ((((i8 << 3) & 112) << 9) & 7168) | 6;
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
        }
        mo89518u.mo89557h();
        if (!mo89518u.mo89521t()) {
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a2, m91546a2, c0757a2.m113412d());
        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a2.m113414b());
        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a2.m113413c());
        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a2.m113410f());
        mo89518u.mo89530q();
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, Integer.valueOf((i9 >> 3) & 112));
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        if (((i9 >> 9) & 14 & 11) != 2) {
        }
        C35465Qm0 c35465Qm02 = C35465Qm0.f30887a;
        mo89518u.mo89638F(-1920403378);
        if (((((i8 >> 6) & 112) | 6) & 81) != 16) {
        }
        float PaymentSheetScaffold$lambda$22 = PaymentSheetScaffold$lambda$2(m100066c2);
        InterfaceC41563gV2.C20912a c20912a22 = InterfaceC41563gV2.f82354b0;
        NV5.m93838a(C43822kI6.m29084a(c20912a22, 1.0f), null, 0L, 0L, null, PaymentSheetScaffold$lambda$22, C43575jt0.m29791b(mo89518u, 583402386, true, new PaymentSheetScaffoldKt$PaymentSheetScaffold$1$1(topBar, i7)), mo89518u, 1572870, 30);
        content.invoke(C36433Up5.m80787d(c20912a22, m80790a, false, null, false, 14, null), mo89518u, Integer.valueOf(i7 & 112));
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
        }
        mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
        }
    }

    private static final float PaymentSheetScaffold$lambda$1(InterfaceC48627sP5<C43705k61> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().m29298l();
    }

    private static final float PaymentSheetScaffold$lambda$2(InterfaceC48627sP5<C43705k61> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().m29298l();
    }
}
