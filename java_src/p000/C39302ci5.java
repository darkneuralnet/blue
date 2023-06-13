package p000;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: ci5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C39302ci5 {

    /* renamed from: a */
    public Set<String> f61090a = new HashSet();

    /* renamed from: b */
    public String f61091b;

    /* renamed from: c */
    public String f61092c;

    /* renamed from: d */
    public String f61093d;

    /* renamed from: e */
    public String f61094e;

    /* renamed from: a */
    public static C39302ci5 m61027a(JSONObject jSONObject) {
        C39302ci5 c39302ci5 = new C39302ci5();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        c39302ci5.f61091b = C39299ci2.m61029a(jSONObject, "displayName", "");
        c39302ci5.f61092c = C39299ci2.m61029a(jSONObject, "serviceId", "");
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("supportedCardBrands");
            for (int i = 0; i < jSONArray.length(); i++) {
                c39302ci5.f61090a.add(jSONArray.getString(i));
            }
        } catch (JSONException unused) {
        }
        c39302ci5.f61093d = C39299ci2.m61029a(jSONObject, "samsungAuthorization", "");
        c39302ci5.f61094e = C39299ci2.m61029a(jSONObject, "environment", "");
        return c39302ci5;
    }
}
