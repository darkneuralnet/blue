package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
/* renamed from: K8 */
/* loaded from: classes6.dex */
public final class C4353K8 extends AbstractC18230t<C4353K8, C4355b> implements InterfaceC51624xT2 {
    private static final C4353K8 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile WH3<C4353K8> PARSER;
    private int ivSize_;

    /* renamed from: K8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C4354a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19150a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f19150a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19150a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19150a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19150a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19150a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19150a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19150a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: K8$b */
    /* loaded from: classes6.dex */
    public static final class C4355b extends AbstractC18230t.AbstractC18231a<C4353K8, C4355b> implements InterfaceC51624xT2 {
        public /* synthetic */ C4355b(C4354a c4354a) {
            this();
        }

        /* renamed from: y */
        public C4355b m99171y(int i) {
            m47450o();
            ((C4353K8) this.f74196c).m99172K(i);
            return this;
        }

        private C4355b() {
            super(C4353K8.DEFAULT_INSTANCE);
        }
    }

    static {
        C4353K8 c4353k8 = new C4353K8();
        DEFAULT_INSTANCE = c4353k8;
        AbstractC18230t.m47478C(C4353K8.class, c4353k8);
    }

    private C4353K8() {
    }

    /* renamed from: H */
    public static C4353K8 m99175H() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public static C4355b m99173J() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: I */
    public int m99174I() {
        return this.ivSize_;
    }

    /* renamed from: K */
    public final void m99172K(int i) {
        this.ivSize_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C4354a.f19150a[enumC18236f.ordinal()]) {
            case 1:
                return new C4353K8();
            case 2:
                return new C4355b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C4353K8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C4353K8.class) {
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
