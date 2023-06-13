package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: Sc1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35844Sc1 extends AbstractC18230t<C35844Sc1, C7486b> implements InterfaceC51624xT2 {
    private static final C35844Sc1 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile WH3<C35844Sc1> PARSER;
    private AbstractC18199g encryptedKeyset_ = AbstractC18199g.f74142c;
    private C45276ml2 keysetInfo_;

    /* renamed from: Sc1$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C7485a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33960a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f33960a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33960a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33960a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33960a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33960a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33960a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33960a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: Sc1$b */
    /* loaded from: classes6.dex */
    public static final class C7486b extends AbstractC18230t.AbstractC18231a<C35844Sc1, C7486b> implements InterfaceC51624xT2 {
        public /* synthetic */ C7486b(C7485a c7485a) {
            this();
        }

        /* renamed from: y */
        public C7486b m85191y(AbstractC18199g abstractC18199g) {
            m47450o();
            ((C35844Sc1) this.f74196c).m85193L(abstractC18199g);
            return this;
        }

        /* renamed from: z */
        public C7486b m85190z(C45276ml2 c45276ml2) {
            m47450o();
            ((C35844Sc1) this.f74196c).m85192M(c45276ml2);
            return this;
        }

        private C7486b() {
            super(C35844Sc1.DEFAULT_INSTANCE);
        }
    }

    static {
        C35844Sc1 c35844Sc1 = new C35844Sc1();
        DEFAULT_INSTANCE = c35844Sc1;
        AbstractC18230t.m47478C(C35844Sc1.class, c35844Sc1);
    }

    private C35844Sc1() {
    }

    /* renamed from: J */
    public static C7486b m85195J() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: K */
    public static C35844Sc1 m85194K(byte[] bArr, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C35844Sc1) AbstractC18230t.m47458y(DEFAULT_INSTANCE, bArr, c18219m);
    }

    /* renamed from: I */
    public AbstractC18199g m85196I() {
        return this.encryptedKeyset_;
    }

    /* renamed from: L */
    public final void m85193L(AbstractC18199g abstractC18199g) {
        abstractC18199g.getClass();
        this.encryptedKeyset_ = abstractC18199g;
    }

    /* renamed from: M */
    public final void m85192M(C45276ml2 c45276ml2) {
        c45276ml2.getClass();
        this.keysetInfo_ = c45276ml2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C7485a.f33960a[enumC18236f.ordinal()]) {
            case 1:
                return new C35844Sc1();
            case 2:
                return new C7486b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C35844Sc1> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C35844Sc1.class) {
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
