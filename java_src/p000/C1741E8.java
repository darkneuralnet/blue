package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: E8 */
/* loaded from: classes6.dex */
public final class C1741E8 extends AbstractC18230t<C1741E8, C1743b> implements InterfaceC51624xT2 {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final C1741E8 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile WH3<C1741E8> PARSER;
    private C3329I8 aesCtrKeyFormat_;
    private UM1 hmacKeyFormat_;

    /* renamed from: E8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C1742a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6998a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f6998a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6998a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6998a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6998a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6998a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6998a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6998a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: E8$b */
    /* loaded from: classes6.dex */
    public static final class C1743b extends AbstractC18230t.AbstractC18231a<C1741E8, C1743b> implements InterfaceC51624xT2 {
        public /* synthetic */ C1743b(C1742a c1742a) {
            this();
        }

        /* renamed from: y */
        public C1743b m109352y(C3329I8 c3329i8) {
            m47450o();
            ((C1741E8) this.f74196c).m109354M(c3329i8);
            return this;
        }

        /* renamed from: z */
        public C1743b m109351z(UM1 um1) {
            m47450o();
            ((C1741E8) this.f74196c).m109353N(um1);
            return this;
        }

        private C1743b() {
            super(C1741E8.DEFAULT_INSTANCE);
        }
    }

    static {
        C1741E8 c1741e8 = new C1741E8();
        DEFAULT_INSTANCE = c1741e8;
        AbstractC18230t.m47478C(C1741E8.class, c1741e8);
    }

    private C1741E8() {
    }

    /* renamed from: K */
    public static C1743b m109356K() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: L */
    public static C1741E8 m109355L(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C1741E8) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: I */
    public C3329I8 m109358I() {
        C3329I8 c3329i8 = this.aesCtrKeyFormat_;
        return c3329i8 == null ? C3329I8.m102927I() : c3329i8;
    }

    /* renamed from: J */
    public UM1 m109357J() {
        UM1 um1 = this.hmacKeyFormat_;
        return um1 == null ? UM1.m81605I() : um1;
    }

    /* renamed from: M */
    public final void m109354M(C3329I8 c3329i8) {
        c3329i8.getClass();
        this.aesCtrKeyFormat_ = c3329i8;
    }

    /* renamed from: N */
    public final void m109353N(UM1 um1) {
        um1.getClass();
        this.hmacKeyFormat_ = um1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C1742a.f6998a[enumC18236f.ordinal()]) {
            case 1:
                return new C1741E8();
            case 2:
                return new C1743b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C1741E8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C1741E8.class) {
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
