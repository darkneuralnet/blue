package p000;

import org.json.JSONObject;
/* renamed from: lL3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C44439lL3 {

    /* renamed from: a */
    public String f95888a;

    /* renamed from: b */
    public String f95889b;

    /* renamed from: c */
    public String f95890c;

    /* renamed from: d */
    public String f95891d;

    /* renamed from: e */
    public String f95892e;

    /* renamed from: f */
    public String f95893f;

    /* renamed from: g */
    public boolean f95894g;

    /* renamed from: h */
    public String f95895h;

    /* renamed from: a */
    public static C44439lL3 m27421a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C44439lL3 c44439lL3 = new C44439lL3();
        c44439lL3.f95888a = C39299ci2.m61029a(jSONObject, "displayName", null);
        c44439lL3.f95889b = C39299ci2.m61029a(jSONObject, "clientId", null);
        c44439lL3.f95890c = C39299ci2.m61029a(jSONObject, "privacyUrl", null);
        c44439lL3.f95891d = C39299ci2.m61029a(jSONObject, "userAgreementUrl", null);
        c44439lL3.f95892e = C39299ci2.m61029a(jSONObject, "directBaseUrl", null);
        c44439lL3.f95893f = C39299ci2.m61029a(jSONObject, "environment", null);
        c44439lL3.f95894g = jSONObject.optBoolean("touchDisabled", true);
        c44439lL3.f95895h = C39299ci2.m61029a(jSONObject, "currencyIsoCode", null);
        return c44439lL3;
    }

    /* renamed from: b */
    public String m27420b() {
        return this.f95889b;
    }

    /* renamed from: c */
    public String m27419c() {
        return this.f95895h;
    }

    /* renamed from: d */
    public String m27418d() {
        return this.f95888a;
    }

    /* renamed from: e */
    public String m27417e() {
        return this.f95893f;
    }
}
