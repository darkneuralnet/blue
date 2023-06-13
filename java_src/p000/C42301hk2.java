package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18238v;
/* renamed from: hk2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42301hk2 extends AbstractC18230t<C42301hk2, C22716b> implements InterfaceC51624xT2 {
    private static final C42301hk2 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile WH3<C42301hk2> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC18199g value_ = AbstractC18199g.f74142c;

    /* renamed from: hk2$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C22715a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f85811a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f85811a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f85811a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f85811a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f85811a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f85811a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f85811a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f85811a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: hk2$b */
    /* loaded from: classes6.dex */
    public static final class C22716b extends AbstractC18230t.AbstractC18231a<C42301hk2, C22716b> implements InterfaceC51624xT2 {
        public /* synthetic */ C22716b(C22715a c22715a) {
            this();
        }

        /* renamed from: A */
        public C22716b m35921A(AbstractC18199g abstractC18199g) {
            m47450o();
            ((C42301hk2) this.f74196c).m35922Q(abstractC18199g);
            return this;
        }

        /* renamed from: y */
        public C22716b m35920y(EnumC22717c enumC22717c) {
            m47450o();
            ((C42301hk2) this.f74196c).m35924O(enumC22717c);
            return this;
        }

        /* renamed from: z */
        public C22716b m35919z(String str) {
            m47450o();
            ((C42301hk2) this.f74196c).m35923P(str);
            return this;
        }

        private C22716b() {
            super(C42301hk2.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: hk2$c */
    /* loaded from: classes6.dex */
    public enum EnumC22717c implements C18238v.InterfaceC18241c {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: i */
        public static final C18238v.InterfaceC18242d<EnumC22717c> f85818i = new C22718a();

        /* renamed from: b */
        public final int f85820b;

        /* renamed from: hk2$c$a */
        /* loaded from: classes6.dex */
        public class C22718a implements C18238v.InterfaceC18242d<EnumC22717c> {
            @Override // com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18242d
            /* renamed from: a */
            public EnumC22717c findValueByNumber(int i) {
                return EnumC22717c.m35918a(i);
            }
        }

        EnumC22717c(int i) {
            this.f85820b = i;
        }

        /* renamed from: a */
        public static EnumC22717c m35918a(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return REMOTE;
                        }
                        return ASYMMETRIC_PUBLIC;
                    }
                    return ASYMMETRIC_PRIVATE;
                }
                return SYMMETRIC;
            }
            return UNKNOWN_KEYMATERIAL;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C18238v.InterfaceC18241c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f85820b;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        C42301hk2 c42301hk2 = new C42301hk2();
        DEFAULT_INSTANCE = c42301hk2;
        AbstractC18230t.m47478C(C42301hk2.class, c42301hk2);
    }

    private C42301hk2() {
    }

    /* renamed from: J */
    public static C42301hk2 m35929J() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: N */
    public static C22716b m35925N() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: K */
    public EnumC22717c m35928K() {
        EnumC22717c m35918a = EnumC22717c.m35918a(this.keyMaterialType_);
        if (m35918a == null) {
            return EnumC22717c.UNRECOGNIZED;
        }
        return m35918a;
    }

    /* renamed from: L */
    public String m35927L() {
        return this.typeUrl_;
    }

    /* renamed from: M */
    public AbstractC18199g m35926M() {
        return this.value_;
    }

    /* renamed from: O */
    public final void m35924O(EnumC22717c enumC22717c) {
        this.keyMaterialType_ = enumC22717c.getNumber();
    }

    /* renamed from: P */
    public final void m35923P(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* renamed from: Q */
    public final void m35922Q(AbstractC18199g abstractC18199g) {
        abstractC18199g.getClass();
        this.value_ = abstractC18199g;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C22715a.f85811a[enumC18236f.ordinal()]) {
            case 1:
                return new C42301hk2();
            case 2:
                return new C22716b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C42301hk2> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C42301hk2.class) {
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
