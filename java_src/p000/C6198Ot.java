package p000;

import p000.FP2;
/* renamed from: Ot */
/* loaded from: classes.dex */
public final class C6198Ot extends FP2 {

    /* renamed from: a */
    public final AbstractC51248wp6 f27520a;

    /* renamed from: b */
    public final AbstractC2481Fp f27521b;

    /* renamed from: c */
    public final int f27522c;

    /* renamed from: Ot$b */
    /* loaded from: classes.dex */
    public static final class C6200b extends FP2.AbstractC2236a {

        /* renamed from: a */
        public AbstractC51248wp6 f27523a;

        /* renamed from: b */
        public AbstractC2481Fp f27524b;

        /* renamed from: c */
        public Integer f27525c;

        @Override // p000.FP2.AbstractC2236a
        /* renamed from: a */
        public FP2 mo91216a() {
            String str = "";
            if (this.f27523a == null) {
                str = " videoSpec";
            }
            if (this.f27524b == null) {
                str = str + " audioSpec";
            }
            if (this.f27525c == null) {
                str = str + " outputFormat";
            }
            if (str.isEmpty()) {
                return new C6198Ot(this.f27523a, this.f27524b, this.f27525c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.FP2.AbstractC2236a
        /* renamed from: c */
        public AbstractC51248wp6 mo91215c() {
            AbstractC51248wp6 abstractC51248wp6 = this.f27523a;
            if (abstractC51248wp6 != null) {
                return abstractC51248wp6;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        @Override // p000.FP2.AbstractC2236a
        /* renamed from: d */
        public FP2.AbstractC2236a mo91214d(AbstractC2481Fp abstractC2481Fp) {
            if (abstractC2481Fp != null) {
                this.f27524b = abstractC2481Fp;
                return this;
            }
            throw new NullPointerException("Null audioSpec");
        }

        @Override // p000.FP2.AbstractC2236a
        /* renamed from: e */
        public FP2.AbstractC2236a mo91213e(int i) {
            this.f27525c = Integer.valueOf(i);
            return this;
        }

        @Override // p000.FP2.AbstractC2236a
        /* renamed from: f */
        public FP2.AbstractC2236a mo91212f(AbstractC51248wp6 abstractC51248wp6) {
            if (abstractC51248wp6 != null) {
                this.f27523a = abstractC51248wp6;
                return this;
            }
            throw new NullPointerException("Null videoSpec");
        }

        public C6200b() {
        }

        public C6200b(FP2 fp2) {
            this.f27523a = fp2.mo91218d();
            this.f27524b = fp2.mo91220b();
            this.f27525c = Integer.valueOf(fp2.mo91219c());
        }
    }

    @Override // p000.FP2
    /* renamed from: b */
    public AbstractC2481Fp mo91220b() {
        return this.f27521b;
    }

    @Override // p000.FP2
    /* renamed from: c */
    public int mo91219c() {
        return this.f27522c;
    }

    @Override // p000.FP2
    /* renamed from: d */
    public AbstractC51248wp6 mo91218d() {
        return this.f27520a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FP2)) {
            return false;
        }
        FP2 fp2 = (FP2) obj;
        if (this.f27520a.equals(fp2.mo91218d()) && this.f27521b.equals(fp2.mo91220b()) && this.f27522c == fp2.mo91219c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f27520a.hashCode() ^ 1000003) * 1000003) ^ this.f27521b.hashCode()) * 1000003) ^ this.f27522c;
    }

    @Override // p000.FP2
    /* renamed from: i */
    public FP2.AbstractC2236a mo91217i() {
        return new C6200b(this);
    }

    public String toString() {
        return "MediaSpec{videoSpec=" + this.f27520a + ", audioSpec=" + this.f27521b + ", outputFormat=" + this.f27522c + "}";
    }

    public C6198Ot(AbstractC51248wp6 abstractC51248wp6, AbstractC2481Fp abstractC2481Fp, int i) {
        this.f27520a = abstractC51248wp6;
        this.f27521b = abstractC2481Fp;
        this.f27522c = i;
    }
}
