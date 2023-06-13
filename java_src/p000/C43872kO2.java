package p000;
/* renamed from: kO2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C43872kO2 extends C42686iO2 {

    /* renamed from: d */
    public int f94317d;

    /* renamed from: e */
    public int f94318e;

    /* renamed from: f */
    public PA1 f94319f;

    /* renamed from: g */
    public TX3 f94320g;

    /* renamed from: h */
    public C42121hR3 f94321h;

    /* renamed from: i */
    public OA1 f94322i;

    /* renamed from: j */
    public TX3[] f94323j;

    public C43872kO2(int i, int i2, PA1 pa1, TX3 tx3, OA1 oa1, C42121hR3 c42121hR3, String str) {
        super(true, str);
        this.f94317d = i;
        this.f94318e = i2;
        this.f94319f = pa1;
        this.f94320g = tx3;
        this.f94322i = oa1;
        this.f94321h = c42121hR3;
        this.f94323j = new VX3(pa1, tx3).m79821c();
    }

    /* renamed from: b */
    public PA1 m29030b() {
        return this.f94319f;
    }

    /* renamed from: c */
    public TX3 m29029c() {
        return this.f94320g;
    }

    /* renamed from: d */
    public OA1 m29028d() {
        return this.f94322i;
    }

    /* renamed from: e */
    public int m29027e() {
        return this.f94318e;
    }

    /* renamed from: f */
    public int m29026f() {
        return this.f94317d;
    }

    /* renamed from: g */
    public C42121hR3 m29025g() {
        return this.f94321h;
    }

    public C43872kO2(int i, int i2, PA1 pa1, TX3 tx3, C42121hR3 c42121hR3, String str) {
        this(i, i2, pa1, tx3, FD1.m107435a(pa1, tx3), c42121hR3, str);
    }
}
