package p000;

import java.io.Serializable;
/* renamed from: E9 */
/* loaded from: classes6.dex */
public class C1744E9 implements Serializable {

    /* renamed from: d */
    public static final C1744E9 f7018d = new C1744E9("none", EnumC47980rJ4.REQUIRED);
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final String f7019b;

    /* renamed from: c */
    public final EnumC47980rJ4 f7020c;

    public C1744E9(String str, EnumC47980rJ4 enumC47980rJ4) {
        if (str != null) {
            this.f7019b = str;
            this.f7020c = enumC47980rJ4;
            return;
        }
        throw new IllegalArgumentException("The algorithm name must not be null");
    }

    /* renamed from: a */
    public static C1744E9 m109343a(String str) {
        if (str == null) {
            return null;
        }
        return new C1744E9(str);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C1744E9) && toString().equals(obj.toString())) {
            return true;
        }
        return false;
    }

    public final String getName() {
        return this.f7019b;
    }

    public final int hashCode() {
        return this.f7019b.hashCode();
    }

    public final String toString() {
        return this.f7019b;
    }

    public C1744E9(String str) {
        this(str, null);
    }
}
