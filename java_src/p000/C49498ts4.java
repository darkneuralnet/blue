package p000;

import p000.C28821tp;
/* renamed from: ts4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49498ts4 extends AbstractC48905ss4 {

    /* renamed from: c */
    public final C52849zX5 f111308c;

    /* renamed from: d */
    public final int f111309d;

    /* renamed from: e */
    public final int f111310e;

    /* renamed from: f */
    public int f111311f;

    /* renamed from: g */
    public C3725If f111312g;

    /* renamed from: h */
    public C3725If f111313h;

    /* renamed from: i */
    public C3725If f111314i;

    /* renamed from: j */
    public C3725If f111315j;

    /* renamed from: k */
    public C28821tp f111316k;

    public C49498ts4(C52849zX5 c52849zX5, String str, String str2, String str3) {
        super(589824);
        this.f111308c = c52849zX5;
        this.f111309d = c52849zX5.m1241D(str);
        this.f111310e = c52849zX5.m1241D(str2);
        if (str3 != null) {
            this.f111311f = c52849zX5.m1241D(str3);
        }
    }

    @Override // p000.AbstractC48905ss4
    /* renamed from: a */
    public AbstractC3201Hf mo11272a(String str, boolean z) {
        if (z) {
            C3725If m101833j = C3725If.m101833j(this.f111308c, str, this.f111312g);
            this.f111312g = m101833j;
            return m101833j;
        }
        C3725If m101833j2 = C3725If.m101833j(this.f111308c, str, this.f111313h);
        this.f111313h = m101833j2;
        return m101833j2;
    }

    @Override // p000.AbstractC48905ss4
    /* renamed from: b */
    public void mo11271b(C28821tp c28821tp) {
        c28821tp.f111062c = this.f111316k;
        this.f111316k = c28821tp;
    }

    @Override // p000.AbstractC48905ss4
    /* renamed from: c */
    public void mo11270c() {
    }

    @Override // p000.AbstractC48905ss4
    /* renamed from: d */
    public AbstractC3201Hf mo11269d(int i, C32330Db6 c32330Db6, String str, boolean z) {
        if (z) {
            C3725If m101834i = C3725If.m101834i(this.f111308c, i, c32330Db6, str, this.f111314i);
            this.f111314i = m101834i;
            return m101834i;
        }
        C3725If m101834i2 = C3725If.m101834i(this.f111308c, i, c32330Db6, str, this.f111315j);
        this.f111315j = m101834i2;
        return m101834i2;
    }

    /* renamed from: e */
    public final void m11268e(C28821tp.C28822a c28822a) {
        c28822a.m11733b(this.f111316k);
    }

    /* renamed from: f */
    public int m11267f() {
        int m11743b = C28821tp.m11743b(this.f111308c, 0, this.f111311f) + 6 + C3725If.m101837f(this.f111312g, this.f111313h, this.f111314i, this.f111315j);
        C28821tp c28821tp = this.f111316k;
        if (c28821tp != null) {
            return m11743b + c28821tp.m11744a(this.f111308c);
        }
        return m11743b;
    }

    /* renamed from: g */
    public void m11266g(O70 o70) {
        int i;
        o70.m92888k(this.f111309d).m92888k(this.f111310e);
        if (this.f111311f != 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (this.f111312g != null) {
            i++;
        }
        if (this.f111313h != null) {
            i++;
        }
        if (this.f111314i != null) {
            i++;
        }
        if (this.f111315j != null) {
            i++;
        }
        C28821tp c28821tp = this.f111316k;
        if (c28821tp != null) {
            i += c28821tp.m11741d();
        }
        o70.m92888k(i);
        C28821tp.m11739f(this.f111308c, 0, this.f111311f, o70);
        C3725If.m101831l(this.f111308c, this.f111312g, this.f111313h, this.f111314i, this.f111315j, o70);
        C28821tp c28821tp2 = this.f111316k;
        if (c28821tp2 != null) {
            c28821tp2.m11738g(this.f111308c, o70);
        }
    }
}
