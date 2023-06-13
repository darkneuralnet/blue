package p000;

import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: sh1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48792sh1 {

    /* renamed from: a */
    public final String f109120a;

    public C48792sh1(String str) {
        this.f109120a = str;
    }

    /* renamed from: a */
    public String m13823a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("debugToken", this.f109120a);
        return jSONObject.toString();
    }
}
