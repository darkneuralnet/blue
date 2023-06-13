package bo.app;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: bo.app.c4 */
/* loaded from: classes.dex */
public final class C12567c4 extends AbstractC13284z5 {

    /* renamed from: e */
    private static final String f58289e = C43664k20.m29433n(C12567c4.class);

    /* renamed from: d */
    private String f58290d;

    public C12567c4(JSONObject jSONObject) {
        super(jSONObject);
        this.f58290d = jSONObject.getJSONObject(MessageExtension.FIELD_DATA).getString("product_id");
    }

    @Override // bo.app.AbstractC13284z5, bo.app.InterfaceC13112s2, bo.app.InterfaceC12546b2
    /* renamed from: a */
    public boolean mo62577a(InterfaceC13145t2 interfaceC13145t2) {
        if (!(interfaceC13145t2 instanceof C12553b4) || C43318jS5.m30597g(this.f58290d)) {
            return false;
        }
        C12553b4 c12553b4 = (C12553b4) interfaceC13145t2;
        if (!C43318jS5.m30597g(c12553b4.m63885f()) && c12553b4.m63885f().equals(this.f58290d)) {
            return super.mo62577a(interfaceC13145t2);
        }
        return false;
    }

    @Override // bo.app.AbstractC13284z5, p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject forJsonPut = super.forJsonPut();
        try {
            forJsonPut.put("type", "purchase_property");
            JSONObject jSONObject = forJsonPut.getJSONObject(MessageExtension.FIELD_DATA);
            jSONObject.put("product_id", this.f58290d);
            forJsonPut.put(MessageExtension.FIELD_DATA, jSONObject);
        } catch (JSONException e) {
            C43664k20.m29434m(f58289e, "Caught exception creating Json.", e);
        }
        return forJsonPut;
    }
}
