package com.stripe.android.link.p042ui.inline;

import androidx.compose.p003ui.focus.C11309h;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$3", m28418f = "LinkInlineSignup.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkInlineSignup$3 */
/* loaded from: classes7.dex */
public final class LinkInlineSignupKt$LinkInlineSignup$3 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ C11309h $focusRequester;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkInlineSignupKt$LinkInlineSignup$3(boolean z, C11309h c11309h, Continuation<? super LinkInlineSignupKt$LinkInlineSignup$3> continuation) {
        super(2, continuation);
        this.$expanded = z;
        this.$focusRequester = c11309h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkInlineSignupKt$LinkInlineSignup$3(this.$expanded, this.$focusRequester, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((LinkInlineSignupKt$LinkInlineSignup$3) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$expanded) {
                this.$focusRequester.m68779e();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}