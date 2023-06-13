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
/* renamed from: CW8 */
/* loaded from: classes5.dex */
public final class CW8 {

    /* renamed from: e */
    public static final CW8 f4163e;

    /* renamed from: f */
    public static final CW8 f4164f;

    /* renamed from: g */
    public static final CW8 f4165g;

    /* renamed from: h */
    public static final CW8 f4166h;

    /* renamed from: i */
    public static final CW8 f4167i;

    /* renamed from: j */
    public static final CW8 f4168j;

    /* renamed from: k */
    public static final CW8 f4169k;

    /* renamed from: l */
    public static final CW8 f4170l;

    /* renamed from: m */
    public static final CW8 f4171m;

    /* renamed from: n */
    public static final CW8 f4172n;

    /* renamed from: o */
    public static final /* synthetic */ CW8[] f4173o;

    /* renamed from: b */
    public final Class f4174b;

    /* renamed from: c */
    public final Class f4175c;

    /* renamed from: d */
    public final Object f4176d;

    static {
        CW8 cw8 = new CW8("VOID", 0, Void.class, Void.class, null);
        f4163e = cw8;
        Class cls = Integer.TYPE;
        CW8 cw82 = new CW8("INT", 1, cls, Integer.class, 0);
        f4164f = cw82;
        CW8 cw83 = new CW8("LONG", 2, Long.TYPE, Long.class, 0L);
        f4165g = cw83;
        CW8 cw84 = new CW8("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f4166h = cw84;
        CW8 cw85 = new CW8("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f4167i = cw85;
        CW8 cw86 = new CW8("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f4168j = cw86;
        CW8 cw87 = new CW8("STRING", 6, String.class, String.class, "");
        f4169k = cw87;
        CW8 cw88 = new CW8("BYTE_STRING", 7, AbstractC40913fO8.class, AbstractC40913fO8.class, AbstractC40913fO8.f80055c);
        f4170l = cw88;
        CW8 cw89 = new CW8("ENUM", 8, cls, Integer.class, null);
        f4171m = cw89;
        CW8 cw810 = new CW8("MESSAGE", 9, Object.class, Object.class, null);
        f4172n = cw810;
        f4173o = new CW8[]{cw8, cw82, cw83, cw84, cw85, cw86, cw87, cw88, cw89, cw810};
    }

    public CW8(String str, int i, Class cls, Class cls2, Object obj) {
        this.f4174b = cls;
        this.f4175c = cls2;
        this.f4176d = obj;
    }

    public static CW8[] values() {
        return (CW8[]) f4173o.clone();
    }

    /* renamed from: a */
    public final Class m112178a() {
        return this.f4175c;
    }
}
