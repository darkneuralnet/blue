package com.stripe.android.link.p042ui.signup;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.ui.signup.SignUpViewModel", m28418f = "SignUpViewModel.kt", m28417i = {0}, m28416l = {172}, m28415m = "lookupConsumerEmail", m28414n = {"this"}, m28413s = {"L$0"})
/* renamed from: com.stripe.android.link.ui.signup.SignUpViewModel$lookupConsumerEmail$1 */
/* loaded from: classes7.dex */
public final class SignUpViewModel$lookupConsumerEmail$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SignUpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpViewModel$lookupConsumerEmail$1(SignUpViewModel signUpViewModel, Continuation<? super SignUpViewModel$lookupConsumerEmail$1> continuation) {
        super(continuation);
        this.this$0 = signUpViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.lookupConsumerEmail(null, this);
    }
}
