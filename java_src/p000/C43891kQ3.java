package p000;

import com.google.protobuf.AbstractC18536r;
import p000.C19853dm;
/* renamed from: kQ3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43891kQ3 extends AbstractC18536r<C43891kQ3, C25160b> implements InterfaceC44484lQ3 {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final C43891kQ3 DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile VH3<C43891kQ3> PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private C19853dm applicationInfo_;
    private int bitField0_;
    private C41382gB1 gaugeMetric_;
    private L73 networkRequestMetric_;
    private C41338g66 traceMetric_;
    private Y96 transportInfo_;

    /* renamed from: kQ3$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C25159a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f94369a;

        static {
            int[] iArr = new int[AbstractC18536r.EnumC18542f.values().length];
            f94369a = iArr;
            try {
                iArr[AbstractC18536r.EnumC18542f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94369a[AbstractC18536r.EnumC18542f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94369a[AbstractC18536r.EnumC18542f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94369a[AbstractC18536r.EnumC18542f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94369a[AbstractC18536r.EnumC18542f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94369a[AbstractC18536r.EnumC18542f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f94369a[AbstractC18536r.EnumC18542f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: kQ3$b */
    /* loaded from: classes6.dex */
    public static final class C25160b extends AbstractC18536r.AbstractC18537a<C43891kQ3, C25160b> implements InterfaceC44484lQ3 {
        public /* synthetic */ C25160b(C25159a c25159a) {
            this();
        }

        /* renamed from: M */
        public C25160b m28979M(C19853dm.C19855b c19855b) {
            m46037A();
            ((C43891kQ3) this.f74852c).m28983b0(c19855b.build());
            return this;
        }

        /* renamed from: N */
        public C25160b m28978N(C41382gB1 c41382gB1) {
            m46037A();
            ((C43891kQ3) this.f74852c).m28982c0(c41382gB1);
            return this;
        }

        /* renamed from: O */
        public C25160b m28977O(L73 l73) {
            m46037A();
            ((C43891kQ3) this.f74852c).m28981d0(l73);
            return this;
        }

        /* renamed from: P */
        public C25160b m28976P(C41338g66 c41338g66) {
            m46037A();
            ((C43891kQ3) this.f74852c).m28980e0(c41338g66);
            return this;
        }

        @Override // p000.InterfaceC44484lQ3
        /* renamed from: e */
        public L73 mo27317e() {
            return ((C43891kQ3) this.f74852c).mo27317e();
        }

        @Override // p000.InterfaceC44484lQ3
        /* renamed from: g */
        public C41382gB1 mo27316g() {
            return ((C43891kQ3) this.f74852c).mo27316g();
        }

        @Override // p000.InterfaceC44484lQ3
        /* renamed from: h */
        public boolean mo27315h() {
            return ((C43891kQ3) this.f74852c).mo27315h();
        }

        @Override // p000.InterfaceC44484lQ3
        /* renamed from: j */
        public boolean mo27314j() {
            return ((C43891kQ3) this.f74852c).mo27314j();
        }

        @Override // p000.InterfaceC44484lQ3
        /* renamed from: k */
        public boolean mo27313k() {
            return ((C43891kQ3) this.f74852c).mo27313k();
        }

        @Override // p000.InterfaceC44484lQ3
        /* renamed from: l */
        public C41338g66 mo27312l() {
            return ((C43891kQ3) this.f74852c).mo27312l();
        }

        private C25160b() {
            super(C43891kQ3.DEFAULT_INSTANCE);
        }
    }

    static {
        C43891kQ3 c43891kQ3 = new C43891kQ3();
        DEFAULT_INSTANCE = c43891kQ3;
        AbstractC18536r.m46054Q(C43891kQ3.class, c43891kQ3);
    }

    private C43891kQ3() {
    }

    /* renamed from: a0 */
    public static C25160b m28984a0() {
        return DEFAULT_INSTANCE.m46042u();
    }

    /* renamed from: Y */
    public C19853dm m28986Y() {
        C19853dm c19853dm = this.applicationInfo_;
        return c19853dm == null ? C19853dm.m43752a0() : c19853dm;
    }

    /* renamed from: Z */
    public boolean m28985Z() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: b0 */
    public final void m28983b0(C19853dm c19853dm) {
        c19853dm.getClass();
        this.applicationInfo_ = c19853dm;
        this.bitField0_ |= 1;
    }

    /* renamed from: c0 */
    public final void m28982c0(C41382gB1 c41382gB1) {
        c41382gB1.getClass();
        this.gaugeMetric_ = c41382gB1;
        this.bitField0_ |= 8;
    }

    /* renamed from: d0 */
    public final void m28981d0(L73 l73) {
        l73.getClass();
        this.networkRequestMetric_ = l73;
        this.bitField0_ |= 4;
    }

    @Override // p000.InterfaceC44484lQ3
    /* renamed from: e */
    public L73 mo27317e() {
        L73 l73 = this.networkRequestMetric_;
        return l73 == null ? L73.m97719m0() : l73;
    }

    /* renamed from: e0 */
    public final void m28980e0(C41338g66 c41338g66) {
        c41338g66.getClass();
        this.traceMetric_ = c41338g66;
        this.bitField0_ |= 2;
    }

    @Override // p000.InterfaceC44484lQ3
    /* renamed from: g */
    public C41382gB1 mo27316g() {
        C41382gB1 c41382gB1 = this.gaugeMetric_;
        return c41382gB1 == null ? C41382gB1.m39937e0() : c41382gB1;
    }

    @Override // p000.InterfaceC44484lQ3
    /* renamed from: h */
    public boolean mo27315h() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // p000.InterfaceC44484lQ3
    /* renamed from: j */
    public boolean mo27314j() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // p000.InterfaceC44484lQ3
    /* renamed from: k */
    public boolean mo27313k() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // p000.InterfaceC44484lQ3
    /* renamed from: l */
    public C41338g66 mo27312l() {
        C41338g66 c41338g66 = this.traceMetric_;
        return c41338g66 == null ? C41338g66.m40030o0() : c41338g66;
    }

    @Override // com.google.protobuf.AbstractC18536r
    /* renamed from: x */
    public final Object mo23798x(AbstractC18536r.EnumC18542f enumC18542f, Object obj, Object obj2) {
        switch (C25159a.f94369a[enumC18542f.ordinal()]) {
            case 1:
                return new C43891kQ3();
            case 2:
                return new C25160b(null);
            case 3:
                return AbstractC18536r.m46057N(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                VH3<C43891kQ3> vh3 = PARSER;
                if (vh3 == null) {
                    synchronized (C43891kQ3.class) {
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
