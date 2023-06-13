package p000;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum f uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: vb8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC50517vb8 {

    /* renamed from: e */
    public static final EnumC50517vb8 f114387e;

    /* renamed from: f */
    public static final EnumC50517vb8 f114388f;

    /* renamed from: g */
    public static final EnumC50517vb8 f114389g;

    /* renamed from: h */
    public static final EnumC50517vb8 f114390h;

    /* renamed from: i */
    public static final EnumC50517vb8 f114391i;

    /* renamed from: j */
    public static final EnumC50517vb8 f114392j;

    /* renamed from: k */
    public static final EnumC50517vb8 f114393k;

    /* renamed from: l */
    public static final EnumC50517vb8 f114394l;

    /* renamed from: m */
    public static final EnumC50517vb8 f114395m;

    /* renamed from: n */
    public static final EnumC50517vb8 f114396n;

    /* renamed from: o */
    public static final /* synthetic */ EnumC50517vb8[] f114397o;

    /* renamed from: b */
    public final Class f114398b;

    /* renamed from: c */
    public final Class f114399c;

    /* renamed from: d */
    public final Object f114400d;

    static {
        EnumC50517vb8 enumC50517vb8 = new EnumC50517vb8("VOID", 0, Void.class, Void.class, null);
        f114387e = enumC50517vb8;
        Class cls = Integer.TYPE;
        EnumC50517vb8 enumC50517vb82 = new EnumC50517vb8("INT", 1, cls, Integer.class, 0);
        f114388f = enumC50517vb82;
        EnumC50517vb8 enumC50517vb83 = new EnumC50517vb8("LONG", 2, Long.TYPE, Long.class, 0L);
        f114389g = enumC50517vb83;
        EnumC50517vb8 enumC50517vb84 = new EnumC50517vb8("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f114390h = enumC50517vb84;
        EnumC50517vb8 enumC50517vb85 = new EnumC50517vb8("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f114391i = enumC50517vb85;
        EnumC50517vb8 enumC50517vb86 = new EnumC50517vb8("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f114392j = enumC50517vb86;
        EnumC50517vb8 enumC50517vb87 = new EnumC50517vb8("STRING", 6, String.class, String.class, "");
        f114393k = enumC50517vb87;
        EnumC50517vb8 enumC50517vb88 = new EnumC50517vb8("BYTE_STRING", 7, AbstractC41604gZ7.class, AbstractC41604gZ7.class, AbstractC41604gZ7.f82424c);
        f114394l = enumC50517vb88;
        EnumC50517vb8 enumC50517vb89 = new EnumC50517vb8("ENUM", 8, cls, Integer.class, null);
        f114395m = enumC50517vb89;
        EnumC50517vb8 enumC50517vb810 = new EnumC50517vb8("MESSAGE", 9, Object.class, Object.class, null);
        f114396n = enumC50517vb810;
        f114397o = new EnumC50517vb8[]{enumC50517vb8, enumC50517vb82, enumC50517vb83, enumC50517vb84, enumC50517vb85, enumC50517vb86, enumC50517vb87, enumC50517vb88, enumC50517vb89, enumC50517vb810};
    }

    public EnumC50517vb8(String str, int i, Class cls, Class cls2, Object obj) {
        this.f114398b = cls;
        this.f114399c = cls2;
        this.f114400d = obj;
    }

    public static EnumC50517vb8[] values() {
        return (EnumC50517vb8[]) f114397o.clone();
    }

    /* renamed from: a */
    public final Class m8386a() {
        return this.f114399c;
    }
}
