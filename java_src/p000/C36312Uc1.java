package p000;
/* renamed from: Uc1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36312Uc1 extends C1744E9 {

    /* renamed from: f */
    public static final C36312Uc1 f37664f;

    /* renamed from: g */
    public static final C36312Uc1 f37665g;

    /* renamed from: h */
    public static final C36312Uc1 f37666h;

    /* renamed from: i */
    public static final C36312Uc1 f37667i;

    /* renamed from: j */
    public static final C36312Uc1 f37668j;

    /* renamed from: k */
    public static final C36312Uc1 f37669k;

    /* renamed from: l */
    public static final C36312Uc1 f37670l;

    /* renamed from: m */
    public static final C36312Uc1 f37671m;

    /* renamed from: n */
    public static final C36312Uc1 f37672n;
    private static final long serialVersionUID = 1;

    /* renamed from: e */
    public final int f37673e;

    static {
        EnumC47980rJ4 enumC47980rJ4 = EnumC47980rJ4.REQUIRED;
        f37664f = new C36312Uc1("A128CBC-HS256", enumC47980rJ4, 256);
        EnumC47980rJ4 enumC47980rJ42 = EnumC47980rJ4.OPTIONAL;
        f37665g = new C36312Uc1("A192CBC-HS384", enumC47980rJ42, 384);
        f37666h = new C36312Uc1("A256CBC-HS512", enumC47980rJ4, 512);
        f37667i = new C36312Uc1("A128CBC+HS256", enumC47980rJ42, 256);
        f37668j = new C36312Uc1("A256CBC+HS512", enumC47980rJ42, 512);
        EnumC47980rJ4 enumC47980rJ43 = EnumC47980rJ4.RECOMMENDED;
        f37669k = new C36312Uc1("A128GCM", enumC47980rJ43, 128);
        f37670l = new C36312Uc1("A192GCM", enumC47980rJ42, 192);
        f37671m = new C36312Uc1("A256GCM", enumC47980rJ43, 256);
        f37672n = new C36312Uc1("XC20P", enumC47980rJ42, 256);
    }

    public C36312Uc1(String str, EnumC47980rJ4 enumC47980rJ4, int i) {
        super(str, enumC47980rJ4);
        this.f37673e = i;
    }

    /* renamed from: c */
    public static C36312Uc1 m81264c(String str) {
        C36312Uc1 c36312Uc1 = f37664f;
        if (str.equals(c36312Uc1.getName())) {
            return c36312Uc1;
        }
        C36312Uc1 c36312Uc12 = f37665g;
        if (str.equals(c36312Uc12.getName())) {
            return c36312Uc12;
        }
        C36312Uc1 c36312Uc13 = f37666h;
        if (str.equals(c36312Uc13.getName())) {
            return c36312Uc13;
        }
        C36312Uc1 c36312Uc14 = f37669k;
        if (str.equals(c36312Uc14.getName())) {
            return c36312Uc14;
        }
        C36312Uc1 c36312Uc15 = f37670l;
        if (str.equals(c36312Uc15.getName())) {
            return c36312Uc15;
        }
        C36312Uc1 c36312Uc16 = f37671m;
        if (str.equals(c36312Uc16.getName())) {
            return c36312Uc16;
        }
        C36312Uc1 c36312Uc17 = f37667i;
        if (str.equals(c36312Uc17.getName())) {
            return c36312Uc17;
        }
        C36312Uc1 c36312Uc18 = f37668j;
        if (str.equals(c36312Uc18.getName())) {
            return c36312Uc18;
        }
        C36312Uc1 c36312Uc19 = f37672n;
        if (str.equals(c36312Uc19.getName())) {
            return c36312Uc19;
        }
        return new C36312Uc1(str);
    }

    /* renamed from: b */
    public int m81265b() {
        return this.f37673e;
    }

    public C36312Uc1(String str) {
        this(str, null, 0);
    }
}
