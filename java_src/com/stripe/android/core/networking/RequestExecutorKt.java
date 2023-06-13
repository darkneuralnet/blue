package com.stripe.android.core.networking;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.core.model.parsers.StripeErrorJsonParser;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m28432d2 = {"executeRequestWithModelJsonParser", "Response", "Lcom/stripe/android/core/model/StripeModel;", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "stripeErrorJsonParser", "Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;", "request", "Lcom/stripe/android/core/networking/StripeRequest;", "responseJsonParser", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "(Lcom/stripe/android/core/networking/StripeNetworkClient;Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;Lcom/stripe/android/core/networking/StripeRequest;Lcom/stripe/android/core/model/parsers/ModelJsonParser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stripe-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class RequestExecutorKt {
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:32|33))(3:34|35|(1:37))|12|13|(2:15|(4:17|(1:19)(1:23)|20|21)(2:24|(1:26)(2:27|28)))(2:29|30)))|40|6|7|(0)(0)|12|13|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
        r12 = kotlin.Result.Companion;
        r8 = kotlin.Result.m116783constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <Response extends StripeModel> Object executeRequestWithModelJsonParser(StripeNetworkClient stripeNetworkClient, StripeErrorJsonParser stripeErrorJsonParser, StripeRequest stripeRequest, ModelJsonParser<? extends Response> modelJsonParser, Continuation<? super Response> continuation) {
        RequestExecutorKt$executeRequestWithModelJsonParser$1 requestExecutorKt$executeRequestWithModelJsonParser$1;
        Object coroutine_suspended;
        int i;
        Throwable m116786exceptionOrNullimpl;
        String str;
        if (continuation instanceof RequestExecutorKt$executeRequestWithModelJsonParser$1) {
            requestExecutorKt$executeRequestWithModelJsonParser$1 = (RequestExecutorKt$executeRequestWithModelJsonParser$1) continuation;
            int i2 = requestExecutorKt$executeRequestWithModelJsonParser$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requestExecutorKt$executeRequestWithModelJsonParser$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requestExecutorKt$executeRequestWithModelJsonParser$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = requestExecutorKt$executeRequestWithModelJsonParser$1.label;
                if (i == 0) {
                    if (i == 1) {
                        modelJsonParser = (ModelJsonParser) requestExecutorKt$executeRequestWithModelJsonParser$1.L$2;
                        stripeRequest = (StripeRequest) requestExecutorKt$executeRequestWithModelJsonParser$1.L$1;
                        stripeErrorJsonParser = (StripeErrorJsonParser) requestExecutorKt$executeRequestWithModelJsonParser$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion = Result.Companion;
                    requestExecutorKt$executeRequestWithModelJsonParser$1.L$0 = stripeErrorJsonParser;
                    requestExecutorKt$executeRequestWithModelJsonParser$1.L$1 = stripeRequest;
                    requestExecutorKt$executeRequestWithModelJsonParser$1.L$2 = modelJsonParser;
                    requestExecutorKt$executeRequestWithModelJsonParser$1.label = 1;
                    obj = stripeNetworkClient.executeRequest(stripeRequest, requestExecutorKt$executeRequestWithModelJsonParser$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Object m116783constructorimpl = Result.m116783constructorimpl((StripeResponse) obj);
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    StripeResponse stripeResponse = (StripeResponse) m116783constructorimpl;
                    if (stripeResponse.isError()) {
                        StripeError parse = stripeErrorJsonParser.parse(ResponseJsonKt.responseJson(stripeResponse));
                        RequestId requestId = stripeResponse.getRequestId();
                        if (requestId != null) {
                            str = requestId.getValue();
                        } else {
                            str = null;
                        }
                        throw new APIException(parse, str, stripeResponse.getCode(), null, null, 24, null);
                    }
                    Response parse2 = modelJsonParser.parse(ResponseJsonKt.responseJson(stripeResponse));
                    if (parse2 != null) {
                        return parse2;
                    }
                    JSONObject responseJson = ResponseJsonKt.responseJson(stripeResponse);
                    throw new APIException(null, null, 0, modelJsonParser + " returns null for " + responseJson, null, 23, null);
                }
                throw new APIConnectionException("Failed to execute " + stripeRequest, m116786exceptionOrNullimpl);
            }
        }
        requestExecutorKt$executeRequestWithModelJsonParser$1 = new RequestExecutorKt$executeRequestWithModelJsonParser$1(continuation);
        Object obj2 = requestExecutorKt$executeRequestWithModelJsonParser$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = requestExecutorKt$executeRequestWithModelJsonParser$1.label;
        if (i == 0) {
        }
        Object m116783constructorimpl2 = Result.m116783constructorimpl((StripeResponse) obj2);
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl2);
        if (m116786exceptionOrNullimpl != null) {
        }
    }
}
