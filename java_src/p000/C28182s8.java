package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: s8 */
/* loaded from: classes6.dex */
public final class C28182s8 extends AbstractC18230t<C28182s8, C28184b> implements InterfaceC51624xT2 {
    private static final C28182s8 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile WH3<C28182s8> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC18199g keyValue_ = AbstractC18199g.f74142c;
    private C30042x8 params_;
    private int version_;

    /* renamed from: s8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C28183a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f108323a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f108323a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f108323a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f108323a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f108323a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f108323a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f108323a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f108323a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: s8$b */
    /* loaded from: classes6.dex */
    public static final class C28184b extends AbstractC18230t.AbstractC18231a<C28182s8, C28184b> implements InterfaceC51624xT2 {
        public /* synthetic */ C28184b(C28183a c28183a) {
            this();
        }

        /* renamed from: A */
        public C28184b m14742A(int i) {
            m47450o();
            ((C28182s8) this.f74196c).m14743Q(i);
            return this;
        }

        /* renamed from: y */
        public C28184b m14741y(AbstractC18199g abstractC18199g) {
            m47450o();
            ((C28182s8) this.f74196c).m14745O(abstractC18199g);
            return this;
        }

        /* renamed from: z */
        public C28184b m14740z(C30042x8 c30042x8) {
            m47450o();
            ((C28182s8) this.f74196c).m14744P(c30042x8);
            return this;
        }

        private C28184b() {
            super(C28182s8.DEFAULT_INSTANCE);
        }
    }

    static {
        C28182s8 c28182s8 = new C28182s8();
        DEFAULT_INSTANCE = c28182s8;
        AbstractC18230t.m47478C(C28182s8.class, c28182s8);
    }

    private C28182s8() {
    }

    /* renamed from: M */
    public static C28184b m14747M() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: N */
    public static C28182s8 m14746N(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C28182s8) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: J */
    public AbstractC18199g m14750J() {
        return this.keyValue_;
    }

    /* renamed from: K */
    public C30042x8 m14749K() {
        C30042x8 c30042x8 = this.params_;
        return c30042x8 == null ? C30042x8.m5827H() : c30042x8;
    }

    /* renamed from: L */
    public int m14748L() {
        return this.version_;
    }

    /* renamed from: O */
    public final void m14745O(AbstractC18199g abstractC18199g) {
        abstractC18199g.getClass();
        this.keyValue_ = abstractC18199g;
    }

    /* renamed from: P */
    public final void m14744P(C30042x8 c30042x8) {
        c30042x8.getClass();
        this.params_ = c30042x8;
    }

    /* renamed from: Q */
    public final void m14743Q(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C28183a.f108323a[enumC18236f.ordinal()]) {
            case 1:
                return new C28182s8();
            case 2:
                return new C28184b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C28182s8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C28182s8.class) {
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
