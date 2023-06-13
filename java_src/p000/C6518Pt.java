package p000;

import p000.AbstractC45112mU2;
/* renamed from: Pt */
/* loaded from: classes.dex */
public final class C6518Pt extends AbstractC45112mU2 {

    /* renamed from: a */
    public final String f29213a;

    /* renamed from: b */
    public final int f29214b;

    /* renamed from: c */
    public final AbstractC52434yp6 f29215c;

    /* renamed from: Pt$b */
    /* loaded from: classes.dex */
    public static final class C6520b extends AbstractC45112mU2.AbstractC26107a {

        /* renamed from: a */
        public String f29216a;

        /* renamed from: b */
        public Integer f29217b;

        /* renamed from: c */
        public AbstractC52434yp6 f29218c;

        @Override // p000.AbstractC45112mU2.AbstractC26107a
        /* renamed from: a */
        public AbstractC45112mU2 mo25527a() {
            String str = "";
            if (this.f29216a == null) {
                str = " mimeType";
            }
            if (this.f29217b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new C6518Pt(this.f29216a, this.f29217b.intValue(), this.f29218c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC45112mU2.AbstractC26107a
        /* renamed from: b */
        public AbstractC45112mU2.AbstractC26107a mo25526b(AbstractC52434yp6 abstractC52434yp6) {
            this.f29218c = abstractC52434yp6;
            return this;
        }

        @Override // p000.AbstractC45112mU2.AbstractC26107a
        /* renamed from: c */
        public AbstractC45112mU2.AbstractC26107a mo25525c(int i) {
            this.f29217b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: d */
        public AbstractC45112mU2.AbstractC26107a m89654d(String str) {
            if (str != null) {
                this.f29216a = str;
                return this;
            }
            throw new NullPointerException("Null mimeType");
        }
    }

    @Override // p000.AbstractC45112mU2
    /* renamed from: b */
    public AbstractC52434yp6 mo25530b() {
        return this.f29215c;
    }

    @Override // p000.AbstractC45112mU2
    /* renamed from: c */
    public String mo25529c() {
        return this.f29213a;
    }

    @Override // p000.AbstractC45112mU2
    /* renamed from: d */
    public int mo25528d() {
        return this.f29214b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC45112mU2)) {
            return false;
        }
        AbstractC45112mU2 abstractC45112mU2 = (AbstractC45112mU2) obj;
        if (this.f29213a.equals(abstractC45112mU2.mo25529c()) && this.f29214b == abstractC45112mU2.mo25528d()) {
            AbstractC52434yp6 abstractC52434yp6 = this.f29215c;
            if (abstractC52434yp6 == null) {
                if (abstractC45112mU2.mo25530b() == null) {
                    return true;
                }
            } else if (abstractC52434yp6.equals(abstractC45112mU2.mo25530b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f29213a.hashCode() ^ 1000003) * 1000003) ^ this.f29214b) * 1000003;
        AbstractC52434yp6 abstractC52434yp6 = this.f29215c;
        if (abstractC52434yp6 == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC52434yp6.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "MimeInfo{mimeType=" + this.f29213a + ", profile=" + this.f29214b + ", compatibleEncoderProfiles=" + this.f29215c + "}";
    }

    public C6518Pt(String str, int i, AbstractC52434yp6 abstractC52434yp6) {
        this.f29213a = str;
        this.f29214b = i;
        this.f29215c = abstractC52434yp6;
    }
}
