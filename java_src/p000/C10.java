package p000;

import org.json.JSONObject;
/* renamed from: C10 */
/* loaded from: classes2.dex */
public class C10 {

    /* renamed from: a */
    public String f3252a;

    /* renamed from: b */
    public String f3253b;

    /* renamed from: a */
    public static C10 m113050a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C10 c10 = new C10();
        c10.f3252a = C39299ci2.m61029a(jSONObject, "accessToken", "");
        c10.f3253b = C39299ci2.m61029a(jSONObject, "url", "");
        return c10;
    }
}
