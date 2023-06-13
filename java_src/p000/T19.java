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
/* renamed from: T19 */
/* loaded from: classes6.dex */
public class T19 {

    /* renamed from: d */
    public static final T19 f34653d;

    /* renamed from: e */
    public static final T19 f34654e;

    /* renamed from: f */
    public static final T19 f34655f;

    /* renamed from: g */
    public static final T19 f34656g;

    /* renamed from: h */
    public static final T19 f34657h;

    /* renamed from: i */
    public static final T19 f34658i;

    /* renamed from: j */
    public static final T19 f34659j;

    /* renamed from: k */
    public static final T19 f34660k;

    /* renamed from: l */
    public static final T19 f34661l;

    /* renamed from: m */
    public static final T19 f34662m;

    /* renamed from: n */
    public static final T19 f34663n;

    /* renamed from: o */
    public static final T19 f34664o;

    /* renamed from: p */
    public static final T19 f34665p;

    /* renamed from: q */
    public static final T19 f34666q;

    /* renamed from: r */
    public static final T19 f34667r;

    /* renamed from: s */
    public static final T19 f34668s;

    /* renamed from: t */
    public static final T19 f34669t;

    /* renamed from: u */
    public static final T19 f34670u;

    /* renamed from: v */
    public static final /* synthetic */ T19[] f34671v;

    /* renamed from: b */
    public final EnumC51380x29 f34672b;

    /* renamed from: c */
    public final int f34673c;

    static {
        T19 t19 = new T19("DOUBLE", 0, EnumC51380x29.DOUBLE, 1);
        f34653d = t19;
        T19 t192 = new T19("FLOAT", 1, EnumC51380x29.FLOAT, 5);
        f34654e = t192;
        EnumC51380x29 enumC51380x29 = EnumC51380x29.LONG;
        T19 t193 = new T19("INT64", 2, enumC51380x29, 0);
        f34655f = t193;
        T19 t194 = new T19("UINT64", 3, enumC51380x29, 0);
        f34656g = t194;
        EnumC51380x29 enumC51380x292 = EnumC51380x29.INT;
        T19 t195 = new T19("INT32", 4, enumC51380x292, 0);
        f34657h = t195;
        T19 t196 = new T19("FIXED64", 5, enumC51380x29, 1);
        f34658i = t196;
        T19 t197 = new T19("FIXED32", 6, enumC51380x292, 5);
        f34659j = t197;
        T19 t198 = new T19("BOOL", 7, EnumC51380x29.BOOLEAN, 0);
        f34660k = t198;
        final EnumC51380x29 enumC51380x293 = EnumC51380x29.STRING;
        T19 t199 = new T19("STRING", 8, enumC51380x293, 2) { // from class: J19
        };
        f34661l = t199;
        final EnumC51380x29 enumC51380x294 = EnumC51380x29.MESSAGE;
        T19 t1910 = new T19("GROUP", 9, enumC51380x294, 3) { // from class: n29
        };
        f34662m = t1910;
        T19 t1911 = new T19("MESSAGE", 10, enumC51380x294, 2) { // from class: d29
        };
        f34663n = t1911;
        final EnumC51380x29 enumC51380x295 = EnumC51380x29.BYTE_STRING;
        T19 t1912 = new T19("BYTES", 11, enumC51380x295, 2) { // from class: H29
        };
        f34664o = t1912;
        T19 t1913 = new T19("UINT32", 12, enumC51380x292, 0);
        f34665p = t1913;
        T19 t1914 = new T19("ENUM", 13, EnumC51380x29.ENUM, 0);
        f34666q = t1914;
        T19 t1915 = new T19("SFIXED32", 14, enumC51380x292, 5);
        f34667r = t1915;
        T19 t1916 = new T19("SFIXED64", 15, enumC51380x29, 1);
        f34668s = t1916;
        T19 t1917 = new T19("SINT32", 16, enumC51380x292, 0);
        f34669t = t1917;
        T19 t1918 = new T19("SINT64", 17, enumC51380x29, 0);
        f34670u = t1918;
        f34671v = new T19[]{t19, t192, t193, t194, t195, t196, t197, t198, t199, t1910, t1911, t1912, t1913, t1914, t1915, t1916, t1917, t1918};
    }

    public T19(String str, int i, EnumC51380x29 enumC51380x29, int i2) {
        this.f34672b = enumC51380x29;
        this.f34673c = i2;
    }

    public static T19[] values() {
        return (T19[]) f34671v.clone();
    }

    /* renamed from: a */
    public final EnumC51380x29 m84416a() {
        return this.f34672b;
    }
}
