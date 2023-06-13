package co.bird.android.model.destination;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/destination/Destination;", "", "latitude", "", "longitude", PaymentMethod.BillingDetails.PARAM_ADDRESS, "", "(DDLjava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getLatitude", "()D", "getLongitude", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Destination {
    private final String address;
    private final double latitude;
    private final double longitude;

    public Destination(double d, double d2, String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.latitude = d;
        this.longitude = d2;
        this.address = address;
    }

    public static /* synthetic */ Destination copy$default(Destination destination, double d, double d2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            d = destination.latitude;
        }
        double d3 = d;
        if ((i & 2) != 0) {
            d2 = destination.longitude;
        }
        double d4 = d2;
        if ((i & 4) != 0) {
            str = destination.address;
        }
        return destination.copy(d3, d4, str);
    }

    public final double component1() {
        return this.latitude;
    }

    public final double component2() {
        return this.longitude;
    }

    public final String component3() {
        return this.address;
    }

    public final Destination copy(double d, double d2, String address) {
        Intrinsics.checkNotNullParameter(address, "address");
        return new Destination(d, d2, address);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Destination) {
            Destination destination = (Destination) obj;
            return Double.compare(this.latitude, destination.latitude) == 0 && Double.compare(this.longitude, destination.longitude) == 0 && Intrinsics.areEqual(this.address, destination.address);
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return (((Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude)) * 31) + this.address.hashCode();
    }

    public String toString() {
        double d = this.latitude;
        double d2 = this.longitude;
        String str = this.address;
        return "Destination(latitude=" + d + ", longitude=" + d2 + ", address=" + str + ")";
    }
}
