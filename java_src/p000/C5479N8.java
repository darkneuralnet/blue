package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: N8 */
/* loaded from: classes6.dex */
public final class C5479N8 extends AbstractC18230t<C5479N8, C5481b> implements InterfaceC51624xT2 {
    private static final C5479N8 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile WH3<C5479N8> PARSER;
    private int keySize_;
    private C6269P8 params_;

    /* renamed from: N8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C5480a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24181a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f24181a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24181a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24181a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24181a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24181a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24181a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f24181a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: N8$b */
    /* loaded from: classes6.dex */
    public static final class C5481b extends AbstractC18230t.AbstractC18231a<C5479N8, C5481b> implements InterfaceC51624xT2 {
        public /* synthetic */ C5481b(C5480a c5480a) {
            this();
        }

        /* renamed from: y */
        public C5481b m94332y(int i) {
            m47450o();
            ((C5479N8) this.f74196c).m94334M(i);
            return this;
        }

        /* renamed from: z */
        public C5481b m94331z(C6269P8 c6269p8) {
            m47450o();
            ((C5479N8) this.f74196c).m94333N(c6269p8);
            return this;
        }

        private C5481b() {
            super(C5479N8.DEFAULT_INSTANCE);
        }
    }

    static {
        C5479N8 c5479n8 = new C5479N8();
        DEFAULT_INSTANCE = c5479n8;
        AbstractC18230t.m47478C(C5479N8.class, c5479n8);
    }

    private C5479N8() {
    }

    /* renamed from: K */
    public static C5481b m94336K() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: L */
    public static C5479N8 m94335L(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C5479N8) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: I */
    public int m94338I() {
        return this.keySize_;
    }

    /* renamed from: J */
    public C6269P8 m94337J() {
        C6269P8 c6269p8 = this.params_;
        return c6269p8 == null ? C6269P8.m90719H() : c6269p8;
    }

    /* renamed from: M */
    public final void m94334M(int i) {
        this.keySize_ = i;
    }

    /* renamed from: N */
    public final void m94333N(C6269P8 c6269p8) {
        c6269p8.getClass();
        this.params_ = c6269p8;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C5480a.f24181a[enumC18236f.ordinal()]) {
            case 1:
                return new C5479N8();
            case 2:
                return new C5481b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C5479N8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C5479N8.class) {
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
