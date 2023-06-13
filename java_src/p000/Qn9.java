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
/* renamed from: Qn9 */
/* loaded from: classes6.dex */
public final class Qn9 {

    /* renamed from: e */
    public static final Qn9 f30957e;

    /* renamed from: f */
    public static final Qn9 f30958f;

    /* renamed from: g */
    public static final Qn9 f30959g;

    /* renamed from: h */
    public static final Qn9 f30960h;

    /* renamed from: i */
    public static final Qn9 f30961i;

    /* renamed from: j */
    public static final Qn9 f30962j;

    /* renamed from: k */
    public static final Qn9 f30963k;

    /* renamed from: l */
    public static final Qn9 f30964l;

    /* renamed from: m */
    public static final Qn9 f30965m;

    /* renamed from: n */
    public static final Qn9 f30966n;

    /* renamed from: o */
    public static final /* synthetic */ Qn9[] f30967o;

    /* renamed from: b */
    public final Class<?> f30968b;

    /* renamed from: c */
    public final Class<?> f30969c;

    /* renamed from: d */
    public final Object f30970d;

    static {
        Qn9 qn9 = new Qn9("VOID", 0, Void.class, Void.class, null);
        f30957e = qn9;
        Class cls = Integer.TYPE;
        Qn9 qn92 = new Qn9("INT", 1, cls, Integer.class, 0);
        f30958f = qn92;
        Qn9 qn93 = new Qn9("LONG", 2, Long.TYPE, Long.class, 0L);
        f30959g = qn93;
        Qn9 qn94 = new Qn9("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f30960h = qn94;
        Qn9 qn95 = new Qn9("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f30961i = qn95;
        Qn9 qn96 = new Qn9("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f30962j = qn96;
        Qn9 qn97 = new Qn9("STRING", 6, String.class, String.class, "");
        f30963k = qn97;
        Qn9 qn98 = new Qn9("BYTE_STRING", 7, AbstractC45836nh9.class, AbstractC45836nh9.class, AbstractC45836nh9.f100361c);
        f30964l = qn98;
        Qn9 qn99 = new Qn9("ENUM", 8, cls, Integer.class, null);
        f30965m = qn99;
        Qn9 qn910 = new Qn9("MESSAGE", 9, Object.class, Object.class, null);
        f30966n = qn910;
        f30967o = new Qn9[]{qn9, qn92, qn93, qn94, qn95, qn96, qn97, qn98, qn99, qn910};
    }

    public Qn9(String str, int i, Class cls, Class cls2, Object obj) {
        this.f30968b = cls;
        this.f30969c = cls2;
        this.f30970d = obj;
    }

    public static Qn9[] values() {
        return (Qn9[]) f30967o.clone();
    }

    /* renamed from: a */
    public final Class<?> m87913a() {
        return this.f30969c;
    }
}
