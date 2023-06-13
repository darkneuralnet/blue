package p000;
/* renamed from: q46  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C47248q46 {

    /* renamed from: c */
    public static final C47248q46 f104627c = new C27483a().m18236a();

    /* renamed from: a */
    public final long f104628a;

    /* renamed from: b */
    public final long f104629b;

    /* renamed from: q46$a */
    /* loaded from: classes5.dex */
    public static final class C27483a {

        /* renamed from: a */
        public long f104630a = 0;

        /* renamed from: b */
        public long f104631b = 0;

        /* renamed from: a */
        public C47248q46 m18236a() {
            return new C47248q46(this.f104630a, this.f104631b);
        }

        /* renamed from: b */
        public C27483a m18235b(long j) {
            this.f104631b = j;
            return this;
        }

        /* renamed from: c */
        public C27483a m18234c(long j) {
            this.f104630a = j;
            return this;
        }
    }

    public C47248q46(long j, long j2) {
        this.f104628a = j;
        this.f104629b = j2;
    }

    /* renamed from: c */
    public static C27483a m18237c() {
        return new C27483a();
    }

    @K94(tag = 2)
    /* renamed from: a */
    public long m18239a() {
        return this.f104629b;
    }

    @K94(tag = 1)
    /* renamed from: b */
    public long m18238b() {
        return this.f104628a;
    }
}
