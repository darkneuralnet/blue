package p000;

import android.net.Uri;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Y20 */
/* loaded from: classes2.dex */
public class Y20 {

    /* renamed from: a */
    public Uri f44463a;

    /* renamed from: b */
    public String f44464b;

    /* renamed from: c */
    public final int f44465c;

    /* renamed from: d */
    public JSONObject f44466d;

    public Y20(int i, Uri uri, String str, JSONObject jSONObject) {
        this.f44463a = uri;
        this.f44464b = str;
        this.f44465c = i;
        this.f44466d = jSONObject;
    }

    /* renamed from: a */
    public static Y20 m75819a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        int i = jSONObject.getInt("requestCode");
        String string = jSONObject.getString("url");
        return new Y20(i, Uri.parse(string), jSONObject.getString(TransferTable.COLUMN_STATE), jSONObject.optJSONObject("metadata"));
    }

    /* renamed from: b */
    public JSONObject m75818b() {
        return this.f44466d;
    }

    /* renamed from: c */
    public int m75817c() {
        return this.f44465c;
    }

    /* renamed from: d */
    public String m75816d() {
        return this.f44464b;
    }

    /* renamed from: e */
    public Uri m75815e() {
        return this.f44463a;
    }

    /* renamed from: f */
    public void m75814f(String str) {
        this.f44464b = str;
    }

    /* renamed from: g */
    public void m75813g(Uri uri) {
        this.f44463a = uri;
    }

    /* renamed from: h */
    public String m75812h() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestCode", this.f44465c);
        jSONObject.put("url", this.f44463a.toString());
        jSONObject.put(TransferTable.COLUMN_STATE, this.f44464b);
        JSONObject jSONObject2 = this.f44466d;
        if (jSONObject2 != null) {
            jSONObject.put("metadata", jSONObject2);
        }
        return jSONObject.toString();
    }
}
