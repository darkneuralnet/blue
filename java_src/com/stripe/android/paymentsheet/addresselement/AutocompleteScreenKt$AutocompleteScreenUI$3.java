package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC4360K9;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAutocompleteScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutocompleteScreen.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,235:1\n154#2:236\n79#3,2:237\n81#3:265\n85#3:270\n75#4:239\n76#4,11:241\n89#4:269\n76#5:240\n460#6,13:252\n473#6,3:266\n*S KotlinDebug\n*F\n+ 1 AutocompleteScreen.kt\ncom/stripe/android/paymentsheet/addresselement/AutocompleteScreenKt$AutocompleteScreenUI$3\n*L\n110#1:236\n102#1:237,2\n102#1:265\n102#1:270\n102#1:239\n102#1:241,11\n102#1:269\n102#1:240\n102#1:252,13\n102#1:266,3\n*E\n"})
/* loaded from: classes7.dex */
public final class AutocompleteScreenKt$AutocompleteScreenUI$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ AutocompleteViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutocompleteScreenKt$AutocompleteScreenUI$3(AutocompleteViewModel autocompleteViewModel) {
        super(2);
        this.$viewModel = autocompleteViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        long m116710darkenDxMtmZc;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1873091664, i, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:95)");
        }
        if (C51020wS0.m6823a(interfaceC32720Et0, 0)) {
            interfaceC32720Et0.mo89638F(-744285348);
            m116710darkenDxMtmZc = StripeThemeKt.getStripeColors(TM2.f35372a, interfaceC32720Et0, TM2.f35373b).m116695getComponent0d7_KjU();
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(-744285274);
            m116710darkenDxMtmZc = StripeThemeKt.m116710darkenDxMtmZc(StripeThemeKt.getStripeColors(TM2.f35372a, interfaceC32720Et0, TM2.f35373b).getMaterialColors().m94896n(), 0.07f);
            interfaceC32720Et0.mo89605Q();
        }
        long j = m116710darkenDxMtmZc;
        InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
        C25777lo.InterfaceC25782e m26807b = C25777lo.f96729a.m26807b();
        InterfaceC41563gV2 m94182k = ND3.m94182k(C47326qC6.m17907b(C47326qC6.m17908a(BB5.m114255n(C13342bw.m62124d(InterfaceC41563gV2.f82354b0, j, null, 2, null), 0.0f, 1, null))), 0.0f, C43705k61.m29303g(8), 1, null);
        AutocompleteViewModel autocompleteViewModel = this.$viewModel;
        interfaceC32720Et0.mo89638F(693286680);
        InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26807b, m99138h, interfaceC32720Et0, 54);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94182k);
        if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        interfaceC32720Et0.mo89557h();
        if (interfaceC32720Et0.mo89521t()) {
            interfaceC32720Et0.mo89617M(m113415a);
        } else {
            interfaceC32720Et0.mo89566e();
        }
        interfaceC32720Et0.mo89620L();
        InterfaceC32720Et0 m64192a = C38680bf6.m64192a(interfaceC32720Et0);
        C38680bf6.m64191b(m64192a, m74813a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        interfaceC32720Et0.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-678309503);
        C38066ad5 c38066ad5 = C38066ad5.f50835a;
        interfaceC32720Et0.mo89638F(128857012);
        EnterManuallyTextKt.EnterManuallyText(new AutocompleteScreenKt$AutocompleteScreenUI$3$1$1(autocompleteViewModel), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89563f();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
