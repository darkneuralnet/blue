package com.stripe.android.link.p042ui.wallet;

import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentDetails.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentDetails.kt\ncom/stripe/android/link/ui/wallet/PaymentDetailsKt$CardInfo$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,251:1\n75#2,6:252\n81#2:284\n85#2:294\n75#3:258\n76#3,11:260\n89#3:293\n76#4:259\n76#4:287\n76#4:288\n76#4:289\n460#5,13:271\n473#5,3:290\n154#6:285\n154#6:286\n*S KotlinDebug\n*F\n+ 1 PaymentDetails.kt\ncom/stripe/android/link/ui/wallet/PaymentDetailsKt$CardInfo$1\n*L\n176#1:252,6\n176#1:284\n176#1:294\n176#1:258\n176#1:260,11\n176#1:293\n176#1:259\n187#1:287\n192#1:288\n197#1:289\n176#1:271,13\n176#1:290,3\n184#1:285\n185#1:286\n*E\n"})
/* renamed from: com.stripe.android.link.ui.wallet.PaymentDetailsKt$CardInfo$1 */
/* loaded from: classes7.dex */
public final class PaymentDetailsKt$CardInfo$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ ConsumerPaymentDetails.Card $card;
    final /* synthetic */ InterfaceC37486Zc5 $this_CardInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDetailsKt$CardInfo$1(InterfaceC37486Zc5 interfaceC37486Zc5, ConsumerPaymentDetails.Card card) {
        super(2);
        this.$this_CardInfo = interfaceC37486Zc5;
        this.$card = card;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(646203290, i, -1, "com.stripe.android.link.ui.wallet.CardInfo.<anonymous> (PaymentDetails.kt:174)");
        }
        InterfaceC37486Zc5 interfaceC37486Zc5 = this.$this_CardInfo;
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m72851b = InterfaceC37486Zc5.m72851b(interfaceC37486Zc5, c20912a, 1.0f, false, 2, null);
        InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
        InterfaceC4360K9.InterfaceC4363c m99138h = c4361a.m99138h();
        ConsumerPaymentDetails.Card card = this.$card;
        interfaceC32720Et0.mo89638F(693286680);
        InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h, interfaceC32720Et0, 48);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m72851b);
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
        interfaceC32720Et0.mo89638F(974454198);
        C51659xX1.m5069a(C46748pE3.m19793d(card.getBrand().getIcon(), interfaceC32720Et0, 0), card.getBrand().getDisplayName(), ND3.m94182k(BB5.m114273A(c20912a, C43705k61.m29303g(38)), C43705k61.m29303g(6), 0.0f, 2, null), c4361a.m99141e(), null, ((Number) interfaceC32720Et0.mo89572c(C37220Xz0.m75931a())).floatValue(), null, interfaceC32720Et0, 3464, 80);
        TM2 tm2 = TM2.f35372a;
        int i2 = TM2.f35373b;
        C38909c26.m62000e("•••• ", null, C47063pm0.m18743m(tm2.m83731a(interfaceC32720Et0, i2).m94903g(), ((Number) interfaceC32720Et0.mo89572c(C37220Xz0.m75931a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et0, 6, 0, 65530);
        C38909c26.m62000e(card.getLast4(), null, C47063pm0.m18743m(tm2.m83731a(interfaceC32720Et0, i2).m94903g(), ((Number) interfaceC32720Et0.mo89572c(C37220Xz0.m75931a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, tm2.m83729c(interfaceC32720Et0, i2).m104958j(), interfaceC32720Et0, 0, 0, 32762);
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
