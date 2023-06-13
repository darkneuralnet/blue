package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\f\u001a\u00020\tHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0015\u0010\u001bR\u001a\u0010!\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001bR\u001a\u0010$\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001b¨\u0006'"}, m28432d2 = {"LZZ1;", "LQM4;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "isGuest", "", "fineString", "h", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "f", "Z", "()Z", "g", "Ljava/lang/String;", "getFineString", "()Ljava/lang/String;", "I", DateTokenConverter.CONVERTER_KEY, "()I", "iconRes", "i", "smallIconRes", "j", "c", "color", "k", "e", "shortTitle", "<init>", "(ZLjava/lang/String;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ZZ1 */
/* loaded from: classes2.dex */
public final class ZZ1 extends QM4 {

    /* renamed from: f */
    public final boolean f48777f;

    /* renamed from: g */
    public final String f48778g;

    /* renamed from: h */
    public final int f48779h;

    /* renamed from: i */
    public final int f48780i;

    /* renamed from: j */
    public final int f48781j;

    /* renamed from: k */
    public final int f48782k;

    public ZZ1(boolean z, String str) {
        super(null);
        this.f48777f = z;
        this.f48778g = str;
        this.f48779h = C48193rg4.ic_ride_warning_no_parking_area_icon;
        this.f48780i = C48193rg4.ic_no_parking;
        this.f48781j = C32364Df4.birdRed;
        this.f48782k = C45871nl4.rider_pill_slow_no_park_zone;
    }

    public static /* synthetic */ ZZ1 copy$default(ZZ1 zz1, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = zz1.f48777f;
        }
        if ((i & 2) != 0) {
            str = zz1.f48778g;
        }
        return zz1.m72922h(z, str);
    }

    @Override // p000.QM4
    /* renamed from: c */
    public int mo27708c() {
        return this.f48781j;
    }

    @Override // p000.QM4
    /* renamed from: d */
    public int mo27707d() {
        return this.f48779h;
    }

    @Override // p000.QM4
    /* renamed from: e */
    public int mo27706e() {
        return this.f48782k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZZ1) {
            ZZ1 zz1 = (ZZ1) obj;
            return this.f48777f == zz1.f48777f && Intrinsics.areEqual(this.f48778g, zz1.f48778g);
        }
        return false;
    }

    @Override // p000.QM4
    /* renamed from: g */
    public int mo27705g() {
        return this.f48780i;
    }

    /* renamed from: h */
    public final ZZ1 m72922h(boolean z, String str) {
        return new ZZ1(z, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f48777f;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.f48778g;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        CharSequence m91145b;
        Intrinsics.checkNotNullParameter(context, "context");
        m91145b = C6212Oy.m91145b(context, this.f48777f, C45871nl4.area_state_dialog_guest_slow_no_park_body, C45871nl4.area_state_dialog_slow_no_park_body, this.f48778g, Integer.valueOf(C45871nl4.area_state_dialog_guest_slow_no_park_with_fine_body), Integer.valueOf(C45871nl4.area_state_dialog_slow_no_park_with_fine_body));
        return m91145b;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        CharSequence m91145b;
        Intrinsics.checkNotNullParameter(context, "context");
        m91145b = C6212Oy.m91145b(context, this.f48777f, C45871nl4.area_state_dialog_guest_slow_no_park_title, C45871nl4.area_state_dialog_slow_no_park_title, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : null);
        return m91145b;
    }

    public String toString() {
        boolean z = this.f48777f;
        String str = this.f48778g;
        return "InSlowNoParkAreaDialog(isGuest=" + z + ", fineString=" + str + ")";
    }

    public /* synthetic */ ZZ1(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str);
    }
}
