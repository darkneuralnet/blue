package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\b\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001f\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017¨\u0006\""}, m28432d2 = {"LUZ1;", "LQM4;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "isGuest", "h", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "f", "Z", "()Z", "g", "I", DateTokenConverter.CONVERTER_KEY, "()I", "iconRes", "smallIconRes", "i", "c", "color", "j", "e", "shortTitle", "<init>", "(Z)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: UZ1 */
/* loaded from: classes2.dex */
public final class UZ1 extends QM4 {

    /* renamed from: f */
    public final boolean f37547f;

    /* renamed from: g */
    public final int f37548g;

    /* renamed from: h */
    public final int f37549h;

    /* renamed from: i */
    public final int f37550i;

    /* renamed from: j */
    public final int f37551j;

    public UZ1(boolean z) {
        super(null);
        this.f37547f = z;
        this.f37548g = C48193rg4.ic_ride_warning_no_ride_icon;
        this.f37549h = C48193rg4.ic_report_fraud;
        this.f37550i = C32364Df4.birdRed;
        this.f37551j = C45871nl4.rider_pill_no_ride_zone;
    }

    public static /* synthetic */ UZ1 copy$default(UZ1 uz1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = uz1.f37547f;
        }
        return uz1.m81344h(z);
    }

    @Override // p000.QM4
    /* renamed from: c */
    public int mo27708c() {
        return this.f37550i;
    }

    @Override // p000.QM4
    /* renamed from: d */
    public int mo27707d() {
        return this.f37548g;
    }

    @Override // p000.QM4
    /* renamed from: e */
    public int mo27706e() {
        return this.f37551j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UZ1) && this.f37547f == ((UZ1) obj).f37547f;
    }

    @Override // p000.QM4
    /* renamed from: g */
    public int mo27705g() {
        return this.f37549h;
    }

    /* renamed from: h */
    public final UZ1 m81344h(boolean z) {
        return new UZ1(z);
    }

    public int hashCode() {
        boolean z = this.f37547f;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        CharSequence m91145b;
        Intrinsics.checkNotNullParameter(context, "context");
        m91145b = C6212Oy.m91145b(context, this.f37547f, C45871nl4.area_state_dialog_guest_no_ride_body, C45871nl4.area_state_dialog_no_ride_body, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : null);
        return m91145b;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        CharSequence m91145b;
        Intrinsics.checkNotNullParameter(context, "context");
        m91145b = C6212Oy.m91145b(context, this.f37547f, C45871nl4.area_state_dialog_guest_no_ride_title, C45871nl4.area_state_dialog_no_ride_title, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : null);
        return m91145b;
    }

    public String toString() {
        boolean z = this.f37547f;
        return "InNoRideAreaDialog(isGuest=" + z + ")";
    }
}
