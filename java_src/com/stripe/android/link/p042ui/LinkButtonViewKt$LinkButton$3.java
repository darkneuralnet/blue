package com.stripe.android.link.p042ui;

import com.stripe.android.link.C18975R;
import com.stripe.android.link.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.LinkButtonViewKt$LinkButton$3 */
/* loaded from: classes7.dex */
public final class LinkButtonViewKt$LinkButton$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $email;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function0<Unit> $onClick;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLinkButtonView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,166:1\n154#2:167\n*S KotlinDebug\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1\n*L\n80#1:167\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.LinkButtonViewKt$LinkButton$3$1 */
    /* loaded from: classes7.dex */
    public static final class C190021 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ String $email;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ InterfaceC41563gV2 $modifier;
        final /* synthetic */ Function0<Unit> $onClick;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nLinkButtonView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,166:1\n154#2:167\n154#2:168\n154#2:169\n154#2:204\n76#3:170\n76#3:178\n67#4,6:171\n73#4:203\n77#4:209\n75#5:177\n76#5,11:179\n89#5:208\n460#6,13:190\n473#6,3:205\n*S KotlinDebug\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1$1\n*L\n97#1:167\n99#1:168\n100#1:169\n117#1:204\n103#1:170\n107#1:178\n107#1:171,6\n107#1:203\n107#1:209\n107#1:177\n107#1:179,11\n107#1:208\n107#1:190,13\n107#1:205,3\n*E\n"})
        /* renamed from: com.stripe.android.link.ui.LinkButtonViewKt$LinkButton$3$1$1 */
        /* loaded from: classes7.dex */
        public static final class C190031 extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ String $email;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C190031(String str) {
                super(3);
                this.$email = str;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
                invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(InterfaceC37486Zc5 Button, InterfaceC32720Et0 interfaceC32720Et0, int i) {
                int i2;
                C38649bc5 c38649bc5;
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i & 14) == 0) {
                    i2 = (interfaceC32720Et0.mo89539n(Button) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
                    interfaceC32720Et0.mo89548k();
                    return;
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87816Z(-1084891396, i, -1, "com.stripe.android.link.ui.LinkButton.<anonymous>.<anonymous>.<anonymous> (LinkButtonView.kt:91)");
                }
                AbstractC45562nE3 m19793d = C46748pE3.m19793d(C18975R.C18976drawable.ic_link_logo, interfaceC32720Et0, 0);
                String m41310c = C40946fS5.m41310c(C18975R.string.link, interfaceC32720Et0, 0);
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                InterfaceC41563gV2 m94183j = ND3.m94183j(BB5.m114254o(c20912a, C43705k61.m29303g(22)), C43705k61.m29303g(5), C43705k61.m29303g(3));
                TM2 tm2 = TM2.f35372a;
                int i3 = TM2.f35373b;
                DP1.m110533b(m19793d, m41310c, m94183j, C47063pm0.m18743m(ThemeKt.getLinkColors(tm2, interfaceC32720Et0, i3).m116530getButtonLabel0d7_KjU(), ((Number) interfaceC32720Et0.mo89572c(C37220Xz0.m75931a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null), interfaceC32720Et0, 392, 0);
                String str = this.$email;
                if (str != null) {
                    DN5.m110552a(InterfaceC37486Zc5.m72851b(Button, c20912a, 1.0f, false, 2, null), interfaceC32720Et0, 0);
                    long m18743m = C47063pm0.m18743m(C47063pm0.f104050b.m18732a(), 0.05f, 0.0f, 0.0f, 0.0f, 14, null);
                    c38649bc5 = LinkButtonViewKt.LinkButtonEmailShape;
                    InterfaceC41563gV2 m62125c = C13342bw.m62125c(c20912a, m18743m, c38649bc5);
                    interfaceC32720Et0.mo89638F(733328855);
                    InterfaceC51579xO2 m44729h = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, interfaceC32720Et0, 0);
                    interfaceC32720Et0.mo89638F(-1323940314);
                    InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
                    EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
                    InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
                    InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
                    Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
                    Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m62125c);
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
                    interfaceC32720Et0.mo89638F(159983040);
                    C38909c26.m62000e(str, ND3.m94184i(c20912a, C43705k61.m29303g(6)), ThemeKt.getLinkColors(tm2, interfaceC32720Et0, i3).m116530getButtonLabel0d7_KjU(), N26.m94414f(14), null, null, null, 0L, null, null, 0L, C45449n26.f99264a.m24539b(), false, 1, null, null, interfaceC32720Et0, 3120, 3120, 55280);
                    interfaceC32720Et0.mo89605Q();
                    interfaceC32720Et0.mo89605Q();
                    interfaceC32720Et0.mo89605Q();
                    interfaceC32720Et0.mo89563f();
                    interfaceC32720Et0.mo89605Q();
                    interfaceC32720Et0.mo89605Q();
                }
                if (C35528Qt0.m87827O()) {
                    C35528Qt0.m87817Y();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190021(Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, boolean z, int i, String str) {
            super(2);
            this.$onClick = function0;
            this.$modifier = interfaceC41563gV2;
            this.$enabled = z;
            this.$$dirty = i;
            this.$email = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            C38649bc5 c38649bc5;
            C38649bc5 c38649bc52;
            float f;
            float f2;
            float f3;
            float f4;
            if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-707323124, i, -1, "com.stripe.android.link.ui.LinkButton.<anonymous>.<anonymous> (LinkButtonView.kt:72)");
            }
            Function0<Unit> function0 = this.$onClick;
            InterfaceC41563gV2 interfaceC41563gV2 = this.$modifier;
            c38649bc5 = LinkButtonViewKt.LinkButtonShape;
            InterfaceC41563gV2 m22000a = C46022o06.m22000a(C35447Qk0.m88106a(interfaceC41563gV2, c38649bc5), LinkButtonViewKt.LinkButtonTestTag);
            boolean z = this.$enabled;
            C42528i70 c42528i70 = C42528i70.f86761a;
            float f5 = 0;
            float m29303g = C43705k61.m29303g(f5);
            float m29303g2 = C43705k61.m29303g(f5);
            float m29303g3 = C43705k61.m29303g(f5);
            float m29303g4 = C43705k61.m29303g(f5);
            float m29303g5 = C43705k61.m29303g(f5);
            int i2 = C42528i70.f86772l;
            InterfaceC43121j70 m34438b = c42528i70.m34438b(m29303g, m29303g2, m29303g3, m29303g4, m29303g5, interfaceC32720Et0, (i2 << 15) | 28086, 0);
            c38649bc52 = LinkButtonViewKt.LinkButtonShape;
            TM2 tm2 = TM2.f35372a;
            int i3 = TM2.f35373b;
            InterfaceC41935h70 m34439a = c42528i70.m34439a(tm2.m83731a(interfaceC32720Et0, i3).m94900j(), 0L, tm2.m83731a(interfaceC32720Et0, i3).m94900j(), 0L, interfaceC32720Et0, i2 << 12, 10);
            f = LinkButtonViewKt.LinkButtonHorizontalPadding;
            f2 = LinkButtonViewKt.LinkButtonVerticalPadding;
            f3 = LinkButtonViewKt.LinkButtonHorizontalPadding;
            f4 = LinkButtonViewKt.LinkButtonVerticalPadding;
            PD3 m94189d = ND3.m94189d(f, f2, f3, f4);
            InterfaceC42389ht0 m29791b = C43575jt0.m29791b(interfaceC32720Et0, -1084891396, true, new C190031(this.$email));
            int i4 = this.$$dirty;
            C43714k70.m29278a(function0, m22000a, z, null, m34438b, c38649bc52, null, m34439a, m94189d, m29791b, interfaceC32720Et0, ((i4 >> 6) & 14) | 906166272 | ((i4 << 3) & 896), 72);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkButtonViewKt$LinkButton$3(Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, boolean z, int i, String str) {
        super(2);
        this.$onClick = function0;
        this.$modifier = interfaceC41563gV2;
        this.$enabled = z;
        this.$$dirty = i;
        this.$email = str;
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
            C35528Qt0.m87816Z(-84206960, i, -1, "com.stripe.android.link.ui.LinkButton.<anonymous> (LinkButtonView.kt:71)");
        }
        ThemeKt.DefaultLinkTheme(false, C43575jt0.m29791b(interfaceC32720Et0, -707323124, true, new C190021(this.$onClick, this.$modifier, this.$enabled, this.$$dirty, this.$email)), interfaceC32720Et0, 48, 1);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
