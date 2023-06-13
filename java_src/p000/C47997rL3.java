package p000;

import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: rL3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C47997rL3 {

    /* renamed from: a */
    public String f106879a;

    /* renamed from: a */
    public static C47997rL3 m16048a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        C47997rL3 c47997rL3 = new C47997rL3();
        JSONObject optJSONObject = jSONObject.optJSONObject("paymentResource");
        if (optJSONObject != null) {
            c47997rL3.m16046c(C39299ci2.m61029a(optJSONObject, "redirectUrl", ""));
        } else {
            c47997rL3.m16046c(C39299ci2.m61029a(jSONObject.optJSONObject("agreementSetup"), "approvalUrl", ""));
        }
        return c47997rL3;
    }

    /* renamed from: b */
    public String m16047b() {
        return this.f106879a;
    }

    /* renamed from: c */
    public C47997rL3 m16046c(String str) {
        this.f106879a = str;
        return this;
    }
}
