package p000;
/* renamed from: cF0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39028cF0 {

    /* renamed from: a */
    public int f60327a = 0;

    /* renamed from: b */
    public EnumC13481a f60328b = EnumC13481a.NUMERIC;

    /* renamed from: cF0$a */
    /* loaded from: classes6.dex */
    public enum EnumC13481a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* renamed from: a */
    public int m61639a() {
        return this.f60327a;
    }

    /* renamed from: b */
    public void m61638b(int i) {
        this.f60327a += i;
    }

    /* renamed from: c */
    public boolean m61637c() {
        return this.f60328b == EnumC13481a.ALPHA;
    }

    /* renamed from: d */
    public boolean m61636d() {
        return this.f60328b == EnumC13481a.ISO_IEC_646;
    }

    /* renamed from: e */
    public void m61635e() {
        this.f60328b = EnumC13481a.ALPHA;
    }

    /* renamed from: f */
    public void m61634f() {
        this.f60328b = EnumC13481a.ISO_IEC_646;
    }

    /* renamed from: g */
    public void m61633g() {
        this.f60328b = EnumC13481a.NUMERIC;
    }

    /* renamed from: h */
    public void m61632h(int i) {
        this.f60327a = i;
    }
}
