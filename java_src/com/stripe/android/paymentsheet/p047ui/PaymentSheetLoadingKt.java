package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.C19159R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"LgV2;", "modifier", "", "PaymentSheetLoading", "(LgV2;LEt0;II)V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentSheetLoading.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetLoading.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetLoadingKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,36:1\n68#2,5:37\n73#2:68\n77#2:73\n75#3:42\n76#3,11:44\n89#3:72\n76#4:43\n460#5,13:55\n473#5,3:69\n*S KotlinDebug\n*F\n+ 1 PaymentSheetLoading.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetLoadingKt\n*L\n23#1:37,5\n23#1:68\n23#1:73\n23#1:42\n23#1:44,11\n23#1:72\n23#1:43\n23#1:55,13\n23#1:69,3\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetLoadingKt */
/* loaded from: classes7.dex */
public final class PaymentSheetLoadingKt {
    public static final void PaymentSheetLoading(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        int i3;
        int i4;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1919446535);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (mo89518u.mo89539n(interfaceC41563gV2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (i5 != 0) {
                interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1919446535, i, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetLoading (PaymentSheetLoading.kt:15)");
            }
            float m104481a = H24.m104481a(C19159R.dimen.stripe_paymentsheet_loading_container_height, mo89518u, 0);
            float m104481a2 = H24.m104481a(C19159R.dimen.stripe_paymentsheet_loading_indicator_size, mo89518u, 0);
            float m104481a3 = H24.m104481a(C19159R.dimen.stripe_paymentsheet_loading_indicator_stroke_width, mo89518u, 0);
            InterfaceC4360K9 m99141e = InterfaceC4360K9.f19170a.m99141e();
            InterfaceC41563gV2 m114254o = BB5.m114254o(BB5.m114255n(interfaceC41563gV2, 0.0f, 1, null), m104481a);
            mo89518u.mo89638F(733328855);
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99141e, false, mo89518u, 6);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114254o);
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
            mo89518u.mo89638F(1983555635);
            K74.m99208b(BB5.m114246w(interfaceC41563gV2, m104481a2), TM2.f35372a.m83731a(mo89518u, TM2.f35373b).m94901i(), m104481a3, mo89518u, 0, 0);
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentSheetLoadingKt$PaymentSheetLoading$2(interfaceC41563gV2, i, i2));
        }
    }
}
