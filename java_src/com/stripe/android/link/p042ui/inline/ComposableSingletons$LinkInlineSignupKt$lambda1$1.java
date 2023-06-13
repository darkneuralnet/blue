package com.stripe.android.link.p042ui.inline;

import com.stripe.android.link.p042ui.signup.SignUpState;
import com.stripe.android.uicore.elements.EmailConfig;
import com.stripe.android.uicore.elements.NameConfig;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", "invoke", "(LEt0;I)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes7.dex */
public final class ComposableSingletons$LinkInlineSignupKt$lambda1$1 extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {
    public static final ComposableSingletons$LinkInlineSignupKt$lambda1$1 INSTANCE = new ComposableSingletons$LinkInlineSignupKt$lambda1$1();

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt$lambda-1$1$1 */
    /* loaded from: classes7.dex */
    public static final class C190141 extends Lambda implements Function0<Unit> {
        public static final C190141 INSTANCE = new C190141();

        public C190141() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public ComposableSingletons$LinkInlineSignupKt$lambda1$1() {
        super(2);
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
            C35528Qt0.m87816Z(-549453615, i, -1, "com.stripe.android.link.ui.inline.ComposableSingletons$LinkInlineSignupKt.lambda-1.<anonymous> (LinkInlineSignup.kt:67)");
        }
        SimpleTextFieldController createController = EmailConfig.Companion.createController("email@me.co");
        PhoneNumberController createPhoneNumberController$default = PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.Companion, "5555555555", null, 2, null);
        SimpleTextFieldController createController2 = NameConfig.Companion.createController("My Name");
        SignUpState signUpState = SignUpState.InputtingEmail;
        C190141 c190141 = C190141.INSTANCE;
        int i2 = SimpleTextFieldController.$stable;
        LinkInlineSignupKt.LinkInlineSignup("Example, Inc.", createController, createPhoneNumberController$default, createController2, signUpState, true, true, true, null, c190141, null, interfaceC32720Et0, (i2 << 3) | 920346630 | (PhoneNumberController.$stable << 6) | (i2 << 9), 0, 1024);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
    }
}
