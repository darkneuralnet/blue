package p000;

import p000.AbstractC0749Bp;
/* renamed from: et */
/* loaded from: classes.dex */
public final class C20127et extends AbstractC0749Bp {

    /* renamed from: b */
    public final int f79045b;

    /* renamed from: c */
    public final int f79046c;

    /* renamed from: d */
    public final int f79047d;

    /* renamed from: e */
    public final int f79048e;

    /* renamed from: et$b */
    /* loaded from: classes.dex */
    public static final class C20129b extends AbstractC0749Bp.AbstractC0750a {

        /* renamed from: a */
        public Integer f79049a;

        /* renamed from: b */
        public Integer f79050b;

        /* renamed from: c */
        public Integer f79051c;

        /* renamed from: d */
        public Integer f79052d;

        @Override // p000.AbstractC0749Bp.AbstractC0750a
        /* renamed from: a */
        public AbstractC0749Bp mo42459a() {
            String str = "";
            if (this.f79049a == null) {
                str = " audioSource";
            }
            if (this.f79050b == null) {
                str = str + " sampleRate";
            }
            if (this.f79051c == null) {
                str = str + " channelCount";
            }
            if (this.f79052d == null) {
                str = str + " audioFormat";
            }
            if (str.isEmpty()) {
                return new C20127et(this.f79049a.intValue(), this.f79050b.intValue(), this.f79051c.intValue(), this.f79052d.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC0749Bp.AbstractC0750a
        /* renamed from: c */
        public AbstractC0749Bp.AbstractC0750a mo42458c(int i) {
            this.f79052d = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC0749Bp.AbstractC0750a
        /* renamed from: d */
        public AbstractC0749Bp.AbstractC0750a mo42457d(int i) {
            this.f79049a = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC0749Bp.AbstractC0750a
        /* renamed from: e */
        public AbstractC0749Bp.AbstractC0750a mo42456e(int i) {
            this.f79051c = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC0749Bp.AbstractC0750a
        /* renamed from: f */
        public AbstractC0749Bp.AbstractC0750a mo42455f(int i) {
            this.f79050b = Integer.valueOf(i);
            return this;
        }
    }

    @Override // p000.AbstractC0749Bp
    /* renamed from: b */
    public int mo42463b() {
        return this.f79048e;
    }

    @Override // p000.AbstractC0749Bp
    /* renamed from: c */
    public int mo42462c() {
        return this.f79045b;
    }

    @Override // p000.AbstractC0749Bp
    /* renamed from: d */
    public int mo42461d() {
        return this.f79047d;
    }

    @Override // p000.AbstractC0749Bp
    /* renamed from: e */
    public int mo42460e() {
        return this.f79046c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0749Bp)) {
            return false;
        }
        AbstractC0749Bp abstractC0749Bp = (AbstractC0749Bp) obj;
        if (this.f79045b == abstractC0749Bp.mo42462c() && this.f79046c == abstractC0749Bp.mo42460e() && this.f79047d == abstractC0749Bp.mo42461d() && this.f79048e == abstractC0749Bp.mo42463b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f79045b ^ 1000003) * 1000003) ^ this.f79046c) * 1000003) ^ this.f79047d) * 1000003) ^ this.f79048e;
    }

    public String toString() {
        return "AudioSettings{audioSource=" + this.f79045b + ", sampleRate=" + this.f79046c + ", channelCount=" + this.f79047d + ", audioFormat=" + this.f79048e + "}";
    }

    public C20127et(int i, int i2, int i3, int i4) {
        this.f79045b = i;
        this.f79046c = i2;
        this.f79047d = i3;
        this.f79048e = i4;
    }
}
