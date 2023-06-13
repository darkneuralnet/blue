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
/* renamed from: eV7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC40382eV7 {

    /* renamed from: e */
    public static final EnumC40382eV7 f78482e;

    /* renamed from: f */
    public static final EnumC40382eV7 f78483f;

    /* renamed from: g */
    public static final EnumC40382eV7 f78484g;

    /* renamed from: h */
    public static final EnumC40382eV7 f78485h;

    /* renamed from: i */
    public static final EnumC40382eV7 f78486i;

    /* renamed from: j */
    public static final EnumC40382eV7 f78487j;

    /* renamed from: k */
    public static final EnumC40382eV7 f78488k;

    /* renamed from: l */
    public static final EnumC40382eV7 f78489l;

    /* renamed from: m */
    public static final EnumC40382eV7 f78490m;

    /* renamed from: n */
    public static final EnumC40382eV7 f78491n;

    /* renamed from: o */
    public static final /* synthetic */ EnumC40382eV7[] f78492o;

    /* renamed from: b */
    public final Class<?> f78493b;

    /* renamed from: c */
    public final Class<?> f78494c;

    /* renamed from: d */
    public final Object f78495d;

    static {
        EnumC40382eV7 enumC40382eV7 = new EnumC40382eV7("VOID", 0, Void.class, Void.class, null);
        f78482e = enumC40382eV7;
        Class cls = Integer.TYPE;
        EnumC40382eV7 enumC40382eV72 = new EnumC40382eV7("INT", 1, cls, Integer.class, 0);
        f78483f = enumC40382eV72;
        EnumC40382eV7 enumC40382eV73 = new EnumC40382eV7("LONG", 2, Long.TYPE, Long.class, 0L);
        f78484g = enumC40382eV73;
        EnumC40382eV7 enumC40382eV74 = new EnumC40382eV7("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f78485h = enumC40382eV74;
        EnumC40382eV7 enumC40382eV75 = new EnumC40382eV7("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f78486i = enumC40382eV75;
        EnumC40382eV7 enumC40382eV76 = new EnumC40382eV7("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f78487j = enumC40382eV76;
        EnumC40382eV7 enumC40382eV77 = new EnumC40382eV7("STRING", 6, String.class, String.class, "");
        f78488k = enumC40382eV77;
        EnumC40382eV7 enumC40382eV78 = new EnumC40382eV7("BYTE_STRING", 7, TD7.class, TD7.class, TD7.f34940c);
        f78489l = enumC40382eV78;
        EnumC40382eV7 enumC40382eV79 = new EnumC40382eV7("ENUM", 8, cls, Integer.class, null);
        f78490m = enumC40382eV79;
        EnumC40382eV7 enumC40382eV710 = new EnumC40382eV7("MESSAGE", 9, Object.class, Object.class, null);
        f78491n = enumC40382eV710;
        f78492o = new EnumC40382eV7[]{enumC40382eV7, enumC40382eV72, enumC40382eV73, enumC40382eV74, enumC40382eV75, enumC40382eV76, enumC40382eV77, enumC40382eV78, enumC40382eV79, enumC40382eV710};
    }

    public EnumC40382eV7(String str, int i, Class cls, Class cls2, Object obj) {
        this.f78493b = cls;
        this.f78494c = cls2;
        this.f78495d = obj;
    }

    public static EnumC40382eV7[] values() {
        return (EnumC40382eV7[]) f78492o.clone();
    }

    /* renamed from: a */
    public final Class<?> m42824a() {
        return this.f78494c;
    }
}
