package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: zH6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52706zH6 extends AbstractC18230t<C52706zH6, C30953b> implements InterfaceC51624xT2 {
    private static final C52706zH6 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile WH3<C52706zH6> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC18199g keyValue_ = AbstractC18199g.f74142c;
    private int version_;

    /* renamed from: zH6$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C30952a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f121043a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f121043a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f121043a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f121043a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f121043a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f121043a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f121043a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f121043a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: zH6$b */
    /* loaded from: classes6.dex */
    public static final class C30953b extends AbstractC18230t.AbstractC18231a<C52706zH6, C30953b> implements InterfaceC51624xT2 {
        public /* synthetic */ C30953b(C30952a c30952a) {
            this();
        }

        /* renamed from: y */
        public C30953b m1558y(AbstractC18199g abstractC18199g) {
            m47450o();
            ((C52706zH6) this.f74196c).m1561M(abstractC18199g);
            return this;
        }

        /* renamed from: z */
        public C30953b m1557z(int i) {
            m47450o();
            ((C52706zH6) this.f74196c).m1560N(i);
            return this;
        }

        private C30953b() {
            super(C52706zH6.DEFAULT_INSTANCE);
        }
    }

    static {
        C52706zH6 c52706zH6 = new C52706zH6();
        DEFAULT_INSTANCE = c52706zH6;
        AbstractC18230t.m47478C(C52706zH6.class, c52706zH6);
    }

    private C52706zH6() {
    }

    /* renamed from: K */
    public static C30953b m1563K() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: L */
    public static C52706zH6 m1562L(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C52706zH6) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: I */
    public AbstractC18199g m1565I() {
        return this.keyValue_;
    }

    /* renamed from: J */
    public int m1564J() {
        return this.version_;
    }

    /* renamed from: M */
    public final void m1561M(AbstractC18199g abstractC18199g) {
        abstractC18199g.getClass();
        this.keyValue_ = abstractC18199g;
    }

    /* renamed from: N */
    public final void m1560N(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C30952a.f121043a[enumC18236f.ordinal()]) {
            case 1:
                return new C52706zH6();
            case 2:
                return new C30953b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C52706zH6> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C52706zH6.class) {
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
