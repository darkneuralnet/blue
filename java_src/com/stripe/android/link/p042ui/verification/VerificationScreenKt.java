package com.stripe.android.link.p042ui.verification;

import android.content.Context;
import androidx.compose.p003ui.focus.C11309h;
import androidx.compose.p003ui.platform.C11411h;
import androidx.lifecycle.InterfaceC11718e;
import com.stripe.android.core.injection.NonFallbackInjector;
import com.stripe.android.link.C18975R;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.p042ui.CommonKt;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.verification.VerificationViewModel;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.uicore.elements.OTPElement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.danlew.android.joda.DateUtils;
import p000.C25777lo;
import p000.FE0;
import p000.InterfaceC32018Bt0;
import p000.InterfaceC41563gV2;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aM\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u008f\u0001\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eH\u0001¢\u0006\u0004\b\u0010\u0010 \u001a-\u0010!\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eH\u0003¢\u0006\u0004\b!\u0010\"\u001a-\u0010$\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eH\u0003¢\u0006\u0004\b$\u0010%¨\u0006&"}, m28432d2 = {"", "VerificationBodyPreview", "(LEt0;I)V", "Lcom/stripe/android/link/model/LinkAccount;", "linkAccount", "Lcom/stripe/android/core/injection/NonFallbackInjector;", "injector", "VerificationBodyFullFlow", "(Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;LEt0;I)V", "", "headerStringResId", "messageStringResId", "", "showChangeEmailMessage", "Lkotlin/Function0;", "onVerificationCompleted", "VerificationBody", "(IIZLcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/core/injection/NonFallbackInjector;Lkotlin/jvm/functions/Function0;LEt0;II)V", "", "redactedPhoneNumber", "email", "Lcom/stripe/android/uicore/elements/OTPElement;", "otpElement", "isProcessing", "isSendingNewCode", "Lcom/stripe/android/link/ui/ErrorMessage;", "errorMessage", "Landroidx/compose/ui/focus/h;", "focusRequester", "onBack", "onChangeEmailClick", "onResendCodeClick", "(IIZLjava/lang/String;Ljava/lang/String;Lcom/stripe/android/uicore/elements/OTPElement;ZZLcom/stripe/android/link/ui/ErrorMessage;Landroidx/compose/ui/focus/h;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V", "ChangeEmailRow", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;LEt0;I)V", "onClick", "ResendCodeButton", "(ZZLkotlin/jvm/functions/Function0;LEt0;I)V", "link_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVerificationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/VerificationScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,312:1\n81#2,11:313\n76#3:324\n76#3:325\n76#3:340\n76#3:380\n25#4:326\n460#4,13:352\n473#4,3:367\n460#4,13:392\n473#4,3:409\n1057#5,6:327\n154#6:333\n154#6:366\n154#6:372\n154#6:373\n154#6:406\n154#6:407\n154#6:408\n76#7,5:334\n81#7:365\n85#7:371\n75#8:339\n76#8,11:341\n89#8:370\n75#8:379\n76#8,11:381\n89#8:412\n68#9,5:374\n73#9:405\n77#9:413\n76#10:414\n*S KotlinDebug\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/VerificationScreenKt\n*L\n103#1:313,11\n116#1:324\n117#1:325\n238#1:340\n271#1:380\n118#1:326\n238#1:352,13\n238#1:367,3\n271#1:392,13\n271#1:409,3\n118#1:327,6\n239#1:333\n253#1:366\n273#1:372\n275#1:373\n299#1:406\n305#1:407\n307#1:408\n238#1:334,5\n238#1:365\n238#1:371\n238#1:339\n238#1:341,11\n238#1:370\n271#1:379\n271#1:381,11\n271#1:412\n271#1:374,5\n271#1:405\n271#1:413\n110#1:414\n*E\n"})
/* renamed from: com.stripe.android.link.ui.verification.VerificationScreenKt */
/* loaded from: classes7.dex */
public final class VerificationScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChangeEmailRow(String str, boolean z, Function0<Unit> function0, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        InterfaceC32720Et0 interfaceC32720Et02;
        int i3;
        int i4;
        int i5;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1527127586);
        if ((i & 14) == 0) {
            if (mo89518u.mo89539n(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89536o(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(function0)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1527127586, i, -1, "com.stripe.android.link.ui.verification.ChangeEmailRow (VerificationScreen.kt:232)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            InterfaceC41563gV2 m94182k = ND3.m94182k(c20912a, 0.0f, C43705k61.m29303g(14), 1, null);
            C25777lo.InterfaceC25782e m26807b = C25777lo.f96729a.m26807b();
            mo89518u.mo89638F(693286680);
            InterfaceC51579xO2 m74813a = C37252Yc5.m74813a(m26807b, InterfaceC4360K9.f19170a.m99135k(), mo89518u, 6);
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
            C38680bf6.m64191b(m64192a, m74813a, c0757a.m113412d());
            C38680bf6.m64191b(m64192a, interfaceC41273g01, c0757a.m113414b());
            C38680bf6.m64191b(m64192a, enumC47065pm2, c0757a.m113413c());
            C38680bf6.m64191b(m64192a, interfaceC33869Jq6, c0757a.m113410f());
            mo89518u.mo89530q();
            m115273a.invoke(MB5.m95606a(MB5.m95605b(mo89518u)), mo89518u, 0);
            mo89518u.mo89638F(2058660585);
            mo89518u.mo89638F(-678309503);
            C38066ad5 c38066ad5 = C38066ad5.f50835a;
            mo89518u.mo89638F(1913675654);
            String m41309d = C40946fS5.m41309d(C18975R.string.verification_not_email, new Object[]{str}, mo89518u, 64);
            InterfaceC41563gV2 mo70993a = c38066ad5.mo70993a(c20912a, 1.0f, false);
            TM2 tm2 = TM2.f35372a;
            int i6 = TM2.f35373b;
            C38909c26.m62000e(m41309d, mo70993a, tm2.m83731a(mo89518u, i6).m94902h(), 0L, null, null, null, 0L, null, null, 0L, C45449n26.f99264a.m24539b(), false, 1, null, tm2.m83729c(mo89518u, i6).m104964d(), mo89518u, 0, 3120, 22520);
            interfaceC32720Et02 = mo89518u;
            C38909c26.m62000e(C40946fS5.m41310c(C18975R.string.verification_change_email, mo89518u, 0), C38131ak0.m70814e(ND3.m94180m(c20912a, C43705k61.m29303g(4), 0.0f, 0.0f, 0.0f, 14, null), !z, null, null, function0, 6, null), ThemeKt.getLinkColors(tm2, mo89518u, i6).m116528getActionLabel0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, null, tm2.m83729c(mo89518u, i6).m104964d(), interfaceC32720Et02, 0, 3072, 24568);
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
            mo89512w.mo20405a(new VerificationScreenKt$ChangeEmailRow$2(str, z, function0, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ResendCodeButton(boolean z, boolean z2, Function0<Unit> function0, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        boolean z3;
        float m77587c;
        InterfaceC32720Et0 interfaceC32720Et02;
        float f;
        int i3;
        int i4;
        int i5;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1688373171);
        if ((i & 14) == 0) {
            if (mo89518u.mo89536o(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (mo89518u.mo89536o(z2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 896) == 0) {
            if (mo89518u.mo89539n(function0)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1688373171, i, -1, "com.stripe.android.link.ui.verification.ResendCodeButton (VerificationScreen.kt:265)");
            }
            InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
            float f2 = 12;
            InterfaceC41563gV2 m94180m = ND3.m94180m(c20912a, 0.0f, C43705k61.m29303g(f2), 0.0f, 0.0f, 13, null);
            float m29303g = C43705k61.m29303g(1);
            TM2 tm2 = TM2.f35372a;
            int i6 = TM2.f35373b;
            InterfaceC41563gV2 m88106a = C35447Qk0.m88106a(C19783dZ.m44155g(m94180m, m29303g, ThemeKt.getLinkColors(tm2, mo89518u, i6).m116533getComponentBorder0d7_KjU(), ThemeKt.getLinkShapes(tm2, mo89518u, i6).getExtraSmall()), ThemeKt.getLinkShapes(tm2, mo89518u, i6).getExtraSmall());
            if (!z && !z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            InterfaceC41563gV2 m70814e = C38131ak0.m70814e(m88106a, z3, null, null, function0, 6, null);
            InterfaceC4360K9 m99141e = InterfaceC4360K9.f19170a.m99141e();
            mo89518u.mo89638F(733328855);
            InterfaceC51579xO2 m44729h = C39504d10.m44729h(m99141e, false, mo89518u, 6);
            mo89518u.mo89638F(-1323940314);
            InterfaceC41273g01 interfaceC41273g01 = (InterfaceC41273g01) mo89518u.mo89572c(C42399hu0.m35612g());
            EnumC47065pm2 enumC47065pm2 = (EnumC47065pm2) mo89518u.mo89572c(C42399hu0.m35607l());
            InterfaceC33869Jq6 interfaceC33869Jq6 = (InterfaceC33869Jq6) mo89518u.mo89572c(C42399hu0.m35602q());
            InterfaceC32018Bt0.C0757a c0757a = InterfaceC32018Bt0.f2995M;
            Function0<InterfaceC32018Bt0> m113415a = c0757a.m113415a();
            Function3<MB5<InterfaceC32018Bt0>, InterfaceC32720Et0, Integer, Unit> m115273a = C31723Am2.m115273a(m70814e);
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
            mo89518u.mo89638F(-29281273);
            if (z) {
                mo89518u.mo89638F(2078008269);
                m77587c = C36986Wz0.f42427a.m77588b(mo89518u, C36986Wz0.f42428b);
                mo89518u.mo89605Q();
            } else if (z2) {
                mo89518u.mo89638F(2078008342);
                mo89518u.mo89605Q();
                m77587c = 0.0f;
            } else {
                mo89518u.mo89638F(2078008374);
                m77587c = C36986Wz0.f42427a.m77587c(mo89518u, C36986Wz0.f42428b);
                mo89518u.mo89605Q();
            }
            String m41310c = C40946fS5.m41310c(C18975R.string.verification_resend, mo89518u, 0);
            G26 m104963e = tm2.m83729c(mo89518u, i6).m104963e();
            long m94903g = tm2.m83731a(mo89518u, i6).m94903g();
            InterfaceC41563gV2 m81909a = C8203U9.m81909a(ND3.m94183j(c20912a, C43705k61.m29303g(f2), C43705k61.m29303g(4)), m77587c);
            interfaceC32720Et02 = mo89518u;
            C38909c26.m62000e(m41310c, m81909a, m94903g, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, m104963e, interfaceC32720Et02, 0, 0, 32760);
            long m94903g2 = tm2.m83731a(interfaceC32720Et02, i6).m94903g();
            float m29303g2 = C43705k61.m29303g(2);
            InterfaceC41563gV2 m114246w = BB5.m114246w(c20912a, C43705k61.m29303g(18));
            if (z2) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            K74.m99208b(C8203U9.m81909a(m114246w, f), m94903g2, m29303g2, interfaceC32720Et02, 384, 0);
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
            mo89512w.mo20405a(new VerificationScreenKt$ResendCodeButton$2(z, z2, function0, i));
        }
    }

    public static final void VerificationBody(int i, int i2, boolean z, LinkAccount linkAccount, NonFallbackInjector injector, Function0<Unit> function0, InterfaceC32720Et0 interfaceC32720Et0, int i3, int i4) {
        FE0 fe0;
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        Intrinsics.checkNotNullParameter(injector, "injector");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-718468200);
        Function0<Unit> function02 = (i4 & 32) != 0 ? null : function0;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-718468200, i3, -1, "com.stripe.android.link.ui.verification.VerificationBody (VerificationScreen.kt:94)");
        }
        VerificationViewModel.Factory factory = new VerificationViewModel.Factory(linkAccount, injector);
        mo89518u.mo89638F(1729797275);
        InterfaceC37154Xr6 m18429a = C47155pv2.f104319a.m18429a(mo89518u, 6);
        if (m18429a != null) {
            if (m18429a instanceof InterfaceC11718e) {
                fe0 = ((InterfaceC11718e) m18429a).getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(fe0, "{\n        viewModelStore…ModelCreationExtras\n    }");
            } else {
                fe0 = FE0.C2209a.f9049b;
            }
            AbstractC35048Or6 m84734b = C35984Sr6.m84734b(VerificationViewModel.class, m18429a, null, factory, fe0, mo89518u, 36936, 0);
            mo89518u.mo89605Q();
            VerificationViewModel verificationViewModel = (VerificationViewModel) m84734b;
            InterfaceC48627sP5 m105205b = GM5.m105205b(verificationViewModel.getViewState(), null, mo89518u, 8, 1);
            if (function02 != null) {
                verificationViewModel.setOnVerificationCompleted(function02);
            }
            Context context = (Context) mo89518u.mo89572c(C11411h.m68324g());
            InterfaceC32037Bv1 interfaceC32037Bv1 = (InterfaceC32037Bv1) mo89518u.mo89572c(C42399hu0.m35611h());
            mo89518u.mo89638F(-492369756);
            Object mo89635G = mo89518u.mo89635G();
            if (mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
                mo89635G = new C11309h();
                mo89518u.mo89503z(mo89635G);
            }
            mo89518u.mo89605Q();
            C11309h c11309h = (C11309h) mo89635G;
            InterfaceC45645nN5 m28161b = C44190kv2.f95207a.m28161b(mo89518u, C44190kv2.f95209c);
            Y91.m75533f(Boolean.valueOf(VerificationBody$lambda$0(m105205b).isProcessing()), new VerificationScreenKt$VerificationBody$2(interfaceC32037Bv1, m28161b, m105205b, null), mo89518u, 64);
            Y91.m75533f(Boolean.valueOf(VerificationBody$lambda$0(m105205b).getRequestFocus()), new VerificationScreenKt$VerificationBody$3(c11309h, m28161b, verificationViewModel, m105205b, null), mo89518u, 64);
            Y91.m75533f(Boolean.valueOf(VerificationBody$lambda$0(m105205b).getDidSendNewCode()), new VerificationScreenKt$VerificationBody$4(context, verificationViewModel, m105205b, null), mo89518u, 64);
            VerificationBody(i, i2, z, verificationViewModel.getLinkAccount().getRedactedPhoneNumber(), verificationViewModel.getLinkAccount().getEmail(), verificationViewModel.getOtpElement(), VerificationBody$lambda$0(m105205b).isProcessing(), VerificationBody$lambda$0(m105205b).isSendingNewCode(), VerificationBody$lambda$0(m105205b).getErrorMessage(), c11309h, new VerificationScreenKt$VerificationBody$5(verificationViewModel), new VerificationScreenKt$VerificationBody$6(verificationViewModel), new VerificationScreenKt$VerificationBody$7(verificationViewModel), mo89518u, (i3 & 14) | (i3 & 112) | (i3 & 896) | (OTPElement.$stable << 15) | (C11309h.f52989c << 27), 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
            if (mo89512w == null) {
                return;
            }
            mo89512w.mo20405a(new VerificationScreenKt$VerificationBody$8(i, i2, z, linkAccount, injector, function02, i3, i4));
            return;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerificationViewState VerificationBody$lambda$0(InterfaceC48627sP5<VerificationViewState> interfaceC48627sP5) {
        return interfaceC48627sP5.getValue();
    }

    public static final void VerificationBodyFullFlow(LinkAccount linkAccount, NonFallbackInjector injector, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        Intrinsics.checkNotNullParameter(injector, "injector");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(1744481191);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1744481191, i, -1, "com.stripe.android.link.ui.verification.VerificationBodyFullFlow (VerificationScreen.kt:79)");
        }
        VerificationBody(C18975R.string.verification_header, C18975R.string.verification_message, true, linkAccount, injector, null, mo89518u, 37248, 32);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new VerificationScreenKt$VerificationBodyFullFlow$1(linkAccount, injector, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerificationBodyPreview(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1035202104);
        if (i == 0 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1035202104, i, -1, "com.stripe.android.link.ui.verification.VerificationBodyPreview (VerificationScreen.kt:56)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$VerificationScreenKt.INSTANCE.m116567getLambda2$link_release(), mo89518u, 48, 1);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new VerificationScreenKt$VerificationBodyPreview$1(i));
        }
    }

    public static final void VerificationBody(int i, int i2, boolean z, String redactedPhoneNumber, String email, OTPElement otpElement, boolean z2, boolean z3, ErrorMessage errorMessage, C11309h focusRequester, Function0<Unit> onBack, Function0<Unit> onChangeEmailClick, Function0<Unit> onResendCodeClick, InterfaceC32720Et0 interfaceC32720Et0, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        InterfaceC32720Et0 interfaceC32720Et02;
        Intrinsics.checkNotNullParameter(redactedPhoneNumber, "redactedPhoneNumber");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(otpElement, "otpElement");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onChangeEmailClick, "onChangeEmailClick");
        Intrinsics.checkNotNullParameter(onResendCodeClick, "onResendCodeClick");
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(254887626);
        if ((i3 & 14) == 0) {
            i5 = (mo89518u.mo89527r(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 112) == 0) {
            i5 |= mo89518u.mo89527r(i2) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i5 |= mo89518u.mo89536o(z) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i5 |= mo89518u.mo89539n(redactedPhoneNumber) ? 2048 : 1024;
        }
        if ((57344 & i3) == 0) {
            i5 |= mo89518u.mo89539n(email) ? 16384 : 8192;
        }
        if ((458752 & i3) == 0) {
            i5 |= mo89518u.mo89539n(otpElement) ? DateUtils.FORMAT_NUMERIC_DATE : 65536;
        }
        if ((3670016 & i3) == 0) {
            i5 |= mo89518u.mo89536o(z2) ? 1048576 : 524288;
        }
        if ((i3 & 29360128) == 0) {
            i5 |= mo89518u.mo89536o(z3) ? 8388608 : 4194304;
        }
        if ((i3 & 234881024) == 0) {
            i5 |= mo89518u.mo89539n(errorMessage) ? 67108864 : 33554432;
        }
        if ((i3 & 1879048192) == 0) {
            i5 |= mo89518u.mo89539n(focusRequester) ? 536870912 : 268435456;
        }
        if ((i4 & 14) == 0) {
            i6 = i4 | (mo89518u.mo89539n(onBack) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i4 & 112) == 0) {
            i6 |= mo89518u.mo89539n(onChangeEmailClick) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i7 = i6 | (mo89518u.mo89539n(onResendCodeClick) ? 256 : 128);
        } else {
            i7 = i6;
        }
        if ((i5 & 1533916891) == 306783378 && (i7 & 731) == 146 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
            interfaceC32720Et02 = mo89518u;
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(254887626, i5, i7, "com.stripe.android.link.ui.verification.VerificationBody (VerificationScreen.kt:163)");
            }
            C7582Sv.m84651a(false, onBack, mo89518u, (i7 << 3) & 112, 1);
            int i8 = i5;
            interfaceC32720Et02 = mo89518u;
            CommonKt.ScrollableTopLevelColumn(C43575jt0.m29791b(interfaceC32720Et02, -1371531181, true, new VerificationScreenKt$VerificationBody$9(i, i8, i2, redactedPhoneNumber, z, email, z2, onChangeEmailClick, i7, errorMessage, z3, onResendCodeClick, otpElement, focusRequester)), interfaceC32720Et02, 6);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = interfaceC32720Et02.mo89512w();
        if (mo89512w == null) {
            return;
        }
        mo89512w.mo20405a(new VerificationScreenKt$VerificationBody$10(i, i2, z, redactedPhoneNumber, email, otpElement, z2, z3, errorMessage, focusRequester, onBack, onChangeEmailClick, onResendCodeClick, i3, i4));
    }
}
