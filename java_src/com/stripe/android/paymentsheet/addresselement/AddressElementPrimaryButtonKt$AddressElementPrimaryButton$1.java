package com.stripe.android.paymentsheet.addresselement;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAddressElementPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElementPrimaryButton.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,84:1\n154#2:85\n154#2:118\n68#3,5:86\n73#3:117\n77#3:123\n75#4:91\n76#4,11:93\n89#4:122\n76#5:92\n460#6,13:104\n473#6,3:119\n*S KotlinDebug\n*F\n+ 1 AddressElementPrimaryButton.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1\n*L\n59#1:85\n66#1:118\n56#1:86,5\n56#1:117\n56#1:123\n56#1:91\n56#1:93,11\n56#1:122\n56#1:92\n56#1:104,13\n56#1:119,3\n*E\n"})
/* loaded from: classes7.dex */
public final class AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $background;
    final /* synthetic */ C20064eZ $borderStroke;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ long $onBackground;
    final /* synthetic */ Function0<Unit> $onButtonClick;
    final /* synthetic */ C38649bc5 $shape;
    final /* synthetic */ String $text;
    final /* synthetic */ G26 $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1(Function0<Unit> function0, boolean z, C38649bc5 c38649bc5, C20064eZ c20064eZ, long j, int i, String str, long j2, G26 g26) {
        super(2);
        this.$onButtonClick = function0;
        this.$isEnabled = z;
        this.$shape = c38649bc5;
        this.$borderStroke = c20064eZ;
        this.$background = j;
        this.$$dirty = i;
        this.$text = str;
        this.$onBackground = j2;
        this.$textStyle = g26;
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
            C35528Qt0.m87816Z(-833091899, i, -1, "com.stripe.android.paymentsheet.addresselement.AddressElementPrimaryButton.<anonymous> (AddressElementPrimaryButton.kt:54)");
        }
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m94182k = ND3.m94182k(BB5.m114255n(c20912a, 0.0f, 1, null), 0.0f, C43705k61.m29303g(16), 1, null);
        InterfaceC4360K9 m99141e = InterfaceC4360K9.f19170a.m99141e();
        Function0<Unit> function0 = this.$onButtonClick;
        boolean z = this.$isEnabled;
        C38649bc5 c38649bc5 = this.$shape;
        C20064eZ c20064eZ = this.$borderStroke;
        long j = this.$background;
        int i2 = this.$$dirty;
        String str = this.$text;
        long j2 = this.$onBackground;
        G26 g26 = this.$textStyle;
        interfaceC32720Et0.mo89638F(733328855);
        InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99141e, false, interfaceC32720Et0, 6);
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
        C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        interfaceC32720Et0.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-2137368960);
        C40689f10 c40689f10 = C40689f10.f79291a;
        interfaceC32720Et0.mo89638F(-1619013249);
        C43714k70.m29276c(function0, BB5.m114254o(BB5.m114255n(c20912a, 0.0f, 1, null), C43705k61.m29303g(44)), z, null, null, c38649bc5, c20064eZ, C42528i70.f86761a.m34439a(j, 0L, j, 0L, interfaceC32720Et0, C42528i70.f86772l << 12, 10), null, C43575jt0.m29791b(interfaceC32720Et0, -1203725918, true, new AddressElementPrimaryButtonKt$AddressElementPrimaryButton$1$1$1(str, j2, g26, i2)), interfaceC32720Et0, ((i2 >> 6) & 14) | 805306416 | ((i2 << 6) & 896), 280);
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
