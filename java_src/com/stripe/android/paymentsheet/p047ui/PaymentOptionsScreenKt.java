package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.p042ui.verification.VerificationDialogKt;
import com.stripe.android.p049ui.core.elements.H4TextKt;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreenKt;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.text.HtmlKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "viewModel", "LgV2;", "modifier", "", "PaymentOptionsScreen", "(Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;LgV2;LEt0;II)V", "PaymentOptionsScreenContent", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentOptionsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsScreen.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,96:1\n74#2,6:97\n80#2:129\n84#2:138\n75#3:103\n76#3,11:105\n89#3:137\n76#4:104\n460#5,13:116\n473#5,3:134\n154#6:130\n154#6:131\n154#6:132\n154#6:133\n76#7:139\n76#7:140\n76#7:141\n76#7:142\n76#7:143\n*S KotlinDebug\n*F\n+ 1 PaymentOptionsScreen.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsScreenKt\n*L\n53#1:97,6\n53#1:129\n53#1:138\n53#1:103\n53#1:105,11\n53#1:137\n53#1:104\n53#1:116,13\n53#1:134,3\n67#1:130\n68#1:131\n77#1:132\n91#1:133\n44#1:139\n45#1:140\n47#1:141\n48#1:142\n50#1:143\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentOptionsScreenKt */
/* loaded from: classes7.dex */
public final class PaymentOptionsScreenKt {
    public static final void PaymentOptionsScreen(PaymentOptionsViewModel viewModel, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(438592043);
        if ((i2 & 2) != 0) {
            interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(438592043, i, -1, "com.stripe.android.paymentsheet.ui.PaymentOptionsScreen (PaymentOptionsScreen.kt:25)");
        }
        PaymentSheetScaffoldKt.PaymentSheetScaffold(C43575jt0.m29791b(mo89518u, 1385447695, true, new PaymentOptionsScreenKt$PaymentOptionsScreen$1(viewModel)), C43575jt0.m29791b(mo89518u, 486385061, true, new PaymentOptionsScreenKt$PaymentOptionsScreen$2(viewModel)), interfaceC41563gV2, mo89518u, ((i << 3) & 896) | 54, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentOptionsScreenKt$PaymentOptionsScreen$3(viewModel, interfaceC41563gV2, i, i2));
        }
    }

    public static final void PaymentOptionsScreenContent(PaymentOptionsViewModel viewModel, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        InterfaceC41563gV2.C20912a c20912a;
        G26 m105921d;
        InterfaceC41563gV2 interfaceC41563gV22;
        InterfaceC32720Et0 interfaceC32720Et02;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(342229024);
        if ((i2 & 2) != 0) {
            c20912a = InterfaceC41563gV2.f82354b0;
        } else {
            c20912a = interfaceC41563gV2;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(342229024, i, -1, "com.stripe.android.paymentsheet.ui.PaymentOptionsScreenContent (PaymentOptionsScreen.kt:39)");
        }
        InterfaceC48627sP5 m105206a = GM5.m105206a(viewModel.getHeaderText$paymentsheet_release(), null, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105205b = GM5.m105205b(viewModel.getCurrentScreen(), null, mo89518u, 8, 1);
        InterfaceC48627sP5 m105206a2 = GM5.m105206a(viewModel.getError$paymentsheet_release(), null, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105205b2 = GM5.m105205b(viewModel.getNotesText$paymentsheet_release(), null, mo89518u, 8, 1);
        InterfaceC48627sP5 m105205b3 = GM5.m105205b(viewModel.getLinkHandler().getShowLinkVerificationDialog(), null, mo89518u, 8, 1);
        InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a, 0.0f, 0.0f, 0.0f, H24.m104481a(C19159R.dimen.stripe_paymentsheet_button_container_spacing_bottom, mo89518u, 0), 7, null);
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94180m);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        mo89518u.mo89557h();
        if (mo89518u.mo89521t()) {
            mo89518u.mo89617M(m113415a);
        } else {
            mo89518u.mo89566e();
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a, m91546a, c0757a.m113412d());
        C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
        C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
        C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        C35465Qm0 c35465Qm0 = C35465Qm0.f30887a;
        mo89518u.mo89638F(1512736150);
        mo89518u.mo89638F(175109290);
        if (PaymentOptionsScreenContent$lambda$4(m105205b3)) {
            VerificationDialogKt.LinkVerificationDialog(viewModel.getLinkHandler().getLinkLauncher(), new PaymentOptionsScreenKt$PaymentOptionsScreenContent$1$1(viewModel.getLinkHandler()), mo89518u, LinkPaymentLauncher.$stable);
        }
        mo89518u.mo89605Q();
        Integer PaymentOptionsScreenContent$lambda$0 = PaymentOptionsScreenContent$lambda$0(m105206a);
        mo89518u.mo89638F(175109540);
        if (PaymentOptionsScreenContent$lambda$0 != null) {
            H4TextKt.H4Text(C40946fS5.m41310c(PaymentOptionsScreenContent$lambda$0.intValue(), mo89518u, 0), ND3.m94182k(ND3.m94180m(InterfaceC41563gV2.f82354b0, 0.0f, 0.0f, 0.0f, C43705k61.m29303g(2), 7, null), C43705k61.m29303g(20), 0.0f, 2, null), mo89518u, 48, 0);
        }
        mo89518u.mo89605Q();
        PaymentSheetScreenKt.Content(PaymentOptionsScreenContent$lambda$1(m105205b), viewModel, mo89518u, 64);
        String PaymentOptionsScreenContent$lambda$2 = PaymentOptionsScreenContent$lambda$2(m105206a2);
        mo89518u.mo89638F(175109838);
        if (PaymentOptionsScreenContent$lambda$2 != null) {
            ErrorMessageKt.ErrorMessage(PaymentOptionsScreenContent$lambda$2, ND3.m94182k(InterfaceC41563gV2.f82354b0, 0.0f, C43705k61.m29303g(2), 1, null), mo89518u, 48, 0);
        }
        mo89518u.mo89605Q();
        PaymentOptionsScreenKt$PaymentOptionsScreenContent$1$4 paymentOptionsScreenKt$PaymentOptionsScreenContent$1$4 = PaymentOptionsScreenKt$PaymentOptionsScreenContent$1$4.INSTANCE;
        InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
        C19814de.m43999a(paymentOptionsScreenKt$PaymentOptionsScreenContent$1$4, C46022o06.m22000a(c20912a2, PaymentSheetScreenKt.PAYMENT_SHEET_PRIMARY_BUTTON_TEST_TAG), null, mo89518u, 48, 4);
        String PaymentOptionsScreenContent$lambda$3 = PaymentOptionsScreenContent$lambda$3(m105205b2);
        if (PaymentOptionsScreenContent$lambda$3 == null) {
            interfaceC41563gV22 = c20912a;
            interfaceC32720Et02 = mo89518u;
        } else {
            TM2 tm2 = TM2.f35372a;
            int i3 = TM2.f35373b;
            long m116700getSubtitle0d7_KjU = StripeThemeKt.getStripeColors(tm2, mo89518u, i3).m116700getSubtitle0d7_KjU();
            m105921d = r16.m105921d((r42 & 1) != 0 ? r16.f10827a.m105168g() : 0L, (r42 & 2) != 0 ? r16.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r16.f10827a.m105161n() : null, (r42 & 8) != 0 ? r16.f10827a.m105163l() : null, (r42 & 16) != 0 ? r16.f10827a.m105162m() : null, (r42 & 32) != 0 ? r16.f10827a.m105166i() : null, (r42 & 64) != 0 ? r16.f10827a.m105165j() : null, (r42 & 128) != 0 ? r16.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r16.f10827a.m105170e() : null, (r42 & 512) != 0 ? r16.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r16.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r16.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r16.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r16.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r16.f10828b.m110652j() : C47801r06.m16685g(C47801r06.f106195b.m16678a()), (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r16.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r16.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? tm2.m83729c(mo89518u, i3).m104965c().f10828b.m110649m() : null);
            InterfaceC41563gV2 m94180m2 = ND3.m94180m(c20912a2, 0.0f, C43705k61.m29303g(8), 0.0f, 0.0f, 13, null);
            interfaceC41563gV22 = c20912a;
            interfaceC32720Et02 = mo89518u;
            HtmlKt.m116769Htmlm4MizFo(PaymentOptionsScreenContent$lambda$3, m94180m2, null, m116700getSubtitle0d7_KjU, m105921d, false, null, 0, null, mo89518u, 48, 484);
        }
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89563f();
        interfaceC32720Et02.mo89605Q();
        interfaceC32720Et02.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentOptionsScreenKt$PaymentOptionsScreenContent$2(viewModel, interfaceC41563gV22, i, i2));
        }
    }

    private static final Integer PaymentOptionsScreenContent$lambda$0(InterfaceC48627sP5<Integer> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final PaymentSheetScreen PaymentOptionsScreenContent$lambda$1(InterfaceC48627sP5<? extends PaymentSheetScreen> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final String PaymentOptionsScreenContent$lambda$2(InterfaceC48627sP5<String> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final String PaymentOptionsScreenContent$lambda$3(InterfaceC48627sP5<String> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final boolean PaymentOptionsScreenContent$lambda$4(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }
}
