package p000;
/* renamed from: JA6 */
/* loaded from: classes5.dex */
public final class JA6 {

    /* renamed from: c */
    public static final JA6 f16966c = new C3914b().m101042f().m101045c();

    /* renamed from: d */
    public static final JA6 f16967d = new C3914b().m101043e().m101045c();

    /* renamed from: e */
    public static final JA6 f16968e = new C3914b().m101044d().m101045c();

    /* renamed from: a */
    public EnumC3915c f16969a;

    /* renamed from: b */
    public int f16970b;

    /* renamed from: JA6$b */
    /* loaded from: classes5.dex */
    public static final class C3914b {

        /* renamed from: a */
        public EnumC3915c f16971a;

        /* renamed from: b */
        public int f16972b;

        /* renamed from: c */
        public JA6 m101045c() {
            return new JA6(this);
        }

        /* renamed from: d */
        public C3914b m101044d() {
            this.f16971a = EnumC3915c.CACHE_ALL;
            return this;
        }

        /* renamed from: e */
        public C3914b m101043e() {
            this.f16971a = EnumC3915c.CACHE_AUTO;
            return this;
        }

        /* renamed from: f */
        public C3914b m101042f() {
            this.f16971a = EnumC3915c.CACHE_NONE;
            return this;
        }
    }

    /* renamed from: JA6$c */
    /* loaded from: classes5.dex */
    public enum EnumC3915c {
        CACHE_NONE,
        CACHE_LIMITED,
        CACHE_AUTO,
        CACHE_ALL
    }

    /* renamed from: a */
    public boolean m101050a() {
        return this.f16969a == EnumC3915c.CACHE_ALL;
    }

    /* renamed from: b */
    public int m101049b() {
        return this.f16970b;
    }

    /* renamed from: c */
    public boolean m101048c() {
        return this.f16969a == EnumC3915c.CACHE_NONE;
    }

    public JA6(C3914b c3914b) {
        this.f16969a = c3914b.f16971a;
        this.f16970b = c3914b.f16972b;
    }
}
