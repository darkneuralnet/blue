package p000;
/* renamed from: Tl0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36158Tl0 {

    /* renamed from: a */
    public final int f36022a;

    /* renamed from: b */
    public final int f36023b;

    /* renamed from: c */
    public final int f36024c;

    /* renamed from: d */
    public final int f36025d;

    /* renamed from: e */
    public int f36026e = -1;

    public C36158Tl0(int i, int i2, int i3, int i4) {
        this.f36022a = i;
        this.f36023b = i2;
        this.f36024c = i3;
        this.f36025d = i4;
    }

    /* renamed from: a */
    public int m83013a() {
        return this.f36024c;
    }

    /* renamed from: b */
    public int m83012b() {
        return this.f36023b;
    }

    /* renamed from: c */
    public int m83011c() {
        return this.f36026e;
    }

    /* renamed from: d */
    public int m83010d() {
        return this.f36022a;
    }

    /* renamed from: e */
    public int m83009e() {
        return this.f36025d;
    }

    /* renamed from: f */
    public int m83008f() {
        return this.f36023b - this.f36022a;
    }

    /* renamed from: g */
    public boolean m83007g() {
        return m83006h(this.f36026e);
    }

    /* renamed from: h */
    public boolean m83006h(int i) {
        return i != -1 && this.f36024c == (i % 3) * 3;
    }

    /* renamed from: i */
    public void m83005i(int i) {
        this.f36026e = i;
    }

    /* renamed from: j */
    public void m83004j() {
        this.f36026e = ((this.f36025d / 30) * 3) + (this.f36024c / 3);
    }

    public String toString() {
        return this.f36026e + "|" + this.f36025d;
    }
}
