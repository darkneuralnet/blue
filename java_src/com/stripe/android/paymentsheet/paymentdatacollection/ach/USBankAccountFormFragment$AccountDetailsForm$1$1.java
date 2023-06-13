package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.paymentsheet.C19159R;
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
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nUSBankAccountFormFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 USBankAccountFormFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,486:1\n154#2:487\n154#2:551\n154#2:552\n154#2:558\n154#2:559\n79#3,2:488\n81#3:516\n74#3,7:517\n81#3:550\n85#3:557\n85#3:572\n75#4:490\n76#4,11:492\n75#4:524\n76#4,11:526\n89#4:556\n89#4:571\n76#5:491\n76#5:525\n460#6,13:503\n460#6,13:537\n473#6,3:553\n50#6:560\n49#6:561\n473#6,3:568\n1057#7,6:562\n*S KotlinDebug\n*F\n+ 1 USBankAccountFormFragment.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$AccountDetailsForm$1$1\n*L\n369#1:487\n378#1:551\n379#1:552\n391#1:558\n392#1:559\n366#1:488,2\n366#1:516\n373#1:517,7\n373#1:550\n373#1:557\n366#1:572\n366#1:490\n366#1:492,11\n373#1:524\n373#1:526,11\n373#1:556\n366#1:571\n366#1:491\n373#1:525\n366#1:503,13\n373#1:537,13\n373#1:553,3\n394#1:560\n394#1:561\n366#1:568,3\n394#1:562,6\n*E\n"})
/* loaded from: classes7.dex */
public final class USBankAccountFormFragment$AccountDetailsForm$1$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $bankIcon;
    final /* synthetic */ String $bankName;
    final /* synthetic */ String $last4;
    final /* synthetic */ EX2<Boolean> $openDialog;
    final /* synthetic */ InterfaceC48627sP5<Boolean> $processing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$AccountDetailsForm$1$1(InterfaceC48627sP5<Boolean> interfaceC48627sP5, EX2<Boolean> ex2, int i, String str, String str2) {
        super(2);
        this.$processing = interfaceC48627sP5;
        this.$openDialog = ex2;
        this.$bankIcon = i;
        this.$bankName = str;
        this.$last4 = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r30v0, types: [Et0, java.lang.Object] */
    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(976709835, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.AccountDetailsForm.<anonymous>.<anonymous> (USBankAccountFormFragment.kt:364)");
        }
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m94184i = ND3.m94184i(BB5.m114255n(c20912a, 0.0f, 1, null), C43705k61.m29303g(8));
        InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
        InterfaceC4360K9.InterfaceC4363c m99138h = c4361a.m99138h();
        C25777lo c25777lo = C25777lo.f96729a;
        C25777lo.InterfaceC25782e m26805d = c25777lo.m26805d();
        InterfaceC48627sP5<Boolean> interfaceC48627sP5 = this.$processing;
        EX2<Boolean> ex2 = this.$openDialog;
        int i2 = this.$bankIcon;
        String str = this.$bankName;
        String str2 = this.$last4;
        interfaceC32720Et0.mo89638F(693286680);
        InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26805d, m99138h, interfaceC32720Et0, 54);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94184i);
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
        interfaceC32720Et0.mo89638F(1515563239);
        InterfaceC4360K9.InterfaceC4363c m99138h2 = c4361a.m99138h();
        interfaceC32720Et0.mo89638F(693286680);
        InterfaceC51579xO2 m74813a2 = C37252Yc5.m74813a(c25777lo.m26803f(), m99138h2, interfaceC32720Et0, 48);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(c20912a);
        if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        interfaceC32720Et0.mo89557h();
        if (interfaceC32720Et0.mo89521t()) {
            interfaceC32720Et0.mo89617M(m113415a2);
        } else {
            interfaceC32720Et0.mo89566e();
        }
        interfaceC32720Et0.mo89620L();
        InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(interfaceC32720Et0);
        C38680bf6.m64191b(m64192a2, m74813a2, c0757a.m113412d());
        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
        interfaceC32720Et0.mo89530q();
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-678309503);
        interfaceC32720Et0.mo89638F(1491081219);
        C51659xX1.m5069a(C46748pE3.m19793d(i2, interfaceC32720Et0, 0), null, BB5.m114273A(BB5.m114254o(c20912a, C43705k61.m29303g(40)), C43705k61.m29303g(56)), null, null, 0.0f, null, interfaceC32720Et0, 440, 120);
        C38909c26.m62000e(str + " ••••" + str2, C8203U9.m81909a(c20912a, interfaceC48627sP5.getValue().booleanValue() ? 0.5f : 1.0f), StripeThemeKt.getStripeColors(TM2.f35372a, interfaceC32720Et0, TM2.f35373b).m116698getOnComponent0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et0, 0, 0, 65528);
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89563f();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        AbstractC45562nE3 m19793d = C46748pE3.m19793d(C19159R.C19160drawable.stripe_ic_clear, interfaceC32720Et0, 0);
        float f = 20;
        InterfaceC41563gV2 m81909a = C8203U9.m81909a(BB5.m114273A(BB5.m114254o(c20912a, C43705k61.m29303g(f)), C43705k61.m29303g(f)), interfaceC48627sP5.getValue().booleanValue() ? 0.5f : 1.0f);
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n = interfaceC32720Et0.mo89539n(interfaceC48627sP5) | interfaceC32720Et0.mo89539n(ex2);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new USBankAccountFormFragment$AccountDetailsForm$1$1$1$2$1(interfaceC48627sP5, ex2);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        C51659xX1.m5069a(m19793d, null, C38131ak0.m70814e(m81909a, false, null, null, mo89635G, 7, null), null, null, 0.0f, null, interfaceC32720Et0, 56, 120);
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
