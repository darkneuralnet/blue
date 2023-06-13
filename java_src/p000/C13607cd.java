package p000;

import com.google.protobuf.AbstractC18536r;
/* renamed from: cd */
/* loaded from: classes6.dex */
public final class C13607cd extends AbstractC18536r<C13607cd, C13609b> implements InterfaceC51031wT2 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final C13607cd DEFAULT_INSTANCE;
    private static volatile VH3<C13607cd> PARSER = null;
    public static final int USED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private int usedAppJavaHeapMemoryKb_;

    /* renamed from: cd$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C13608a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60947a;

        static {
            int[] iArr = new int[AbstractC18536r.EnumC18542f.values().length];
            f60947a = iArr;
            try {
                iArr[AbstractC18536r.EnumC18542f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60947a[AbstractC18536r.EnumC18542f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60947a[AbstractC18536r.EnumC18542f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60947a[AbstractC18536r.EnumC18542f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60947a[AbstractC18536r.EnumC18542f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60947a[AbstractC18536r.EnumC18542f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f60947a[AbstractC18536r.EnumC18542f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: cd$b */
    /* loaded from: classes6.dex */
    public static final class C13609b extends AbstractC18536r.AbstractC18537a<C13607cd, C13609b> implements InterfaceC51031wT2 {
        public /* synthetic */ C13609b(C13608a c13608a) {
            this();
        }

        /* renamed from: M */
        public C13609b m61163M(long j) {
            m46037A();
            ((C13607cd) this.f74852c).m61165X(j);
            return this;
        }

        /* renamed from: N */
        public C13609b m61162N(int i) {
            m46037A();
            ((C13607cd) this.f74852c).m61164Y(i);
            return this;
        }

        private C13609b() {
            super(C13607cd.DEFAULT_INSTANCE);
        }
    }

    static {
        C13607cd c13607cd = new C13607cd();
        DEFAULT_INSTANCE = c13607cd;
        AbstractC18536r.m46054Q(C13607cd.class, c13607cd);
    }

    private C13607cd() {
    }

    /* renamed from: W */
    public static C13609b m61166W() {
        return DEFAULT_INSTANCE.m46042u();
    }

    /* renamed from: X */
    public final void m61165X(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    /* renamed from: Y */
    public final void m61164Y(int i) {
        this.bitField0_ |= 2;
        this.usedAppJavaHeapMemoryKb_ = i;
    }

    @Override // com.google.protobuf.AbstractC18536r
    /* renamed from: x */
    public final Object mo23798x(AbstractC18536r.EnumC18542f enumC18542f, Object obj, Object obj2) {
        switch (C13608a.f60947a[enumC18542f.ordinal()]) {
            case 1:
                return new C13607cd();
            case 2:
                return new C13609b(null);
            case 3:
                return AbstractC18536r.m46057N(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"bitField0_", "clientTimeUs_", "usedAppJavaHeapMemoryKb_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                VH3<C13607cd> vh3 = PARSER;
                if (vh3 == null) {
                    synchronized (C13607cd.class) {
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
