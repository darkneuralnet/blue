package com.stripe.android.link.p042ui.verification;

import androidx.compose.p003ui.focus.C11309h;
import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.uicore.elements.OTPElement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.verification.VerificationScreenKt$VerificationBody$10 */
/* loaded from: classes7.dex */
public final class VerificationScreenKt$VerificationBody$10 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ String $email;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ C11309h $focusRequester;
    final /* synthetic */ int $headerStringResId;
    final /* synthetic */ boolean $isProcessing;
    final /* synthetic */ boolean $isSendingNewCode;
    final /* synthetic */ int $messageStringResId;
    final /* synthetic */ Function0<Unit> $onBack;
    final /* synthetic */ Function0<Unit> $onChangeEmailClick;
    final /* synthetic */ Function0<Unit> $onResendCodeClick;
    final /* synthetic */ OTPElement $otpElement;
    final /* synthetic */ String $redactedPhoneNumber;
    final /* synthetic */ boolean $showChangeEmailMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenKt$VerificationBody$10(int i, int i2, boolean z, String str, String str2, OTPElement oTPElement, boolean z2, boolean z3, ErrorMessage errorMessage, C11309h c11309h, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i3, int i4) {
        super(2);
        this.$headerStringResId = i;
        this.$messageStringResId = i2;
        this.$showChangeEmailMessage = z;
        this.$redactedPhoneNumber = str;
        this.$email = str2;
        this.$otpElement = oTPElement;
        this.$isProcessing = z2;
        this.$isSendingNewCode = z3;
        this.$errorMessage = errorMessage;
        this.$focusRequester = c11309h;
        this.$onBack = function0;
        this.$onChangeEmailClick = function02;
        this.$onResendCodeClick = function03;
        this.$$changed = i3;
        this.$$changed1 = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        VerificationScreenKt.VerificationBody(this.$headerStringResId, this.$messageStringResId, this.$showChangeEmailMessage, this.$redactedPhoneNumber, this.$email, this.$otpElement, this.$isProcessing, this.$isSendingNewCode, this.$errorMessage, this.$focusRequester, this.$onBack, this.$onChangeEmailClick, this.$onResendCodeClick, interfaceC32720Et0, this.$$changed | 1, this.$$changed1);
    }
}
