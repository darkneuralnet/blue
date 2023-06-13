package p000;

import com.stripe.android.financialconnections.domain.Entry;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: gJ3  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C41456gJ3 {

    /* renamed from: a */
    public final String f81963a;

    /* renamed from: b */
    public final int f81964b;

    /* renamed from: c */
    public final int f81965c;

    /* renamed from: d */
    public final String f81966d;

    /* renamed from: e */
    public final String f81967e;

    /* renamed from: f */
    public final String f81968f;

    /* renamed from: g */
    public final String f81969g;

    /* renamed from: h */
    public final int f81970h;

    /* renamed from: gJ3$a */
    /* loaded from: classes5.dex */
    public enum EnumC20822a {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        

        /* renamed from: b */
        public final int f81977b;

        EnumC20822a(int i) {
            this.f81977b = i;
        }

        /* renamed from: a */
        public int m39644a() {
            return this.f81977b;
        }
    }

    public C41456gJ3(JSONObject jSONObject) throws JSONException {
        this.f81963a = jSONObject.getString("class_name");
        this.f81964b = jSONObject.optInt("index", -1);
        this.f81965c = jSONObject.optInt("id");
        this.f81966d = jSONObject.optString(Entry.TYPE_TEXT);
        this.f81967e = jSONObject.optString("tag");
        this.f81968f = jSONObject.optString("description");
        this.f81969g = jSONObject.optString("hint");
        this.f81970h = jSONObject.optInt("match_bitmask");
    }
}
