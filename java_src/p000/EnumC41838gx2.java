package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum n uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\"\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0093\u0001\b\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u000b\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010!\u001a\u00020\u000b\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0001\u0010#\u001a\u00020\u000b\u0012\b\b\u0001\u0010&\u001a\u00020\u000b¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u001d\u0010\u000fR\u0019\u0010 \u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010!\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\f\u0010\u001bR\u0019\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\b\u0010\u000fR\u0017\u0010#\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u0003\u0010\u001bR\u0017\u0010&\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001bj\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5¨\u00066"}, m28432d2 = {"Lgx2;", "", "", "b", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "lottieFile", "c", "i", "lottieUrl", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "imageDrawableRes", "g", "instructionsTitle", "", "Lm52;", "f", "Ljava/util/List;", "()Ljava/util/List;", "instructionsBodyLines", "I", "j", "()I", "primaryButton", "k", "secondaryButton", "l", "tertiaryButton", "dialogTitle", "dialogLockBody", "dialogConfirmButton", "m", "getDialogCancelButton", "dialogCancelButton", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;ILjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/Integer;II)V", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gx2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC41838gx2 {

    /* renamed from: A */
    public static final /* synthetic */ EnumC41838gx2[] f84507A;

    /* renamed from: n */
    public static final EnumC41838gx2 f84508n;

    /* renamed from: o */
    public static final EnumC41838gx2 f84509o;

    /* renamed from: p */
    public static final EnumC41838gx2 f84510p;

    /* renamed from: q */
    public static final EnumC41838gx2 f84511q;

    /* renamed from: r */
    public static final EnumC41838gx2 f84512r;

    /* renamed from: s */
    public static final EnumC41838gx2 f84513s;

    /* renamed from: t */
    public static final EnumC41838gx2 f84514t;

    /* renamed from: u */
    public static final EnumC41838gx2 f84515u;

    /* renamed from: v */
    public static final EnumC41838gx2 f84516v;

    /* renamed from: w */
    public static final EnumC41838gx2 f84517w;

    /* renamed from: x */
    public static final EnumC41838gx2 f84518x;

    /* renamed from: y */
    public static final EnumC41838gx2 f84519y;

    /* renamed from: z */
    public static final EnumC41838gx2 f84520z;

    /* renamed from: b */
    public final String f84521b;

    /* renamed from: c */
    public final String f84522c;

    /* renamed from: d */
    public final Integer f84523d;

    /* renamed from: e */
    public final Integer f84524e;

    /* renamed from: f */
    public final List<C44882m52> f84525f;

    /* renamed from: g */
    public final int f84526g;

    /* renamed from: h */
    public final Integer f84527h;

    /* renamed from: i */
    public final Integer f84528i;

    /* renamed from: j */
    public final int f84529j;

    /* renamed from: k */
    public final Integer f84530k;

    /* renamed from: l */
    public final int f84531l;

    /* renamed from: m */
    public final int f84532m;

    static {
        List listOf;
        List listOf2;
        List listOf3;
        List listOf4;
        List listOf5;
        List listOf6;
        List listOf7;
        List listOf8;
        List listOf9;
        List listOf10;
        List listOf11;
        List listOf12;
        List listOf13;
        Integer valueOf = Integer.valueOf(C45871nl4.smartlock_unlock_instructions_default_title);
        int i = C45871nl4.smartlock_unlock_instructions_default_body;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C44882m52(i, false, 2, null));
        int i2 = C45871nl4.smartlock_unlock_activity_default_primary_button;
        Integer valueOf2 = Integer.valueOf(C45871nl4.smartlock_unlock_activity_secondary_button);
        int i3 = C45871nl4.smartlock_cancel_unlock_dialog_title;
        int i4 = C45871nl4.smartlock_cancel_unlock_dialog_bird_was_unlocked;
        int i5 = C45871nl4.smartlock_cancel_unlock_dialog_not_yet;
        EnumC41838gx2 enumC41838gx2 = new EnumC41838gx2("DEFAULT", 0, "lottie/smartlock/smartlock_unlock.json", null, null, valueOf, listOf, i2, valueOf2, null, i3, null, i4, i5, 646, null);
        f84508n = enumC41838gx2;
        listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new C44882m52[]{new C44882m52(C45871nl4.physical_lock_lock_to_unlock_bullet_1, false, 2, null), new C44882m52(C45871nl4.physical_lock_lock_to_unlock_bullet_2, false, 2, null), new C44882m52(C45871nl4.physical_lock_lock_to_unlock_bullet_3, false, 2, null)});
        int i6 = C45871nl4.general_got_it;
        int i7 = C45871nl4.i_need_more_help;
        f84509o = new EnumC41838gx2("UNLOCK_RIDER", 1, "lottie/smartlock/smartlock_unlock.json", null, null, null, listOf2, i6, Integer.valueOf(i7), null, enumC41838gx2.f84529j, null, enumC41838gx2.f84531l, enumC41838gx2.f84532m, 646, null);
        Integer valueOf3 = Integer.valueOf(C48193rg4.ic_lock_instructions_locking);
        listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new C44882m52[]{new C44882m52(C45871nl4.physical_lock_lock_to_lock_bullet_1, false, 2, null), new C44882m52(C45871nl4.physical_lock_lock_to_lock_bullet_2, false, 2, null), new C44882m52(C45871nl4.physical_lock_lock_to_lock_bullet_3, true)});
        EnumC41838gx2 enumC41838gx22 = new EnumC41838gx2("LOCK_RIDER", 2, null, null, valueOf3, null, listOf3, C45871nl4.vehicle_is_locked, Integer.valueOf(C45871nl4.repeat_instructions_uppercase), null, C45871nl4.smartlock_cancel_lock_dialog_title, Integer.valueOf(C45871nl4.smartlock_cancel_lock_dialog_message), C45871nl4.smartlock_cancel_lock_dialog_secured, i5, 131, null);
        f84510p = enumC41838gx22;
        Integer valueOf4 = Integer.valueOf(C45871nl4.smartlock_unlock_instructions_charger_lock_title);
        listOf4 = CollectionsKt__CollectionsJVMKt.listOf(new C44882m52(C45871nl4.smartlock_unlock_instructions_charger_lock_body, false, 2, null));
        int i8 = C45871nl4.smartlock_lock_activity_primary_button;
        f84511q = new EnumC41838gx2("LOCK_CHARGER", 3, "lottie/smartlock/smartlock_lock.json", null, null, valueOf4, listOf4, i8, Integer.valueOf(C45871nl4.smartlock_lock_activity_secondary_button), null, enumC41838gx22.f84529j, enumC41838gx22.f84530k, enumC41838gx22.f84531l, enumC41838gx22.f84532m, 134, null);
        int i9 = C45871nl4.smartlock_unlock_instructions_rider_unlock_title;
        Integer valueOf5 = Integer.valueOf(i9);
        listOf5 = CollectionsKt__CollectionsJVMKt.listOf(new C44882m52(i, false, 2, null));
        int i10 = C45871nl4.smartlock_unlock_activity_rider_primary_button;
        f84512r = new EnumC41838gx2("UNLOCK_CHARGER", 4, "lottie/smartlock/smartlock_unlock.json", null, null, valueOf5, listOf5, i10, Integer.valueOf(C45871nl4.smartlock_unlock_activity_charger_secondary_button), null, enumC41838gx2.f84529j, null, enumC41838gx2.f84531l, enumC41838gx2.f84532m, 646, null);
        Integer valueOf6 = Integer.valueOf(C45871nl4.smartlock_unlock_instructions_private_bird_rider_lock_title);
        listOf6 = CollectionsKt__CollectionsJVMKt.listOf(new C44882m52(C45871nl4.smartlock_unlock_instructions_private_bird_rider_lock_body, false, 2, null));
        f84513s = new EnumC41838gx2("LOCK_PRIVATE_BIRD_RIDER", 5, "lottie/smartlock/smartlock_lock.json", null, null, valueOf6, listOf6, C45871nl4.smartlock_unlock_instructions_private_bird_rider_lock_primary_button, Integer.valueOf(C45871nl4.smartlock_unlock_instructions_private_bird_rider_lock_secondary_button), null, enumC41838gx22.f84529j, enumC41838gx22.f84530k, enumC41838gx22.f84531l, enumC41838gx22.f84532m, 134, null);
        Integer valueOf7 = Integer.valueOf(C45871nl4.smartlock_unlock_instructions_private_bird_rider_unlock_title);
        listOf7 = CollectionsKt__CollectionsJVMKt.listOf(new C44882m52(C45871nl4.smartlock_unlock_instructions_private_bird_rider_unlock_body, false, 2, null));
        f84514t = new EnumC41838gx2("UNLOCK_PRIVATE_BIRD_RIDER", 6, "lottie/smartlock/smartlock_unlock.json", null, null, valueOf7, listOf7, i6, null, null, enumC41838gx2.f84529j, null, enumC41838gx2.f84531l, enumC41838gx2.f84532m, 710, null);
        Integer valueOf8 = Integer.valueOf(i9);
        listOf8 = CollectionsKt__CollectionsJVMKt.listOf(new C44882m52(i, false, 2, null));
        f84515u = new EnumC41838gx2("UNLOCK_OPERATOR", 7, "lottie/smartlock/smartlock_unlock.json", null, null, valueOf8, listOf8, C45871nl4.smartlock_unlock_activity_operator_primary_button, Integer.valueOf(C45871nl4.smartlock_unlock_activity_operator_secondary_button), null, enumC41838gx2.f84529j, null, enumC41838gx2.f84531l, enumC41838gx2.f84532m, 646, null);
        Integer valueOf9 = Integer.valueOf(C48193rg4.ic_bike_cable_unlocking);
        Integer valueOf10 = Integer.valueOf(C45871nl4.eb100_cable_physical_lock_unlock_instructions_title);
        listOf9 = CollectionsKt__CollectionsJVMKt.listOf(new C44882m52(C45871nl4.eb100_cable_physical_lock_unlock_instructions_message, false, 2, null));
        int i11 = C45871nl4.general_continue;
        int i12 = C45871nl4.unlock_cable_titlecased;
        f84516v = new EnumC41838gx2("UNLOCK_CABLE_RIDER", 8, null, null, valueOf9, valueOf10, listOf9, i11, Integer.valueOf(i12), Integer.valueOf(i7), enumC41838gx2.f84529j, null, enumC41838gx2.f84531l, enumC41838gx2.f84532m, 515, null);
        int i13 = C33309Hg4.ic_bike_cable_locked;
        Integer valueOf11 = Integer.valueOf(i13);
        int i14 = C45871nl4.eb100_cable_physical_lock_lock_instructions_title;
        Integer valueOf12 = Integer.valueOf(i14);
        listOf10 = CollectionsKt__CollectionsJVMKt.listOf(new C44882m52(C45871nl4.eb100_cable_physical_lock_lock_instructions_message_no_fine, false, 2, null));
        int i15 = C45871nl4.eb100_cable_physical_lock_lock_accept;
        f84517w = new EnumC41838gx2("LOCK_CABLE_RIDER", 9, null, null, valueOf11, valueOf12, listOf10, i15, Integer.valueOf(i12), Integer.valueOf(i7), enumC41838gx2.f84529j, null, enumC41838gx2.f84531l, enumC41838gx2.f84532m, 515, null);
        Integer valueOf13 = Integer.valueOf(i13);
        Integer valueOf14 = Integer.valueOf(i14);
        listOf11 = CollectionsKt__CollectionsJVMKt.listOf(new C44882m52(C45871nl4.eb100_cable_physical_lock_lock_instructions_message_fine, false, 2, null));
        f84518x = new EnumC41838gx2("LOCK_CABLE_RIDER_FINE", 10, null, null, valueOf13, valueOf14, listOf11, i15, Integer.valueOf(i12), Integer.valueOf(i7), enumC41838gx2.f84529j, null, enumC41838gx2.f84531l, enumC41838gx2.f84532m, 515, null);
        Integer valueOf15 = Integer.valueOf(C45871nl4.smartlock_helmet_unlock_instructions_rider_unlock_title);
        listOf12 = CollectionsKt__CollectionsJVMKt.listOf(new C44882m52(C45871nl4.smartlock_unlock_helmet_instructions_default_body, false, 2, null));
        f84519y = new EnumC41838gx2("UNLOCK_HELMET_RIDER", 11, null, "https://static.bird.co/rt_lock_helmet_on.json", null, valueOf15, listOf12, i10, Integer.valueOf(C45871nl4.smartlock_helmet_unlock_activity_secondary_button), null, enumC41838gx2.f84529j, null, enumC41838gx2.f84531l, enumC41838gx2.f84532m, 645, null);
        Integer valueOf16 = Integer.valueOf(C45871nl4.smartlock_unlock_instructions_rider_lock_helmet_title);
        listOf13 = CollectionsKt__CollectionsJVMKt.listOf(new C44882m52(C45871nl4.smartlock_unlock_helmet_instructions_rider_lock_body, false, 2, null));
        f84520z = new EnumC41838gx2("LOCK_HELMET_RIDER", 12, null, "https://static.bird.co/rt_lock_helmet_off.json", null, valueOf16, listOf13, i8, null, null, C45871nl4.smartlock_cancel_lock_dialog_title_helmet, Integer.valueOf(C45871nl4.smartlock_cancel_lock_dialog_message_helmet), C45871nl4.smartlock_cancel_lock_dialog_secured_helmet, i5, 197, null);
        f84507A = m37295a();
    }

    public EnumC41838gx2(String str, int i, String str2, String str3, Integer num, Integer num2, List list, int i2, Integer num3, Integer num4, int i3, Integer num5, int i4, int i5) {
        this.f84521b = str2;
        this.f84522c = str3;
        this.f84523d = num;
        this.f84524e = num2;
        this.f84525f = list;
        this.f84526g = i2;
        this.f84527h = num3;
        this.f84528i = num4;
        this.f84529j = i3;
        this.f84530k = num5;
        this.f84531l = i4;
        this.f84532m = i5;
    }

    /* renamed from: a */
    public static final /* synthetic */ EnumC41838gx2[] m37295a() {
        return new EnumC41838gx2[]{f84508n, f84509o, f84510p, f84511q, f84512r, f84513s, f84514t, f84515u, f84516v, f84517w, f84518x, f84519y, f84520z};
    }

    public static EnumC41838gx2 valueOf(String str) {
        return (EnumC41838gx2) Enum.valueOf(EnumC41838gx2.class, str);
    }

    public static EnumC41838gx2[] values() {
        return (EnumC41838gx2[]) f84507A.clone();
    }

    /* renamed from: b */
    public final int m37294b() {
        return this.f84531l;
    }

    /* renamed from: c */
    public final Integer m37293c() {
        return this.f84530k;
    }

    /* renamed from: d */
    public final int m37292d() {
        return this.f84529j;
    }

    /* renamed from: e */
    public final Integer m37291e() {
        return this.f84523d;
    }

    /* renamed from: f */
    public final List<C44882m52> m37290f() {
        return this.f84525f;
    }

    /* renamed from: g */
    public final Integer m37289g() {
        return this.f84524e;
    }

    /* renamed from: h */
    public final String m37288h() {
        return this.f84521b;
    }

    /* renamed from: i */
    public final String m37287i() {
        return this.f84522c;
    }

    /* renamed from: j */
    public final int m37286j() {
        return this.f84526g;
    }

    /* renamed from: k */
    public final Integer m37285k() {
        return this.f84527h;
    }

    /* renamed from: l */
    public final Integer m37284l() {
        return this.f84528i;
    }

    public /* synthetic */ EnumC41838gx2(String str, int i, String str2, String str3, Integer num, Integer num2, List list, int i2, Integer num3, Integer num4, int i3, Integer num5, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i6 & 1) != 0 ? null : str2, (i6 & 2) != 0 ? null : str3, (i6 & 4) != 0 ? null : num, (i6 & 8) != 0 ? null : num2, list, i2, (i6 & 64) != 0 ? null : num3, (i6 & 128) != 0 ? null : num4, i3, (i6 & 512) != 0 ? null : num5, i4, i5);
    }
}
