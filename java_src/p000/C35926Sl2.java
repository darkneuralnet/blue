package p000;
/* renamed from: Sl2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C35926Sl2 {

    /* renamed from: a */
    public Q56[] f34231a;

    public C35926Sl2(int i) {
        Q56[] q56Arr = new Q56[2];
        this.f34231a = q56Arr;
        q56Arr[0] = new Q56(i);
        this.f34231a[1] = new Q56(i);
    }

    /* renamed from: q */
    public static C35926Sl2 m84861q(C35926Sl2 c35926Sl2) {
        C35926Sl2 c35926Sl22 = new C35926Sl2(-1);
        for (int i = 0; i < 2; i++) {
            c35926Sl22.m84864n(i, c35926Sl2.m84874d(i));
        }
        return c35926Sl22;
    }

    /* renamed from: a */
    public boolean m84877a(int i, int i2) {
        return this.f34231a[i].m88936a(i2);
    }

    /* renamed from: b */
    public void m84876b() {
        this.f34231a[0].m88935b();
        this.f34231a[1].m88935b();
    }

    /* renamed from: c */
    public int m84875c() {
        int i = !this.f34231a[0].m88929h();
        if (!this.f34231a[1].m88929h()) {
            return i + 1;
        }
        return i;
    }

    /* renamed from: d */
    public int m84874d(int i) {
        return this.f34231a[i].m88934c(0);
    }

    /* renamed from: e */
    public int m84873e(int i, int i2) {
        return this.f34231a[i].m88934c(i2);
    }

    /* renamed from: f */
    public boolean m84872f(int i) {
        return this.f34231a[i].m88932e();
    }

    /* renamed from: g */
    public boolean m84871g() {
        return this.f34231a[0].m88931f() || this.f34231a[1].m88931f();
    }

    /* renamed from: h */
    public boolean m84870h(int i) {
        return this.f34231a[i].m88931f();
    }

    /* renamed from: i */
    public boolean m84869i(int i) {
        return this.f34231a[i].m88930g();
    }

    /* renamed from: j */
    public boolean m84868j(int i) {
        return this.f34231a[i].m88929h();
    }

    /* renamed from: k */
    public void m84867k(C35926Sl2 c35926Sl2) {
        Q56 q56;
        for (int i = 0; i < 2; i++) {
            Q56[] q56Arr = this.f34231a;
            Q56 q562 = q56Arr[i];
            if (q562 == null && (q56 = c35926Sl2.f34231a[i]) != null) {
                q56Arr[i] = new Q56(q56);
            } else {
                q562.m88928i(c35926Sl2.f34231a[i]);
            }
        }
    }

    /* renamed from: l */
    public void m84866l(int i, int i2) {
        this.f34231a[i].m88927j(i2);
    }

    /* renamed from: m */
    public void m84865m(int i, int i2) {
        this.f34231a[i].m88926k(i2);
    }

    /* renamed from: n */
    public void m84864n(int i, int i2) {
        this.f34231a[i].m88924m(0, i2);
    }

    /* renamed from: o */
    public void m84863o(int i, int i2, int i3) {
        this.f34231a[i].m88924m(i2, i3);
    }

    /* renamed from: p */
    public void m84862p(int i) {
        if (this.f34231a[i].m88931f()) {
            Q56[] q56Arr = this.f34231a;
            q56Arr[i] = new Q56(q56Arr[i].f29821a[0]);
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.f34231a[0] != null) {
            stringBuffer.append("A:");
            stringBuffer.append(this.f34231a[0].toString());
        }
        if (this.f34231a[1] != null) {
            stringBuffer.append(" B:");
            stringBuffer.append(this.f34231a[1].toString());
        }
        return stringBuffer.toString();
    }

    public C35926Sl2(int i, int i2) {
        Q56[] q56Arr = new Q56[2];
        this.f34231a = q56Arr;
        q56Arr[0] = new Q56(-1);
        this.f34231a[1] = new Q56(-1);
        this.f34231a[i].m88925l(i2);
    }

    public C35926Sl2(int i, int i2, int i3) {
        Q56[] q56Arr = new Q56[2];
        this.f34231a = q56Arr;
        q56Arr[0] = new Q56(i, i2, i3);
        this.f34231a[1] = new Q56(i, i2, i3);
    }

    public C35926Sl2(int i, int i2, int i3, int i4) {
        Q56[] q56Arr = new Q56[2];
        this.f34231a = q56Arr;
        q56Arr[0] = new Q56(-1, -1, -1);
        this.f34231a[1] = new Q56(-1, -1, -1);
        this.f34231a[i].m88923n(i2, i3, i4);
    }

    public C35926Sl2(C35926Sl2 c35926Sl2) {
        Q56[] q56Arr = new Q56[2];
        this.f34231a = q56Arr;
        q56Arr[0] = new Q56(c35926Sl2.f34231a[0]);
        this.f34231a[1] = new Q56(c35926Sl2.f34231a[1]);
    }
}
