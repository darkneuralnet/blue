package p000;

import com.braintreepayments.api.models.GooglePaymentCardNonce;
import com.braintreepayments.api.models.PayPalAccountNonce;
import com.braintreepayments.api.models.PaymentMethodNonce;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: ON3 */
/* loaded from: classes2.dex */
public class ON3 {
    /* renamed from: a */
    public static JSONObject m92363a(String str) throws JSONException {
        return new JSONObject(new JSONObject(str).getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString("token"));
    }

    /* renamed from: b */
    public static PaymentMethodNonce m92362b(String str) throws JSONException {
        Iterator<String> keys = m92363a(str).keys();
        while (keys.hasNext()) {
            String next = keys.next();
            next.hashCode();
            if (!next.equals("paypalAccounts")) {
                if (next.equals("androidPayCards")) {
                    return GooglePaymentCardNonce.m53376h(str);
                }
            } else {
                return PayPalAccountNonce.m53367g(str);
            }
        }
        throw new JSONException("Could not parse JSON for a payment method nonce");
    }
}
