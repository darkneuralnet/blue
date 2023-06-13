package p000;

import p000.AbstractC37749a52;
/* renamed from: It */
/* loaded from: classes6.dex */
public final class C3788It extends AbstractC37749a52 {

    /* renamed from: a */
    public final String f16375a;

    /* renamed from: b */
    public final long f16376b;

    /* renamed from: c */
    public final long f16377c;

    /* renamed from: It$b */
    /* loaded from: classes6.dex */
    public static final class C3790b extends AbstractC37749a52.AbstractC10569a {

        /* renamed from: a */
        public String f16378a;

        /* renamed from: b */
        public Long f16379b;

        /* renamed from: c */
        public Long f16380c;

        @Override // p000.AbstractC37749a52.AbstractC10569a
        /* renamed from: a */
        public AbstractC37749a52 mo71911a() {
            String str = "";
            if (this.f16378a == null) {
                str = " token";
            }
            if (this.f16379b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f16380c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C3788It(this.f16378a, this.f16379b.longValue(), this.f16380c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p000.AbstractC37749a52.AbstractC10569a
        /* renamed from: b */
        public AbstractC37749a52.AbstractC10569a mo71910b(String str) {
            if (str != null) {
                this.f16378a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // p000.AbstractC37749a52.AbstractC10569a
        /* renamed from: c */
        public AbstractC37749a52.AbstractC10569a mo71909c(long j) {
            this.f16380c = Long.valueOf(j);
            return this;
        }

        @Override // p000.AbstractC37749a52.AbstractC10569a
        /* renamed from: d */
        public AbstractC37749a52.AbstractC10569a mo71908d(long j) {
            this.f16379b = Long.valueOf(j);
            return this;
        }
    }

    @Override // p000.AbstractC37749a52
    /* renamed from: b */
    public String mo71914b() {
        return this.f16375a;
    }

    @Override // p000.AbstractC37749a52
    /* renamed from: c */
    public long mo71913c() {
        return this.f16377c;
    }

    @Override // p000.AbstractC37749a52
    /* renamed from: d */
    public long mo71912d() {
        return this.f16376b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC37749a52)) {
            return false;
        }
        AbstractC37749a52 abstractC37749a52 = (AbstractC37749a52) obj;
        if (this.f16375a.equals(abstractC37749a52.mo71914b()) && this.f16376b == abstractC37749a52.mo71912d() && this.f16377c == abstractC37749a52.mo71913c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f16376b;
        long j2 = this.f16377c;
        return ((((this.f16375a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f16375a + ", tokenExpirationTimestamp=" + this.f16376b + ", tokenCreationTimestamp=" + this.f16377c + "}";
    }

    public C3788It(String str, long j, long j2) {
        this.f16375a = str;
        this.f16376b = j;
        this.f16377c = j2;
    }
}
