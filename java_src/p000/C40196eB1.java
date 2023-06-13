package p000;

import com.google.protobuf.AbstractC18536r;
/* renamed from: eB1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40196eB1 extends AbstractC18536r<C40196eB1, C19981b> implements InterfaceC51031wT2 {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final C40196eB1 DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile VH3<C40196eB1> PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    /* renamed from: eB1$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C19980a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f78075a;

        static {
            int[] iArr = new int[AbstractC18536r.EnumC18542f.values().length];
            f78075a = iArr;
            try {
                iArr[AbstractC18536r.EnumC18542f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78075a[AbstractC18536r.EnumC18542f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78075a[AbstractC18536r.EnumC18542f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f78075a[AbstractC18536r.EnumC18542f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f78075a[AbstractC18536r.EnumC18542f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f78075a[AbstractC18536r.EnumC18542f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f78075a[AbstractC18536r.EnumC18542f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: eB1$b */
    /* loaded from: classes6.dex */
    public static final class C19981b extends AbstractC18536r.AbstractC18537a<C40196eB1, C19981b> implements InterfaceC51031wT2 {
        public /* synthetic */ C19981b(C19980a c19980a) {
            this();
        }

        /* renamed from: M */
        public C19981b m43141M(int i) {
            m46037A();
            ((C40196eB1) this.f74852c).m43144a0(i);
            return this;
        }

        /* renamed from: N */
        public C19981b m43140N(int i) {
            m46037A();
            ((C40196eB1) this.f74852c).m43143b0(i);
            return this;
        }

        /* renamed from: O */
        public C19981b m43139O(int i) {
            m46037A();
            ((C40196eB1) this.f74852c).m43142c0(i);
            return this;
        }

        private C19981b() {
            super(C40196eB1.DEFAULT_INSTANCE);
        }
    }

    static {
        C40196eB1 c40196eB1 = new C40196eB1();
        DEFAULT_INSTANCE = c40196eB1;
        AbstractC18536r.m46054Q(C40196eB1.class, c40196eB1);
    }

    private C40196eB1() {
    }

    /* renamed from: X */
    public static C40196eB1 m43147X() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: Z */
    public static C19981b m43145Z() {
        return DEFAULT_INSTANCE.m46042u();
    }

    /* renamed from: Y */
    public boolean m43146Y() {
        return (this.bitField0_ & 16) != 0;
    }

    /* renamed from: a0 */
    public final void m43144a0(int i) {
        this.bitField0_ |= 8;
        this.deviceRamSizeKb_ = i;
    }

    /* renamed from: b0 */
    public final void m43143b0(int i) {
        this.bitField0_ |= 16;
        this.maxAppJavaHeapMemoryKb_ = i;
    }

    /* renamed from: c0 */
    public final void m43142c0(int i) {
        this.bitField0_ |= 32;
        this.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    @Override // com.google.protobuf.AbstractC18536r
    /* renamed from: x */
    public final Object mo23798x(AbstractC18536r.EnumC18542f enumC18542f, Object obj, Object obj2) {
        switch (C19980a.f78075a[enumC18542f.ordinal()]) {
            case 1:
                return new C40196eB1();
            case 2:
                return new C19981b(null);
            case 3:
                return AbstractC18536r.m46057N(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                VH3<C40196eB1> vh3 = PARSER;
                if (vh3 == null) {
                    synchronized (C40196eB1.class) {
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
