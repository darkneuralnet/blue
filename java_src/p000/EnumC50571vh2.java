package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC18199g;
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
/* renamed from: vh2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC50571vh2 {

    /* renamed from: e */
    public static final EnumC50571vh2 f114504e;

    /* renamed from: f */
    public static final EnumC50571vh2 f114505f;

    /* renamed from: g */
    public static final EnumC50571vh2 f114506g;

    /* renamed from: h */
    public static final EnumC50571vh2 f114507h;

    /* renamed from: i */
    public static final EnumC50571vh2 f114508i;

    /* renamed from: j */
    public static final EnumC50571vh2 f114509j;

    /* renamed from: k */
    public static final EnumC50571vh2 f114510k;

    /* renamed from: l */
    public static final EnumC50571vh2 f114511l;

    /* renamed from: m */
    public static final EnumC50571vh2 f114512m;

    /* renamed from: n */
    public static final EnumC50571vh2 f114513n;

    /* renamed from: o */
    public static final /* synthetic */ EnumC50571vh2[] f114514o;

    /* renamed from: b */
    public final Class<?> f114515b;

    /* renamed from: c */
    public final Class<?> f114516c;

    /* renamed from: d */
    public final Object f114517d;

    static {
        EnumC50571vh2 enumC50571vh2 = new EnumC50571vh2("VOID", 0, Void.class, Void.class, null);
        f114504e = enumC50571vh2;
        Class cls = Integer.TYPE;
        EnumC50571vh2 enumC50571vh22 = new EnumC50571vh2("INT", 1, cls, Integer.class, 0);
        f114505f = enumC50571vh22;
        EnumC50571vh2 enumC50571vh23 = new EnumC50571vh2("LONG", 2, Long.TYPE, Long.class, 0L);
        f114506g = enumC50571vh23;
        EnumC50571vh2 enumC50571vh24 = new EnumC50571vh2("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f114507h = enumC50571vh24;
        EnumC50571vh2 enumC50571vh25 = new EnumC50571vh2("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f114508i = enumC50571vh25;
        EnumC50571vh2 enumC50571vh26 = new EnumC50571vh2("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f114509j = enumC50571vh26;
        EnumC50571vh2 enumC50571vh27 = new EnumC50571vh2("STRING", 6, String.class, String.class, "");
        f114510k = enumC50571vh27;
        EnumC50571vh2 enumC50571vh28 = new EnumC50571vh2("BYTE_STRING", 7, AbstractC18199g.class, AbstractC18199g.class, AbstractC18199g.f74142c);
        f114511l = enumC50571vh28;
        EnumC50571vh2 enumC50571vh29 = new EnumC50571vh2("ENUM", 8, cls, Integer.class, null);
        f114512m = enumC50571vh29;
        EnumC50571vh2 enumC50571vh210 = new EnumC50571vh2("MESSAGE", 9, Object.class, Object.class, null);
        f114513n = enumC50571vh210;
        f114514o = new EnumC50571vh2[]{enumC50571vh2, enumC50571vh22, enumC50571vh23, enumC50571vh24, enumC50571vh25, enumC50571vh26, enumC50571vh27, enumC50571vh28, enumC50571vh29, enumC50571vh210};
    }

    public EnumC50571vh2(String str, int i, Class cls, Class cls2, Object obj) {
        this.f114515b = cls;
        this.f114516c = cls2;
        this.f114517d = obj;
    }

    public static EnumC50571vh2 valueOf(String str) {
        return (EnumC50571vh2) Enum.valueOf(EnumC50571vh2.class, str);
    }

    public static EnumC50571vh2[] values() {
        return (EnumC50571vh2[]) f114514o.clone();
    }

    /* renamed from: a */
    public Class<?> m8253a() {
        return this.f114516c;
    }
}
