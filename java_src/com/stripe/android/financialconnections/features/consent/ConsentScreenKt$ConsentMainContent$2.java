package com.stripe.android.financialconnections.features.consent;

import com.stripe.android.financialconnections.features.common.ModalBottomSheetContentKt;
import com.stripe.android.financialconnections.features.consent.ConsentState;
import com.stripe.android.financialconnections.p041ui.TextResource;
import com.stripe.android.financialconnections.p041ui.components.StringAnnotation;
import com.stripe.android.financialconnections.p041ui.components.TextKt;
import com.stripe.android.financialconnections.p041ui.sdui.BulletUI;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
@SourceDebugExtension({"SMAP\nConsentScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,558:1\n74#2,6:559\n80#2:591\n74#2,6:596\n80#2:628\n84#2:653\n84#2:658\n75#3:565\n76#3,11:567\n75#3:602\n76#3,11:604\n89#3:652\n89#3:657\n76#4:566\n76#4:603\n460#5,13:578\n460#5,13:615\n36#5:630\n36#5:638\n473#5,3:649\n473#5,3:654\n154#6:592\n154#6:593\n154#6:594\n154#6:595\n154#6:629\n154#6:637\n154#6:645\n154#6:647\n1057#7,6:631\n1057#7,6:639\n1855#8:646\n1856#8:648\n*S KotlinDebug\n*F\n+ 1 ConsentScreen.kt\ncom/stripe/android/financialconnections/features/consent/ConsentScreenKt$ConsentMainContent$2\n*L\n183#1:559,6\n183#1:591\n186#1:596,6\n186#1:628\n186#1:653\n183#1:658\n183#1:565\n183#1:567,11\n186#1:602\n186#1:604,11\n186#1:652\n183#1:657\n183#1:566\n186#1:603\n183#1:578,13\n186#1:615,13\n206#1:630\n221#1:638\n186#1:649,3\n183#1:654,3\n191#1:592\n192#1:593\n193#1:594\n194#1:595\n203#1:629\n218#1:637\n229#1:645\n232#1:647\n206#1:631,6\n221#1:639,6\n231#1:646\n231#1:648\n*E\n"})
/* loaded from: classes7.dex */
public final class ConsentScreenKt$ConsentMainContent$2 extends Lambda implements Function3<PD3, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ AbstractC19862dp<Unit> $acceptConsent;
    final /* synthetic */ List<BulletUI> $bullets;
    final /* synthetic */ Function1<String, Unit> $onClickableTextClick;
    final /* synthetic */ Function0<Unit> $onContinueClick;
    final /* synthetic */ ConsentState.Payload $payload;
    final /* synthetic */ C37135Xp5 $scrollState;
    final /* synthetic */ TextResource.Text $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConsentScreenKt$ConsentMainContent$2(C37135Xp5 c37135Xp5, ConsentState.Payload payload, AbstractC19862dp<Unit> abstractC19862dp, Function1<? super String, Unit> function1, Function0<Unit> function0, int i, TextResource.Text text, List<BulletUI> list) {
        super(3);
        this.$scrollState = c37135Xp5;
        this.$payload = payload;
        this.$acceptConsent = abstractC19862dp;
        this.$onClickableTextClick = function1;
        this.$onContinueClick = function0;
        this.$$dirty = i;
        this.$title = text;
        this.$bullets = list;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PD3 pd3, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(pd3, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r53v0, types: [Et0, java.lang.Object] */
    public final void invoke(PD3 it, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Function0<Unit> function0;
        Function1<String, Unit> function1;
        AbstractC19862dp<Unit> abstractC19862dp;
        ConsentState.Payload payload;
        int i2;
        GN5 m105174a;
        Map mapOf;
        G26 m105921d;
        GN5 m105174a2;
        Map mapOf2;
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 81) == 16 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1247451114, i, -1, "com.stripe.android.financialconnections.features.consent.ConsentMainContent.<anonymous> (ConsentScreen.kt:181)");
        }
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m114257l = BB5.m114257l(c20912a, 0.0f, 1, null);
        C37135Xp5 c37135Xp5 = this.$scrollState;
        ConsentState.Payload payload2 = this.$payload;
        AbstractC19862dp<Unit> abstractC19862dp2 = this.$acceptConsent;
        Function1<String, Unit> function12 = this.$onClickableTextClick;
        Function0<Unit> function02 = this.$onContinueClick;
        int i3 = this.$$dirty;
        TextResource.Text text = this.$title;
        List<BulletUI> list = this.$bullets;
        interfaceC32720Et0.mo89638F(-483455358);
        C25777lo c25777lo = C25777lo.f96729a;
        C25777lo.InterfaceC25789l m26802g = c25777lo.m26802g();
        InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(m26802g, c4361a.m99136j(), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114257l);
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
        interfaceC32720Et0.mo89638F(-970309536);
        float f = 24;
        InterfaceC41563gV2 m94181l = ND3.m94181l(C36433Up5.m80787d(InterfaceC35231Pm0.m89798b(c35465Qm0, c20912a, 1.0f, false, 2, null), c37135Xp5, false, null, false, 14, null), C43705k61.m29303g(f), C43705k61.m29303g(0), C43705k61.m29303g(f), C43705k61.m29303g(f));
        interfaceC32720Et0.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) interfaceC32720Et0.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) interfaceC32720Et0.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) interfaceC32720Et0.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94181l);
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
        C38680bf6.m64191b(m64192a2, m91546a2, c0757a.m113412d());
        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
        interfaceC32720Et0.mo89530q();
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(interfaceC32720Et0)), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89638F(2058660585);
        interfaceC32720Et0.mo89638F(-1163856341);
        interfaceC32720Et0.mo89638F(-435963434);
        if (payload2.getShouldShowMerchantLogos()) {
            interfaceC32720Et0.mo89638F(-861790309);
            ConsentScreenKt.ConsentLogoHeader(c35465Qm0.mo87991c(c20912a, c4361a.m99139g()), payload2.getMerchantLogos(), interfaceC32720Et0, 64, 0);
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(20)), interfaceC32720Et0, 6);
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n = interfaceC32720Et0.mo89539n(function12);
            Object mo89635G = interfaceC32720Et0.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new ConsentScreenKt$ConsentMainContent$2$1$1$1$1(function12);
                interfaceC32720Et0.mo89503z(mo89635G);
            }
            interfaceC32720Et0.mo89605Q();
            FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
            m105921d = r25.m105921d((r42 & 1) != 0 ? r25.f10827a.m105168g() : 0L, (r42 & 2) != 0 ? r25.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r25.f10827a.m105161n() : null, (r42 & 8) != 0 ? r25.f10827a.m105163l() : null, (r42 & 16) != 0 ? r25.f10827a.m105162m() : null, (r42 & 32) != 0 ? r25.f10827a.m105166i() : null, (r42 & 64) != 0 ? r25.f10827a.m105165j() : null, (r42 & 128) != 0 ? r25.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r25.f10827a.m105170e() : null, (r42 & 512) != 0 ? r25.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r25.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r25.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r25.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r25.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r25.f10828b.m110652j() : C47801r06.m16685g(C47801r06.f106195b.m16678a()), (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r25.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r25.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? financialConnectionsTheme.getTypography(interfaceC32720Et0, 6).getSubtitle().f10828b.m110649m() : null);
            StringAnnotation stringAnnotation = StringAnnotation.CLICKABLE;
            m105174a2 = r25.m105174a((r35 & 1) != 0 ? r25.m105168g() : financialConnectionsTheme.getColors(interfaceC32720Et0, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r25.f11830b : 0L, (r35 & 4) != 0 ? r25.f11831c : null, (r35 & 8) != 0 ? r25.f11832d : null, (r35 & 16) != 0 ? r25.f11833e : null, (r35 & 32) != 0 ? r25.f11834f : null, (r35 & 64) != 0 ? r25.f11835g : null, (r35 & 128) != 0 ? r25.f11836h : 0L, (r35 & 256) != 0 ? r25.f11837i : null, (r35 & 512) != 0 ? r25.f11838j : null, (r35 & 1024) != 0 ? r25.f11839k : null, (r35 & 2048) != 0 ? r25.f11840l : 0L, (r35 & 4096) != 0 ? r25.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme.getTypography(interfaceC32720Et0, 6).getSubtitle().m105925L().f11842n : null);
            mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(stringAnnotation, m105174a2));
            i2 = i3;
            function0 = function02;
            function1 = function12;
            abstractC19862dp = abstractC19862dp2;
            payload = payload2;
            TextKt.AnnotatedText(text, mo89635G, m105921d, null, mapOf2, interfaceC32720Et0, 8, 8);
            interfaceC32720Et0.mo89605Q();
        } else {
            function0 = function02;
            function1 = function12;
            abstractC19862dp = abstractC19862dp2;
            payload = payload2;
            i2 = i3;
            interfaceC32720Et0.mo89638F(-861789394);
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(16)), interfaceC32720Et0, 6);
            interfaceC32720Et0.mo89638F(1157296644);
            boolean mo89539n2 = interfaceC32720Et0.mo89539n(function1);
            Object mo89635G2 = interfaceC32720Et0.mo89635G();
            if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G2 = new ConsentScreenKt$ConsentMainContent$2$1$1$2$1(function1);
                interfaceC32720Et0.mo89503z(mo89635G2);
            }
            interfaceC32720Et0.mo89605Q();
            FinancialConnectionsTheme financialConnectionsTheme2 = FinancialConnectionsTheme.INSTANCE;
            G26 subtitle = financialConnectionsTheme2.getTypography(interfaceC32720Et0, 6).getSubtitle();
            StringAnnotation stringAnnotation2 = StringAnnotation.CLICKABLE;
            m105174a = r25.m105174a((r35 & 1) != 0 ? r25.m105168g() : financialConnectionsTheme2.getColors(interfaceC32720Et0, 6).m116469getTextBrand0d7_KjU(), (r35 & 2) != 0 ? r25.f11830b : 0L, (r35 & 4) != 0 ? r25.f11831c : null, (r35 & 8) != 0 ? r25.f11832d : null, (r35 & 16) != 0 ? r25.f11833e : null, (r35 & 32) != 0 ? r25.f11834f : null, (r35 & 64) != 0 ? r25.f11835g : null, (r35 & 128) != 0 ? r25.f11836h : 0L, (r35 & 256) != 0 ? r25.f11837i : null, (r35 & 512) != 0 ? r25.f11838j : null, (r35 & 1024) != 0 ? r25.f11839k : null, (r35 & 2048) != 0 ? r25.f11840l : 0L, (r35 & 4096) != 0 ? r25.f11841m : null, (r35 & 8192) != 0 ? financialConnectionsTheme2.getTypography(interfaceC32720Et0, 6).getSubtitle().m105925L().f11842n : null);
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(stringAnnotation2, m105174a));
            TextKt.AnnotatedText(text, (Function1) mo89635G2, subtitle, null, mapOf, interfaceC32720Et0, 8, 8);
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f)), interfaceC32720Et0, 6);
            interfaceC32720Et0.mo89605Q();
        }
        interfaceC32720Et0.mo89638F(-861788683);
        for (BulletUI bulletUI : list) {
            DN5.m110552a(BB5.m114246w(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(16)), interfaceC32720Et0, 6);
            ModalBottomSheetContentKt.BulletItem(bulletUI, function1, interfaceC32720Et0, (i2 >> 3) & 112);
        }
        interfaceC32720Et0.mo89605Q();
        DN5.m110552a(InterfaceC35231Pm0.m89798b(c35465Qm0, InterfaceC41563gV2.f82354b0, 1.0f, false, 2, null), interfaceC32720Et0, 0);
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89563f();
        interfaceC32720Et0.mo89605Q();
        interfaceC32720Et0.mo89605Q();
        ConsentScreenKt.ConsentFooter(abstractC19862dp, payload.getConsent(), function1, function0, interfaceC32720Et0, (i2 & 896) | 72 | (i2 & 7168));
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
