package com.stripe.android.financialconnections.repository;

import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccountList;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.GetFinancialConnectionsAcccountsParams;
import com.stripe.android.financialconnections.model.MixedOAuthParams;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ!\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ#\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/financialconnections/repository/FinancialConnectionsRepository;", "", "getFinancialConnectionsAccounts", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "getFinancialConnectionsAcccountsParams", "Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;", "(Lcom/stripe/android/financialconnections/model/GetFinancialConnectionsAcccountsParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFinancialConnectionsSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "clientSecret", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postAuthorizationSessionOAuthResults", "Lcom/stripe/android/financialconnections/model/MixedOAuthParams;", "sessionId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postCompleteFinancialConnectionsSessions", "terminalError", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface FinancialConnectionsRepository {
    Object getFinancialConnectionsAccounts(GetFinancialConnectionsAcccountsParams getFinancialConnectionsAcccountsParams, Continuation<? super FinancialConnectionsAccountList> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object getFinancialConnectionsSession(String str, Continuation<? super FinancialConnectionsSession> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;

    Object postAuthorizationSessionOAuthResults(String str, String str2, Continuation<? super MixedOAuthParams> continuation);

    Object postCompleteFinancialConnectionsSessions(String str, String str2, Continuation<? super FinancialConnectionsSession> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException;
}
