package p000;

import p000.CH6;
/* renamed from: Fd3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C32813Fd3 extends CH6 {

    /* renamed from: e */
    public final int f9840e;

    /* renamed from: f */
    public final int f9841f;

    /* renamed from: g */
    public final int f9842g;

    /* renamed from: Fd3$b */
    /* loaded from: classes8.dex */
    public static class C2372b extends CH6.AbstractC1008a<C2372b> {

        /* renamed from: e */
        public int f9843e;

        /* renamed from: f */
        public int f9844f;

        /* renamed from: g */
        public int f9845g;

        public C2372b() {
            super(0);
            this.f9843e = 0;
            this.f9844f = 0;
            this.f9845g = 0;
        }

        /* renamed from: l */
        public CH6 m106843l() {
            return new C32813Fd3(this);
        }

        @Override // p000.CH6.AbstractC1008a
        /* renamed from: m */
        public C2372b mo12544e() {
            return this;
        }

        /* renamed from: n */
        public C2372b m106841n(int i) {
            this.f9844f = i;
            return this;
        }

        /* renamed from: o */
        public C2372b m106840o(int i) {
            this.f9845g = i;
            return this;
        }

        /* renamed from: p */
        public C2372b m106839p(int i) {
            this.f9843e = i;
            return this;
        }
    }

    public C32813Fd3(C2372b c2372b) {
        super(c2372b);
        this.f9840e = c2372b.f9843e;
        this.f9841f = c2372b.f9844f;
        this.f9842g = c2372b.f9845g;
    }

    @Override // p000.CH6
    /* renamed from: d */
    public byte[] mo12547d() {
        byte[] mo12547d = super.mo12547d();
        DD3.m110680d(this.f9840e, mo12547d, 16);
        DD3.m110680d(this.f9841f, mo12547d, 20);
        DD3.m110680d(this.f9842g, mo12547d, 24);
        return mo12547d;
    }

    /* renamed from: e */
    public int m106849e() {
        return this.f9841f;
    }

    /* renamed from: f */
    public int m106848f() {
        return this.f9842g;
    }

    /* renamed from: g */
    public int m106847g() {
        return this.f9840e;
    }
}
