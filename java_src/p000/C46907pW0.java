package p000;

import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p000.InterfaceC37319Yk0;
/* renamed from: pW0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46907pW0 extends AbstractC8723Vh {

    /* renamed from: d */
    public static final String f103757d = "pW0";

    /* renamed from: a */
    public final String f103758a;

    /* renamed from: b */
    public final long f103759b;

    /* renamed from: c */
    public final long f103760c;

    public C46907pW0(String str, long j) {
        this(str, j, new InterfaceC37319Yk0.C9955a().currentTimeMillis());
    }

    /* renamed from: c */
    public static C46907pW0 m19169c(C9439Xh c9439Xh) {
        long m19165g;
        Preconditions.checkNotNull(c9439Xh);
        try {
            m19165g = (long) (Double.parseDouble(c9439Xh.m76701b().replace("s", "")) * 1000.0d);
        } catch (NumberFormatException unused) {
            Map<String, Object> m18193b = C47258q56.m18193b(c9439Xh.m76700c());
            m19165g = 1000 * (m19165g(m18193b, "exp") - m19165g(m18193b, "iat"));
        }
        return new C46907pW0(c9439Xh.m76700c(), m19165g);
    }

    /* renamed from: d */
    public static C46907pW0 m19168d(String str) {
        Preconditions.checkNotNull(str);
        Map<String, Object> m18193b = C47258q56.m18193b(str);
        long m19165g = m19165g(m18193b, "iat");
        return new C46907pW0(str, (m19165g(m18193b, "exp") - m19165g) * 1000, m19165g * 1000);
    }

    /* renamed from: e */
    public static C46907pW0 m19167e(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C46907pW0(jSONObject.getString("token"), jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"));
        } catch (JSONException e) {
            String str2 = f103757d;
            Log.e(str2, "Could not deserialize token: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: g */
    public static long m19165g(Map<String, Object> map, String str) {
        Preconditions.checkNotNull(map);
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0L;
        }
        return num.longValue();
    }

    @Override // p000.AbstractC8723Vh
    /* renamed from: a */
    public long mo19171a() {
        return this.f103759b + this.f103760c;
    }

    @Override // p000.AbstractC8723Vh
    /* renamed from: b */
    public String mo19170b() {
        return this.f103758a;
    }

    /* renamed from: f */
    public long m19166f() {
        return this.f103760c;
    }

    /* renamed from: h */
    public long m19164h() {
        return this.f103759b;
    }

    /* renamed from: i */
    public String m19163i() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", this.f103758a);
            jSONObject.put("receivedAt", this.f103759b);
            jSONObject.put("expiresIn", this.f103760c);
            return jSONObject.toString();
        } catch (JSONException e) {
            String str = f103757d;
            Log.e(str, "Could not serialize token: " + e.getMessage());
            return null;
        }
    }

    public C46907pW0(String str, long j, long j2) {
        Preconditions.checkNotEmpty(str);
        this.f103758a = str;
        this.f103760c = j;
        this.f103759b = j2;
    }
}
