package com.stripe.android.financialconnections.utils;

import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m28432d2 = {"T", "Ln74;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.financialconnections.utils.ErrorsKt$retryOnException$2", m28418f = "Errors.kt", m28417i = {0, 0, 1, 1, 2, 2, 3, 3, 3}, m28416l = {24, 25, 33, 30}, m28415m = "invokeSuspend", m28414n = {"$this$channelFlow", "remainingTimes", "$this$channelFlow", "remainingTimes", "$this$channelFlow", "remainingTimes", "$this$channelFlow", "remainingTimes", "exception"}, m28413s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Errors.kt\ncom/stripe/android/financialconnections/utils/ErrorsKt$retryOnException$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1#2:48\n*E\n"})
/* loaded from: classes7.dex */
public final class ErrorsKt$retryOnException$2 extends SuspendLambda implements Function2<InterfaceC45497n74<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super T>, Object> $block;
    final /* synthetic */ long $delayMilliseconds;
    final /* synthetic */ long $initialDelay;
    final /* synthetic */ Function2<Throwable, Continuation<? super Boolean>, Object> $retryCondition;
    final /* synthetic */ int $times;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ErrorsKt$retryOnException$2(int i, long j, long j2, Function1<? super Continuation<? super T>, ? extends Object> function1, Function2<? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function2, Continuation<? super ErrorsKt$retryOnException$2> continuation) {
        super(2, continuation);
        this.$times = i;
        this.$initialDelay = j;
        this.$delayMilliseconds = j2;
        this.$block = function1;
        this.$retryCondition = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ErrorsKt$retryOnException$2 errorsKt$retryOnException$2 = new ErrorsKt$retryOnException$2(this.$times, this.$initialDelay, this.$delayMilliseconds, this.$block, this.$retryCondition, continuation);
        errorsKt$retryOnException$2.L$0 = obj;
        return errorsKt$retryOnException$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC45497n74<? super T> interfaceC45497n74, Continuation<? super Unit> continuation) {
        return ((ErrorsKt$retryOnException$2) create(interfaceC45497n74, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:22|23|24|25|(1:27)(5:28|29|30|31|(2:36|(8:38|(1:40)|8|(0)|12|13|14|(0)(0))(2:41|42))(6:33|(1:35)|12|13|14|(0)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bb, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
        r10 = r0;
        r0 = r12;
        r12 = r7;
        r7 = r6;
        r6 = r1;
        r1 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00de -> B:46:0x00e1). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00f7 -> B:52:0x00fa). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        InterfaceC45497n74 interfaceC45497n74;
        Ref.IntRef intRef;
        ErrorsKt$retryOnException$2 errorsKt$retryOnException$2;
        Throwable th;
        InterfaceC45497n74 interfaceC45497n742;
        Ref.IntRef intRef2;
        Object obj2;
        ErrorsKt$retryOnException$2 errorsKt$retryOnException$22;
        Object m116783constructorimpl;
        Throwable m116786exceptionOrNullimpl;
        ErrorsKt$retryOnException$2 errorsKt$retryOnException$23;
        InterfaceC45497n74 interfaceC45497n743;
        Object invoke;
        long j;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            intRef2 = (Ref.IntRef) this.L$1;
                            interfaceC45497n742 = (InterfaceC45497n74) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            m116786exceptionOrNullimpl = (Throwable) this.L$2;
                            obj2 = coroutine_suspended;
                            errorsKt$retryOnException$22 = this;
                            if (!((Boolean) obj).booleanValue()) {
                                throw m116786exceptionOrNullimpl;
                            }
                            interfaceC45497n74 = interfaceC45497n742;
                            Ref.IntRef intRef3 = intRef2;
                            errorsKt$retryOnException$2 = errorsKt$retryOnException$22;
                            coroutine_suspended = obj2;
                            intRef = intRef3;
                            intRef.element--;
                            if (!interfaceC45497n74.mo2353A()) {
                                if (intRef.element == errorsKt$retryOnException$2.$times - 1) {
                                    j = errorsKt$retryOnException$2.$initialDelay;
                                } else {
                                    j = errorsKt$retryOnException$2.$delayMilliseconds;
                                }
                                errorsKt$retryOnException$2.L$0 = interfaceC45497n74;
                                errorsKt$retryOnException$2.L$1 = intRef;
                                errorsKt$retryOnException$2.L$2 = null;
                                errorsKt$retryOnException$2.label = 1;
                                if (C48120rZ0.m15768a(j, errorsKt$retryOnException$2) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                ErrorsKt$retryOnException$2 errorsKt$retryOnException$24 = errorsKt$retryOnException$2;
                                interfaceC45497n743 = interfaceC45497n74;
                                errorsKt$retryOnException$23 = errorsKt$retryOnException$24;
                                Function1<Continuation<? super T>, Object> function1 = errorsKt$retryOnException$23.$block;
                                Result.Companion companion = Result.Companion;
                                errorsKt$retryOnException$23.L$0 = interfaceC45497n743;
                                errorsKt$retryOnException$23.L$1 = intRef;
                                errorsKt$retryOnException$23.label = 2;
                                invoke = function1.invoke(errorsKt$retryOnException$23);
                                if (invoke != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                Object obj3 = coroutine_suspended;
                                errorsKt$retryOnException$22 = errorsKt$retryOnException$23;
                                obj = invoke;
                                interfaceC45497n742 = interfaceC45497n743;
                                intRef2 = intRef;
                                obj2 = obj3;
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    Result.Companion companion2 = Result.Companion;
                                    m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                                    Function2<Throwable, Continuation<? super Boolean>, Object> function2 = errorsKt$retryOnException$22.$retryCondition;
                                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                                    if (m116786exceptionOrNullimpl == null) {
                                    }
                                }
                                m116783constructorimpl = Result.m116783constructorimpl(obj);
                                Function2<Throwable, Continuation<? super Boolean>, Object> function22 = errorsKt$retryOnException$22.$retryCondition;
                                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                                if (m116786exceptionOrNullimpl == null) {
                                    errorsKt$retryOnException$22.L$0 = interfaceC45497n742;
                                    errorsKt$retryOnException$22.L$1 = intRef2;
                                    errorsKt$retryOnException$22.label = 3;
                                    if (interfaceC45497n742.mo2351M(m116783constructorimpl, errorsKt$retryOnException$22) == obj2) {
                                        return obj2;
                                    }
                                    interfaceC45497n74 = interfaceC45497n742;
                                    Ref.IntRef intRef32 = intRef2;
                                    errorsKt$retryOnException$2 = errorsKt$retryOnException$22;
                                    coroutine_suspended = obj2;
                                    intRef = intRef32;
                                    intRef.element--;
                                    if (!interfaceC45497n74.mo2353A()) {
                                    }
                                } else if (intRef2.element != 0) {
                                    errorsKt$retryOnException$22.L$0 = interfaceC45497n742;
                                    errorsKt$retryOnException$22.L$1 = intRef2;
                                    errorsKt$retryOnException$22.L$2 = m116786exceptionOrNullimpl;
                                    errorsKt$retryOnException$22.label = 4;
                                    obj = function22.invoke(m116786exceptionOrNullimpl, errorsKt$retryOnException$22);
                                    if (obj == obj2) {
                                        return obj2;
                                    }
                                    if (!((Boolean) obj).booleanValue()) {
                                    }
                                    interfaceC45497n74 = interfaceC45497n742;
                                    Ref.IntRef intRef322 = intRef2;
                                    errorsKt$retryOnException$2 = errorsKt$retryOnException$22;
                                    coroutine_suspended = obj2;
                                    intRef = intRef322;
                                    intRef.element--;
                                    if (!interfaceC45497n74.mo2353A()) {
                                    }
                                } else {
                                    throw new TimeoutException("reached max number of retries");
                                }
                            } else {
                                return Unit.INSTANCE;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        interfaceC45497n742 = (InterfaceC45497n74) this.L$0;
                        intRef2 = (Ref.IntRef) this.L$1;
                        obj2 = coroutine_suspended;
                        errorsKt$retryOnException$22 = this;
                        interfaceC45497n74 = interfaceC45497n742;
                        Ref.IntRef intRef3222 = intRef2;
                        errorsKt$retryOnException$2 = errorsKt$retryOnException$22;
                        coroutine_suspended = obj2;
                        intRef = intRef3222;
                        intRef.element--;
                        if (!interfaceC45497n74.mo2353A()) {
                        }
                    }
                } else {
                    Ref.IntRef intRef4 = (Ref.IntRef) this.L$1;
                    InterfaceC45497n74 interfaceC45497n744 = (InterfaceC45497n74) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        interfaceC45497n742 = interfaceC45497n744;
                        intRef2 = intRef4;
                        obj2 = coroutine_suspended;
                        errorsKt$retryOnException$22 = this;
                    } catch (Throwable th3) {
                        th = th3;
                        interfaceC45497n742 = interfaceC45497n744;
                        intRef2 = intRef4;
                        obj2 = coroutine_suspended;
                        errorsKt$retryOnException$22 = this;
                        Result.Companion companion22 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        Function2<Throwable, Continuation<? super Boolean>, Object> function222 = errorsKt$retryOnException$22.$retryCondition;
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl == null) {
                        }
                    }
                    m116783constructorimpl = Result.m116783constructorimpl(obj);
                    Function2<Throwable, Continuation<? super Boolean>, Object> function2222 = errorsKt$retryOnException$22.$retryCondition;
                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                    }
                }
            } else {
                intRef = (Ref.IntRef) this.L$1;
                interfaceC45497n743 = (InterfaceC45497n74) this.L$0;
                ResultKt.throwOnFailure(obj);
                errorsKt$retryOnException$23 = this;
                Function1<Continuation<? super T>, Object> function12 = errorsKt$retryOnException$23.$block;
                Result.Companion companion3 = Result.Companion;
                errorsKt$retryOnException$23.L$0 = interfaceC45497n743;
                errorsKt$retryOnException$23.L$1 = intRef;
                errorsKt$retryOnException$23.label = 2;
                invoke = function12.invoke(errorsKt$retryOnException$23);
                if (invoke != coroutine_suspended) {
                }
            }
        } else {
            ResultKt.throwOnFailure(obj);
            interfaceC45497n74 = (InterfaceC45497n74) this.L$0;
            intRef = new Ref.IntRef();
            intRef.element = this.$times - 1;
            errorsKt$retryOnException$2 = this;
            if (!interfaceC45497n74.mo2353A()) {
            }
        }
    }
}
