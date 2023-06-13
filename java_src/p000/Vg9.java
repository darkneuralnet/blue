package p000;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Vg9 */
/* loaded from: classes5.dex */
public final class Vg9 {

    /* renamed from: e */
    public static final Date f39468e = new Date(0);

    /* renamed from: a */
    public final JSONObject f39469a;

    /* renamed from: b */
    public final JSONObject f39470b;

    /* renamed from: c */
    public final Date f39471c;

    /* renamed from: d */
    public final JSONArray f39472d;

    public Vg9(JSONObject jSONObject, Date date, JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("configs_key", jSONObject);
        jSONObject2.put("fetch_time_key", date.getTime());
        jSONObject2.put("abt_experiments_key", jSONArray);
        this.f39470b = jSONObject;
        this.f39471c = date;
        this.f39472d = jSONArray;
        this.f39469a = jSONObject2;
    }

    /* renamed from: a */
    public static Ng9 m79572a() {
        return new Ng9(null);
    }

    /* renamed from: c */
    public final Date m79570c() {
        return this.f39471c;
    }

    /* renamed from: d */
    public final JSONObject m79569d() {
        return this.f39470b;
    }

    public final String toString() {
        return this.f39469a.toString();
    }
}
