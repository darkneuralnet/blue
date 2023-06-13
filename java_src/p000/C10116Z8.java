package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: Z8 */
/* loaded from: classes6.dex */
public final class C10116Z8 extends AbstractC18230t<C10116Z8, C10118b> implements InterfaceC51624xT2 {
    private static final C10116Z8 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile WH3<C10116Z8> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC18199g keyValue_ = AbstractC18199g.f74142c;
    private int version_;

    /* renamed from: Z8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C10117a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47868a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f47868a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47868a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47868a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47868a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47868a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47868a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47868a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: Z8$b */
    /* loaded from: classes6.dex */
    public static final class C10118b extends AbstractC18230t.AbstractC18231a<C10116Z8, C10118b> implements InterfaceC51624xT2 {
        public /* synthetic */ C10118b(C10117a c10117a) {
            this();
        }

        /* renamed from: y */
        public C10118b m73670y(AbstractC18199g abstractC18199g) {
            m47450o();
            ((C10116Z8) this.f74196c).m73672M(abstractC18199g);
            return this;
        }

        /* renamed from: z */
        public C10118b m73669z(int i) {
            m47450o();
            ((C10116Z8) this.f74196c).m73671N(i);
            return this;
        }

        private C10118b() {
            super(C10116Z8.DEFAULT_INSTANCE);
        }
    }

    static {
        C10116Z8 c10116z8 = new C10116Z8();
        DEFAULT_INSTANCE = c10116z8;
        AbstractC18230t.m47478C(C10116Z8.class, c10116z8);
    }

    private C10116Z8() {
    }

    /* renamed from: K */
    public static C10118b m73674K() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: L */
    public static C10116Z8 m73673L(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C10116Z8) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: I */
    public AbstractC18199g m73676I() {
        return this.keyValue_;
    }

    /* renamed from: J */
    public int m73675J() {
        return this.version_;
    }

    /* renamed from: M */
    public final void m73672M(AbstractC18199g abstractC18199g) {
        abstractC18199g.getClass();
        this.keyValue_ = abstractC18199g;
    }

    /* renamed from: N */
    public final void m73671N(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C10117a.f47868a[enumC18236f.ordinal()]) {
            case 1:
                return new C10116Z8();
            case 2:
                return new C10118b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C10116Z8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C10116Z8.class) {
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
