package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.financialconnections.domain.Entry;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"", Entry.TYPE_TEXT, "", "GooglePayDividerUi", "(Ljava/lang/String;LEt0;II)V", "GooglePayDividerLine", "(LEt0;I)V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGooglePayDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayDivider.kt\ncom/stripe/android/paymentsheet/ui/GooglePayDividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,57:1\n154#2:58\n154#2:91\n174#2:97\n68#3,5:59\n73#3:90\n77#3:96\n75#4:64\n76#4,11:66\n89#4:95\n76#5:65\n460#6,13:77\n473#6,3:92\n*S KotlinDebug\n*F\n+ 1 GooglePayDivider.kt\ncom/stripe/android/paymentsheet/ui/GooglePayDividerKt\n*L\n29#1:58\n38#1:91\n53#1:97\n25#1:59,5\n25#1:90\n25#1:96\n25#1:64\n25#1:66,11\n25#1:95\n25#1:65\n25#1:77,13\n25#1:92,3\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.GooglePayDividerKt */
/* loaded from: classes7.dex */
public final class GooglePayDividerKt {
    public static final void GooglePayDividerLine(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long m18743m;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(897254838);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(897254838, i, -1, "com.stripe.android.paymentsheet.ui.GooglePayDividerLine (GooglePayDivider.kt:43)");
            }
            TM2 tm2 = TM2.f35372a;
            int i2 = TM2.f35373b;
            if (StripeThemeKt.m116713shouldUseDarkDynamicColor8_81llA(tm2.m83731a(mo89518u, i2).m94896n())) {
                m18743m = C47063pm0.m18743m(C47063pm0.f104050b.m18732a(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
            } else {
                m18743m = C47063pm0.m18743m(C47063pm0.f104050b.m18725h(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
            }
            C39504d10.m44736a(BB5.m114255n(BB5.m114254o(C13342bw.m62124d(InterfaceC41563gV2.f82354b0, m18743m, null, 2, null), C43705k61.m29303g(StripeThemeKt.getStripeShapes(tm2, mo89518u, i2).getBorderStrokeWidth())), 0.0f, 1, null), mo89518u, 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new GooglePayDividerKt$GooglePayDividerLine$1(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        if ((r31 & 1) != 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GooglePayDividerUi(String str, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        String str2;
        int i3;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i4;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1961147963);
        if ((i & 14) == 0) {
            if ((i2 & 1) == 0) {
                str2 = str;
                if (mo89518u.mo89539n(str2)) {
                    i4 = 4;
                    i3 = i4 | i;
                }
            } else {
                str2 = str;
            }
            i4 = 2;
            i3 = i4 | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i3 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            mo89518u.mo89626J();
            if ((i & 1) != 0 && !mo89518u.mo89545l()) {
                mo89518u.mo89548k();
            } else {
                if ((i2 & 1) != 0) {
                    str2 = C40946fS5.m41310c(C19159R.string.stripe_paymentsheet_or_pay_with_card, mo89518u, 0);
                    i3 &= -15;
                }
                String str3 = str2;
                int i5 = i3;
                mo89518u.mo89650B();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1961147963, i5, -1, "com.stripe.android.paymentsheet.ui.GooglePayDividerUi (GooglePayDivider.kt:21)");
                }
                InterfaceC4360K9 m99141e = InterfaceC4360K9.f19170a.m99141e();
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                InterfaceC41563gV2 m94180m = ND3.m94180m(BB5.m114255n(c20912a, 0.0f, 1, null), 0.0f, C43705k61.m29303g(18), 0.0f, 0.0f, 13, null);
                mo89518u.mo89638F(733328855);
                InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99141e, false, mo89518u, 6);
                mo89518u.mo89638F(-1323940314);
                InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
                EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
                InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
                InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94180m);
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
                C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                mo89518u.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
                mo89518u.mo89638F(2058660585);
                mo89518u.mo89638F(-2137368960);
                C40689f10 c40689f10 = C40689f10.f79291a;
                mo89518u.mo89638F(410127231);
                GooglePayDividerLine(mo89518u, 0);
                TM2 tm2 = TM2.f35372a;
                int i6 = TM2.f35373b;
                G26 m104965c = tm2.m83729c(mo89518u, i6).m104965c();
                long m116700getSubtitle0d7_KjU = StripeThemeKt.getStripeColors(tm2, mo89518u, i6).m116700getSubtitle0d7_KjU();
                interfaceC32720Et02 = mo89518u;
                C38909c26.m62000e(str3, ND3.m94182k(C13342bw.m62124d(c20912a, tm2.m83731a(mo89518u, i6).m94896n(), null, 2, null), C43705k61.m29303g(8), 0.0f, 2, null), m116700getSubtitle0d7_KjU, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, m104965c, interfaceC32720Et02, i5 & 14, 0, 32760);
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89563f();
                interfaceC32720Et02.mo89605Q();
                interfaceC32720Et02.mo89605Q();
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
                str2 = str3;
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new GooglePayDividerKt$GooglePayDividerUi$2(str2, i, i2));
        }
    }
}
