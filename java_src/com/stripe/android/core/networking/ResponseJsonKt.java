package com.stripe.android.core.networking;

import com.stripe.android.core.exception.APIException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¨\u0006\u0004"}, m28432d2 = {"responseJson", "Lorg/json/JSONObject;", "Lcom/stripe/android/core/networking/StripeResponse;", "", "stripe-core_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class ResponseJsonKt {
    public static final JSONObject responseJson(StripeResponse<String> stripeResponse) throws APIException {
        String str;
        String trimIndent;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(stripeResponse, "<this>");
        String body = stripeResponse.getBody();
        if (body != null) {
            try {
                return new JSONObject(body);
            } catch (JSONException e) {
                int code = stripeResponse.getCode();
                RequestId requestId = stripeResponse.getRequestId();
                List<String> headerValue = stripeResponse.getHeaderValue("Content-Type");
                if (headerValue != null) {
                    firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) headerValue);
                    str = (String) firstOrNull;
                } else {
                    str = null;
                }
                trimIndent = StringsKt__IndentKt.trimIndent("\n                    Exception while parsing response body.\n                      Status code: " + code + "\n                      Request-Id: " + requestId + "\n                      Content-Type: " + str + "\n                      Body: \"" + body + "\"\n                ");
                throw new APIException(null, null, 0, trimIndent, e, 7, null);
            }
        }
        return new JSONObject();
    }
}
