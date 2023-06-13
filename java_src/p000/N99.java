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
/* renamed from: N99 */
/* loaded from: classes5.dex */
public final class N99 {

    /* renamed from: c */
    public static final N99 f24206c;

    /* renamed from: d */
    public static final N99 f24207d;

    /* renamed from: e */
    public static final N99 f24208e;

    /* renamed from: f */
    public static final N99 f24209f;

    /* renamed from: g */
    public static final N99 f24210g;

    /* renamed from: h */
    public static final N99 f24211h;

    /* renamed from: i */
    public static final N99 f24212i;

    /* renamed from: j */
    public static final N99 f24213j;

    /* renamed from: k */
    public static final N99 f24214k;

    /* renamed from: l */
    public static final N99 f24215l;

    /* renamed from: m */
    public static final N99 f24216m;

    /* renamed from: n */
    public static final N99 f24217n;

    /* renamed from: o */
    public static final N99 f24218o;

    /* renamed from: p */
    public static final N99 f24219p;

    /* renamed from: q */
    public static final N99 f24220q;

    /* renamed from: r */
    public static final N99 f24221r;

    /* renamed from: s */
    public static final N99 f24222s;

    /* renamed from: t */
    public static final N99 f24223t;

    /* renamed from: u */
    public static final /* synthetic */ N99[] f24224u;

    /* renamed from: b */
    public final U99 f24225b;

    static {
        N99 n99 = new N99("DOUBLE", 0, U99.DOUBLE, 1);
        f24206c = n99;
        N99 n992 = new N99("FLOAT", 1, U99.FLOAT, 5);
        f24207d = n992;
        U99 u99 = U99.LONG;
        N99 n993 = new N99("INT64", 2, u99, 0);
        f24208e = n993;
        N99 n994 = new N99("UINT64", 3, u99, 0);
        f24209f = n994;
        U99 u992 = U99.INT;
        N99 n995 = new N99("INT32", 4, u992, 0);
        f24210g = n995;
        N99 n996 = new N99("FIXED64", 5, u99, 1);
        f24211h = n996;
        N99 n997 = new N99("FIXED32", 6, u992, 5);
        f24212i = n997;
        N99 n998 = new N99("BOOL", 7, U99.BOOLEAN, 0);
        f24213j = n998;
        N99 n999 = new N99("STRING", 8, U99.STRING, 2);
        f24214k = n999;
        U99 u993 = U99.MESSAGE;
        N99 n9910 = new N99("GROUP", 9, u993, 3);
        f24215l = n9910;
        N99 n9911 = new N99("MESSAGE", 10, u993, 2);
        f24216m = n9911;
        N99 n9912 = new N99("BYTES", 11, U99.BYTE_STRING, 2);
        f24217n = n9912;
        N99 n9913 = new N99("UINT32", 12, u992, 0);
        f24218o = n9913;
        N99 n9914 = new N99("ENUM", 13, U99.ENUM, 0);
        f24219p = n9914;
        N99 n9915 = new N99("SFIXED32", 14, u992, 5);
        f24220q = n9915;
        N99 n9916 = new N99("SFIXED64", 15, u99, 1);
        f24221r = n9916;
        N99 n9917 = new N99("SINT32", 16, u992, 0);
        f24222s = n9917;
        N99 n9918 = new N99("SINT64", 17, u99, 0);
        f24223t = n9918;
        f24224u = new N99[]{n99, n992, n993, n994, n995, n996, n997, n998, n999, n9910, n9911, n9912, n9913, n9914, n9915, n9916, n9917, n9918};
    }

    public N99(String str, int i, U99 u99, int i2) {
        this.f24225b = u99;
    }

    public static N99[] values() {
        return (N99[]) f24224u.clone();
    }

    /* renamed from: a */
    public final U99 m94304a() {
        return this.f24225b;
    }
}
