package p000;

import java.io.Serializable;
/* renamed from: Gg2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33073Gg2 implements Serializable {

    /* renamed from: c */
    public static final C33073Gg2 f12234c = new C33073Gg2("JOSE");

    /* renamed from: d */
    public static final C33073Gg2 f12235d = new C33073Gg2("JOSE+JSON");

    /* renamed from: e */
    public static final C33073Gg2 f12236e = new C33073Gg2("JWT");
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public final String f12237b;

    public C33073Gg2(String str) {
        if (str != null) {
            this.f12237b = str;
            return;
        }
        throw new IllegalArgumentException("The object type must not be null");
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C33073Gg2) && this.f12237b.equalsIgnoreCase(((C33073Gg2) obj).f12237b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f12237b.toLowerCase().hashCode();
    }

    public String toString() {
        return this.f12237b;
    }
}
