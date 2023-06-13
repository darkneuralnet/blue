package p000;

import com.stripe.android.model.Stripe3ds2AuthParams;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: HT2 */
/* loaded from: classes2.dex */
public class HT2 {

    /* renamed from: a */
    public JSONObject f13428a;

    public HT2() {
        JSONObject jSONObject = new JSONObject();
        this.f13428a = jSONObject;
        try {
            jSONObject.put("platform", "android");
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public JSONObject m103830a() {
        return this.f13428a;
    }

    /* renamed from: b */
    public HT2 m103829b(String str) {
        try {
            this.f13428a.put("integration", str);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: c */
    public HT2 m103828c(String str) {
        try {
            this.f13428a.put("sessionId", str);
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: d */
    public HT2 m103827d(String str) {
        try {
            this.f13428a.put(Stripe3ds2AuthParams.FIELD_SOURCE, str);
        } catch (JSONException unused) {
        }
        return this;
    }

    public String toString() {
        return this.f13428a.toString();
    }
}
