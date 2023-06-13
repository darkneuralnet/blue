package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import com.stripe.android.model.Token;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\nH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken;", "", "connectionsRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;)V", "invoke", "Lkotlin/Pair;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "Lcom/stripe/android/model/Token;", "clientSecret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nFetchFinancialConnectionsSessionForToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchFinancialConnectionsSessionForToken.kt\ncom/stripe/android/financialconnections/domain/FetchFinancialConnectionsSessionForToken\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
/* loaded from: classes7.dex */
public final class FetchFinancialConnectionsSessionForToken {
    private final FinancialConnectionsRepository connectionsRepository;

    public FetchFinancialConnectionsSessionForToken(FinancialConnectionsRepository connectionsRepository) {
        Intrinsics.checkNotNullParameter(connectionsRepository, "connectionsRepository");
        this.connectionsRepository = connectionsRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, Continuation<? super Pair<FinancialConnectionsSession, Token>> continuation) {
        FetchFinancialConnectionsSessionForToken$invoke$1 fetchFinancialConnectionsSessionForToken$invoke$1;
        Object coroutine_suspended;
        int i;
        Token parsedToken$financial_connections_release;
        if (continuation instanceof FetchFinancialConnectionsSessionForToken$invoke$1) {
            fetchFinancialConnectionsSessionForToken$invoke$1 = (FetchFinancialConnectionsSessionForToken$invoke$1) continuation;
            int i2 = fetchFinancialConnectionsSessionForToken$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchFinancialConnectionsSessionForToken$invoke$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fetchFinancialConnectionsSessionForToken$invoke$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fetchFinancialConnectionsSessionForToken$invoke$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    FinancialConnectionsRepository financialConnectionsRepository = this.connectionsRepository;
                    fetchFinancialConnectionsSessionForToken$invoke$1.label = 1;
                    obj = financialConnectionsRepository.getFinancialConnectionsSession(str, fetchFinancialConnectionsSessionForToken$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                FinancialConnectionsSession financialConnectionsSession = (FinancialConnectionsSession) obj;
                parsedToken$financial_connections_release = financialConnectionsSession.getParsedToken$financial_connections_release();
                if (parsedToken$financial_connections_release == null) {
                    return TuplesKt.m28425to(financialConnectionsSession, parsedToken$financial_connections_release);
                }
                throw new IllegalArgumentException("Could not extract Token from FinancialConnectionsSession.".toString());
            }
        }
        fetchFinancialConnectionsSessionForToken$invoke$1 = new FetchFinancialConnectionsSessionForToken$invoke$1(this, continuation);
        Object obj2 = fetchFinancialConnectionsSessionForToken$invoke$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fetchFinancialConnectionsSessionForToken$invoke$1.label;
        if (i == 0) {
        }
        FinancialConnectionsSession financialConnectionsSession2 = (FinancialConnectionsSession) obj2;
        parsedToken$financial_connections_release = financialConnectionsSession2.getParsedToken$financial_connections_release();
        if (parsedToken$financial_connections_release == null) {
        }
    }
}
