package p000;

import com.google.protobuf.AbstractC18536r;
import com.google.protobuf.C18544t;
/* renamed from: gB1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41382gB1 extends AbstractC18536r<C41382gB1, C20770b> implements InterfaceC51031wT2 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final C41382gB1 DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile VH3<C41382gB1> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private C40196eB1 gaugeMetadata_;
    private String sessionId_ = "";
    private C18544t.InterfaceC18553i<QD0> cpuMetricReadings_ = AbstractC18536r.m46038z();
    private C18544t.InterfaceC18553i<C13607cd> androidMemoryReadings_ = AbstractC18536r.m46038z();

    /* renamed from: gB1$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C20769a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81728a;

        static {
            int[] iArr = new int[AbstractC18536r.EnumC18542f.values().length];
            f81728a = iArr;
            try {
                iArr[AbstractC18536r.EnumC18542f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81728a[AbstractC18536r.EnumC18542f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81728a[AbstractC18536r.EnumC18542f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81728a[AbstractC18536r.EnumC18542f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f81728a[AbstractC18536r.EnumC18542f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f81728a[AbstractC18536r.EnumC18542f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f81728a[AbstractC18536r.EnumC18542f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: gB1$b */
    /* loaded from: classes6.dex */
    public static final class C20770b extends AbstractC18536r.AbstractC18537a<C41382gB1, C20770b> implements InterfaceC51031wT2 {
        public /* synthetic */ C20770b(C20769a c20769a) {
            this();
        }

        /* renamed from: M */
        public C20770b m39930M(C13607cd c13607cd) {
            m46037A();
            ((C41382gB1) this.f74852c).m39943Y(c13607cd);
            return this;
        }

        /* renamed from: N */
        public C20770b m39929N(QD0 qd0) {
            m46037A();
            ((C41382gB1) this.f74852c).m39942Z(qd0);
            return this;
        }

        /* renamed from: O */
        public C20770b m39928O(C40196eB1 c40196eB1) {
            m46037A();
            ((C41382gB1) this.f74852c).m39932k0(c40196eB1);
            return this;
        }

        /* renamed from: P */
        public C20770b m39927P(String str) {
            m46037A();
            ((C41382gB1) this.f74852c).m39931l0(str);
            return this;
        }

        private C20770b() {
            super(C41382gB1.DEFAULT_INSTANCE);
        }
    }

    static {
        C41382gB1 c41382gB1 = new C41382gB1();
        DEFAULT_INSTANCE = c41382gB1;
        AbstractC18536r.m46054Q(C41382gB1.class, c41382gB1);
    }

    private C41382gB1() {
    }

    /* renamed from: e0 */
    public static C41382gB1 m39937e0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: i0 */
    public static C20770b m39933i0() {
        return DEFAULT_INSTANCE.m46042u();
    }

    /* renamed from: Y */
    public final void m39943Y(C13607cd c13607cd) {
        c13607cd.getClass();
        m39941a0();
        this.androidMemoryReadings_.add(c13607cd);
    }

    /* renamed from: Z */
    public final void m39942Z(QD0 qd0) {
        qd0.getClass();
        m39940b0();
        this.cpuMetricReadings_.add(qd0);
    }

    /* renamed from: a0 */
    public final void m39941a0() {
        C18544t.InterfaceC18553i<C13607cd> interfaceC18553i = this.androidMemoryReadings_;
        if (!interfaceC18553i.mo45974t()) {
            this.androidMemoryReadings_ = AbstractC18536r.m46059L(interfaceC18553i);
        }
    }

    /* renamed from: b0 */
    public final void m39940b0() {
        C18544t.InterfaceC18553i<QD0> interfaceC18553i = this.cpuMetricReadings_;
        if (!interfaceC18553i.mo45974t()) {
            this.cpuMetricReadings_ = AbstractC18536r.m46059L(interfaceC18553i);
        }
    }

    /* renamed from: c0 */
    public int m39939c0() {
        return this.androidMemoryReadings_.size();
    }

    /* renamed from: d0 */
    public int m39938d0() {
        return this.cpuMetricReadings_.size();
    }

    /* renamed from: f0 */
    public C40196eB1 m39936f0() {
        C40196eB1 c40196eB1 = this.gaugeMetadata_;
        return c40196eB1 == null ? C40196eB1.m43147X() : c40196eB1;
    }

    /* renamed from: g0 */
    public boolean m39935g0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: h0 */
    public boolean m39934h0() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: k0 */
    public final void m39932k0(C40196eB1 c40196eB1) {
        c40196eB1.getClass();
        this.gaugeMetadata_ = c40196eB1;
        this.bitField0_ |= 2;
    }

    /* renamed from: l0 */
    public final void m39931l0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.AbstractC18536r
    /* renamed from: x */
    public final Object mo23798x(AbstractC18536r.EnumC18542f enumC18542f, Object obj, Object obj2) {
        switch (C20769a.f81728a[enumC18542f.ordinal()]) {
            case 1:
                return new C41382gB1();
            case 2:
                return new C20770b(null);
            case 3:
                return AbstractC18536r.m46057N(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", QD0.class, "gaugeMetadata_", "androidMemoryReadings_", C13607cd.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                VH3<C41382gB1> vh3 = PARSER;
                if (vh3 == null) {
                    synchronized (C41382gB1.class) {
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
