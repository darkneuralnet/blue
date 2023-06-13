package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
import com.google.crypto.tink.shaded.protobuf.AbstractC18230t;
import com.google.crypto.tink.shaded.protobuf.C18219m;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
/* renamed from: D8 */
/* loaded from: classes6.dex */
public final class C1396D8 extends AbstractC18230t<C1396D8, C1398b> implements InterfaceC51624xT2 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final C1396D8 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile WH3<C1396D8> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private C3030H8 aesCtrKey_;
    private TM1 hmacKey_;
    private int version_;

    /* renamed from: D8$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C1397a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5270a;

        static {
            int[] iArr = new int[AbstractC18230t.EnumC18236f.values().length];
            f5270a = iArr;
            try {
                iArr[AbstractC18230t.EnumC18236f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5270a[AbstractC18230t.EnumC18236f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5270a[AbstractC18230t.EnumC18236f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5270a[AbstractC18230t.EnumC18236f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5270a[AbstractC18230t.EnumC18236f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5270a[AbstractC18230t.EnumC18236f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5270a[AbstractC18230t.EnumC18236f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: D8$b */
    /* loaded from: classes6.dex */
    public static final class C1398b extends AbstractC18230t.AbstractC18231a<C1396D8, C1398b> implements InterfaceC51624xT2 {
        public /* synthetic */ C1398b(C1397a c1397a) {
            this();
        }

        /* renamed from: A */
        public C1398b m110889A(int i) {
            m47450o();
            ((C1396D8) this.f74196c).m110890Q(i);
            return this;
        }

        /* renamed from: y */
        public C1398b m110888y(C3030H8 c3030h8) {
            m47450o();
            ((C1396D8) this.f74196c).m110892O(c3030h8);
            return this;
        }

        /* renamed from: z */
        public C1398b m110887z(TM1 tm1) {
            m47450o();
            ((C1396D8) this.f74196c).m110891P(tm1);
            return this;
        }

        private C1398b() {
            super(C1396D8.DEFAULT_INSTANCE);
        }
    }

    static {
        C1396D8 c1396d8 = new C1396D8();
        DEFAULT_INSTANCE = c1396d8;
        AbstractC18230t.m47478C(C1396D8.class, c1396d8);
    }

    private C1396D8() {
    }

    /* renamed from: M */
    public static C1398b m110894M() {
        return DEFAULT_INSTANCE.m47471k();
    }

    /* renamed from: N */
    public static C1396D8 m110893N(AbstractC18199g abstractC18199g, C18219m c18219m) throws InvalidProtocolBufferException {
        return (C1396D8) AbstractC18230t.m47459x(DEFAULT_INSTANCE, abstractC18199g, c18219m);
    }

    /* renamed from: J */
    public C3030H8 m110897J() {
        C3030H8 c3030h8 = this.aesCtrKey_;
        return c3030h8 == null ? C3030H8.m104377J() : c3030h8;
    }

    /* renamed from: K */
    public TM1 m110896K() {
        TM1 tm1 = this.hmacKey_;
        return tm1 == null ? TM1.m83743J() : tm1;
    }

    /* renamed from: L */
    public int m110895L() {
        return this.version_;
    }

    /* renamed from: O */
    public final void m110892O(C3030H8 c3030h8) {
        c3030h8.getClass();
        this.aesCtrKey_ = c3030h8;
    }

    /* renamed from: P */
    public final void m110891P(TM1 tm1) {
        tm1.getClass();
        this.hmacKey_ = tm1;
    }

    /* renamed from: Q */
    public final void m110890Q(int i) {
        this.version_ = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC18230t
    /* renamed from: n */
    public final Object mo1559n(AbstractC18230t.EnumC18236f enumC18236f, Object obj, Object obj2) {
        switch (C1397a.f5270a[enumC18236f.ordinal()]) {
            case 1:
                return new C1396D8();
            case 2:
                return new C1398b(null);
            case 3:
                return AbstractC18230t.m47460w(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                WH3<C1396D8> wh3 = PARSER;
                if (wh3 == null) {
                    synchronized (C1396D8.class) {
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
