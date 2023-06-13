package p000;

import android.text.TextUtils;
import org.json.JSONObject;
/* renamed from: aa */
/* loaded from: classes2.dex */
public class C10734aa {

    /* renamed from: a */
    public String f50647a;

    /* renamed from: a */
    public static C10734aa m71213a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C10734aa c10734aa = new C10734aa();
        c10734aa.f50647a = C39299ci2.m61029a(jSONObject, "url", null);
        return c10734aa;
    }

    /* renamed from: b */
    public String m71212b() {
        return this.f50647a;
    }

    /* renamed from: c */
    public boolean m71211c() {
        return !TextUtils.isEmpty(this.f50647a);
    }
}
