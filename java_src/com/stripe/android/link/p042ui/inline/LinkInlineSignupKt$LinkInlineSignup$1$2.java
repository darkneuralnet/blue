package com.stripe.android.link.p042ui.inline;

import com.stripe.android.link.p042ui.signup.SignUpState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$1$2", m28418f = "LinkInlineSignup.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$1$2 */
/* loaded from: classes7.dex */
public final class LinkInlineSignupKt$LinkInlineSignup$1$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC32037Bv1 $focusManager;
    final /* synthetic */ InterfaceC45645nN5 $keyboardController;
    final /* synthetic */ InterfaceC48627sP5<InlineSignupViewState> $viewState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignupKt$LinkInlineSignup$1$2(InterfaceC32037Bv1 interfaceC32037Bv1, InterfaceC45645nN5 interfaceC45645nN5, InterfaceC48627sP5<InlineSignupViewState> interfaceC48627sP5, Continuation<? super LinkInlineSignupKt$LinkInlineSignup$1$2> continuation) {
        super(2, continuation);
        this.$focusManager = interfaceC32037Bv1;
        this.$keyboardController = interfaceC45645nN5;
        this.$viewState$delegate = interfaceC48627sP5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkInlineSignupKt$LinkInlineSignup$1$2(this.$focusManager, this.$keyboardController, this.$viewState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((LinkInlineSignupKt$LinkInlineSignup$1$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InlineSignupViewState LinkInlineSignup$lambda$2$lambda$0;
        InlineSignupViewState LinkInlineSignup$lambda$2$lambda$02;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            LinkInlineSignup$lambda$2$lambda$0 = LinkInlineSignupKt.LinkInlineSignup$lambda$2$lambda$0(this.$viewState$delegate);
            if (LinkInlineSignup$lambda$2$lambda$0.getSignUpState$link_release() == SignUpState.InputtingEmail) {
                LinkInlineSignup$lambda$2$lambda$02 = LinkInlineSignupKt.LinkInlineSignup$lambda$2$lambda$0(this.$viewState$delegate);
                if (LinkInlineSignup$lambda$2$lambda$02.getUserInput() != null) {
                    this.$focusManager.mo68846n(true);
                    InterfaceC45645nN5 interfaceC45645nN5 = this.$keyboardController;
                    if (interfaceC45645nN5 != null) {
                        interfaceC45645nN5.mo23924b();
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
