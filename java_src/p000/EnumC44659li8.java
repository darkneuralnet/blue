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
/* renamed from: li8  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class EnumC44659li8 {

    /* renamed from: d */
    public static final EnumC44659li8 f96606d;

    /* renamed from: e */
    public static final EnumC44659li8 f96607e;

    /* renamed from: f */
    public static final EnumC44659li8 f96608f;

    /* renamed from: g */
    public static final EnumC44659li8 f96609g;

    /* renamed from: h */
    public static final EnumC44659li8 f96610h;

    /* renamed from: i */
    public static final EnumC44659li8 f96611i;

    /* renamed from: j */
    public static final EnumC44659li8 f96612j;

    /* renamed from: k */
    public static final EnumC44659li8 f96613k;

    /* renamed from: l */
    public static final EnumC44659li8 f96614l;

    /* renamed from: m */
    public static final EnumC44659li8 f96615m;

    /* renamed from: n */
    public static final EnumC44659li8 f96616n;

    /* renamed from: o */
    public static final EnumC44659li8 f96617o;

    /* renamed from: p */
    public static final EnumC44659li8 f96618p;

    /* renamed from: q */
    public static final EnumC44659li8 f96619q;

    /* renamed from: r */
    public static final EnumC44659li8 f96620r;

    /* renamed from: s */
    public static final EnumC44659li8 f96621s;

    /* renamed from: t */
    public static final EnumC44659li8 f96622t;

    /* renamed from: u */
    public static final EnumC44659li8 f96623u;

    /* renamed from: v */
    public static final /* synthetic */ EnumC44659li8[] f96624v;

    /* renamed from: b */
    public final EnumC31936Bj8 f96625b;

    /* renamed from: c */
    public final int f96626c;

    static {
        EnumC44659li8 enumC44659li8 = new EnumC44659li8("DOUBLE", 0, EnumC31936Bj8.DOUBLE, 1);
        f96606d = enumC44659li8;
        EnumC44659li8 enumC44659li82 = new EnumC44659li8("FLOAT", 1, EnumC31936Bj8.FLOAT, 5);
        f96607e = enumC44659li82;
        EnumC31936Bj8 enumC31936Bj8 = EnumC31936Bj8.LONG;
        EnumC44659li8 enumC44659li83 = new EnumC44659li8("INT64", 2, enumC31936Bj8, 0);
        f96608f = enumC44659li83;
        EnumC44659li8 enumC44659li84 = new EnumC44659li8("UINT64", 3, enumC31936Bj8, 0);
        f96609g = enumC44659li84;
        EnumC31936Bj8 enumC31936Bj82 = EnumC31936Bj8.INT;
        EnumC44659li8 enumC44659li85 = new EnumC44659li8("INT32", 4, enumC31936Bj82, 0);
        f96610h = enumC44659li85;
        EnumC44659li8 enumC44659li86 = new EnumC44659li8("FIXED64", 5, enumC31936Bj8, 1);
        f96611i = enumC44659li86;
        EnumC44659li8 enumC44659li87 = new EnumC44659li8("FIXED32", 6, enumC31936Bj82, 5);
        f96612j = enumC44659li87;
        EnumC44659li8 enumC44659li88 = new EnumC44659li8("BOOL", 7, EnumC31936Bj8.BOOLEAN, 0);
        f96613k = enumC44659li88;
        final EnumC31936Bj8 enumC31936Bj83 = EnumC31936Bj8.STRING;
        EnumC44659li8 enumC44659li89 = new EnumC44659li8("STRING", 8, enumC31936Bj83, 2) { // from class: yi8
        };
        f96614l = enumC44659li89;
        final EnumC31936Bj8 enumC31936Bj84 = EnumC31936Bj8.MESSAGE;
        EnumC44659li8 enumC44659li810 = new EnumC44659li8("GROUP", 9, enumC31936Bj84, 3) { // from class: Ni8
        };
        f96615m = enumC44659li810;
        EnumC44659li8 enumC44659li811 = new EnumC44659li8("MESSAGE", 10, enumC31936Bj84, 2) { // from class: aj8
        };
        f96616n = enumC44659li811;
        final EnumC31936Bj8 enumC31936Bj85 = EnumC31936Bj8.BYTE_STRING;
        EnumC44659li8 enumC44659li812 = new EnumC44659li8("BYTES", 11, enumC31936Bj85, 2) { // from class: oj8
        };
        f96617o = enumC44659li812;
        EnumC44659li8 enumC44659li813 = new EnumC44659li8("UINT32", 12, enumC31936Bj82, 0);
        f96618p = enumC44659li813;
        EnumC44659li8 enumC44659li814 = new EnumC44659li8("ENUM", 13, EnumC31936Bj8.ENUM, 0);
        f96619q = enumC44659li814;
        EnumC44659li8 enumC44659li815 = new EnumC44659li8("SFIXED32", 14, enumC31936Bj82, 5);
        f96620r = enumC44659li815;
        EnumC44659li8 enumC44659li816 = new EnumC44659li8("SFIXED64", 15, enumC31936Bj8, 1);
        f96621s = enumC44659li816;
        EnumC44659li8 enumC44659li817 = new EnumC44659li8("SINT32", 16, enumC31936Bj82, 0);
        f96622t = enumC44659li817;
        EnumC44659li8 enumC44659li818 = new EnumC44659li8("SINT64", 17, enumC31936Bj8, 0);
        f96623u = enumC44659li818;
        f96624v = new EnumC44659li8[]{enumC44659li8, enumC44659li82, enumC44659li83, enumC44659li84, enumC44659li85, enumC44659li86, enumC44659li87, enumC44659li88, enumC44659li89, enumC44659li810, enumC44659li811, enumC44659li812, enumC44659li813, enumC44659li814, enumC44659li815, enumC44659li816, enumC44659li817, enumC44659li818};
    }

    public EnumC44659li8(String str, int i, EnumC31936Bj8 enumC31936Bj8, int i2) {
        this.f96625b = enumC31936Bj8;
        this.f96626c = i2;
    }

    public static EnumC44659li8[] values() {
        return (EnumC44659li8[]) f96624v.clone();
    }

    /* renamed from: a */
    public final EnumC31936Bj8 m26926a() {
        return this.f96625b;
    }
}
