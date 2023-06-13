package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireRideDetail;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m28432d2 = {"LH35;", "", "Lco/bird/android/model/wire/WireRideDetail;", "rideDetail", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/wire/WireRideDetail;", DateTokenConverter.CONVERTER_KEY, "()Lco/bird/android/model/wire/WireRideDetail;", "", "b", "Ljava/lang/Throwable;", "c", "()Ljava/lang/Throwable;", "f", "(Ljava/lang/Throwable;)V", "error", "LNy;", "LNy;", "()LNy;", "e", "(LNy;)V", "alert", "<init>", "(Lco/bird/android/model/wire/WireRideDetail;)V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: H35 */
/* loaded from: classes3.dex */
public final class H35 {

    /* renamed from: a */
    public final WireRideDetail f12788a;

    /* renamed from: b */
    public Throwable f12789b;

    /* renamed from: c */
    public AbstractC5751Ny f12790c;

    public H35() {
        this(null, 1, null);
    }

    public static /* synthetic */ H35 copy$default(H35 h35, WireRideDetail wireRideDetail, int i, Object obj) {
        if ((i & 1) != 0) {
            wireRideDetail = h35.f12788a;
        }
        return h35.m104466a(wireRideDetail);
    }

    /* renamed from: a */
    public final H35 m104466a(WireRideDetail wireRideDetail) {
        return new H35(wireRideDetail);
    }

    /* renamed from: b */
    public final AbstractC5751Ny m104465b() {
        return this.f12790c;
    }

    /* renamed from: c */
    public final Throwable m104464c() {
        return this.f12789b;
    }

    /* renamed from: d */
    public final WireRideDetail m104463d() {
        return this.f12788a;
    }

    /* renamed from: e */
    public final void m104462e(AbstractC5751Ny abstractC5751Ny) {
        this.f12790c = abstractC5751Ny;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof H35) && Intrinsics.areEqual(this.f12788a, ((H35) obj).f12788a);
    }

    /* renamed from: f */
    public final void m104461f(Throwable th) {
        this.f12789b = th;
    }

    public int hashCode() {
        WireRideDetail wireRideDetail = this.f12788a;
        if (wireRideDetail == null) {
            return 0;
        }
        return wireRideDetail.hashCode();
    }

    public String toString() {
        WireRideDetail wireRideDetail = this.f12788a;
        return "RideReportState(rideDetail=" + wireRideDetail + ")";
    }

    public H35(WireRideDetail wireRideDetail) {
        this.f12788a = wireRideDetail;
    }

    public /* synthetic */ H35(WireRideDetail wireRideDetail, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : wireRideDetail);
    }
}
