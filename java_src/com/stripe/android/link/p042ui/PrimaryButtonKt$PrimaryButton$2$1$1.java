package com.stripe.android.link.p042ui;

import com.stripe.android.link.C18975R;
import com.stripe.android.link.theme.ThemeKt;
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
import p000.InterfaceC4360K9;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,206:1\n154#2:207\n154#2:208\n154#2:209\n75#3,6:210\n81#3:242\n85#3:248\n75#4:216\n76#4,11:218\n89#4:247\n76#5:217\n76#5:243\n460#6,13:229\n473#6,3:244\n*S KotlinDebug\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/link/ui/PrimaryButtonKt$PrimaryButton$2$1$1\n*L\n117#1:207\n122#1:208\n128#1:209\n134#1:210,6\n134#1:242\n134#1:248\n134#1:216\n134#1:218,11\n134#1:247\n134#1:217\n143#1:243\n134#1:229,13\n134#1:244,3\n*E\n"})
/* renamed from: com.stripe.android.link.ui.PrimaryButtonKt$PrimaryButton$2$1$1 */
/* loaded from: classes7.dex */
public final class PrimaryButtonKt$PrimaryButton$2$1$1 extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Integer $iconEnd;
    final /* synthetic */ Integer $iconStart;
    final /* synthetic */ String $label;
    final /* synthetic */ PrimaryButtonState $state;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.PrimaryButtonKt$PrimaryButton$2$1$1$1 */
    /* loaded from: classes7.dex */
    public static final class C190041 extends Lambda implements Function1<InterfaceC48906ss5, Unit> {
        public static final C190041 INSTANCE = new C190041();

        public C190041() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC48906ss5 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            C47128ps5.m18605U(semantics, PrimaryButtonKt.progressIndicatorTestTag);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.PrimaryButtonKt$PrimaryButton$2$1$1$2 */
    /* loaded from: classes7.dex */
    public static final class C190052 extends Lambda implements Function1<InterfaceC48906ss5, Unit> {
        public static final C190052 INSTANCE = new C190052();

        public C190052() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC48906ss5 interfaceC48906ss5) {
            invoke2(interfaceC48906ss5);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(InterfaceC48906ss5 semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            C47128ps5.m18605U(semantics, PrimaryButtonKt.completedIconTestTag);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.PrimaryButtonKt$PrimaryButton$2$1$1$WhenMappings */
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PrimaryButtonState.values().length];
            try {
                iArr[PrimaryButtonState.Processing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimaryButtonState.Completed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButtonKt$PrimaryButton$2$1$1(PrimaryButtonState primaryButtonState, Integer num, int i, String str, Integer num2) {
        super(3);
        this.$state = primaryButtonState;
        this.$iconStart = num;
        this.$$dirty = i;
        this.$label = str;
        this.$iconEnd = num2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC37486Zc5 Button, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1930017733, i, -1, "com.stripe.android.link.ui.PrimaryButton.<anonymous>.<anonymous>.<anonymous> (PrimaryButton.kt:112)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.$state.ordinal()];
        if (i2 == 1) {
            interfaceC32720Et0.mo89638F(-1127963156);
            K74.m99208b(C41198fs5.m40620b(BB5.m114246w(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(18)), false, C190041.INSTANCE, 1, null), ThemeKt.getLinkColors(TM2.f35372a, interfaceC32720Et0, TM2.f35373b).m116530getButtonLabel0d7_KjU(), C43705k61.m29303g(2), interfaceC32720Et0, 384, 0);
            interfaceC32720Et0.mo89605Q();
        } else if (i2 != 2) {
            interfaceC32720Et0.mo89638F(-1127962238);
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a, 0.0f, 1, null);
            InterfaceC4360K9.InterfaceC4363c m99138h = InterfaceC4360K9.f19170a.m99138h();
            Integer num = this.$iconStart;
            int i3 = this.$$dirty;
            String str = this.$label;
            Integer num2 = this.$iconEnd;
            interfaceC32720Et0.mo89638F(693286680);
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), m99138h, interfaceC32720Et0, 48);
            interfaceC32720Et0.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114255n);
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
            interfaceC32720Et0.mo89638F(884451894);
            PrimaryButtonKt.PrimaryButtonIcon(num, interfaceC32720Et0, (i3 >> 9) & 14);
            C38909c26.m62000e(str, InterfaceC37486Zc5.m72851b(c38066ad5, c20912a, 1.0f, false, 2, null), C47063pm0.m18743m(ThemeKt.getLinkColors(TM2.f35372a, interfaceC32720Et0, TM2.f35373b).m116530getButtonLabel0d7_KjU(), ((Number) interfaceC32720Et0.mo89572c(C37220Xz0.m75931a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), 0L, null, null, null, 0L, null, C47801r06.m16685g(C47801r06.f106195b.m16678a()), 0L, 0, false, 0, null, null, interfaceC32720Et0, i3 & 14, 0, 65016);
            PrimaryButtonKt.PrimaryButtonIcon(num2, interfaceC32720Et0, (i3 >> 12) & 14);
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89563f();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
            interfaceC32720Et0.mo89605Q();
        } else {
            interfaceC32720Et0.mo89638F(-1127962718);
            DP1.m110533b(C46748pE3.m19793d(C18975R.C18976drawable.ic_link_complete, interfaceC32720Et0, 0), null, C41198fs5.m40620b(BB5.m114246w(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(24)), false, C190052.INSTANCE, 1, null), ThemeKt.getLinkColors(TM2.f35372a, interfaceC32720Et0, TM2.f35373b).m116530getButtonLabel0d7_KjU(), interfaceC32720Et0, 56, 0);
            interfaceC32720Et0.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
