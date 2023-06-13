package p000;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.FirebaseException;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: lB1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C44347lB1 {

    /* renamed from: a */
    public String f95690a;

    /* renamed from: b */
    public String f95691b;

    public C44347lB1(String str, String str2) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        this.f95690a = str;
        this.f95691b = str2;
    }

    /* renamed from: a */
    public static C44347lB1 m27688a(String str) throws FirebaseException, JSONException {
        JSONObject jSONObject = new JSONObject(str);
        String emptyToNull = Strings.emptyToNull(jSONObject.optString("challenge"));
        String emptyToNull2 = Strings.emptyToNull(jSONObject.optString("ttl"));
        if (emptyToNull != null && emptyToNull2 != null) {
            return new C44347lB1(emptyToNull, emptyToNull2);
        }
        throw new FirebaseException("Unexpected server response.");
    }

    /* renamed from: b */
    public String m27687b() {
        return this.f95690a;
    }
}
