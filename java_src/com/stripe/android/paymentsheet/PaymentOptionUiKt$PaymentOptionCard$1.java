package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25777lo;
import p000.C48841sm0;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentOptionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionUi.kt\ncom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,258:1\n78#2,2:259\n80#2:287\n84#2:295\n75#3:261\n76#3,11:263\n89#3:294\n76#4:262\n460#5,13:274\n473#5,3:291\n1#6:288\n154#7:289\n154#7:290\n*S KotlinDebug\n*F\n+ 1 PaymentOptionUi.kt\ncom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionCard$1\n*L\n149#1:259,2\n149#1:287\n149#1:295\n149#1:261\n149#1:263,11\n149#1:294\n149#1:262\n149#1:274,13\n149#1:291,3\n166#1:289\n167#1:290\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentOptionUiKt$PaymentOptionCard$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $iconRes;
    final /* synthetic */ C47063pm0 $iconTint;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ String $labelText;
    final /* synthetic */ Function0<Unit> $onItemSelectedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionUiKt$PaymentOptionCard$1(String str, boolean z, boolean z2, Function0<Unit> function0, int i, int i2, C47063pm0 c47063pm0) {
        super(2);
        this.$labelText = str;
        this.$isSelected = z;
        this.$isEnabled = z2;
        this.$onItemSelectedListener = function0;
        this.$iconRes = i;
        this.$$dirty = i2;
        this.$iconTint = c47063pm0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        C48841sm0 c48841sm0;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1394573824, i, -1, "com.stripe.android.paymentsheet.PaymentOptionCard.<anonymous> (PaymentOptionUi.kt:147)");
        }
        C25777lo.InterfaceC25782e m26807b = C25777lo.f96729a.m26807b();
        InterfaceC4360K9.InterfaceC4362b m99139g = InterfaceC4360K9.f19170a.m99139g();
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m104674c = C33175Gr5.m104674c(C46022o06.m22000a(BB5.m114257l(c20912a, 0.0f, 1, null), "PAYMENT_OPTION_CARD_TEST_TAG_" + this.$labelText), this.$isSelected, this.$isEnabled, null, this.$onItemSelectedListener, 4, null);
        int i2 = this.$iconRes;
        int i3 = this.$$dirty;
        C47063pm0 c47063pm0 = this.$iconTint;
        interfaceC32720Et0.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(m26807b, m99139g, interfaceC32720Et0, 54);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m104674c);
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
        C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        interfaceC32720Et0.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-1163856341);
        C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
        interfaceC32720Et0.mo89638F(-1106188042);
        AbstractC45562nE3 m19793d = C46748pE3.m19793d(i2, interfaceC32720Et0, (i3 >> 6) & 14);
        if (c47063pm0 != null) {
            c48841sm0 = C48841sm0.C28383a.m13699b(C48841sm0.f109227b, c47063pm0.m18733w(), 0, 2, null);
        } else {
            c48841sm0 = null;
        }
        C51659xX1.m5069a(m19793d, null, BB5.m114273A(BB5.m114254o(c20912a, C43705k61.m29303g(40)), C43705k61.m29303g(56)), null, null, 0.0f, c48841sm0, interfaceC32720Et0, 440, 56);
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
