package p000;

import com.google.protobuf.AbstractC18499a;
import com.google.protobuf.AbstractC18536r;
import com.google.protobuf.C18457A;
import com.google.protobuf.C18489P;
import com.google.protobuf.C18544t;
import com.google.protobuf.C18565z;
import java.util.List;
/* renamed from: L73 */
/* loaded from: classes6.dex */
public final class L73 extends AbstractC18536r<L73, C4739b> implements InterfaceC51031wT2 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final L73 DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile VH3<L73> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private C18457A<String, String> customAttributes_ = C18457A.m46748g();
    private String url_ = "";
    private String responseContentType_ = "";
    private C18544t.InterfaceC18553i<C45670nQ3> perfSessions_ = AbstractC18536r.m46038z();

    /* renamed from: L73$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C4738a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20763a;

        static {
            int[] iArr = new int[AbstractC18536r.EnumC18542f.values().length];
            f20763a = iArr;
            try {
                iArr[AbstractC18536r.EnumC18542f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20763a[AbstractC18536r.EnumC18542f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20763a[AbstractC18536r.EnumC18542f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20763a[AbstractC18536r.EnumC18542f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20763a[AbstractC18536r.EnumC18542f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20763a[AbstractC18536r.EnumC18542f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20763a[AbstractC18536r.EnumC18542f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: L73$b */
    /* loaded from: classes6.dex */
    public static final class C4739b extends AbstractC18536r.AbstractC18537a<L73, C4739b> implements InterfaceC51031wT2 {
        public /* synthetic */ C4739b(C4738a c4738a) {
            this();
        }

        /* renamed from: M */
        public C4739b m97705M(Iterable<? extends C45670nQ3> iterable) {
            m46037A();
            ((L73) this.f74852c).m97723h0(iterable);
            return this;
        }

        /* renamed from: N */
        public C4739b m97704N() {
            m46037A();
            ((L73) this.f74852c).m97722i0();
            return this;
        }

        /* renamed from: O */
        public long m97703O() {
            return ((L73) this.f74852c).m97710v0();
        }

        /* renamed from: P */
        public boolean m97702P() {
            return ((L73) this.f74852c).m97708x0();
        }

        /* renamed from: Q */
        public boolean m97701Q() {
            return ((L73) this.f74852c).m97706z0();
        }

        /* renamed from: S */
        public boolean m97700S() {
            return ((L73) this.f74852c).m97751D0();
        }

        /* renamed from: U */
        public C4739b m97699U(long j) {
            m46037A();
            ((L73) this.f74852c).m97748G0(j);
            return this;
        }

        /* renamed from: V */
        public C4739b m97698V(EnumC4741d enumC4741d) {
            m46037A();
            ((L73) this.f74852c).m97747H0(enumC4741d);
            return this;
        }

        /* renamed from: W */
        public C4739b m97697W(int i) {
            m46037A();
            ((L73) this.f74852c).m97746I0(i);
            return this;
        }

        /* renamed from: X */
        public C4739b m97696X(EnumC4744e enumC4744e) {
            m46037A();
            ((L73) this.f74852c).m97745J0(enumC4744e);
            return this;
        }

        /* renamed from: Y */
        public C4739b m97695Y(long j) {
            m46037A();
            ((L73) this.f74852c).m97744K0(j);
            return this;
        }

        /* renamed from: Z */
        public C4739b m97694Z(String str) {
            m46037A();
            ((L73) this.f74852c).m97743L0(str);
            return this;
        }

        /* renamed from: a0 */
        public C4739b m97693a0(long j) {
            m46037A();
            ((L73) this.f74852c).m97742M0(j);
            return this;
        }

        /* renamed from: b0 */
        public C4739b m97692b0(long j) {
            m46037A();
            ((L73) this.f74852c).m97741N0(j);
            return this;
        }

        /* renamed from: c0 */
        public C4739b m97691c0(long j) {
            m46037A();
            ((L73) this.f74852c).m97740O0(j);
            return this;
        }

        /* renamed from: d0 */
        public C4739b m97690d0(long j) {
            m46037A();
            ((L73) this.f74852c).m97739P0(j);
            return this;
        }

        /* renamed from: e0 */
        public C4739b m97689e0(String str) {
            m46037A();
            ((L73) this.f74852c).m97738Q0(str);
            return this;
        }

        private C4739b() {
            super(L73.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: L73$c */
    /* loaded from: classes6.dex */
    public static final class C4740c {

        /* renamed from: a */
        public static final C18565z<String, String> f20764a;

        static {
            C18489P.EnumC18491b enumC18491b = C18489P.EnumC18491b.f74764l;
            f20764a = C18565z.m45949d(enumC18491b, "", enumC18491b, "");
        }

        private C4740c() {
        }
    }

    /* renamed from: L73$d */
    /* loaded from: classes6.dex */
    public enum EnumC4741d implements C18544t.InterfaceC18547c {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);
        

        /* renamed from: m */
        public static final C18544t.InterfaceC18548d<EnumC4741d> f20775m = new C4742a();

        /* renamed from: b */
        public final int f20777b;

        /* renamed from: L73$d$a */
        /* loaded from: classes6.dex */
        public class C4742a implements C18544t.InterfaceC18548d<EnumC4741d> {
            @Override // com.google.protobuf.C18544t.InterfaceC18548d
            /* renamed from: a */
            public EnumC4741d findValueByNumber(int i) {
                return EnumC4741d.m97688a(i);
            }
        }

        /* renamed from: L73$d$b */
        /* loaded from: classes6.dex */
        public static final class C4743b implements C18544t.InterfaceC18549e {

            /* renamed from: a */
            public static final C18544t.InterfaceC18549e f20778a = new C4743b();

            private C4743b() {
            }

            @Override // com.google.protobuf.C18544t.InterfaceC18549e
            /* renamed from: a */
            public boolean mo33504a(int i) {
                return EnumC4741d.m97688a(i) != null;
            }
        }

        EnumC4741d(int i) {
            this.f20777b = i;
        }

        /* renamed from: a */
        public static EnumC4741d m97688a(int i) {
            switch (i) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public static C18544t.InterfaceC18549e m97687b() {
            return C4743b.f20778a;
        }

        @Override // com.google.protobuf.C18544t.InterfaceC18547c
        public final int getNumber() {
            return this.f20777b;
        }
    }

    /* renamed from: L73$e */
    /* loaded from: classes6.dex */
    public enum EnumC4744e implements C18544t.InterfaceC18547c {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);
        

        /* renamed from: e */
        public static final C18544t.InterfaceC18548d<EnumC4744e> f20781e = new C4745a();

        /* renamed from: b */
        public final int f20783b;

        /* renamed from: L73$e$a */
        /* loaded from: classes6.dex */
        public class C4745a implements C18544t.InterfaceC18548d<EnumC4744e> {
            @Override // com.google.protobuf.C18544t.InterfaceC18548d
            /* renamed from: a */
            public EnumC4744e findValueByNumber(int i) {
                return EnumC4744e.m97685a(i);
            }
        }

        /* renamed from: L73$e$b */
        /* loaded from: classes6.dex */
        public static final class C4746b implements C18544t.InterfaceC18549e {

            /* renamed from: a */
            public static final C18544t.InterfaceC18549e f20784a = new C4746b();

            private C4746b() {
            }

            @Override // com.google.protobuf.C18544t.InterfaceC18549e
            /* renamed from: a */
            public boolean mo33504a(int i) {
                return EnumC4744e.m97685a(i) != null;
            }
        }

        EnumC4744e(int i) {
            this.f20783b = i;
        }

        /* renamed from: a */
        public static EnumC4744e m97685a(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return GENERIC_CLIENT_ERROR;
            }
            return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
        }

        /* renamed from: b */
        public static C18544t.InterfaceC18549e m97684b() {
            return C4746b.f20784a;
        }

        @Override // com.google.protobuf.C18544t.InterfaceC18547c
        public final int getNumber() {
            return this.f20783b;
        }
    }

    static {
        L73 l73 = new L73();
        DEFAULT_INSTANCE = l73;
        AbstractC18536r.m46054Q(L73.class, l73);
    }

    private L73() {
    }

    /* renamed from: F0 */
    public static C4739b m97749F0() {
        return DEFAULT_INSTANCE.m46042u();
    }

    /* renamed from: m0 */
    public static L73 m97719m0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: A0 */
    public boolean m97754A0() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: B0 */
    public boolean m97753B0() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: C0 */
    public boolean m97752C0() {
        return (this.bitField0_ & 256) != 0;
    }

    /* renamed from: D0 */
    public boolean m97751D0() {
        return (this.bitField0_ & 1024) != 0;
    }

    /* renamed from: E0 */
    public boolean m97750E0() {
        return (this.bitField0_ & 512) != 0;
    }

    /* renamed from: G0 */
    public final void m97748G0(long j) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j;
    }

    /* renamed from: H0 */
    public final void m97747H0(EnumC4741d enumC4741d) {
        this.httpMethod_ = enumC4741d.getNumber();
        this.bitField0_ |= 2;
    }

    /* renamed from: I0 */
    public final void m97746I0(int i) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i;
    }

    /* renamed from: J0 */
    public final void m97745J0(EnumC4744e enumC4744e) {
        this.networkClientErrorReason_ = enumC4744e.getNumber();
        this.bitField0_ |= 16;
    }

    /* renamed from: K0 */
    public final void m97744K0(long j) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j;
    }

    /* renamed from: L0 */
    public final void m97743L0(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* renamed from: M0 */
    public final void m97742M0(long j) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j;
    }

    /* renamed from: N0 */
    public final void m97741N0(long j) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j;
    }

    /* renamed from: O0 */
    public final void m97740O0(long j) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = j;
    }

    /* renamed from: P0 */
    public final void m97739P0(long j) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j;
    }

    /* renamed from: Q0 */
    public final void m97738Q0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* renamed from: h0 */
    public final void m97723h0(Iterable<? extends C45670nQ3> iterable) {
        m97721k0();
        AbstractC18499a.m46336a(iterable, this.perfSessions_);
    }

    /* renamed from: i0 */
    public final void m97722i0() {
        this.bitField0_ &= -65;
        this.responseContentType_ = m97719m0().m97714r0();
    }

    /* renamed from: k0 */
    public final void m97721k0() {
        C18544t.InterfaceC18553i<C45670nQ3> interfaceC18553i = this.perfSessions_;
        if (!interfaceC18553i.mo45974t()) {
            this.perfSessions_ = AbstractC18536r.m46059L(interfaceC18553i);
        }
    }

    /* renamed from: l0 */
    public long m97720l0() {
        return this.clientStartTimeUs_;
    }

    /* renamed from: n0 */
    public EnumC4741d m97718n0() {
        EnumC4741d m97688a = EnumC4741d.m97688a(this.httpMethod_);
        if (m97688a == null) {
            return EnumC4741d.HTTP_METHOD_UNKNOWN;
        }
        return m97688a;
    }

    /* renamed from: o0 */
    public int m97717o0() {
        return this.httpResponseCode_;
    }

    /* renamed from: p0 */
    public List<C45670nQ3> m97716p0() {
        return this.perfSessions_;
    }

    /* renamed from: q0 */
    public long m97715q0() {
        return this.requestPayloadBytes_;
    }

    /* renamed from: r0 */
    public String m97714r0() {
        return this.responseContentType_;
    }

    /* renamed from: s0 */
    public long m97713s0() {
        return this.responsePayloadBytes_;
    }

    /* renamed from: t0 */
    public long m97712t0() {
        return this.timeToRequestCompletedUs_;
    }

    /* renamed from: u0 */
    public long m97711u0() {
        return this.timeToResponseCompletedUs_;
    }

    /* renamed from: v0 */
    public long m97710v0() {
        return this.timeToResponseInitiatedUs_;
    }

    /* renamed from: w0 */
    public String m97709w0() {
        return this.url_;
    }

    @Override // com.google.protobuf.AbstractC18536r
    /* renamed from: x */
    public final Object mo23798x(AbstractC18536r.EnumC18542f enumC18542f, Object obj, Object obj2) {
        switch (C4738a.f20763a[enumC18542f.ordinal()]) {
            case 1:
                return new L73();
            case 2:
                return new C4739b(null);
            case 3:
                return AbstractC18536r.m46057N(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", EnumC4741d.m97687b(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", EnumC4744e.m97684b(), "customAttributes_", C4740c.f20764a, "perfSessions_", C45670nQ3.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                VH3<L73> vh3 = PARSER;
                if (vh3 == null) {
                    synchronized (L73.class) {
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

    /* renamed from: x0 */
    public boolean m97708x0() {
        return (this.bitField0_ & 128) != 0;
    }

    /* renamed from: y0 */
    public boolean m97707y0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: z0 */
    public boolean m97706z0() {
        return (this.bitField0_ & 32) != 0;
    }
}
