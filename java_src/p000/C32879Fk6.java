package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.Vehicle;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LFk6;", "Lg70;", "Lco/bird/android/model/Vehicle;", "vehicle", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/Vehicle;", "b", "()Lco/bird/android/model/Vehicle;", "<init>", "(Lco/bird/android/model/Vehicle;)V", "eventbus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Fk6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C32879Fk6 extends AbstractC41342g70 {

    /* renamed from: a */
    public final Vehicle f10060a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32879Fk6(Vehicle vehicle) {
        super(null);
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        this.f10060a = vehicle;
    }

    public static /* synthetic */ C32879Fk6 copy$default(C32879Fk6 c32879Fk6, Vehicle vehicle, int i, Object obj) {
        if ((i & 1) != 0) {
            vehicle = c32879Fk6.f10060a;
        }
        return c32879Fk6.m106626a(vehicle);
    }

    /* renamed from: a */
    public final C32879Fk6 m106626a(Vehicle vehicle) {
        Intrinsics.checkNotNullParameter(vehicle, "vehicle");
        return new C32879Fk6(vehicle);
    }

    /* renamed from: b */
    public final Vehicle m106625b() {
        return this.f10060a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C32879Fk6) && Intrinsics.areEqual(this.f10060a, ((C32879Fk6) obj).f10060a);
    }

    public int hashCode() {
        return this.f10060a.hashCode();
    }

    public String toString() {
        Vehicle vehicle = this.f10060a;
        return "VehicleChangedEvent(vehicle=" + vehicle + ")";
    }
}
