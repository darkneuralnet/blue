package bo.app;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: bo.app.a4 */
/* loaded from: classes.dex */
public final class C12520a4 implements InterfaceC13112s2 {

    /* renamed from: b */
    String f58228b;

    public C12520a4(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(MessageExtension.FIELD_DATA);
        if (optJSONObject != null && !optJSONObject.isNull("product_id")) {
            this.f58228b = optJSONObject.optString("product_id", null);
        }
    }

    @Override // bo.app.InterfaceC13112s2, bo.app.InterfaceC12546b2
    /* renamed from: a */
    public boolean mo62577a(InterfaceC13145t2 interfaceC13145t2) {
        if (interfaceC13145t2 instanceof C12553b4) {
            if (C43318jS5.m30597g(this.f58228b)) {
                return true;
            }
            C12553b4 c12553b4 = (C12553b4) interfaceC13145t2;
            if (!C43318jS5.m30597g(c12553b4.m63885f()) && c12553b4.m63885f().equals(this.f58228b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "purchase");
            if (this.f58228b != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("product_id", this.f58228b);
                jSONObject.putOpt(MessageExtension.FIELD_DATA, jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
