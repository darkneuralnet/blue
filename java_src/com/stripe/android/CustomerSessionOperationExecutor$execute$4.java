package com.stripe.android;

import com.stripe.android.CustomerSession;
import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.CustomerSessionOperationExecutor$execute$4", m28418f = "CustomerSessionOperationExecutor.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class CustomerSessionOperationExecutor$execute$4 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ EphemeralOperation $operation;
    final /* synthetic */ Object $result;
    int label;
    final /* synthetic */ CustomerSessionOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerSessionOperationExecutor$execute$4(CustomerSessionOperationExecutor customerSessionOperationExecutor, EphemeralOperation ephemeralOperation, Object obj, Continuation<? super CustomerSessionOperationExecutor$execute$4> continuation) {
        super(2, continuation);
        this.this$0 = customerSessionOperationExecutor;
        this.$operation = ephemeralOperation;
        this.$result = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CustomerSessionOperationExecutor$execute$4(this.this$0, this.$operation, this.$result, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((CustomerSessionOperationExecutor$execute$4) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CustomerSession.RetrievalListener listener;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            listener = this.this$0.getListener(this.$operation.getId$payments_core_release());
            CustomerSession.SourceRetrievalListener sourceRetrievalListener = (CustomerSession.SourceRetrievalListener) listener;
            Object obj2 = this.$result;
            CustomerSessionOperationExecutor customerSessionOperationExecutor = this.this$0;
            Throwable m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(obj2);
            if (m116786exceptionOrNullimpl == null) {
                Source source = (Source) obj2;
                if (sourceRetrievalListener != null) {
                    sourceRetrievalListener.onSourceRetrieved(source);
                    return Unit.INSTANCE;
                }
                return null;
            }
            customerSessionOperationExecutor.onError(sourceRetrievalListener, m116786exceptionOrNullimpl);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
