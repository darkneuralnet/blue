package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: jh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C43455jh0 extends AbstractC18230t<C43455jh0, C24985b> implements InterfaceC51624xT2 {
    private static final C43455jh0 DEFAULT_INSTANCE;
    private static volatile WH3<C43455jh0> PARSER;

    /* renamed from: jh0$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C24984a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f93157a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f93157a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f93157a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f93157a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f93157a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f93157a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f93157a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f93157a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: jh0$b */
    /* loaded from: classes6.dex */
    public static final class C24985b extends AbstractC18230t.AbstractC18231a<C43455jh0, C24985b> implements InterfaceC51624xT2 {
        public /* synthetic */ C24985b(C24984a c24984a) {
            this();
        }

        private C24985b() {
            super(C43455jh0.DEFAULT_INSTANCE);
        }
    }

    static {
        C43455jh0 c43455jh0 = new C43455jh0();
        DEFAULT_INSTANCE = c43455jh0;
        AbstractC18230t.m47478C(C43455jh0.class, c43455jh0);
    }

    private C43455jh0() {
    }

    /* renamed from: G */
    public static C43455jh0 m30107G() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: H */
    public static C43455jh0 m30106H(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C43455jh0) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C24984a.f93157a[enumC18236f.ordinal()]) {
            case 1:
                return new C43455jh0();
            case 2:
                return new C24985b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C43455jh0> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C43455jh0.class) {
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
