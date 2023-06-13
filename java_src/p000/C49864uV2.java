package p000;
/* renamed from: uV2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49864uV2 extends AbstractC49271tV2 {

    /* renamed from: c */
    public final C52849zX5 f112476c;

    /* renamed from: d */
    public final int f112477d;

    /* renamed from: e */
    public final int f112478e;

    /* renamed from: f */
    public final int f112479f;

    /* renamed from: g */
    public int f112480g;

    /* renamed from: h */
    public final O70 f112481h;

    /* renamed from: i */
    public int f112482i;

    /* renamed from: j */
    public final O70 f112483j;

    /* renamed from: k */
    public int f112484k;

    /* renamed from: l */
    public final O70 f112485l;

    /* renamed from: m */
    public int f112486m;

    /* renamed from: n */
    public final O70 f112487n;

    /* renamed from: o */
    public int f112488o;

    /* renamed from: p */
    public final O70 f112489p;

    /* renamed from: q */
    public int f112490q;

    /* renamed from: r */
    public final O70 f112491r;

    /* renamed from: s */
    public int f112492s;

    public C49864uV2(C52849zX5 c52849zX5, int i, int i2, int i3) {
        super(589824);
        this.f112476c = c52849zX5;
        this.f112477d = i;
        this.f112478e = i2;
        this.f112479f = i3;
        this.f112481h = new O70();
        this.f112483j = new O70();
        this.f112485l = new O70();
        this.f112487n = new O70();
        this.f112489p = new O70();
        this.f112491r = new O70();
    }

    @Override // p000.AbstractC49271tV2
    /* renamed from: a */
    public void mo10221a() {
    }

    @Override // p000.AbstractC49271tV2
    /* renamed from: b */
    public void mo10220b(String str, int i, String... strArr) {
        this.f112483j.m92888k(this.f112476c.m1243B(str).f114226a).m92888k(i);
        if (strArr == null) {
            this.f112483j.m92888k(0);
        } else {
            this.f112483j.m92888k(strArr.length);
            for (String str2 : strArr) {
                this.f112483j.m92888k(this.f112476c.m1188y(str2).f114226a);
            }
        }
        this.f112482i++;
    }

    @Override // p000.AbstractC49271tV2
    /* renamed from: c */
    public void mo10219c(String str) {
        this.f112492s = this.f112476c.m1210e(str).f114226a;
    }

    @Override // p000.AbstractC49271tV2
    /* renamed from: d */
    public void mo10218d(String str, int i, String... strArr) {
        this.f112485l.m92888k(this.f112476c.m1243B(str).f114226a).m92888k(i);
        if (strArr == null) {
            this.f112485l.m92888k(0);
        } else {
            this.f112485l.m92888k(strArr.length);
            for (String str2 : strArr) {
                this.f112485l.m92888k(this.f112476c.m1188y(str2).f114226a);
            }
        }
        this.f112484k++;
    }

    @Override // p000.AbstractC49271tV2
    /* renamed from: e */
    public void mo10217e(String str) {
        this.f112491r.m92888k(this.f112476c.m1243B(str).f114226a);
        this.f112490q++;
    }

    @Override // p000.AbstractC49271tV2
    /* renamed from: f */
    public void mo10216f(String str, String... strArr) {
        this.f112489p.m92888k(this.f112476c.m1210e(str).f114226a);
        this.f112489p.m92888k(strArr.length);
        for (String str2 : strArr) {
            this.f112489p.m92888k(this.f112476c.m1210e(str2).f114226a);
        }
        this.f112488o++;
    }

    @Override // p000.AbstractC49271tV2
    /* renamed from: g */
    public void mo10215g(String str, int i, String str2) {
        int m1241D;
        O70 m92888k = this.f112481h.m92888k(this.f112476c.m1188y(str).f114226a).m92888k(i);
        if (str2 == null) {
            m1241D = 0;
        } else {
            m1241D = this.f112476c.m1241D(str2);
        }
        m92888k.m92888k(m1241D);
        this.f112480g++;
    }

    @Override // p000.AbstractC49271tV2
    /* renamed from: h */
    public void mo10214h(String str) {
        this.f112487n.m92888k(this.f112476c.m1210e(str).f114226a);
        this.f112486m++;
    }

    /* renamed from: i */
    public int m10213i() {
        this.f112476c.m1241D("Module");
        int i = this.f112481h.f25908b + 22 + this.f112483j.f25908b + this.f112485l.f25908b + this.f112487n.f25908b + this.f112489p.f25908b;
        if (this.f112490q > 0) {
            this.f112476c.m1241D("ModulePackages");
            i += this.f112491r.f25908b + 8;
        }
        if (this.f112492s > 0) {
            this.f112476c.m1241D("ModuleMainClass");
            return i + 8;
        }
        return i;
    }

    /* renamed from: j */
    public int m10212j() {
        return (this.f112490q > 0 ? 1 : 0) + 1 + (this.f112492s > 0 ? 1 : 0);
    }

    /* renamed from: k */
    public void m10211k(O70 o70) {
        O70 m92888k = o70.m92888k(this.f112476c.m1241D("Module")).m92890i(this.f112481h.f25908b + 16 + this.f112483j.f25908b + this.f112485l.f25908b + this.f112487n.f25908b + this.f112489p.f25908b).m92888k(this.f112477d).m92888k(this.f112478e).m92888k(this.f112479f).m92888k(this.f112480g);
        O70 o702 = this.f112481h;
        O70 m92888k2 = m92888k.m92891h(o702.f25907a, 0, o702.f25908b).m92888k(this.f112482i);
        O70 o703 = this.f112483j;
        O70 m92888k3 = m92888k2.m92891h(o703.f25907a, 0, o703.f25908b).m92888k(this.f112484k);
        O70 o704 = this.f112485l;
        O70 m92888k4 = m92888k3.m92891h(o704.f25907a, 0, o704.f25908b).m92888k(this.f112486m);
        O70 o705 = this.f112487n;
        O70 m92888k5 = m92888k4.m92891h(o705.f25907a, 0, o705.f25908b).m92888k(this.f112488o);
        O70 o706 = this.f112489p;
        m92888k5.m92891h(o706.f25907a, 0, o706.f25908b);
        if (this.f112490q > 0) {
            O70 m92888k6 = o70.m92888k(this.f112476c.m1241D("ModulePackages")).m92890i(this.f112491r.f25908b + 2).m92888k(this.f112490q);
            O70 o707 = this.f112491r;
            m92888k6.m92891h(o707.f25907a, 0, o707.f25908b);
        }
        if (this.f112492s > 0) {
            o70.m92888k(this.f112476c.m1241D("ModuleMainClass")).m92890i(2).m92888k(this.f112492s);
        }
    }
}
