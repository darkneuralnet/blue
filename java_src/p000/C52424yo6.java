package p000;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: yo6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52424yo6 extends AbstractC48015rN3<C52424yo6> {

    /* renamed from: g */
    public final String f120218g = "venmoAccount";

    /* renamed from: h */
    public final String f120219h = "nonce";

    /* renamed from: i */
    public String f120220i;

    @Override // p000.AbstractC48015rN3
    /* renamed from: b */
    public void mo2563b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        jSONObject2.put("nonce", this.f120220i);
        jSONObject.put("venmoAccount", jSONObject2);
    }

    @Override // p000.AbstractC48015rN3
    /* renamed from: d */
    public void mo2562d(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
    }

    @Override // p000.AbstractC48015rN3
    /* renamed from: e */
    public String mo2561e() {
        return "venmo_accounts";
    }

    @Override // p000.AbstractC48015rN3
    /* renamed from: i */
    public String mo2560i() {
        return "VenmoAccount";
    }

    /* renamed from: l */
    public C52424yo6 m2559l(String str) {
        this.f120220i = str;
        return this;
    }
}
