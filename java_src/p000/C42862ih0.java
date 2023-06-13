package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: ih0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42862ih0 extends AbstractC18230t<C42862ih0, C23327b> implements InterfaceC51624xT2 {
    private static final C42862ih0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile WH3<C42862ih0> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC18199g keyValue_ = AbstractC18199g.f74142c;
    private int version_;

    /* renamed from: ih0$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C23326a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f87736a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f87736a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f87736a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f87736a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f87736a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f87736a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f87736a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f87736a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: ih0$b */
    /* loaded from: classes6.dex */
    public static final class C23327b extends AbstractC18230t.AbstractC18231a<C42862ih0, C23327b> implements InterfaceC51624xT2 {
        public /* synthetic */ C23327b(C23326a c23326a) {
            this();
        }

        /* renamed from: y */
        public C23327b m33587y(AbstractC18199g abstractC18199g) {
            m47450o();
            ((C42862ih0) this.f74196c).m33589M(abstractC18199g);
            return this;
        }

        /* renamed from: z */
        public C23327b m33586z(int i) {
            m47450o();
            ((C42862ih0) this.f74196c).m33588N(i);
            return this;
        }

        private C23327b() {
            super(C42862ih0.DEFAULT_INSTANCE);
        }
    }

    static {
        C42862ih0 c42862ih0 = new C42862ih0();
        DEFAULT_INSTANCE = c42862ih0;
        AbstractC18230t.m47478C(C42862ih0.class, c42862ih0);
    }

    private C42862ih0() {
    }

    /* renamed from: K */
    public static C23327b m33591K() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: L */
    public static C42862ih0 m33590L(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C42862ih0) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: I */
    public AbstractC18199g m33593I() {
        return this.keyValue_;
    }

    /* renamed from: J */
    public int m33592J() {
        return this.version_;
    }

    /* renamed from: M */
    public final void m33589M(AbstractC18199g abstractC18199g) {
        abstractC18199g.getClass();
        this.keyValue_ = abstractC18199g;
    }

    /* renamed from: N */
    public final void m33588N(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C23326a.f87736a[enumC18236f.ordinal()]) {
            case 1:
                return new C42862ih0();
            case 2:
                return new C23327b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C42862ih0> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C42862ih0.class) {
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
