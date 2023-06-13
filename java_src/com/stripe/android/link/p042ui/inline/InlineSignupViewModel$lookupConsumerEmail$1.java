package com.stripe.android.link.p042ui.inline;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.ui.inline.InlineSignupViewModel", m28418f = "InlineSignupViewModel.kt", m28417i = {0, 0}, m28416l = {186}, m28415m = "lookupConsumerEmail", m28414n = {"this", "email"}, m28413s = {"L$0", "L$1"})
/* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$lookupConsumerEmail$1 */
/* loaded from: classes7.dex */
public final class InlineSignupViewModel$lookupConsumerEmail$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InlineSignupViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineSignupViewModel$lookupConsumerEmail$1(InlineSignupViewModel inlineSignupViewModel, Continuation<? super InlineSignupViewModel$lookupConsumerEmail$1> continuation) {
        super(continuation);
        this.this$0 = inlineSignupViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object lookupConsumerEmail;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        lookupConsumerEmail = this.this$0.lookupConsumerEmail(null, this);
        return lookupConsumerEmail;
    }
}
