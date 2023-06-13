package p000;

import android.util.Range;
import p000.AbstractC51248wp6;
/* renamed from: su */
/* loaded from: classes.dex */
public final class C28424su extends AbstractC51248wp6 {

    /* renamed from: d */
    public final C35613Rc4 f109462d;

    /* renamed from: e */
    public final Range<Integer> f109463e;

    /* renamed from: f */
    public final Range<Integer> f109464f;

    /* renamed from: g */
    public final int f109465g;

    /* renamed from: su$b */
    /* loaded from: classes.dex */
    public static final class C28426b extends AbstractC51248wp6.AbstractC29965a {

        /* renamed from: a */
        public C35613Rc4 f109466a;

        /* renamed from: b */
        public Range<Integer> f109467b;

        /* renamed from: c */
        public Range<Integer> f109468c;

        /* renamed from: d */
        public Integer f109469d;

        @Override // p000.AbstractC51248wp6.AbstractC29965a
        /* renamed from: a */
        public AbstractC51248wp6 mo6281a() {
            String str = "";
            if (this.f109466a == null) {
                str = " qualitySelector";
            }
            if (this.f109467b == null) {
                str = str + " frameRate";
            }
            if (this.f109468c == null) {
                str = str + " bitrate";
            }
            if (this.f109469d == null) {
                str = str + " aspectRatio";
            }
            if (str.isEmpty()) {
                return new C28424su(this.f109466a, this.f109467b, this.f109468c, this.f109469d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC51248wp6.AbstractC29965a
        /* renamed from: b */
        public AbstractC51248wp6.AbstractC29965a mo6280b(int i) {
            this.f109469d = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC51248wp6.AbstractC29965a
        /* renamed from: c */
        public AbstractC51248wp6.AbstractC29965a mo6279c(Range<Integer> range) {
            if (range != null) {
                this.f109468c = range;
                return this;
            }
            throw new NullPointerException("Null bitrate");
        }

        @Override // p000.AbstractC51248wp6.AbstractC29965a
        /* renamed from: d */
        public AbstractC51248wp6.AbstractC29965a mo6278d(Range<Integer> range) {
            if (range != null) {
                this.f109467b = range;
                return this;
            }
            throw new NullPointerException("Null frameRate");
        }

        @Override // p000.AbstractC51248wp6.AbstractC29965a
        /* renamed from: e */
        public AbstractC51248wp6.AbstractC29965a mo6277e(C35613Rc4 c35613Rc4) {
            if (c35613Rc4 != null) {
                this.f109466a = c35613Rc4;
                return this;
            }
            throw new NullPointerException("Null qualitySelector");
        }

        public C28426b() {
        }

        public C28426b(AbstractC51248wp6 abstractC51248wp6) {
            this.f109466a = abstractC51248wp6.mo6283e();
            this.f109467b = abstractC51248wp6.mo6284d();
            this.f109468c = abstractC51248wp6.mo6285c();
            this.f109469d = Integer.valueOf(abstractC51248wp6.mo6286b());
        }
    }

    @Override // p000.AbstractC51248wp6
    /* renamed from: b */
    public int mo6286b() {
        return this.f109465g;
    }

    @Override // p000.AbstractC51248wp6
    /* renamed from: c */
    public Range<Integer> mo6285c() {
        return this.f109464f;
    }

    @Override // p000.AbstractC51248wp6
    /* renamed from: d */
    public Range<Integer> mo6284d() {
        return this.f109463e;
    }

    @Override // p000.AbstractC51248wp6
    /* renamed from: e */
    public C35613Rc4 mo6283e() {
        return this.f109462d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC51248wp6)) {
            return false;
        }
        AbstractC51248wp6 abstractC51248wp6 = (AbstractC51248wp6) obj;
        if (this.f109462d.equals(abstractC51248wp6.mo6283e()) && this.f109463e.equals(abstractC51248wp6.mo6284d()) && this.f109464f.equals(abstractC51248wp6.mo6285c()) && this.f109465g == abstractC51248wp6.mo6286b()) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC51248wp6
    /* renamed from: f */
    public AbstractC51248wp6.AbstractC29965a mo6282f() {
        return new C28426b(this);
    }

    public int hashCode() {
        return ((((((this.f109462d.hashCode() ^ 1000003) * 1000003) ^ this.f109463e.hashCode()) * 1000003) ^ this.f109464f.hashCode()) * 1000003) ^ this.f109465g;
    }

    public String toString() {
        return "VideoSpec{qualitySelector=" + this.f109462d + ", frameRate=" + this.f109463e + ", bitrate=" + this.f109464f + ", aspectRatio=" + this.f109465g + "}";
    }

    public C28424su(C35613Rc4 c35613Rc4, Range<Integer> range, Range<Integer> range2, int i) {
        this.f109462d = c35613Rc4;
        this.f109463e = range;
        this.f109464f = range2;
        this.f109465g = i;
    }
}
