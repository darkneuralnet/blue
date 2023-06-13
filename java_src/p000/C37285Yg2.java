package p000;
/* renamed from: Yg2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37285Yg2 {

    /* renamed from: a */
    public final C38696bh2 f46277a;

    /* renamed from: b */
    public final C3824Iy f46278b;

    /* renamed from: c */
    public final C3824Iy f46279c;

    /* renamed from: d */
    public final C3824Iy f46280d;

    /* renamed from: e */
    public final C3824Iy f46281e;

    public C37285Yg2(C38696bh2 c38696bh2, C3824Iy c3824Iy, C3824Iy c3824Iy2, C3824Iy c3824Iy3, C3824Iy c3824Iy4) {
        this.f46277a = c38696bh2;
        this.f46278b = c3824Iy;
        this.f46279c = c3824Iy2;
        if (c3824Iy3 != null) {
            this.f46280d = c3824Iy3;
            this.f46281e = c3824Iy4;
            return;
        }
        throw new IllegalArgumentException("The cipher text must not be null");
    }

    /* renamed from: a */
    public C3824Iy m74471a() {
        return this.f46281e;
    }

    /* renamed from: b */
    public C3824Iy m74470b() {
        return this.f46280d;
    }

    /* renamed from: c */
    public C3824Iy m74469c() {
        return this.f46278b;
    }

    /* renamed from: d */
    public C38696bh2 m74468d() {
        return this.f46277a;
    }

    /* renamed from: e */
    public C3824Iy m74467e() {
        return this.f46279c;
    }
}
