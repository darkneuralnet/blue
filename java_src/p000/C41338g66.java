package p000;

import com.google.protobuf.AbstractC18499a;
import com.google.protobuf.AbstractC18536r;
import com.google.protobuf.C18457A;
import com.google.protobuf.C18489P;
import com.google.protobuf.C18544t;
import com.google.protobuf.C18565z;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* renamed from: g66  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C41338g66 extends AbstractC18536r<C41338g66, C20751b> implements InterfaceC51031wT2 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final C41338g66 DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile VH3<C41338g66> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private C18457A<String, Long> counters_ = C18457A.m46748g();
    private C18457A<String, String> customAttributes_ = C18457A.m46748g();
    private String name_ = "";
    private C18544t.InterfaceC18553i<C41338g66> subtraces_ = AbstractC18536r.m46038z();
    private C18544t.InterfaceC18553i<C45670nQ3> perfSessions_ = AbstractC18536r.m46038z();

    /* renamed from: g66$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C20750a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f81620a;

        static {
            int[] iArr = new int[AbstractC18536r.EnumC18542f.values().length];
            f81620a = iArr;
            try {
                iArr[AbstractC18536r.EnumC18542f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81620a[AbstractC18536r.EnumC18542f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81620a[AbstractC18536r.EnumC18542f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81620a[AbstractC18536r.EnumC18542f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f81620a[AbstractC18536r.EnumC18542f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f81620a[AbstractC18536r.EnumC18542f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f81620a[AbstractC18536r.EnumC18542f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: g66$b */
    /* loaded from: classes6.dex */
    public static final class C20751b extends AbstractC18536r.AbstractC18537a<C41338g66, C20751b> implements InterfaceC51031wT2 {
        public /* synthetic */ C20751b(C20750a c20750a) {
            this();
        }

        /* renamed from: M */
        public C20751b m40018M(Iterable<? extends C45670nQ3> iterable) {
            m46037A();
            ((C41338g66) this.f74852c).m40040d0(iterable);
            return this;
        }

        /* renamed from: N */
        public C20751b m40017N(Iterable<? extends C41338g66> iterable) {
            m46037A();
            ((C41338g66) this.f74852c).m40039e0(iterable);
            return this;
        }

        /* renamed from: O */
        public C20751b m40016O(C45670nQ3 c45670nQ3) {
            m46037A();
            ((C41338g66) this.f74852c).m40038f0(c45670nQ3);
            return this;
        }

        /* renamed from: P */
        public C20751b m40015P(C41338g66 c41338g66) {
            m46037A();
            ((C41338g66) this.f74852c).m40037g0(c41338g66);
            return this;
        }

        /* renamed from: Q */
        public C20751b m40014Q(Map<String, Long> map) {
            m46037A();
            ((C41338g66) this.f74852c).m40028q0().putAll(map);
            return this;
        }

        /* renamed from: S */
        public C20751b m40013S(Map<String, String> map) {
            m46037A();
            ((C41338g66) this.f74852c).m40027r0().putAll(map);
            return this;
        }

        /* renamed from: U */
        public C20751b m40012U(String str, long j) {
            str.getClass();
            m46037A();
            ((C41338g66) this.f74852c).m40028q0().put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: V */
        public C20751b m40011V(String str, String str2) {
            str.getClass();
            str2.getClass();
            m46037A();
            ((C41338g66) this.f74852c).m40027r0().put(str, str2);
            return this;
        }

        /* renamed from: W */
        public C20751b m40010W(long j) {
            m46037A();
            ((C41338g66) this.f74852c).m40053B0(j);
            return this;
        }

        /* renamed from: X */
        public C20751b m40009X(long j) {
            m46037A();
            ((C41338g66) this.f74852c).m40052C0(j);
            return this;
        }

        /* renamed from: Y */
        public C20751b m40008Y(String str) {
            m46037A();
            ((C41338g66) this.f74852c).m40051D0(str);
            return this;
        }

        private C20751b() {
            super(C41338g66.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: g66$c */
    /* loaded from: classes6.dex */
    public static final class C20752c {

        /* renamed from: a */
        public static final C18565z<String, Long> f81621a = C18565z.m45949d(C18489P.EnumC18491b.f74764l, "", C18489P.EnumC18491b.f74758f, 0L);

        private C20752c() {
        }
    }

    /* renamed from: g66$d */
    /* loaded from: classes6.dex */
    public static final class C20753d {

        /* renamed from: a */
        public static final C18565z<String, String> f81622a;

        static {
            C18489P.EnumC18491b enumC18491b = C18489P.EnumC18491b.f74764l;
            f81622a = C18565z.m45949d(enumC18491b, "", enumC18491b, "");
        }

        private C20753d() {
        }
    }

    static {
        C41338g66 c41338g66 = new C41338g66();
        DEFAULT_INSTANCE = c41338g66;
        AbstractC18536r.m46054Q(C41338g66.class, c41338g66);
    }

    private C41338g66() {
    }

    /* renamed from: A0 */
    public static C20751b m40054A0() {
        return DEFAULT_INSTANCE.m46042u();
    }

    /* renamed from: o0 */
    public static C41338g66 m40030o0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: B0 */
    public final void m40053B0(long j) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j;
    }

    /* renamed from: C0 */
    public final void m40052C0(long j) {
        this.bitField0_ |= 8;
        this.durationUs_ = j;
    }

    /* renamed from: D0 */
    public final void m40051D0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* renamed from: d0 */
    public final void m40040d0(Iterable<? extends C45670nQ3> iterable) {
        m40035i0();
        AbstractC18499a.m46336a(iterable, this.perfSessions_);
    }

    /* renamed from: e0 */
    public final void m40039e0(Iterable<? extends C41338g66> iterable) {
        m40034k0();
        AbstractC18499a.m46336a(iterable, this.subtraces_);
    }

    /* renamed from: f0 */
    public final void m40038f0(C45670nQ3 c45670nQ3) {
        c45670nQ3.getClass();
        m40035i0();
        this.perfSessions_.add(c45670nQ3);
    }

    /* renamed from: g0 */
    public final void m40037g0(C41338g66 c41338g66) {
        c41338g66.getClass();
        m40034k0();
        this.subtraces_.add(c41338g66);
    }

    /* renamed from: h0 */
    public boolean m40036h0(String str) {
        str.getClass();
        return m40021x0().containsKey(str);
    }

    /* renamed from: i0 */
    public final void m40035i0() {
        C18544t.InterfaceC18553i<C45670nQ3> interfaceC18553i = this.perfSessions_;
        if (!interfaceC18553i.mo45974t()) {
            this.perfSessions_ = AbstractC18536r.m46059L(interfaceC18553i);
        }
    }

    /* renamed from: k0 */
    public final void m40034k0() {
        C18544t.InterfaceC18553i<C41338g66> interfaceC18553i = this.subtraces_;
        if (!interfaceC18553i.mo45974t()) {
            this.subtraces_ = AbstractC18536r.m46059L(interfaceC18553i);
        }
    }

    /* renamed from: l0 */
    public int m40033l0() {
        return m40022w0().size();
    }

    /* renamed from: m0 */
    public Map<String, Long> m40032m0() {
        return Collections.unmodifiableMap(m40022w0());
    }

    /* renamed from: n0 */
    public Map<String, String> m40031n0() {
        return Collections.unmodifiableMap(m40021x0());
    }

    /* renamed from: p0 */
    public long m40029p0() {
        return this.durationUs_;
    }

    /* renamed from: q0 */
    public final Map<String, Long> m40028q0() {
        return m40020y0();
    }

    /* renamed from: r0 */
    public final Map<String, String> m40027r0() {
        return m40019z0();
    }

    /* renamed from: s0 */
    public String m40026s0() {
        return this.name_;
    }

    /* renamed from: t0 */
    public List<C45670nQ3> m40025t0() {
        return this.perfSessions_;
    }

    /* renamed from: u0 */
    public List<C41338g66> m40024u0() {
        return this.subtraces_;
    }

    /* renamed from: v0 */
    public boolean m40023v0() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: w0 */
    public final C18457A<String, Long> m40022w0() {
        return this.counters_;
    }

    @Override // com.google.protobuf.AbstractC18536r
    /* renamed from: x */
    public final Object mo23798x(AbstractC18536r.EnumC18542f enumC18542f, Object obj, Object obj2) {
        switch (C20750a.f81620a[enumC18542f.ordinal()]) {
            case 1:
                return new C41338g66();
            case 2:
                return new C20751b(null);
            case 3:
                return AbstractC18536r.m46057N(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", C20752c.f81621a, "subtraces_", C41338g66.class, "customAttributes_", C20753d.f81622a, "perfSessions_", C45670nQ3.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                VH3<C41338g66> vh3 = PARSER;
                if (vh3 == null) {
                    synchronized (C41338g66.class) {
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
    public final C18457A<String, String> m40021x0() {
        return this.customAttributes_;
    }

    /* renamed from: y0 */
    public final C18457A<String, Long> m40020y0() {
        if (!this.counters_.m46744l()) {
            this.counters_ = this.counters_.m46741o();
        }
        return this.counters_;
    }

    /* renamed from: z0 */
    public final C18457A<String, String> m40019z0() {
        if (!this.customAttributes_.m46744l()) {
            this.customAttributes_ = this.customAttributes_.m46741o();
        }
        return this.customAttributes_;
    }
}
