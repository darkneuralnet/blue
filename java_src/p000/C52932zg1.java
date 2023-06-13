package p000;

import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: zg1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C52932zg1 {

    /* renamed from: a */
    public final String f122027a;

    /* renamed from: b */
    public final EnumC31469b f122028b;

    /* renamed from: c */
    public final EnumC31468a f122029c;

    /* renamed from: d */
    public final String f122030d;

    /* renamed from: e */
    public final List<C41456gJ3> f122031e;

    /* renamed from: f */
    public final List<FE3> f122032f;

    /* renamed from: g */
    public final String f122033g;

    /* renamed from: h */
    public final String f122034h;

    /* renamed from: i */
    public final String f122035i;

    /* renamed from: zg1$a */
    /* loaded from: classes5.dex */
    public enum EnumC31468a {
        CLICK,
        SELECTED,
        TEXT_CHANGED
    }

    /* renamed from: zg1$b */
    /* loaded from: classes5.dex */
    public enum EnumC31469b {
        MANUAL,
        INFERENCE
    }

    public C52932zg1(String str, EnumC31469b enumC31469b, EnumC31468a enumC31468a, String str2, List<C41456gJ3> list, List<FE3> list2, String str3, String str4, String str5) {
        this.f122027a = str;
        this.f122028b = enumC31469b;
        this.f122029c = enumC31468a;
        this.f122030d = str2;
        this.f122031e = list;
        this.f122032f = list2;
        this.f122033g = str3;
        this.f122034h = str4;
        this.f122035i = str5;
    }

    /* renamed from: c */
    public static C52932zg1 m601c(JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        String string = jSONObject.getString(AnalyticsRequestV2.PARAM_EVENT_NAME);
        String string2 = jSONObject.getString("method");
        Locale locale = Locale.ENGLISH;
        EnumC31469b valueOf = EnumC31469b.valueOf(string2.toUpperCase(locale));
        EnumC31468a valueOf2 = EnumC31468a.valueOf(jSONObject.getString("event_type").toUpperCase(locale));
        String string3 = jSONObject.getString(AnalyticsFields.APP_VERSION);
        JSONArray jSONArray = jSONObject.getJSONArray("path");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new C41456gJ3(jSONArray.getJSONObject(i)));
        }
        String optString = jSONObject.optString("path_type", "absolute");
        JSONArray optJSONArray = jSONObject.optJSONArray("parameters");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList2.add(new FE3(optJSONArray.getJSONObject(i2)));
            }
        }
        return new C52932zg1(string, valueOf, valueOf2, string3, arrayList, arrayList2, jSONObject.optString("component_id"), optString, jSONObject.optString("activity_name"));
    }

    /* renamed from: f */
    public static List<C52932zg1> m598f(JSONArray jSONArray) {
        int length;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                length = jSONArray.length();
            } catch (IllegalArgumentException | JSONException unused) {
            }
        } else {
            length = 0;
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(m601c(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public String m603a() {
        return this.f122035i;
    }

    /* renamed from: b */
    public String m602b() {
        return this.f122027a;
    }

    /* renamed from: d */
    public List<FE3> m600d() {
        return Collections.unmodifiableList(this.f122032f);
    }

    /* renamed from: e */
    public List<C41456gJ3> m599e() {
        return Collections.unmodifiableList(this.f122031e);
    }
}
