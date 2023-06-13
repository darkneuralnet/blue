package p000;
/* renamed from: dR5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C39752dR5 {

    /* renamed from: c */
    public static final C39752dR5 f76604c = new C19765a().m44261a();

    /* renamed from: a */
    public final long f76605a;

    /* renamed from: b */
    public final long f76606b;

    /* renamed from: dR5$a */
    /* loaded from: classes5.dex */
    public static final class C19765a {

        /* renamed from: a */
        public long f76607a = 0;

        /* renamed from: b */
        public long f76608b = 0;

        /* renamed from: a */
        public C39752dR5 m44261a() {
            return new C39752dR5(this.f76607a, this.f76608b);
        }

        /* renamed from: b */
        public C19765a m44260b(long j) {
            this.f76607a = j;
            return this;
        }

        /* renamed from: c */
        public C19765a m44259c(long j) {
            this.f76608b = j;
            return this;
        }
    }

    public C39752dR5(long j, long j2) {
        this.f76605a = j;
        this.f76606b = j2;
    }

    /* renamed from: c */
    public static C19765a m44262c() {
        return new C19765a();
    }

    @K94(tag = 1)
    /* renamed from: a */
    public long m44264a() {
        return this.f76605a;
    }

    @K94(tag = 2)
    /* renamed from: b */
    public long m44263b() {
        return this.f76606b;
    }
}
