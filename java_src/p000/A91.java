package p000;
/* renamed from: A91 */
/* loaded from: classes8.dex */
public class A91 implements Comparable {

    /* renamed from: b */
    public C52053yB0 f200b;

    /* renamed from: c */
    public int f201c;

    /* renamed from: d */
    public double f202d;

    public A91(C52053yB0 c52053yB0, int i, double d) {
        this.f200b = new C52053yB0(c52053yB0);
        this.f201c = i;
        this.f202d = d;
    }

    /* renamed from: a */
    public int m116060a(int i, double d) {
        int i2 = this.f201c;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        double d2 = this.f202d;
        if (d2 < d) {
            return -1;
        }
        if (d2 > d) {
            return 1;
        }
        return 0;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        A91 a91 = (A91) obj;
        return m116060a(a91.f201c, a91.f202d);
    }

    public String toString() {
        return this.f200b + " seg # = " + this.f201c + " dist = " + this.f202d;
    }
}
