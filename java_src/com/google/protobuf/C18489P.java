package com.google.protobuf;
/* renamed from: com.google.protobuf.P */
/* loaded from: classes6.dex */
public final class C18489P {

    /* renamed from: a */
    public static final int f74752a = m46343c(1, 3);

    /* renamed from: b */
    public static final int f74753b = m46343c(1, 4);

    /* renamed from: c */
    public static final int f74754c = m46343c(2, 0);

    /* renamed from: d */
    public static final int f74755d = m46343c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum f uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.google.protobuf.P$b */
    /* loaded from: classes6.dex */
    public static class EnumC18491b {

        /* renamed from: d */
        public static final EnumC18491b f74756d = new EnumC18491b("DOUBLE", 0, EnumC18496c.DOUBLE, 1);

        /* renamed from: e */
        public static final EnumC18491b f74757e = new EnumC18491b("FLOAT", 1, EnumC18496c.FLOAT, 5);

        /* renamed from: f */
        public static final EnumC18491b f74758f;

        /* renamed from: g */
        public static final EnumC18491b f74759g;

        /* renamed from: h */
        public static final EnumC18491b f74760h;

        /* renamed from: i */
        public static final EnumC18491b f74761i;

        /* renamed from: j */
        public static final EnumC18491b f74762j;

        /* renamed from: k */
        public static final EnumC18491b f74763k;

        /* renamed from: l */
        public static final EnumC18491b f74764l;

        /* renamed from: m */
        public static final EnumC18491b f74765m;

        /* renamed from: n */
        public static final EnumC18491b f74766n;

        /* renamed from: o */
        public static final EnumC18491b f74767o;

        /* renamed from: p */
        public static final EnumC18491b f74768p;

        /* renamed from: q */
        public static final EnumC18491b f74769q;

        /* renamed from: r */
        public static final EnumC18491b f74770r;

        /* renamed from: s */
        public static final EnumC18491b f74771s;

        /* renamed from: t */
        public static final EnumC18491b f74772t;

        /* renamed from: u */
        public static final EnumC18491b f74773u;

        /* renamed from: v */
        public static final /* synthetic */ EnumC18491b[] f74774v;

        /* renamed from: b */
        public final EnumC18496c f74775b;

        /* renamed from: c */
        public final int f74776c;

        /* renamed from: com.google.protobuf.P$b$a */
        /* loaded from: classes6.dex */
        public enum C18492a extends EnumC18491b {
            public C18492a(String str, int i, EnumC18496c enumC18496c, int i2) {
                super(str, i, enumC18496c, i2);
            }
        }

        /* renamed from: com.google.protobuf.P$b$b */
        /* loaded from: classes6.dex */
        public enum C18493b extends EnumC18491b {
            public C18493b(String str, int i, EnumC18496c enumC18496c, int i2) {
                super(str, i, enumC18496c, i2);
            }
        }

        /* renamed from: com.google.protobuf.P$b$c */
        /* loaded from: classes6.dex */
        public enum C18494c extends EnumC18491b {
            public C18494c(String str, int i, EnumC18496c enumC18496c, int i2) {
                super(str, i, enumC18496c, i2);
            }
        }

        /* renamed from: com.google.protobuf.P$b$d */
        /* loaded from: classes6.dex */
        public enum C18495d extends EnumC18491b {
            public C18495d(String str, int i, EnumC18496c enumC18496c, int i2) {
                super(str, i, enumC18496c, i2);
            }
        }

        static {
            EnumC18496c enumC18496c = EnumC18496c.LONG;
            f74758f = new EnumC18491b("INT64", 2, enumC18496c, 0);
            f74759g = new EnumC18491b("UINT64", 3, enumC18496c, 0);
            EnumC18496c enumC18496c2 = EnumC18496c.INT;
            f74760h = new EnumC18491b("INT32", 4, enumC18496c2, 0);
            f74761i = new EnumC18491b("FIXED64", 5, enumC18496c, 1);
            f74762j = new EnumC18491b("FIXED32", 6, enumC18496c2, 5);
            f74763k = new EnumC18491b("BOOL", 7, EnumC18496c.BOOLEAN, 0);
            f74764l = new C18492a("STRING", 8, EnumC18496c.STRING, 2);
            EnumC18496c enumC18496c3 = EnumC18496c.MESSAGE;
            f74765m = new C18493b("GROUP", 9, enumC18496c3, 3);
            f74766n = new C18494c("MESSAGE", 10, enumC18496c3, 2);
            f74767o = new C18495d("BYTES", 11, EnumC18496c.BYTE_STRING, 2);
            f74768p = new EnumC18491b("UINT32", 12, enumC18496c2, 0);
            f74769q = new EnumC18491b("ENUM", 13, EnumC18496c.ENUM, 0);
            f74770r = new EnumC18491b("SFIXED32", 14, enumC18496c2, 5);
            f74771s = new EnumC18491b("SFIXED64", 15, enumC18496c, 1);
            f74772t = new EnumC18491b("SINT32", 16, enumC18496c2, 0);
            f74773u = new EnumC18491b("SINT64", 17, enumC18496c, 0);
            f74774v = m46342a();
        }

        /* renamed from: a */
        public static /* synthetic */ EnumC18491b[] m46342a() {
            return new EnumC18491b[]{f74756d, f74757e, f74758f, f74759g, f74760h, f74761i, f74762j, f74763k, f74764l, f74765m, f74766n, f74767o, f74768p, f74769q, f74770r, f74771s, f74772t, f74773u};
        }

        public static EnumC18491b valueOf(String str) {
            return (EnumC18491b) Enum.valueOf(EnumC18491b.class, str);
        }

        public static EnumC18491b[] values() {
            return (EnumC18491b[]) f74774v.clone();
        }

        /* renamed from: b */
        public EnumC18496c m46341b() {
            return this.f74775b;
        }

        /* renamed from: c */
        public int m46340c() {
            return this.f74776c;
        }

        public EnumC18491b(String str, int i, EnumC18496c enumC18496c, int i2) {
            this.f74775b = enumC18496c;
            this.f74776c = i2;
        }
    }

    /* renamed from: com.google.protobuf.P$c */
    /* loaded from: classes6.dex */
    public enum EnumC18496c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC18504e.f74797c),
        ENUM(null),
        MESSAGE(null);
        

        /* renamed from: b */
        public final Object f74787b;

        EnumC18496c(Object obj) {
            this.f74787b = obj;
        }
    }

    private C18489P() {
    }

    /* renamed from: a */
    public static int m46345a(int i) {
        return i >>> 3;
    }

    /* renamed from: b */
    public static int m46344b(int i) {
        return i & 7;
    }

    /* renamed from: c */
    public static int m46343c(int i, int i2) {
        return (i << 3) | i2;
    }
}
