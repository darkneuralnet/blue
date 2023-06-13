package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: u8 */
/* loaded from: classes6.dex */
public final class C29062u8 extends AbstractC18230t<C29062u8, C29064b> implements InterfaceC51624xT2 {
    private static final C29062u8 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile WH3<C29062u8> PARSER;
    private int keySize_;
    private C30042x8 params_;

    /* renamed from: u8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C29063a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f111777a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f111777a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f111777a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f111777a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f111777a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f111777a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f111777a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f111777a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: u8$b */
    /* loaded from: classes6.dex */
    public static final class C29064b extends AbstractC18230t.AbstractC18231a<C29062u8, C29064b> implements InterfaceC51624xT2 {
        public /* synthetic */ C29064b(C29063a c29063a) {
            this();
        }

        /* renamed from: y */
        public C29064b m10826y(int i) {
            m47450o();
            ((C29062u8) this.f74196c).m10828M(i);
            return this;
        }

        /* renamed from: z */
        public C29064b m10825z(C30042x8 c30042x8) {
            m47450o();
            ((C29062u8) this.f74196c).m10827N(c30042x8);
            return this;
        }

        private C29064b() {
            super(C29062u8.DEFAULT_INSTANCE);
        }
    }

    static {
        C29062u8 c29062u8 = new C29062u8();
        DEFAULT_INSTANCE = c29062u8;
        AbstractC18230t.m47478C(C29062u8.class, c29062u8);
    }

    private C29062u8() {
    }

    /* renamed from: K */
    public static C29064b m10830K() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: L */
    public static C29062u8 m10829L(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C29062u8) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: I */
    public int m10832I() {
        return this.keySize_;
    }

    /* renamed from: J */
    public C30042x8 m10831J() {
        C30042x8 c30042x8 = this.params_;
        return c30042x8 == null ? C30042x8.m5827H() : c30042x8;
    }

    /* renamed from: M */
    public final void m10828M(int i) {
        this.keySize_ = i;
    }

    /* renamed from: N */
    public final void m10827N(C30042x8 c30042x8) {
        c30042x8.getClass();
        this.params_ = c30042x8;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C29063a.f111777a[enumC18236f.ordinal()]) {
            case 1:
                return new C29062u8();
            case 2:
                return new C29064b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C29062u8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C29062u8.class) {
                        wh3 = PARSER;
                        if (wh3 == null) {
                            wh3 = new AbstractC18230t.C18232b<>(DEFAULT_INSTANCE);
                            PARSER = wh3;
                        }
                    }
                }
                return wh3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
