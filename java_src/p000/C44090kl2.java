package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.C18238v;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.util.Collections;
import java.util.List;
/* renamed from: kl2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44090kl2 extends AbstractC18230t<C44090kl2, C25224b> implements InterfaceC51624xT2 {
    private static final C44090kl2 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile WH3<C44090kl2> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private C18238v.InterfaceC18247i<C25225c> key_ = AbstractC18230t.m47468o();
    private int primaryKeyId_;

    /* renamed from: kl2$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C25223a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f94877a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f94877a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f94877a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f94877a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f94877a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f94877a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f94877a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f94877a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: kl2$b */
    /* loaded from: classes6.dex */
    public static final class C25224b extends AbstractC18230t.AbstractC18231a<C44090kl2, C25224b> implements InterfaceC51624xT2 {
        public /* synthetic */ C25224b(C25223a c25223a) {
            this();
        }

        /* renamed from: A */
        public int m28512A() {
            return ((C44090kl2) this.f74196c).m28518L();
        }

        /* renamed from: B */
        public List<C25225c> m28511B() {
            return Collections.unmodifiableList(((C44090kl2) this.f74196c).m28517M());
        }

        /* renamed from: C */
        public C25224b m28510C(int i) {
            m47450o();
            ((C44090kl2) this.f74196c).m28513Q(i);
            return this;
        }

        /* renamed from: y */
        public C25224b m28509y(C25225c c25225c) {
            m47450o();
            ((C44090kl2) this.f74196c).m28521I(c25225c);
            return this;
        }

        /* renamed from: z */
        public C25225c m28508z(int i) {
            return ((C44090kl2) this.f74196c).m28519K(i);
        }

        private C25224b() {
            super(C44090kl2.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: kl2$c */
    /* loaded from: classes6.dex */
    public static final class C25225c extends AbstractC18230t<C25225c, C25226a> implements InterfaceC51624xT2 {
        private static final C25225c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile WH3<C25225c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private C42301hk2 keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* renamed from: kl2$c$a */
        /* loaded from: classes6.dex */
        public static final class C25226a extends AbstractC18230t.AbstractC18231a<C25225c, C25226a> implements InterfaceC51624xT2 {
            public /* synthetic */ C25226a(C25223a c25223a) {
                this();
            }

            /* renamed from: A */
            public C25226a m28492A(EnumC40189eA3 enumC40189eA3) {
                m47450o();
                ((C25225c) this.f74196c).m28494S(enumC40189eA3);
                return this;
            }

            /* renamed from: B */
            public C25226a m28491B(EnumC33577Ik2 enumC33577Ik2) {
                m47450o();
                ((C25225c) this.f74196c).m28493T(enumC33577Ik2);
                return this;
            }

            /* renamed from: y */
            public C25226a m28490y(C42301hk2 c42301hk2) {
                m47450o();
                ((C25225c) this.f74196c).m28496Q(c42301hk2);
                return this;
            }

            /* renamed from: z */
            public C25226a m28489z(int i) {
                m47450o();
                ((C25225c) this.f74196c).m28495R(i);
                return this;
            }

            private C25226a() {
                super(C25225c.DEFAULT_INSTANCE);
            }
        }

        static {
            C25225c c25225c = new C25225c();
            DEFAULT_INSTANCE = c25225c;
            AbstractC18230t.m47478C(C25225c.class, c25225c);
        }

        private C25225c() {
        }

        /* renamed from: P */
        public static C25226a m28497P() {
            return DEFAULT_INSTANCE.m47471k();
        }

        /* renamed from: K */
        public C42301hk2 m28502K() {
            C42301hk2 c42301hk2 = this.keyData_;
            return c42301hk2 == null ? C42301hk2.m35929J() : c42301hk2;
        }

        /* renamed from: L */
        public int m28501L() {
            return this.keyId_;
        }

        /* renamed from: M */
        public EnumC40189eA3 m28500M() {
            EnumC40189eA3 m43160a = EnumC40189eA3.m43160a(this.outputPrefixType_);
            if (m43160a == null) {
                return EnumC40189eA3.UNRECOGNIZED;
            }
            return m43160a;
        }

        /* renamed from: N */
        public EnumC33577Ik2 m28499N() {
            EnumC33577Ik2 m101741a = EnumC33577Ik2.m101741a(this.status_);
            if (m101741a == null) {
                return EnumC33577Ik2.UNRECOGNIZED;
            }
            return m101741a;
        }

        /* renamed from: O */
        public boolean m28498O() {
            return this.keyData_ != null;
        }

        /* renamed from: Q */
        public final void m28496Q(C42301hk2 c42301hk2) {
            c42301hk2.getClass();
            this.keyData_ = c42301hk2;
        }

        /* renamed from: R */
        public final void m28495R(int i) {
            this.keyId_ = i;
        }

        /* renamed from: S */
        public final void m28494S(EnumC40189eA3 enumC40189eA3) {
            this.outputPrefixType_ = enumC40189eA3.getNumber();
        }

        /* renamed from: T */
        public final void m28493T(EnumC33577Ik2 enumC33577Ik2) {
            this.status_ = enumC33577Ik2.getNumber();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
        /* renamed from: n */
        public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
            switch (C25223a.f94877a[enumC18236f.ordinal()]) {
                case 1:
                    return new C25225c();
                case 2:
                    return new C25226a(null);
                case 3:
                    return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    WH3<C25225c> wh3 = PARSER;
                    if (wh3 == null) {
                        synchronized (C25225c.class) {
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
        C44090kl2 c44090kl2 = new C44090kl2();
        DEFAULT_INSTANCE = c44090kl2;
        AbstractC18230t.m47478C(C44090kl2.class, c44090kl2);
    }

    private C44090kl2() {
    }

    /* renamed from: O */
    public static C25224b m28515O() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: P */
    public static C44090kl2 m28514P(byte[] bArr, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C44090kl2) AbstractC18230t.m47458y(DEFAULT_INSTANCE, bArr, c18219m);
    }

    /* renamed from: I */
    public final void m28521I(C25225c c25225c) {
        c25225c.getClass();
        m28520J();
        this.key_.add(c25225c);
    }

    /* renamed from: J */
    public final void m28520J() {
        C18238v.InterfaceC18247i<C25225c> interfaceC18247i = this.key_;
        if (!interfaceC18247i.mo47396t()) {
            this.key_ = AbstractC18230t.m47462u(interfaceC18247i);
        }
    }

    /* renamed from: K */
    public C25225c m28519K(int i) {
        return this.key_.get(i);
    }

    /* renamed from: L */
    public int m28518L() {
        return this.key_.size();
    }

    /* renamed from: M */
    public List<C25225c> m28517M() {
        return this.key_;
    }

    /* renamed from: N */
    public int m28516N() {
        return this.primaryKeyId_;
    }

    /* renamed from: Q */
    public final void m28513Q(int i) {
        this.primaryKeyId_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C25223a.f94877a[enumC18236f.ordinal()]) {
            case 1:
                return new C44090kl2();
            case 2:
                return new C25224b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", C25225c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C44090kl2> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C44090kl2.class) {
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
