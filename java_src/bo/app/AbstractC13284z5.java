package bo.app;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: bo.app.z5 */
/* loaded from: classes.dex */
public abstract class AbstractC13284z5 implements InterfaceC13112s2 {

    /* renamed from: c */
    private static final String f59553c = C43664k20.m29433n(AbstractC13284z5.class);

    /* renamed from: b */
    C12557c f59554b;

    public AbstractC13284z5(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject(MessageExtension.FIELD_DATA).getJSONArray("property_filters");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(new C13233y3(jSONArray2.getJSONObject(i2)));
            }
            arrayList.add(new C13146t3(arrayList2));
        }
        this.f59554b = new C12557c(arrayList);
    }

    @Override // bo.app.InterfaceC13112s2, bo.app.InterfaceC12546b2
    /* renamed from: a */
    public boolean mo62577a(InterfaceC13145t2 interfaceC13145t2) {
        return this.f59554b.mo62577a(interfaceC13145t2);
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("property_filters", this.f59554b.forJsonPut());
            jSONObject.put(MessageExtension.FIELD_DATA, jSONObject2);
        } catch (JSONException e) {
            C43664k20.m29434m(f59553c, "Caught exception creating Json.", e);
        }
        return jSONObject;
    }
}
