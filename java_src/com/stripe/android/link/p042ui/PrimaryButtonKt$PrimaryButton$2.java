package com.stripe.android.link.p042ui;

import com.stripe.android.link.theme.ThemeKt;
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
@SourceDebugExtension({"SMAP\nPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,206:1\n154#2:207\n154#2:241\n67#3,6:208\n73#3:240\n77#3:246\n75#4:214\n76#4,11:216\n89#4:245\n76#5:215\n460#6,13:227\n473#6,3:242\n*S KotlinDebug\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2\n*L\n100#1:207\n107#1:241\n100#1:208,6\n100#1:240\n100#1:246\n100#1:214\n100#1:216,11\n100#1:245\n100#1:215\n100#1:227,13\n100#1:242,3\n*E\n"})
/* renamed from: com.stripe.android.link.ui.PrimaryButtonKt$PrimaryButton$2 */
/* loaded from: classes7.dex */
public final class PrimaryButtonKt$PrimaryButton$2 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Integer $iconEnd;
    final /* synthetic */ Integer $iconStart;
    final /* synthetic */ String $label;
    final /* synthetic */ Function0<Unit> $onButtonClick;
    final /* synthetic */ PrimaryButtonState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonKt$PrimaryButton$2(Function0<Unit> function0, PrimaryButtonState primaryButtonState, int i, Integer num, String str, Integer num2) {
        super(2);
        this.$onButtonClick = function0;
        this.$state = primaryButtonState;
        this.$$dirty = i;
        this.$iconStart = num;
        this.$label = str;
        this.$iconEnd = num2;
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
            C35528Qt0.m87816Z(1996772677, i, -1, "com.stripe.android.link.ui.PrimaryButton.<anonymous> (PrimaryButton.kt:98)");
        }
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m94182k = ND3.m94182k(c20912a, 0.0f, C43705k61.m29303g(16), 1, null);
        Function0<Unit> function0 = this.$onButtonClick;
        PrimaryButtonState primaryButtonState = this.$state;
        int i2 = this.$$dirty;
        Integer num = this.$iconStart;
        String str = this.$label;
        Integer num2 = this.$iconEnd;
        interfaceC32720Et0.mo89638F(733328855);
        InterfaceC51579xO2 m44729h = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, interfaceC32720Et0, 0);
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
        interfaceC32720Et0.mo89638F(-524128181);
        InterfaceC41563gV2 m114255n = BB5.m114255n(BB5.m114254o(c20912a, ThemeKt.getPrimaryButtonHeight()), 0.0f, 1, null);
        boolean z = primaryButtonState == PrimaryButtonState.Enabled;
        C42528i70 c42528i70 = C42528i70.f86761a;
        float f = 0;
        float m29303g = C43705k61.m29303g(f);
        float m29303g2 = C43705k61.m29303g(f);
        float m29303g3 = C43705k61.m29303g(f);
        float m29303g4 = C43705k61.m29303g(f);
        float m29303g5 = C43705k61.m29303g(f);
        int i3 = C42528i70.f86772l;
        InterfaceC43121j70 m34438b = c42528i70.m34438b(m29303g, m29303g2, m29303g3, m29303g4, m29303g5, interfaceC32720Et0, (i3 << 15) | 28086, 0);
        TM2 tm2 = TM2.f35372a;
        int i4 = TM2.f35373b;
        C43714k70.m29278a(function0, m114255n, z, null, m34438b, ThemeKt.getLinkShapes(tm2, interfaceC32720Et0, i4).getMedium(), null, c42528i70.m34439a(tm2.m83731a(interfaceC32720Et0, i4).m94900j(), 0L, tm2.m83731a(interfaceC32720Et0, i4).m94900j(), 0L, interfaceC32720Et0, i3 << 12, 10), null, C43575jt0.m29791b(interfaceC32720Et0, -1930017733, true, new PrimaryButtonKt$PrimaryButton$2$1$1(primaryButtonState, num, i2, str, num2)), interfaceC32720Et0, ((i2 >> 6) & 14) | 805306416, 328);
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
