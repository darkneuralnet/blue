package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.p047ui.LpmSelectorTextKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodsUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsUI.kt\ncom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,274:1\n50#2:275\n49#2:276\n460#2,13:302\n460#2,13:335\n473#2,3:349\n473#2,3:355\n1057#3,6:277\n74#4,6:283\n80#4:315\n84#4:359\n75#5:289\n76#5,11:291\n75#5:322\n76#5,11:324\n89#5:352\n89#5:358\n76#6:290\n76#6:323\n67#7,6:316\n73#7:348\n77#7:353\n154#8:354\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsUI.kt\ncom/stripe/android/paymentsheet/PaymentMethodsUIKt$PaymentMethodUI$1\n*L\n207#1:275\n207#1:276\n202#1:302,13\n212#1:335,13\n212#1:349,3\n202#1:355,3\n207#1:277,6\n202#1:283,6\n202#1:315\n202#1:359\n202#1:289\n202#1:291,11\n212#1:322\n212#1:324,11\n212#1:352\n202#1:358\n202#1:290\n212#1:323\n212#1:316,6\n212#1:348\n212#1:353\n234#1:354\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentMethodsUIKt$PaymentMethodUI$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ long $color;
    final /* synthetic */ int $iconRes;
    final /* synthetic */ String $iconUrl;
    final /* synthetic */ StripeImageLoader $imageLoader;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ int $itemIndex;
    final /* synthetic */ Function1<Integer, Unit> $onItemSelectedListener;
    final /* synthetic */ boolean $tintOnSelected;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsUIKt$PaymentMethodUI$1(boolean z, boolean z2, Function1<? super Integer, Unit> function1, int i, int i2, int i3, String str, long j, int i4, String str2, StripeImageLoader stripeImageLoader, boolean z3) {
        super(2);
        this.$isSelected = z;
        this.$isEnabled = z2;
        this.$onItemSelectedListener = function1;
        this.$itemIndex = i;
        this.$$dirty1 = i2;
        this.$$dirty = i3;
        this.$title = str;
        this.$color = j;
        this.$iconRes = i4;
        this.$iconUrl = str2;
        this.$imageLoader = stripeImageLoader;
        this.$tintOnSelected = z3;
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
            C35528Qt0.m87816Z(-434634125, i, -1, "com.stripe.android.paymentsheet.PaymentMethodUI.<anonymous> (PaymentMethodsUI.kt:200)");
        }
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        boolean z = this.$isSelected;
        boolean z2 = this.$isEnabled;
        Function1<Integer, Unit> function1 = this.$onItemSelectedListener;
        Integer valueOf = Integer.valueOf(this.$itemIndex);
        Function1<Integer, Unit> function12 = this.$onItemSelectedListener;
        int i2 = this.$itemIndex;
        interfaceC32720Et0.mo89638F(511388516);
        boolean mo89539n = interfaceC32720Et0.mo89539n(function1) | interfaceC32720Et0.mo89539n(valueOf);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new PaymentMethodsUIKt$PaymentMethodUI$1$1$1(function12, i2);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC41563gV2 m104674c = C33175Gr5.m104674c(c20912a, z, z2, null, (Function0) mo89635G, 4, null);
        String str = this.$title;
        long j = this.$color;
        boolean z3 = this.$isEnabled;
        int i3 = this.$$dirty;
        int i4 = this.$iconRes;
        String str2 = this.$iconUrl;
        StripeImageLoader stripeImageLoader = this.$imageLoader;
        boolean z4 = this.$tintOnSelected;
        interfaceC32720Et0.mo89638F(-483455358);
        C25777lo.InterfaceC25789l m26802g = C25777lo.f96729a.m26802g();
        InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(m26802g, c4361a.m99136j(), interfaceC32720Et0, 0);
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
        interfaceC32720Et0.mo89638F(-161742359);
        Spacing spacing = Spacing.INSTANCE;
        InterfaceC41563gV2 m94180m = ND3.m94180m(BB5.m114254o(c20912a, spacing.m116605getIconSizeD9Ej5fM()), spacing.m116602getCardLeadingInnerPaddingD9Ej5fM(), spacing.m116602getCardLeadingInnerPaddingD9Ej5fM(), 0.0f, 0.0f, 12, null);
        interfaceC32720Et0.mo89638F(733328855);
        InterfaceC51579xO2 m44729h = C39504d10.m44729h(c4361a.m99132n(), false, interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94180m);
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
        C38680bf6.m64191b(m64192a2, m44729h, c0757a.m113412d());
        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
        interfaceC32720Et0.mo89530q();
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-2137368960);
        C40689f10 c40689f10 = C40689f10.f79291a;
        interfaceC32720Et0.mo89638F(1680944623);
        int i5 = i3 >> 3;
        PaymentMethodsUIKt.m116591PaymentMethodIconUiqFjXxE8(i4, str2, stripeImageLoader, z4, j, interfaceC32720Et0, (i5 & 896) | (i5 & 14) | (i5 & 112) | (StripeImageLoader.$stable << 6) | ((i3 >> 12) & 7168));
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89563f();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        LpmSelectorTextKt.m116639LpmSelectorTextT042LqI(null, str, j, ND3.m94180m(c20912a, spacing.m116602getCardLeadingInnerPaddingD9Ej5fM(), C43705k61.m29303g(6), spacing.m116602getCardLeadingInnerPaddingD9Ej5fM(), 0.0f, 8, null), z3, interfaceC32720Et0, ((i3 >> 9) & 112) | ((i3 >> 6) & 57344), 1);
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
