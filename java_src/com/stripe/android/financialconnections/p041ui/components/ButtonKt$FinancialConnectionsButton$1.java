package com.stripe.android.financialconnections.p041ui.components;

import com.stripe.android.financialconnections.p041ui.components.FinancialConnectionsButton;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\ncom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,241:1\n154#2:242\n154#2:243\n154#2:244\n154#2:245\n154#2:246\n*S KotlinDebug\n*F\n+ 1 Button.kt\ncom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1\n*L\n57#1:242\n58#1:243\n59#1:244\n60#1:245\n61#1:246\n*E\n"})
/* renamed from: com.stripe.android.financialconnections.ui.components.ButtonKt$FinancialConnectionsButton$1 */
/* loaded from: classes7.dex */
public final class ButtonKt$FinancialConnectionsButton$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> $content;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $loading;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ FinancialConnectionsButton.Size $size;
    final /* synthetic */ FinancialConnectionsButton.Type $type;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.ui.components.ButtonKt$FinancialConnectionsButton$1$1 */
    /* loaded from: classes7.dex */
    public static final class C189301 extends Lambda implements Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> $content;
        final /* synthetic */ boolean $loading;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\ncom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1$1$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,241:1\n74#2,7:242\n81#2:275\n85#2:283\n75#3:249\n76#3,11:251\n89#3:282\n76#4:250\n460#5,13:262\n473#5,3:279\n154#6:276\n154#6:277\n154#6:278\n*S KotlinDebug\n*F\n+ 1 Button.kt\ncom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1$1$1\n*L\n74#1:242,7\n74#1:275\n74#1:283\n74#1:249\n74#1:251,11\n74#1:282\n74#1:250\n74#1:262,13\n74#1:279,3\n77#1:276\n78#1:277\n81#1:278\n*E\n"})
        /* renamed from: com.stripe.android.financialconnections.ui.components.ButtonKt$FinancialConnectionsButton$1$1$1 */
        /* loaded from: classes7.dex */
        public static final class C189311 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
            final /* synthetic */ int $$dirty;
            final /* synthetic */ Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> $content;
            final /* synthetic */ boolean $loading;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C189311(boolean z, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
                super(2);
                this.$loading = z;
                this.$content = function3;
                this.$$dirty = i;
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
                    C35528Qt0.m87816Z(1977438199, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.<anonymous>.<anonymous>.<anonymous> (Button.kt:72)");
                }
                boolean z = this.$loading;
                Function3<InterfaceC37486Zc5, InterfaceC32720Et0, Integer, Unit> function3 = this.$content;
                int i2 = this.$$dirty;
                interfaceC32720Et0.mo89638F(693286680);
                InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
                InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(C25777lo.f96729a.m26803f(), InterfaceC4360K9.f19170a.m99135k(), interfaceC32720Et0, 0);
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
                C38680bf6.m64191b(m64192a, m74813a, c0757a.m113412d());
                C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
                C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
                C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
                interfaceC32720Et0.mo89530q();
                m115273a.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
                interfaceC32720Et0.mo89638F(2058660585);
                interfaceC32720Et0.mo89638F(-678309503);
                C38066ad5 c38066ad5 = C38066ad5.f50835a;
                interfaceC32720Et0.mo89638F(1952956179);
                interfaceC32720Et0.mo89638F(1335092431);
                if (z) {
                    K74.m99208b(BB5.m114246w(c20912a, C43705k61.m29303g(21)), FinancialConnectionsTheme.INSTANCE.getColors(interfaceC32720Et0, 6).m116476getTextWhite0d7_KjU(), C43705k61.m29303g(4), interfaceC32720Et0, 390, 0);
                    DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(8)), interfaceC32720Et0, 6);
                }
                interfaceC32720Et0.mo89605Q();
                function3.invoke(c38066ad5, interfaceC32720Et0, Integer.valueOf(((i2 >> 15) & 112) | 6));
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
        /* JADX WARN: Multi-variable type inference failed */
        public C189301(boolean z, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3, int i) {
            super(3);
            this.$loading = z;
            this.$content = function3;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC37486Zc5 interfaceC37486Zc5, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC37486Zc5, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC37486Zc5 Button, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            G26 m105921d;
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
                interfaceC32720Et0.mo89548k();
                return;
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(2103161800, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.<anonymous>.<anonymous> (Button.kt:66)");
            }
            m105921d = r3.m105921d((r42 & 1) != 0 ? r3.f10827a.m105168g() : 0L, (r42 & 2) != 0 ? r3.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r3.f10827a.m105161n() : null, (r42 & 8) != 0 ? r3.f10827a.m105163l() : null, (r42 & 16) != 0 ? r3.f10827a.m105162m() : null, (r42 & 32) != 0 ? r3.f10827a.m105166i() : null, (r42 & 64) != 0 ? r3.f10827a.m105165j() : null, (r42 & 128) != 0 ? r3.f10827a.m105160o() : N26.m94414f(0), (r42 & 256) != 0 ? r3.f10827a.m105170e() : null, (r42 & 512) != 0 ? r3.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r3.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r3.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r3.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r3.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r3.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r3.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r3.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? FinancialConnectionsTheme.INSTANCE.getTypography(interfaceC32720Et0, 6).getBodyEmphasized().f10828b.m110649m() : null);
            C38909c26.m62004a(m105921d, C43575jt0.m29791b(interfaceC32720Et0, 1977438199, true, new C189311(this.$loading, this.$content, this.$$dirty)), interfaceC32720Et0, 48);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonKt$FinancialConnectionsButton$1(FinancialConnectionsButton.Size size, int i, FinancialConnectionsButton.Type type, Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, boolean z, boolean z2, Function3<? super InterfaceC37486Zc5, ? super InterfaceC32720Et0, ? super Integer, Unit> function3) {
        super(2);
        this.$size = size;
        this.$$dirty = i;
        this.$type = type;
        this.$onClick = function0;
        this.$modifier = interfaceC41563gV2;
        this.$enabled = z;
        this.$loading = z2;
        this.$content = function3;
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
            C35528Qt0.m87816Z(862168024, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.<anonymous> (Button.kt:51)");
        }
        float f = 0;
        InterfaceC43121j70 m34438b = C42528i70.f86761a.m34438b(C43705k61.m29303g(f), C43705k61.m29303g(f), C43705k61.m29303g(f), C43705k61.m29303g(f), C43705k61.m29303g(f), interfaceC32720Et0, (C42528i70.f86772l << 15) | 28086, 0);
        C38649bc5 m61172d = C39242cc5.m61172d(this.$size.mo116430getRadiusD9Ej5fM());
        PD3 paddingValues = this.$size.paddingValues(interfaceC32720Et0, (this.$$dirty >> 9) & 14);
        InterfaceC41935h70 buttonColors = this.$type.buttonColors(interfaceC32720Et0, (this.$$dirty >> 6) & 14);
        Function0<Unit> function0 = this.$onClick;
        InterfaceC41563gV2 interfaceC41563gV2 = this.$modifier;
        boolean z = this.$enabled;
        InterfaceC42389ht0 m29791b = C43575jt0.m29791b(interfaceC32720Et0, 2103161800, true, new C189301(this.$loading, this.$content, this.$$dirty));
        int i2 = this.$$dirty;
        C43714k70.m29278a(function0, interfaceC41563gV2, z, null, m34438b, m61172d, null, buttonColors, paddingValues, m29791b, interfaceC32720Et0, ((i2 >> 6) & 896) | (i2 & 14) | 805306368 | (i2 & 112), 72);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
