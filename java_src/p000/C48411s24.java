package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireRidePrice;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"Ls24;", "LNy;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "title", "message", "Lco/bird/android/model/wire/WireRidePrice;", "ridePrice", "b", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireRidePrice;", "getRidePrice", "()Lco/bird/android/model/wire/WireRidePrice;", "e", "Ljava/lang/Integer;", "getNegativeText", "()Ljava/lang/Integer;", "negativeText", "<init>", "(Lco/bird/android/model/wire/WireRidePrice;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: s24  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48411s24 extends AbstractC5751Ny {

    /* renamed from: d */
    public final WireRidePrice f108167d;

    /* renamed from: e */
    public final Integer f108168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48411s24(WireRidePrice ridePrice) {
        super(null);
        Intrinsics.checkNotNullParameter(ridePrice, "ridePrice");
        this.f108167d = ridePrice;
    }

    public static /* synthetic */ C48411s24 copy$default(C48411s24 c48411s24, WireRidePrice wireRidePrice, int i, Object obj) {
        if ((i & 1) != 0) {
            wireRidePrice = c48411s24.f108167d;
        }
        return c48411s24.m14846b(wireRidePrice);
    }

    /* renamed from: b */
    public final C48411s24 m14846b(WireRidePrice ridePrice) {
        Intrinsics.checkNotNullParameter(ridePrice, "ridePrice");
        return new C48411s24(ridePrice);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C48411s24) && Intrinsics.areEqual(this.f108167d, ((C48411s24) obj).f108167d);
    }

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f108168e;
    }

    public int hashCode() {
        return this.f108167d.hashCode();
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C47819r24.f106320a.m16579a(context, this.f108167d);
    }

    @Override // p000.AbstractC5751Ny
    public CharSequence title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.ride_price_changed_dialog_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…ice_changed_dialog_title)");
        return string;
    }

    public String toString() {
        WireRidePrice wireRidePrice = this.f108167d;
        return "PriceChangedDialog(ridePrice=" + wireRidePrice + ")";
    }
}
