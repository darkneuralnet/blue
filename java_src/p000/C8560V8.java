package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: V8 */
/* loaded from: classes6.dex */
public final class C8560V8 extends AbstractC18230t<C8560V8, C8562b> implements InterfaceC51624xT2 {
    private static final C8560V8 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile WH3<C8560V8> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC18199g keyValue_ = AbstractC18199g.f74142c;
    private int version_;

    /* renamed from: V8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C8561a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38669a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f38669a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38669a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38669a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38669a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38669a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38669a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38669a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: V8$b */
    /* loaded from: classes6.dex */
    public static final class C8562b extends AbstractC18230t.AbstractC18231a<C8560V8, C8562b> implements InterfaceC51624xT2 {
        public /* synthetic */ C8562b(C8561a c8561a) {
            this();
        }

        /* renamed from: y */
        public C8562b m80325y(AbstractC18199g abstractC18199g) {
            m47450o();
            ((C8560V8) this.f74196c).m80327M(abstractC18199g);
            return this;
        }

        /* renamed from: z */
        public C8562b m80324z(int i) {
            m47450o();
            ((C8560V8) this.f74196c).m80326N(i);
            return this;
        }

        private C8562b() {
            super(C8560V8.DEFAULT_INSTANCE);
        }
    }

    static {
        C8560V8 c8560v8 = new C8560V8();
        DEFAULT_INSTANCE = c8560v8;
        AbstractC18230t.m47478C(C8560V8.class, c8560v8);
    }

    private C8560V8() {
    }

    /* renamed from: K */
    public static C8562b m80329K() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: L */
    public static C8560V8 m80328L(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C8560V8) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: I */
    public AbstractC18199g m80331I() {
        return this.keyValue_;
    }

    /* renamed from: J */
    public int m80330J() {
        return this.version_;
    }

    /* renamed from: M */
    public final void m80327M(AbstractC18199g abstractC18199g) {
        abstractC18199g.getClass();
        this.keyValue_ = abstractC18199g;
    }

    /* renamed from: N */
    public final void m80326N(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C8561a.f38669a[enumC18236f.ordinal()]) {
            case 1:
                return new C8560V8();
            case 2:
                return new C8562b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C8560V8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C8560V8.class) {
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
