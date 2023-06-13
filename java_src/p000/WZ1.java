package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\b\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0016\u0010\u001cR\u001a\u0010\"\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001cR\u001a\u0010%\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001cR\u001c\u0010*\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, m28432d2 = {"LWZ1;", "LQM4;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "isGuest", "shouldEndRide", "h", "(ZLjava/lang/Boolean;)LWZ1;", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "f", "Z", "()Z", "g", "Ljava/lang/Boolean;", "getShouldEndRide", "()Ljava/lang/Boolean;", "I", DateTokenConverter.CONVERTER_KEY, "()I", "iconRes", "i", "smallIconRes", "j", "c", "color", "k", "e", "shortTitle", "l", "Ljava/lang/Integer;", "getNegativeText", "()Ljava/lang/Integer;", "negativeText", "<init>", "(ZLjava/lang/Boolean;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: WZ1 */
/* loaded from: classes2.dex */
public final class WZ1 extends QM4 {

    /* renamed from: f */
    public final boolean f41299f;

    /* renamed from: g */
    public final Boolean f41300g;

    /* renamed from: h */
    public final int f41301h;

    /* renamed from: i */
    public final int f41302i;

    /* renamed from: j */
    public final int f41303j;

    /* renamed from: k */
    public final int f41304k;

    /* renamed from: l */
    public final Integer f41305l;

    public /* synthetic */ WZ1(boolean z, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : bool);
    }

    public static /* synthetic */ WZ1 copy$default(WZ1 wz1, boolean z, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wz1.f41299f;
        }
        if ((i & 2) != 0) {
            bool = wz1.f41300g;
        }
        return wz1.m78177h(z, bool);
    }

    @Override // p000.QM4
    /* renamed from: c */
    public int mo27708c() {
        return this.f41303j;
    }

    @Override // p000.QM4
    /* renamed from: d */
    public int mo27707d() {
        return this.f41301h;
    }

    @Override // p000.QM4
    /* renamed from: e */
    public int mo27706e() {
        return this.f41304k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WZ1) {
            WZ1 wz1 = (WZ1) obj;
            return this.f41299f == wz1.f41299f && Intrinsics.areEqual(this.f41300g, wz1.f41300g);
        }
        return false;
    }

    @Override // p000.QM4
    /* renamed from: g */
    public int mo27705g() {
        return this.f41302i;
    }

    @Override // p000.QM4, p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f41305l;
    }

    /* renamed from: h */
    public final WZ1 m78177h(boolean z, Boolean bool) {
        return new WZ1(z, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f41299f;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Boolean bool = this.f41300g;
        return i + (bool == null ? 0 : bool.hashCode());
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        CharSequence m91145b;
        Intrinsics.checkNotNullParameter(context, "context");
        m91145b = C6212Oy.m91145b(context, this.f41299f, C45871nl4.area_state_dialog_guest_no_park_preferred_body, C45871nl4.area_state_dialog_no_park_preferred_body, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : null);
        return m91145b;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        CharSequence m91145b;
        Intrinsics.checkNotNullParameter(context, "context");
        m91145b = C6212Oy.m91145b(context, this.f41299f, C45871nl4.area_state_dialog_guest_no_park_title, C45871nl4.area_state_dialog_no_park_title, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : null);
        return m91145b;
    }

    public String toString() {
        boolean z = this.f41299f;
        Boolean bool = this.f41300g;
        return "InPreferredNoParkingAreaDialog(isGuest=" + z + ", shouldEndRide=" + bool + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WZ1(boolean z, Boolean bool) {
        super(null);
        Integer num = null;
        this.f41299f = z;
        this.f41300g = bool;
        this.f41301h = C48193rg4.ic_ride_warning_no_parking_area_icon;
        this.f41302i = C48193rg4.ic_no_parking;
        this.f41303j = C32364Df4.birdRed;
        this.f41304k = C45871nl4.rider_pill_no_park_zone;
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            num = Integer.valueOf(C45871nl4.area_state_dialog_secondary_button_end_ride_anyways);
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            num = Integer.valueOf(C45871nl4.area_state_dialog_secondary_button_lock_ride_anyways);
        }
        this.f41305l = num;
    }
}
