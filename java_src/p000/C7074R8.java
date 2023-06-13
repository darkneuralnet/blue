package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: R8 */
/* loaded from: classes6.dex */
public final class C7074R8 extends AbstractC18230t<C7074R8, C7076b> implements InterfaceC51624xT2 {
    private static final C7074R8 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile WH3<C7074R8> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC18199g keyValue_ = AbstractC18199g.f74142c;
    private int version_;

    /* renamed from: R8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C7075a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31584a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f31584a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31584a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31584a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31584a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31584a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31584a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31584a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: R8$b */
    /* loaded from: classes6.dex */
    public static final class C7076b extends AbstractC18230t.AbstractC18231a<C7074R8, C7076b> implements InterfaceC51624xT2 {
        public /* synthetic */ C7076b(C7075a c7075a) {
            this();
        }

        /* renamed from: y */
        public C7076b m87268y(AbstractC18199g abstractC18199g) {
            m47450o();
            ((C7074R8) this.f74196c).m87270M(abstractC18199g);
            return this;
        }

        /* renamed from: z */
        public C7076b m87267z(int i) {
            m47450o();
            ((C7074R8) this.f74196c).m87269N(i);
            return this;
        }

        private C7076b() {
            super(C7074R8.DEFAULT_INSTANCE);
        }
    }

    static {
        C7074R8 c7074r8 = new C7074R8();
        DEFAULT_INSTANCE = c7074r8;
        AbstractC18230t.m47478C(C7074R8.class, c7074r8);
    }

    private C7074R8() {
    }

    /* renamed from: K */
    public static C7076b m87272K() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: L */
    public static C7074R8 m87271L(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C7074R8) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: I */
    public AbstractC18199g m87274I() {
        return this.keyValue_;
    }

    /* renamed from: J */
    public int m87273J() {
        return this.version_;
    }

    /* renamed from: M */
    public final void m87270M(AbstractC18199g abstractC18199g) {
        abstractC18199g.getClass();
        this.keyValue_ = abstractC18199g;
    }

    /* renamed from: N */
    public final void m87269N(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C7075a.f31584a[enumC18236f.ordinal()]) {
            case 1:
                return new C7074R8();
            case 2:
                return new C7076b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C7074R8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C7074R8.class) {
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
