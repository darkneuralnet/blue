package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
/* renamed from: x8 */
/* loaded from: classes6.dex */
public final class C30042x8 extends AbstractC18230t<C30042x8, C30044b> implements InterfaceC51624xT2 {
    private static final C30042x8 DEFAULT_INSTANCE;
    private static volatile WH3<C30042x8> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    /* renamed from: x8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C30043a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f117116a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f117116a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f117116a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f117116a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f117116a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f117116a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f117116a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f117116a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: x8$b */
    /* loaded from: classes6.dex */
    public static final class C30044b extends AbstractC18230t.AbstractC18231a<C30042x8, C30044b> implements InterfaceC51624xT2 {
        public /* synthetic */ C30044b(C30043a c30043a) {
            this();
        }

        /* renamed from: y */
        public C30044b m5823y(int i) {
            m47450o();
            ((C30042x8) this.f74196c).m5824K(i);
            return this;
        }

        private C30044b() {
            super(C30042x8.DEFAULT_INSTANCE);
        }
    }

    static {
        C30042x8 c30042x8 = new C30042x8();
        DEFAULT_INSTANCE = c30042x8;
        AbstractC18230t.m47478C(C30042x8.class, c30042x8);
    }

    private C30042x8() {
    }

    /* renamed from: H */
    public static C30042x8 m5827H() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: J */
    public static C30044b m5825J() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: I */
    public int m5826I() {
        return this.tagSize_;
    }

    /* renamed from: K */
    public final void m5824K(int i) {
        this.tagSize_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C30043a.f117116a[enumC18236f.ordinal()]) {
            case 1:
                return new C30042x8();
            case 2:
                return new C30044b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C30042x8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C30042x8.class) {
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
