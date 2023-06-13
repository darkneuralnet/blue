package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: Df0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C32360Df0 {

    /* renamed from: a */
    public final Set<String> f6159a = new HashSet();

    /* renamed from: b */
    public boolean f6160b = false;

    /* renamed from: a */
    public static C32360Df0 m110025a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C32360Df0 c32360Df0 = new C32360Df0();
        JSONArray optJSONArray = jSONObject.optJSONArray("supportedCardTypes");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                c32360Df0.f6159a.add(optJSONArray.optString(i, ""));
            }
        }
        c32360Df0.f6160b = jSONObject.optBoolean("collectDeviceData", false);
        return c32360Df0;
    }

    /* renamed from: b */
    public Set<String> m110024b() {
        return Collections.unmodifiableSet(this.f6159a);
    }
}
