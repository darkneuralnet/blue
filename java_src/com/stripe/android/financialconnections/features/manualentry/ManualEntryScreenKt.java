package com.stripe.android.financialconnections.features.manualentry;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.p003ui.focus.C11298b;
import androidx.compose.p003ui.platform.C11411h;
import androidx.fragment.app.Fragment;
import androidx.savedstate.C11966a;
import com.google.p034ar.core.ImageMetadata;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.C18634R;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryState;
import com.stripe.android.financialconnections.model.LinkAccountSessionPaymentAccount;
import com.stripe.android.financialconnections.p041ui.CompositionLocalKt;
import com.stripe.android.financialconnections.p041ui.components.ButtonKt;
import com.stripe.android.financialconnections.p041ui.components.ScaffoldKt;
import com.stripe.android.financialconnections.p041ui.components.TextFieldKt;
import com.stripe.android.financialconnections.p041ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import net.danlew.android.joda.DateUtils;
import p000.C25777lo;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC32720Et0;
import p000.InterfaceC41563gV2;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001aÓ\u0001\u0010\u0017\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0016\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00102\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aÇ\u0001\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0016\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00102\u0016\u0010\u0007\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00102\u0016\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u00102\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001d\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u0014H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001aa\u0010%\u001a\u00020\u00002\u0016\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00000\u0010H\u0003¢\u0006\u0004\b%\u0010&\u001a\u000f\u0010'\u001a\u00020\u0000H\u0001¢\u0006\u0004\b'\u0010\u0002\u001a\u000f\u0010(\u001a\u00020\u0000H\u0001¢\u0006\u0004\b(\u0010\u0002¨\u0006)"}, m28432d2 = {"", "ManualEntryScreen", "(LEt0;I)V", "Lkotlin/Pair;", "", "", "routing", "account", "accountConfirm", "", "isValidForm", "Ldp;", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;", "payload", "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;", "linkPaymentAccountStatus", "Lkotlin/Function1;", "onRoutingEntered", "onAccountEntered", "onAccountConfirmEntered", "Lkotlin/Function0;", "onSubmit", "onCloseClick", "ManualEntryContent", "(Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;ZLdp;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V", "LXp5;", "scrollState", "ManualEntryLoaded", "(LXp5;Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;Ldp;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;LEt0;II)V", "ManualEntryFooter", "(ZLkotlin/jvm/functions/Function0;LEt0;I)V", "inputWithError", "label", "testTag", "hint", "onFocusGained", "onInputChanged", "InputWithError", "(Lkotlin/Pair;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V", "ManualEntryScreenPreview", "ManualEntryScreenErrorPreview", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nManualEntryScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ManualEntryScreen.kt\ncom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt\n+ 2 MavericksComposeExtensions.kt\ncom/airbnb/mvrx/compose/MavericksComposeExtensionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,357:1\n53#2:358\n54#2,15:360\n69#2,8:381\n79#2:392\n80#2,5:395\n76#3:359\n76#3:407\n76#3:444\n76#3:486\n76#3:562\n83#4,3:375\n50#4:393\n49#4:394\n460#4,13:419\n460#4,13:456\n25#4:470\n460#4,13:498\n473#4,3:512\n36#4:520\n36#4:528\n36#4:537\n473#4,3:544\n473#4,3:549\n460#4,13:574\n473#4,3:588\n36#4:600\n50#4:607\n49#4:608\n1057#5,3:378\n1060#5,3:389\n1057#5,6:471\n1057#5,6:521\n1057#5,6:529\n1057#5,6:538\n1057#5,6:593\n1057#5,6:601\n1057#5,6:609\n74#6,6:400\n80#6:432\n74#6,6:437\n80#6:469\n84#6:548\n84#6:553\n74#6,6:555\n80#6:587\n84#6:592\n75#7:406\n76#7,11:408\n75#7:443\n76#7,11:445\n75#7:485\n76#7,11:487\n89#7:515\n89#7:547\n89#7:552\n75#7:561\n76#7,11:563\n89#7:591\n154#8:433\n154#8:434\n154#8:435\n154#8:436\n154#8:477\n154#8:517\n154#8:518\n154#8:519\n154#8:527\n154#8:535\n154#8:536\n154#8:554\n154#8:599\n154#8:615\n66#9,7:478\n73#9:511\n77#9:516\n76#10:616\n102#10,2:617\n76#10:619\n102#10,2:620\n*S KotlinDebug\n*F\n+ 1 ManualEntryScreen.kt\ncom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt\n*L\n63#1:358\n63#1:360,15\n63#1:381,8\n63#1:392\n63#1:395,5\n63#1:359\n147#1:407\n151#1:444\n170#1:486\n245#1:562\n63#1:375,3\n63#1:393\n63#1:394\n147#1:419,13\n151#1:456,13\n162#1:470\n170#1:498,13\n170#1:512,3\n207#1:520\n216#1:528\n231#1:537\n151#1:544,3\n147#1:549,3\n245#1:574,13\n245#1:588,3\n296#1:600\n289#1:607\n289#1:608\n63#1:378,3\n63#1:389,3\n162#1:471,6\n207#1:521,6\n216#1:529,6\n231#1:538,6\n269#1:593,6\n296#1:601,6\n289#1:609,6\n147#1:400,6\n147#1:432\n151#1:437,6\n151#1:469\n151#1:548\n147#1:553\n245#1:555,6\n245#1:587\n245#1:592\n147#1:406\n147#1:408,11\n151#1:443\n151#1:445,11\n170#1:485\n170#1:487,11\n170#1:515\n151#1:547\n147#1:552\n245#1:561\n245#1:563,11\n245#1:591\n156#1:433\n157#1:434\n158#1:435\n159#1:436\n169#1:477\n189#1:517\n192#1:518\n199#1:519\n209#1:527\n218#1:535\n224#1:536\n246#1:554\n275#1:599\n303#1:615\n170#1:478,7\n170#1:511\n170#1:516\n162#1:616\n162#1:617,2\n269#1:619\n269#1:620,2\n*E\n"})
/* loaded from: classes7.dex */
public final class ManualEntryScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void InputWithError(Pair<String, Integer> pair, int i, String str, String str2, Function0<Unit> function0, Function1<? super String, Unit> function1, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-430549466);
        if ((i2 & 14) == 0) {
            if (mo89518u.mo89539n(pair)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (mo89518u.mo89527r(i)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 896) == 0) {
            if (mo89518u.mo89539n(str)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 7168) == 0) {
            if (mo89518u.mo89539n(str2)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((57344 & i2) == 0) {
            if (mo89518u.mo89539n(function0)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((458752 & i2) == 0) {
            if (mo89518u.mo89539n(function1)) {
                i4 = DateUtils.FORMAT_NUMERIC_DATE;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        int i10 = i3;
        if ((374491 & i10) == 74898 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-430549466, i10, -1, "com.stripe.android.financialconnections.features.manualentry.InputWithError (ManualEntryScreen.kt:260)");
            }
            Object mo89635G = mo89518u.mo89635G();
            InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
            if (mo89635G == c2012a.m108267a()) {
                mo89635G = LM5.m97025e(new F16((String) null, 0L, (C48413s26) null, 7, (DefaultConstructorMarker) null), null, 2, null);
                mo89518u.mo89503z(mo89635G);
            }
            EX2 ex2 = (EX2) mo89635G;
            String m41310c = C40946fS5.m41310c(i, mo89518u, (i10 >> 3) & 14);
            FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
            C38909c26.m62000e(m41310c, null, financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(mo89518u, 6).getBody(), mo89518u, 0, 0, 32762);
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(4)), mo89518u, 6);
            F16 InputWithError$lambda$12 = InputWithError$lambda$12(ex2);
            C38736bl2 c38736bl2 = new C38736bl2(0, false, C39329cl2.f61189b.m60912d(), 0, 11, null);
            if (pair.getSecond() != null) {
                z = true;
            } else {
                z = false;
            }
            InterfaceC41563gV2 m22000a = C46022o06.m22000a(C41198fs5.m40620b(c20912a, false, ManualEntryScreenKt$InputWithError$1.INSTANCE, 1, null), str);
            mo89518u.mo89638F(1157296644);
            boolean mo89539n = mo89518u.mo89539n(function0);
            Object mo89635G2 = mo89518u.mo89635G();
            if (mo89539n || mo89635G2 == c2012a.m108267a()) {
                mo89635G2 = new ManualEntryScreenKt$InputWithError$2$1(function0);
                mo89518u.mo89503z(mo89635G2);
            }
            mo89518u.mo89605Q();
            InterfaceC41563gV2 m68823a = C11298b.m68823a(m22000a, (Function1) mo89635G2);
            mo89518u.mo89638F(511388516);
            boolean mo89539n2 = mo89518u.mo89539n(ex2) | mo89518u.mo89539n(function1);
            Object mo89635G3 = mo89518u.mo89635G();
            if (mo89539n2 || mo89635G3 == c2012a.m108267a()) {
                mo89635G3 = new ManualEntryScreenKt$InputWithError$3$1(function1, ex2);
                mo89518u.mo89503z(mo89635G3);
            }
            mo89518u.mo89605Q();
            TextFieldKt.FinancialConnectionsOutlinedTextField(InputWithError$lambda$12, m68823a, (Function1) mo89635G3, false, z, c38736bl2, C43575jt0.m29791b(mo89518u, 313126292, true, new ManualEntryScreenKt$InputWithError$4(str2, i10)), null, null, null, null, mo89518u, 1572864, 0, 1928);
            if (pair.getSecond() != null) {
                Integer second = pair.getSecond();
                Intrinsics.checkNotNull(second);
                C38909c26.m62000e(C40946fS5.m41310c(second.intValue(), mo89518u, 0), ND3.m94180m(c20912a, C43705k61.m29303g(16), 0.0f, 0.0f, 0.0f, 14, null), financialConnectionsTheme.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(mo89518u, 6).getCaptionEmphasized(), mo89518u, 48, 0, 32760);
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ManualEntryScreenKt$InputWithError$5(pair, i, str, str2, function0, function1, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F16 InputWithError$lambda$12(EX2<F16> ex2) {
        return ex2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ManualEntryContent(Pair<String, Integer> pair, Pair<String, Integer> pair2, Pair<String, Integer> pair3, boolean z, AbstractC19862dp<ManualEntryState.Payload> abstractC19862dp, AbstractC19862dp<LinkAccountSessionPaymentAccount> abstractC19862dp2, Function1<? super String, Unit> function1, Function1<? super String, Unit> function12, Function1<? super String, Unit> function13, Function0<Unit> function0, Function0<Unit> function02, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1346925040);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1346925040, i, i2, "com.stripe.android.financialconnections.features.manualentry.ManualEntryContent (ManualEntryScreen.kt:80)");
        }
        C37135Xp5 m80790a = C36433Up5.m80790a(0, mo89518u, 0, 1);
        ScaffoldKt.FinancialConnectionsScaffold(C43575jt0.m29791b(mo89518u, -1722057153, true, new ManualEntryScreenKt$ManualEntryContent$1(m80790a, function02, i2)), C43575jt0.m29791b(mo89518u, -767497213, true, new ManualEntryScreenKt$ManualEntryContent$2(abstractC19862dp, m80790a, abstractC19862dp2, pair, function1, pair2, function12, pair3, function13, z, function0, i)), mo89518u, 54);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new ManualEntryScreenKt$ManualEntryContent$3(pair, pair2, pair3, z, abstractC19862dp, abstractC19862dp2, function1, function12, function13, function0, function02, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ManualEntryFooter(boolean z, Function0<Unit> function0, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        int i3;
        int i4;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1850239213);
        if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89539n(function0)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1850239213, i2, -1, "com.stripe.android.financialconnections.features.manualentry.ManualEntryFooter (ManualEntryScreen.kt:240)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m94184i = ND3.m94184i(c20912a, C43705k61.m29303g(24));
            mo89518u.mo89638F(-483455358);
            InterfaceC51579xO2 m91546a = C34997Om0.m91546a(C25777lo.f96729a.m26802g(), InterfaceC4360K9.f19170a.m99136j(), mo89518u, 0);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m94184i);
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
            mo89518u.mo89638F(1185612297);
            ButtonKt.FinancialConnectionsButton(function0, BB5.m114255n(c20912a, 0.0f, 1, null), null, null, z, false, ComposableSingletons$ManualEntryScreenKt.INSTANCE.m116394getLambda1$financial_connections_release(), mo89518u, ((i2 >> 3) & 14) | 1572912 | ((i2 << 12) & 57344), 44);
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            mo89518u.mo89563f();
            mo89518u.mo89605Q();
            mo89518u.mo89605Q();
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ManualEntryScreenKt$ManualEntryFooter$2(z, function0, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ManualEntryLoaded(C37135Xp5 c37135Xp5, ManualEntryState.Payload payload, AbstractC19862dp<LinkAccountSessionPaymentAccount> abstractC19862dp, Pair<String, Integer> pair, Function1<? super String, Unit> function1, Pair<String, Integer> pair2, Function1<? super String, Unit> function12, Pair<String, Integer> pair3, Function1<? super String, Unit> function13, boolean z, Function0<Unit> function0, InterfaceC32720Et0 interfaceC32720Et0, int i, int i2) {
        Object obj;
        int i3;
        String m41310c;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1191639752);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1191639752, i, i2, "com.stripe.android.financialconnections.features.manualentry.ManualEntryLoaded (ManualEntryScreen.kt:133)");
        }
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        InterfaceC41563gV2 m114257l = BB5.m114257l(c20912a, 0.0f, 1, null);
        mo89518u.mo89638F(-483455358);
        C25777lo c25777lo = C25777lo.f96729a;
        C25777lo.InterfaceC25789l m26802g = c25777lo.m26802g();
        InterfaceC4360K9.C4361a c4361a = InterfaceC4360K9.f19170a;
        InterfaceC51579xO2 m91546a = C34997Om0.m91546a(m26802g, c4361a.m99136j(), mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
        Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m114257l);
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
        mo89518u.mo89638F(1465133442);
        float f = 24;
        InterfaceC41563gV2 m94181l = ND3.m94181l(C36433Up5.m80787d(InterfaceC35231Pm0.m89798b(c35465Qm0, c20912a, 1.0f, false, 2, null), c37135Xp5, false, null, false, 14, null), C43705k61.m29303g(f), C43705k61.m29303g(16), C43705k61.m29303g(f), C43705k61.m29303g(f));
        mo89518u.mo89638F(-483455358);
        InterfaceC51579xO2 m91546a2 = C34997Om0.m91546a(c25777lo.m26802g(), c4361a.m99136j(), mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g012 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm22 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq62 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a2 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a2 = C31723Am2.m115273a(m94181l);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        mo89518u.mo89557h();
        if (mo89518u.mo89521t()) {
            mo89518u.mo89617M(m113415a2);
        } else {
            mo89518u.mo89566e();
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a2 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a2, m91546a2, c0757a.m113412d());
        C38680bf6.m64191b(m64192a2, interfaceC41273g012, c0757a.m113414b());
        C38680bf6.m64191b(m64192a2, enumC47065pm22, c0757a.m113413c());
        C38680bf6.m64191b(m64192a2, interfaceC33869Jq62, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a2.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-1163856341);
        mo89518u.mo89638F(572300492);
        mo89518u.mo89638F(-492369756);
        Object mo89635G = mo89518u.mo89635G();
        InterfaceC32720Et0.C2012a c2012a = InterfaceC32720Et0.f8257a;
        if (mo89635G == c2012a.m108267a()) {
            obj = null;
            mo89635G = LM5.m97025e(Integer.valueOf(C18634R.C18635drawable.stripe_check_base), null, 2, null);
            mo89518u.mo89503z(mo89635G);
        } else {
            obj = null;
        }
        mo89518u.mo89605Q();
        EX2 ex2 = (EX2) mo89635G;
        InterfaceC41563gV2 m114255n = BB5.m114255n(c20912a, 0.0f, 1, obj);
        String m41310c2 = C40946fS5.m41310c(C18634R.string.stripe_manualentry_title, mo89518u, 0);
        FinancialConnectionsTheme financialConnectionsTheme = FinancialConnectionsTheme.INSTANCE;
        C38909c26.m62000e(m41310c2, m114255n, financialConnectionsTheme.getColors(mo89518u, 6).m116473getTextPrimary0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(mo89518u, 6).getSubtitle(), mo89518u, 48, 0, 32760);
        DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f)), mo89518u, 6);
        mo89518u.mo89638F(733328855);
        InterfaceC51579xO2 m44729h = C39504d10.m44729h(c4361a.m99132n(), false, mo89518u, 0);
        mo89518u.mo89638F(-1323940314);
        InterfaceC41273g01 interfaceC41273g013 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
        EnumC47065pm2 enumC47065pm23 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
        InterfaceC33869Jq6 interfaceC33869Jq63 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
        Function0<InterfaceC32018Bt0> m113415a3 = c0757a.m113415a();
        Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a3 = C31723Am2.m115273a(c20912a);
        if (!(mo89518u.mo89515v() instanceof InterfaceC25773lm)) {
            C52468yt0.m2335c();
        }
        mo89518u.mo89557h();
        if (mo89518u.mo89521t()) {
            mo89518u.mo89617M(m113415a3);
        } else {
            mo89518u.mo89566e();
        }
        mo89518u.mo89620L();
        InterfaceC32720Et0 m64192a3 = C38680bf6.m64192a(mo89518u);
        C38680bf6.m64191b(m64192a3, m44729h, c0757a.m113412d());
        C38680bf6.m64191b(m64192a3, interfaceC41273g013, c0757a.m113414b());
        C38680bf6.m64191b(m64192a3, enumC47065pm23, c0757a.m113413c());
        C38680bf6.m64191b(m64192a3, interfaceC33869Jq63, c0757a.m113410f());
        mo89518u.mo89530q();
        m115273a3.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
        mo89518u.mo89638F(2058660585);
        mo89518u.mo89638F(-2137368960);
        C40689f10 c40689f10 = C40689f10.f79291a;
        mo89518u.mo89638F(1601099142);
        C51659xX1.m5069a(C46748pE3.m19793d(C18634R.C18635drawable.stripe_check_base, mo89518u, 0), "Image of bank check referencing routing number", null, null, null, 0.0f, null, mo89518u, 56, 124);
        Integer ManualEntryLoaded$lambda$9$lambda$8$lambda$1 = ManualEntryLoaded$lambda$9$lambda$8$lambda$1(ex2);
        mo89518u.mo89638F(2049761968);
        if (ManualEntryLoaded$lambda$9$lambda$8$lambda$1 != null) {
            C51659xX1.m5069a(C46748pE3.m19793d(ManualEntryLoaded$lambda$9$lambda$8$lambda$1.intValue(), mo89518u, 0), "Image of bank check referencing routing number", null, null, null, 0.0f, null, mo89518u, 56, 124);
            Unit unit = Unit.INSTANCE;
        }
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89638F(2049762221);
        if (abstractC19862dp instanceof C32163Cj1) {
            Throwable m111793b = ((C32163Cj1) abstractC19862dp).m111793b();
            StripeException stripeException = m111793b instanceof StripeException ? (StripeException) m111793b : null;
            if (stripeException == null || (m41310c = stripeException.getMessage()) == null) {
                m41310c = C40946fS5.m41310c(C18634R.string.stripe_error_generic_title, mo89518u, 0);
            }
            C38909c26.m62000e(m41310c, null, financialConnectionsTheme.getColors(mo89518u, 6).m116470getTextCritical0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(mo89518u, 6).getBody(), mo89518u, 0, 0, 32762);
            i3 = 6;
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(8)), mo89518u, 6);
        } else {
            i3 = 6;
        }
        mo89518u.mo89605Q();
        mo89518u.mo89638F(2049762696);
        if (payload.getVerifyWithMicrodeposits()) {
            DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(8)), mo89518u, i3);
            C38909c26.m62000e(C40946fS5.m41310c(C18634R.string.stripe_manualentry_microdeposits_desc, mo89518u, 0), null, financialConnectionsTheme.getColors(mo89518u, i3).m116473getTextPrimary0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(mo89518u, 6).getBody(), mo89518u, 0, 0, 32762);
        }
        mo89518u.mo89605Q();
        float f2 = 8;
        DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f2)), mo89518u, 6);
        int i4 = C18634R.string.stripe_manualentry_routing;
        mo89518u.mo89638F(1157296644);
        boolean mo89539n = mo89518u.mo89539n(ex2);
        Object mo89635G2 = mo89518u.mo89635G();
        if (mo89539n || mo89635G2 == c2012a.m108267a()) {
            mo89635G2 = new ManualEntryScreenKt$ManualEntryLoaded$1$1$2$1(ex2);
            mo89518u.mo89503z(mo89635G2);
        }
        mo89518u.mo89605Q();
        int i5 = i >> 9;
        InputWithError(pair, i4, "RoutingInput", "123456789", (Function0) mo89635G2, function1, mo89518u, (i5 & 14) | 3456 | ((i << 3) & ImageMetadata.JPEG_GPS_COORDINATES));
        DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f)), mo89518u, 6);
        int i6 = C18634R.string.stripe_manualentry_account;
        mo89518u.mo89638F(1157296644);
        boolean mo89539n2 = mo89518u.mo89539n(ex2);
        Object mo89635G3 = mo89518u.mo89635G();
        if (mo89539n2 || mo89635G3 == c2012a.m108267a()) {
            mo89635G3 = new ManualEntryScreenKt$ManualEntryLoaded$1$1$3$1(ex2);
            mo89518u.mo89503z(mo89635G3);
        }
        mo89518u.mo89605Q();
        InputWithError(pair2, i6, "AccountInput", "000123456789", (Function0) mo89635G3, function12, mo89518u, ((i >> 15) & 14) | 3456 | ((i >> 3) & ImageMetadata.JPEG_GPS_COORDINATES));
        DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f2)), mo89518u, 6);
        C38909c26.m62000e(C40946fS5.m41310c(C18634R.string.stripe_manualentry_account_type_disclaimer, mo89518u, 0), null, financialConnectionsTheme.getColors(mo89518u, 6).m116474getTextSecondary0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, financialConnectionsTheme.getTypography(mo89518u, 6).getCaption(), mo89518u, 0, 0, 32762);
        DN5.m110552a(BB5.m114246w(c20912a, C43705k61.m29303g(f)), mo89518u, 6);
        int i7 = C18634R.string.stripe_manualentry_accountconfirm;
        mo89518u.mo89638F(1157296644);
        boolean mo89539n3 = mo89518u.mo89539n(ex2);
        Object mo89635G4 = mo89518u.mo89635G();
        if (mo89539n3 || mo89635G4 == c2012a.m108267a()) {
            mo89635G4 = new ManualEntryScreenKt$ManualEntryLoaded$1$1$4$1(ex2);
            mo89518u.mo89503z(mo89635G4);
        }
        mo89518u.mo89605Q();
        InputWithError(pair3, i7, "ConfirmAccountInput", "000123456789", (Function0) mo89635G4, function13, mo89518u, ((i >> 21) & 14) | 3456 | (i5 & ImageMetadata.JPEG_GPS_COORDINATES));
        DN5.m110552a(InterfaceC35231Pm0.m89798b(c35465Qm0, c20912a, 1.0f, false, 2, null), mo89518u, 0);
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        ManualEntryFooter(z, function0, mo89518u, ((i >> 27) & 14) | ((i2 << 3) & 112));
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        mo89518u.mo89563f();
        mo89518u.mo89605Q();
        mo89518u.mo89605Q();
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new ManualEntryScreenKt$ManualEntryLoaded$2(c37135Xp5, payload, abstractC19862dp, pair, function1, pair2, function12, pair3, function13, z, function0, i, i2));
    }

    private static final Integer ManualEntryLoaded$lambda$9$lambda$8$lambda$1(EX2<Integer> ex2) {
        return ex2.getValue();
    }

    public static final void ManualEntryScreen(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC37154Xr6 interfaceC37154Xr6;
        InterfaceC35200Pi5 interfaceC35200Pi5;
        Fragment fragment;
        Object c27850r6;
        Object obj;
        InterfaceC32720Et0 interfaceC32720Et02;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1219089844);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1219089844, i, -1, "com.stripe.android.financialconnections.features.manualentry.ManualEntryScreen (ManualEntryScreen.kt:61)");
            }
            mo89518u.mo89638F(512170640);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) mo89518u.mo89572c(C11411h.m68322i());
            ComponentActivity m12477f = C49199tN2.m12477f((Context) mo89518u.mo89572c(C11411h.m68324g()));
            if (m12477f != null) {
                Object obj2 = null;
                if (lifecycleOwner instanceof InterfaceC37154Xr6) {
                    interfaceC37154Xr6 = (InterfaceC37154Xr6) lifecycleOwner;
                } else {
                    interfaceC37154Xr6 = null;
                }
                if (interfaceC37154Xr6 != null) {
                    if (lifecycleOwner instanceof InterfaceC35200Pi5) {
                        interfaceC35200Pi5 = (InterfaceC35200Pi5) lifecycleOwner;
                    } else {
                        interfaceC35200Pi5 = null;
                    }
                    if (interfaceC35200Pi5 != null) {
                        C11966a savedStateRegistry = interfaceC35200Pi5.getSavedStateRegistry();
                        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ManualEntryViewModel.class);
                        View view = (View) mo89518u.mo89572c(C11411h.m68320k());
                        Object[] objArr = {lifecycleOwner, m12477f, interfaceC37154Xr6, savedStateRegistry};
                        mo89518u.mo89638F(-568225417);
                        boolean z = false;
                        for (int i2 = 0; i2 < 4; i2++) {
                            z |= mo89518u.mo89539n(objArr[i2]);
                        }
                        Object mo89635G = mo89518u.mo89635G();
                        if (z || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                            if (lifecycleOwner instanceof Fragment) {
                                fragment = (Fragment) lifecycleOwner;
                            } else {
                                fragment = null;
                            }
                            if (fragment == null) {
                                fragment = C49199tN2.m12476g(view);
                            }
                            Fragment fragment2 = fragment;
                            if (fragment2 != null) {
                                Bundle arguments = fragment2.getArguments();
                                if (arguments != null) {
                                    obj = arguments.get("mavericks:arg");
                                } else {
                                    obj = null;
                                }
                                c27850r6 = new C33000Fy1(m12477f, obj, fragment2, null, null, 24, null);
                            } else {
                                Bundle extras = m12477f.getIntent().getExtras();
                                if (extras != null) {
                                    obj2 = extras.get("mavericks:arg");
                                }
                                c27850r6 = new C27850r6(m12477f, obj2, interfaceC37154Xr6, savedStateRegistry);
                            }
                            mo89635G = c27850r6;
                            mo89518u.mo89503z(mo89635G);
                        }
                        mo89518u.mo89605Q();
                        AbstractC35282Pr6 abstractC35282Pr6 = (AbstractC35282Pr6) mo89635G;
                        mo89518u.mo89638F(511388516);
                        boolean mo89539n = mo89518u.mo89539n(orCreateKotlinClass) | mo89518u.mo89539n(abstractC35282Pr6);
                        Object mo89635G2 = mo89518u.mo89635G();
                        if (mo89539n || mo89635G2 == InterfaceC32720Et0.f8257a.m108267a()) {
                            YN2 yn2 = YN2.f45797a;
                            Class javaClass = JvmClassMappingKt.getJavaClass(orCreateKotlinClass);
                            String name = JvmClassMappingKt.getJavaClass(orCreateKotlinClass).getName();
                            Intrinsics.checkNotNullExpressionValue(name, "keyFactory?.invoke() ?: viewModelClass.java.name");
                            mo89635G2 = YN2.m75139c(yn2, javaClass, ManualEntryState.class, abstractC35282Pr6, name, false, null, 48, null);
                            mo89518u.mo89503z(mo89635G2);
                        }
                        mo89518u.mo89605Q();
                        mo89518u.mo89605Q();
                        ManualEntryViewModel manualEntryViewModel = (ManualEntryViewModel) ((RN2) mo89635G2);
                        FinancialConnectionsSheetNativeViewModel parentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(mo89518u, 0);
                        InterfaceC48627sP5 m12481b = C49199tN2.m12481b(manualEntryViewModel, mo89518u, 8);
                        Pair m28425to = TuplesKt.m28425to(((ManualEntryState) m12481b.getValue()).getRouting(), ((ManualEntryState) m12481b.getValue()).getRoutingError());
                        Pair m28425to2 = TuplesKt.m28425to(((ManualEntryState) m12481b.getValue()).getAccount(), ((ManualEntryState) m12481b.getValue()).getAccountError());
                        Pair m28425to3 = TuplesKt.m28425to(((ManualEntryState) m12481b.getValue()).getAccountConfirm(), ((ManualEntryState) m12481b.getValue()).getAccountConfirmError());
                        boolean isValidForm = ((ManualEntryState) m12481b.getValue()).isValidForm();
                        AbstractC19862dp<ManualEntryState.Payload> payload = ((ManualEntryState) m12481b.getValue()).getPayload();
                        AbstractC19862dp<LinkAccountSessionPaymentAccount> linkPaymentAccount = ((ManualEntryState) m12481b.getValue()).getLinkPaymentAccount();
                        ManualEntryScreenKt$ManualEntryScreen$1 manualEntryScreenKt$ManualEntryScreen$1 = new ManualEntryScreenKt$ManualEntryScreen$1(manualEntryViewModel);
                        ManualEntryScreenKt$ManualEntryScreen$2 manualEntryScreenKt$ManualEntryScreen$2 = new ManualEntryScreenKt$ManualEntryScreen$2(manualEntryViewModel);
                        ManualEntryScreenKt$ManualEntryScreen$3 manualEntryScreenKt$ManualEntryScreen$3 = new ManualEntryScreenKt$ManualEntryScreen$3(manualEntryViewModel);
                        ManualEntryScreenKt$ManualEntryScreen$4 manualEntryScreenKt$ManualEntryScreen$4 = new ManualEntryScreenKt$ManualEntryScreen$4(manualEntryViewModel);
                        ManualEntryScreenKt$ManualEntryScreen$5 manualEntryScreenKt$ManualEntryScreen$5 = new ManualEntryScreenKt$ManualEntryScreen$5(parentViewModel);
                        interfaceC32720Et02 = mo89518u;
                        ManualEntryContent(m28425to, m28425to2, m28425to3, isValidForm, payload, linkPaymentAccount, manualEntryScreenKt$ManualEntryScreen$1, manualEntryScreenKt$ManualEntryScreen$2, manualEntryScreenKt$ManualEntryScreen$3, manualEntryScreenKt$ManualEntryScreen$4, manualEntryScreenKt$ManualEntryScreen$5, mo89518u, 294912, 0);
                        if (C35528Qt0.m87827O()) {
                            C35528Qt0.m87817Y();
                        }
                    } else {
                        throw new IllegalStateException("LifecycleOwner must be a SavedStateRegistryOwner!".toString());
                    }
                } else {
                    throw new IllegalStateException("LifecycleOwner must be a ViewModelStoreOwner!".toString());
                }
            } else {
                throw new IllegalStateException("Composable is not hosted in a ComponentActivity!".toString());
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ManualEntryScreenKt$ManualEntryScreen$6(i));
        }
    }

    public static final void ManualEntryScreenErrorPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(408407180);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(408407180, i, -1, "com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenErrorPreview (ManualEntryScreen.kt:333)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$ManualEntryScreenKt.INSTANCE.m116396getLambda3$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ManualEntryScreenKt$ManualEntryScreenErrorPreview$1(i));
        }
    }

    public static final void ManualEntryScreenPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1010467384);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1010467384, i, -1, "com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenPreview (ManualEntryScreen.kt:309)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(false, ComposableSingletons$ManualEntryScreenKt.INSTANCE.m116395getLambda2$financial_connections_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new ManualEntryScreenKt$ManualEntryScreenPreview$1(i));
        }
    }
}
