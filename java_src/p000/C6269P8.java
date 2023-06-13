package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
/* renamed from: P8 */
/* loaded from: classes6.dex */
public final class C6269P8 extends AbstractC18230t<C6269P8, C6271b> implements InterfaceC51624xT2 {
    private static final C6269P8 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile WH3<C6269P8> PARSER;
    private int ivSize_;

    /* renamed from: P8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C6270a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27949a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f27949a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27949a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27949a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27949a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27949a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27949a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27949a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: P8$b */
    /* loaded from: classes6.dex */
    public static final class C6271b extends AbstractC18230t.AbstractC18231a<C6269P8, C6271b> implements InterfaceC51624xT2 {
        public /* synthetic */ C6271b(C6270a c6270a) {
            this();
        }

        /* renamed from: y */
        public C6271b m90715y(int i) {
            m47450o();
            ((C6269P8) this.f74196c).m90716K(i);
            return this;
        }

        private C6271b() {
            super(C6269P8.DEFAULT_INSTANCE);
        }
    }

    static {
        C6269P8 c6269p8 = new C6269P8();
        DEFAULT_INSTANCE = c6269p8;
        AbstractC18230t.m47478C(C6269P8.class, c6269p8);
    }

    private C6269P8() {
    }

    /* renamed from: H */
    public static C6269P8 m90719H() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public static C6271b m90717J() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: I */
    public int m90718I() {
        return this.ivSize_;
    }

    /* renamed from: K */
    public final void m90716K(int i) {
        this.ivSize_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C6270a.f27949a[enumC18236f.ordinal()]) {
            case 1:
                return new C6269P8();
            case 2:
                return new C6271b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C6269P8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C6269P8.class) {
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
