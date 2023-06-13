package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: JH6 */
/* loaded from: classes8.dex */
public final class JH6 {

    /* renamed from: e */
    public static final Map<Integer, JH6> f17300e;

    /* renamed from: a */
    public final QH6 f17301a;

    /* renamed from: b */
    public final RH6 f17302b;

    /* renamed from: c */
    public final int f17303c;

    /* renamed from: d */
    public final int f17304d;

    static {
        HashMap hashMap = new HashMap();
        Integer m88940a = Q52.m88940a(1);
        C5448N c5448n = InterfaceC42183hY2.f85404c;
        hashMap.put(m88940a, new JH6(20, 2, c5448n));
        hashMap.put(Q52.m88940a(2), new JH6(20, 4, c5448n));
        hashMap.put(Q52.m88940a(3), new JH6(40, 2, c5448n));
        hashMap.put(Q52.m88940a(4), new JH6(40, 4, c5448n));
        hashMap.put(Q52.m88940a(5), new JH6(40, 8, c5448n));
        hashMap.put(Q52.m88940a(6), new JH6(60, 3, c5448n));
        hashMap.put(Q52.m88940a(7), new JH6(60, 6, c5448n));
        hashMap.put(Q52.m88940a(8), new JH6(60, 12, c5448n));
        Integer m88940a2 = Q52.m88940a(9);
        C5448N c5448n2 = InterfaceC42183hY2.f85408e;
        hashMap.put(m88940a2, new JH6(20, 2, c5448n2));
        hashMap.put(Q52.m88940a(10), new JH6(20, 4, c5448n2));
        hashMap.put(Q52.m88940a(11), new JH6(40, 2, c5448n2));
        hashMap.put(Q52.m88940a(12), new JH6(40, 4, c5448n2));
        hashMap.put(Q52.m88940a(13), new JH6(40, 8, c5448n2));
        hashMap.put(Q52.m88940a(14), new JH6(60, 3, c5448n2));
        hashMap.put(Q52.m88940a(15), new JH6(60, 6, c5448n2));
        hashMap.put(Q52.m88940a(16), new JH6(60, 12, c5448n2));
        Integer m88940a3 = Q52.m88940a(17);
        C5448N c5448n3 = InterfaceC42183hY2.f85424m;
        hashMap.put(m88940a3, new JH6(20, 2, c5448n3));
        hashMap.put(Q52.m88940a(18), new JH6(20, 4, c5448n3));
        hashMap.put(Q52.m88940a(19), new JH6(40, 2, c5448n3));
        hashMap.put(Q52.m88940a(20), new JH6(40, 4, c5448n3));
        hashMap.put(Q52.m88940a(21), new JH6(40, 8, c5448n3));
        hashMap.put(Q52.m88940a(22), new JH6(60, 3, c5448n3));
        hashMap.put(Q52.m88940a(23), new JH6(60, 6, c5448n3));
        hashMap.put(Q52.m88940a(24), new JH6(60, 12, c5448n3));
        Integer m88940a4 = Q52.m88940a(25);
        C5448N c5448n4 = InterfaceC42183hY2.f85426n;
        hashMap.put(m88940a4, new JH6(20, 2, c5448n4));
        hashMap.put(Q52.m88940a(26), new JH6(20, 4, c5448n4));
        hashMap.put(Q52.m88940a(27), new JH6(40, 2, c5448n4));
        hashMap.put(Q52.m88940a(28), new JH6(40, 4, c5448n4));
        hashMap.put(Q52.m88940a(29), new JH6(40, 8, c5448n4));
        hashMap.put(Q52.m88940a(30), new JH6(60, 3, c5448n4));
        hashMap.put(Q52.m88940a(31), new JH6(60, 6, c5448n4));
        hashMap.put(Q52.m88940a(32), new JH6(60, 12, c5448n4));
        f17300e = Collections.unmodifiableMap(hashMap);
    }

    public JH6(int i, int i2, C5448N c5448n) {
        this.f17303c = i;
        this.f17304d = i2;
        this.f17302b = new RH6(m100730j(i, i2), c5448n);
        this.f17301a = YY0.m74916c(m100735e(), m100734f(), m100733g(), m100737c(), m100739a(), i2);
    }

    /* renamed from: i */
    public static JH6 m100731i(int i) {
        return f17300e.get(Q52.m88940a(i));
    }

    /* renamed from: j */
    public static int m100730j(int i, int i2) throws IllegalArgumentException {
        if (i >= 2) {
            if (i % i2 == 0) {
                int i3 = i / i2;
                if (i3 != 1) {
                    return i3;
                }
                throw new IllegalArgumentException("height / layers must be greater than 1");
            }
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        throw new IllegalArgumentException("totalHeight must be > 1");
    }

    /* renamed from: a */
    public int m100739a() {
        return this.f17303c;
    }

    /* renamed from: b */
    public int m100738b() {
        return this.f17304d;
    }

    /* renamed from: c */
    public int m100737c() {
        return this.f17302b.m86986d();
    }

    /* renamed from: d */
    public QH6 m100736d() {
        return this.f17301a;
    }

    /* renamed from: e */
    public String m100735e() {
        return this.f17302b.m86984f();
    }

    /* renamed from: f */
    public int m100734f() {
        return this.f17302b.m86982h();
    }

    /* renamed from: g */
    public int m100733g() {
        return this.f17302b.m86980j();
    }

    /* renamed from: h */
    public RH6 m100732h() {
        return this.f17302b;
    }

    public JH6(int i, int i2, P31 p31) {
        this(i, i2, R31.m87372c(p31.mo15579d()));
    }
}
