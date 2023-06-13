package p000;

import java.util.Comparator;
/* renamed from: V62 */
/* loaded from: classes8.dex */
public abstract class V62 {

    /* renamed from: a */
    public double f38641a = Double.POSITIVE_INFINITY;

    /* renamed from: b */
    public double f38642b = Double.NEGATIVE_INFINITY;

    /* renamed from: V62$a */
    /* loaded from: classes8.dex */
    public static class C8558a implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            V62 v62 = (V62) obj;
            V62 v622 = (V62) obj2;
            double d = (v62.f38641a + v62.f38642b) / 2.0d;
            double d2 = (v622.f38641a + v622.f38642b) / 2.0d;
            if (d < d2) {
                return -1;
            }
            if (d > d2) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public boolean m80393a(double d, double d2) {
        return this.f38641a <= d2 && this.f38642b >= d;
    }

    /* renamed from: b */
    public abstract void mo80392b(double d, double d2, InterfaceC42261hg2 interfaceC42261hg2);

    public String toString() {
        return C44204kw6.m28149A(new C52053yB0(this.f38641a, 0.0d), new C52053yB0(this.f38642b, 0.0d));
    }
}
