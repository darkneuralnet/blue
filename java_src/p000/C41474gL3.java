package p000;

import android.content.Context;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: gL3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C41474gL3 extends AbstractC48015rN3<C41474gL3> {

    /* renamed from: g */
    public String f82004g;

    /* renamed from: h */
    public JSONObject f82005h = new JSONObject();

    /* renamed from: i */
    public String f82006i;

    /* renamed from: j */
    public String f82007j;

    @Override // p000.AbstractC48015rN3
    /* renamed from: b */
    public void mo2563b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        jSONObject2.put("correlationId", this.f82004g);
        jSONObject2.put("intent", this.f82006i);
        Iterator<String> keys = this.f82005h.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject2.put(next, this.f82005h.get(next));
        }
        String str = this.f82007j;
        if (str != null) {
            jSONObject.put("merchant_account_id", str);
        }
        jSONObject.put("paypalAccount", jSONObject2);
    }

    @Override // p000.AbstractC48015rN3
    /* renamed from: d */
    public void mo2562d(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
    }

    @Override // p000.AbstractC48015rN3
    /* renamed from: e */
    public String mo2561e() {
        return "paypal_accounts";
    }

    @Override // p000.AbstractC48015rN3
    /* renamed from: i */
    public String mo2560i() {
        return "PayPalAccount";
    }

    /* renamed from: l */
    public C41474gL3 m39606l(String str) {
        this.f82004g = str;
        return this;
    }

    /* renamed from: m */
    public C41474gL3 m39605m(String str) {
        this.f82006i = str;
        return this;
    }

    /* renamed from: n */
    public C41474gL3 m39604n(String str) {
        this.f82007j = str;
        return this;
    }

    /* renamed from: o */
    public C41474gL3 m39603o(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f82005h = jSONObject;
        }
        return this;
    }
}
