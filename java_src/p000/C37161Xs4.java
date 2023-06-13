package p000;
/* renamed from: Xs4  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C37161Xs4 {

    /* renamed from: a */
    public AbstractC48893sr2 f44111a = new C31861Bb5();

    /* renamed from: b */
    public C48772sf1 f44112b;

    /* renamed from: c */
    public C52053yB0 f44113c;

    /* renamed from: d */
    public C52053yB0 f44114d;

    /* renamed from: e */
    public C52053yB0 f44115e;

    /* renamed from: f */
    public C52053yB0 f44116f;

    public C37161Xs4(C48772sf1 c48772sf1) {
        this.f44112b = c48772sf1;
        this.f44113c = new C52053yB0(c48772sf1.m13869p(), c48772sf1.m13868q());
        this.f44114d = new C52053yB0(c48772sf1.m13871n(), c48772sf1.m13870o());
        this.f44115e = new C52053yB0(c48772sf1.m13869p(), c48772sf1.m13870o());
        this.f44116f = new C52053yB0(c48772sf1.m13871n(), c48772sf1.m13868q());
    }

    /* renamed from: a */
    public boolean m76181a(C52053yB0 c52053yB0, C52053yB0 c52053yB02) {
        boolean z;
        if (!this.f44112b.m13887K(new C48772sf1(c52053yB0, c52053yB02))) {
            return false;
        }
        if (this.f44112b.m13891E(c52053yB0) || this.f44112b.m13891E(c52053yB02)) {
            return true;
        }
        if (c52053yB0.compareTo(c52053yB02) <= 0) {
            c52053yB02 = c52053yB0;
            c52053yB0 = c52053yB02;
        }
        if (c52053yB0.f118923c > c52053yB02.f118923c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f44111a.m13587d(c52053yB02, c52053yB0, this.f44115e, this.f44116f);
        } else {
            this.f44111a.m13587d(c52053yB02, c52053yB0, this.f44113c, this.f44114d);
        }
        if (!this.f44111a.m13582i()) {
            return false;
        }
        return true;
    }
}
