package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18238v;
/* renamed from: ml2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C45276ml2 extends AbstractC18230t<C45276ml2, C26194b> implements InterfaceC51624xT2 {
    private static final C45276ml2 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile WH3<C45276ml2> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C18238v.InterfaceC18247i<C26195c> keyInfo_ = AbstractC18230t.m47468o();
    private int primaryKeyId_;

    /* renamed from: ml2$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C26193a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f98672a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f98672a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98672a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98672a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f98672a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f98672a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f98672a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f98672a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: ml2$b */
    /* loaded from: classes6.dex */
    public static final class C26194b extends AbstractC18230t.AbstractC18231a<C45276ml2, C26194b> implements InterfaceC51624xT2 {
        public /* synthetic */ C26194b(C26193a c26193a) {
            this();
        }

        /* renamed from: y */
        public C26194b m25095y(C26195c c26195c) {
            m47450o();
            ((C45276ml2) this.f74196c).m25100I(c26195c);
            return this;
        }

        /* renamed from: z */
        public C26194b m25094z(int i) {
            m47450o();
            ((C45276ml2) this.f74196c).m25096M(i);
            return this;
        }

        private C26194b() {
            super(C45276ml2.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: ml2$c */
    /* loaded from: classes6.dex */
    public static final class C26195c extends AbstractC18230t<C26195c, C26196a> implements InterfaceC51624xT2 {
        private static final C26195c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile WH3<C26195c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = "";

        /* renamed from: ml2$c$a */
        /* loaded from: classes6.dex */
        public static final class C26196a extends AbstractC18230t.AbstractC18231a<C26195c, C26196a> implements InterfaceC51624xT2 {
            public /* synthetic */ C26196a(C26193a c26193a) {
                this();
            }

            /* renamed from: A */
            public C26196a m25082A(EnumC33577Ik2 enumC33577Ik2) {
                m47450o();
                ((C26195c) this.f74196c).m25084O(enumC33577Ik2);
                return this;
            }

            /* renamed from: B */
            public C26196a m25081B(String str) {
                m47450o();
                ((C26195c) this.f74196c).m25083P(str);
                return this;
            }

            /* renamed from: y */
            public C26196a m25080y(int i) {
                m47450o();
                ((C26195c) this.f74196c).m25086M(i);
                return this;
            }

            /* renamed from: z */
            public C26196a m25079z(EnumC40189eA3 enumC40189eA3) {
                m47450o();
                ((C26195c) this.f74196c).m25085N(enumC40189eA3);
                return this;
            }

            private C26196a() {
                super(C26195c.DEFAULT_INSTANCE);
            }
        }

        static {
            C26195c c26195c = new C26195c();
            DEFAULT_INSTANCE = c26195c;
            AbstractC18230t.m47478C(C26195c.class, c26195c);
        }

        private C26195c() {
        }

        /* renamed from: L */
        public static C26196a m25087L() {
            return DEFAULT_INSTANCE.m47471k();
        }

        /* renamed from: K */
        public int m25088K() {
            return this.keyId_;
        }

        /* renamed from: M */
        public final void m25086M(int i) {
            this.keyId_ = i;
        }

        /* renamed from: N */
        public final void m25085N(EnumC40189eA3 enumC40189eA3) {
            this.outputPrefixType_ = enumC40189eA3.getNumber();
        }

        /* renamed from: O */
        public final void m25084O(EnumC33577Ik2 enumC33577Ik2) {
            this.status_ = enumC33577Ik2.getNumber();
        }

        /* renamed from: P */
        public final void m25083P(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
        /* renamed from: n */
        public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
            switch (C26193a.f98672a[enumC18236f.ordinal()]) {
                case 1:
                    return new C26195c();
                case 2:
                    return new C26196a(null);
                case 3:
                    return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    WH3<C26195c> wh3 = PARSER;
                    if (wh3 == null) {
                        synchronized (C26195c.class) {
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

    static {
        C45276ml2 c45276ml2 = new C45276ml2();
        DEFAULT_INSTANCE = c45276ml2;
        AbstractC18230t.m47478C(C45276ml2.class, c45276ml2);
    }

    private C45276ml2() {
    }

    /* renamed from: L */
    public static C26194b m25097L() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: I */
    public final void m25100I(C26195c c26195c) {
        c26195c.getClass();
        m25099J();
        this.keyInfo_.add(c26195c);
    }

    /* renamed from: J */
    public final void m25099J() {
        C18238v.InterfaceC18247i<C26195c> interfaceC18247i = this.keyInfo_;
        if (!interfaceC18247i.mo47396t()) {
            this.keyInfo_ = AbstractC18230t.m47462u(interfaceC18247i);
        }
    }

    /* renamed from: K */
    public C26195c m25098K(int i) {
        return this.keyInfo_.get(i);
    }

    /* renamed from: M */
    public final void m25096M(int i) {
        this.primaryKeyId_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C26193a.f98672a[enumC18236f.ordinal()]) {
            case 1:
                return new C45276ml2();
            case 2:
                return new C26194b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", C26195c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C45276ml2> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C45276ml2.class) {
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
