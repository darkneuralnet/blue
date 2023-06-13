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
/* renamed from: dK8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC39692dK8 {

    /* renamed from: e */
    public static final EnumC39692dK8 f76436e;

    /* renamed from: f */
    public static final EnumC39692dK8 f76437f;

    /* renamed from: g */
    public static final EnumC39692dK8 f76438g;

    /* renamed from: h */
    public static final EnumC39692dK8 f76439h;

    /* renamed from: i */
    public static final EnumC39692dK8 f76440i;

    /* renamed from: j */
    public static final EnumC39692dK8 f76441j;

    /* renamed from: k */
    public static final EnumC39692dK8 f76442k;

    /* renamed from: l */
    public static final EnumC39692dK8 f76443l;

    /* renamed from: m */
    public static final EnumC39692dK8 f76444m;

    /* renamed from: n */
    public static final EnumC39692dK8 f76445n;

    /* renamed from: o */
    public static final /* synthetic */ EnumC39692dK8[] f76446o;

    /* renamed from: b */
    public final Class<?> f76447b;

    /* renamed from: c */
    public final Class<?> f76448c;

    /* renamed from: d */
    public final Object f76449d;

    static {
        EnumC39692dK8 enumC39692dK8 = new EnumC39692dK8("VOID", 0, Void.class, Void.class, null);
        f76436e = enumC39692dK8;
        Class cls = Integer.TYPE;
        EnumC39692dK8 enumC39692dK82 = new EnumC39692dK8("INT", 1, cls, Integer.class, 0);
        f76437f = enumC39692dK82;
        EnumC39692dK8 enumC39692dK83 = new EnumC39692dK8("LONG", 2, Long.TYPE, Long.class, 0L);
        f76438g = enumC39692dK83;
        EnumC39692dK8 enumC39692dK84 = new EnumC39692dK8("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f76439h = enumC39692dK84;
        EnumC39692dK8 enumC39692dK85 = new EnumC39692dK8("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f76440i = enumC39692dK85;
        EnumC39692dK8 enumC39692dK86 = new EnumC39692dK8("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f76441j = enumC39692dK86;
        EnumC39692dK8 enumC39692dK87 = new EnumC39692dK8("STRING", 6, String.class, String.class, "");
        f76442k = enumC39692dK87;
        EnumC39692dK8 enumC39692dK88 = new EnumC39692dK8("BYTE_STRING", 7, AbstractC53119zy8.class, AbstractC53119zy8.class, AbstractC53119zy8.f122544c);
        f76443l = enumC39692dK88;
        EnumC39692dK8 enumC39692dK89 = new EnumC39692dK8("ENUM", 8, cls, Integer.class, null);
        f76444m = enumC39692dK89;
        EnumC39692dK8 enumC39692dK810 = new EnumC39692dK8("MESSAGE", 9, Object.class, Object.class, null);
        f76445n = enumC39692dK810;
        f76446o = new EnumC39692dK8[]{enumC39692dK8, enumC39692dK82, enumC39692dK83, enumC39692dK84, enumC39692dK85, enumC39692dK86, enumC39692dK87, enumC39692dK88, enumC39692dK89, enumC39692dK810};
    }

    public EnumC39692dK8(String str, int i, Class cls, Class cls2, Object obj) {
        this.f76447b = cls;
        this.f76448c = cls2;
        this.f76449d = obj;
    }

    public static EnumC39692dK8[] values() {
        return (EnumC39692dK8[]) f76446o.clone();
    }

    /* renamed from: a */
    public final Class<?> m44398a() {
        return this.f76448c;
    }
}
