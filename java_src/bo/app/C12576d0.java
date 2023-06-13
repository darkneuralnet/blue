package bo.app;

import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: bo.app.d0 */
/* loaded from: classes.dex */
public final class C12576d0 extends AbstractC13284z5 {

    /* renamed from: e */
    private static final String f58306e = C43664k20.m29433n(C12576d0.class);

    /* renamed from: d */
    private String f58307d;

    public C12576d0(JSONObject jSONObject) {
        super(jSONObject);
        this.f58307d = jSONObject.getJSONObject(MessageExtension.FIELD_DATA).getString(AnalyticsRequestV2.PARAM_EVENT_NAME);
    }

    @Override // bo.app.AbstractC13284z5, bo.app.InterfaceC13112s2, bo.app.InterfaceC12546b2
    /* renamed from: a */
    public boolean mo62577a(InterfaceC13145t2 interfaceC13145t2) {
        if (interfaceC13145t2 instanceof C12558c0) {
            C12558c0 c12558c0 = (C12558c0) interfaceC13145t2;
            if (!C43318jS5.m30597g(c12558c0.m63883f()) && c12558c0.m63883f().equals(this.f58307d)) {
                return super.mo62577a(interfaceC13145t2);
            }
            return false;
        }
        return false;
    }

    @Override // bo.app.AbstractC13284z5, p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject forJsonPut = super.forJsonPut();
        try {
            forJsonPut.put("type", "custom_event_property");
            JSONObject jSONObject = forJsonPut.getJSONObject(MessageExtension.FIELD_DATA);
            jSONObject.put(AnalyticsRequestV2.PARAM_EVENT_NAME, this.f58307d);
            forJsonPut.put(MessageExtension.FIELD_DATA, jSONObject);
        } catch (JSONException e) {
            C43664k20.m29434m(f58306e, "Caught exception creating CustomEventWithPropertiesTriggerCondition Json.", e);
        }
        return forJsonPut;
    }
}
