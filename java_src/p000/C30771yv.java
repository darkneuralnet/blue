package p000;

import java.io.Serializable;
import java.util.Stack;
import p000.C32813Fd3;
import p000.C35458Ql2;
import p000.C49144tH1;
/* renamed from: yv */
/* loaded from: classes8.dex */
public class C30771yv implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    public OH6 f120394b;

    /* renamed from: c */
    public final int f120395c;

    /* renamed from: d */
    public int f120396d;

    /* renamed from: e */
    public int f120397e;

    /* renamed from: f */
    public boolean f120398f = false;

    /* renamed from: g */
    public boolean f120399g = false;

    public C30771yv(int i) {
        this.f120395c = i;
    }

    /* renamed from: d */
    public C30771yv clone() {
        C30771yv c30771yv = new C30771yv(this.f120395c);
        c30771yv.f120394b = this.f120394b;
        c30771yv.f120396d = this.f120396d;
        c30771yv.f120397e = this.f120397e;
        c30771yv.f120398f = this.f120398f;
        c30771yv.f120399g = this.f120399g;
        return c30771yv;
    }

    /* renamed from: e */
    public int m2298e() {
        if (!this.f120398f || this.f120399g) {
            return Integer.MAX_VALUE;
        }
        return this.f120396d;
    }

    /* renamed from: f */
    public int m2297f() {
        return this.f120397e;
    }

    /* renamed from: g */
    public OH6 m2296g() {
        return this.f120394b;
    }

    /* renamed from: h */
    public void m2295h(int i) {
        this.f120394b = null;
        this.f120396d = this.f120395c;
        this.f120397e = i;
        this.f120398f = true;
        this.f120399g = false;
    }

    /* renamed from: j */
    public boolean m2294j() {
        return this.f120399g;
    }

    /* renamed from: k */
    public boolean m2293k() {
        return this.f120398f;
    }

    /* renamed from: l */
    public void m2292l(OH6 oh6) {
        this.f120394b = oh6;
        int m92565a = oh6.m92565a();
        this.f120396d = m92565a;
        if (m92565a == this.f120395c) {
            this.f120399g = true;
        }
    }

    /* renamed from: m */
    public void m2291m(Stack<OH6> stack, C44797lw6 c44797lw6, byte[] bArr, byte[] bArr2, C32813Fd3 c32813Fd3) {
        if (c32813Fd3 == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.f120399g || !this.f120398f) {
            throw new IllegalStateException("finished or not initialized");
        }
        C32813Fd3 c32813Fd32 = (C32813Fd3) new C32813Fd3.C2372b().m112393g(c32813Fd3.m112400b()).m112392h(c32813Fd3.m112399c()).m106839p(this.f120397e).m106841n(c32813Fd3.m106849e()).m106840o(c32813Fd3.m106848f()).m112394f(c32813Fd3.m112401a()).m106843l();
        C49144tH1 c49144tH1 = (C49144tH1) new C49144tH1.C28670b().m112393g(c32813Fd32.m112400b()).m112392h(c32813Fd32.m112399c()).m12538n(this.f120397e).m12541k();
        c44797lw6.m26610h(c44797lw6.m26611g(bArr2, c32813Fd32), bArr);
        OH6 m90508a = PH6.m90508a(c44797lw6, c44797lw6.m26613e(c32813Fd32), (C35458Ql2) new C35458Ql2.C6861b().m112393g(c32813Fd32.m112400b()).m112392h(c32813Fd32.m112399c()).m88078n(this.f120397e).m88080l());
        while (!stack.isEmpty() && stack.peek().m92565a() == m90508a.m92565a() && stack.peek().m92565a() != this.f120395c) {
            C49144tH1 c49144tH12 = (C49144tH1) new C49144tH1.C28670b().m112393g(c49144tH1.m112400b()).m112392h(c49144tH1.m112399c()).m12539m(c49144tH1.m12546e()).m12538n((c49144tH1.m12545f() - 1) / 2).m112394f(c49144tH1.m112401a()).m12541k();
            OH6 m90507b = PH6.m90507b(c44797lw6, stack.pop(), m90508a, c49144tH12);
            OH6 oh6 = new OH6(m90507b.m92565a() + 1, m90507b.m92564b());
            c49144tH1 = (C49144tH1) new C49144tH1.C28670b().m112393g(c49144tH12.m112400b()).m112392h(c49144tH12.m112399c()).m12539m(c49144tH12.m12546e() + 1).m12538n(c49144tH12.m12545f()).m112394f(c49144tH12.m112401a()).m12541k();
            m90508a = oh6;
        }
        OH6 oh62 = this.f120394b;
        if (oh62 == null) {
            this.f120394b = m90508a;
        } else if (oh62.m92565a() == m90508a.m92565a()) {
            C49144tH1 c49144tH13 = (C49144tH1) new C49144tH1.C28670b().m112393g(c49144tH1.m112400b()).m112392h(c49144tH1.m112399c()).m12539m(c49144tH1.m12546e()).m12538n((c49144tH1.m12545f() - 1) / 2).m112394f(c49144tH1.m112401a()).m12541k();
            m90508a = new OH6(this.f120394b.m92565a() + 1, PH6.m90507b(c44797lw6, this.f120394b, m90508a, c49144tH13).m92564b());
            this.f120394b = m90508a;
            C49144tH1 c49144tH14 = (C49144tH1) new C49144tH1.C28670b().m112393g(c49144tH13.m112400b()).m112392h(c49144tH13.m112399c()).m12539m(c49144tH13.m12546e() + 1).m12538n(c49144tH13.m12545f()).m112394f(c49144tH13.m112401a()).m12541k();
        } else {
            stack.push(m90508a);
        }
        if (this.f120394b.m92565a() == this.f120395c) {
            this.f120399g = true;
            return;
        }
        this.f120396d = m90508a.m92565a();
        this.f120397e++;
    }
}
