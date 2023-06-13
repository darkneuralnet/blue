package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
/* renamed from: WM1 */
/* loaded from: classes6.dex */
public final class WM1 extends AbstractC18230t<WM1, C9005b> implements InterfaceC51624xT2 {
    private static final WM1 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile WH3<WM1> PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    /* renamed from: WM1$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C9004a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40899a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f40899a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40899a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40899a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40899a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40899a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40899a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40899a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: WM1$b */
    /* loaded from: classes6.dex */
    public static final class C9005b extends AbstractC18230t.AbstractC18231a<WM1, C9005b> implements InterfaceC51624xT2 {
        public /* synthetic */ C9005b(C9004a c9004a) {
            this();
        }

        /* renamed from: y */
        public C9005b m78536y(EnumC49737uH1 enumC49737uH1) {
            m47450o();
            ((WM1) this.f74196c).m78538M(enumC49737uH1);
            return this;
        }

        /* renamed from: z */
        public C9005b m78535z(int i) {
            m47450o();
            ((WM1) this.f74196c).m78537N(i);
            return this;
        }

        private C9005b() {
            super(WM1.DEFAULT_INSTANCE);
        }
    }

    static {
        WM1 wm1 = new WM1();
        DEFAULT_INSTANCE = wm1;
        AbstractC18230t.m47478C(WM1.class, wm1);
    }

    private WM1() {
    }

    /* renamed from: I */
    public static WM1 m78542I() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: L */
    public static C9005b m78539L() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: J */
    public EnumC49737uH1 m78541J() {
        EnumC49737uH1 m10491a = EnumC49737uH1.m10491a(this.hash_);
        if (m10491a == null) {
            return EnumC49737uH1.UNRECOGNIZED;
        }
        return m10491a;
    }

    /* renamed from: K */
    public int m78540K() {
        return this.tagSize_;
    }

    /* renamed from: M */
    public final void m78538M(EnumC49737uH1 enumC49737uH1) {
        this.hash_ = enumC49737uH1.getNumber();
    }

    /* renamed from: N */
    public final void m78537N(int i) {
        this.tagSize_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C9004a.f40899a[enumC18236f.ordinal()]) {
            case 1:
                return new WM1();
            case 2:
                return new C9005b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<WM1> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (WM1.class) {
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
