package p000;

import android.util.Rational;
/* renamed from: Es6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32717Es6 {

    /* renamed from: a */
    public int f8243a;

    /* renamed from: b */
    public Rational f8244b;

    /* renamed from: c */
    public int f8245c;

    /* renamed from: d */
    public int f8246d;

    /* renamed from: Es6$a */
    /* loaded from: classes.dex */
    public static final class C2010a {

        /* renamed from: b */
        public final Rational f8248b;

        /* renamed from: c */
        public final int f8249c;

        /* renamed from: a */
        public int f8247a = 1;

        /* renamed from: d */
        public int f8250d = 0;

        public C2010a(Rational rational, int i) {
            this.f8248b = rational;
            this.f8249c = i;
        }

        /* renamed from: a */
        public C32717Es6 m108271a() {
            HZ3.m103730h(this.f8248b, "The crop aspect ratio must be set.");
            return new C32717Es6(this.f8247a, this.f8248b, this.f8249c, this.f8250d);
        }

        /* renamed from: b */
        public C2010a m108270b(int i) {
            this.f8250d = i;
            return this;
        }

        /* renamed from: c */
        public C2010a m108269c(int i) {
            this.f8247a = i;
            return this;
        }
    }

    public C32717Es6(int i, Rational rational, int i2, int i3) {
        this.f8243a = i;
        this.f8244b = rational;
        this.f8245c = i2;
        this.f8246d = i3;
    }

    /* renamed from: a */
    public Rational m108275a() {
        return this.f8244b;
    }

    /* renamed from: b */
    public int m108274b() {
        return this.f8246d;
    }

    /* renamed from: c */
    public int m108273c() {
        return this.f8245c;
    }

    /* renamed from: d */
    public int m108272d() {
        return this.f8243a;
    }
}
