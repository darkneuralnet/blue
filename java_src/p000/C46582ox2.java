package p000;
/* renamed from: ox2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C46582ox2 {

    /* renamed from: c */
    public static final C46582ox2 f102797c = new C27109a().m20240a();

    /* renamed from: a */
    public final long f102798a;

    /* renamed from: b */
    public final EnumC27110b f102799b;

    /* renamed from: ox2$a */
    /* loaded from: classes5.dex */
    public static final class C27109a {

        /* renamed from: a */
        public long f102800a = 0;

        /* renamed from: b */
        public EnumC27110b f102801b = EnumC27110b.REASON_UNKNOWN;

        /* renamed from: a */
        public C46582ox2 m20240a() {
            return new C46582ox2(this.f102800a, this.f102801b);
        }

        /* renamed from: b */
        public C27109a m20239b(long j) {
            this.f102800a = j;
            return this;
        }

        /* renamed from: c */
        public C27109a m20238c(EnumC27110b enumC27110b) {
            this.f102801b = enumC27110b;
            return this;
        }
    }

    /* renamed from: ox2$b */
    /* loaded from: classes5.dex */
    public enum EnumC27110b implements F94 {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: b */
        public final int f102810b;

        EnumC27110b(int i) {
            this.f102810b = i;
        }

        @Override // p000.F94
        public int getNumber() {
            return this.f102810b;
        }
    }

    public C46582ox2(long j, EnumC27110b enumC27110b) {
        this.f102798a = j;
        this.f102799b = enumC27110b;
    }

    /* renamed from: c */
    public static C27109a m20241c() {
        return new C27109a();
    }

    @K94(tag = 1)
    /* renamed from: a */
    public long m20243a() {
        return this.f102798a;
    }

    @K94(tag = 3)
    /* renamed from: b */
    public EnumC27110b m20242b() {
        return this.f102799b;
    }
}
