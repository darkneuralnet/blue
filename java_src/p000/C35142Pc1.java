package p000;
/* renamed from: Pc1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35142Pc1 {

    /* renamed from: a */
    public final String f28744a;

    public C35142Pc1(String str) {
        if (str != null) {
            this.f28744a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: b */
    public static C35142Pc1 m90060b(String str) {
        return new C35142Pc1(str);
    }

    /* renamed from: a */
    public String m90061a() {
        return this.f28744a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35142Pc1)) {
            return false;
        }
        return this.f28744a.equals(((C35142Pc1) obj).f28744a);
    }

    public int hashCode() {
        return this.f28744a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f28744a + "\"}";
    }
}
