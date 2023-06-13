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
/* renamed from: Dc9 */
/* loaded from: classes5.dex */
public final class Dc9 {

    /* renamed from: e */
    public static final Dc9 f6060e;

    /* renamed from: f */
    public static final Dc9 f6061f;

    /* renamed from: g */
    public static final Dc9 f6062g;

    /* renamed from: h */
    public static final Dc9 f6063h;

    /* renamed from: i */
    public static final Dc9 f6064i;

    /* renamed from: j */
    public static final Dc9 f6065j;

    /* renamed from: k */
    public static final Dc9 f6066k;

    /* renamed from: l */
    public static final Dc9 f6067l;

    /* renamed from: m */
    public static final Dc9 f6068m;

    /* renamed from: n */
    public static final Dc9 f6069n;

    /* renamed from: o */
    public static final /* synthetic */ Dc9[] f6070o;

    /* renamed from: b */
    public final Class f6071b;

    /* renamed from: c */
    public final Class f6072c;

    /* renamed from: d */
    public final Object f6073d;

    static {
        Dc9 dc9 = new Dc9("VOID", 0, Void.class, Void.class, null);
        f6060e = dc9;
        Class cls = Integer.TYPE;
        Dc9 dc92 = new Dc9("INT", 1, cls, Integer.class, 0);
        f6061f = dc92;
        Dc9 dc93 = new Dc9("LONG", 2, Long.TYPE, Long.class, 0L);
        f6062g = dc93;
        Dc9 dc94 = new Dc9("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f6063h = dc94;
        Dc9 dc95 = new Dc9("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f6064i = dc95;
        Dc9 dc96 = new Dc9("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f6065j = dc96;
        Dc9 dc97 = new Dc9("STRING", 6, String.class, String.class, "");
        f6066k = dc97;
        Dc9 dc98 = new Dc9("BYTE_STRING", 7, T69.class, T69.class, T69.f34797c);
        f6067l = dc98;
        Dc9 dc99 = new Dc9("ENUM", 8, cls, Integer.class, null);
        f6068m = dc99;
        Dc9 dc910 = new Dc9("MESSAGE", 9, Object.class, Object.class, null);
        f6069n = dc910;
        f6070o = new Dc9[]{dc9, dc92, dc93, dc94, dc95, dc96, dc97, dc98, dc99, dc910};
    }

    public Dc9(String str, int i, Class cls, Class cls2, Object obj) {
        this.f6071b = cls;
        this.f6072c = cls2;
        this.f6073d = obj;
    }

    public static Dc9[] values() {
        return (Dc9[]) f6070o.clone();
    }

    /* renamed from: a */
    public final Class m110093a() {
        return this.f6072c;
    }
}
