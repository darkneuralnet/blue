package com.stripe.android.stripe3ds2.observability;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 7, 1})
@DebugMetadata(m28419c = "com.stripe.android.stripe3ds2.observability.DefaultErrorReporter$reportError$1", m28418f = "DefaultErrorReporter.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes7.dex */
public final class DefaultErrorReporter$reportError$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

    /* renamed from: $t */
    final /* synthetic */ Throwable f75439$t;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultErrorReporter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultErrorReporter$reportError$1(DefaultErrorReporter defaultErrorReporter, Throwable th, Continuation<? super DefaultErrorReporter$reportError$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultErrorReporter;
        this.f75439$t = th;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultErrorReporter$reportError$1 defaultErrorReporter$reportError$1 = new DefaultErrorReporter$reportError$1(this.this$0, this.f75439$t, continuation);
        defaultErrorReporter$reportError$1.L$0 = obj;
        return defaultErrorReporter$reportError$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((DefaultErrorReporter$reportError$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m116783constructorimpl;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ZC0 zc0 = (ZC0) this.L$0;
            DefaultErrorReporter defaultErrorReporter = this.this$0;
            Throwable th = this.f75439$t;
            try {
                Result.Companion companion = Result.Companion;
                defaultErrorReporter.send(defaultErrorReporter.createRequestBody$3ds2sdk_release(th));
                m116783constructorimpl = Result.m116783constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th2));
            }
            DefaultErrorReporter defaultErrorReporter2 = this.this$0;
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
            if (m116786exceptionOrNullimpl != null) {
                defaultErrorReporter2.onFailure(m116786exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
