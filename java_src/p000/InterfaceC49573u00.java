package p000;
/* renamed from: u00  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC49573u00 {

    /* renamed from: a */
    public static final InterfaceC49573u00 f111458a;

    /* renamed from: b */
    public static final InterfaceC49573u00 f111459b;

    /* renamed from: c */
    public static final InterfaceC49573u00 f111460c;

    /* renamed from: d */
    public static final InterfaceC49573u00 f111461d;

    /* renamed from: e */
    public static final InterfaceC49573u00 f111462e;

    /* renamed from: u00$a */
    /* loaded from: classes8.dex */
    public static class C28979a implements InterfaceC49573u00 {
        @Override // p000.InterfaceC49573u00
        /* renamed from: a */
        public boolean mo11111a(int i) {
            return i > 0;
        }
    }

    /* renamed from: u00$b */
    /* loaded from: classes8.dex */
    public static class C28980b implements InterfaceC49573u00 {
        @Override // p000.InterfaceC49573u00
        /* renamed from: a */
        public boolean mo11111a(int i) {
            return i % 2 == 1;
        }
    }

    /* renamed from: u00$c */
    /* loaded from: classes8.dex */
    public static class C28981c implements InterfaceC49573u00 {
        @Override // p000.InterfaceC49573u00
        /* renamed from: a */
        public boolean mo11111a(int i) {
            return i == 1;
        }
    }

    /* renamed from: u00$d */
    /* loaded from: classes8.dex */
    public static class C28982d implements InterfaceC49573u00 {
        @Override // p000.InterfaceC49573u00
        /* renamed from: a */
        public boolean mo11111a(int i) {
            return i > 1;
        }
    }

    static {
        C28980b c28980b = new C28980b();
        f111458a = c28980b;
        f111459b = new C28979a();
        f111460c = new C28982d();
        f111461d = new C28981c();
        f111462e = c28980b;
    }

    /* renamed from: a */
    boolean mo11111a(int i);
}
