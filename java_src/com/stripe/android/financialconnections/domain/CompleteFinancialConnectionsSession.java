package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/CompleteFinancialConnectionsSession;", "", "repository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "fetchPaginatedAccountsForSession", "Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;Lcom/stripe/android/financialconnections/domain/FetchPaginatedAccountsForSession;Lcom/stripe/android/financialconnections/FinancialConnectionsSheet$Configuration;)V", "invoke", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "terminalError", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class CompleteFinancialConnectionsSession {
    private final FinancialConnectionsSheet.Configuration configuration;
    private final FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession;
    private final FinancialConnectionsRepository repository;

    public CompleteFinancialConnectionsSession(FinancialConnectionsRepository repository, FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession, FinancialConnectionsSheet.Configuration configuration) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(fetchPaginatedAccountsForSession, "fetchPaginatedAccountsForSession");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.repository = repository;
        this.fetchPaginatedAccountsForSession = fetchPaginatedAccountsForSession;
        this.configuration = configuration;
    }

    public static /* synthetic */ Object invoke$default(CompleteFinancialConnectionsSession completeFinancialConnectionsSession, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return completeFinancialConnectionsSession.invoke(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[PHI: r7 
      PHI: (r7v7 java.lang.Object) = (r7v6 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x0060, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, Continuation<? super FinancialConnectionsSession> continuation) {
        CompleteFinancialConnectionsSession$invoke$1 completeFinancialConnectionsSession$invoke$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        CompleteFinancialConnectionsSession completeFinancialConnectionsSession;
        if (continuation instanceof CompleteFinancialConnectionsSession$invoke$1) {
            completeFinancialConnectionsSession$invoke$1 = (CompleteFinancialConnectionsSession$invoke$1) continuation;
            int i2 = completeFinancialConnectionsSession$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                completeFinancialConnectionsSession$invoke$1.label = i2 - Integer.MIN_VALUE;
                obj = completeFinancialConnectionsSession$invoke$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = completeFinancialConnectionsSession$invoke$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completeFinancialConnectionsSession = (CompleteFinancialConnectionsSession) completeFinancialConnectionsSession$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    FinancialConnectionsRepository financialConnectionsRepository = this.repository;
                    String financialConnectionsSessionClientSecret = this.configuration.getFinancialConnectionsSessionClientSecret();
                    completeFinancialConnectionsSession$invoke$1.L$0 = this;
                    completeFinancialConnectionsSession$invoke$1.label = 1;
                    obj = financialConnectionsRepository.postCompleteFinancialConnectionsSessions(financialConnectionsSessionClientSecret, str, completeFinancialConnectionsSession$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    completeFinancialConnectionsSession = this;
                }
                FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession = completeFinancialConnectionsSession.fetchPaginatedAccountsForSession;
                completeFinancialConnectionsSession$invoke$1.L$0 = null;
                completeFinancialConnectionsSession$invoke$1.label = 2;
                obj = fetchPaginatedAccountsForSession.invoke((FinancialConnectionsSession) obj, completeFinancialConnectionsSession$invoke$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                return obj;
            }
        }
        completeFinancialConnectionsSession$invoke$1 = new CompleteFinancialConnectionsSession$invoke$1(this, continuation);
        obj = completeFinancialConnectionsSession$invoke$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = completeFinancialConnectionsSession$invoke$1.label;
        if (i == 0) {
        }
        FetchPaginatedAccountsForSession fetchPaginatedAccountsForSession2 = completeFinancialConnectionsSession.fetchPaginatedAccountsForSession;
        completeFinancialConnectionsSession$invoke$1.L$0 = null;
        completeFinancialConnectionsSession$invoke$1.label = 2;
        obj = fetchPaginatedAccountsForSession2.invoke((FinancialConnectionsSession) obj, completeFinancialConnectionsSession$invoke$1);
        if (obj != coroutine_suspended) {
        }
    }
}
