package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.InterfaceC16662d;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum i uses external variables
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
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B=\b\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0007R\u001a\u0010\u0016\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0004\u0010\u0015j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006\u001f"}, m28432d2 = {"Lt13;", "", "Lco/bird/android/widget/d;", "", "b", "I", C17296a.f69688o, "()Ljava/lang/Integer;", Entry.TYPE_TEXT, "c", "getColor", "color", DateTokenConverter.CONVERTER_KEY, "getIcon", "icon", "e", "Ljava/lang/Integer;", "iconTintColor", "", "f", "Z", "()Z", "center", "<init>", "(Ljava/lang/String;IIIILjava/lang/Integer;Z)V", "g", "h", "i", "j", "k", "l", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: t13  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC48993t13 implements InterfaceC16662d {

    /* renamed from: g */
    public static final EnumC48993t13 f109699g = new EnumC48993t13("COPY_CODE", 0, C45871nl4.nearby_birds_copy_code_action, 0, C52342yg4.ic_code_scooter_dark, null, false, 26, null);

    /* renamed from: h */
    public static final EnumC48993t13 f109700h = new EnumC48993t13("COPY_SN", 1, C45871nl4.nearby_birds_copy_sn_action, 0, C48193rg4.ic_barcode_scooter_dark, null, false, 26, null);

    /* renamed from: i */
    public static final EnumC48993t13 f109701i;

    /* renamed from: j */
    public static final EnumC48993t13 f109702j;

    /* renamed from: k */
    public static final EnumC48993t13 f109703k;

    /* renamed from: l */
    public static final EnumC48993t13 f109704l;

    /* renamed from: m */
    public static final /* synthetic */ EnumC48993t13[] f109705m;

    /* renamed from: b */
    public final int f109706b;

    /* renamed from: c */
    public final int f109707c;

    /* renamed from: d */
    public final int f109708d;

    /* renamed from: e */
    public final Integer f109709e;

    /* renamed from: f */
    public final boolean f109710f;

    static {
        int i = C45871nl4.nearby_birds_alarm_action;
        int i2 = C48193rg4.ic_alarm;
        int i3 = C32364Df4.primaryText;
        f109701i = new EnumC48993t13("CHIRP", 2, i, 0, i2, Integer.valueOf(i3), false, 18, null);
        f109702j = new EnumC48993t13("REPORT_FRAUD", 3, C45871nl4.nearby_birds_report_fraud_action, 0, C48193rg4.ic_report_fraud, Integer.valueOf(i3), false, 18, null);
        f109703k = new EnumC48993t13("ADD_VEHICLE", 4, C45871nl4.nearby_birds_select_vehicle, 0, C48193rg4.ic_add_circle, Integer.valueOf(i3), false, 18, null);
        f109704l = new EnumC48993t13("VIEW_FLIGHT_SHEET", 5, C45871nl4.nearby_birds_view_flight_sheet, 0, C48193rg4.ic_options, Integer.valueOf(i3), false, 18, null);
        f109705m = m13231f();
    }

    public EnumC48993t13(String str, int i, int i2, int i3, int i4, Integer num, boolean z) {
        this.f109706b = i2;
        this.f109707c = i3;
        this.f109708d = i4;
        this.f109709e = num;
        this.f109710f = z;
    }

    /* renamed from: f */
    public static final /* synthetic */ EnumC48993t13[] m13231f() {
        return new EnumC48993t13[]{f109699g, f109700h, f109701i, f109702j, f109703k, f109704l};
    }

    public static EnumC48993t13 valueOf(String str) {
        return (EnumC48993t13) Enum.valueOf(EnumC48993t13.class, str);
    }

    public static EnumC48993t13[] values() {
        return (EnumC48993t13[]) f109705m.clone();
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: a */
    public Integer mo13236a() {
        return Integer.valueOf(this.f109706b);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: b */
    public boolean mo13235b() {
        return this.f109710f;
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: c */
    public Integer mo13234c() {
        return this.f109709e;
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: d */
    public String mo13233d() {
        return InterfaceC16662d.C16663a.m54047f(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: e */
    public String mo13232e() {
        return InterfaceC16662d.C16663a.m54043j(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: g */
    public String mo13230g() {
        return InterfaceC16662d.C16663a.m54045h(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    public Integer getColor() {
        return Integer.valueOf(this.f109707c);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    public Integer getIcon() {
        return Integer.valueOf(this.f109708d);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: h */
    public Integer mo13229h() {
        return InterfaceC16662d.C16663a.m54049d(this);
    }

    @Override // co.bird.android.widget.InterfaceC16662d
    /* renamed from: i */
    public Integer mo13228i() {
        return InterfaceC16662d.C16663a.m54046g(this);
    }

    public /* synthetic */ EnumC48993t13(String str, int i, int i2, int i3, int i4, Integer num, boolean z, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i5 & 2) != 0 ? C32364Df4.primaryText : i3, i4, (i5 & 8) != 0 ? null : num, (i5 & 16) != 0 ? false : z);
    }
}
