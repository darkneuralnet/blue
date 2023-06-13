package p000;

import java.io.Serializable;
/* renamed from: Ok2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34981Ok2 implements Serializable {

    /* renamed from: d */
    public static final C34981Ok2 f27171d = new C34981Ok2("EC", EnumC47980rJ4.RECOMMENDED);

    /* renamed from: e */
    public static final C34981Ok2 f27172e = new C34981Ok2("RSA", EnumC47980rJ4.REQUIRED);

    /* renamed from: f */
    public static final C34981Ok2 f27173f;

    /* renamed from: g */
    public static final C34981Ok2 f27174g;
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final String f27175b;

    /* renamed from: c */
    public final EnumC47980rJ4 f27176c;

    static {
        EnumC47980rJ4 enumC47980rJ4 = EnumC47980rJ4.OPTIONAL;
        f27173f = new C34981Ok2("oct", enumC47980rJ4);
        f27174g = new C34981Ok2("OKP", enumC47980rJ4);
    }

    public C34981Ok2(String str, EnumC47980rJ4 enumC47980rJ4) {
        if (str != null) {
            this.f27175b = str;
            this.f27176c = enumC47980rJ4;
            return;
        }
        throw new IllegalArgumentException("The key type value must not be null");
    }

    /* renamed from: b */
    public static C34981Ok2 m91590b(String str) {
        if (str != null) {
            C34981Ok2 c34981Ok2 = f27171d;
            if (str.equals(c34981Ok2.m91591a())) {
                return c34981Ok2;
            }
            C34981Ok2 c34981Ok22 = f27172e;
            if (str.equals(c34981Ok22.m91591a())) {
                return c34981Ok22;
            }
            C34981Ok2 c34981Ok23 = f27173f;
            if (str.equals(c34981Ok23.m91591a())) {
                return c34981Ok23;
            }
            C34981Ok2 c34981Ok24 = f27174g;
            if (str.equals(c34981Ok24.m91591a())) {
                return c34981Ok24;
            }
            return new C34981Ok2(str, null);
        }
        throw new IllegalArgumentException("The key type to parse must not be null");
    }

    /* renamed from: a */
    public String m91591a() {
        return this.f27175b;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C34981Ok2) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f27175b.hashCode();
    }

    public String toString() {
        return this.f27175b;
    }
}
