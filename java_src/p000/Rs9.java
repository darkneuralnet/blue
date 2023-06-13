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
/* renamed from: Rs9 */
/* loaded from: classes6.dex */
public final class Rs9 {

    /* renamed from: d */
    public static final Rs9 f32768d;

    /* renamed from: e */
    public static final Rs9 f32769e;

    /* renamed from: f */
    public static final Rs9 f32770f;

    /* renamed from: g */
    public static final Rs9 f32771g;

    /* renamed from: h */
    public static final Rs9 f32772h;

    /* renamed from: i */
    public static final Rs9 f32773i;

    /* renamed from: j */
    public static final Rs9 f32774j;

    /* renamed from: k */
    public static final Rs9 f32775k;

    /* renamed from: l */
    public static final Rs9 f32776l;

    /* renamed from: m */
    public static final Rs9 f32777m;

    /* renamed from: n */
    public static final Rs9 f32778n;

    /* renamed from: o */
    public static final Rs9 f32779o;

    /* renamed from: p */
    public static final Rs9 f32780p;

    /* renamed from: q */
    public static final Rs9 f32781q;

    /* renamed from: r */
    public static final Rs9 f32782r;

    /* renamed from: s */
    public static final Rs9 f32783s;

    /* renamed from: t */
    public static final Rs9 f32784t;

    /* renamed from: u */
    public static final Rs9 f32785u;

    /* renamed from: v */
    public static final /* synthetic */ Rs9[] f32786v;

    /* renamed from: b */
    public final Ts9 f32787b;

    /* renamed from: c */
    public final int f32788c;

    static {
        Rs9 rs9 = new Rs9("DOUBLE", 0, Ts9.DOUBLE, 1);
        f32768d = rs9;
        Rs9 rs92 = new Rs9("FLOAT", 1, Ts9.FLOAT, 5);
        f32769e = rs92;
        Ts9 ts9 = Ts9.LONG;
        Rs9 rs93 = new Rs9("INT64", 2, ts9, 0);
        f32770f = rs93;
        Rs9 rs94 = new Rs9("UINT64", 3, ts9, 0);
        f32771g = rs94;
        Ts9 ts92 = Ts9.INT;
        Rs9 rs95 = new Rs9("INT32", 4, ts92, 0);
        f32772h = rs95;
        Rs9 rs96 = new Rs9("FIXED64", 5, ts9, 1);
        f32773i = rs96;
        Rs9 rs97 = new Rs9("FIXED32", 6, ts92, 5);
        f32774j = rs97;
        Rs9 rs98 = new Rs9("BOOL", 7, Ts9.BOOLEAN, 0);
        f32775k = rs98;
        Rs9 rs99 = new Rs9("STRING", 8, Ts9.STRING, 2);
        f32776l = rs99;
        Ts9 ts93 = Ts9.MESSAGE;
        Rs9 rs910 = new Rs9("GROUP", 9, ts93, 3);
        f32777m = rs910;
        Rs9 rs911 = new Rs9("MESSAGE", 10, ts93, 2);
        f32778n = rs911;
        Rs9 rs912 = new Rs9("BYTES", 11, Ts9.BYTE_STRING, 2);
        f32779o = rs912;
        Rs9 rs913 = new Rs9("UINT32", 12, ts92, 0);
        f32780p = rs913;
        Rs9 rs914 = new Rs9("ENUM", 13, Ts9.ENUM, 0);
        f32781q = rs914;
        Rs9 rs915 = new Rs9("SFIXED32", 14, ts92, 5);
        f32782r = rs915;
        Rs9 rs916 = new Rs9("SFIXED64", 15, ts9, 1);
        f32783s = rs916;
        Rs9 rs917 = new Rs9("SINT32", 16, ts92, 0);
        f32784t = rs917;
        Rs9 rs918 = new Rs9("SINT64", 17, ts9, 0);
        f32785u = rs918;
        f32786v = new Rs9[]{rs9, rs92, rs93, rs94, rs95, rs96, rs97, rs98, rs99, rs910, rs911, rs912, rs913, rs914, rs915, rs916, rs917, rs918};
    }

    public Rs9(String str, int i, Ts9 ts9, int i2) {
        this.f32787b = ts9;
        this.f32788c = i2;
    }

    public static Rs9[] values() {
        return (Rs9[]) f32786v.clone();
    }

    /* renamed from: a */
    public final Ts9 m86249a() {
        return this.f32787b;
    }

    public final int zza() {
        return this.f32788c;
    }
}
