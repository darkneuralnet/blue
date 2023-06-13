package p000;

import java.util.ArrayList;
/* renamed from: DB0 */
/* loaded from: classes8.dex */
public class DB0 extends ArrayList<C52053yB0> {

    /* renamed from: b */
    public static final C52053yB0[] f5331b = new C52053yB0[0];
    private static final long serialVersionUID = -1626110935756089896L;

    public DB0() {
    }

    /* renamed from: b2 */
    public C52053yB0[] m110799b2() {
        return (C52053yB0[]) toArray(f5331b);
    }

    @Override // java.util.ArrayList
    public Object clone() {
        DB0 db0 = (DB0) super.clone();
        for (int i = 0; i < size(); i++) {
            db0.add(i, (C52053yB0) get(i).clone());
        }
        return db0;
    }

    /* renamed from: e */
    public void m110798e(int i, C52053yB0 c52053yB0, boolean z) {
        int size;
        if (!z && (size = size()) > 0) {
            if (i > 0 && get(i - 1).m3886g(c52053yB0)) {
                return;
            }
            if (i < size && get(i).m3886g(c52053yB0)) {
                return;
            }
        }
        super.add(i, c52053yB0);
    }

    /* renamed from: f */
    public void m110797f(C52053yB0 c52053yB0, boolean z) {
        if (!z && size() >= 1 && get(size() - 1).m3886g(c52053yB0)) {
            return;
        }
        super.add(c52053yB0);
    }

    /* renamed from: h */
    public boolean m110796h(C52053yB0[] c52053yB0Arr, boolean z) {
        m110795j(c52053yB0Arr, z, true);
        return true;
    }

    /* renamed from: j */
    public boolean m110795j(C52053yB0[] c52053yB0Arr, boolean z, boolean z2) {
        if (z2) {
            for (C52053yB0 c52053yB0 : c52053yB0Arr) {
                m110797f(c52053yB0, z);
            }
        } else {
            for (int length = c52053yB0Arr.length - 1; length >= 0; length--) {
                m110797f(c52053yB0Arr[length], z);
            }
        }
        return true;
    }

    /* renamed from: o */
    public void m110794o() {
        if (size() > 0) {
            m110797f(get(0).mo3888e(), false);
        }
    }

    /* renamed from: w */
    public C52053yB0[] m110793w(boolean z) {
        if (z) {
            return (C52053yB0[]) toArray(f5331b);
        }
        int size = size();
        C52053yB0[] c52053yB0Arr = new C52053yB0[size];
        for (int i = 0; i < size; i++) {
            c52053yB0Arr[i] = get((size - i) - 1);
        }
        return c52053yB0Arr;
    }

    public DB0(C52053yB0[] c52053yB0Arr) {
        ensureCapacity(c52053yB0Arr.length);
        m110796h(c52053yB0Arr, true);
    }

    public DB0(C52053yB0[] c52053yB0Arr, boolean z) {
        ensureCapacity(c52053yB0Arr.length);
        m110796h(c52053yB0Arr, z);
    }
}
