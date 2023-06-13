package p000;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum e uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: fn9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC41152fn9 {

    /* renamed from: c */
    public static final EnumC41152fn9 f80685c;

    /* renamed from: d */
    public static final EnumC41152fn9 f80686d;

    /* renamed from: e */
    public static final EnumC41152fn9 f80687e;

    /* renamed from: f */
    public static final EnumC41152fn9 f80688f;

    /* renamed from: g */
    public static final EnumC41152fn9 f80689g;

    /* renamed from: h */
    public static final EnumC41152fn9 f80690h;

    /* renamed from: i */
    public static final EnumC41152fn9 f80691i;

    /* renamed from: j */
    public static final EnumC41152fn9 f80692j;

    /* renamed from: k */
    public static final EnumC41152fn9 f80693k;

    /* renamed from: l */
    public static final EnumC41152fn9 f80694l;

    /* renamed from: m */
    public static final EnumC41152fn9 f80695m;

    /* renamed from: n */
    public static final EnumC41152fn9 f80696n;

    /* renamed from: o */
    public static final EnumC41152fn9 f80697o;

    /* renamed from: p */
    public static final EnumC41152fn9 f80698p;

    /* renamed from: q */
    public static final EnumC41152fn9 f80699q;

    /* renamed from: r */
    public static final EnumC41152fn9 f80700r;

    /* renamed from: s */
    public static final EnumC41152fn9 f80701s;

    /* renamed from: t */
    public static final EnumC41152fn9 f80702t;

    /* renamed from: u */
    public static final /* synthetic */ EnumC41152fn9[] f80703u;

    /* renamed from: b */
    public final EnumC44710ln9 f80704b;

    static {
        EnumC41152fn9 enumC41152fn9 = new EnumC41152fn9("DOUBLE", 0, EnumC44710ln9.DOUBLE, 1);
        f80685c = enumC41152fn9;
        EnumC41152fn9 enumC41152fn92 = new EnumC41152fn9("FLOAT", 1, EnumC44710ln9.FLOAT, 5);
        f80686d = enumC41152fn92;
        EnumC44710ln9 enumC44710ln9 = EnumC44710ln9.LONG;
        EnumC41152fn9 enumC41152fn93 = new EnumC41152fn9("INT64", 2, enumC44710ln9, 0);
        f80687e = enumC41152fn93;
        EnumC41152fn9 enumC41152fn94 = new EnumC41152fn9("UINT64", 3, enumC44710ln9, 0);
        f80688f = enumC41152fn94;
        EnumC44710ln9 enumC44710ln92 = EnumC44710ln9.INT;
        EnumC41152fn9 enumC41152fn95 = new EnumC41152fn9("INT32", 4, enumC44710ln92, 0);
        f80689g = enumC41152fn95;
        EnumC41152fn9 enumC41152fn96 = new EnumC41152fn9("FIXED64", 5, enumC44710ln9, 1);
        f80690h = enumC41152fn96;
        EnumC41152fn9 enumC41152fn97 = new EnumC41152fn9("FIXED32", 6, enumC44710ln92, 5);
        f80691i = enumC41152fn97;
        EnumC41152fn9 enumC41152fn98 = new EnumC41152fn9("BOOL", 7, EnumC44710ln9.BOOLEAN, 0);
        f80692j = enumC41152fn98;
        EnumC41152fn9 enumC41152fn99 = new EnumC41152fn9("STRING", 8, EnumC44710ln9.STRING, 2);
        f80693k = enumC41152fn99;
        EnumC44710ln9 enumC44710ln93 = EnumC44710ln9.MESSAGE;
        EnumC41152fn9 enumC41152fn910 = new EnumC41152fn9("GROUP", 9, enumC44710ln93, 3);
        f80694l = enumC41152fn910;
        EnumC41152fn9 enumC41152fn911 = new EnumC41152fn9("MESSAGE", 10, enumC44710ln93, 2);
        f80695m = enumC41152fn911;
        EnumC41152fn9 enumC41152fn912 = new EnumC41152fn9("BYTES", 11, EnumC44710ln9.BYTE_STRING, 2);
        f80696n = enumC41152fn912;
        EnumC41152fn9 enumC41152fn913 = new EnumC41152fn9("UINT32", 12, enumC44710ln92, 0);
        f80697o = enumC41152fn913;
        EnumC41152fn9 enumC41152fn914 = new EnumC41152fn9("ENUM", 13, EnumC44710ln9.ENUM, 0);
        f80698p = enumC41152fn914;
        EnumC41152fn9 enumC41152fn915 = new EnumC41152fn9("SFIXED32", 14, enumC44710ln92, 5);
        f80699q = enumC41152fn915;
        EnumC41152fn9 enumC41152fn916 = new EnumC41152fn9("SFIXED64", 15, enumC44710ln9, 1);
        f80700r = enumC41152fn916;
        EnumC41152fn9 enumC41152fn917 = new EnumC41152fn9("SINT32", 16, enumC44710ln92, 0);
        f80701s = enumC41152fn917;
        EnumC41152fn9 enumC41152fn918 = new EnumC41152fn9("SINT64", 17, enumC44710ln9, 0);
        f80702t = enumC41152fn918;
        f80703u = new EnumC41152fn9[]{enumC41152fn9, enumC41152fn92, enumC41152fn93, enumC41152fn94, enumC41152fn95, enumC41152fn96, enumC41152fn97, enumC41152fn98, enumC41152fn99, enumC41152fn910, enumC41152fn911, enumC41152fn912, enumC41152fn913, enumC41152fn914, enumC41152fn915, enumC41152fn916, enumC41152fn917, enumC41152fn918};
    }

    public EnumC41152fn9(String str, int i, EnumC44710ln9 enumC44710ln9, int i2) {
        this.f80704b = enumC44710ln9;
    }

    public static EnumC41152fn9[] values() {
        return (EnumC41152fn9[]) f80703u.clone();
    }

    /* renamed from: a */
    public final EnumC44710ln9 m40811a() {
        return this.f80704b;
    }
}
