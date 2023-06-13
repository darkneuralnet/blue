package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: H8 */
/* loaded from: classes6.dex */
public final class C3030H8 extends AbstractC18230t<C3030H8, C3032b> implements InterfaceC51624xT2 {
    private static final C3030H8 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile WH3<C3030H8> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC18199g keyValue_ = AbstractC18199g.f74142c;
    private C4353K8 params_;
    private int version_;

    /* renamed from: H8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C3031a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12882a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f12882a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12882a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12882a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12882a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12882a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12882a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12882a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: H8$b */
    /* loaded from: classes6.dex */
    public static final class C3032b extends AbstractC18230t.AbstractC18231a<C3030H8, C3032b> implements InterfaceC51624xT2 {
        public /* synthetic */ C3032b(C3031a c3031a) {
            this();
        }

        /* renamed from: A */
        public C3032b m104368A(int i) {
            m47450o();
            ((C3030H8) this.f74196c).m104369R(i);
            return this;
        }

        /* renamed from: y */
        public C3032b m104367y(AbstractC18199g abstractC18199g) {
            m47450o();
            ((C3030H8) this.f74196c).m104371P(abstractC18199g);
            return this;
        }

        /* renamed from: z */
        public C3032b m104366z(C4353K8 c4353k8) {
            m47450o();
            ((C3030H8) this.f74196c).m104370Q(c4353k8);
            return this;
        }

        private C3032b() {
            super(C3030H8.DEFAULT_INSTANCE);
        }
    }

    static {
        C3030H8 c3030h8 = new C3030H8();
        DEFAULT_INSTANCE = c3030h8;
        AbstractC18230t.m47478C(C3030H8.class, c3030h8);
    }

    private C3030H8() {
    }

    /* renamed from: J */
    public static C3030H8 m104377J() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: N */
    public static C3032b m104373N() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: O */
    public static C3030H8 m104372O(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C3030H8) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: K */
    public AbstractC18199g m104376K() {
        return this.keyValue_;
    }

    /* renamed from: L */
    public C4353K8 m104375L() {
        C4353K8 c4353k8 = this.params_;
        return c4353k8 == null ? C4353K8.m99175H() : c4353k8;
    }

    /* renamed from: M */
    public int m104374M() {
        return this.version_;
    }

    /* renamed from: P */
    public final void m104371P(AbstractC18199g abstractC18199g) {
        abstractC18199g.getClass();
        this.keyValue_ = abstractC18199g;
    }

    /* renamed from: Q */
    public final void m104370Q(C4353K8 c4353k8) {
        c4353k8.getClass();
        this.params_ = c4353k8;
    }

    /* renamed from: R */
    public final void m104369R(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C3031a.f12882a[enumC18236f.ordinal()]) {
            case 1:
                return new C3030H8();
            case 2:
                return new C3032b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C3030H8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C3030H8.class) {
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
