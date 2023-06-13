package p000;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Ng9 */
/* loaded from: classes5.dex */
public final class Ng9 {

    /* renamed from: a */
    public JSONObject f24974a = new JSONObject();

    /* renamed from: b */
    public Date f24975b = Vg9.m79571b();

    /* renamed from: c */
    public JSONArray f24976c = new JSONArray();

    private Ng9() {
    }

    /* renamed from: a */
    public final Ng9 m93580a(JSONObject jSONObject) {
        try {
            this.f24974a = new JSONObject(jSONObject.toString());
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: b */
    public final Ng9 m93579b(JSONArray jSONArray) {
        try {
            this.f24976c = new JSONArray(jSONArray.toString());
        } catch (JSONException unused) {
        }
        return this;
    }

    /* renamed from: c */
    public final Ng9 m93578c(Date date) {
        this.f24975b = date;
        return this;
    }

    /* renamed from: d */
    public final Vg9 m93577d() throws JSONException {
        return new Vg9(this.f24974a, this.f24975b, this.f24976c);
    }

    public /* synthetic */ Ng9(Fg9 fg9) {
    }
}
