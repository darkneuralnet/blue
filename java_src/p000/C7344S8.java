package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: S8 */
/* loaded from: classes6.dex */
public final class C7344S8 extends AbstractC18230t<C7344S8, C7346b> implements InterfaceC51624xT2 {
    private static final C7344S8 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile WH3<C7344S8> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    /* renamed from: S8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C7345a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33230a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f33230a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33230a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33230a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33230a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33230a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33230a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33230a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: S8$b */
    /* loaded from: classes6.dex */
    public static final class C7346b extends AbstractC18230t.AbstractC18231a<C7344S8, C7346b> implements InterfaceC51624xT2 {
        public /* synthetic */ C7346b(C7345a c7345a) {
            this();
        }

        /* renamed from: y */
        public C7346b m85926y(int i) {
            m47450o();
            ((C7344S8) this.f74196c).m85927K(i);
            return this;
        }

        private C7346b() {
            super(C7344S8.DEFAULT_INSTANCE);
        }
    }

    static {
        C7344S8 c7344s8 = new C7344S8();
        DEFAULT_INSTANCE = c7344s8;
        AbstractC18230t.m47478C(C7344S8.class, c7344s8);
    }

    private C7344S8() {
    }

    /* renamed from: I */
    public static C7346b m85929I() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: J */
    public static C7344S8 m85928J(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C7344S8) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: H */
    public int m85930H() {
        return this.keySize_;
    }

    /* renamed from: K */
    public final void m85927K(int i) {
        this.keySize_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C7345a.f33230a[enumC18236f.ordinal()]) {
            case 1:
                return new C7344S8();
            case 2:
                return new C7346b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C7344S8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C7344S8.class) {
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
