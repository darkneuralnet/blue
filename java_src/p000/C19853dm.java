package p000;

import com.google.protobuf.AbstractC18536r;
import com.google.protobuf.C18457A;
import com.google.protobuf.C18489P;
import com.google.protobuf.C18565z;
import java.util.Map;
import p000.C26127mb;
/* renamed from: dm */
/* loaded from: classes6.dex */
public final class C19853dm extends AbstractC18536r<C19853dm, C19855b> implements InterfaceC51031wT2 {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final C19853dm DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile VH3<C19853dm> PARSER;
    private C26127mb androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private C18457A<String, String> customAttributes_ = C18457A.m46748g();
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    /* renamed from: dm$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C19854a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f77182a;

        static {
            int[] iArr = new int[AbstractC18536r.EnumC18542f.values().length];
            f77182a = iArr;
            try {
                iArr[AbstractC18536r.EnumC18542f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77182a[AbstractC18536r.EnumC18542f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77182a[AbstractC18536r.EnumC18542f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77182a[AbstractC18536r.EnumC18542f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f77182a[AbstractC18536r.EnumC18542f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f77182a[AbstractC18536r.EnumC18542f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f77182a[AbstractC18536r.EnumC18542f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: dm$b */
    /* loaded from: classes6.dex */
    public static final class C19855b extends AbstractC18536r.AbstractC18537a<C19853dm, C19855b> implements InterfaceC51031wT2 {
        public /* synthetic */ C19855b(C19854a c19854a) {
            this();
        }

        /* renamed from: M */
        public boolean m43740M() {
            return ((C19853dm) this.f74852c).m43749d0();
        }

        /* renamed from: N */
        public C19855b m43739N(Map<String, String> map) {
            m46037A();
            ((C19853dm) this.f74852c).m43751b0().putAll(map);
            return this;
        }

        /* renamed from: O */
        public C19855b m43738O(C26127mb.C26129b c26129b) {
            m46037A();
            ((C19853dm) this.f74852c).m43744i0(c26129b.build());
            return this;
        }

        /* renamed from: P */
        public C19855b m43737P(String str) {
            m46037A();
            ((C19853dm) this.f74852c).m43743k0(str);
            return this;
        }

        /* renamed from: Q */
        public C19855b m43736Q(EnumC23350im enumC23350im) {
            m46037A();
            ((C19853dm) this.f74852c).m43742l0(enumC23350im);
            return this;
        }

        /* renamed from: S */
        public C19855b m43735S(String str) {
            m46037A();
            ((C19853dm) this.f74852c).m43741m0(str);
            return this;
        }

        private C19855b() {
            super(C19853dm.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: dm$c */
    /* loaded from: classes6.dex */
    public static final class C19856c {

        /* renamed from: a */
        public static final C18565z<String, String> f77183a;

        static {
            C18489P.EnumC18491b enumC18491b = C18489P.EnumC18491b.f74764l;
            f77183a = C18565z.m45949d(enumC18491b, "", enumC18491b, "");
        }

        private C19856c() {
        }
    }

    static {
        C19853dm c19853dm = new C19853dm();
        DEFAULT_INSTANCE = c19853dm;
        AbstractC18536r.m46054Q(C19853dm.class, c19853dm);
    }

    private C19853dm() {
    }

    /* renamed from: a0 */
    public static C19853dm m43752a0() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: h0 */
    public static C19855b m43745h0() {
        return DEFAULT_INSTANCE.m46042u();
    }

    /* renamed from: Z */
    public C26127mb m43753Z() {
        C26127mb c26127mb = this.androidAppInfo_;
        return c26127mb == null ? C26127mb.m25383X() : c26127mb;
    }

    /* renamed from: b0 */
    public final Map<String, String> m43751b0() {
        return m43746g0();
    }

    /* renamed from: c0 */
    public boolean m43750c0() {
        return (this.bitField0_ & 4) != 0;
    }

    /* renamed from: d0 */
    public boolean m43749d0() {
        return (this.bitField0_ & 2) != 0;
    }

    /* renamed from: e0 */
    public boolean m43748e0() {
        return (this.bitField0_ & 8) != 0;
    }

    /* renamed from: f0 */
    public boolean m43747f0() {
        return (this.bitField0_ & 1) != 0;
    }

    /* renamed from: g0 */
    public final C18457A<String, String> m43746g0() {
        if (!this.customAttributes_.m46744l()) {
            this.customAttributes_ = this.customAttributes_.m46741o();
        }
        return this.customAttributes_;
    }

    /* renamed from: i0 */
    public final void m43744i0(C26127mb c26127mb) {
        c26127mb.getClass();
        this.androidAppInfo_ = c26127mb;
        this.bitField0_ |= 4;
    }

    /* renamed from: k0 */
    public final void m43743k0(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appInstanceId_ = str;
    }

    /* renamed from: l0 */
    public final void m43742l0(EnumC23350im enumC23350im) {
        this.applicationProcessState_ = enumC23350im.getNumber();
        this.bitField0_ |= 8;
    }

    /* renamed from: m0 */
    public final void m43741m0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.googleAppId_ = str;
    }

    @Override // com.google.protobuf.AbstractC18536r
    /* renamed from: x */
    public final Object mo23798x(AbstractC18536r.EnumC18542f enumC18542f, Object obj, Object obj2) {
        switch (C19854a.f77182a[enumC18542f.ordinal()]) {
            case 1:
                return new C19853dm();
            case 2:
                return new C19855b(null);
            case 3:
                return AbstractC18536r.m46057N(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005ဌ\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", EnumC23350im.m33506b(), "customAttributes_", C19856c.f77183a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                VH3<C19853dm> vh3 = PARSER;
                if (vh3 == null) {
                    synchronized (C19853dm.class) {
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
