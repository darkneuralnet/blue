package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\b\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001f\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017R\u0014\u0010\"\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006%"}, m28432d2 = {"LTZ1;", "LQM4;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "isGuest", "h", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "f", "Z", "()Z", "g", "I", DateTokenConverter.CONVERTER_KEY, "()I", "iconRes", "smallIconRes", "i", "c", "color", "j", "e", "shortTitle", "getNegativeText", "()Ljava/lang/Integer;", "negativeText", "<init>", "(Z)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: TZ1 */
/* loaded from: classes2.dex */
public final class TZ1 extends QM4 {

    /* renamed from: f */
    public final boolean f35684f;

    /* renamed from: g */
    public final int f35685g;

    /* renamed from: h */
    public final int f35686h;

    /* renamed from: i */
    public final int f35687i;

    /* renamed from: j */
    public final int f35688j;

    public TZ1(boolean z) {
        super(null);
        this.f35684f = z;
        this.f35685g = C48193rg4.ic_parking_nest_unavailable;
        this.f35686h = C48193rg4.ic_no_parking;
        this.f35687i = C32364Df4.birdRed;
        this.f35688j = C45871nl4.parking_unavailable_short_description;
    }

    public static /* synthetic */ TZ1 copy$default(TZ1 tz1, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = tz1.f35684f;
        }
        return tz1.m83393h(z);
    }

    @Override // p000.QM4
    /* renamed from: c */
    public int mo27708c() {
        return this.f35687i;
    }

    @Override // p000.QM4
    /* renamed from: d */
    public int mo27707d() {
        return this.f35685g;
    }

    @Override // p000.QM4
    /* renamed from: e */
    public int mo27706e() {
        return this.f35688j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TZ1) && this.f35684f == ((TZ1) obj).f35684f;
    }

    @Override // p000.QM4
    /* renamed from: g */
    public int mo27705g() {
        return this.f35686h;
    }

    @Override // p000.QM4, p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return Integer.valueOf(C45871nl4.show_nearest_parking_uppercase);
    }

    /* renamed from: h */
    public final TZ1 m83393h(boolean z) {
        return new TZ1(z);
    }

    public int hashCode() {
        boolean z = this.f35684f;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.parking_unavailable_body);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…parking_unavailable_body)");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.parking_unavailable);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.string.parking_unavailable)");
        return string;
    }

    public String toString() {
        boolean z = this.f35684f;
        return "InNestWithNoCapacityAreaDialog(isGuest=" + z + ")";
    }
}
