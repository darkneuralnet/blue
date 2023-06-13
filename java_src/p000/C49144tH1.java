package p000;

import p000.CH6;
/* renamed from: tH1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49144tH1 extends CH6 {

    /* renamed from: e */
    public final int f110238e;

    /* renamed from: f */
    public final int f110239f;

    /* renamed from: g */
    public final int f110240g;

    /* renamed from: tH1$b */
    /* loaded from: classes8.dex */
    public static class C28670b extends CH6.AbstractC1008a<C28670b> {

        /* renamed from: e */
        public int f110241e;

        /* renamed from: f */
        public int f110242f;

        public C28670b() {
            super(2);
            this.f110241e = 0;
            this.f110242f = 0;
        }

        /* renamed from: k */
        public CH6 m12541k() {
            return new C49144tH1(this);
        }

        @Override // p000.CH6.AbstractC1008a
        /* renamed from: l */
        public C28670b mo12544e() {
            return this;
        }

        /* renamed from: m */
        public C28670b m12539m(int i) {
            this.f110241e = i;
            return this;
        }

        /* renamed from: n */
        public C28670b m12538n(int i) {
            this.f110242f = i;
            return this;
        }
    }

    public C49144tH1(C28670b c28670b) {
        super(c28670b);
        this.f110238e = 0;
        this.f110239f = c28670b.f110241e;
        this.f110240g = c28670b.f110242f;
    }

    @Override // p000.CH6
    /* renamed from: d */
    public byte[] mo12547d() {
        byte[] mo12547d = super.mo12547d();
        DD3.m110680d(this.f110238e, mo12547d, 16);
        DD3.m110680d(this.f110239f, mo12547d, 20);
        DD3.m110680d(this.f110240g, mo12547d, 24);
        return mo12547d;
    }

    /* renamed from: e */
    public int m12546e() {
        return this.f110239f;
    }

    /* renamed from: f */
    public int m12545f() {
        return this.f110240g;
    }
}
