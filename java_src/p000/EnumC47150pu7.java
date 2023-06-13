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
/* renamed from: pu7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC47150pu7 {

    /* renamed from: e */
    public static final EnumC47150pu7 f104297e;

    /* renamed from: f */
    public static final EnumC47150pu7 f104298f;

    /* renamed from: g */
    public static final EnumC47150pu7 f104299g;

    /* renamed from: h */
    public static final EnumC47150pu7 f104300h;

    /* renamed from: i */
    public static final EnumC47150pu7 f104301i;

    /* renamed from: j */
    public static final EnumC47150pu7 f104302j;

    /* renamed from: k */
    public static final EnumC47150pu7 f104303k;

    /* renamed from: l */
    public static final EnumC47150pu7 f104304l;

    /* renamed from: m */
    public static final EnumC47150pu7 f104305m;

    /* renamed from: n */
    public static final EnumC47150pu7 f104306n;

    /* renamed from: o */
    public static final /* synthetic */ EnumC47150pu7[] f104307o;

    /* renamed from: b */
    public final Class f104308b;

    /* renamed from: c */
    public final Class f104309c;

    /* renamed from: d */
    public final Object f104310d;

    static {
        EnumC47150pu7 enumC47150pu7 = new EnumC47150pu7("VOID", 0, Void.class, Void.class, null);
        f104297e = enumC47150pu7;
        Class cls = Integer.TYPE;
        EnumC47150pu7 enumC47150pu72 = new EnumC47150pu7("INT", 1, cls, Integer.class, 0);
        f104298f = enumC47150pu72;
        EnumC47150pu7 enumC47150pu73 = new EnumC47150pu7("LONG", 2, Long.TYPE, Long.class, 0L);
        f104299g = enumC47150pu73;
        EnumC47150pu7 enumC47150pu74 = new EnumC47150pu7("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f104300h = enumC47150pu74;
        EnumC47150pu7 enumC47150pu75 = new EnumC47150pu7("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f104301i = enumC47150pu75;
        EnumC47150pu7 enumC47150pu76 = new EnumC47150pu7("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f104302j = enumC47150pu76;
        EnumC47150pu7 enumC47150pu77 = new EnumC47150pu7("STRING", 6, String.class, String.class, "");
        f104303k = enumC47150pu77;
        EnumC47150pu7 enumC47150pu78 = new EnumC47150pu7("BYTE_STRING", 7, AbstractC44175kt7.class, AbstractC44175kt7.class, AbstractC44175kt7.f95165c);
        f104304l = enumC47150pu78;
        EnumC47150pu7 enumC47150pu79 = new EnumC47150pu7("ENUM", 8, cls, Integer.class, null);
        f104305m = enumC47150pu79;
        EnumC47150pu7 enumC47150pu710 = new EnumC47150pu7("MESSAGE", 9, Object.class, Object.class, null);
        f104306n = enumC47150pu710;
        f104307o = new EnumC47150pu7[]{enumC47150pu7, enumC47150pu72, enumC47150pu73, enumC47150pu74, enumC47150pu75, enumC47150pu76, enumC47150pu77, enumC47150pu78, enumC47150pu79, enumC47150pu710};
    }

    public EnumC47150pu7(String str, int i, Class cls, Class cls2, Object obj) {
        this.f104308b = cls;
        this.f104309c = cls2;
        this.f104310d = obj;
    }

    public static EnumC47150pu7[] values() {
        return (EnumC47150pu7[]) f104307o.clone();
    }

    /* renamed from: a */
    public final Class m18436a() {
        return this.f104309c;
    }
}
