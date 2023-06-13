package p000;

import p000.CH6;
/* renamed from: Ql2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35458Ql2 extends CH6 {

    /* renamed from: e */
    public final int f30844e;

    /* renamed from: f */
    public final int f30845f;

    /* renamed from: g */
    public final int f30846g;

    /* renamed from: Ql2$b */
    /* loaded from: classes8.dex */
    public static class C6861b extends CH6.AbstractC1008a<C6861b> {

        /* renamed from: e */
        public int f30847e;

        /* renamed from: f */
        public int f30848f;

        /* renamed from: g */
        public int f30849g;

        public C6861b() {
            super(1);
            this.f30847e = 0;
            this.f30848f = 0;
            this.f30849g = 0;
        }

        /* renamed from: l */
        public CH6 m88080l() {
            return new C35458Ql2(this);
        }

        @Override // p000.CH6.AbstractC1008a
        /* renamed from: m */
        public C6861b mo12544e() {
            return this;
        }

        /* renamed from: n */
        public C6861b m88078n(int i) {
            this.f30847e = i;
            return this;
        }

        /* renamed from: o */
        public C6861b m88077o(int i) {
            this.f30848f = i;
            return this;
        }

        /* renamed from: p */
        public C6861b m88076p(int i) {
            this.f30849g = i;
            return this;
        }
    }

    public C35458Ql2(C6861b c6861b) {
        super(c6861b);
        this.f30844e = c6861b.f30847e;
        this.f30845f = c6861b.f30848f;
        this.f30846g = c6861b.f30849g;
    }

    @Override // p000.CH6
    /* renamed from: d */
    public byte[] mo12547d() {
        byte[] mo12547d = super.mo12547d();
        DD3.m110680d(this.f30844e, mo12547d, 16);
        DD3.m110680d(this.f30845f, mo12547d, 20);
        DD3.m110680d(this.f30846g, mo12547d, 24);
        return mo12547d;
    }

    /* renamed from: e */
    public int m88086e() {
        return this.f30844e;
    }

    /* renamed from: f */
    public int m88085f() {
        return this.f30845f;
    }

    /* renamed from: g */
    public int m88084g() {
        return this.f30846g;
    }
}
