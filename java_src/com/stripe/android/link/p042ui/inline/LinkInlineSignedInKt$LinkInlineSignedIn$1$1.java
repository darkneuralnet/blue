package com.stripe.android.link.p042ui.inline;

import com.stripe.android.link.C18975R;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLinkInlineSignedIn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkInlineSignedIn.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,95:1\n67#2,6:96\n73#2:128\n77#2:211\n75#3:102\n76#3,11:104\n75#3:136\n76#3,11:138\n75#3:170\n76#3,11:172\n89#3:200\n89#3:205\n89#3:210\n76#4:103\n76#4:137\n76#4:171\n460#5,13:115\n460#5,13:149\n460#5,13:183\n473#5,3:197\n473#5,3:202\n473#5,3:207\n154#6:129\n154#6:163\n154#6:164\n74#7,6:130\n80#7:162\n84#7:206\n76#8,5:165\n81#8:196\n85#8:201\n*S KotlinDebug\n*F\n+ 1 LinkInlineSignedIn.kt\ncom/stripe/android/link/ui/inline/LinkInlineSignedInKt$LinkInlineSignedIn$1$1\n*L\n46#1:96,6\n46#1:128\n46#1:211\n46#1:102\n46#1:104,11\n60#1:136\n60#1:138,11\n73#1:170\n73#1:172,11\n73#1:200\n60#1:205\n46#1:210\n46#1:103\n60#1:137\n73#1:171\n46#1:115,13\n60#1:149,13\n73#1:183,13\n73#1:197,3\n60#1:202,3\n46#1:207,3\n63#1:129\n67#1:163\n71#1:164\n60#1:130,6\n60#1:162\n60#1:206\n73#1:165,5\n73#1:196\n73#1:201\n*E\n"})
/* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignedInKt$LinkInlineSignedIn$1$1 */
/* loaded from: classes7.dex */
public final class LinkInlineSignedInKt$LinkInlineSignedIn$1$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ InterfaceC48627sP5<String> $accountEmail;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ Function0<Unit> $onLogout;
    final /* synthetic */ InlineSignupViewModel $viewModel;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignedInKt$LinkInlineSignedIn$1$1$1 */
    /* loaded from: classes7.dex */
    public static final class C190261 extends Lambda implements Function1<InterfaceC48906ss5, Unit> {
        public static final C190261 INSTANCE = new C190261();

        public C190261() {
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
            C47128ps5.m18605U(semantics, "SignedInBox");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignedInKt$LinkInlineSignedIn$1$1(InterfaceC41563gV2 interfaceC41563gV2, InterfaceC48627sP5<String> interfaceC48627sP5, InlineSignupViewModel inlineSignupViewModel, Function0<Unit> function0) {
        super(2);
        this.$modifier = interfaceC41563gV2;
        this.$accountEmail = interfaceC48627sP5;
        this.$viewModel = inlineSignupViewModel;
        this.$onLogout = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        G26 m105921d;
        if ((i & 11) == 2 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1660901673, i, -1, "com.stripe.android.link.ui.inline.LinkInlineSignedIn.<anonymous>.<anonymous> (LinkInlineSignedIn.kt:44)");
        }
        InterfaceC41563gV2 interfaceC41563gV2 = this.$modifier;
        TM2 tm2 = TM2.f35372a;
        int i2 = TM2.f35373b;
        InterfaceC41563gV2 m40620b = C41198fs5.m40620b(C13342bw.m62125c(C19783dZ.m44156f(interfaceC41563gV2, StripeThemeKt.getBorderStroke(tm2, false, interfaceC32720Et0, i2 | 48), ThemeKt.getLinkShapes(tm2, interfaceC32720Et0, i2).getSmall()), StripeThemeKt.getStripeColors(tm2, interfaceC32720Et0, i2).m116695getComponent0d7_KjU(), ThemeKt.getLinkShapes(tm2, interfaceC32720Et0, i2).getSmall()), false, C190261.INSTANCE, 1, null);
        InterfaceC48627sP5<String> interfaceC48627sP5 = this.$accountEmail;
        InlineSignupViewModel inlineSignupViewModel = this.$viewModel;
        Function0<Unit> function0 = this.$onLogout;
        interfaceC32720Et0.mo89638F(733328855);
        InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
        InterfaceC51579xO2 m44729h = C39504d10.m44729h(c4361a.m99132n(), false, interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m40620b);
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
        interfaceC32720Et0.mo89638F(366346845);
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        float f = 16;
        InterfaceC41563gV2 m94184i = ND3.m94184i(BB5.m114255n(c20912a, 0.0f, 1, null), C43705k61.m29303g(f));
        interfaceC32720Et0.mo89638F(-483455358);
        C25777lo c25777lo = C25777lo.f96729a;
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94184i);
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
        C38680bf6.m64191b(m64192a2, m91546a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
        interfaceC32720Et0.mo89530q();
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-1163856341);
        C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
        interfaceC32720Et0.mo89638F(-605433901);
        C38909c26.m62000e(C40946fS5.m41310c(C18975R.string.this_card_will_be_saved, interfaceC32720Et0, 0), ND3.m94180m(c20912a, 0.0f, 0.0f, 0.0f, C43705k61.m29303g(f), 7, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et0, 48, 0, 65532);
        L51.m97795a(ND3.m94180m(c20912a, 0.0f, 0.0f, 0.0f, C43705k61.m29303g(f), 7, null), C47063pm0.m18743m(StripeThemeKt.getStripeColors(tm2, interfaceC32720Et0, i2).m116696getComponentBorder0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, 0.0f, interfaceC32720Et0, 6, 12);
        C25777lo.InterfaceC25782e m26805d = c25777lo.m26805d();
        InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a, 0.0f, 1, null);
        interfaceC32720Et0.mo89638F(693286680);
        InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26805d, c4361a.m99135k(), interfaceC32720Et0, 6);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a3 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(m114255n);
        if (!(interfaceC32720Et0.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        interfaceC32720Et0.mo89557h();
        if (interfaceC32720Et0.mo89521t()) {
            interfaceC32720Et0.mo89617M(m113415a3);
        } else {
            interfaceC32720Et0.mo89566e();
        }
        interfaceC32720Et0.mo89620L();
        InterfaceC32720Et0 m64192a3 = C38680bf6.m64192a(interfaceC32720Et0);
        C38680bf6.m64191b(m64192a3, m74813a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a.m113414b());
        C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a.m113413c());
        C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a.m113410f());
        interfaceC32720Et0.mo89530q();
        m115273a3.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-678309503);
        C38066ad5 c38066ad5 = C38066ad5.f50835a;
        interfaceC32720Et0.mo89638F(317490743);
        String value = interfaceC48627sP5.getValue();
        if (value == null) {
            value = "";
        }
        C38909c26.m62000e(value, null, StripeThemeKt.getStripeColors(tm2, interfaceC32720Et0, i2).m116700getSubtitle0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et0, 0, 0, 65530);
        C1577Df c1577Df = new C1577Df(C40946fS5.m41310c(C18975R.string.logout, interfaceC32720Et0, 0), null, null, 6, null);
        m105921d = r37.m105921d((r42 & 1) != 0 ? r37.f10827a.m105168g() : tm2.m83731a(interfaceC32720Et0, i2).m94900j(), (r42 & 2) != 0 ? r37.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r37.f10827a.m105161n() : null, (r42 & 8) != 0 ? r37.f10827a.m105163l() : null, (r42 & 16) != 0 ? r37.f10827a.m105162m() : null, (r42 & 32) != 0 ? r37.f10827a.m105166i() : null, (r42 & 64) != 0 ? r37.f10827a.m105165j() : null, (r42 & 128) != 0 ? r37.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r37.f10827a.m105170e() : null, (r42 & 512) != 0 ? r37.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r37.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r37.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r37.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r37.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r37.f10828b.m110652j() : null, (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r37.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r37.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? G26.f10825d.m105898a().f10828b.m110649m() : null);
        C39317ck0.m61011a(c1577Df, null, m105921d, false, 0, 0, null, new LinkInlineSignedInKt$LinkInlineSignedIn$1$1$2$1$1$1(inlineSignupViewModel, function0), interfaceC32720Et0, 0, 122);
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89563f();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89563f();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
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
