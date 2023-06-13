package com.stripe.android.paymentsheet.p047ui;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p003ui.platform.C11411h;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.C19159R;
import com.stripe.android.paymentsheet.navigation.PaymentSheetScreen;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.StripeColors;
import com.stripe.android.uicore.StripeThemeDefaults;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.StripeTypography;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC32018Bt0;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a'\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aA\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0019\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "viewModel", "Lk61;", "elevation", "", "PaymentSheetTopBar-rAjV9yQ", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;FLEt0;II)V", "PaymentSheetTopBar", "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;", TransferTable.COLUMN_STATE, "Lkotlin/Function0;", "onNavigationIconPressed", "onEditIconPressed", "PaymentSheetTopBar-uFdPcIQ", "(Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V", "", "labelResourceId", "", "isEnabled", "Lpm0;", "tintColor", "onClick", "EditButton-FNF3uiM", "(IZJLkotlin/jvm/functions/Function0;LEt0;I)V", "EditButton", "TestModeBadge", "(LEt0;I)V", "PaymentSheetTopBar_Preview", "TestModeBadge_Preview", "paymentsheet_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentSheetTopBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetTopBar.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,198:1\n154#2:199\n174#2:213\n154#2:218\n154#2:219\n76#3:200\n76#3:201\n76#3:227\n36#4:202\n36#4:209\n460#4,13:239\n473#4,3:253\n1057#5,6:203\n1057#5,3:210\n1060#5,3:215\n88#6:214\n67#7,6:220\n73#7:252\n77#7:257\n75#8:226\n76#8,11:228\n89#8:256\n76#9:258\n76#9:259\n76#9:260\n76#9:261\n76#9:262\n*S KotlinDebug\n*F\n+ 1 PaymentSheetTopBar.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetTopBarKt\n*L\n42#1:199\n133#1:213\n158#1:218\n159#1:219\n120#1:200\n121#1:201\n156#1:227\n124#1:202\n130#1:209\n156#1:239,13\n156#1:253,3\n124#1:203,6\n130#1:210,3\n130#1:215,3\n133#1:214\n156#1:220,6\n156#1:252\n156#1:257\n156#1:226\n156#1:228,11\n156#1:256\n44#1:258\n45#1:259\n46#1:260\n47#1:261\n48#1:262\n*E\n"})
/* renamed from: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt */
/* loaded from: classes7.dex */
public final class PaymentSheetTopBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EditButton-FNF3uiM  reason: not valid java name */
    public static final void m116652EditButtonFNF3uiM(int i, boolean z, long j, Function0<Unit> function0, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        int i3;
        Typeface typeface;
        int i4;
        int i5;
        int i6;
        int i7;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-555214987);
        if ((i2 & 14) == 0) {
            if (mo89518u.mo89527r(i)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (mo89518u.mo89536o(z)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 896) == 0) {
            if (mo89518u.mo89524s(j)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 7168) == 0) {
            if (mo89518u.mo89539n(function0)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 5851) == 1170 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-555214987, i3, -1, "com.stripe.android.paymentsheet.ui.EditButton (PaymentSheetTopBar.kt:113)");
            }
            Context context = (Context) mo89518u.mo89572c(C11411h.m68324g());
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            StripeTypography stripeTypography = StripeThemeKt.getStripeTypography(TM2.f35372a, mo89518u, TM2.f35373b);
            int i8 = StripeTypography.$stable;
            mo89518u.mo89638F(1157296644);
            boolean mo89539n = mo89518u.mo89539n(stripeTypography);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                Integer fontFamily = stripeTypography.getFontFamily();
                if (fontFamily == null || (typeface = C49785uM4.m10395h(context, fontFamily.intValue())) == null) {
                    typeface = Typeface.DEFAULT;
                }
                mo89635G = typeface;
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            Typeface typeface2 = (Typeface) mo89635G;
            mo89518u.mo89638F(1157296644);
            boolean mo89539n2 = mo89518u.mo89539n(stripeTypography);
            Object mo89635G2 = mo89518u.mo89635G();
            if (mo89539n2 || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G2 = M26.m95978b(interfaceC41273g01.mo3399s0(C43705k61.m29303g(C43705k61.m29303g(M26.m95972h(StripeThemeDefaults.INSTANCE.getTypography().m116724getSmallFontSizeXSAIIZE())) * stripeTypography.getFontSizeMultiplier())));
                mo89518u.mo89503z(mo89635G2);
            }
            mo89518u.mo89605Q();
            C47438qP1.m17541a(function0, null, z, null, C43575jt0.m29791b(mo89518u, 1983637009, true, new PaymentSheetTopBarKt$EditButton$1(i, i3, j, ((M26) mo89635G2).m95969k(), typeface2)), mo89518u, ((i3 >> 9) & 14) | 24576 | ((i3 << 3) & 896), 10);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentSheetTopBarKt$EditButton$2(i, z, j, function0, i2));
        }
    }

    /* renamed from: PaymentSheetTopBar-rAjV9yQ  reason: not valid java name */
    public static final void m116653PaymentSheetTopBarrAjV9yQ(BaseSheetViewModel viewModel, float f, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1761635834);
        if ((i2 & 2) != 0) {
            f = C43705k61.m29303g(0);
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1761635834, i, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar (PaymentSheetTopBar.kt:39)");
        }
        boolean z = true;
        InterfaceC48627sP5 m105205b = GM5.m105205b(viewModel.getCurrentScreen(), null, mo89518u, 8, 1);
        InterfaceC48627sP5 m105205b2 = GM5.m105205b(viewModel.getStripeIntent$paymentsheet_release(), null, mo89518u, 8, 1);
        InterfaceC48627sP5 m105205b3 = GM5.m105205b(viewModel.getProcessing(), null, mo89518u, 8, 1);
        InterfaceC48627sP5 m105205b4 = GM5.m105205b(viewModel.getEditing$paymentsheet_release(), null, mo89518u, 8, 1);
        InterfaceC48627sP5 m105205b5 = GM5.m105205b(viewModel.getPaymentMethods$paymentsheet_release(), null, mo89518u, 8, 1);
        PaymentSheetScreen PaymentSheetTopBar_rAjV9yQ$lambda$0 = PaymentSheetTopBar_rAjV9yQ$lambda$0(m105205b);
        List<PaymentMethod> PaymentSheetTopBar_rAjV9yQ$lambda$4 = PaymentSheetTopBar_rAjV9yQ$lambda$4(m105205b5);
        StripeIntent PaymentSheetTopBar_rAjV9yQ$lambda$1 = PaymentSheetTopBar_rAjV9yQ$lambda$1(m105205b2);
        if (PaymentSheetTopBar_rAjV9yQ$lambda$1 != null) {
            z = PaymentSheetTopBar_rAjV9yQ$lambda$1.isLiveMode();
        }
        m116654PaymentSheetTopBaruFdPcIQ(PaymentSheetTopBarStateKt.rememberPaymentSheetTopBarState(PaymentSheetTopBar_rAjV9yQ$lambda$0, PaymentSheetTopBar_rAjV9yQ$lambda$4, z, PaymentSheetTopBar_rAjV9yQ$lambda$2(m105205b3), PaymentSheetTopBar_rAjV9yQ$lambda$3(m105205b4), mo89518u, 64), f, new PaymentSheetTopBarKt$PaymentSheetTopBar$1(viewModel), new PaymentSheetTopBarKt$PaymentSheetTopBar$2(viewModel), mo89518u, i & 112);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentSheetTopBarKt$PaymentSheetTopBar$3(viewModel, f, i, i2));
        }
    }

    /* renamed from: PaymentSheetTopBar-uFdPcIQ  reason: not valid java name */
    public static final void m116654PaymentSheetTopBaruFdPcIQ(PaymentSheetTopBarState state, float f, Function0<Unit> onNavigationIconPressed, Function0<Unit> onEditIconPressed, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i3;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onNavigationIconPressed, "onNavigationIconPressed");
        Intrinsics.checkNotNullParameter(onEditIconPressed, "onEditIconPressed");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-919139988);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(state)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89533p(f)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(onNavigationIconPressed)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (mo89518u.mo89539n(onEditIconPressed)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if ((i7 & 5851) == 1170 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-919139988, i7, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar (PaymentSheetTopBar.kt:67)");
            }
            InterfaceC45645nN5 m28161b = C44190kv2.f95207a.m28161b(mo89518u, C44190kv2.f95209c);
            TM2 tm2 = TM2.f35372a;
            int i8 = TM2.f35373b;
            long m116694getAppBarIcon0d7_KjU = StripeThemeKt.getStripeColors(tm2, mo89518u, i8).m116694getAppBarIcon0d7_KjU();
            long m94896n = tm2.m83731a(mo89518u, i8).m94896n();
            interfaceC32720Et02 = mo89518u;
            C3727Ih.m101812c(C43575jt0.m29791b(mo89518u, -547937488, true, new PaymentSheetTopBarKt$PaymentSheetTopBar$4(state)), null, C43575jt0.m29791b(mo89518u, -203109326, true, new PaymentSheetTopBarKt$PaymentSheetTopBar$5(state, m28161b, onNavigationIconPressed, i7, m116694getAppBarIcon0d7_KjU)), C43575jt0.m29791b(mo89518u, 734056539, true, new PaymentSheetTopBarKt$PaymentSheetTopBar$6(state, m116694getAppBarIcon0d7_KjU, onEditIconPressed, i7)), m94896n, 0L, f, interfaceC32720Et02, ((i7 << 15) & 3670016) | 3462, 34);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentSheetTopBarKt$PaymentSheetTopBar$7(state, f, onNavigationIconPressed, onEditIconPressed, i));
        }
    }

    public static final void PaymentSheetTopBar_Preview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        StripeColors m116693copyKvvhxLA;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(861074475);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(861074475, i, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar_Preview (PaymentSheetTopBar.kt:170)");
            }
            m116693copyKvvhxLA = r10.m116693copyKvvhxLA((r34 & 1) != 0 ? r10.component : 0L, (r34 & 2) != 0 ? r10.componentBorder : 0L, (r34 & 4) != 0 ? r10.componentDivider : 0L, (r34 & 8) != 0 ? r10.onComponent : 0L, (r34 & 16) != 0 ? r10.subtitle : 0L, (r34 & 32) != 0 ? r10.textCursor : 0L, (r34 & 64) != 0 ? r10.placeholderText : 0L, (r34 & 128) != 0 ? r10.appBarIcon : C47063pm0.f104050b.m18728e(), (r34 & 256) != 0 ? StripeThemeDefaults.INSTANCE.getColorsLight().materialColors : null);
            StripeThemeKt.StripeTheme(m116693copyKvvhxLA, null, null, ComposableSingletons$PaymentSheetTopBarKt.INSTANCE.m116637getLambda1$paymentsheet_release(), mo89518u, StripeColors.$stable | 3072, 6);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentSheetTopBarKt$PaymentSheetTopBar_Preview$1(i));
        }
    }

    private static final PaymentSheetScreen PaymentSheetTopBar_rAjV9yQ$lambda$0(InterfaceC48627sP5<? extends PaymentSheetScreen> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final StripeIntent PaymentSheetTopBar_rAjV9yQ$lambda$1(InterfaceC48627sP5<? extends StripeIntent> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    private static final boolean PaymentSheetTopBar_rAjV9yQ$lambda$2(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    private static final boolean PaymentSheetTopBar_rAjV9yQ$lambda$3(InterfaceC48627sP5<Boolean> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue().booleanValue();
    }

    private static final List<PaymentMethod> PaymentSheetTopBar_rAjV9yQ$lambda$4(InterfaceC48627sP5<? extends List<PaymentMethod>> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    public static final void TestModeBadge(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1806667293);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1806667293, i, -1, "com.stripe.android.paymentsheet.ui.TestModeBadge (PaymentSheetTopBar.kt:151)");
            }
            long m115303a = C31721Am0.m115303a(C19159R.color.stripe_paymentsheet_testmode_background, mo89518u, 0);
            long m115303a2 = C31721Am0.m115303a(C19159R.color.stripe_paymentsheet_testmode_text, mo89518u, 0);
            InterfaceC41563gV2 m94183j = ND3.m94183j(C13342bw.m62125c(InterfaceC41563gV2.f82354b0, m115303a, C39242cc5.m61172d(C43705k61.m29303g(5))), C43705k61.m29303g(6), C43705k61.m29303g(2));
            mo89518u.mo89638F(733328855);
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(InterfaceC4360K9.f19170a.m99132n(), false, mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94183j);
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
            C38680bf6.m64191b(m64192a, m44729h, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-2137368960);
            C40689f10 c40689f10 = C40689f10.f79291a;
            mo89518u.mo89638F(1041107747);
            interfaceC32720Et02 = mo89518u;
            C38909c26.m62000e("TEST MODE", null, m115303a2, 0L, null, C33918Jw1.f18784c.m99543a(), null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC32720Et02, 196614, 0, 65498);
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89563f();
            interfaceC32720Et02.mo89605Q();
            interfaceC32720Et02.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentSheetTopBarKt$TestModeBadge$2(i));
        }
    }

    public static final void TestModeBadge_Preview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(342298502);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(342298502, i, -1, "com.stripe.android.paymentsheet.ui.TestModeBadge_Preview (PaymentSheetTopBar.kt:192)");
            }
            StripeThemeKt.StripeTheme(null, null, null, ComposableSingletons$PaymentSheetTopBarKt.INSTANCE.m116638getLambda2$paymentsheet_release(), mo89518u, 3072, 7);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new PaymentSheetTopBarKt$TestModeBadge_Preview$1(i));
        }
    }
}
