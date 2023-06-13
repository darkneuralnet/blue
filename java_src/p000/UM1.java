package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: UM1 */
/* loaded from: classes6.dex */
public final class UM1 extends AbstractC18230t<UM1, C8264b> implements InterfaceC51624xT2 {
    private static final UM1 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile WH3<UM1> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private WM1 params_;
    private int version_;

    /* renamed from: UM1$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C8263a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37284a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f37284a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37284a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37284a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37284a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37284a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37284a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37284a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: UM1$b */
    /* loaded from: classes6.dex */
    public static final class C8264b extends AbstractC18230t.AbstractC18231a<UM1, C8264b> implements InterfaceC51624xT2 {
        public /* synthetic */ C8264b(C8263a c8263a) {
            this();
        }

        /* renamed from: y */
        public C8264b m81598y(int i) {
            m47450o();
            ((UM1) this.f74196c).m81600N(i);
            return this;
        }

        /* renamed from: z */
        public C8264b m81597z(WM1 wm1) {
            m47450o();
            ((UM1) this.f74196c).m81599O(wm1);
            return this;
        }

        private C8264b() {
            super(UM1.DEFAULT_INSTANCE);
        }
    }

    static {
        UM1 um1 = new UM1();
        DEFAULT_INSTANCE = um1;
        AbstractC18230t.m47478C(UM1.class, um1);
    }

    private UM1() {
    }

    /* renamed from: I */
    public static UM1 m81605I() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: L */
    public static C8264b m81602L() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: M */
    public static UM1 m81601M(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (UM1) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: J */
    public int m81604J() {
        return this.keySize_;
    }

    /* renamed from: K */
    public WM1 m81603K() {
        WM1 wm1 = this.params_;
        return wm1 == null ? WM1.m78542I() : wm1;
    }

    /* renamed from: N */
    public final void m81600N(int i) {
        this.keySize_ = i;
    }

    /* renamed from: O */
    public final void m81599O(WM1 wm1) {
        wm1.getClass();
        this.params_ = wm1;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C8263a.f37284a[enumC18236f.ordinal()]) {
            case 1:
                return new UM1();
            case 2:
                return new C8264b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<UM1> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (UM1.class) {
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
