package p000;
/* renamed from: vp6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC50655vp6 {

    /* renamed from: a */
    public final AbstractC39597dA3 f114768a;

    /* renamed from: b */
    public final AbstractC34821Ns4 f114769b;

    /* renamed from: vp6$a */
    /* loaded from: classes.dex */
    public static final class C29661a extends AbstractC50655vp6 {

        /* renamed from: c */
        public final AbstractC40782fA3 f114770c;

        /* renamed from: d */
        public final int f114771d;

        /* renamed from: e */
        public final Throwable f114772e;

        public C29661a(AbstractC39597dA3 abstractC39597dA3, AbstractC34821Ns4 abstractC34821Ns4, AbstractC40782fA3 abstractC40782fA3, int i, Throwable th) {
            super(abstractC39597dA3, abstractC34821Ns4);
            this.f114770c = abstractC40782fA3;
            this.f114771d = i;
            this.f114772e = th;
        }

        /* renamed from: g */
        public static String m7958g(int i) {
            switch (i) {
                case 0:
                    return "ERROR_NONE";
                case 1:
                    return "ERROR_UNKNOWN";
                case 2:
                    return "ERROR_FILE_SIZE_LIMIT_REACHED";
                case 3:
                    return "ERROR_INSUFFICIENT_STORAGE";
                case 4:
                    return "ERROR_SOURCE_INACTIVE";
                case 5:
                    return "ERROR_INVALID_OUTPUT_OPTIONS";
                case 6:
                    return "ERROR_ENCODING_FAILED";
                case 7:
                    return "ERROR_RECORDER_ERROR";
                case 8:
                    return "ERROR_NO_VALID_DATA";
                default:
                    return "Unknown(" + i + ")";
            }
        }

        /* renamed from: h */
        public int m7957h() {
            return this.f114771d;
        }

        /* renamed from: i */
        public boolean m7956i() {
            return this.f114771d != 0;
        }
    }

    /* renamed from: vp6$b */
    /* loaded from: classes.dex */
    public static final class C29662b extends AbstractC50655vp6 {
        public C29662b(AbstractC39597dA3 abstractC39597dA3, AbstractC34821Ns4 abstractC34821Ns4) {
            super(abstractC39597dA3, abstractC34821Ns4);
        }
    }

    /* renamed from: vp6$c */
    /* loaded from: classes.dex */
    public static final class C29663c extends AbstractC50655vp6 {
        public C29663c(AbstractC39597dA3 abstractC39597dA3, AbstractC34821Ns4 abstractC34821Ns4) {
            super(abstractC39597dA3, abstractC34821Ns4);
        }
    }

    /* renamed from: vp6$d */
    /* loaded from: classes.dex */
    public static final class C29664d extends AbstractC50655vp6 {
        public C29664d(AbstractC39597dA3 abstractC39597dA3, AbstractC34821Ns4 abstractC34821Ns4) {
            super(abstractC39597dA3, abstractC34821Ns4);
        }
    }

    public AbstractC50655vp6(AbstractC39597dA3 abstractC39597dA3, AbstractC34821Ns4 abstractC34821Ns4) {
        this.f114768a = (AbstractC39597dA3) HZ3.m103731g(abstractC39597dA3);
        this.f114769b = (AbstractC34821Ns4) HZ3.m103731g(abstractC34821Ns4);
    }

    /* renamed from: a */
    public static C29661a m7964a(AbstractC39597dA3 abstractC39597dA3, AbstractC34821Ns4 abstractC34821Ns4, AbstractC40782fA3 abstractC40782fA3) {
        return new C29661a(abstractC39597dA3, abstractC34821Ns4, abstractC40782fA3, 0, null);
    }

    /* renamed from: b */
    public static C29661a m7963b(AbstractC39597dA3 abstractC39597dA3, AbstractC34821Ns4 abstractC34821Ns4, AbstractC40782fA3 abstractC40782fA3, int i, Throwable th) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "An error type is required.");
        return new C29661a(abstractC39597dA3, abstractC34821Ns4, abstractC40782fA3, i, th);
    }

    /* renamed from: d */
    public static C29662b m7961d(AbstractC39597dA3 abstractC39597dA3, AbstractC34821Ns4 abstractC34821Ns4) {
        return new C29662b(abstractC39597dA3, abstractC34821Ns4);
    }

    /* renamed from: e */
    public static C29663c m7960e(AbstractC39597dA3 abstractC39597dA3, AbstractC34821Ns4 abstractC34821Ns4) {
        return new C29663c(abstractC39597dA3, abstractC34821Ns4);
    }

    /* renamed from: f */
    public static C29664d m7959f(AbstractC39597dA3 abstractC39597dA3, AbstractC34821Ns4 abstractC34821Ns4) {
        return new C29664d(abstractC39597dA3, abstractC34821Ns4);
    }

    /* renamed from: c */
    public AbstractC39597dA3 m7962c() {
        return this.f114768a;
    }
}
