package com.stripe.android.paymentsheet.p047ui;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.p042ui.LinkButtonViewKt;
import com.stripe.android.link.p042ui.verification.VerificationDialogKt;
import com.stripe.android.p049ui.core.elements.H4TextKt;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.model.PaymentSheetViewState;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.p047ui.PrimaryButton;
import com.stripe.android.paymentsheet.state.WalletsContainerState;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.text.HtmlKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000b\u0010\u0006\u001a!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\f\u0010\u0006\"\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "viewModel", "LgV2;", "modifier", "", "PaymentSheetScreen", "(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;LgV2;LEt0;II)V", "", BaseSheetViewModel.SAVE_PROCESSING, "DismissKeyboardOnProcessing", "(ZLEt0;I)V", "PaymentSheetScreenContent", "Wallet", "", "PAYMENT_SHEET_PRIMARY_BUTTON_TEST_TAG", "Ljava/lang/String;", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentSheetScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetScreen.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,190:1\n36#2:191\n460#2,13:217\n473#2,3:235\n460#2,13:259\n473#2,3:277\n1057#3,6:192\n74#4,6:198\n80#4:230\n84#4:239\n74#4,6:240\n80#4:272\n84#4:281\n75#5:204\n76#5,11:206\n89#5:238\n75#5:246\n76#5,11:248\n89#5:280\n76#6:205\n76#6:247\n154#7:231\n154#7:232\n154#7:233\n154#7:234\n154#7:273\n154#7:274\n154#7:275\n154#7:276\n76#8:282\n76#8:283\n76#8:284\n76#8:285\n76#8:286\n76#8:287\n76#8:288\n76#8:289\n76#8:290\n76#8:291\n76#8:292\n*S KotlinDebug\n*F\n+ 1 PaymentSheetScreen.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetScreenKt\n*L\n64#1:191\n96#1:217,13\n96#1:235,3\n154#1:259,13\n154#1:277,3\n64#1:192,6\n96#1:198,6\n96#1:230\n96#1:239\n154#1:240,6\n154#1:272\n154#1:281\n96#1:204\n96#1:206,11\n96#1:238\n154#1:246\n154#1:248,11\n154#1:280\n96#1:205\n154#1:247\n103#1:231\n112#1:232\n118#1:233\n132#1:234\n160#1:273\n171#1:274\n172#1:275\n179#1:276\n39#1:282\n40#1:283\n75#1:284\n77#1:285\n78#1:286\n80#1:287\n81#1:288\n143#1:289\n147#1:290\n148#1:291\n149#1:292\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetScreenKt */
/* loaded from: classes7.dex */
public final class PaymentSheetScreenKt {
    public static final String PAYMENT_SHEET_PRIMARY_BUTTON_TEST_TAG = "PRIMARY_BUTTON";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DismissKeyboardOnProcessing(boolean z, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(604260770);
        if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(604260770, i, -1, "com.stripe.android.paymentsheet.ui.DismissKeyboardOnProcessing (PaymentSheetScreen.kt:59)");
            }
            InterfaceC45645nN5 m28161b = C44190kv2.f95207a.m28161b(mo89518u, C44190kv2.f95209c);
            if (z) {
                Unit unit = Unit.INSTANCE;
                mo89518u.mo89638F(1157296644);
                boolean mo89539n = mo89518u.mo89539n(m28161b);
                Object mo89635G = mo89518u.mo89635G();
                if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                    mo89635G = new PaymentSheetScreenKt$DismissKeyboardOnProcessing$1$1(m28161b, null);
                    mo89518u.mo89503z(mo89635G);
                }
                mo89518u.mo89605Q();
                Y91.m75533f(unit, (Function2) mo89635G, mo89518u, 70);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentSheetScreenKt$DismissKeyboardOnProcessing$2(z, i));
        }
    }

    public static final void PaymentSheetScreen(PaymentSheetViewModel viewModel, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1458106282);
        if ((i2 & 2) != 0) {
            interfaceC41563gV2 = InterfaceC41563gV2.f82354b0;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1458106282, i, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreen (PaymentSheetScreen.kt:34)");
        }
        InterfaceC48627sP5 m105205b = GM5.m105205b(viewModel.getContentVisible$paymentsheet_release(), null, mo89518u, 8, 1);
        DismissKeyboardOnProcessing(PaymentSheetScreen$lambda$1(GM5.m105205b(viewModel.getProcessing(), null, mo89518u, 8, 1)), mo89518u, 0);
        PaymentSheetScaffoldKt.PaymentSheetScaffold(C43575jt0.m29791b(mo89518u, 483576206, true, new PaymentSheetScreenKt$PaymentSheetScreen$1(viewModel)), C43575jt0.m29791b(mo89518u, -1192175964, true, new PaymentSheetScreenKt$PaymentSheetScreen$2(viewModel, m105205b)), interfaceC41563gV2, mo89518u, ((i << 3) & 896) | 54, 0);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentSheetScreenKt$PaymentSheetScreen$3(viewModel, interfaceC41563gV2, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PaymentSheetScreen$lambda$0(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    private static final boolean PaymentSheetScreen$lambda$1(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void PaymentSheetScreenContent(PaymentSheetViewModel viewModel, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        InterfaceC41563gV2.C20912a c20912a;
        InterfaceC41563gV2 interfaceC41563gV22;
        BaseSheetViewModel.UserErrorMessage userErrorMessage;
        G26 m105921d;
        InterfaceC41563gV2 interfaceC41563gV23;
        InterfaceC32720Et0 interfaceC32720Et02;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1945399683);
        if ((i2 & 2) != 0) {
            c20912a = InterfaceC41563gV2.f82354b0;
        } else {
            c20912a = interfaceC41563gV2;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1945399683, i, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetScreenContent (PaymentSheetScreen.kt:70)");
        }
        InterfaceC48627sP5 m105205b = GM5.m105205b(viewModel.getLinkHandler().getShowLinkVerificationDialog(), null, mo89518u, 8, 1);
        InterfaceC48627sP5 m105206a = GM5.m105206a(viewModel.getHeaderText$paymentsheet_release(), null, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a2 = GM5.m105206a(viewModel.getBuyButtonState(), null, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105205b2 = GM5.m105205b(viewModel.getCurrentScreen(), null, mo89518u, 8, 1);
        InterfaceC48627sP5 m105205b3 = GM5.m105205b(viewModel.getNotesText$paymentsheet_release(), null, mo89518u, 8, 1);
        float m104481a = H24.m104481a(C19159R.dimen.stripe_paymentsheet_button_container_spacing_bottom, mo89518u, 0);
        float m104481a2 = H24.m104481a(C19159R.dimen.stripe_paymentsheet_outer_spacing_horizontal, mo89518u, 0);
        mo89518u.mo89638F(1667623065);
        if (PaymentSheetScreenContent$lambda$3(m105205b)) {
            VerificationDialogKt.LinkVerificationDialog(viewModel.getLinkHandler().getLinkLauncher(), new PaymentSheetScreenKt$PaymentSheetScreenContent$1(viewModel.getLinkHandler()), mo89518u, LinkPaymentLauncher.$stable);
        }
        mo89518u.mo89605Q();
        InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a, 0.0f, 0.0f, 0.0f, m104481a, 7, null);
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
        mo89518u.mo89638F(-1960385421);
        Integer PaymentSheetScreenContent$lambda$4 = PaymentSheetScreenContent$lambda$4(m105206a);
        mo89518u.mo89638F(1356846577);
        if (PaymentSheetScreenContent$lambda$4 == null) {
            interfaceC41563gV22 = null;
        } else {
            interfaceC41563gV22 = null;
            H4TextKt.H4Text(C40946fS5.m41310c(PaymentSheetScreenContent$lambda$4.intValue(), mo89518u, 0), ND3.m94182k(ND3.m94180m(InterfaceC41563gV2.f82354b0, 0.0f, 0.0f, 0.0f, C43705k61.m29303g(2), 7, null), m104481a2, 0.0f, 2, null), mo89518u, 0, 0);
        }
        mo89518u.mo89605Q();
        Wallet(viewModel, interfaceC41563gV22, mo89518u, 8, 2);
        PaymentSheetScreen PaymentSheetScreenContent$lambda$6 = PaymentSheetScreenContent$lambda$6(m105205b2);
        InterfaceC41563gV2.C20912a c20912a2 = InterfaceC41563gV2.f82354b0;
        float f = 8;
        PaymentSheetScreenContent$lambda$6.Content(viewModel, ND3.m94180m(c20912a2, 0.0f, 0.0f, 0.0f, C43705k61.m29303g(f), 7, null), mo89518u, 56);
        PaymentSheetViewState PaymentSheetScreenContent$lambda$5 = PaymentSheetScreenContent$lambda$5(m105206a2);
        if (PaymentSheetScreenContent$lambda$5 != null) {
            userErrorMessage = PaymentSheetScreenContent$lambda$5.getErrorMessage();
        } else {
            userErrorMessage = interfaceC41563gV22;
        }
        mo89518u.mo89638F(1356847021);
        if (userErrorMessage != 0) {
            ErrorMessageKt.ErrorMessage(userErrorMessage.getMessage(), ND3.m94183j(c20912a2, C43705k61.m29303g(20), C43705k61.m29303g(2)), mo89518u, 0, 0);
        }
        mo89518u.mo89605Q();
        C19814de.m43999a(PaymentSheetScreenKt$PaymentSheetScreenContent$2$3.INSTANCE, C46022o06.m22000a(c20912a2, PAYMENT_SHEET_PRIMARY_BUTTON_TEST_TAG), null, mo89518u, 48, 4);
        String PaymentSheetScreenContent$lambda$7 = PaymentSheetScreenContent$lambda$7(m105205b3);
        if (PaymentSheetScreenContent$lambda$7 == null) {
            interfaceC41563gV23 = c20912a;
            interfaceC32720Et02 = mo89518u;
        } else {
            TM2 tm2 = TM2.f35372a;
            int i3 = TM2.f35373b;
            long m116700getSubtitle0d7_KjU = StripeThemeKt.getStripeColors(tm2, mo89518u, i3).m116700getSubtitle0d7_KjU();
            m105921d = r16.m105921d((r42 & 1) != 0 ? r16.f10827a.m105168g() : 0L, (r42 & 2) != 0 ? r16.f10827a.m105164k() : 0L, (r42 & 4) != 0 ? r16.f10827a.m105161n() : null, (r42 & 8) != 0 ? r16.f10827a.m105163l() : null, (r42 & 16) != 0 ? r16.f10827a.m105162m() : null, (r42 & 32) != 0 ? r16.f10827a.m105166i() : null, (r42 & 64) != 0 ? r16.f10827a.m105165j() : null, (r42 & 128) != 0 ? r16.f10827a.m105160o() : 0L, (r42 & 256) != 0 ? r16.f10827a.m105170e() : null, (r42 & 512) != 0 ? r16.f10827a.m105154u() : null, (r42 & 1024) != 0 ? r16.f10827a.m105159p() : null, (r42 & 2048) != 0 ? r16.f10827a.m105171d() : 0L, (r42 & 4096) != 0 ? r16.f10827a.m105156s() : null, (r42 & 8192) != 0 ? r16.f10827a.m105157r() : null, (r42 & 16384) != 0 ? r16.f10828b.m110652j() : C47801r06.m16685g(C47801r06.f106195b.m16678a()), (r42 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? r16.f10828b.m110650l() : null, (r42 & 65536) != 0 ? r16.f10828b.m110655g() : 0L, (r42 & DateUtils.FORMAT_NUMERIC_DATE) != 0 ? tm2.m83729c(mo89518u, i3).m104965c().f10828b.m110649m() : null);
            interfaceC41563gV23 = c20912a;
            interfaceC32720Et02 = mo89518u;
            HtmlKt.m116769Htmlm4MizFo(PaymentSheetScreenContent$lambda$7, ND3.m94180m(c20912a2, 0.0f, C43705k61.m29303g(f), 0.0f, 0.0f, 13, null), null, m116700getSubtitle0d7_KjU, m105921d, false, null, 0, null, mo89518u, 48, 484);
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
            mo89512w.mo20405a(new PaymentSheetScreenKt$PaymentSheetScreenContent$3(viewModel, interfaceC41563gV23, i, i2));
        }
    }

    private static final boolean PaymentSheetScreenContent$lambda$3(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    private static final Integer PaymentSheetScreenContent$lambda$4(InterfaceC48627sP5<Integer> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final PaymentSheetViewState PaymentSheetScreenContent$lambda$5(InterfaceC48627sP5<? extends PaymentSheetViewState> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final PaymentSheetScreen PaymentSheetScreenContent$lambda$6(InterfaceC48627sP5<? extends PaymentSheetScreen> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final String PaymentSheetScreenContent$lambda$7(InterfaceC48627sP5<String> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    public static final void Wallet(PaymentSheetViewModel viewModel, InterfaceC41563gV2 interfaceC41563gV2, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        InterfaceC41563gV2.C20912a c20912a;
        float f;
        int i3;
        BaseSheetViewModel.UserErrorMessage userErrorMessage;
        BaseSheetViewModel.UserErrorMessage userErrorMessage2;
        int i4;
        PrimaryButton.State state;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-572173090);
        if ((i2 & 2) != 0) {
            c20912a = InterfaceC41563gV2.f82354b0;
        } else {
            c20912a = interfaceC41563gV2;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-572173090, i, -1, "com.stripe.android.paymentsheet.ui.Wallet (PaymentSheetScreen.kt:138)");
        }
        InterfaceC48627sP5 m105206a = GM5.m105206a(viewModel.getWalletsContainerState$paymentsheet_release(), new WalletsContainerState(false, false, 0, 7, null), null, mo89518u, 8, 2);
        InterfaceC48627sP5 m105206a2 = GM5.m105206a(viewModel.getLinkHandler().getLinkLauncher().getEmailFlow(), null, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a3 = GM5.m105206a(viewModel.getGooglePayButtonState(), null, null, mo89518u, 56, 2);
        InterfaceC48627sP5 m105206a4 = GM5.m105206a(viewModel.getButtonsEnabled(), Boolean.FALSE, null, mo89518u, 56, 2);
        float m104481a = H24.m104481a(C19159R.dimen.stripe_paymentsheet_outer_spacing_horizontal, mo89518u, 0);
        if (Wallet$lambda$12(m105206a).getShouldShow()) {
            InterfaceC41563gV2 m94182k = ND3.m94182k(c20912a, m104481a, 0.0f, 2, null);
            mo89518u.mo89638F(-483455358);
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94182k);
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
            mo89518u.mo89638F(-832396051);
            mo89518u.mo89638F(-234683110);
            if (Wallet$lambda$12(m105206a).getShowGooglePay()) {
                PaymentSheetViewState Wallet$lambda$14 = Wallet$lambda$14(m105206a3);
                if (Wallet$lambda$14 != null) {
                    state = PrimaryButtonContainerFragmentKt.convert(Wallet$lambda$14);
                } else {
                    state = null;
                }
                f = 0.0f;
                GooglePayButtonKt.GooglePayButton(state, Wallet$lambda$15(m105206a4), new PaymentSheetScreenKt$Wallet$1$1(viewModel), ND3.m94180m(InterfaceC41563gV2.f82354b0, 0.0f, C43705k61.m29303g(7), 0.0f, 0.0f, 13, null), mo89518u, 3072, 0);
            } else {
                f = 0.0f;
            }
            mo89518u.mo89605Q();
            mo89518u.mo89638F(-234682760);
            if (Wallet$lambda$12(m105206a).getShowLink()) {
                userErrorMessage = null;
                i3 = 1;
                LinkButtonViewKt.LinkButton(Wallet$lambda$13(m105206a2), Wallet$lambda$15(m105206a4), new PaymentSheetScreenKt$Wallet$1$2(viewModel), BB5.m114251r(ND3.m94180m(BB5.m114255n(InterfaceC41563gV2.f82354b0, f, 1, null), 0.0f, C43705k61.m29303g(6), 0.0f, 0.0f, 13, null), C43705k61.m29303g(48)), mo89518u, 3072, 0);
            } else {
                i3 = 1;
                userErrorMessage = null;
            }
            mo89518u.mo89605Q();
            PaymentSheetViewState Wallet$lambda$142 = Wallet$lambda$14(m105206a3);
            if (Wallet$lambda$142 != null) {
                userErrorMessage2 = Wallet$lambda$142.getErrorMessage();
            } else {
                userErrorMessage2 = userErrorMessage;
            }
            mo89518u.mo89638F(-234682306);
            if (userErrorMessage2 == null) {
                i4 = 0;
            } else {
                i4 = 0;
                ErrorMessageKt.ErrorMessage(userErrorMessage2.getMessage(), ND3.m94183j(InterfaceC41563gV2.f82354b0, C43705k61.m29303g(i3), C43705k61.m29303g(3)), mo89518u, 0, 0);
            }
            mo89518u.mo89605Q();
            GooglePayDividerKt.GooglePayDividerUi(C40946fS5.m41310c(Wallet$lambda$12(m105206a).getDividerTextResource(), mo89518u, i4), mo89518u, i4, i4);
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentSheetScreenKt$Wallet$2(viewModel, c20912a, i, i2));
        }
    }

    private static final WalletsContainerState Wallet$lambda$12(InterfaceC48627sP5<WalletsContainerState> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final String Wallet$lambda$13(InterfaceC48627sP5<String> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final PaymentSheetViewState Wallet$lambda$14(InterfaceC48627sP5<? extends PaymentSheetViewState> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final boolean Wallet$lambda$15(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }
}
