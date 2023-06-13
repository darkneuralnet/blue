package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* renamed from: xA3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C51454xA3 {

    /* renamed from: a */
    public int f117159a;

    /* renamed from: b */
    public WB1 f117160b;

    /* renamed from: c */
    public WB1 f117161c;

    /* renamed from: d */
    public C40414eZ3 f117162d;

    /* renamed from: e */
    public C38409bC1 f117163e;

    /* renamed from: f */
    public ArrayList<FW3> f117164f;

    public C51454xA3(int i, WB1 wb1, WB1 wb12, C40414eZ3 c40414eZ3) {
        this.f117159a = i;
        this.f117160b = wb1;
        this.f117161c = wb12;
        this.f117162d = c40414eZ3;
        this.f117163e = wb1.m78758c0();
    }

    /* renamed from: g */
    public static WB1 m5759g(int i, WB1 wb1, WB1 wb12, C40414eZ3 c40414eZ3) {
        return new C51454xA3(i, wb1, wb12, c40414eZ3).m5760f();
    }

    /* renamed from: h */
    public static C52053yB0 m5758h(FW3 fw3, C40414eZ3 c40414eZ3) {
        C52053yB0 mo77239W = fw3.mo77239W();
        if (C52047yA3.m3999h(c40414eZ3)) {
            return mo77239W;
        }
        C52053yB0 mo3888e = mo77239W.mo3888e();
        c40414eZ3.m42760f(mo3888e);
        return mo3888e;
    }

    /* renamed from: a */
    public final HashMap<C52053yB0, FW3> m5765a(WB1 wb1) {
        HashMap<C52053yB0, FW3> hashMap = new HashMap<>();
        for (int i = 0; i < wb1.mo77232f0(); i++) {
            WB1 mo77236d0 = wb1.mo77236d0(i);
            if (mo77236d0 instanceof FW3) {
                if (!mo77236d0.mo77226r0()) {
                    FW3 fw3 = (FW3) mo77236d0;
                    C52053yB0 m5758h = m5758h(fw3, this.f117162d);
                    if (!hashMap.containsKey(m5758h)) {
                        hashMap.put(m5758h, fw3);
                    }
                }
            } else {
                throw new IllegalArgumentException("Non-point geometry input to point overlay");
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public final void m5764b(Map<C52053yB0, FW3> map, Map<C52053yB0, FW3> map2, ArrayList<FW3> arrayList) {
        for (Map.Entry<C52053yB0, FW3> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                arrayList.add(m5761e(entry.getValue()));
            }
        }
    }

    /* renamed from: c */
    public final void m5763c(Map<C52053yB0, FW3> map, Map<C52053yB0, FW3> map2, ArrayList<FW3> arrayList) {
        for (Map.Entry<C52053yB0, FW3> entry : map.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                arrayList.add(m5761e(entry.getValue()));
            }
        }
    }

    /* renamed from: d */
    public final void m5762d(Map<C52053yB0, FW3> map, Map<C52053yB0, FW3> map2, ArrayList<FW3> arrayList) {
        for (FW3 fw3 : map.values()) {
            arrayList.add(m5761e(fw3));
        }
        for (Map.Entry<C52053yB0, FW3> entry : map2.entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                arrayList.add(m5761e(entry.getValue()));
            }
        }
    }

    /* renamed from: e */
    public final FW3 m5761e(FW3 fw3) {
        if (C52047yA3.m3999h(this.f117162d)) {
            return (FW3) fw3.m78752m();
        }
        EB0 m107068L0 = fw3.m107068L0();
        EB0 copy = m107068L0.copy();
        copy.mo1705y1(0, 0, this.f117162d.m42761e(m107068L0.mo1708n2(0)));
        copy.mo1705y1(0, 1, this.f117162d.m42761e(m107068L0.mo1716N0(0)));
        return this.f117163e.m64834u(copy);
    }

    /* renamed from: f */
    public WB1 m5760f() {
        HashMap<C52053yB0, FW3> m5765a = m5765a(this.f117160b);
        HashMap<C52053yB0, FW3> m5765a2 = m5765a(this.f117161c);
        ArrayList<FW3> arrayList = new ArrayList<>();
        this.f117164f = arrayList;
        int i = this.f117159a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        m5764b(m5765a, m5765a2, arrayList);
                        m5764b(m5765a2, m5765a, this.f117164f);
                    }
                } else {
                    m5764b(m5765a, m5765a2, arrayList);
                }
            } else {
                m5762d(m5765a, m5765a2, arrayList);
            }
        } else {
            m5763c(m5765a, m5765a2, arrayList);
        }
        if (this.f117164f.isEmpty()) {
            return C52047yA3.m4005b(0, this.f117163e);
        }
        return this.f117163e.m64854a(this.f117164f);
    }
}
