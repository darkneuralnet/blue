package p000;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: WM6 */
/* loaded from: classes8.dex */
public class WM6 extends AbstractC37902aL6 {

    /* renamed from: a */
    public final String f40904a = EnumC39708dM6.CONF_REFRESH_TIME_KEY.toString();

    /* renamed from: b */
    public Context f40905b;

    /* renamed from: c */
    public Handler f40906c;

    /* renamed from: d */
    public VF2 f40907d;

    /* renamed from: e */
    public JSONObject f40908e;

    public WM6(@NonNull VF2 vf2, @NonNull Handler handler) {
        this.f40905b = vf2.m80162b();
        this.f40907d = vf2;
        this.f40906c = handler;
        m78531h(m78529j());
        try {
            KJ6.m99012a(getClass(), 0, m78530i().toString(2));
        } catch (JSONException unused) {
        }
    }

    /* renamed from: g */
    public JSONObject m78532g() {
        KJ6.m99012a(getClass(), 0, "entering getDefaultConfig");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("s", m78528k());
            jSONObject.put("hw", m78528k());
            jSONObject.put("ts", m78528k());
            jSONObject.put("td", m78528k());
            jSONObject.put(EnumC39708dM6.CONF_REFRESH_TIME_KEY.toString(), 7200);
        } catch (JSONException e) {
            KJ6.m99011b(getClass(), 3, e);
        }
        return jSONObject;
    }

    /* renamed from: h */
    public void m78531h(JSONObject jSONObject) {
        this.f40908e = jSONObject;
    }

    /* renamed from: i */
    public JSONObject m78530i() {
        return this.f40908e;
    }

    /* renamed from: j */
    public JSONObject m78529j() {
        try {
            JSONObject m71614a = AbstractC37902aL6.m71614a("RAMP_CONFIG", this.f40907d.m80162b());
            if (m71614a == null) {
                new LJ6(EnumC39097cM6.RAMP_CONFIG_URL, this.f40907d, this.f40906c, null).m97343b();
                return m78532g();
            }
            if (AbstractC37902aL6.m71611d(m71614a, Long.parseLong(m71609f(this.f40905b, "RAMP_CONFIG")), VL6.RAMP)) {
                KJ6.m99012a(getClass(), 0, "Cached config used while fetching.");
                new LJ6(EnumC39097cM6.RAMP_CONFIG_URL, this.f40907d, this.f40906c, null).m97343b();
            }
            return m71614a;
        } catch (Exception e) {
            KJ6.m99011b(getClass(), 3, e);
            return m78532g();
        }
    }

    /* renamed from: k */
    public final JSONObject m78528k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(EnumC39708dM6.OPEN.toString(), false);
            jSONObject.put(EnumC39708dM6.RAMP_THRESHOLD.toString(), 0);
            jSONObject.put(EnumC39708dM6.MIN_VERSION.toString(), "4.4.0");
            jSONObject.put(EnumC39708dM6.EXCLUDED.toString(), new JSONArray());
            jSONObject.put(EnumC39708dM6.APP_IDS.toString(), new JSONArray());
            jSONObject.put(EnumC39708dM6.APP_SOURCES.toString(), new JSONArray());
        } catch (Exception e) {
            Class<?> cls = getClass();
            KJ6.m99012a(cls, 3, "Failed to create deafult config due to " + e.getLocalizedMessage());
        }
        return jSONObject;
    }
}
