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
/* renamed from: Rc7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class EnumC35616Rc7 {

    /* renamed from: d */
    public static final EnumC35616Rc7 f32319d;

    /* renamed from: e */
    public static final EnumC35616Rc7 f32320e;

    /* renamed from: f */
    public static final EnumC35616Rc7 f32321f;

    /* renamed from: g */
    public static final EnumC35616Rc7 f32322g;

    /* renamed from: h */
    public static final EnumC35616Rc7 f32323h;

    /* renamed from: i */
    public static final EnumC35616Rc7 f32324i;

    /* renamed from: j */
    public static final EnumC35616Rc7 f32325j;

    /* renamed from: k */
    public static final EnumC35616Rc7 f32326k;

    /* renamed from: l */
    public static final EnumC35616Rc7 f32327l;

    /* renamed from: m */
    public static final EnumC35616Rc7 f32328m;

    /* renamed from: n */
    public static final EnumC35616Rc7 f32329n;

    /* renamed from: o */
    public static final EnumC35616Rc7 f32330o;

    /* renamed from: p */
    public static final EnumC35616Rc7 f32331p;

    /* renamed from: q */
    public static final EnumC35616Rc7 f32332q;

    /* renamed from: r */
    public static final EnumC35616Rc7 f32333r;

    /* renamed from: s */
    public static final EnumC35616Rc7 f32334s;

    /* renamed from: t */
    public static final EnumC35616Rc7 f32335t;

    /* renamed from: u */
    public static final EnumC35616Rc7 f32336u;

    /* renamed from: v */
    public static final /* synthetic */ EnumC35616Rc7[] f32337v;

    /* renamed from: b */
    public final EnumC35850Sc7 f32338b;

    /* renamed from: c */
    public final int f32339c;

    static {
        EnumC35616Rc7 enumC35616Rc7 = new EnumC35616Rc7("DOUBLE", 0, EnumC35850Sc7.DOUBLE, 1);
        f32319d = enumC35616Rc7;
        EnumC35616Rc7 enumC35616Rc72 = new EnumC35616Rc7("FLOAT", 1, EnumC35850Sc7.FLOAT, 5);
        f32320e = enumC35616Rc72;
        EnumC35850Sc7 enumC35850Sc7 = EnumC35850Sc7.LONG;
        EnumC35616Rc7 enumC35616Rc73 = new EnumC35616Rc7("INT64", 2, enumC35850Sc7, 0);
        f32321f = enumC35616Rc73;
        EnumC35616Rc7 enumC35616Rc74 = new EnumC35616Rc7("UINT64", 3, enumC35850Sc7, 0);
        f32322g = enumC35616Rc74;
        EnumC35850Sc7 enumC35850Sc72 = EnumC35850Sc7.INT;
        EnumC35616Rc7 enumC35616Rc75 = new EnumC35616Rc7("INT32", 4, enumC35850Sc72, 0);
        f32323h = enumC35616Rc75;
        EnumC35616Rc7 enumC35616Rc76 = new EnumC35616Rc7("FIXED64", 5, enumC35850Sc7, 1);
        f32324i = enumC35616Rc76;
        EnumC35616Rc7 enumC35616Rc77 = new EnumC35616Rc7("FIXED32", 6, enumC35850Sc72, 5);
        f32325j = enumC35616Rc77;
        EnumC35616Rc7 enumC35616Rc78 = new EnumC35616Rc7("BOOL", 7, EnumC35850Sc7.BOOLEAN, 0);
        f32326k = enumC35616Rc78;
        EnumC35616Rc7 enumC35616Rc79 = new EnumC35616Rc7("STRING", 8, EnumC35850Sc7.STRING, 2);
        f32327l = enumC35616Rc79;
        EnumC35850Sc7 enumC35850Sc73 = EnumC35850Sc7.MESSAGE;
        EnumC35616Rc7 enumC35616Rc710 = new EnumC35616Rc7("GROUP", 9, enumC35850Sc73, 3);
        f32328m = enumC35616Rc710;
        EnumC35616Rc7 enumC35616Rc711 = new EnumC35616Rc7("MESSAGE", 10, enumC35850Sc73, 2);
        f32329n = enumC35616Rc711;
        EnumC35616Rc7 enumC35616Rc712 = new EnumC35616Rc7("BYTES", 11, EnumC35850Sc7.BYTE_STRING, 2);
        f32330o = enumC35616Rc712;
        EnumC35616Rc7 enumC35616Rc713 = new EnumC35616Rc7("UINT32", 12, enumC35850Sc72, 0);
        f32331p = enumC35616Rc713;
        EnumC35616Rc7 enumC35616Rc714 = new EnumC35616Rc7("ENUM", 13, EnumC35850Sc7.ENUM, 0);
        f32332q = enumC35616Rc714;
        EnumC35616Rc7 enumC35616Rc715 = new EnumC35616Rc7("SFIXED32", 14, enumC35850Sc72, 5);
        f32333r = enumC35616Rc715;
        EnumC35616Rc7 enumC35616Rc716 = new EnumC35616Rc7("SFIXED64", 15, enumC35850Sc7, 1);
        f32334s = enumC35616Rc716;
        EnumC35616Rc7 enumC35616Rc717 = new EnumC35616Rc7("SINT32", 16, enumC35850Sc72, 0);
        f32335t = enumC35616Rc717;
        EnumC35616Rc7 enumC35616Rc718 = new EnumC35616Rc7("SINT64", 17, enumC35850Sc7, 0);
        f32336u = enumC35616Rc718;
        f32337v = new EnumC35616Rc7[]{enumC35616Rc7, enumC35616Rc72, enumC35616Rc73, enumC35616Rc74, enumC35616Rc75, enumC35616Rc76, enumC35616Rc77, enumC35616Rc78, enumC35616Rc79, enumC35616Rc710, enumC35616Rc711, enumC35616Rc712, enumC35616Rc713, enumC35616Rc714, enumC35616Rc715, enumC35616Rc716, enumC35616Rc717, enumC35616Rc718};
    }

    public EnumC35616Rc7(String str, int i, EnumC35850Sc7 enumC35850Sc7, int i2) {
        this.f32338b = enumC35850Sc7;
        this.f32339c = i2;
    }

    public static EnumC35616Rc7[] values() {
        return (EnumC35616Rc7[]) f32337v.clone();
    }

    /* renamed from: a */
    public final EnumC35850Sc7 m86544a() {
        return this.f32338b;
    }

    /* renamed from: y */
    public final int m86543y() {
        return this.f32339c;
    }
}
