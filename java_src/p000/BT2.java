package p000;
/* renamed from: BT2 */
/* loaded from: classes6.dex */
public final class BT2 {

    /* renamed from: p */
    public static final BT2 f2350p = new C0620a().m113992a();

    /* renamed from: a */
    public final long f2351a;

    /* renamed from: b */
    public final String f2352b;

    /* renamed from: c */
    public final String f2353c;

    /* renamed from: d */
    public final EnumC0622c f2354d;

    /* renamed from: e */
    public final EnumC0623d f2355e;

    /* renamed from: f */
    public final String f2356f;

    /* renamed from: g */
    public final String f2357g;

    /* renamed from: h */
    public final int f2358h;

    /* renamed from: i */
    public final int f2359i;

    /* renamed from: j */
    public final String f2360j;

    /* renamed from: k */
    public final long f2361k;

    /* renamed from: l */
    public final EnumC0621b f2362l;

    /* renamed from: m */
    public final String f2363m;

    /* renamed from: n */
    public final long f2364n;

    /* renamed from: o */
    public final String f2365o;

    /* renamed from: BT2$a */
    /* loaded from: classes6.dex */
    public static final class C0620a {

        /* renamed from: a */
        public long f2366a = 0;

        /* renamed from: b */
        public String f2367b = "";

        /* renamed from: c */
        public String f2368c = "";

        /* renamed from: d */
        public EnumC0622c f2369d = EnumC0622c.UNKNOWN;

        /* renamed from: e */
        public EnumC0623d f2370e = EnumC0623d.UNKNOWN_OS;

        /* renamed from: f */
        public String f2371f = "";

        /* renamed from: g */
        public String f2372g = "";

        /* renamed from: h */
        public int f2373h = 0;

        /* renamed from: i */
        public int f2374i = 0;

        /* renamed from: j */
        public String f2375j = "";

        /* renamed from: k */
        public long f2376k = 0;

        /* renamed from: l */
        public EnumC0621b f2377l = EnumC0621b.UNKNOWN_EVENT;

        /* renamed from: m */
        public String f2378m = "";

        /* renamed from: n */
        public long f2379n = 0;

        /* renamed from: o */
        public String f2380o = "";

        /* renamed from: a */
        public BT2 m113992a() {
            return new BT2(this.f2366a, this.f2367b, this.f2368c, this.f2369d, this.f2370e, this.f2371f, this.f2372g, this.f2373h, this.f2374i, this.f2375j, this.f2376k, this.f2377l, this.f2378m, this.f2379n, this.f2380o);
        }

        /* renamed from: b */
        public C0620a m113991b(String str) {
            this.f2378m = str;
            return this;
        }

        /* renamed from: c */
        public C0620a m113990c(String str) {
            this.f2372g = str;
            return this;
        }

        /* renamed from: d */
        public C0620a m113989d(String str) {
            this.f2380o = str;
            return this;
        }

        /* renamed from: e */
        public C0620a m113988e(EnumC0621b enumC0621b) {
            this.f2377l = enumC0621b;
            return this;
        }

        /* renamed from: f */
        public C0620a m113987f(String str) {
            this.f2368c = str;
            return this;
        }

        /* renamed from: g */
        public C0620a m113986g(String str) {
            this.f2367b = str;
            return this;
        }

        /* renamed from: h */
        public C0620a m113985h(EnumC0622c enumC0622c) {
            this.f2369d = enumC0622c;
            return this;
        }

        /* renamed from: i */
        public C0620a m113984i(String str) {
            this.f2371f = str;
            return this;
        }

        /* renamed from: j */
        public C0620a m113983j(long j) {
            this.f2366a = j;
            return this;
        }

        /* renamed from: k */
        public C0620a m113982k(EnumC0623d enumC0623d) {
            this.f2370e = enumC0623d;
            return this;
        }

        /* renamed from: l */
        public C0620a m113981l(String str) {
            this.f2375j = str;
            return this;
        }

        /* renamed from: m */
        public C0620a m113980m(int i) {
            this.f2374i = i;
            return this;
        }
    }

    /* renamed from: BT2$b */
    /* loaded from: classes6.dex */
    public enum EnumC0621b implements F94 {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        

        /* renamed from: b */
        public final int f2385b;

        EnumC0621b(int i) {
            this.f2385b = i;
        }

        @Override // p000.F94
        public int getNumber() {
            return this.f2385b;
        }
    }

    /* renamed from: BT2$c */
    /* loaded from: classes6.dex */
    public enum EnumC0622c implements F94 {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        

        /* renamed from: b */
        public final int f2391b;

        EnumC0622c(int i) {
            this.f2391b = i;
        }

        @Override // p000.F94
        public int getNumber() {
            return this.f2391b;
        }
    }

    /* renamed from: BT2$d */
    /* loaded from: classes6.dex */
    public enum EnumC0623d implements F94 {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        

        /* renamed from: b */
        public final int f2397b;

        EnumC0623d(int i) {
            this.f2397b = i;
        }

        @Override // p000.F94
        public int getNumber() {
            return this.f2397b;
        }
    }

    public BT2(long j, String str, String str2, EnumC0622c enumC0622c, EnumC0623d enumC0623d, String str3, String str4, int i, int i2, String str5, long j2, EnumC0621b enumC0621b, String str6, long j3, String str7) {
        this.f2351a = j;
        this.f2352b = str;
        this.f2353c = str2;
        this.f2354d = enumC0622c;
        this.f2355e = enumC0623d;
        this.f2356f = str3;
        this.f2357g = str4;
        this.f2358h = i;
        this.f2359i = i2;
        this.f2360j = str5;
        this.f2361k = j2;
        this.f2362l = enumC0621b;
        this.f2363m = str6;
        this.f2364n = j3;
        this.f2365o = str7;
    }

    /* renamed from: p */
    public static C0620a m113993p() {
        return new C0620a();
    }

    @K94(tag = 13)
    /* renamed from: a */
    public String m114008a() {
        return this.f2363m;
    }

    @K94(tag = 11)
    /* renamed from: b */
    public long m114007b() {
        return this.f2361k;
    }

    @K94(tag = 14)
    /* renamed from: c */
    public long m114006c() {
        return this.f2364n;
    }

    @K94(tag = 7)
    /* renamed from: d */
    public String m114005d() {
        return this.f2357g;
    }

    @K94(tag = 15)
    /* renamed from: e */
    public String m114004e() {
        return this.f2365o;
    }

    @K94(tag = 12)
    /* renamed from: f */
    public EnumC0621b m114003f() {
        return this.f2362l;
    }

    @K94(tag = 3)
    /* renamed from: g */
    public String m114002g() {
        return this.f2353c;
    }

    @K94(tag = 2)
    /* renamed from: h */
    public String m114001h() {
        return this.f2352b;
    }

    @K94(tag = 4)
    /* renamed from: i */
    public EnumC0622c m114000i() {
        return this.f2354d;
    }

    @K94(tag = 6)
    /* renamed from: j */
    public String m113999j() {
        return this.f2356f;
    }

    @K94(tag = 8)
    /* renamed from: k */
    public int m113998k() {
        return this.f2358h;
    }

    @K94(tag = 1)
    /* renamed from: l */
    public long m113997l() {
        return this.f2351a;
    }

    @K94(tag = 5)
    /* renamed from: m */
    public EnumC0623d m113996m() {
        return this.f2355e;
    }

    @K94(tag = 10)
    /* renamed from: n */
    public String m113995n() {
        return this.f2360j;
    }

    @K94(tag = 9)
    /* renamed from: o */
    public int m113994o() {
        return this.f2359i;
    }
}
