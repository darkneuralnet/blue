package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18238v;
@Deprecated
/* renamed from: Ot4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35064Ot4 extends AbstractC18230t<C35064Ot4, C6203b> implements InterfaceC51624xT2 {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final C35064Ot4 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile WH3<C35064Ot4> PARSER;
    private String configName_ = "";
    private C18238v.InterfaceC18247i<C35215Pk2> entry_ = AbstractC18230t.m47468o();

    /* renamed from: Ot4$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C6202a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27532a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f27532a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27532a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27532a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27532a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27532a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27532a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27532a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: Ot4$b */
    /* loaded from: classes6.dex */
    public static final class C6203b extends AbstractC18230t.AbstractC18231a<C35064Ot4, C6203b> implements InterfaceC51624xT2 {
        public /* synthetic */ C6203b(C6202a c6202a) {
            this();
        }

        private C6203b() {
            super(C35064Ot4.DEFAULT_INSTANCE);
        }
    }

    static {
        C35064Ot4 c35064Ot4 = new C35064Ot4();
        DEFAULT_INSTANCE = c35064Ot4;
        AbstractC18230t.m47478C(C35064Ot4.class, c35064Ot4);
    }

    private C35064Ot4() {
    }

    /* renamed from: G */
    public static C35064Ot4 m91204G() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C6202a.f27532a[enumC18236f.ordinal()]) {
            case 1:
                return new C35064Ot4();
            case 2:
                return new C6203b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", C35215Pk2.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C35064Ot4> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C35064Ot4.class) {
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
