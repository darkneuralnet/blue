package p000;

import org.json.JSONObject;
/* renamed from: zo6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C53017zo6 {

    /* renamed from: a */
    public String f122266a;

    /* renamed from: b */
    public String f122267b;

    /* renamed from: c */
    public String f122268c;

    /* renamed from: a */
    public static C53017zo6 m406a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        C53017zo6 c53017zo6 = new C53017zo6();
        c53017zo6.f122266a = C39299ci2.m61029a(jSONObject, "accessToken", "");
        c53017zo6.f122267b = C39299ci2.m61029a(jSONObject, "environment", "");
        c53017zo6.f122268c = C39299ci2.m61029a(jSONObject, "merchantId", "");
        return c53017zo6;
    }
}
