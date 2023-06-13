package com.stripe.android.link.p042ui.signup;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.signup.SignUpScreenKt$SignUpBody$3$3$1$3$1 */
/* loaded from: classes7.dex */
public final class SignUpScreenKt$SignUpBody$3$3$1$3$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ InterfaceC45645nN5 $keyboardController;
    final /* synthetic */ Function0<Unit> $onSignUpClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpScreenKt$SignUpBody$3$3$1$3$1(Function0<Unit> function0, InterfaceC45645nN5 interfaceC45645nN5) {
        super(0);
        this.$onSignUpClick = function0;
        this.$keyboardController = interfaceC45645nN5;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSignUpClick.invoke();
        InterfaceC45645nN5 interfaceC45645nN5 = this.$keyboardController;
        if (interfaceC45645nN5 != null) {
            interfaceC45645nN5.mo23924b();
        }
    }
}
