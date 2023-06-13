package p000;

import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: lN6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44460lN6 extends AbstractC37902aL6 {

    /* renamed from: g */
    public static BitSet f95959g = null;

    /* renamed from: h */
    public static boolean f95960h = false;

    /* renamed from: i */
    public static JSONArray f95961i;

    /* renamed from: a */
    public final String f95962a = "conf_refresh_time_interval";

    /* renamed from: b */
    public Context f95963b;

    /* renamed from: c */
    public VF2 f95964c;

    /* renamed from: d */
    public JSONObject f95965d;

    /* renamed from: e */
    public Handler f95966e;

    /* renamed from: f */
    public boolean f95967f;

    public C44460lN6(@NonNull VF2 vf2, @NonNull Handler handler) {
        this.f95967f = false;
        this.f95964c = vf2;
        this.f95963b = vf2.m80162b();
        this.f95966e = handler;
        this.f95967f = vf2.m80156h();
        m27380h(m27375m());
        try {
            KJ6.m99012a(getClass(), 0, this.f95965d.toString(2));
        } catch (JSONException e) {
            KJ6.m99011b(getClass(), 3, e);
        }
    }

    /* renamed from: i */
    public static void m27379i(boolean z) {
        f95960h = z;
    }

    /* renamed from: l */
    public static void m27376l(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(EnumC40300eM6.NOT_COLLECTABLE.toString());
        if (optJSONArray != null) {
            f95961i = optJSONArray;
        }
        BitSet bitSet = new BitSet(128);
        f95959g = bitSet;
        bitSet.set(0, 128, true);
        for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
            try {
                f95959g.set(optJSONArray.getInt(i), false);
            } catch (JSONException e) {
                KJ6.m99011b(C44460lN6.class, 3, e);
            }
        }
    }

    /* renamed from: g */
    public JSONObject m27381g() {
        KJ6.m99012a(getClass(), 0, "entering getDefaultRemoteConfig");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(EnumC40300eM6.CONF_VERSION.toString(), "5.0");
            jSONObject.put(EnumC40300eM6.CONF_REFRESH_TIME_KEY.toString(), DateTimeConstants.SECONDS_PER_DAY);
            jSONObject.put(EnumC40300eM6.CONF_ENDPOINT_URL.toString(), EnumC39097cM6.DEVICE_INFO_URL.toString());
        } catch (JSONException e) {
            KJ6.m99011b(getClass(), 3, e);
        }
        return jSONObject;
    }

    /* renamed from: h */
    public void m27380h(JSONObject jSONObject) {
        m27376l(jSONObject);
        this.f95965d = jSONObject;
    }

    /* renamed from: j */
    public boolean m27378j(int i) {
        return f95959g.get(i);
    }

    /* renamed from: k */
    public final boolean m27377k(String str, String str2) {
        KJ6.m99012a(getClass(), 0, "entering shouldUseCachedConfiguration");
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        Class<?> cls = getClass();
        KJ6.m99012a(cls, 0, "Comparing Cached version is " + str + " default version is " + str2);
        int i = 0;
        while (i < split.length && i < split2.length && split[i].equals(split2[i])) {
            i++;
        }
        return Integer.valueOf(Integer.signum((i >= split.length || i >= split2.length) ? split.length - split2.length : Integer.valueOf(split[i]).compareTo(Integer.valueOf(split2[i])))).intValue() >= 0;
    }

    /* renamed from: m */
    public JSONObject m27375m() {
        try {
            JSONObject m71614a = AbstractC37902aL6.m71614a("REMOTE_CONFIG", this.f95963b);
            if (m71614a == null) {
                new LJ6(EnumC39097cM6.REMOTE_CONFIG_URL, this.f95964c, this.f95966e, null).m97343b();
            } else if (m27377k(m71614a.optString(XL6.CONF_VERSION.toString(), ""), "5.0")) {
                boolean m71611d = AbstractC37902aL6.m71611d(m71614a, Long.parseLong(m71609f(this.f95963b, "REMOTE_CONFIG")), VL6.REMOTE);
                if (!this.f95967f && m71611d) {
                    new LJ6(EnumC39097cM6.REMOTE_CONFIG_URL, this.f95964c, this.f95966e, null).m97343b();
                }
                Class<?> cls = getClass();
                KJ6.m99012a(cls, 0, "Using cached currentConfig due to isRemoteConfigDisabled : " + this.f95967f + " or isConfigExpired : " + m71611d);
                return m71614a;
            } else {
                AbstractC37902aL6.m71612c(this.f95963b, "REMOTE_CONFIG");
            }
        } catch (Exception e) {
            KJ6.m99011b(getClass(), 3, e);
        }
        return m27381g();
    }

    /* renamed from: n */
    public String m27374n() {
        return this.f95965d.optString(EnumC40300eM6.CONF_VERSION.toString());
    }

    /* renamed from: o */
    public List<String> m27373o() throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = this.f95965d.optJSONArray(EnumC40300eM6.ANDROID_APPS_TO_CHECK.toString());
        for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
            arrayList.add(optJSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: p */
    public String m27372p() {
        return this.f95965d.optString(EnumC40300eM6.MG_ID.toString(), "QW5kcm9pZE1hZ25lcw==");
    }

    /* renamed from: q */
    public int m27371q() {
        return this.f95965d.optInt(EnumC40300eM6.SENSOR_COLLECT_TIME.toString(), 5);
    }

    /* renamed from: r */
    public String m27370r() {
        return this.f95965d.optString(EnumC40300eM6.CONF_ENDPOINT_URL.toString(), EnumC39097cM6.DEVICE_INFO_URL.toString());
    }

    /* renamed from: s */
    public boolean m27369s() {
        return f95960h;
    }

    /* renamed from: t */
    public JSONArray m27368t() {
        return f95961i;
    }
}
