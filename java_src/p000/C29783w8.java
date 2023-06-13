package p000;

import java.security.GeneralSecurityException;
import java.util.Objects;
/* renamed from: w8 */
/* loaded from: classes6.dex */
public final class C29783w8 extends YE2 {

    /* renamed from: a */
    public final int f115395a;

    /* renamed from: b */
    public final C29784a f115396b;

    /* renamed from: w8$a */
    /* loaded from: classes6.dex */
    public static final class C29784a {

        /* renamed from: b */
        public static final C29784a f115397b = new C29784a("TINK");

        /* renamed from: c */
        public static final C29784a f115398c = new C29784a("CRUNCHY");

        /* renamed from: d */
        public static final C29784a f115399d = new C29784a("LEGACY");

        /* renamed from: e */
        public static final C29784a f115400e = new C29784a("NO_PREFIX");

        /* renamed from: a */
        public final String f115401a;

        public C29784a(String str) {
            this.f115401a = str;
        }

        public String toString() {
            return this.f115401a;
        }
    }

    public C29783w8(int i, C29784a c29784a) {
        this.f115395a = i;
        this.f115396b = c29784a;
    }

    /* renamed from: a */
    public static C29783w8 m7372a(int i, C29784a c29784a) throws GeneralSecurityException {
        if (i >= 10 && 16 >= i) {
            return new C29783w8(i, c29784a);
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
    }

    /* renamed from: b */
    public int m7371b() {
        return this.f115395a;
    }

    /* renamed from: c */
    public int m7370c() {
        int m7371b;
        C29784a c29784a = this.f115396b;
        if (c29784a == C29784a.f115400e) {
            return m7371b();
        }
        if (c29784a == C29784a.f115397b) {
            m7371b = m7371b();
        } else if (c29784a == C29784a.f115398c) {
            m7371b = m7371b();
        } else if (c29784a == C29784a.f115399d) {
            m7371b = m7371b();
        } else {
            throw new IllegalStateException("Unknown variant");
        }
        return m7371b + 5;
    }

    /* renamed from: d */
    public C29784a m7369d() {
        return this.f115396b;
    }

    /* renamed from: e */
    public boolean m7368e() {
        return this.f115396b != C29784a.f115400e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C29783w8)) {
            return false;
        }
        C29783w8 c29783w8 = (C29783w8) obj;
        if (c29783w8.m7370c() != m7370c() || c29783w8.m7369d() != m7369d()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f115395a), this.f115396b);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f115396b + ", " + this.f115395a + "-byte tags)";
    }
}
