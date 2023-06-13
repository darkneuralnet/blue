package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: TM1 */
/* loaded from: classes6.dex */
public final class TM1 extends AbstractC18230t<TM1, C7817b> implements InterfaceC51624xT2 {
    private static final TM1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile WH3<TM1> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC18199g keyValue_ = AbstractC18199g.f74142c;
    private WM1 params_;
    private int version_;

    /* renamed from: TM1$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C7816a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35371a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f35371a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35371a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35371a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35371a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35371a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35371a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35371a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: TM1$b */
    /* loaded from: classes6.dex */
    public static final class C7817b extends AbstractC18230t.AbstractC18231a<TM1, C7817b> implements InterfaceC51624xT2 {
        public /* synthetic */ C7817b(C7816a c7816a) {
            this();
        }

        /* renamed from: A */
        public C7817b m83734A(int i) {
            m47450o();
            ((TM1) this.f74196c).m83735R(i);
            return this;
        }

        /* renamed from: y */
        public C7817b m83733y(AbstractC18199g abstractC18199g) {
            m47450o();
            ((TM1) this.f74196c).m83737P(abstractC18199g);
            return this;
        }

        /* renamed from: z */
        public C7817b m83732z(WM1 wm1) {
            m47450o();
            ((TM1) this.f74196c).m83736Q(wm1);
            return this;
        }

        private C7817b() {
            super(TM1.DEFAULT_INSTANCE);
        }
    }

    static {
        TM1 tm1 = new TM1();
        DEFAULT_INSTANCE = tm1;
        AbstractC18230t.m47478C(TM1.class, tm1);
    }

    private TM1() {
    }

    /* renamed from: J */
    public static TM1 m83743J() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: N */
    public static C7817b m83739N() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: O */
    public static TM1 m83738O(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (TM1) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: K */
    public AbstractC18199g m83742K() {
        return this.keyValue_;
    }

    /* renamed from: L */
    public WM1 m83741L() {
        WM1 wm1 = this.params_;
        return wm1 == null ? WM1.m78542I() : wm1;
    }

    /* renamed from: M */
    public int m83740M() {
        return this.version_;
    }

    /* renamed from: P */
    public final void m83737P(AbstractC18199g abstractC18199g) {
        abstractC18199g.getClass();
        this.keyValue_ = abstractC18199g;
    }

    /* renamed from: Q */
    public final void m83736Q(WM1 wm1) {
        wm1.getClass();
        this.params_ = wm1;
    }

    /* renamed from: R */
    public final void m83735R(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C7816a.f35371a[enumC18236f.ordinal()]) {
            case 1:
                return new TM1();
            case 2:
                return new C7817b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<TM1> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (TM1.class) {
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
