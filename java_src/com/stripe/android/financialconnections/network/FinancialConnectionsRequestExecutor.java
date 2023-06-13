package com.stripe.android.financialconnections.network;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.core.exception.RateLimitException;
import com.stripe.android.core.model.parsers.StripeErrorJsonParser;
import com.stripe.android.core.networking.RequestId;
import com.stripe.android.core.networking.ResponseJsonKt;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.networking.StripeRequest;
import com.stripe.android.core.networking.StripeResponse;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J/\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/financialconnections/network/FinancialConnectionsRequestExecutor;", "", "Lcom/stripe/android/core/networking/StripeResponse;", "", "response", "Ljava/lang/Exception;", "Lkotlin/Exception;", "handleApiError", "Response", "Lcom/stripe/android/core/networking/StripeRequest;", "request", "LKj2;", "responseSerializer", "execute", "(Lcom/stripe/android/core/networking/StripeRequest;LKj2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "Lbi2;", "json", "Lbi2;", "<init>", "(Lcom/stripe/android/core/networking/StripeNetworkClient;Lbi2;)V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FinancialConnectionsRequestExecutor {
    private final AbstractC38706bi2 json;
    private final StripeNetworkClient stripeNetworkClient;

    public FinancialConnectionsRequestExecutor(StripeNetworkClient stripeNetworkClient, AbstractC38706bi2 json) {
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(json, "json");
        this.stripeNetworkClient = stripeNetworkClient;
        this.json = json;
    }

    private final Exception handleApiError(StripeResponse<String> stripeResponse) throws InvalidRequestException, AuthenticationException, APIException {
        String str;
        RequestId requestId = stripeResponse.getRequestId();
        if (requestId != null) {
            str = requestId.getValue();
        } else {
            str = null;
        }
        String str2 = str;
        int code = stripeResponse.getCode();
        StripeError parse = new StripeErrorJsonParser().parse(ResponseJsonKt.responseJson(stripeResponse));
        if (code != 202) {
            if (code != 429) {
                if (code != 400) {
                    if (code != 401) {
                        if (code != 403) {
                            if (code != 404) {
                                throw new APIException(parse, str2, code, null, null, 24, null);
                            }
                        } else {
                            throw new PermissionException(parse, str2);
                        }
                    } else {
                        throw new AuthenticationException(parse, str2);
                    }
                }
            } else {
                throw new RateLimitException(parse, str2, null, null, 12, null);
            }
        }
        throw new InvalidRequestException(parse, str2, code, null, null, 24, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <Response> Object execute(StripeRequest stripeRequest, InterfaceC34036Kj2<Response> interfaceC34036Kj2, Continuation<? super Response> continuation) throws InvalidRequestException, AuthenticationException, APIException {
        FinancialConnectionsRequestExecutor$execute$1 financialConnectionsRequestExecutor$execute$1;
        Object coroutine_suspended;
        int i;
        FinancialConnectionsRequestExecutor financialConnectionsRequestExecutor;
        Object m116783constructorimpl;
        Throwable m116786exceptionOrNullimpl;
        if (continuation instanceof FinancialConnectionsRequestExecutor$execute$1) {
            financialConnectionsRequestExecutor$execute$1 = (FinancialConnectionsRequestExecutor$execute$1) continuation;
            int i2 = financialConnectionsRequestExecutor$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                financialConnectionsRequestExecutor$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = financialConnectionsRequestExecutor$execute$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = financialConnectionsRequestExecutor$execute$1.label;
                if (i == 0) {
                    if (i == 1) {
                        interfaceC34036Kj2 = (InterfaceC34036Kj2) financialConnectionsRequestExecutor$execute$1.L$2;
                        stripeRequest = (StripeRequest) financialConnectionsRequestExecutor$execute$1.L$1;
                        financialConnectionsRequestExecutor = (FinancialConnectionsRequestExecutor) financialConnectionsRequestExecutor$execute$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th) {
                            th = th;
                            Result.Companion companion = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl != null) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion2 = Result.Companion;
                        StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
                        financialConnectionsRequestExecutor$execute$1.L$0 = this;
                        financialConnectionsRequestExecutor$execute$1.L$1 = stripeRequest;
                        financialConnectionsRequestExecutor$execute$1.L$2 = interfaceC34036Kj2;
                        financialConnectionsRequestExecutor$execute$1.label = 1;
                        obj = stripeNetworkClient.executeRequest(stripeRequest, financialConnectionsRequestExecutor$execute$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        financialConnectionsRequestExecutor = this;
                    } catch (Throwable th2) {
                        th = th2;
                        financialConnectionsRequestExecutor = this;
                        Result.Companion companion3 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl((StripeResponse) obj);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    StripeResponse<String> stripeResponse = (StripeResponse) m116783constructorimpl;
                    if (stripeResponse.getCode() != 202) {
                        if (!stripeResponse.isError()) {
                            AbstractC38706bi2 abstractC38706bi2 = financialConnectionsRequestExecutor.json;
                            String body = stripeResponse.getBody();
                            if (body != null) {
                                return abstractC38706bi2.m64105b(interfaceC34036Kj2, body);
                            }
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        throw financialConnectionsRequestExecutor.handleApiError(stripeResponse);
                    }
                    throw financialConnectionsRequestExecutor.handleApiError(stripeResponse);
                }
                throw new APIConnectionException("Failed to execute " + stripeRequest, m116786exceptionOrNullimpl);
            }
        }
        financialConnectionsRequestExecutor$execute$1 = new FinancialConnectionsRequestExecutor$execute$1(this, continuation);
        Object obj2 = financialConnectionsRequestExecutor$execute$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = financialConnectionsRequestExecutor$execute$1.label;
        if (i == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl((StripeResponse) obj2);
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
        }
    }
}
