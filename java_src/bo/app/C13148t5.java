package bo.app;

import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: bo.app.t5 */
/* loaded from: classes.dex */
public final class C13148t5 implements InterfaceC13112s2 {
    @Override // bo.app.InterfaceC13112s2, bo.app.InterfaceC12546b2
    /* renamed from: a */
    public boolean mo62577a(InterfaceC13145t2 interfaceC13145t2) {
        return interfaceC13145t2 instanceof C13168u5;
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "test");
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
