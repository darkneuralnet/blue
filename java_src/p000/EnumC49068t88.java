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
/* renamed from: t88  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class EnumC49068t88 {

    /* renamed from: d */
    public static final EnumC49068t88 f109921d;

    /* renamed from: e */
    public static final EnumC49068t88 f109922e;

    /* renamed from: f */
    public static final EnumC49068t88 f109923f;

    /* renamed from: g */
    public static final EnumC49068t88 f109924g;

    /* renamed from: h */
    public static final EnumC49068t88 f109925h;

    /* renamed from: i */
    public static final EnumC49068t88 f109926i;

    /* renamed from: j */
    public static final EnumC49068t88 f109927j;

    /* renamed from: k */
    public static final EnumC49068t88 f109928k;

    /* renamed from: l */
    public static final EnumC49068t88 f109929l;

    /* renamed from: m */
    public static final EnumC49068t88 f109930m;

    /* renamed from: n */
    public static final EnumC49068t88 f109931n;

    /* renamed from: o */
    public static final EnumC49068t88 f109932o;

    /* renamed from: p */
    public static final EnumC49068t88 f109933p;

    /* renamed from: q */
    public static final EnumC49068t88 f109934q;

    /* renamed from: r */
    public static final EnumC49068t88 f109935r;

    /* renamed from: s */
    public static final EnumC49068t88 f109936s;

    /* renamed from: t */
    public static final EnumC49068t88 f109937t;

    /* renamed from: u */
    public static final EnumC49068t88 f109938u;

    /* renamed from: v */
    public static final /* synthetic */ EnumC49068t88[] f109939v;

    /* renamed from: b */
    public final EnumC52286ya8 f109940b;

    /* renamed from: c */
    public final int f109941c;

    static {
        EnumC49068t88 enumC49068t88 = new EnumC49068t88("DOUBLE", 0, EnumC52286ya8.DOUBLE, 1);
        f109921d = enumC49068t88;
        EnumC49068t88 enumC49068t882 = new EnumC49068t88("FLOAT", 1, EnumC52286ya8.FLOAT, 5);
        f109922e = enumC49068t882;
        EnumC52286ya8 enumC52286ya8 = EnumC52286ya8.LONG;
        EnumC49068t88 enumC49068t883 = new EnumC49068t88("INT64", 2, enumC52286ya8, 0);
        f109923f = enumC49068t883;
        EnumC49068t88 enumC49068t884 = new EnumC49068t88("UINT64", 3, enumC52286ya8, 0);
        f109924g = enumC49068t884;
        EnumC52286ya8 enumC52286ya82 = EnumC52286ya8.INT;
        EnumC49068t88 enumC49068t885 = new EnumC49068t88("INT32", 4, enumC52286ya82, 0);
        f109925h = enumC49068t885;
        EnumC49068t88 enumC49068t886 = new EnumC49068t88("FIXED64", 5, enumC52286ya8, 1);
        f109926i = enumC49068t886;
        EnumC49068t88 enumC49068t887 = new EnumC49068t88("FIXED32", 6, enumC52286ya82, 5);
        f109927j = enumC49068t887;
        EnumC49068t88 enumC49068t888 = new EnumC49068t88("BOOL", 7, EnumC52286ya8.BOOLEAN, 0);
        f109928k = enumC49068t888;
        final EnumC52286ya8 enumC52286ya83 = EnumC52286ya8.STRING;
        EnumC49068t88 enumC49068t889 = new EnumC49068t88("STRING", 8, enumC52286ya83, 2) { // from class: o98
        };
        f109929l = enumC49068t889;
        final EnumC52286ya8 enumC52286ya84 = EnumC52286ya8.MESSAGE;
        EnumC49068t88 enumC49068t8810 = new EnumC49068t88("GROUP", 9, enumC52286ya84, 3) { // from class: Y88
        };
        f109930m = enumC49068t8810;
        EnumC49068t88 enumC49068t8811 = new EnumC49068t88("MESSAGE", 10, enumC52286ya84, 2) { // from class: T98
        };
        f109931n = enumC49068t8811;
        final EnumC52286ya8 enumC52286ya85 = EnumC52286ya8.BYTE_STRING;
        EnumC49068t88 enumC49068t8812 = new EnumC49068t88("BYTES", 11, enumC52286ya85, 2) { // from class: D98
        };
        f109932o = enumC49068t8812;
        EnumC49068t88 enumC49068t8813 = new EnumC49068t88("UINT32", 12, enumC52286ya82, 0);
        f109933p = enumC49068t8813;
        EnumC49068t88 enumC49068t8814 = new EnumC49068t88("ENUM", 13, EnumC52286ya8.ENUM, 0);
        f109934q = enumC49068t8814;
        EnumC49068t88 enumC49068t8815 = new EnumC49068t88("SFIXED32", 14, enumC52286ya82, 5);
        f109935r = enumC49068t8815;
        EnumC49068t88 enumC49068t8816 = new EnumC49068t88("SFIXED64", 15, enumC52286ya8, 1);
        f109936s = enumC49068t8816;
        EnumC49068t88 enumC49068t8817 = new EnumC49068t88("SINT32", 16, enumC52286ya82, 0);
        f109937t = enumC49068t8817;
        EnumC49068t88 enumC49068t8818 = new EnumC49068t88("SINT64", 17, enumC52286ya8, 0);
        f109938u = enumC49068t8818;
        f109939v = new EnumC49068t88[]{enumC49068t88, enumC49068t882, enumC49068t883, enumC49068t884, enumC49068t885, enumC49068t886, enumC49068t887, enumC49068t888, enumC49068t889, enumC49068t8810, enumC49068t8811, enumC49068t8812, enumC49068t8813, enumC49068t8814, enumC49068t8815, enumC49068t8816, enumC49068t8817, enumC49068t8818};
    }

    public EnumC49068t88(String str, int i, EnumC52286ya8 enumC52286ya8, int i2) {
        this.f109940b = enumC52286ya8;
        this.f109941c = i2;
    }

    public static EnumC49068t88[] values() {
        return (EnumC49068t88[]) f109939v.clone();
    }

    /* renamed from: a */
    public final EnumC52286ya8 m13007a() {
        return this.f109940b;
    }
}
