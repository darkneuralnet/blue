package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: M8 */
/* loaded from: classes6.dex */
public final class C5205M8 extends AbstractC18230t<C5205M8, C5207b> implements InterfaceC51624xT2 {
    private static final C5205M8 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile WH3<C5205M8> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC18199g keyValue_ = AbstractC18199g.f74142c;
    private C6269P8 params_;
    private int version_;

    /* renamed from: M8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C5206a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22692a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f22692a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22692a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22692a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22692a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22692a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22692a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f22692a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: M8$b */
    /* loaded from: classes6.dex */
    public static final class C5207b extends AbstractC18230t.AbstractC18231a<C5205M8, C5207b> implements InterfaceC51624xT2 {
        public /* synthetic */ C5207b(C5206a c5206a) {
            this();
        }

        /* renamed from: A */
        public C5207b m95697A(int i) {
            m47450o();
            ((C5205M8) this.f74196c).m95698Q(i);
            return this;
        }

        /* renamed from: y */
        public C5207b m95696y(AbstractC18199g abstractC18199g) {
            m47450o();
            ((C5205M8) this.f74196c).m95700O(abstractC18199g);
            return this;
        }

        /* renamed from: z */
        public C5207b m95695z(C6269P8 c6269p8) {
            m47450o();
            ((C5205M8) this.f74196c).m95699P(c6269p8);
            return this;
        }

        private C5207b() {
            super(C5205M8.DEFAULT_INSTANCE);
        }
    }

    static {
        C5205M8 c5205m8 = new C5205M8();
        DEFAULT_INSTANCE = c5205m8;
        AbstractC18230t.m47478C(C5205M8.class, c5205m8);
    }

    private C5205M8() {
    }

    /* renamed from: M */
    public static C5207b m95702M() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: N */
    public static C5205M8 m95701N(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C5205M8) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: J */
    public AbstractC18199g m95705J() {
        return this.keyValue_;
    }

    /* renamed from: K */
    public C6269P8 m95704K() {
        C6269P8 c6269p8 = this.params_;
        return c6269p8 == null ? C6269P8.m90719H() : c6269p8;
    }

    /* renamed from: L */
    public int m95703L() {
        return this.version_;
    }

    /* renamed from: O */
    public final void m95700O(AbstractC18199g abstractC18199g) {
        abstractC18199g.getClass();
        this.keyValue_ = abstractC18199g;
    }

    /* renamed from: P */
    public final void m95699P(C6269P8 c6269p8) {
        c6269p8.getClass();
        this.params_ = c6269p8;
    }

    /* renamed from: Q */
    public final void m95698Q(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C5206a.f22692a[enumC18236f.ordinal()]) {
            case 1:
                return new C5205M8();
            case 2:
                return new C5207b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C5205M8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C5205M8.class) {
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
