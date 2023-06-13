package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.StripeChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultChallengeRequestResultRepository;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResultRepository;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lkotlin/coroutines/CoroutineContext;)V", "get", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "creqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "challengeRequestData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultChallengeRequestResultRepository implements ChallengeRequestResultRepository {
    private final ErrorReporter errorReporter;
    private final CoroutineContext workContext;

    public DefaultChallengeRequestResultRepository(ErrorReporter errorReporter, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.ChallengeRequestResultRepository
    public Object get(ChallengeRequestExecutor.Config config, ChallengeRequestData challengeRequestData, Continuation<? super ChallengeRequestResult> continuation) {
        return new StripeChallengeRequestExecutor.Factory(config).create(this.errorReporter, this.workContext).execute(challengeRequestData, continuation);
    }
}
