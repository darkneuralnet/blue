package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.FirebaseException;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Xh */
/* loaded from: classes6.dex */
public class C9439Xh {

    /* renamed from: a */
    public String f43581a;

    /* renamed from: b */
    public String f43582b;

    public C9439Xh(String str, String str2) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        this.f43581a = str;
        this.f43582b = str2;
    }

    /* renamed from: a */
    public static C9439Xh m76702a(String str) throws FirebaseException, JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String emptyToNull = Strings.emptyToNull(jSONObject.optString("token"));
        String emptyToNull2 = Strings.emptyToNull(jSONObject.optString("ttl"));
        if (emptyToNull != null && emptyToNull2 != null) {
            return new C9439Xh(emptyToNull, emptyToNull2);
        }
        throw new FirebaseException("Unexpected server response.");
    }

    /* renamed from: b */
    public String m76701b() {
        return this.f43582b;
    }

    /* renamed from: c */
    public String m76700c() {
        return this.f43581a;
    }
}
