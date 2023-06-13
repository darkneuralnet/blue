package p000;

import java.io.Serializable;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* renamed from: gF0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41417gF0 implements Serializable {

    /* renamed from: e */
    public static final C41417gF0 f81831e = new C41417gF0("P-256", "secp256r1", "1.2.840.10045.3.1.7");

    /* renamed from: f */
    public static final C41417gF0 f81832f = new C41417gF0("secp256k1", "secp256k1", "1.3.132.0.10");
    @Deprecated

    /* renamed from: g */
    public static final C41417gF0 f81833g = new C41417gF0("P-256K", "secp256k1", "1.3.132.0.10");

    /* renamed from: h */
    public static final C41417gF0 f81834h = new C41417gF0("P-384", "secp384r1", "1.3.132.0.34");

    /* renamed from: i */
    public static final C41417gF0 f81835i = new C41417gF0("P-521", "secp521r1", "1.3.132.0.35");

    /* renamed from: j */
    public static final C41417gF0 f81836j = new C41417gF0("Ed25519", "Ed25519", null);

    /* renamed from: k */
    public static final C41417gF0 f81837k = new C41417gF0("Ed448", "Ed448", null);

    /* renamed from: l */
    public static final C41417gF0 f81838l = new C41417gF0("X25519", "X25519", null);

    /* renamed from: m */
    public static final C41417gF0 f81839m = new C41417gF0("X448", "X448", null);
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final String f81840b;

    /* renamed from: c */
    public final String f81841c;

    /* renamed from: d */
    public final String f81842d;

    public C41417gF0(String str) {
        this(str, null, null);
    }

    /* renamed from: a */
    public static C41417gF0 m39802a(ECParameterSpec eCParameterSpec) {
        return R81.m87250a(eCParameterSpec);
    }

    /* renamed from: b */
    public static Set<C41417gF0> m39801b(C42271hh2 c42271hh2) {
        if (C42271hh2.f85669k.equals(c42271hh2)) {
            return Collections.singleton(f81831e);
        }
        if (C42271hh2.f85670l.equals(c42271hh2)) {
            return Collections.singleton(f81832f);
        }
        if (C42271hh2.f85671m.equals(c42271hh2)) {
            return Collections.singleton(f81834h);
        }
        if (C42271hh2.f85672n.equals(c42271hh2)) {
            return Collections.singleton(f81835i);
        }
        if (C42271hh2.f85676r.equals(c42271hh2)) {
            return Collections.unmodifiableSet(new HashSet(Arrays.asList(f81836j, f81837k)));
        }
        return null;
    }

    /* renamed from: d */
    public static C41417gF0 m39799d(String str) {
        if (str != null && !str.trim().isEmpty()) {
            C41417gF0 c41417gF0 = f81831e;
            if (str.equals(c41417gF0.getName())) {
                return c41417gF0;
            }
            C41417gF0 c41417gF02 = f81833g;
            if (str.equals(c41417gF02.getName())) {
                return c41417gF02;
            }
            C41417gF0 c41417gF03 = f81832f;
            if (str.equals(c41417gF03.getName())) {
                return c41417gF03;
            }
            C41417gF0 c41417gF04 = f81834h;
            if (str.equals(c41417gF04.getName())) {
                return c41417gF04;
            }
            C41417gF0 c41417gF05 = f81835i;
            if (str.equals(c41417gF05.getName())) {
                return c41417gF05;
            }
            C41417gF0 c41417gF06 = f81836j;
            if (str.equals(c41417gF06.getName())) {
                return c41417gF06;
            }
            C41417gF0 c41417gF07 = f81837k;
            if (str.equals(c41417gF07.getName())) {
                return c41417gF07;
            }
            C41417gF0 c41417gF08 = f81838l;
            if (str.equals(c41417gF08.getName())) {
                return c41417gF08;
            }
            C41417gF0 c41417gF09 = f81839m;
            if (str.equals(c41417gF09.getName())) {
                return c41417gF09;
            }
            return new C41417gF0(str);
        }
        throw new IllegalArgumentException("The cryptographic curve string must not be null or empty");
    }

    /* renamed from: c */
    public String m39800c() {
        return this.f81841c;
    }

    /* renamed from: e */
    public ECParameterSpec m39798e() {
        return R81.m87249b(this);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C41417gF0) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.f81840b;
    }

    public int hashCode() {
        return Objects.hash(getName());
    }

    public String toString() {
        return getName();
    }

    public C41417gF0(String str, String str2, String str3) {
        if (str != null) {
            this.f81840b = str;
            this.f81841c = str2;
            this.f81842d = str3;
            return;
        }
        throw new IllegalArgumentException("The JOSE cryptographic curve name must not be null");
    }
}
