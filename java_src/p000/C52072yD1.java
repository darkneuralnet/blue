package p000;

import android.content.Intent;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.exceptions.GooglePaymentException;
import com.google.android.gms.wallet.PaymentData;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: yD1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52072yD1 {
    /* renamed from: a */
    public static void m3841a(G10 g10, int i, Intent intent) {
        if (i == -1) {
            g10.m105974Ea("google-payment.authorized");
            m3840b(g10, PaymentData.m50525s(intent));
        } else if (i == 1) {
            g10.m105974Ea("google-payment.failed");
            g10.m105954ya(new GooglePaymentException("An error was encountered during the Google Payments flow. See the status object in this exception for more details.", C12186at.m65337a(intent)));
        } else if (i == 0) {
            g10.m105974Ea("google-payment.canceled");
        }
    }

    /* renamed from: b */
    public static void m3840b(G10 g10, PaymentData paymentData) {
        try {
            g10.m105955va(ON3.m92362b(paymentData.m50524u()));
            g10.m105974Ea("google-payment.nonce-received");
        } catch (NullPointerException | JSONException unused) {
            g10.m105974Ea("google-payment.failed");
            try {
                g10.m105954ya(ErrorWithResponse.m53412b(new JSONObject(paymentData.m50524u()).getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString("token")));
            } catch (NullPointerException | JSONException e) {
                g10.m105954ya(e);
            }
        }
    }
}
