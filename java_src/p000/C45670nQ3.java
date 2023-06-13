package p000;

import com.google.protobuf.AbstractC18536r;
import com.google.protobuf.C18544t;
/* renamed from: nQ3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45670nQ3 extends AbstractC18536r<C45670nQ3, C26502c> implements InterfaceC51031wT2 {
    private static final C45670nQ3 DEFAULT_INSTANCE;
    private static volatile VH3<C45670nQ3> PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private static final InterfaceC44892m62<Integer, EnumC34147Kv5> sessionVerbosity_converter_ = new C26500a();
    private int bitField0_;
    private String sessionId_ = "";
    private C18544t.InterfaceC18551g sessionVerbosity_ = AbstractC18536r.m46039y();

    /* renamed from: nQ3$a */
    /* loaded from: classes6.dex */
    public class C26500a implements InterfaceC44892m62<Integer, EnumC34147Kv5> {
    }

    /* renamed from: nQ3$b */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C26501b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f99918a;

        static {
            int[] iArr = new int[AbstractC18536r.EnumC18542f.values().length];
            f99918a = iArr;
            try {
                iArr[AbstractC18536r.EnumC18542f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99918a[AbstractC18536r.EnumC18542f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99918a[AbstractC18536r.EnumC18542f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99918a[AbstractC18536r.EnumC18542f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99918a[AbstractC18536r.EnumC18542f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99918a[AbstractC18536r.EnumC18542f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f99918a[AbstractC18536r.EnumC18542f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: nQ3$c */
    /* loaded from: classes6.dex */
    public static final class C26502c extends AbstractC18536r.AbstractC18537a<C45670nQ3, C26502c> implements InterfaceC51031wT2 {
        public /* synthetic */ C26502c(C26500a c26500a) {
            this();
        }

        /* renamed from: M */
        public C26502c m23797M(EnumC34147Kv5 enumC34147Kv5) {
            m46037A();
            ((C45670nQ3) this.f74852c).m23804W(enumC34147Kv5);
            return this;
        }

        /* renamed from: N */
        public C26502c m23796N(String str) {
            m46037A();
            ((C45670nQ3) this.f74852c).m23799b0(str);
            return this;
        }

        private C26502c() {
            super(C45670nQ3.DEFAULT_INSTANCE);
        }
    }

    static {
        C45670nQ3 c45670nQ3 = new C45670nQ3();
        DEFAULT_INSTANCE = c45670nQ3;
        AbstractC18536r.m46054Q(C45670nQ3.class, c45670nQ3);
    }

    private C45670nQ3() {
    }

    /* renamed from: a0 */
    public static C26502c m23800a0() {
        return DEFAULT_INSTANCE.m46042u();
    }

    /* renamed from: W */
    public final void m23804W(EnumC34147Kv5 enumC34147Kv5) {
        enumC34147Kv5.getClass();
        m23803X();
        this.sessionVerbosity_.mo45990L2(enumC34147Kv5.getNumber());
    }

    /* renamed from: X */
    public final void m23803X() {
        C18544t.InterfaceC18551g interfaceC18551g = this.sessionVerbosity_;
        if (!interfaceC18551g.mo45974t()) {
            this.sessionVerbosity_ = AbstractC18536r.m46060K(interfaceC18551g);
        }
    }

    /* renamed from: Y */
    public EnumC34147Kv5 m23802Y(int i) {
        EnumC34147Kv5 m98129a = EnumC34147Kv5.m98129a(this.sessionVerbosity_.getInt(i));
        if (m98129a == null) {
            return EnumC34147Kv5.SESSION_VERBOSITY_NONE;
        }
        return m98129a;
    }

    /* renamed from: Z */
    public int m23801Z() {
        return this.sessionVerbosity_.size();
    }

    /* renamed from: b0 */
    public final void m23799b0(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    @Override // com.google.protobuf.AbstractC18536r
    /* renamed from: x */
    public final Object mo23798x(AbstractC18536r.EnumC18542f enumC18542f, Object obj, Object obj2) {
        switch (C26501b.f99918a[enumC18542f.ordinal()]) {
            case 1:
                return new C45670nQ3();
            case 2:
                return new C26502c(null);
            case 3:
                return AbstractC18536r.m46057N(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001e", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", EnumC34147Kv5.m98128b()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                VH3<C45670nQ3> vh3 = PARSER;
                if (vh3 == null) {
                    synchronized (C45670nQ3.class) {
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
