package com.stripe.android.paymentsheet;

import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.paymentsheet.p047ui.LpmSelectorTextKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPaymentOptionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionUi.kt\ncom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,258:1\n73#2,7:259\n80#2:292\n84#2:305\n75#3:266\n76#3,11:268\n89#3:304\n76#4:267\n460#5,13:279\n36#5:294\n473#5,3:301\n154#6:293\n1057#7,6:295\n*S KotlinDebug\n*F\n+ 1 PaymentOptionUi.kt\ncom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$2\n*L\n88#1:259,7\n88#1:292\n88#1:305\n88#1:266\n88#1:268,11\n88#1:304\n88#1:267\n88#1:279,13\n105#1:294\n88#1:301,3\n104#1:293\n105#1:295,6\n*E\n"})
/* loaded from: classes7.dex */
public final class PaymentOptionUiKt$PaymentOptionUi$2 extends Lambda implements Function3<InterfaceC40096e10, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ String $description;
    final /* synthetic */ int $iconRes;
    final /* synthetic */ C47063pm0 $iconTint;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ Integer $labelIcon;
    final /* synthetic */ String $labelText;
    final /* synthetic */ Function0<Unit> $onItemSelectedListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionUiKt$PaymentOptionUi$2(boolean z, boolean z2, int i, C47063pm0 c47063pm0, String str, Function0<Unit> function0, int i2, int i3, String str2, Integer num) {
        super(3);
        this.$isSelected = z;
        this.$isEnabled = z2;
        this.$iconRes = i;
        this.$iconTint = c47063pm0;
        this.$labelText = str;
        this.$onItemSelectedListener = function0;
        this.$$dirty = i2;
        this.$$dirty1 = i3;
        this.$description = str2;
        this.$labelIcon = num;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC40096e10 interfaceC40096e10, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC40096e10, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC40096e10 BadgedBox, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(BadgedBox, "$this$BadgedBox");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-124726534, i, -1, "com.stripe.android.paymentsheet.PaymentOptionUi.<anonymous> (PaymentOptionUi.kt:86)");
        }
        boolean z = this.$isSelected;
        boolean z2 = this.$isEnabled;
        int i2 = this.$iconRes;
        C47063pm0 c47063pm0 = this.$iconTint;
        String str = this.$labelText;
        Function0<Unit> function0 = this.$onItemSelectedListener;
        int i3 = this.$$dirty;
        int i4 = this.$$dirty1;
        String str2 = this.$description;
        Integer num = this.$labelIcon;
        interfaceC32720Et0.mo89638F(-483455358);
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(c20912a);
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
        interfaceC32720Et0.mo89638F(-39451580);
        int i5 = i3 >> 6;
        PaymentOptionUiKt.m116598PaymentOptionCardflo8M7A(z, z2, i2, c47063pm0, str, function0, null, interfaceC32720Et0, ((i3 >> 3) & 14) | (i5 & 112) | (i5 & 896) | ((i3 >> 9) & 7168) | ((i3 >> 12) & 57344) | ((i4 << 6) & ImageMetadata.JPEG_GPS_COORDINATES), 64);
        long m94901i = TM2.f35372a.m83731a(interfaceC32720Et0, TM2.f35373b).m94901i();
        float f = 6;
        InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a, C43705k61.m29303g(f), C43705k61.m29303g(4), C43705k61.m29303g(f), 0.0f, 8, null);
        interfaceC32720Et0.mo89638F(1157296644);
        boolean mo89539n = interfaceC32720Et0.mo89539n(str2);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            mo89635G = new PaymentOptionUiKt$PaymentOptionUi$2$1$1$1(str2);
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        interfaceC32720Et0.mo89605Q();
        InterfaceC41563gV2 m40620b = C41198fs5.m40620b(m94180m, false, (Function1) mo89635G, 1, null);
        int i6 = i3 >> 21;
        LpmSelectorTextKt.m116639LpmSelectorTextT042LqI(num, str, m94901i, m40620b, z2, interfaceC32720Et0, (i6 & 112) | (i6 & 14) | ((i3 << 3) & 57344), 0);
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
