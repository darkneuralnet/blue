package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: wl2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51204wl2 extends AbstractC18230t<C51204wl2, C29956b> implements InterfaceC51624xT2 {
    private static final C51204wl2 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile WH3<C51204wl2> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C51797xl2 params_;
    private int version_;

    /* renamed from: wl2$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C29955a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f116444a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f116444a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116444a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116444a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116444a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116444a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f116444a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f116444a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: wl2$b */
    /* loaded from: classes6.dex */
    public static final class C29956b extends AbstractC18230t.AbstractC18231a<C51204wl2, C29956b> implements InterfaceC51624xT2 {
        public /* synthetic */ C29956b(C29955a c29955a) {
            this();
        }

        /* renamed from: y */
        public C29956b m6397y(C51797xl2 c51797xl2) {
            m47450o();
            ((C51204wl2) this.f74196c).m6399M(c51797xl2);
            return this;
        }

        /* renamed from: z */
        public C29956b m6396z(int i) {
            m47450o();
            ((C51204wl2) this.f74196c).m6398N(i);
            return this;
        }

        private C29956b() {
            super(C51204wl2.DEFAULT_INSTANCE);
        }
    }

    static {
        C51204wl2 c51204wl2 = new C51204wl2();
        DEFAULT_INSTANCE = c51204wl2;
        AbstractC18230t.m47478C(C51204wl2.class, c51204wl2);
    }

    private C51204wl2() {
    }

    /* renamed from: K */
    public static C29956b m6401K() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: L */
    public static C51204wl2 m6400L(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C51204wl2) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: I */
    public C51797xl2 m6403I() {
        C51797xl2 c51797xl2 = this.params_;
        return c51797xl2 == null ? C51797xl2.m4741G() : c51797xl2;
    }

    /* renamed from: J */
    public int m6402J() {
        return this.version_;
    }

    /* renamed from: M */
    public final void m6399M(C51797xl2 c51797xl2) {
        c51797xl2.getClass();
        this.params_ = c51797xl2;
    }

    /* renamed from: N */
    public final void m6398N(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C29955a.f116444a[enumC18236f.ordinal()]) {
            case 1:
                return new C51204wl2();
            case 2:
                return new C29956b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C51204wl2> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C51204wl2.class) {
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
