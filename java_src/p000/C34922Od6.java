package p000;

import org.json.JSONObject;
/* renamed from: Od6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C34922Od6 {

    /* renamed from: a */
    public boolean f26956a;

    /* renamed from: a */
    public static C34922Od6 m91782a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C34922Od6 c34922Od6 = new C34922Od6();
        c34922Od6.f26956a = jSONObject.optBoolean("enabled", false);
        return c34922Od6;
    }
}
