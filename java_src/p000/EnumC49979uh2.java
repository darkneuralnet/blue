package p000;

import com.google.protobuf.AbstractC18504e;
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
/* renamed from: uh2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC49979uh2 {

    /* renamed from: e */
    public static final EnumC49979uh2 f112764e = new EnumC49979uh2("VOID", 0, Void.class, Void.class, null);

    /* renamed from: f */
    public static final EnumC49979uh2 f112765f;

    /* renamed from: g */
    public static final EnumC49979uh2 f112766g;

    /* renamed from: h */
    public static final EnumC49979uh2 f112767h;

    /* renamed from: i */
    public static final EnumC49979uh2 f112768i;

    /* renamed from: j */
    public static final EnumC49979uh2 f112769j;

    /* renamed from: k */
    public static final EnumC49979uh2 f112770k;

    /* renamed from: l */
    public static final EnumC49979uh2 f112771l;

    /* renamed from: m */
    public static final EnumC49979uh2 f112772m;

    /* renamed from: n */
    public static final EnumC49979uh2 f112773n;

    /* renamed from: o */
    public static final /* synthetic */ EnumC49979uh2[] f112774o;

    /* renamed from: b */
    public final Class<?> f112775b;

    /* renamed from: c */
    public final Class<?> f112776c;

    /* renamed from: d */
    public final Object f112777d;

    static {
        Class cls = Integer.TYPE;
        f112765f = new EnumC49979uh2("INT", 1, cls, Integer.class, 0);
        f112766g = new EnumC49979uh2("LONG", 2, Long.TYPE, Long.class, 0L);
        f112767h = new EnumC49979uh2("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f112768i = new EnumC49979uh2("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f112769j = new EnumC49979uh2("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f112770k = new EnumC49979uh2("STRING", 6, String.class, String.class, "");
        f112771l = new EnumC49979uh2("BYTE_STRING", 7, AbstractC18504e.class, AbstractC18504e.class, AbstractC18504e.f74797c);
        f112772m = new EnumC49979uh2("ENUM", 8, cls, Integer.class, null);
        f112773n = new EnumC49979uh2("MESSAGE", 9, Object.class, Object.class, null);
        f112774o = m9875a();
    }

    public EnumC49979uh2(String str, int i, Class cls, Class cls2, Object obj) {
        this.f112775b = cls;
        this.f112776c = cls2;
        this.f112777d = obj;
    }

    /* renamed from: a */
    public static /* synthetic */ EnumC49979uh2[] m9875a() {
        return new EnumC49979uh2[]{f112764e, f112765f, f112766g, f112767h, f112768i, f112769j, f112770k, f112771l, f112772m, f112773n};
    }

    public static EnumC49979uh2 valueOf(String str) {
        return (EnumC49979uh2) Enum.valueOf(EnumC49979uh2.class, str);
    }

    public static EnumC49979uh2[] values() {
        return (EnumC49979uh2[]) f112774o.clone();
    }

    /* renamed from: b */
    public Class<?> m9874b() {
        return this.f112776c;
    }
}
