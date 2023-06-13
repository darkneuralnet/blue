package com.stripe.android.link.p042ui.inline;

import com.stripe.android.link.p042ui.ErrorMessage;
import com.stripe.android.link.p042ui.signup.SignUpState;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.TextFieldController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$5 */
/* loaded from: classes7.dex */
public final class LinkInlineSignupKt$LinkInlineSignup$5 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ TextFieldController $emailController;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ String $merchantName;
    final /* synthetic */ InterfaceC41563gV2 $modifier;
    final /* synthetic */ TextFieldController $nameController;
    final /* synthetic */ PhoneNumberController $phoneNumberController;
    final /* synthetic */ boolean $requiresNameCollection;
    final /* synthetic */ SignUpState $signUpState;
    final /* synthetic */ Function0<Unit> $toggleExpanded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignupKt$LinkInlineSignup$5(String str, TextFieldController textFieldController, PhoneNumberController phoneNumberController, TextFieldController textFieldController2, SignUpState signUpState, boolean z, boolean z2, boolean z3, ErrorMessage errorMessage, Function0<Unit> function0, InterfaceC41563gV2 interfaceC41563gV2, int i, int i2, int i3) {
        super(2);
        this.$merchantName = str;
        this.$emailController = textFieldController;
        this.$phoneNumberController = phoneNumberController;
        this.$nameController = textFieldController2;
        this.$signUpState = signUpState;
        this.$enabled = z;
        this.$expanded = z2;
        this.$requiresNameCollection = z3;
        this.$errorMessage = errorMessage;
        this.$toggleExpanded = function0;
        this.$modifier = interfaceC41563gV2;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        LinkInlineSignupKt.LinkInlineSignup(this.$merchantName, this.$emailController, this.$phoneNumberController, this.$nameController, this.$signUpState, this.$enabled, this.$expanded, this.$requiresNameCollection, this.$errorMessage, this.$toggleExpanded, this.$modifier, interfaceC32720Et0, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}
