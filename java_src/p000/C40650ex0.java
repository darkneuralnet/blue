package p000;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: ex0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C40650ex0 {

    /* renamed from: a */
    public String f79168a;

    /* renamed from: b */
    public String f79169b;

    /* renamed from: c */
    public String f79170c;

    /* renamed from: d */
    public final Set<String> f79171d = new HashSet();

    /* renamed from: e */
    public String f79172e;

    /* renamed from: f */
    public String f79173f;

    /* renamed from: g */
    public String f79174g;

    /* renamed from: h */
    public C10 f79175h;

    /* renamed from: i */
    public C10734aa f79176i;

    /* renamed from: j */
    public C32360Df0 f79177j;

    /* renamed from: k */
    public boolean f79178k;

    /* renamed from: l */
    public C44439lL3 f79179l;

    /* renamed from: m */
    public C52665zD1 f79180m;

    /* renamed from: n */
    public boolean f79181n;

    /* renamed from: o */
    public C53017zo6 f79182o;

    /* renamed from: p */
    public C32182Cl2 f79183p;

    /* renamed from: q */
    public C34922Od6 f79184q;

    /* renamed from: r */
    public C31799Au6 f79185r;

    /* renamed from: s */
    public TD1 f79186s;

    /* renamed from: t */
    public C39302ci5 f79187t;

    /* renamed from: u */
    public String f79188u;

    public C40650ex0(String str) throws JSONException {
        if (str != null) {
            this.f79169b = str;
            JSONObject jSONObject = new JSONObject(str);
            this.f79168a = C39299ci2.m61029a(jSONObject, "assetsUrl", "");
            this.f79170c = jSONObject.getString("clientApiUrl");
            m42365g(jSONObject.optJSONArray("challenges"));
            this.f79172e = jSONObject.getString("environment");
            this.f79173f = jSONObject.getString("merchantId");
            this.f79174g = C39299ci2.m61029a(jSONObject, "merchantAccountId", null);
            this.f79176i = C10734aa.m71213a(jSONObject.optJSONObject("analytics"));
            this.f79175h = C10.m113050a(jSONObject.optJSONObject("braintreeApi"));
            this.f79177j = C32360Df0.m110025a(jSONObject.optJSONObject("creditCards"));
            this.f79178k = jSONObject.optBoolean("paypalEnabled", false);
            this.f79179l = C44439lL3.m27421a(jSONObject.optJSONObject("paypal"));
            this.f79180m = C52665zD1.m1630a(jSONObject.optJSONObject("androidPay"));
            this.f79181n = jSONObject.optBoolean("threeDSecureEnabled", false);
            this.f79182o = C53017zo6.m406a(jSONObject.optJSONObject("payWithVenmo"));
            this.f79183p = C32182Cl2.m111744a(jSONObject.optJSONObject("kount"));
            this.f79184q = C34922Od6.m91782a(jSONObject.optJSONObject("unionPay"));
            this.f79185r = C31799Au6.m114961a(jSONObject.optJSONObject("visaCheckout"));
            this.f79186s = TD1.m84201a(jSONObject.optJSONObject("graphQL"));
            this.f79187t = C39302ci5.m61027a(jSONObject.optJSONObject("samsungPay"));
            this.f79188u = C39299ci2.m61029a(jSONObject, "cardinalAuthenticationJWT", null);
            return;
        }
        throw new JSONException("Configuration cannot be null");
    }

    /* renamed from: a */
    public static C40650ex0 m42371a(String str) throws JSONException {
        return new C40650ex0(str);
    }

    /* renamed from: b */
    public C10734aa m42370b() {
        return this.f79176i;
    }

    /* renamed from: c */
    public String m42369c() {
        return this.f79170c;
    }

    /* renamed from: d */
    public TD1 m42368d() {
        return this.f79186s;
    }

    /* renamed from: e */
    public C44439lL3 m42367e() {
        return this.f79179l;
    }

    /* renamed from: f */
    public boolean m42366f() {
        return this.f79178k;
    }

    /* renamed from: g */
    public final void m42365g(JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f79171d.add(jSONArray.optString(i, ""));
            }
        }
    }

    /* renamed from: h */
    public String m42364h() {
        return this.f79169b;
    }
}
