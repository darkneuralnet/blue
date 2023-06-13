package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: ql2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47648ql2 extends AbstractC18230t<C47648ql2, C27678b> implements InterfaceC51624xT2 {
    private static final C47648ql2 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile WH3<C47648ql2> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C48241rl2 params_;
    private int version_;

    /* renamed from: ql2$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C27677a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f105736a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f105736a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f105736a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f105736a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f105736a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f105736a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f105736a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f105736a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: ql2$b */
    /* loaded from: classes6.dex */
    public static final class C27678b extends AbstractC18230t.AbstractC18231a<C47648ql2, C27678b> implements InterfaceC51624xT2 {
        public /* synthetic */ C27678b(C27677a c27677a) {
            this();
        }

        /* renamed from: y */
        public C27678b m17132y(C48241rl2 c48241rl2) {
            m47450o();
            ((C47648ql2) this.f74196c).m17134M(c48241rl2);
            return this;
        }

        /* renamed from: z */
        public C27678b m17131z(int i) {
            m47450o();
            ((C47648ql2) this.f74196c).m17133N(i);
            return this;
        }

        private C27678b() {
            super(C47648ql2.DEFAULT_INSTANCE);
        }
    }

    static {
        C47648ql2 c47648ql2 = new C47648ql2();
        DEFAULT_INSTANCE = c47648ql2;
        AbstractC18230t.m47478C(C47648ql2.class, c47648ql2);
    }

    private C47648ql2() {
    }

    /* renamed from: K */
    public static C27678b m17136K() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: L */
    public static C47648ql2 m17135L(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C47648ql2) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: I */
    public C48241rl2 m17138I() {
        C48241rl2 c48241rl2 = this.params_;
        return c48241rl2 == null ? C48241rl2.m15462G() : c48241rl2;
    }

    /* renamed from: J */
    public int m17137J() {
        return this.version_;
    }

    /* renamed from: M */
    public final void m17134M(C48241rl2 c48241rl2) {
        c48241rl2.getClass();
        this.params_ = c48241rl2;
    }

    /* renamed from: N */
    public final void m17133N(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C27677a.f105736a[enumC18236f.ordinal()]) {
            case 1:
                return new C47648ql2();
            case 2:
                return new C27678b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C47648ql2> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C47648ql2.class) {
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
