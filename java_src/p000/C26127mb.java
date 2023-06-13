package p000;

import com.google.protobuf.AbstractC18536r;
/* renamed from: mb */
/* loaded from: classes6.dex */
public final class C26127mb extends AbstractC18536r<C26127mb, C26129b> implements InterfaceC51031wT2 {
    private static final C26127mb DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile VH3<C26127mb> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    /* renamed from: mb$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C26128a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f98372a;

        static {
            int[] iArr = new int[AbstractC18536r.EnumC18542f.values().length];
            f98372a = iArr;
            try {
                iArr[AbstractC18536r.EnumC18542f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98372a[AbstractC18536r.EnumC18542f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98372a[AbstractC18536r.EnumC18542f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f98372a[AbstractC18536r.EnumC18542f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f98372a[AbstractC18536r.EnumC18542f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f98372a[AbstractC18536r.EnumC18542f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f98372a[AbstractC18536r.EnumC18542f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: mb$b */
    /* loaded from: classes6.dex */
    public static final class C26129b extends AbstractC18536r.AbstractC18537a<C26127mb, C26129b> implements InterfaceC51031wT2 {
        public /* synthetic */ C26129b(C26128a c26128a) {
            this();
        }

        /* renamed from: M */
        public C26129b m25376M(String str) {
            m46037A();
            ((C26127mb) this.f74852c).m25379b0(str);
            return this;
        }

        /* renamed from: N */
        public C26129b m25375N(String str) {
            m46037A();
            ((C26127mb) this.f74852c).m25378c0(str);
            return this;
        }

        /* renamed from: O */
        public C26129b m25374O(String str) {
            m46037A();
            ((C26127mb) this.f74852c).m25377d0(str);
            return this;
        }

        private C26129b() {
            super(C26127mb.DEFAULT_INSTANCE);
        }
    }

    static {
        C26127mb c26127mb = new C26127mb();
        DEFAULT_INSTANCE = c26127mb;
        AbstractC18536r.m46054Q(C26127mb.class, c26127mb);
    }

    private C26127mb() {
    }

    /* renamed from: X */
    public static C26127mb m25383X() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: a0 */
    public static C26129b m25380a0() {
        return DEFAULT_INSTANCE.m46042u();
    }

    /* renamed from: Y */
    public boolean m25382Y() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: Z */
    public boolean m25381Z() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: b0 */
    public final void m25379b0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    /* renamed from: c0 */
    public final void m25378c0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.sdkVersion_ = str;
    }

    /* renamed from: d0 */
    public final void m25377d0(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.versionName_ = str;
    }

    @Override // com.google.protobuf.AbstractC18536r
    /* renamed from: x */
    public final Object mo23798x(AbstractC18536r.EnumC18542f enumC18542f, Object obj, Object obj2) {
        switch (C26128a.f98372a[enumC18542f.ordinal()]) {
            case 1:
                return new C26127mb();
            case 2:
                return new C26129b(null);
            case 3:
                return AbstractC18536r.m46057N(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                VH3<C26127mb> vh3 = PARSER;
                if (vh3 == null) {
                    synchronized (C26127mb.class) {
                        vh3 = PARSER;
                        if (vh3 == null) {
                            vh3 = new AbstractC18536r.C18538b<>(DEFAULT_INSTANCE);
                            PARSER = vh3;
                        }
                    }
                }
                return vh3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
