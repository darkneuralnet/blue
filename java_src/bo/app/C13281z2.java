package bo.app;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: bo.app.z2 */
/* loaded from: classes.dex */
public final class C13281z2 implements InterfaceC13112s2 {

    /* renamed from: b */
    private String f59544b;

    /* renamed from: c */
    private Set<String> f59545c = new HashSet();

    public C13281z2(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(MessageExtension.FIELD_DATA);
        this.f59544b = jSONObject2.getString("id");
        JSONArray optJSONArray = jSONObject2.optJSONArray("buttons");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.f59545c.add(optJSONArray.getString(i));
            }
        }
    }

    @Override // bo.app.InterfaceC13112s2, bo.app.InterfaceC12546b2
    /* renamed from: a */
    public boolean mo62577a(InterfaceC13145t2 interfaceC13145t2) {
        if (interfaceC13145t2 instanceof C12519a3) {
            C12519a3 c12519a3 = (C12519a3) interfaceC13145t2;
            if (!C43318jS5.m30597g(c12519a3.m63945g()) && c12519a3.m63945g().equals(this.f59544b)) {
                if (this.f59545c.size() > 0) {
                    if (C43318jS5.m30597g(c12519a3.m63946f()) || !this.f59545c.contains(c12519a3.m63946f())) {
                        return false;
                    }
                    return true;
                }
                return C43318jS5.m30597g(c12519a3.m63946f());
            }
        }
        return false;
    }

    @Override // p000.InterfaceC37933aP1
    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.f59544b);
            if (this.f59545c.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (String str : this.f59545c) {
                    jSONArray.put(str);
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put(MessageExtension.FIELD_DATA, jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
