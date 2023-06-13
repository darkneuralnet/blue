package p000;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: LS0 */
/* loaded from: classes6.dex */
public abstract class LS0 {

    /* renamed from: b */
    public static final LS0 f21412b;

    /* renamed from: c */
    public static final LS0 f21413c;

    /* renamed from: d */
    public static final LS0 f21414d;

    /* renamed from: e */
    public static final LS0 f21415e;

    /* renamed from: f */
    public static final LS0 f21416f;

    /* renamed from: g */
    public static final LS0 f21417g;

    /* renamed from: h */
    public static final LS0 f21418h;

    /* renamed from: i */
    public static final LS0 f21419i;

    /* renamed from: j */
    public static final /* synthetic */ LS0[] f21420j;

    /* renamed from: LS0$a */
    /* loaded from: classes6.dex */
    public enum C4919a extends LS0 {
        public C4919a(String str, int i) {
            super(str, i, null);
        }

        @Override // p000.LS0
        /* renamed from: a */
        public boolean mo96933a(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    }

    static {
        C4919a c4919a = new C4919a("DATA_MASK_000", 0);
        f21412b = c4919a;
        LS0 ls0 = new LS0("DATA_MASK_001", 1) { // from class: LS0.b
            @Override // p000.LS0
            /* renamed from: a */
            public boolean mo96933a(int i, int i2) {
                return (i & 1) == 0;
            }
        };
        f21413c = ls0;
        LS0 ls02 = new LS0("DATA_MASK_010", 2) { // from class: LS0.c
            @Override // p000.LS0
            /* renamed from: a */
            public boolean mo96933a(int i, int i2) {
                return i2 % 3 == 0;
            }
        };
        f21414d = ls02;
        LS0 ls03 = new LS0("DATA_MASK_011", 3) { // from class: LS0.d
            @Override // p000.LS0
            /* renamed from: a */
            public boolean mo96933a(int i, int i2) {
                return (i + i2) % 3 == 0;
            }
        };
        f21415e = ls03;
        LS0 ls04 = new LS0("DATA_MASK_100", 4) { // from class: LS0.e
            @Override // p000.LS0
            /* renamed from: a */
            public boolean mo96933a(int i, int i2) {
                return (((i / 2) + (i2 / 3)) & 1) == 0;
            }
        };
        f21416f = ls04;
        LS0 ls05 = new LS0("DATA_MASK_101", 5) { // from class: LS0.f
            @Override // p000.LS0
            /* renamed from: a */
            public boolean mo96933a(int i, int i2) {
                return (i * i2) % 6 == 0;
            }
        };
        f21417g = ls05;
        LS0 ls06 = new LS0("DATA_MASK_110", 6) { // from class: LS0.g
            @Override // p000.LS0
            /* renamed from: a */
            public boolean mo96933a(int i, int i2) {
                return (i * i2) % 6 < 3;
            }
        };
        f21418h = ls06;
        LS0 ls07 = new LS0("DATA_MASK_111", 7) { // from class: LS0.h
            @Override // p000.LS0
            /* renamed from: a */
            public boolean mo96933a(int i, int i2) {
                return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
            }
        };
        f21419i = ls07;
        f21420j = new LS0[]{c4919a, ls0, ls02, ls03, ls04, ls05, ls06, ls07};
    }

    public LS0(String str, int i) {
    }

    public static LS0 valueOf(String str) {
        return (LS0) Enum.valueOf(LS0.class, str);
    }

    public static LS0[] values() {
        return (LS0[]) f21420j.clone();
    }

    /* renamed from: a */
    public abstract boolean mo96933a(int i, int i2);

    /* renamed from: b */
    public final void m96934b(C1837ET c1837et, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo96933a(i2, i3)) {
                    c1837et.m108960g(i3, i2);
                }
            }
        }
    }

    public /* synthetic */ LS0(String str, int i, C4919a c4919a) {
        this(str, i);
    }
}
