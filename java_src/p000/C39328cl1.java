package p000;

import p000.C28821tp;
/* renamed from: cl1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39328cl1 extends AbstractC38735bl1 {

    /* renamed from: c */
    public final C52849zX5 f61178c;

    /* renamed from: d */
    public final int f61179d;

    /* renamed from: e */
    public final int f61180e;

    /* renamed from: f */
    public final int f61181f;

    /* renamed from: g */
    public int f61182g;

    /* renamed from: h */
    public int f61183h;

    /* renamed from: i */
    public C3725If f61184i;

    /* renamed from: j */
    public C3725If f61185j;

    /* renamed from: k */
    public C3725If f61186k;

    /* renamed from: l */
    public C3725If f61187l;

    /* renamed from: m */
    public C28821tp f61188m;

    public C39328cl1(C52849zX5 c52849zX5, int i, String str, String str2, String str3, Object obj) {
        super(589824);
        this.f61178c = c52849zX5;
        this.f61179d = i;
        this.f61180e = c52849zX5.m1241D(str);
        this.f61181f = c52849zX5.m1241D(str2);
        if (str3 != null) {
            this.f61182g = c52849zX5.m1241D(str3);
        }
        if (obj != null) {
            this.f61183h = c52849zX5.m1212d(obj).f114226a;
        }
    }

    @Override // p000.AbstractC38735bl1
    /* renamed from: a */
    public AbstractC3201Hf mo60938a(String str, boolean z) {
        if (z) {
            C3725If m101833j = C3725If.m101833j(this.f61178c, str, this.f61184i);
            this.f61184i = m101833j;
            return m101833j;
        }
        C3725If m101833j2 = C3725If.m101833j(this.f61178c, str, this.f61185j);
        this.f61185j = m101833j2;
        return m101833j2;
    }

    @Override // p000.AbstractC38735bl1
    /* renamed from: b */
    public void mo60937b(C28821tp c28821tp) {
        c28821tp.f111062c = this.f61188m;
        this.f61188m = c28821tp;
    }

    @Override // p000.AbstractC38735bl1
    /* renamed from: c */
    public void mo60936c() {
    }

    @Override // p000.AbstractC38735bl1
    /* renamed from: d */
    public AbstractC3201Hf mo60935d(int i, C32330Db6 c32330Db6, String str, boolean z) {
        if (z) {
            C3725If m101834i = C3725If.m101834i(this.f61178c, i, c32330Db6, str, this.f61186k);
            this.f61186k = m101834i;
            return m101834i;
        }
        C3725If m101834i2 = C3725If.m101834i(this.f61178c, i, c32330Db6, str, this.f61187l);
        this.f61187l = m101834i2;
        return m101834i2;
    }

    /* renamed from: e */
    public final void m60934e(C28821tp.C28822a c28822a) {
        c28822a.m11733b(this.f61188m);
    }

    /* renamed from: f */
    public int m60933f() {
        int i;
        if (this.f61183h != 0) {
            this.f61178c.m1241D("ConstantValue");
            i = 16;
        } else {
            i = 8;
        }
        int m11743b = i + C28821tp.m11743b(this.f61178c, this.f61179d, this.f61182g) + C3725If.m101837f(this.f61184i, this.f61185j, this.f61186k, this.f61187l);
        C28821tp c28821tp = this.f61188m;
        if (c28821tp != null) {
            return m11743b + c28821tp.m11744a(this.f61178c);
        }
        return m11743b;
    }

    /* renamed from: g */
    public void m60932g(O70 o70) {
        boolean z;
        int i;
        int i2 = 0;
        if (this.f61178c.m1227R() < 49) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 4096;
        } else {
            i = 0;
        }
        o70.m92888k((~i) & this.f61179d).m92888k(this.f61180e).m92888k(this.f61181f);
        if (this.f61183h != 0) {
            i2 = 1;
        }
        int i3 = this.f61179d;
        if ((i3 & 4096) != 0 && z) {
            i2++;
        }
        if (this.f61182g != 0) {
            i2++;
        }
        if ((131072 & i3) != 0) {
            i2++;
        }
        if (this.f61184i != null) {
            i2++;
        }
        if (this.f61185j != null) {
            i2++;
        }
        if (this.f61186k != null) {
            i2++;
        }
        if (this.f61187l != null) {
            i2++;
        }
        C28821tp c28821tp = this.f61188m;
        if (c28821tp != null) {
            i2 += c28821tp.m11741d();
        }
        o70.m92888k(i2);
        if (this.f61183h != 0) {
            o70.m92888k(this.f61178c.m1241D("ConstantValue")).m92890i(2).m92888k(this.f61183h);
        }
        C28821tp.m11739f(this.f61178c, this.f61179d, this.f61182g, o70);
        C3725If.m101831l(this.f61178c, this.f61184i, this.f61185j, this.f61186k, this.f61187l, o70);
        C28821tp c28821tp2 = this.f61188m;
        if (c28821tp2 != null) {
            c28821tp2.m11738g(this.f61178c, o70);
        }
    }
}
