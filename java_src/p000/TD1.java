package p000;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: TD1 */
/* loaded from: classes2.dex */
public class TD1 {

    /* renamed from: a */
    public String f34921a;

    /* renamed from: b */
    public Set<String> f34922b;

    /* renamed from: a */
    public static TD1 m84201a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        TD1 td1 = new TD1();
        td1.f34921a = C39299ci2.m61029a(jSONObject, "url", "");
        td1.f34922b = m84197e(jSONObject.optJSONArray("features"));
        return td1;
    }

    /* renamed from: e */
    public static Set<String> m84197e(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                hashSet.add(jSONArray.optString(i, ""));
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public String m84200b() {
        return this.f34921a;
    }

    /* renamed from: c */
    public boolean m84199c() {
        return !TextUtils.isEmpty(this.f34921a);
    }

    /* renamed from: d */
    public boolean m84198d(String str) {
        return m84199c() && this.f34922b.contains(str);
    }
}
