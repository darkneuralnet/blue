package com.stripe.android.link.p042ui.signup;

import androidx.compose.p003ui.focus.C11309h;
import com.stripe.android.uicore.elements.TextFieldController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.signup.SignUpScreenKt$EmailCollectionSection$3 */
/* loaded from: classes7.dex */
public final class SignUpScreenKt$EmailCollectionSection$3 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ TextFieldController $emailController;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ C11309h $focusRequester;
    final /* synthetic */ SignUpState $signUpState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpScreenKt$EmailCollectionSection$3(boolean z, TextFieldController textFieldController, SignUpState signUpState, C11309h c11309h, int i, int i2) {
        super(2);
        this.$enabled = z;
        this.$emailController = textFieldController;
        this.$signUpState = signUpState;
        this.$focusRequester = c11309h;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
        invoke(interfaceC32720Et0, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        SignUpScreenKt.EmailCollectionSection(this.$enabled, this.$emailController, this.$signUpState, this.$focusRequester, interfaceC32720Et0, this.$$changed | 1, this.$$default);
    }
}
