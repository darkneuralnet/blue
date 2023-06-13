package co.bird.android.core.base.viewmodel;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\"\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018¨\u0006%"}, m28432d2 = {"Lco/bird/android/core/base/viewmodel/a;", "LRM4;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "isGuest", "presentArParkingOption", "i", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "h", "Z", "()Z", "j", "I", DateTokenConverter.CONVERTER_KEY, "()I", "iconRes", "k", "g", "smallIconRes", "l", "c", "color", "m", "e", "shortTitle", "<init>", "(ZZ)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.core.base.viewmodel.a */
/* loaded from: classes2.dex */
public final class C14451a extends RM4 {

    /* renamed from: h */
    public final boolean f63068h;

    /* renamed from: i */
    public final boolean f63069i;

    /* renamed from: j */
    public final int f63070j;

    /* renamed from: k */
    public final int f63071k;

    /* renamed from: l */
    public final int f63072l;

    /* renamed from: m */
    public final int f63073m;

    public C14451a() {
        this(false, false, 3, null);
    }

    public static /* synthetic */ C14451a copy$default(C14451a c14451a, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c14451a.f63068h;
        }
        if ((i & 2) != 0) {
            z2 = c14451a.f63069i;
        }
        return c14451a.m59000i(z, z2);
    }

    @Override // p000.QM4
    /* renamed from: c */
    public int mo27708c() {
        return this.f63072l;
    }

    @Override // p000.QM4
    /* renamed from: d */
    public int mo27707d() {
        return this.f63070j;
    }

    @Override // p000.QM4
    /* renamed from: e */
    public int mo27706e() {
        return this.f63073m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14451a) {
            C14451a c14451a = (C14451a) obj;
            return this.f63068h == c14451a.f63068h && this.f63069i == c14451a.f63069i;
        }
        return false;
    }

    @Override // p000.QM4
    /* renamed from: g */
    public int mo27705g() {
        return this.f63071k;
    }

    @Override // p000.RM4
    /* renamed from: h */
    public boolean mo27704h() {
        return this.f63069i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.f63068h;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.f63069i;
        return i + (z2 ? 1 : z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final C14451a m59000i(boolean z, boolean z2) {
        return new C14451a(z, z2);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        CharSequence m91145b;
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = this.f63068h;
        int i = C45871nl4.scan_qr_code_arcore_parking_description;
        m91145b = C6212Oy.m91145b(context, z, i, i, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : null);
        return m91145b;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        CharSequence m91145b;
        Intrinsics.checkNotNullParameter(context, "context");
        m91145b = C6212Oy.m91145b(context, this.f63068h, C45871nl4.area_state_dialog_guest_no_park_not_in_nest_title, C45871nl4.area_state_dialog_no_park_not_in_nest_title, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0 ? null : null, (r16 & 32) != 0 ? null : null);
        return m91145b;
    }

    public String toString() {
        boolean z = this.f63068h;
        boolean z2 = this.f63069i;
        return "InParkableAreaDialog(isGuest=" + z + ", presentArParkingOption=" + z2 + ")";
    }

    public /* synthetic */ C14451a(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public C14451a(boolean z, boolean z2) {
        super(z2, null);
        this.f63068h = z;
        this.f63069i = z2;
        this.f63070j = C48193rg4.ic_ride_warning_nest_parking_required_icon;
        this.f63071k = C48193rg4.ic_check_circle;
        this.f63072l = C32364Df4.brandAccent;
        this.f63073m = C45871nl4.you_may_park_here;
    }
}