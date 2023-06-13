package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: I8 */
/* loaded from: classes6.dex */
public final class C3329I8 extends AbstractC18230t<C3329I8, C3331b> implements InterfaceC51624xT2 {
    private static final C3329I8 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile WH3<C3329I8> PARSER;
    private int keySize_;
    private C4353K8 params_;

    /* renamed from: I8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C3330a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14565a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f14565a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14565a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14565a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14565a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14565a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14565a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14565a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: I8$b */
    /* loaded from: classes6.dex */
    public static final class C3331b extends AbstractC18230t.AbstractC18231a<C3329I8, C3331b> implements InterfaceC51624xT2 {
        public /* synthetic */ C3331b(C3330a c3330a) {
            this();
        }

        /* renamed from: y */
        public C3331b m102920y(int i) {
            m47450o();
            ((C3329I8) this.f74196c).m102922N(i);
            return this;
        }

        /* renamed from: z */
        public C3331b m102919z(C4353K8 c4353k8) {
            m47450o();
            ((C3329I8) this.f74196c).m102921O(c4353k8);
            return this;
        }

        private C3331b() {
            super(C3329I8.DEFAULT_INSTANCE);
        }
    }

    static {
        C3329I8 c3329i8 = new C3329I8();
        DEFAULT_INSTANCE = c3329i8;
        AbstractC18230t.m47478C(C3329I8.class, c3329i8);
    }

    private C3329I8() {
    }

    /* renamed from: I */
    public static C3329I8 m102927I() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: L */
    public static C3331b m102924L() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: M */
    public static C3329I8 m102923M(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C3329I8) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: J */
    public int m102926J() {
        return this.keySize_;
    }

    /* renamed from: K */
    public C4353K8 m102925K() {
        C4353K8 c4353k8 = this.params_;
        return c4353k8 == null ? C4353K8.m99175H() : c4353k8;
    }

    /* renamed from: N */
    public final void m102922N(int i) {
        this.keySize_ = i;
    }

    /* renamed from: O */
    public final void m102921O(C4353K8 c4353k8) {
        c4353k8.getClass();
        this.params_ = c4353k8;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C3330a.f14565a[enumC18236f.ordinal()]) {
            case 1:
                return new C3329I8();
            case 2:
                return new C3331b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C3329I8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C3329I8.class) {
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
