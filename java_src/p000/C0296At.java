package p000;

import p000.AbstractC35646Rg1;
/* renamed from: At */
/* loaded from: classes5.dex */
public final class C0296At extends AbstractC35646Rg1 {

    /* renamed from: b */
    public final long f1297b;

    /* renamed from: c */
    public final int f1298c;

    /* renamed from: d */
    public final int f1299d;

    /* renamed from: e */
    public final long f1300e;

    /* renamed from: f */
    public final int f1301f;

    /* renamed from: At$b */
    /* loaded from: classes5.dex */
    public static final class C0298b extends AbstractC35646Rg1.AbstractC7240a {

        /* renamed from: a */
        public Long f1302a;

        /* renamed from: b */
        public Integer f1303b;

        /* renamed from: c */
        public Integer f1304c;

        /* renamed from: d */
        public Long f1305d;

        /* renamed from: e */
        public Integer f1306e;

        @Override // p000.AbstractC35646Rg1.AbstractC7240a
        /* renamed from: a */
        public AbstractC35646Rg1 mo86457a() {
            String str = "";
            if (this.f1302a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f1303b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f1304c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f1305d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f1306e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C0296At(this.f1302a.longValue(), this.f1303b.intValue(), this.f1304c.intValue(), this.f1305d.longValue(), this.f1306e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC35646Rg1.AbstractC7240a
        /* renamed from: b */
        public AbstractC35646Rg1.AbstractC7240a mo86456b(int i) {
            this.f1304c = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC35646Rg1.AbstractC7240a
        /* renamed from: c */
        public AbstractC35646Rg1.AbstractC7240a mo86455c(long j) {
            this.f1305d = Long.valueOf(j);
            return this;
        }

        @Override // p000.AbstractC35646Rg1.AbstractC7240a
        /* renamed from: d */
        public AbstractC35646Rg1.AbstractC7240a mo86454d(int i) {
            this.f1303b = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC35646Rg1.AbstractC7240a
        /* renamed from: e */
        public AbstractC35646Rg1.AbstractC7240a mo86453e(int i) {
            this.f1306e = Integer.valueOf(i);
            return this;
        }

        @Override // p000.AbstractC35646Rg1.AbstractC7240a
        /* renamed from: f */
        public AbstractC35646Rg1.AbstractC7240a mo86452f(long j) {
            this.f1302a = Long.valueOf(j);
            return this;
        }
    }

    @Override // p000.AbstractC35646Rg1
    /* renamed from: b */
    public int mo86462b() {
        return this.f1299d;
    }

    @Override // p000.AbstractC35646Rg1
    /* renamed from: c */
    public long mo86461c() {
        return this.f1300e;
    }

    @Override // p000.AbstractC35646Rg1
    /* renamed from: d */
    public int mo86460d() {
        return this.f1298c;
    }

    @Override // p000.AbstractC35646Rg1
    /* renamed from: e */
    public int mo86459e() {
        return this.f1301f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC35646Rg1)) {
            return false;
        }
        AbstractC35646Rg1 abstractC35646Rg1 = (AbstractC35646Rg1) obj;
        if (this.f1297b == abstractC35646Rg1.mo86458f() && this.f1298c == abstractC35646Rg1.mo86460d() && this.f1299d == abstractC35646Rg1.mo86462b() && this.f1300e == abstractC35646Rg1.mo86461c() && this.f1301f == abstractC35646Rg1.mo86459e()) {
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC35646Rg1
    /* renamed from: f */
    public long mo86458f() {
        return this.f1297b;
    }

    public int hashCode() {
        long j = this.f1297b;
        long j2 = this.f1300e;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f1298c) * 1000003) ^ this.f1299d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f1301f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f1297b + ", loadBatchSize=" + this.f1298c + ", criticalSectionEnterTimeoutMs=" + this.f1299d + ", eventCleanUpAge=" + this.f1300e + ", maxBlobByteSizePerRow=" + this.f1301f + "}";
    }

    public C0296At(long j, int i, int i2, long j2, int i3) {
        this.f1297b = j;
        this.f1298c = i;
        this.f1299d = i2;
        this.f1300e = j2;
        this.f1301f = i3;
    }
}
