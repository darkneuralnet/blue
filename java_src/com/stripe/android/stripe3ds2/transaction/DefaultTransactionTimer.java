package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultTransactionTimer;", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "createTimeoutErrorData", "", "start", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTimeout$3ds2sdk_release", "()V", "onTimeout", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "errorRequestExecutor", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "", "timeoutMillis", "J", "LGX2;", "", "mutableTimeoutFlow", "LGX2;", "LtP5;", "timeout", "LtP5;", "getTimeout", "()LtP5;", "", "timeoutMinutes", "<init>", "(ILcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;)V", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class DefaultTransactionTimer implements TransactionTimer {
    private final ChallengeRequestData creqData;
    private final ErrorRequestExecutor errorRequestExecutor;
    private final GX2<Boolean> mutableTimeoutFlow;
    private final InterfaceC49220tP5<Boolean> timeout;
    private final long timeoutMillis;

    public DefaultTransactionTimer(int i, ErrorRequestExecutor errorRequestExecutor, ChallengeRequestData creqData) {
        Intrinsics.checkNotNullParameter(errorRequestExecutor, "errorRequestExecutor");
        Intrinsics.checkNotNullParameter(creqData, "creqData");
        this.errorRequestExecutor = errorRequestExecutor;
        this.creqData = creqData;
        this.timeoutMillis = TimeUnit.MINUTES.toMillis(i);
        GX2<Boolean> m8742a = C50405vP5.m8742a(Boolean.FALSE);
        this.mutableTimeoutFlow = m8742a;
        this.timeout = m8742a;
    }

    private final ErrorData createTimeoutErrorData() {
        String threeDsServerTransId = this.creqData.getThreeDsServerTransId();
        String acsTransId = this.creqData.getAcsTransId();
        ProtocolError protocolError = ProtocolError.TransactionTimedout;
        return new ErrorData(threeDsServerTransId, acsTransId, null, String.valueOf(protocolError.getCode()), ErrorData.ErrorComponent.ThreeDsSdk, protocolError.getDescription(), "Timeout expiry reached for the transaction", null, this.creqData.getMessageVersion(), this.creqData.getSdkTransId(), 132, null);
    }

    public final void onTimeout$3ds2sdk_release() {
        this.errorRequestExecutor.executeAsync(createTimeoutErrorData());
        this.mutableTimeoutFlow.setValue(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.stripe.android.stripe3ds2.transaction.TransactionTimer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object start(Continuation<? super Unit> continuation) {
        DefaultTransactionTimer$start$1 defaultTransactionTimer$start$1;
        Object coroutine_suspended;
        int i;
        DefaultTransactionTimer defaultTransactionTimer;
        if (continuation instanceof DefaultTransactionTimer$start$1) {
            defaultTransactionTimer$start$1 = (DefaultTransactionTimer$start$1) continuation;
            int i2 = defaultTransactionTimer$start$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultTransactionTimer$start$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultTransactionTimer$start$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = defaultTransactionTimer$start$1.label;
                if (i == 0) {
                    if (i == 1) {
                        defaultTransactionTimer = (DefaultTransactionTimer) defaultTransactionTimer$start$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    long j = this.timeoutMillis;
                    defaultTransactionTimer$start$1.L$0 = this;
                    defaultTransactionTimer$start$1.label = 1;
                    if (C48120rZ0.m15768a(j, defaultTransactionTimer$start$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    defaultTransactionTimer = this;
                }
                defaultTransactionTimer.onTimeout$3ds2sdk_release();
                return Unit.INSTANCE;
            }
        }
        defaultTransactionTimer$start$1 = new DefaultTransactionTimer$start$1(this, continuation);
        Object obj2 = defaultTransactionTimer$start$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultTransactionTimer$start$1.label;
        if (i == 0) {
        }
        defaultTransactionTimer.onTimeout$3ds2sdk_release();
        return Unit.INSTANCE;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.TransactionTimer
    public InterfaceC49220tP5<Boolean> getTimeout() {
        return this.timeout;
    }
}
