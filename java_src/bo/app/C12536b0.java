package bo.app;

import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: bo.app.b0 */
/* loaded from: classes.dex */
public final class C12536b0 implements InterfaceC13112s2 {

    /* renamed from: b */
    private String f58249b;

    public C12536b0(JSONObject jSONObject) {
        this.f58249b = jSONObject.getJSONObject(MessageExtension.FIELD_DATA).getString(AnalyticsRequestV2.PARAM_EVENT_NAME);
    }

    @Override // bo.app.InterfaceC13112s2, bo.app.InterfaceC12546b2
    /* renamed from: a */
    public boolean mo62577a(InterfaceC13145t2 interfaceC13145t2) {
        if (interfaceC13145t2 instanceof C12558c0) {
            C12558c0 c12558c0 = (C12558c0) interfaceC13145t2;
            if (!C43318jS5.m30597g(c12558c0.m63883f()) && c12558c0.m63883f().equals(this.f58249b)) {
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
            jSONObject.put("type", "custom_event");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AnalyticsRequestV2.PARAM_EVENT_NAME, this.f58249b);
            jSONObject.put(MessageExtension.FIELD_DATA, jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
