package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireServiceCenterStatus;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001d¨\u0006%"}, m28432d2 = {"LX60;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "", "totalBirds", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "statusUpdate", "b", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "I", "getTotalBirds", "()I", "e", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "getStatusUpdate", "()Lco/bird/android/model/wire/WireServiceCenterStatus;", "f", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "g", "Ljava/lang/Integer;", "getNegativeText", "negativeText", "<init>", "(ILco/bird/android/model/wire/WireServiceCenterStatus;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: X60 */
/* loaded from: classes2.dex */
public final class X60 extends AbstractC5751Ny {

    /* renamed from: d */
    public final int f42640d;

    /* renamed from: e */
    public final WireServiceCenterStatus f42641e;

    /* renamed from: f */
    public final int f42642f;

    /* renamed from: g */
    public final Integer f42643g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X60(int i, WireServiceCenterStatus statusUpdate) {
        super(null);
        Intrinsics.checkNotNullParameter(statusUpdate, "statusUpdate");
        this.f42640d = i;
        this.f42641e = statusUpdate;
        this.f42642f = C45871nl4.operator_bulk_scanner_update_button;
        this.f42643g = 17039360;
    }

    public static /* synthetic */ X60 copy$default(X60 x60, int i, WireServiceCenterStatus wireServiceCenterStatus, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = x60.f42640d;
        }
        if ((i2 & 2) != 0) {
            wireServiceCenterStatus = x60.f42641e;
        }
        return x60.m77405b(i, wireServiceCenterStatus);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return Integer.valueOf(this.f42642f);
    }

    /* renamed from: b */
    public final X60 m77405b(int i, WireServiceCenterStatus statusUpdate) {
        Intrinsics.checkNotNullParameter(statusUpdate, "statusUpdate");
        return new X60(i, statusUpdate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof X60) {
            X60 x60 = (X60) obj;
            return this.f42640d == x60.f42640d && Intrinsics.areEqual(this.f42641e, x60.f42641e);
        }
        return false;
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f42643g;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f42640d) * 31) + this.f42641e.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.service_center_bulk_status_update_confirm_formatted, Integer.valueOf(this.f42640d), this.f42641e.getDisplayName());
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(\n     …sUpdate.displayName\n    )");
        return string;
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.operator_bulk_update_confirm_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ulk_update_confirm_title)");
        return string;
    }

    public String toString() {
        int i = this.f42640d;
        WireServiceCenterStatus wireServiceCenterStatus = this.f42641e;
        return "BulkUpdateServiceCenterStatusConfigDialog(totalBirds=" + i + ", statusUpdate=" + wireServiceCenterStatus + ")";
    }
}
