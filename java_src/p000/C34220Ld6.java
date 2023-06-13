package p000;

import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: Ld6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34220Ld6 {

    /* renamed from: a */
    public final String f21825a;

    /* renamed from: b */
    public final String f21826b;

    /* renamed from: c */
    public final String f21827c;

    /* renamed from: d */
    public final String f21828d;

    /* renamed from: e */
    public final String f21829e;

    /* renamed from: f */
    public final Date f21830f;

    /* renamed from: Ld6$a */
    /* loaded from: classes.dex */
    public static final class C5047a {

        /* renamed from: a */
        public String f21831a;

        /* renamed from: b */
        public String f21832b;

        /* renamed from: c */
        public String f21833c;

        /* renamed from: d */
        public String f21834d;

        /* renamed from: e */
        public String f21835e;

        /* renamed from: f */
        public Date f21836f;

        /* renamed from: a */
        public C34220Ld6 m96532a() throws NullPointerException, IllegalStateException {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            String str = this.f21831a;
            boolean z5 = false;
            if (str != null && !str.matches("[0-9]{8,19}")) {
                z = false;
            } else {
                z = true;
            }
            m96530c(z, "number must be null or have 8 to 19 digits (inclusive).");
            String str2 = this.f21834d;
            if (str2 != null && str2.length() <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            m96530c(z2, "cardHolderName must be null or not empty.");
            String str3 = this.f21835e;
            if (str3 != null && !str3.matches("[0-9]{3,4}")) {
                z3 = false;
            } else {
                z3 = true;
            }
            m96530c(z3, "cvc must be null or have 3 to 4 digits.");
            String str4 = this.f21832b;
            if (str4 != null && !str4.matches("0?[1-9]|1[0-2]")) {
                z4 = false;
            } else {
                z4 = true;
            }
            m96530c(z4, "expiryMonth must be null or between 1 and 12.");
            String str5 = this.f21833c;
            if (str5 == null || str5.matches("20\\d{2}")) {
                z5 = true;
            }
            m96530c(z5, "expiryYear must be in the second millennium and first century.");
            return new C34220Ld6(this.f21831a, this.f21832b, this.f21833c, this.f21835e, this.f21834d, this.f21836f);
        }

        /* renamed from: b */
        public final String m96531b(String str) {
            if (str != null) {
                return str.replaceAll("\\s", "");
            }
            return null;
        }

        /* renamed from: c */
        public final void m96530c(boolean z, String str) throws IllegalStateException {
            if (!z) {
                throw new IllegalStateException(str);
            }
        }

        /* renamed from: d */
        public C5047a m96529d(String str) {
            this.f21835e = m96531b(str);
            return this;
        }

        /* renamed from: e */
        public C5047a m96528e(String str) {
            this.f21832b = m96531b(str);
            return this;
        }

        /* renamed from: f */
        public C5047a m96527f(String str) {
            this.f21833c = m96531b(str);
            return this;
        }

        /* renamed from: g */
        public C5047a m96526g(String str) {
            this.f21831a = m96531b(str);
            return this;
        }
    }

    public C34220Ld6(String str, String str2, String str3, String str4, String str5, Date date) {
        this.f21825a = str;
        this.f21826b = str2;
        this.f21827c = str3;
        this.f21828d = str4;
        this.f21829e = str5;
        this.f21830f = date;
    }

    /* renamed from: a */
    public String m96536a() {
        return this.f21828d;
    }

    /* renamed from: b */
    public String m96535b() {
        return this.f21826b;
    }

    /* renamed from: c */
    public String m96534c() {
        return this.f21827c;
    }

    /* renamed from: d */
    public String m96533d() {
        return this.f21825a;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Date date = this.f21830f;
            if (date != null) {
                jSONObject.put("generationtime", C32828Ff0.f9925a.format(date));
            }
            String str = this.f21825a;
            if (str != null) {
                jSONObject.put("number", str.substring(0, 3));
            }
            jSONObject.putOpt("holderName", this.f21829e);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException("UnencryptedCard toString() failed.", e);
        }
    }
}
