package p000;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
/* renamed from: z62  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C52599z62 {

    /* renamed from: a */
    public final int f120776a;

    /* renamed from: b */
    public final int f120777b;

    /* renamed from: c */
    public final String f120778c;

    /* renamed from: d */
    public final int f120779d;

    /* renamed from: e */
    public final int f120780e;

    /* renamed from: f */
    public final int f120781f;

    /* renamed from: g */
    public final InterfaceC41667gg1 f120782g;

    /* renamed from: h */
    public final A62 f120783h;

    /* renamed from: z62$b */
    /* loaded from: classes5.dex */
    public static final class C30908b {

        /* renamed from: a */
        public int f120784a;

        /* renamed from: b */
        public int f120785b;

        /* renamed from: c */
        public String f120786c;

        /* renamed from: d */
        public int f120787d;

        /* renamed from: e */
        public int f120788e;

        /* renamed from: f */
        public int f120789f;

        /* renamed from: g */
        public InterfaceC41667gg1 f120790g;

        /* renamed from: h */
        public A62 f120791h;

        /* renamed from: i */
        public C52599z62 m1801i() {
            return new C52599z62(this);
        }

        private C30908b() {
            this.f120784a = 0;
            this.f120785b = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
            this.f120786c = "http://clients3.google.com/generate_204";
            this.f120787d = 80;
            this.f120788e = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
            this.f120789f = 204;
            this.f120790g = new ZW0();
            this.f120791h = new C35102Ox6();
        }
    }

    /* renamed from: a */
    public static C30908b m1819a() {
        return new C30908b();
    }

    /* renamed from: b */
    public static C52599z62 m1818b() {
        return new C30908b().m1801i();
    }

    /* renamed from: c */
    public InterfaceC41667gg1 m1817c() {
        return this.f120782g;
    }

    /* renamed from: d */
    public String m1816d() {
        return this.f120778c;
    }

    /* renamed from: e */
    public int m1815e() {
        return this.f120781f;
    }

    /* renamed from: f */
    public int m1814f() {
        return this.f120776a;
    }

    /* renamed from: g */
    public int m1813g() {
        return this.f120777b;
    }

    /* renamed from: h */
    public int m1812h() {
        return this.f120779d;
    }

    /* renamed from: i */
    public A62 m1811i() {
        return this.f120783h;
    }

    /* renamed from: j */
    public int m1810j() {
        return this.f120780e;
    }

    public C52599z62(int i, int i2, String str, int i3, int i4, int i5, InterfaceC41667gg1 interfaceC41667gg1, A62 a62) {
        this.f120776a = i;
        this.f120777b = i2;
        this.f120778c = str;
        this.f120779d = i3;
        this.f120780e = i4;
        this.f120781f = i5;
        this.f120782g = interfaceC41667gg1;
        this.f120783h = a62;
    }

    public C52599z62(C30908b c30908b) {
        this(c30908b.f120784a, c30908b.f120785b, c30908b.f120786c, c30908b.f120787d, c30908b.f120788e, c30908b.f120789f, c30908b.f120790g, c30908b.f120791h);
    }

    private C52599z62() {
        this(m1819a());
    }
}
