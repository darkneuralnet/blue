package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: xl2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51797xl2 extends AbstractC18230t<C51797xl2, C30294b> implements InterfaceC51624xT2 {
    private static final C51797xl2 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile WH3<C51797xl2> PARSER;
    private C34045Kk2 dekTemplate_;
    private String kekUri_ = "";

    /* renamed from: xl2$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C30293a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f118056a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f118056a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f118056a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f118056a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f118056a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f118056a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f118056a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f118056a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: xl2$b */
    /* loaded from: classes6.dex */
    public static final class C30294b extends AbstractC18230t.AbstractC18231a<C51797xl2, C30294b> implements InterfaceC51624xT2 {
        public /* synthetic */ C30294b(C30293a c30293a) {
            this();
        }

        private C30294b() {
            super(C51797xl2.DEFAULT_INSTANCE);
        }
    }

    static {
        C51797xl2 c51797xl2 = new C51797xl2();
        DEFAULT_INSTANCE = c51797xl2;
        AbstractC18230t.m47478C(C51797xl2.class, c51797xl2);
    }

    private C51797xl2() {
    }

    /* renamed from: G */
    public static C51797xl2 m4741G() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: K */
    public static C51797xl2 m4737K(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C51797xl2) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: H */
    public C34045Kk2 m4740H() {
        C34045Kk2 c34045Kk2 = this.dekTemplate_;
        return c34045Kk2 == null ? C34045Kk2.m98332J() : c34045Kk2;
    }

    /* renamed from: I */
    public String m4739I() {
        return this.kekUri_;
    }

    /* renamed from: J */
    public boolean m4738J() {
        return this.dekTemplate_ != null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C30293a.f118056a[enumC18236f.ordinal()]) {
            case 1:
                return new C51797xl2();
            case 2:
                return new C30294b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C51797xl2> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C51797xl2.class) {
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
