package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
/* renamed from: Kk2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34045Kk2 extends AbstractC18230t<C34045Kk2, C4586b> implements InterfaceC51624xT2 {
    private static final C34045Kk2 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile WH3<C34045Kk2> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC18199g value_ = AbstractC18199g.f74142c;

    /* renamed from: Kk2$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C4585a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20167a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f20167a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20167a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20167a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20167a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20167a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20167a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20167a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: Kk2$b */
    /* loaded from: classes6.dex */
    public static final class C4586b extends AbstractC18230t.AbstractC18231a<C34045Kk2, C4586b> implements InterfaceC51624xT2 {
        public /* synthetic */ C4586b(C4585a c4585a) {
            this();
        }

        /* renamed from: A */
        public C4586b m98324A(AbstractC18199g abstractC18199g) {
            m47450o();
            ((C34045Kk2) this.f74196c).m98325Q(abstractC18199g);
            return this;
        }

        /* renamed from: y */
        public C4586b m98323y(EnumC40189eA3 enumC40189eA3) {
            m47450o();
            ((C34045Kk2) this.f74196c).m98327O(enumC40189eA3);
            return this;
        }

        /* renamed from: z */
        public C4586b m98322z(String str) {
            m47450o();
            ((C34045Kk2) this.f74196c).m98326P(str);
            return this;
        }

        private C4586b() {
            super(C34045Kk2.DEFAULT_INSTANCE);
        }
    }

    static {
        C34045Kk2 c34045Kk2 = new C34045Kk2();
        DEFAULT_INSTANCE = c34045Kk2;
        AbstractC18230t.m47478C(C34045Kk2.class, c34045Kk2);
    }

    private C34045Kk2() {
    }

    /* renamed from: J */
    public static C34045Kk2 m98332J() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: N */
    public static C4586b m98328N() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: K */
    public EnumC40189eA3 m98331K() {
        EnumC40189eA3 m43160a = EnumC40189eA3.m43160a(this.outputPrefixType_);
        if (m43160a == null) {
            return EnumC40189eA3.UNRECOGNIZED;
        }
        return m43160a;
    }

    /* renamed from: L */
    public String m98330L() {
        return this.typeUrl_;
    }

    /* renamed from: M */
    public AbstractC18199g m98329M() {
        return this.value_;
    }

    /* renamed from: O */
    public final void m98327O(EnumC40189eA3 enumC40189eA3) {
        this.outputPrefixType_ = enumC40189eA3.getNumber();
    }

    /* renamed from: P */
    public final void m98326P(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* renamed from: Q */
    public final void m98325Q(AbstractC18199g abstractC18199g) {
        abstractC18199g.getClass();
        this.value_ = abstractC18199g;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C4585a.f20167a[enumC18236f.ordinal()]) {
            case 1:
                return new C34045Kk2();
            case 2:
                return new C4586b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C34045Kk2> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C34045Kk2.class) {
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
