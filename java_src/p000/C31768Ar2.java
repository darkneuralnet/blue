package p000;

import java.io.Serializable;
/* renamed from: Ar2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C31768Ar2 implements Comparable, Serializable {
    private static final long serialVersionUID = 3252005833466256227L;

    /* renamed from: b */
    public C52053yB0 f1204b;

    /* renamed from: c */
    public C52053yB0 f1205c;

    public C31768Ar2(C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        this.f1204b = c52053yB0;
        this.f1205c = c52053yB02;
    }

    /* renamed from: a */
    public double m115110a(C52053yB0 c52053yB0) {
        return G51.m105836a(c52053yB0, this.f1204b, this.f1205c);
    }

    /* renamed from: b */
    public C52053yB0 m115109b(int i) {
        if (i == 0) {
            return this.f1204b;
        }
        return this.f1205c;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        C31768Ar2 c31768Ar2 = (C31768Ar2) obj;
        int compareTo = this.f1204b.compareTo(c31768Ar2.f1204b);
        if (compareTo != 0) {
            return compareTo;
        }
        return this.f1205c.compareTo(c31768Ar2.f1205c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C31768Ar2)) {
            return false;
        }
        C31768Ar2 c31768Ar2 = (C31768Ar2) obj;
        if (!this.f1204b.equals(c31768Ar2.f1204b) || !this.f1205c.equals(c31768Ar2.f1205c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((493 + Double.hashCode(this.f1204b.f118922b)) * 29) + Double.hashCode(this.f1204b.f118923c)) * 29) + Double.hashCode(this.f1205c.f118922b)) * 29) + Double.hashCode(this.f1205c.f118923c);
    }

    public String toString() {
        return "LINESTRING( " + this.f1204b.f118922b + " " + this.f1204b.f118923c + ", " + this.f1205c.f118922b + " " + this.f1205c.f118923c + ")";
    }

    public C31768Ar2() {
        this(new C52053yB0(), new C52053yB0());
    }
}
