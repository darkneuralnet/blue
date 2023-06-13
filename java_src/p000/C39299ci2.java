package p000;

import org.json.JSONObject;
/* renamed from: ci2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C39299ci2 {
    /* renamed from: a */
    public static String m61029a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.isNull(str)) {
            return str2;
        }
        return jSONObject.optString(str, str2);
    }
}
