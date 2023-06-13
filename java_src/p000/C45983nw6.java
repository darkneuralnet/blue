package p000;
/* renamed from: nw6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45983nw6 {

    /* renamed from: a */
    public final QH6 f101101a;

    /* renamed from: b */
    public final int f101102b;

    /* renamed from: c */
    public final int f101103c;

    /* renamed from: d */
    public final int f101104d;

    /* renamed from: e */
    public final int f101105e;

    /* renamed from: f */
    public final int f101106f;

    /* renamed from: g */
    public final C5448N f101107g;

    public C45983nw6(C5448N c5448n) {
        if (c5448n == null) {
            throw new NullPointerException("treeDigest == null");
        }
        this.f101107g = c5448n;
        P31 m87374a = R31.m87374a(c5448n);
        int m78614h = WH6.m78614h(m87374a);
        this.f101102b = m78614h;
        this.f101103c = 16;
        int ceil = (int) Math.ceil((m78614h * 8) / WH6.m78607o(16));
        this.f101105e = ceil;
        int floor = ((int) Math.floor(WH6.m78607o((16 - 1) * ceil) / WH6.m78607o(16))) + 1;
        this.f101106f = floor;
        int i = ceil + floor;
        this.f101104d = i;
        C45390mw6 m24688c = C45390mw6.m24688c(m87374a.mo15579d(), m78614h, 16, i);
        this.f101101a = m24688c;
        if (m24688c != null) {
            return;
        }
        throw new IllegalArgumentException("cannot find OID for digest algorithm: " + m87374a.mo15579d());
    }

    /* renamed from: a */
    public int m22162a() {
        return this.f101104d;
    }

    /* renamed from: b */
    public C5448N m22161b() {
        return this.f101107g;
    }

    /* renamed from: c */
    public int m22160c() {
        return this.f101102b;
    }

    /* renamed from: d */
    public int m22159d() {
        return this.f101103c;
    }
}
