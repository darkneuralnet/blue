package p000;

import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: th1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49385th1 {

    /* renamed from: a */
    public final String f110870a;

    public C49385th1(String str) {
        this.f110870a = str;
    }

    /* renamed from: a */
    public String m11921a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("playIntegrityToken", this.f110870a);
        return jSONObject.toString();
    }
}
