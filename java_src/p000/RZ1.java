package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\"\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018¨\u0006%"}, m28432d2 = {"LRZ1;", "LRM4;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "isGuest", "presentArParkingOption", "i", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "h", "Z", "()Z", "j", "I", DateTokenConverter.CONVERTER_KEY, "()I", "iconRes", "k", "g", "smallIconRes", "l", "c", "color", "m", "e", "shortTitle", "<init>", "(ZZ)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: RZ1 */
/* loaded from: classes2.dex */
public final class RZ1 extends RM4 {

    /* renamed from: h */
    public final boolean f32213h;

    /* renamed from: i */
    public final boolean f32214i;

    /* renamed from: j */
    public final int f32215j;

    /* renamed from: k */
    public final int f32216k;

    /* renamed from: l */
    public final int f32217l;

    /* renamed from: m */
    public final int f32218m;

    public /* synthetic */ RZ1(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? false : z2);
    }

    public static /* synthetic */ RZ1 copy$default(RZ1 rz1, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = rz1.f32213h;
        }
        if ((i & 2) != 0) {
            z2 = rz1.f32214i;
        }
        return rz1.m86613i(z, z2);
    }

    @Override // p000.QM4
    /* renamed from: c */
    public int mo27708c() {
        return this.f32217l;
    }

    @Override // p000.QM4
    /* renamed from: d */
    public int mo27707d() {
        return this.f32215j;
    }

    @Override // p000.QM4
    /* renamed from: e */
    public int mo27706e() {
        return this.f32218m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RZ1) {
            RZ1 rz1 = (RZ1) obj;
            return this.f32213h == rz1.f32213h && this.f32214i == rz1.f32214i;
        }
        return false;
    }

    @Override // p000.QM4
    /* renamed from: g */
    public int mo27705g() {
        return this.f32216k;
    }

    @Override // p000.RM4
    /* renamed from: h */
    public boolean mo27704h() {
        return this.f32214i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f32213h;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.f32214i;
        return i + (z2 ? 1 : z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final RZ1 m86613i(boolean z, boolean z2) {
        return new RZ1(z, z2);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        CharSequence m91145b;
        Intrinsics.checkNotNullParameter(context, "context");
        m91145b = C6212Oy.m91145b(context, this.f32213h, C45871nl4.area_state_dialog_guest_no_park_not_in_nest_body, C45871nl4.area_state_dialog_no_park_not_in_nest_body, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : null);
        return m91145b;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        CharSequence m91145b;
        Intrinsics.checkNotNullParameter(context, "context");
        m91145b = C6212Oy.m91145b(context, this.f32213h, C45871nl4.area_state_dialog_guest_no_park_not_in_nest_title, C45871nl4.area_state_dialog_no_park_not_in_nest_title, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : null);
        return m91145b;
    }

    public String toString() {
        boolean z = this.f32213h;
        boolean z2 = this.f32214i;
        return "InMandatoryNestNoRideOrNoParkAreaDialog(isGuest=" + z + ", presentArParkingOption=" + z2 + ")";
    }

    public RZ1(boolean z, boolean z2) {
        super(z2, null);
        this.f32213h = z;
        this.f32214i = z2;
        this.f32215j = C48193rg4.ic_ride_warning_nest_parking_required_icon;
        this.f32216k = C48193rg4.ic_no_parking;
        this.f32217l = C32364Df4.birdRed;
        this.f32218m = C45871nl4.rider_pill_no_ride_no_park_zone;
    }
}
