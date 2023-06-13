package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
@Deprecated
/* renamed from: Pk2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35215Pk2 extends AbstractC18230t<C35215Pk2, C6458b> implements InterfaceC51624xT2 {
    public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
    private static final C35215Pk2 DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
    private static volatile WH3<C35215Pk2> PARSER = null;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
    public static final int TYPE_URL_FIELD_NUMBER = 2;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_ = "";
    private String typeUrl_ = "";
    private String catalogueName_ = "";

    /* renamed from: Pk2$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C6457a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f28979a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f28979a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28979a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28979a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28979a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28979a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28979a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28979a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: Pk2$b */
    /* loaded from: classes6.dex */
    public static final class C6458b extends AbstractC18230t.AbstractC18231a<C35215Pk2, C6458b> implements InterfaceC51624xT2 {
        public /* synthetic */ C6458b(C6457a c6457a) {
            this();
        }

        private C6458b() {
            super(C35215Pk2.DEFAULT_INSTANCE);
        }
    }

    static {
        C35215Pk2 c35215Pk2 = new C35215Pk2();
        DEFAULT_INSTANCE = c35215Pk2;
        AbstractC18230t.m47478C(C35215Pk2.class, c35215Pk2);
    }

    private C35215Pk2() {
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C6457a.f28979a[enumC18236f.ordinal()]) {
            case 1:
                return new C35215Pk2();
            case 2:
                return new C6458b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C35215Pk2> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C35215Pk2.class) {
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
