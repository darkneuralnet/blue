package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: rl2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C48241rl2 extends AbstractC18230t<C48241rl2, C27988b> implements InterfaceC51624xT2 {
    private static final C48241rl2 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile WH3<C48241rl2> PARSER;
    private String keyUri_ = "";

    /* renamed from: rl2$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C27987a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f107569a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f107569a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f107569a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f107569a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f107569a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f107569a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f107569a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f107569a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: rl2$b */
    /* loaded from: classes6.dex */
    public static final class C27988b extends AbstractC18230t.AbstractC18231a<C48241rl2, C27988b> implements InterfaceC51624xT2 {
        public /* synthetic */ C27988b(C27987a c27987a) {
            this();
        }

        private C27988b() {
            super(C48241rl2.DEFAULT_INSTANCE);
        }
    }

    static {
        C48241rl2 c48241rl2 = new C48241rl2();
        DEFAULT_INSTANCE = c48241rl2;
        AbstractC18230t.m47478C(C48241rl2.class, c48241rl2);
    }

    private C48241rl2() {
    }

    /* renamed from: G */
    public static C48241rl2 m15462G() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: I */
    public static C48241rl2 m15460I(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C48241rl2) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: H */
    public String m15461H() {
        return this.keyUri_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C27987a.f107569a[enumC18236f.ordinal()]) {
            case 1:
                return new C48241rl2();
            case 2:
                return new C27988b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C48241rl2> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C48241rl2.class) {
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
