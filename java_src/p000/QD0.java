package p000;

import com.google.protobuf.AbstractC18536r;
/* renamed from: QD0 */
/* loaded from: classes6.dex */
public final class QD0 extends AbstractC18536r<QD0, C6729b> implements InterfaceC51031wT2 {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final QD0 DEFAULT_INSTANCE;
    private static volatile VH3<QD0> PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    /* renamed from: QD0$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C6728a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30036a;

        static {
            int[] iArr = new int[AbstractC18536r.EnumC18542f.values().length];
            f30036a = iArr;
            try {
                iArr[AbstractC18536r.EnumC18542f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30036a[AbstractC18536r.EnumC18542f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30036a[AbstractC18536r.EnumC18542f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30036a[AbstractC18536r.EnumC18542f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f30036a[AbstractC18536r.EnumC18542f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f30036a[AbstractC18536r.EnumC18542f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f30036a[AbstractC18536r.EnumC18542f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: QD0$b */
    /* loaded from: classes6.dex */
    public static final class C6729b extends AbstractC18536r.AbstractC18537a<QD0, C6729b> implements InterfaceC51031wT2 {
        public /* synthetic */ C6729b(C6728a c6728a) {
            this();
        }

        /* renamed from: M */
        public C6729b m88739M(long j) {
            m46037A();
            ((QD0) this.f74852c).m88742Y(j);
            return this;
        }

        /* renamed from: N */
        public C6729b m88738N(long j) {
            m46037A();
            ((QD0) this.f74852c).m88741Z(j);
            return this;
        }

        /* renamed from: O */
        public C6729b m88737O(long j) {
            m46037A();
            ((QD0) this.f74852c).m88740a0(j);
            return this;
        }

        private C6729b() {
            super(QD0.DEFAULT_INSTANCE);
        }
    }

    static {
        QD0 qd0 = new QD0();
        DEFAULT_INSTANCE = qd0;
        AbstractC18536r.m46054Q(QD0.class, qd0);
    }

    private QD0() {
    }

    /* renamed from: X */
    public static C6729b m88743X() {
        return DEFAULT_INSTANCE.m46042u();
    }

    /* renamed from: Y */
    public final void m88742Y(long j) {
        this.bitField0_ |= 1;
        this.clientTimeUs_ = j;
    }

    /* renamed from: Z */
    public final void m88741Z(long j) {
        this.bitField0_ |= 4;
        this.systemTimeUs_ = j;
    }

    /* renamed from: a0 */
    public final void m88740a0(long j) {
        this.bitField0_ |= 2;
        this.userTimeUs_ = j;
    }

    @Override // com.google.protobuf.AbstractC18536r
    /* renamed from: x */
    public final Object mo23798x(AbstractC18536r.EnumC18542f enumC18542f, Object obj, Object obj2) {
        switch (C6728a.f30036a[enumC18542f.ordinal()]) {
            case 1:
                return new QD0();
            case 2:
                return new C6729b(null);
            case 3:
                return AbstractC18536r.m46057N(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                VH3<QD0> vh3 = PARSER;
                if (vh3 == null) {
                    synchronized (QD0.class) {
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
