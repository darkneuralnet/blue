package com.stripe.android.link.p042ui.paymentmethod;

import com.stripe.android.link.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C48841sm0;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,288:1\n154#2:289\n154#2:290\n154#2:291\n*S KotlinDebug\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1\n*L\n233#1:289\n239#1:290\n241#1:291\n*E\n"})
/* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt$PaymentMethodTypeCell$1 */
/* loaded from: classes7.dex */
public final class PaymentMethodBodyKt$PaymentMethodTypeCell$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function0<Unit> $onSelected;
    final /* synthetic */ SupportedPaymentMethod $paymentMethod;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ InterfaceC37486Zc5 $this_PaymentMethodTypeCell;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPaymentMethodBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,288:1\n75#2,6:289\n81#2:321\n85#2:330\n75#3:295\n76#3,11:297\n89#3:329\n76#4:296\n76#4:324\n460#5,13:308\n473#5,3:326\n154#6:322\n154#6:323\n154#6:325\n*S KotlinDebug\n*F\n+ 1 PaymentMethodBody.kt\ncom/stripe/android/link/ui/paymentmethod/PaymentMethodBodyKt$PaymentMethodTypeCell$1$1\n*L\n250#1:289,6\n250#1:321\n250#1:330\n250#1:295\n250#1:297,11\n250#1:329\n250#1:296\n265#1:324\n250#1:308,13\n250#1:326,3\n263#1:322\n264#1:323\n276#1:325\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodBodyKt$PaymentMethodTypeCell$1$1 */
    /* loaded from: classes7.dex */
    public static final class C190331 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ Function0<Unit> $onSelected;
        final /* synthetic */ SupportedPaymentMethod $paymentMethod;
        final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190331(boolean z, Function0<Unit> function0, SupportedPaymentMethod supportedPaymentMethod, boolean z2) {
            super(2);
            this.$enabled = z;
            this.$onSelected = function0;
            this.$paymentMethod = supportedPaymentMethod;
            this.$selected = z2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            long m94902h;
            long m94902h2;
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(83120480, i, -1, "com.stripe.android.link.ui.paymentmethod.PaymentMethodTypeCell.<anonymous>.<anonymous> (PaymentMethodBody.kt:248)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m70814e = C38131ak0.m70814e(BB5.m114257l(c20912a, 0.0f, 1, null), this.$enabled, null, null, this.$onSelected, 6, null);
            InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
            SupportedPaymentMethod supportedPaymentMethod = this.$paymentMethod;
            boolean z = this.$selected;
            interfaceC32720Et0.mo89638F(693286680);
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h, interfaceC32720Et0, 48);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m70814e);
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
            interfaceC32720Et0.mo89638F(-1975928636);
            AbstractC45562nE3 m19793d = C46748pE3.m19793d(supportedPaymentMethod.getIconResourceId(), interfaceC32720Et0, 0);
            float f = 16;
            InterfaceC41563gV2 m94182k = ND3.m94182k(BB5.m114273A(c20912a, C43705k61.m29303g(50)), C43705k61.m29303g(f), 0.0f, 2, null);
            float floatValue = ((Number) interfaceC32720Et0.mo89572c(C37220Xz0.m75931a())).floatValue();
            C48841sm0.C28383a c28383a = C48841sm0.f109227b;
            if (z) {
                m94902h = TM2.f35372a.m83731a(interfaceC32720Et0, TM2.f35373b).m94900j();
            } else {
                m94902h = TM2.f35372a.m83731a(interfaceC32720Et0, TM2.f35373b).m94902h();
            }
            C51659xX1.m5069a(m19793d, null, m94182k, null, null, floatValue, C48841sm0.C28383a.m13699b(c28383a, m94902h, 0, 2, null), interfaceC32720Et0, 440, 24);
            String m41310c = C40946fS5.m41310c(supportedPaymentMethod.getNameResourceId(), interfaceC32720Et0, 0);
            InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a, 0.0f, 0.0f, C43705k61.m29303g(f), 0.0f, 11, null);
            if (z) {
                m94902h2 = TM2.f35372a.m83731a(interfaceC32720Et0, TM2.f35373b).m94903g();
            } else {
                m94902h2 = TM2.f35372a.m83731a(interfaceC32720Et0, TM2.f35373b).m94902h();
            }
            C38909c26.m62000e(m41310c, m94180m, m94902h2, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, TM2.f35372a.m83729c(interfaceC32720Et0, TM2.f35373b).m104958j(), interfaceC32720Et0, 48, 0, 32760);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodBodyKt$PaymentMethodTypeCell$1(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC41563gV2 interfaceC41563gV2, boolean z, boolean z2, Function0<Unit> function0, SupportedPaymentMethod supportedPaymentMethod) {
        super(2);
        this.$this_PaymentMethodTypeCell = interfaceC37486Zc5;
        this.$modifier = interfaceC41563gV2;
        this.$selected = z;
        this.$enabled = z2;
        this.$onSelected = function0;
        this.$paymentMethod = supportedPaymentMethod;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        float m29303g;
        long m116533getComponentBorder0d7_KjU;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-208904676, i, -1, "com.stripe.android.link.ui.paymentmethod.PaymentMethodTypeCell.<anonymous> (PaymentMethodBody.kt:229)");
        }
        InterfaceC41563gV2 m72851b = InterfaceC37486Zc5.m72851b(this.$this_PaymentMethodTypeCell, BB5.m114254o(this.$modifier, C43705k61.m29303g(56)), 1.0f, false, 2, null);
        TM2 tm2 = TM2.f35372a;
        int i2 = TM2.f35373b;
        C38649bc5 small = ThemeKt.getLinkShapes(tm2, interfaceC32720Et0, i2).getSmall();
        long m116532getComponentBackground0d7_KjU = ThemeKt.getLinkColors(tm2, interfaceC32720Et0, i2).m116532getComponentBackground0d7_KjU();
        if (this.$selected) {
            m29303g = C43705k61.m29303g(2);
        } else {
            m29303g = C43705k61.m29303g(1);
        }
        if (this.$selected) {
            m116533getComponentBorder0d7_KjU = tm2.m83731a(interfaceC32720Et0, i2).m94900j();
        } else {
            m116533getComponentBorder0d7_KjU = ThemeKt.getLinkColors(tm2, interfaceC32720Et0, i2).m116533getComponentBorder0d7_KjU();
        }
        NV5.m93838a(m72851b, small, m116532getComponentBackground0d7_KjU, 0L, C20466fZ.m41178a(m29303g, m116533getComponentBorder0d7_KjU), 0.0f, C43575jt0.m29791b(interfaceC32720Et0, 83120480, true, new C190331(this.$enabled, this.$onSelected, this.$paymentMethod, this.$selected)), interfaceC32720Et0, 1572864, 40);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
