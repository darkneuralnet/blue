package com.stripe.android.financialconnections.analytics;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.exception.FinancialConnectionsError;
import com.stripe.android.financialconnections.exception.WebAuthFlowFailedException;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\u001a\u001a\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003*\u00020\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"MAX_LOG_LENGTH", "", "toEventParams", "", "", "", "financial-connections_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class AnalyticsMappersKt {
    private static final int MAX_LOG_LENGTH = 100;

    public static final Map<String, String> toEventParams(Throwable th) {
        String str;
        Map<String, String> mapOf;
        String simpleName;
        String simpleName2;
        String message;
        String valueOf;
        Map<String, String> mapOf2;
        String message2;
        String valueOf2;
        Map<String, String> mapOf3;
        Map<String, String> mapOf4;
        Intrinsics.checkNotNullParameter(th, "<this>");
        String str2 = null;
        if (th instanceof WebAuthFlowFailedException) {
            WebAuthFlowFailedException webAuthFlowFailedException = (WebAuthFlowFailedException) th;
            mapOf4 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("error", webAuthFlowFailedException.getReason()), TuplesKt.m28425to("error_type", webAuthFlowFailedException.getReason()), TuplesKt.m28425to("error_message", th.getMessage()), TuplesKt.m28425to(PaymentMethodOptionsParams.Blik.PARAM_CODE, null));
            return mapOf4;
        } else if (th instanceof FinancialConnectionsError) {
            Pair[] pairArr = new Pair[4];
            FinancialConnectionsError financialConnectionsError = (FinancialConnectionsError) th;
            pairArr[0] = TuplesKt.m28425to("error", financialConnectionsError.getName());
            pairArr[1] = TuplesKt.m28425to("error_type", financialConnectionsError.getName());
            StripeError stripeError = financialConnectionsError.getStripeError();
            if (stripeError == null || (message2 = stripeError.getMessage()) == null) {
                message2 = th.getMessage();
            }
            pairArr[2] = TuplesKt.m28425to("error_message", message2);
            StripeError stripeError2 = financialConnectionsError.getStripeError();
            if (stripeError2 == null || (valueOf2 = stripeError2.getCode()) == null) {
                valueOf2 = String.valueOf(financialConnectionsError.getStatusCode());
            }
            pairArr[3] = TuplesKt.m28425to(PaymentMethodOptionsParams.Blik.PARAM_CODE, valueOf2);
            mapOf3 = MapsKt__MapsKt.mapOf(pairArr);
            return mapOf3;
        } else if (th instanceof StripeException) {
            Pair[] pairArr2 = new Pair[4];
            StripeException stripeException = (StripeException) th;
            StripeError stripeError3 = stripeException.getStripeError();
            if (stripeError3 == null || (simpleName = stripeError3.getType()) == null) {
                simpleName = th.getClass().getSimpleName();
            }
            pairArr2[0] = TuplesKt.m28425to("error", simpleName);
            StripeError stripeError4 = stripeException.getStripeError();
            if (stripeError4 == null || (simpleName2 = stripeError4.getType()) == null) {
                simpleName2 = th.getClass().getSimpleName();
            }
            pairArr2[1] = TuplesKt.m28425to("error_type", simpleName2);
            StripeError stripeError5 = stripeException.getStripeError();
            if (stripeError5 == null || (message = stripeError5.getMessage()) == null) {
                message = th.getMessage();
            }
            if (message != null) {
                str2 = StringsKt___StringsKt.take(message, 100);
            }
            pairArr2[2] = TuplesKt.m28425to("error_message", str2);
            StripeError stripeError6 = stripeException.getStripeError();
            if (stripeError6 == null || (valueOf = stripeError6.getCode()) == null) {
                valueOf = String.valueOf(stripeException.getStatusCode());
            }
            pairArr2[3] = TuplesKt.m28425to(PaymentMethodOptionsParams.Blik.PARAM_CODE, valueOf);
            mapOf2 = MapsKt__MapsKt.mapOf(pairArr2);
            return mapOf2;
        } else {
            Pair[] pairArr3 = new Pair[4];
            pairArr3[0] = TuplesKt.m28425to("error", th.getClass().getSimpleName());
            pairArr3[1] = TuplesKt.m28425to("error_type", th.getClass().getSimpleName());
            String message3 = th.getMessage();
            if (message3 != null) {
                str = StringsKt___StringsKt.take(message3, 100);
            } else {
                str = null;
            }
            pairArr3[2] = TuplesKt.m28425to("error_message", str);
            pairArr3[3] = TuplesKt.m28425to(PaymentMethodOptionsParams.Blik.PARAM_CODE, null);
            mapOf = MapsKt__MapsKt.mapOf(pairArr3);
            return mapOf;
        }
    }
}
