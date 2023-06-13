package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: RH6 */
/* loaded from: classes8.dex */
public final class RH6 {

    /* renamed from: i */
    public static final Map<Integer, RH6> f31788i;

    /* renamed from: a */
    public final QH6 f31789a;

    /* renamed from: b */
    public final int f31790b;

    /* renamed from: c */
    public final int f31791c;

    /* renamed from: d */
    public final C5448N f31792d;

    /* renamed from: e */
    public final int f31793e;

    /* renamed from: f */
    public final String f31794f;

    /* renamed from: g */
    public final int f31795g;

    /* renamed from: h */
    public final C45983nw6 f31796h;

    static {
        HashMap hashMap = new HashMap();
        Integer m88940a = Q52.m88940a(1);
        C5448N c5448n = InterfaceC42183hY2.f85404c;
        hashMap.put(m88940a, new RH6(10, c5448n));
        hashMap.put(Q52.m88940a(2), new RH6(16, c5448n));
        hashMap.put(Q52.m88940a(3), new RH6(20, c5448n));
        Integer m88940a2 = Q52.m88940a(4);
        C5448N c5448n2 = InterfaceC42183hY2.f85408e;
        hashMap.put(m88940a2, new RH6(10, c5448n2));
        hashMap.put(Q52.m88940a(5), new RH6(16, c5448n2));
        hashMap.put(Q52.m88940a(6), new RH6(20, c5448n2));
        Integer m88940a3 = Q52.m88940a(7);
        C5448N c5448n3 = InterfaceC42183hY2.f85424m;
        hashMap.put(m88940a3, new RH6(10, c5448n3));
        hashMap.put(Q52.m88940a(8), new RH6(16, c5448n3));
        hashMap.put(Q52.m88940a(9), new RH6(20, c5448n3));
        Integer m88940a4 = Q52.m88940a(10);
        C5448N c5448n4 = InterfaceC42183hY2.f85426n;
        hashMap.put(m88940a4, new RH6(10, c5448n4));
        hashMap.put(Q52.m88940a(11), new RH6(16, c5448n4));
        hashMap.put(Q52.m88940a(12), new RH6(20, c5448n4));
        f31788i = Collections.unmodifiableMap(hashMap);
    }

    public RH6(int i, C5448N c5448n) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (c5448n == null) {
            throw new NullPointerException("digest == null");
        }
        this.f31790b = i;
        this.f31791c = m86989a();
        String m87373b = R31.m87373b(c5448n);
        this.f31794f = m87373b;
        this.f31792d = c5448n;
        C45983nw6 c45983nw6 = new C45983nw6(c5448n);
        this.f31796h = c45983nw6;
        int m22160c = c45983nw6.m22160c();
        this.f31795g = m22160c;
        int m22159d = c45983nw6.m22159d();
        this.f31793e = m22159d;
        this.f31789a = ZY0.m72970c(m87373b, m22160c, m22159d, c45983nw6.m22162a(), i);
    }

    /* renamed from: k */
    public static RH6 m86979k(int i) {
        return f31788i.get(Q52.m88940a(i));
    }

    /* renamed from: a */
    public final int m86989a() {
        int i = 2;
        while (true) {
            int i2 = this.f31790b;
            if (i > i2) {
                throw new IllegalStateException("should never happen...");
            }
            if ((i2 - i) % 2 == 0) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: b */
    public int m86988b() {
        return this.f31790b;
    }

    /* renamed from: c */
    public int m86987c() {
        return this.f31791c;
    }

    /* renamed from: d */
    public int m86986d() {
        return this.f31796h.m22162a();
    }

    /* renamed from: e */
    public QH6 m86985e() {
        return this.f31789a;
    }

    /* renamed from: f */
    public String m86984f() {
        return this.f31794f;
    }

    /* renamed from: g */
    public C5448N m86983g() {
        return this.f31792d;
    }

    /* renamed from: h */
    public int m86982h() {
        return this.f31795g;
    }

    /* renamed from: i */
    public C44797lw6 m86981i() {
        return new C44797lw6(this.f31796h);
    }

    /* renamed from: j */
    public int m86980j() {
        return this.f31793e;
    }

    public RH6(int i, P31 p31) {
        this(i, R31.m87372c(p31.mo15579d()));
    }
}
