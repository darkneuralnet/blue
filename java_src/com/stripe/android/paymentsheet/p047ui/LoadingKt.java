package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"", "Loading", "(LEt0;I)V", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLoading.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Loading.kt\ncom/stripe/android/paymentsheet/ui/LoadingKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,41:1\n79#2,2:42\n81#2:70\n85#2:75\n75#3:44\n76#3,11:46\n89#3:74\n76#4:45\n460#5,13:57\n473#5,3:71\n*S KotlinDebug\n*F\n+ 1 Loading.kt\ncom/stripe/android/paymentsheet/ui/LoadingKt\n*L\n20#1:42,2\n20#1:70\n20#1:75\n20#1:44\n20#1:46,11\n20#1:74\n20#1:45\n20#1:57,13\n20#1:71,3\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.LoadingKt */
/* loaded from: classes7.dex */
public final class LoadingKt {
    public static final void Loading(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long m18725h;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(412133520);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(412133520, i, -1, "com.stripe.android.paymentsheet.ui.Loading (Loading.kt:18)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m114255n = BB5.m114255n(BB5.m114254o(c20912a, H24.m104481a(C19159R.dimen.stripe_paymentsheet_loading_container_height, mo89518u, 0)), 0.0f, 1, null);
            InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
            C25777lo.InterfaceC25782e m26807b = C25777lo.f96729a.m26807b();
            mo89518u.mo89638F(693286680);
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26807b, m99138h, mo89518u, 54);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114255n);
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
            mo89518u.mo89638F(1800649644);
            boolean m116713shouldUseDarkDynamicColor8_81llA = StripeThemeKt.m116713shouldUseDarkDynamicColor8_81llA(TM2.f35372a.m83731a(mo89518u, TM2.f35373b).m94896n());
            InterfaceC41563gV2 m114246w = BB5.m114246w(c20912a, H24.m104481a(C19159R.dimen.stripe_paymentsheet_loading_indicator_size, mo89518u, 0));
            if (m116713shouldUseDarkDynamicColor8_81llA) {
                m18725h = C47063pm0.f104050b.m18732a();
            } else {
                m18725h = C47063pm0.f104050b.m18725h();
            }
            K74.m99208b(m114246w, m18725h, H24.m104481a(C19159R.dimen.stripe_paymentsheet_loading_indicator_stroke_width, mo89518u, 0), mo89518u, 0, 0);
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
            mo89512w.mo20405a(new LoadingKt$Loading$2(i));
        }
    }
}
