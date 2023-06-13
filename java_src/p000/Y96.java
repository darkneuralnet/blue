package p000;

import com.google.protobuf.AbstractC18536r;
import com.google.protobuf.C18544t;
/* renamed from: Y96 */
/* loaded from: classes6.dex */
public final class Y96 extends AbstractC18536r<Y96, C9693b> implements InterfaceC51031wT2 {
    private static final Y96 DEFAULT_INSTANCE;
    public static final int DISPATCH_DESTINATION_FIELD_NUMBER = 1;
    private static volatile VH3<Y96> PARSER;
    private int bitField0_;
    private int dispatchDestination_;

    /* renamed from: Y96$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C9692a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44728a;

        static {
            int[] iArr = new int[AbstractC18536r.EnumC18542f.values().length];
            f44728a = iArr;
            try {
                iArr[AbstractC18536r.EnumC18542f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44728a[AbstractC18536r.EnumC18542f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44728a[AbstractC18536r.EnumC18542f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44728a[AbstractC18536r.EnumC18542f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44728a[AbstractC18536r.EnumC18542f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44728a[AbstractC18536r.EnumC18542f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44728a[AbstractC18536r.EnumC18542f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: Y96$b */
    /* loaded from: classes6.dex */
    public static final class C9693b extends AbstractC18536r.AbstractC18537a<Y96, C9693b> implements InterfaceC51031wT2 {
        public /* synthetic */ C9693b(C9692a c9692a) {
            this();
        }

        private C9693b() {
            super(Y96.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: Y96$c */
    /* loaded from: classes6.dex */
    public enum EnumC9694c implements C18544t.InterfaceC18547c {
        SOURCE_UNKNOWN(0),
        FL_LEGACY_V1(1);
        

        /* renamed from: e */
        public static final C18544t.InterfaceC18548d<EnumC9694c> f44731e = new C9695a();

        /* renamed from: b */
        public final int f44733b;

        /* renamed from: Y96$c$a */
        /* loaded from: classes6.dex */
        public class C9695a implements C18544t.InterfaceC18548d<EnumC9694c> {
            @Override // com.google.protobuf.C18544t.InterfaceC18548d
            /* renamed from: a */
            public EnumC9694c findValueByNumber(int i) {
                return EnumC9694c.m75497a(i);
            }
        }

        /* renamed from: Y96$c$b */
        /* loaded from: classes6.dex */
        public static final class C9696b implements C18544t.InterfaceC18549e {

            /* renamed from: a */
            public static final C18544t.InterfaceC18549e f44734a = new C9696b();

            private C9696b() {
            }

            @Override // com.google.protobuf.C18544t.InterfaceC18549e
            /* renamed from: a */
            public boolean mo33504a(int i) {
                return EnumC9694c.m75497a(i) != null;
            }
        }

        EnumC9694c(int i) {
            this.f44733b = i;
        }

        /* renamed from: a */
        public static EnumC9694c m75497a(int i) {
            if (i != 0) {
                if (i != 1) {
                    return null;
                }
                return FL_LEGACY_V1;
            }
            return SOURCE_UNKNOWN;
        }

        /* renamed from: b */
        public static C18544t.InterfaceC18549e m75496b() {
            return C9696b.f44734a;
        }

        @Override // com.google.protobuf.C18544t.InterfaceC18547c
        public final int getNumber() {
            return this.f44733b;
        }
    }

    static {
        Y96 y96 = new Y96();
        DEFAULT_INSTANCE = y96;
        AbstractC18536r.m46054Q(Y96.class, y96);
    }

    private Y96() {
    }

    @Override // com.google.protobuf.AbstractC18536r
    /* renamed from: x */
    public final Object mo23798x(AbstractC18536r.EnumC18542f enumC18542f, Object obj, Object obj2) {
        switch (C9692a.f44728a[enumC18542f.ordinal()]) {
            case 1:
                return new Y96();
            case 2:
                return new C9693b(null);
            case 3:
                return AbstractC18536r.m46057N(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "dispatchDestination_", EnumC9694c.m75496b()});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                VH3<Y96> vh3 = PARSER;
                if (vh3 == null) {
                    synchronized (Y96.class) {
                        vh3 = PARSER;
                        if (vh3 == null) {
                            vh3 = new AbstractC18536r.C18538b<>(DEFAULT_INSTANCE);
                            PARSER = vh3;
                        }
                    }
                }
                return vh3;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
