package com.stripe.android.link.p042ui.signup;

import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.TextFieldController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.signup.SignUpScreenKt$SignUpBody$4 */
/* loaded from: classes7.dex */
public final class SignUpScreenKt$SignUpBody$4 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ TextFieldController $emailController;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ boolean $isReadyToSignUp;
    final /* synthetic */ String $merchantName;
    final /* synthetic */ TextFieldController $nameController;
    final /* synthetic */ Function0<Unit> $onSignUpClick;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ boolean $requiresNameCollection;
    final /* synthetic */ SignUpState $signUpState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpScreenKt$SignUpBody$4(String str, TextFieldController textFieldController, PhoneNumberController phoneNumberController, TextFieldController textFieldController2, SignUpState signUpState, boolean z, boolean z2, ErrorMessage errorMessage, Function0<Unit> function0, int i) {
        super(2);
        this.$merchantName = str;
        this.$emailController = textFieldController;
        this.$phoneNumberController = phoneNumberController;
        this.$nameController = textFieldController2;
        this.$signUpState = signUpState;
        this.$isReadyToSignUp = z;
        this.$requiresNameCollection = z2;
        this.$errorMessage = errorMessage;
        this.$onSignUpClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        SignUpScreenKt.SignUpBody(this.$merchantName, this.$emailController, this.$phoneNumberController, this.$nameController, this.$signUpState, this.$isReadyToSignUp, this.$requiresNameCollection, this.$errorMessage, this.$onSignUpClick, interfaceC32720Et0, this.$$changed | 1);
    }
}
