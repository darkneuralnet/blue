package com.stripe.android.link;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.link.LinkActivity$onCreate$1$1$2$1", m28418f = "LinkActivity.kt", m28417i = {}, m28416l = {88}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class LinkActivity$onCreate$1$1$2$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ GU2 $sheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkActivity$onCreate$1$1$2$1(GU2 gu2, Continuation<? super LinkActivity$onCreate$1$1$2$1> continuation) {
        super(2, continuation);
        this.$sheetState = gu2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LinkActivity$onCreate$1$1$2$1(this.$sheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((LinkActivity$onCreate$1$1$2$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            GU2 gu2 = this.$sheetState;
            this.label = 1;
            if (gu2.m105061i(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}