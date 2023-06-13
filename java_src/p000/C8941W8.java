package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: W8 */
/* loaded from: classes6.dex */
public final class C8941W8 extends AbstractC18230t<C8941W8, C8943b> implements InterfaceC51624xT2 {
    private static final C8941W8 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile WH3<C8941W8> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int keySize_;
    private int version_;

    /* renamed from: W8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C8942a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40462a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f40462a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40462a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40462a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40462a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40462a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40462a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40462a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: W8$b */
    /* loaded from: classes6.dex */
    public static final class C8943b extends AbstractC18230t.AbstractC18231a<C8941W8, C8943b> implements InterfaceC51624xT2 {
        public /* synthetic */ C8943b(C8942a c8942a) {
            this();
        }

        /* renamed from: y */
        public C8943b m78794y(int i) {
            m47450o();
            ((C8941W8) this.f74196c).m78795K(i);
            return this;
        }

        private C8943b() {
            super(C8941W8.DEFAULT_INSTANCE);
        }
    }

    static {
        C8941W8 c8941w8 = new C8941W8();
        DEFAULT_INSTANCE = c8941w8;
        AbstractC18230t.m47478C(C8941W8.class, c8941w8);
    }

    private C8941W8() {
    }

    /* renamed from: I */
    public static C8943b m78797I() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: J */
    public static C8941W8 m78796J(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C8941W8) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: H */
    public int m78798H() {
        return this.keySize_;
    }

    /* renamed from: K */
    public final void m78795K(int i) {
        this.keySize_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C8942a.f40462a[enumC18236f.ordinal()]) {
            case 1:
                return new C8941W8();
            case 2:
                return new C8943b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C8941W8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C8941W8.class) {
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
