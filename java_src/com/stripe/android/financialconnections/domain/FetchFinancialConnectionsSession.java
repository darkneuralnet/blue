package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSession;", "", "fetchPaginatedAccountsForSession", "Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;", "financialConnectionsRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "(Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V", "invoke", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "clientSecret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FetchFinancialConnectionsSession {
    private final FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession;
    private final FinancialConnectionsRepository financialConnectionsRepository;

    public FetchFinancialConnectionsSession(FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession, FinancialConnectionsRepository financialConnectionsRepository) {
        Intrinsics.checkNotNullParameter(fetchPaginatedAccountsForSession, "fetchPaginatedAccountsForSession");
        Intrinsics.checkNotNullParameter(financialConnectionsRepository, "financialConnectionsRepository");
        this.fetchPaginatedAccountsForSession = fetchPaginatedAccountsForSession;
        this.financialConnectionsRepository = financialConnectionsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[PHI: r7 
      PHI: (r7v7 java.lang.Object) = (r7v6 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x005a, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, Continuation<? super FinancialConnectionsSession> continuation) {
        FetchFinancialConnectionsSession$invoke$1 fetchFinancialConnectionsSession$invoke$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        FetchFinancialConnectionsSession fetchFinancialConnectionsSession;
        if (continuation instanceof FetchFinancialConnectionsSession$invoke$1) {
            fetchFinancialConnectionsSession$invoke$1 = (FetchFinancialConnectionsSession$invoke$1) continuation;
            int i2 = fetchFinancialConnectionsSession$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchFinancialConnectionsSession$invoke$1.label = i2 - Integer.MIN_VALUE;
                obj = fetchFinancialConnectionsSession$invoke$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fetchFinancialConnectionsSession$invoke$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fetchFinancialConnectionsSession = (FetchFinancialConnectionsSession) fetchFinancialConnectionsSession$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    FinancialConnectionsRepository financialConnectionsRepository = this.financialConnectionsRepository;
                    fetchFinancialConnectionsSession$invoke$1.L$0 = this;
                    fetchFinancialConnectionsSession$invoke$1.label = 1;
                    obj = financialConnectionsRepository.getFinancialConnectionsSession(str, fetchFinancialConnectionsSession$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    fetchFinancialConnectionsSession = this;
                }
                FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession = fetchFinancialConnectionsSession.fetchPaginatedAccountsForSession;
                fetchFinancialConnectionsSession$invoke$1.L$0 = null;
                fetchFinancialConnectionsSession$invoke$1.label = 2;
                obj = fetchPaginatedAccountsForSession.invoke((FinancialConnectionsSession) obj, fetchFinancialConnectionsSession$invoke$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                return obj;
            }
        }
        fetchFinancialConnectionsSession$invoke$1 = new FetchFinancialConnectionsSession$invoke$1(this, continuation);
        obj = fetchFinancialConnectionsSession$invoke$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchFinancialConnectionsSession$invoke$1.label;
        if (i == 0) {
        }
        FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession2 = fetchFinancialConnectionsSession.fetchPaginatedAccountsForSession;
        fetchFinancialConnectionsSession$invoke$1.L$0 = null;
        fetchFinancialConnectionsSession$invoke$1.label = 2;
        obj = fetchPaginatedAccountsForSession2.invoke((FinancialConnectionsSession) obj, fetchFinancialConnectionsSession$invoke$1);
        if (obj != coroutine_suspended) {
        }
    }
}
