package p000;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: zD1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52665zD1 {

    /* renamed from: a */
    public boolean f120978a;

    /* renamed from: b */
    public String f120979b;

    /* renamed from: c */
    public String f120980c;

    /* renamed from: d */
    public String f120981d;

    /* renamed from: e */
    public String[] f120982e;

    /* renamed from: f */
    public String f120983f;

    /* renamed from: a */
    public static C52665zD1 m1630a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C52665zD1 c52665zD1 = new C52665zD1();
        c52665zD1.f120978a = jSONObject.optBoolean("enabled", false);
        c52665zD1.f120979b = C39299ci2.m61029a(jSONObject, "googleAuthorizationFingerprint", null);
        c52665zD1.f120980c = C39299ci2.m61029a(jSONObject, "environment", null);
        c52665zD1.f120981d = C39299ci2.m61029a(jSONObject, "displayName", "");
        c52665zD1.f120983f = C39299ci2.m61029a(jSONObject, "paypalClientId", "");
        JSONArray optJSONArray = jSONObject.optJSONArray("supportedNetworks");
        if (optJSONArray != null) {
            c52665zD1.f120982e = new String[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    c52665zD1.f120982e[i] = optJSONArray.getString(i);
                } catch (JSONException unused) {
                }
            }
        } else {
            c52665zD1.f120982e = new String[0];
        }
        return c52665zD1;
    }
}
