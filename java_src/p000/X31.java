package p000;
/* renamed from: X31 */
/* loaded from: classes6.dex */
public final class X31 {

    /* renamed from: a */
    public final int f42580a;

    /* renamed from: b */
    public final int f42581b;

    /* renamed from: a */
    public int m77503a() {
        return this.f42581b;
    }

    /* renamed from: b */
    public int m77502b() {
        return this.f42580a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof X31) {
            X31 x31 = (X31) obj;
            if (this.f42580a == x31.f42580a && this.f42581b == x31.f42581b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f42580a * 32713) + this.f42581b;
    }

    public String toString() {
        return this.f42580a + "x" + this.f42581b;
    }
}
