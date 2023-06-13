package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J)\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\tHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\b\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001a\u0010\u001e\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u001a\u0010$\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001a\u0010'\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001d¨\u0006*"}, m28432d2 = {"LlA3;", "LRM4;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "isGuest", "", "fineString", "presentArParkingOption", "i", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "h", "Z", "()Z", "Ljava/lang/String;", "getFineString", "()Ljava/lang/String;", "j", "k", "I", DateTokenConverter.CONVERTER_KEY, "()I", "iconRes", "l", "g", "smallIconRes", "m", "c", "color", "n", "e", "shortTitle", "<init>", "(ZLjava/lang/String;Z)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lA3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44340lA3 extends RM4 {

    /* renamed from: h */
    public final boolean f95664h;

    /* renamed from: i */
    public final String f95665i;

    /* renamed from: j */
    public final boolean f95666j;

    /* renamed from: k */
    public final int f95667k;

    /* renamed from: l */
    public final int f95668l;

    /* renamed from: m */
    public final int f95669m;

    /* renamed from: n */
    public final int f95670n;

    public /* synthetic */ C44340lA3(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2);
    }

    public static /* synthetic */ C44340lA3 copy$default(C44340lA3 c44340lA3, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c44340lA3.f95664h;
        }
        if ((i & 2) != 0) {
            str = c44340lA3.f95665i;
        }
        if ((i & 4) != 0) {
            z2 = c44340lA3.f95666j;
        }
        return c44340lA3.m27703i(z, str, z2);
    }

    @Override // p000.QM4
    /* renamed from: c */
    public int mo27708c() {
        return this.f95669m;
    }

    @Override // p000.QM4
    /* renamed from: d */
    public int mo27707d() {
        return this.f95667k;
    }

    @Override // p000.QM4
    /* renamed from: e */
    public int mo27706e() {
        return this.f95670n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C44340lA3) {
            C44340lA3 c44340lA3 = (C44340lA3) obj;
            return this.f95664h == c44340lA3.f95664h && Intrinsics.areEqual(this.f95665i, c44340lA3.f95665i) && this.f95666j == c44340lA3.f95666j;
        }
        return false;
    }

    @Override // p000.QM4
    /* renamed from: g */
    public int mo27705g() {
        return this.f95668l;
    }

    @Override // p000.RM4
    /* renamed from: h */
    public boolean mo27704h() {
        return this.f95666j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.f95664h;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.f95665i;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        boolean z2 = this.f95666j;
        return hashCode + (z2 ? 1 : z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final C44340lA3 m27703i(boolean z, String str, boolean z2) {
        return new C44340lA3(z, str, z2);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        CharSequence m91145b;
        Intrinsics.checkNotNullParameter(context, "context");
        m91145b = C6212Oy.m91145b(context, this.f95664h, C45871nl4.area_state_dialog_guest_outside_service_body, C45871nl4.area_state_dialog_outside_service_body, this.f95665i, Integer.valueOf(C45871nl4.area_state_dialog_guest_outside_service_with_fine_body), Integer.valueOf(C45871nl4.area_state_dialog_outside_service_with_fine_body));
        return m91145b;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        CharSequence m91145b;
        Intrinsics.checkNotNullParameter(context, "context");
        m91145b = C6212Oy.m91145b(context, this.f95664h, C45871nl4.area_state_dialog_guest_outside_service_title, C45871nl4.area_state_dialog_outside_service_title, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : null);
        return m91145b;
    }

    public String toString() {
        boolean z = this.f95664h;
        String str = this.f95665i;
        boolean z2 = this.f95666j;
        return "OutsideServiceAreaDialog(isGuest=" + z + ", fineString=" + str + ", presentArParkingOption=" + z2 + ")";
    }

    public C44340lA3(boolean z, String str, boolean z2) {
        super(z2, null);
        this.f95664h = z;
        this.f95665i = str;
        this.f95666j = z2;
        this.f95667k = C48193rg4.ic_ride_warning_no_ride_icon;
        this.f95668l = C48193rg4.ic_no_parking;
        this.f95669m = C32364Df4.birdRed;
        this.f95670n = C45871nl4.rider_pill_no_ride_no_park_zone;
    }
}