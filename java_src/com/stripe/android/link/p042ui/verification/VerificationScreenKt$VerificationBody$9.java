package com.stripe.android.link.p042ui.verification;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p003ui.focus.C11309h;
import androidx.compose.p003ui.platform.C11411h;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.ErrorTextKt;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.elements.OTPElementColors;
import com.stripe.android.uicore.elements.OTPElementUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C47801r06;
import p000.InterfaceC41563gV2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nVerificationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,312:1\n154#2:313\n154#2:314\n*S KotlinDebug\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9\n*L\n185#1:313\n194#1:314\n*E\n"})
/* renamed from: com.stripe.android.link.ui.verification.VerificationScreenKt$VerificationBody$9 */
/* loaded from: classes7.dex */
public final class VerificationScreenKt$VerificationBody$9 extends Lambda implements Function3<InterfaceC35231Pm0, InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ String $email;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ C11309h $focusRequester;
    final /* synthetic */ int $headerStringResId;
    final /* synthetic */ boolean $isProcessing;
    final /* synthetic */ boolean $isSendingNewCode;
    final /* synthetic */ int $messageStringResId;
    final /* synthetic */ Function0<Unit> $onChangeEmailClick;
    final /* synthetic */ Function0<Unit> $onResendCodeClick;
    final /* synthetic */ OTPElement $otpElement;
    final /* synthetic */ String $redactedPhoneNumber;
    final /* synthetic */ boolean $showChangeEmailMessage;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nVerificationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,312:1\n154#2:313\n*S KotlinDebug\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9$1\n*L\n203#1:313\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.verification.VerificationScreenKt$VerificationBody$9$1 */
    /* loaded from: classes7.dex */
    public static final class C190591 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ C11309h $focusRequester;
        final /* synthetic */ boolean $isProcessing;
        final /* synthetic */ OTPElement $otpElement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190591(boolean z, OTPElement oTPElement, C11309h c11309h, int i) {
            super(2);
            this.$isProcessing = z;
            this.$otpElement = oTPElement;
            this.$focusRequester = c11309h;
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
                C35528Qt0.m87816Z(-714251429, i, -1, "com.stripe.android.link.ui.verification.VerificationBody.<anonymous>.<anonymous> (VerificationScreen.kt:198)");
            }
            boolean z = !this.$isProcessing;
            OTPElement oTPElement = this.$otpElement;
            InterfaceC41563gV2 m94182k = ND3.m94182k(InterfaceC41563gV2.f82354b0, 0.0f, C43705k61.m29303g(10), 1, null);
            OTPElementColors otpElementColors = ThemeKt.getLinkColors(TM2.f35372a, interfaceC32720Et0, TM2.f35373b).getOtpElementColors();
            C11309h c11309h = this.$focusRequester;
            int i2 = this.$$dirty;
            OTPElementUIKt.OTPElementUI(z, oTPElement, m94182k, otpElementColors, c11309h, interfaceC32720Et0, (OTPElement.$stable << 3) | 384 | ((i2 >> 12) & 112) | (OTPElementColors.$stable << 9) | (C11309h.f52989c << 12) | ((i2 >> 15) & 57344), 0);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nVerificationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,312:1\n76#2:313\n*S KotlinDebug\n*F\n+ 1 VerificationScreen.kt\ncom/stripe/android/link/ui/verification/VerificationScreenKt$VerificationBody$9$2\n*L\n219#1:313\n*E\n"})
    /* renamed from: com.stripe.android.link.ui.verification.VerificationScreenKt$VerificationBody$9$2 */
    /* loaded from: classes7.dex */
    public static final class C190602 extends Lambda implements Function3<InterfaceC7907Te, InterfaceC32720Et0, Integer, Unit> {
        final /* synthetic */ ErrorMessage $errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190602(ErrorMessage errorMessage) {
            super(3);
            this.$errorMessage = errorMessage;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC7907Te interfaceC7907Te, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC7907Te, interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC7907Te AnimatedVisibility, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            String str;
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(1387050283, i, -1, "com.stripe.android.link.ui.verification.VerificationBody.<anonymous>.<anonymous> (VerificationScreen.kt:216)");
            }
            ErrorMessage errorMessage = this.$errorMessage;
            if (errorMessage != null) {
                Resources resources = ((Context) interfaceC32720Et0.mo89572c(C11411h.m68324g())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "LocalContext.current.resources");
                str = errorMessage.getMessage(resources);
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            ErrorTextKt.ErrorText(str, BB5.m114255n(InterfaceC41563gV2.f82354b0, 0.0f, 1, null), null, interfaceC32720Et0, 48, 4);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenKt$VerificationBody$9(int i, int i2, int i3, String str, boolean z, String str2, boolean z2, Function0<Unit> function0, int i4, ErrorMessage errorMessage, boolean z3, Function0<Unit> function02, OTPElement oTPElement, C11309h c11309h) {
        super(3);
        this.$headerStringResId = i;
        this.$$dirty = i2;
        this.$messageStringResId = i3;
        this.$redactedPhoneNumber = str;
        this.$showChangeEmailMessage = z;
        this.$email = str2;
        this.$isProcessing = z2;
        this.$onChangeEmailClick = function0;
        this.$$dirty1 = i4;
        this.$errorMessage = errorMessage;
        this.$isSendingNewCode = z3;
        this.$onResendCodeClick = function02;
        this.$otpElement = oTPElement;
        this.$focusRequester = c11309h;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC35231Pm0 interfaceC35231Pm0, InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC35231Pm0, interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC35231Pm0 ScrollableTopLevelColumn, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
        if ((i & 14) == 0) {
            i2 = i | (interfaceC32720Et0.mo89539n(ScrollableTopLevelColumn) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && interfaceC32720Et0.mo89575b()) {
            interfaceC32720Et0.mo89548k();
            return;
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-1371531181, i2, -1, "com.stripe.android.link.ui.verification.VerificationBody.<anonymous> (VerificationScreen.kt:180)");
        }
        String m41310c = C40946fS5.m41310c(this.$headerStringResId, interfaceC32720Et0, this.$$dirty & 14);
        InterfaceC41563gV2.C20912a c20912a = InterfaceC41563gV2.f82354b0;
        float f = 4;
        InterfaceC41563gV2 m94182k = ND3.m94182k(c20912a, 0.0f, C43705k61.m29303g(f), 1, null);
        C47801r06.C27748a c27748a = C47801r06.f106195b;
        int m16678a = c27748a.m16678a();
        TM2 tm2 = TM2.f35372a;
        int i3 = TM2.f35373b;
        int i4 = i2;
        C38909c26.m62000e(m41310c, m94182k, tm2.m83731a(interfaceC32720Et0, i3).m94903g(), 0L, null, null, null, 0L, null, C47801r06.m16685g(m16678a), 0L, 0, false, 0, null, tm2.m83729c(interfaceC32720Et0, i3).m104961g(), interfaceC32720Et0, 48, 0, 32248);
        C38909c26.m62000e(C40946fS5.m41309d(this.$messageStringResId, new Object[]{this.$redactedPhoneNumber}, interfaceC32720Et0, ((this.$$dirty >> 3) & 14) | 64), ND3.m94180m(BB5.m114255n(c20912a, 0.0f, 1, null), 0.0f, C43705k61.m29303g(f), 0.0f, C43705k61.m29303g(20), 5, null), tm2.m83731a(interfaceC32720Et0, i3).m94902h(), 0L, null, null, null, 0L, null, C47801r06.m16685g(c27748a.m16678a()), 0L, 0, false, 0, null, tm2.m83729c(interfaceC32720Et0, i3).m104965c(), interfaceC32720Et0, 48, 0, 32248);
        StripeThemeKt.DefaultStripeTheme(C43575jt0.m29791b(interfaceC32720Et0, -714251429, true, new C190591(this.$isProcessing, this.$otpElement, this.$focusRequester, this.$$dirty)), interfaceC32720Et0, 6);
        interfaceC32720Et0.mo89638F(-2101864675);
        if (this.$showChangeEmailMessage) {
            String str = this.$email;
            boolean z = this.$isProcessing;
            Function0<Unit> function0 = this.$onChangeEmailClick;
            int i5 = this.$$dirty;
            VerificationScreenKt.ChangeEmailRow(str, z, function0, interfaceC32720Et0, ((i5 >> 15) & 112) | ((i5 >> 12) & 14) | ((this.$$dirty1 << 3) & 896));
        }
        interfaceC32720Et0.mo89605Q();
        ErrorMessage errorMessage = this.$errorMessage;
        C7489Se.m85173b(ScrollableTopLevelColumn, errorMessage != null, null, null, null, null, C43575jt0.m29791b(interfaceC32720Et0, 1387050283, true, new C190602(errorMessage)), interfaceC32720Et0, (i4 & 14) | 1572864, 30);
        boolean z2 = this.$isProcessing;
        boolean z3 = this.$isSendingNewCode;
        Function0<Unit> function02 = this.$onResendCodeClick;
        int i6 = this.$$dirty;
        VerificationScreenKt.ResendCodeButton(z2, z3, function02, interfaceC32720Et0, ((i6 >> 18) & 112) | ((i6 >> 18) & 14) | (this.$$dirty1 & 896));
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
