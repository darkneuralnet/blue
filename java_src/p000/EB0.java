package p000;
/* renamed from: EB0 */
/* loaded from: classes8.dex */
public interface EB0 extends Cloneable {
    /* renamed from: F */
    int mo1717F();

    /* renamed from: K2 */
    default boolean m109312K2() {
        return mo1710e3() > 0;
    }

    /* renamed from: N0 */
    double mo1716N0(int i);

    /* renamed from: R */
    default C52053yB0 m109311R() {
        return MB0.m95609b(mo1717F(), mo1710e3());
    }

    /* renamed from: T */
    void mo1715T(int i, C52053yB0 c52053yB0);

    /* renamed from: W0 */
    default double mo1714W0(int i) {
        if (m109310k2()) {
            return mo1713a3(i, 2);
        }
        return Double.NaN;
    }

    /* renamed from: a3 */
    double mo1713a3(int i, int i2);

    /* renamed from: b2 */
    C52053yB0[] mo1712b2();

    EB0 copy();

    /* renamed from: e3 */
    default int mo1710e3() {
        return 0;
    }

    /* renamed from: k2 */
    default boolean m109310k2() {
        return mo1717F() - mo1710e3() > 2;
    }

    /* renamed from: m0 */
    C48772sf1 mo1709m0(C48772sf1 c48772sf1);

    /* renamed from: n2 */
    double mo1708n2(int i);

    int size();

    /* renamed from: u */
    C52053yB0 mo1707u(int i);

    /* renamed from: v3 */
    default double mo1706v3(int i) {
        if (m109312K2()) {
            return mo1713a3(i, mo1717F() - mo1710e3());
        }
        return Double.NaN;
    }

    /* renamed from: y1 */
    void mo1705y1(int i, int i2, double d);
}
