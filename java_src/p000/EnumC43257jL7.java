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
/* renamed from: jL7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC43257jL7 {

    /* renamed from: e */
    public static final EnumC43257jL7 f92584e;

    /* renamed from: f */
    public static final EnumC43257jL7 f92585f;

    /* renamed from: g */
    public static final EnumC43257jL7 f92586g;

    /* renamed from: h */
    public static final EnumC43257jL7 f92587h;

    /* renamed from: i */
    public static final EnumC43257jL7 f92588i;

    /* renamed from: j */
    public static final EnumC43257jL7 f92589j;

    /* renamed from: k */
    public static final EnumC43257jL7 f92590k;

    /* renamed from: l */
    public static final EnumC43257jL7 f92591l;

    /* renamed from: m */
    public static final EnumC43257jL7 f92592m;

    /* renamed from: n */
    public static final EnumC43257jL7 f92593n;

    /* renamed from: o */
    public static final /* synthetic */ EnumC43257jL7[] f92594o;

    /* renamed from: b */
    public final Class<?> f92595b;

    /* renamed from: c */
    public final Class<?> f92596c;

    /* renamed from: d */
    public final Object f92597d;

    static {
        EnumC43257jL7 enumC43257jL7 = new EnumC43257jL7("VOID", 0, Void.class, Void.class, null);
        f92584e = enumC43257jL7;
        Class cls = Integer.TYPE;
        EnumC43257jL7 enumC43257jL72 = new EnumC43257jL7("INT", 1, cls, Integer.class, 0);
        f92585f = enumC43257jL72;
        EnumC43257jL7 enumC43257jL73 = new EnumC43257jL7("LONG", 2, Long.TYPE, Long.class, 0L);
        f92586g = enumC43257jL73;
        EnumC43257jL7 enumC43257jL74 = new EnumC43257jL7("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f92587h = enumC43257jL74;
        EnumC43257jL7 enumC43257jL75 = new EnumC43257jL7("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f92588i = enumC43257jL75;
        EnumC43257jL7 enumC43257jL76 = new EnumC43257jL7("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f92589j = enumC43257jL76;
        EnumC43257jL7 enumC43257jL77 = new EnumC43257jL7("STRING", 6, String.class, String.class, "");
        f92590k = enumC43257jL77;
        EnumC43257jL7 enumC43257jL78 = new EnumC43257jL7("BYTE_STRING", 7, AbstractC43604jv9.class, AbstractC43604jv9.class, AbstractC43604jv9.f93538c);
        f92591l = enumC43257jL78;
        EnumC43257jL7 enumC43257jL79 = new EnumC43257jL7("ENUM", 8, cls, Integer.class, null);
        f92592m = enumC43257jL79;
        EnumC43257jL7 enumC43257jL710 = new EnumC43257jL7("MESSAGE", 9, Object.class, Object.class, null);
        f92593n = enumC43257jL710;
        f92594o = new EnumC43257jL7[]{enumC43257jL7, enumC43257jL72, enumC43257jL73, enumC43257jL74, enumC43257jL75, enumC43257jL76, enumC43257jL77, enumC43257jL78, enumC43257jL79, enumC43257jL710};
    }

    public EnumC43257jL7(String str, int i, Class cls, Class cls2, Object obj) {
        this.f92595b = cls;
        this.f92596c = cls2;
        this.f92597d = obj;
    }

    public static EnumC43257jL7[] values() {
        return (EnumC43257jL7[]) f92594o.clone();
    }

    /* renamed from: a */
    public final Class<?> m30759a() {
        return this.f92596c;
    }
}
