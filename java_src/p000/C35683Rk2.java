package p000;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Objects;
/* renamed from: Rk2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35683Rk2 implements Serializable {

    /* renamed from: c */
    public static final C35683Rk2 f32497c = new C35683Rk2("sig");

    /* renamed from: d */
    public static final C35683Rk2 f32498d = new C35683Rk2("enc");
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final String f32499b;

    public C35683Rk2(String str) {
        if (str != null) {
            this.f32499b = str;
            return;
        }
        throw new IllegalArgumentException("The key use identifier must not be null");
    }

    /* renamed from: b */
    public static C35683Rk2 m86402b(String str) throws ParseException {
        if (str == null) {
            return null;
        }
        C35683Rk2 c35683Rk2 = f32497c;
        if (str.equals(c35683Rk2.m86403a())) {
            return c35683Rk2;
        }
        C35683Rk2 c35683Rk22 = f32498d;
        if (str.equals(c35683Rk22.m86403a())) {
            return c35683Rk22;
        }
        if (!str.trim().isEmpty()) {
            return new C35683Rk2(str);
        }
        throw new ParseException("JWK use value must not be empty or blank", 0);
    }

    /* renamed from: a */
    public String m86403a() {
        return this.f32499b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35683Rk2)) {
            return false;
        }
        return Objects.equals(this.f32499b, ((C35683Rk2) obj).f32499b);
    }

    public int hashCode() {
        return Objects.hash(this.f32499b);
    }

    public String toString() {
        return m86403a();
    }
}
