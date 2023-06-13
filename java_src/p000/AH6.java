package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: AH6 */
/* loaded from: classes6.dex */
public final class AH6 extends AbstractC18230t<AH6, C0065b> implements InterfaceC51624xT2 {
    private static final AH6 DEFAULT_INSTANCE;
    private static volatile WH3<AH6> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    /* renamed from: AH6$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C0064a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f358a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f358a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f358a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f358a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f358a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f358a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f358a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f358a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: AH6$b */
    /* loaded from: classes6.dex */
    public static final class C0065b extends AbstractC18230t.AbstractC18231a<AH6, C0065b> implements InterfaceC51624xT2 {
        public /* synthetic */ C0065b(C0064a c0064a) {
            this();
        }

        private C0065b() {
            super(AH6.DEFAULT_INSTANCE);
        }
    }

    static {
        AH6 ah6 = new AH6();
        DEFAULT_INSTANCE = ah6;
        AbstractC18230t.m47478C(AH6.class, ah6);
    }

    private AH6() {
    }

    /* renamed from: G */
    public static AH6 m115934G() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: H */
    public static AH6 m115933H(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (AH6) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C0064a.f358a[enumC18236f.ordinal()]) {
            case 1:
                return new AH6();
            case 2:
                return new C0065b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<AH6> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (AH6.class) {
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
