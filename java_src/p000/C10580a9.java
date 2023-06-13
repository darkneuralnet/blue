package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: a9 */
/* loaded from: classes6.dex */
public final class C10580a9 extends AbstractC18230t<C10580a9, C10582b> implements InterfaceC51624xT2 {
    private static final C10580a9 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile WH3<C10580a9> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int keySize_;
    private int version_;

    /* renamed from: a9$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C10581a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49898a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f49898a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f49898a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f49898a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f49898a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f49898a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f49898a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f49898a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: a9$b */
    /* loaded from: classes6.dex */
    public static final class C10582b extends AbstractC18230t.AbstractC18231a<C10580a9, C10582b> implements InterfaceC51624xT2 {
        public /* synthetic */ C10582b(C10581a c10581a) {
            this();
        }

        /* renamed from: y */
        public C10582b m71841y(int i) {
            m47450o();
            ((C10580a9) this.f74196c).m71842K(i);
            return this;
        }

        private C10582b() {
            super(C10580a9.DEFAULT_INSTANCE);
        }
    }

    static {
        C10580a9 c10580a9 = new C10580a9();
        DEFAULT_INSTANCE = c10580a9;
        AbstractC18230t.m47478C(C10580a9.class, c10580a9);
    }

    private C10580a9() {
    }

    /* renamed from: I */
    public static C10582b m71844I() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: J */
    public static C10580a9 m71843J(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C10580a9) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: H */
    public int m71845H() {
        return this.keySize_;
    }

    /* renamed from: K */
    public final void m71842K(int i) {
        this.keySize_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C10581a.f49898a[enumC18236f.ordinal()]) {
            case 1:
                return new C10580a9();
            case 2:
                return new C10582b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C10580a9> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C10580a9.class) {
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
