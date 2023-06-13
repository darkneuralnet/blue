package bo.app;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: bo.app.e4 */
/* loaded from: classes.dex */
public final class C12611e4 implements InterfaceC13112s2 {

    /* renamed from: b */
    private String f58397b;

    public C12611e4(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(MessageExtension.FIELD_DATA);
        if (optJSONObject != null && !optJSONObject.isNull("campaign_id")) {
            this.f58397b = optJSONObject.optString("campaign_id", null);
        }
    }

    @Override // bo.app.InterfaceC13112s2, bo.app.InterfaceC12546b2
    /* renamed from: a */
    public boolean mo62577a(InterfaceC13145t2 interfaceC13145t2) {
        if (interfaceC13145t2 instanceof C12647f4) {
            if (C43318jS5.m30597g(this.f58397b)) {
                return true;
            }
            C12647f4 c12647f4 = (C12647f4) interfaceC13145t2;
            if (!C43318jS5.m30597g(c12647f4.m63735f()) && c12647f4.m63735f().equals(this.f58397b)) {
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
            jSONObject.put("type", "push_click");
            if (this.f58397b != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("campaign_id", this.f58397b);
                jSONObject.putOpt(MessageExtension.FIELD_DATA, jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
