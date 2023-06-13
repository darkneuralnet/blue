package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "", "submit", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "action", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Default", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface ChallengeActionHandler {
    Object submit(ChallengeAction challengeAction, Continuation<? super ChallengeRequestResult> continuation);

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "creqExecutorFactory", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Factory;Lkotlin/coroutines/CoroutineContext;)V", "challengeRequestExecutor", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor;Lkotlin/coroutines/CoroutineContext;)V", "executeChallengeRequest", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submit", "action", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Default implements ChallengeActionHandler {
        private final ChallengeRequestExecutor challengeRequestExecutor;
        private final ChallengeRequestData creqData;
        private final ErrorReporter errorReporter;
        private final CoroutineContext workContext;
        public static final Companion Companion = new Companion(null);
        private static final long CREQ_DELAY = TimeUnit.SECONDS.toMillis(1);

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default$Companion;", "", "()V", "CREQ_DELAY", "", "getCREQ_DELAY$3ds2sdk_release", "()J", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final long getCREQ_DELAY$3ds2sdk_release() {
                return Default.CREQ_DELAY;
            }

            private Companion() {
            }
        }

        public Default(ChallengeRequestData creqData, ErrorReporter errorReporter, ChallengeRequestExecutor challengeRequestExecutor, CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(creqData, "creqData");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(challengeRequestExecutor, "challengeRequestExecutor");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            this.creqData = creqData;
            this.errorReporter = errorReporter;
            this.challengeRequestExecutor = challengeRequestExecutor;
            this.workContext = workContext;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|(1:(1:(8:10|11|12|13|14|(1:16)|17|(1:22)(2:19|20))(2:26|27))(1:28))(2:37|(1:39)(1:40))|29|30|(1:32)(6:33|13|14|(0)|17|(0)(0))))|41|6|(0)(0)|29|30|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
            r9 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
            r0 = r2;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object executeChallengeRequest(ChallengeRequestData challengeRequestData, Continuation<? super ChallengeRequestResult> continuation) {
            ChallengeActionHandler$Default$executeChallengeRequest$1 challengeActionHandler$Default$executeChallengeRequest$1;
            Object obj;
            Object coroutine_suspended;
            int i;
            Default r2;
            Default r0;
            Object m116783constructorimpl;
            Throwable m116786exceptionOrNullimpl;
            Throwable m116786exceptionOrNullimpl2;
            String trimIndent;
            if (continuation instanceof ChallengeActionHandler$Default$executeChallengeRequest$1) {
                challengeActionHandler$Default$executeChallengeRequest$1 = (ChallengeActionHandler$Default$executeChallengeRequest$1) continuation;
                int i2 = challengeActionHandler$Default$executeChallengeRequest$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    challengeActionHandler$Default$executeChallengeRequest$1.label = i2 - Integer.MIN_VALUE;
                    obj = challengeActionHandler$Default$executeChallengeRequest$1.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = challengeActionHandler$Default$executeChallengeRequest$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                challengeRequestData = (ChallengeRequestData) challengeActionHandler$Default$executeChallengeRequest$1.L$1;
                                r0 = (Default) challengeActionHandler$Default$executeChallengeRequest$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    m116783constructorimpl = Result.m116783constructorimpl((ChallengeRequestResult) obj);
                                } catch (Throwable th) {
                                    th = th;
                                    Result.Companion companion = Result.Companion;
                                    m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                                    if (m116786exceptionOrNullimpl != null) {
                                    }
                                    m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                                    if (m116786exceptionOrNullimpl2 == null) {
                                    }
                                }
                                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                                if (m116786exceptionOrNullimpl != null) {
                                    ErrorReporter errorReporter = r0.errorReporter;
                                    trimIndent = StringsKt__IndentKt.trimIndent("\n                            Failed to execute challenge request.\n\n                            CReq = " + challengeRequestData.sanitize$3ds2sdk_release() + "\n                        ");
                                    errorReporter.reportError(new RuntimeException(trimIndent, m116786exceptionOrNullimpl));
                                }
                                m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                                if (m116786exceptionOrNullimpl2 == null) {
                                    return new ChallengeRequestResult.RuntimeError(m116786exceptionOrNullimpl2);
                                }
                                return m116783constructorimpl;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        challengeRequestData = (ChallengeRequestData) challengeActionHandler$Default$executeChallengeRequest$1.L$1;
                        r2 = (Default) challengeActionHandler$Default$executeChallengeRequest$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        ResultKt.throwOnFailure(obj);
                        long j = CREQ_DELAY;
                        challengeActionHandler$Default$executeChallengeRequest$1.L$0 = this;
                        challengeActionHandler$Default$executeChallengeRequest$1.L$1 = challengeRequestData;
                        challengeActionHandler$Default$executeChallengeRequest$1.label = 1;
                        if (C48120rZ0.m15768a(j, challengeActionHandler$Default$executeChallengeRequest$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r2 = this;
                    }
                    Result.Companion companion2 = Result.Companion;
                    ChallengeRequestExecutor challengeRequestExecutor = r2.challengeRequestExecutor;
                    challengeActionHandler$Default$executeChallengeRequest$1.L$0 = r2;
                    challengeActionHandler$Default$executeChallengeRequest$1.L$1 = challengeRequestData;
                    challengeActionHandler$Default$executeChallengeRequest$1.label = 2;
                    obj = challengeRequestExecutor.execute(challengeRequestData, challengeActionHandler$Default$executeChallengeRequest$1);
                    if (obj != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r0 = r2;
                    m116783constructorimpl = Result.m116783constructorimpl((ChallengeRequestResult) obj);
                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl != null) {
                    }
                    m116786exceptionOrNullimpl2 = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl2 == null) {
                    }
                }
            }
            challengeActionHandler$Default$executeChallengeRequest$1 = new ChallengeActionHandler$Default$executeChallengeRequest$1(this, continuation);
            obj = challengeActionHandler$Default$executeChallengeRequest$1.result;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = challengeActionHandler$Default$executeChallengeRequest$1.label;
            if (i == 0) {
            }
            Result.Companion companion22 = Result.Companion;
            ChallengeRequestExecutor challengeRequestExecutor2 = r2.challengeRequestExecutor;
            challengeActionHandler$Default$executeChallengeRequest$1.L$0 = r2;
            challengeActionHandler$Default$executeChallengeRequest$1.L$1 = challengeRequestData;
            challengeActionHandler$Default$executeChallengeRequest$1.label = 2;
            obj = challengeRequestExecutor2.execute(challengeRequestData, challengeActionHandler$Default$executeChallengeRequest$1);
            if (obj != coroutine_suspended) {
            }
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler
        public Object submit(ChallengeAction challengeAction, Continuation<? super ChallengeRequestResult> continuation) {
            return X30.m77504g(this.workContext, new ChallengeActionHandler$Default$submit$2(this, challengeAction, null), continuation);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Default(ChallengeRequestData creqData, ErrorReporter errorReporter, ChallengeRequestExecutor.Factory creqExecutorFactory, CoroutineContext workContext) {
            this(creqData, errorReporter, creqExecutorFactory.create(errorReporter, workContext), workContext);
            Intrinsics.checkNotNullParameter(creqData, "creqData");
            Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
            Intrinsics.checkNotNullParameter(creqExecutorFactory, "creqExecutorFactory");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
        }
    }
}
