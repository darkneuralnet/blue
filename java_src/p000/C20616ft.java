package p000;

import android.util.Range;
import p000.AbstractC2481Fp;
/* renamed from: ft */
/* loaded from: classes.dex */
public final class C20616ft extends AbstractC2481Fp {

    /* renamed from: d */
    public final Range<Integer> f80991d;

    /* renamed from: e */
    public final int f80992e;

    /* renamed from: f */
    public final int f80993f;

    /* renamed from: g */
    public final Range<Integer> f80994g;

    /* renamed from: h */
    public final int f80995h;

    /* renamed from: ft$b */
    /* loaded from: classes.dex */
    public static final class C20618b extends AbstractC2481Fp.AbstractC2482a {

        /* renamed from: a */
        public Range<Integer> f80996a;

        /* renamed from: b */
        public Integer f80997b;

        /* renamed from: c */
        public Integer f80998c;

        /* renamed from: d */
        public Range<Integer> f80999d;

        /* renamed from: e */
        public Integer f81000e;

        @Override // p000.AbstractC2481Fp.AbstractC2482a
        /* renamed from: a */
        public AbstractC2481Fp mo40597a() {
            String str = "";
            if (this.f80996a == null) {
                str = " bitrate";
            }
            if (this.f80997b == null) {
                str = str + " sourceFormat";
            }
            if (this.f80998c == null) {
                str = str + " source";
            }
            if (this.f80999d == null) {
                str = str + " sampleRate";
            }
            if (this.f81000e == null) {
                str = str + " channelCount";
            }
            if (str.isEmpty()) {
                return new C20616ft(this.f80996a, this.f80997b.intValue(), this.f80998c.intValue(), this.f80999d, this.f81000e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC2481Fp.AbstractC2482a
        /* renamed from: b */
        public AbstractC2481Fp.AbstractC2482a mo40596b(Range<Integer> range) {
            if (range != null) {
                this.f80996a = range;
                return this;
            }
            throw new NullPointerException("Null bitrate");
        }

        @Override // p000.AbstractC2481Fp.AbstractC2482a
        /* renamed from: c */
        public AbstractC2481Fp.AbstractC2482a mo40595c(int i) {
            this.f81000e = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC2481Fp.AbstractC2482a
        /* renamed from: d */
        public AbstractC2481Fp.AbstractC2482a mo40594d(Range<Integer> range) {
            if (range != null) {
                this.f80999d = range;
                return this;
            }
            throw new NullPointerException("Null sampleRate");
        }

        @Override // p000.AbstractC2481Fp.AbstractC2482a
        /* renamed from: e */
        public AbstractC2481Fp.AbstractC2482a mo40593e(int i) {
            this.f80998c = Integer.valueOf(i);
            return this;
        }

        /* renamed from: f */
        public AbstractC2481Fp.AbstractC2482a m40592f(int i) {
            this.f80997b = Integer.valueOf(i);
            return this;
        }
    }

    @Override // p000.AbstractC2481Fp
    /* renamed from: b */
    public Range<Integer> mo40602b() {
        return this.f80991d;
    }

    @Override // p000.AbstractC2481Fp
    /* renamed from: c */
    public int mo40601c() {
        return this.f80995h;
    }

    @Override // p000.AbstractC2481Fp
    /* renamed from: d */
    public Range<Integer> mo40600d() {
        return this.f80994g;
    }

    @Override // p000.AbstractC2481Fp
    /* renamed from: e */
    public int mo40599e() {
        return this.f80993f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2481Fp)) {
            return false;
        }
        AbstractC2481Fp abstractC2481Fp = (AbstractC2481Fp) obj;
        if (this.f80991d.equals(abstractC2481Fp.mo40602b()) && this.f80992e == abstractC2481Fp.mo40598f() && this.f80993f == abstractC2481Fp.mo40599e() && this.f80994g.equals(abstractC2481Fp.mo40600d()) && this.f80995h == abstractC2481Fp.mo40601c()) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC2481Fp
    /* renamed from: f */
    public int mo40598f() {
        return this.f80992e;
    }

    public int hashCode() {
        return ((((((((this.f80991d.hashCode() ^ 1000003) * 1000003) ^ this.f80992e) * 1000003) ^ this.f80993f) * 1000003) ^ this.f80994g.hashCode()) * 1000003) ^ this.f80995h;
    }

    public String toString() {
        return "AudioSpec{bitrate=" + this.f80991d + ", sourceFormat=" + this.f80992e + ", source=" + this.f80993f + ", sampleRate=" + this.f80994g + ", channelCount=" + this.f80995h + "}";
    }

    public C20616ft(Range<Integer> range, int i, int i2, Range<Integer> range2, int i3) {
        this.f80991d = range;
        this.f80992e = i;
        this.f80993f = i2;
        this.f80994g = range2;
        this.f80995h = i3;
    }
}
