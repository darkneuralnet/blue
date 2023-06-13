package p000;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: FE3 */
/* loaded from: classes5.dex */
public final class FE3 {

    /* renamed from: a */
    public final String f9059a;

    /* renamed from: b */
    public final String f9060b;

    /* renamed from: c */
    public final List<C41456gJ3> f9061c;

    /* renamed from: d */
    public final String f9062d;

    public FE3(JSONObject jSONObject) throws JSONException {
        this.f9059a = jSONObject.getString("name");
        this.f9060b = jSONObject.optString("value");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("path");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new C41456gJ3(optJSONArray.getJSONObject(i)));
            }
        }
        this.f9061c = arrayList;
        this.f9062d = jSONObject.optString("path_type", "absolute");
    }
}
