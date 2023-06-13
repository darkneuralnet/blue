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
/* renamed from: qb7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC47553qb7 {

    /* renamed from: e */
    public static final EnumC47553qb7 f105490e;

    /* renamed from: f */
    public static final EnumC47553qb7 f105491f;

    /* renamed from: g */
    public static final EnumC47553qb7 f105492g;

    /* renamed from: h */
    public static final EnumC47553qb7 f105493h;

    /* renamed from: i */
    public static final EnumC47553qb7 f105494i;

    /* renamed from: j */
    public static final EnumC47553qb7 f105495j;

    /* renamed from: k */
    public static final EnumC47553qb7 f105496k;

    /* renamed from: l */
    public static final EnumC47553qb7 f105497l;

    /* renamed from: m */
    public static final EnumC47553qb7 f105498m;

    /* renamed from: n */
    public static final EnumC47553qb7 f105499n;

    /* renamed from: o */
    public static final /* synthetic */ EnumC47553qb7[] f105500o;

    /* renamed from: b */
    public final Class f105501b;

    /* renamed from: c */
    public final Class f105502c;

    /* renamed from: d */
    public final Object f105503d;

    static {
        EnumC47553qb7 enumC47553qb7 = new EnumC47553qb7("VOID", 0, Void.class, Void.class, null);
        f105490e = enumC47553qb7;
        Class cls = Integer.TYPE;
        EnumC47553qb7 enumC47553qb72 = new EnumC47553qb7("INT", 1, cls, Integer.class, 0);
        f105491f = enumC47553qb72;
        EnumC47553qb7 enumC47553qb73 = new EnumC47553qb7("LONG", 2, Long.TYPE, Long.class, 0L);
        f105492g = enumC47553qb73;
        EnumC47553qb7 enumC47553qb74 = new EnumC47553qb7("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f105493h = enumC47553qb74;
        EnumC47553qb7 enumC47553qb75 = new EnumC47553qb7("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f105494i = enumC47553qb75;
        EnumC47553qb7 enumC47553qb76 = new EnumC47553qb7("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f105495j = enumC47553qb76;
        EnumC47553qb7 enumC47553qb77 = new EnumC47553qb7("STRING", 6, String.class, String.class, "");
        f105496k = enumC47553qb77;
        EnumC47553qb7 enumC47553qb78 = new EnumC47553qb7("BYTE_STRING", 7, AbstractC32088Ca7.class, AbstractC32088Ca7.class, AbstractC32088Ca7.f4281c);
        f105497l = enumC47553qb78;
        EnumC47553qb7 enumC47553qb79 = new EnumC47553qb7("ENUM", 8, cls, Integer.class, null);
        f105498m = enumC47553qb79;
        EnumC47553qb7 enumC47553qb710 = new EnumC47553qb7("MESSAGE", 9, Object.class, Object.class, null);
        f105499n = enumC47553qb710;
        f105500o = new EnumC47553qb7[]{enumC47553qb7, enumC47553qb72, enumC47553qb73, enumC47553qb74, enumC47553qb75, enumC47553qb76, enumC47553qb77, enumC47553qb78, enumC47553qb79, enumC47553qb710};
    }

    public EnumC47553qb7(String str, int i, Class cls, Class cls2, Object obj) {
        this.f105501b = cls;
        this.f105502c = cls2;
        this.f105503d = obj;
    }

    public static EnumC47553qb7[] values() {
        return (EnumC47553qb7[]) f105500o.clone();
    }

    /* renamed from: a */
    public final Class m17336a() {
        return this.f105502c;
    }
}
