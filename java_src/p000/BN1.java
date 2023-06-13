package p000;

import com.stripe.android.model.PaymentMethodOptionsParams;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: BN1 */
/* loaded from: classes6.dex */
public class BN1 {

    /* renamed from: a */
    public int f2238a;

    /* renamed from: b */
    public String f2239b;

    public BN1(int i, String str) {
        this.f2238a = i;
        this.f2239b = str;
    }

    /* renamed from: a */
    public static BN1 m114063a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(new JSONObject(str).optString("error"));
        return new BN1(jSONObject.optInt(PaymentMethodOptionsParams.Blik.PARAM_CODE), jSONObject.optString("message"));
    }

    /* renamed from: b */
    public int m114062b() {
        return this.f2238a;
    }

    /* renamed from: c */
    public String m114061c() {
        return this.f2239b;
    }
}
