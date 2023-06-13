package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0005HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, m28432d2 = {"Lco/bird/android/model/persistence/BirdMapMarker;", "", "id", "", "batteryLevel", "", "location", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "fleetMarker", "Lco/bird/android/model/persistence/FleetMarker;", "filterHash", "updatedAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;ILco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/lang/String;Lco/bird/android/model/persistence/FleetMarker;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getBatteryLevel", "()I", "getCode", "()Ljava/lang/String;", "getFilterHash", "getFleetMarker", "()Lco/bird/android/model/persistence/FleetMarker;", "getId", "getLocation", "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "getUpdatedAt", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdMapMarker {
    private final int batteryLevel;
    private final String code;
    private final String filterHash;
    private final FleetMarker fleetMarker;

    /* renamed from: id */
    private final String f66671id;
    private final Geolocation location;
    private final DateTime updatedAt;

    public BirdMapMarker(String id, int i, Geolocation location, String code, FleetMarker fleetMarker, String filterHash, DateTime updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(fleetMarker, "fleetMarker");
        Intrinsics.checkNotNullParameter(filterHash, "filterHash");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f66671id = id;
        this.batteryLevel = i;
        this.location = location;
        this.code = code;
        this.fleetMarker = fleetMarker;
        this.filterHash = filterHash;
        this.updatedAt = updatedAt;
    }

    public static /* synthetic */ BirdMapMarker copy$default(BirdMapMarker birdMapMarker, String str, int i, Geolocation geolocation, String str2, FleetMarker fleetMarker, String str3, DateTime dateTime, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = birdMapMarker.f66671id;
        }
        if ((i2 & 2) != 0) {
            i = birdMapMarker.batteryLevel;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            geolocation = birdMapMarker.location;
        }
        Geolocation geolocation2 = geolocation;
        if ((i2 & 8) != 0) {
            str2 = birdMapMarker.code;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            fleetMarker = birdMapMarker.fleetMarker;
        }
        FleetMarker fleetMarker2 = fleetMarker;
        if ((i2 & 32) != 0) {
            str3 = birdMapMarker.filterHash;
        }
        String str5 = str3;
        if ((i2 & 64) != 0) {
            dateTime = birdMapMarker.updatedAt;
        }
        return birdMapMarker.copy(str, i3, geolocation2, str4, fleetMarker2, str5, dateTime);
    }

    public final String component1() {
        return this.f66671id;
    }

    public final int component2() {
        return this.batteryLevel;
    }

    public final Geolocation component3() {
        return this.location;
    }

    public final String component4() {
        return this.code;
    }

    public final FleetMarker component5() {
        return this.fleetMarker;
    }

    public final String component6() {
        return this.filterHash;
    }

    public final DateTime component7() {
        return this.updatedAt;
    }

    public final BirdMapMarker copy(String id, int i, Geolocation location, String code, FleetMarker fleetMarker, String filterHash, DateTime updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(fleetMarker, "fleetMarker");
        Intrinsics.checkNotNullParameter(filterHash, "filterHash");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new BirdMapMarker(id, i, location, code, fleetMarker, filterHash, updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdMapMarker) {
            BirdMapMarker birdMapMarker = (BirdMapMarker) obj;
            return Intrinsics.areEqual(this.f66671id, birdMapMarker.f66671id) && this.batteryLevel == birdMapMarker.batteryLevel && Intrinsics.areEqual(this.location, birdMapMarker.location) && Intrinsics.areEqual(this.code, birdMapMarker.code) && Intrinsics.areEqual(this.fleetMarker, birdMapMarker.fleetMarker) && Intrinsics.areEqual(this.filterHash, birdMapMarker.filterHash) && Intrinsics.areEqual(this.updatedAt, birdMapMarker.updatedAt);
        }
        return false;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getFilterHash() {
        return this.filterHash;
    }

    public final FleetMarker getFleetMarker() {
        return this.fleetMarker;
    }

    public final String getId() {
        return this.f66671id;
    }

    public final Geolocation getLocation() {
        return this.location;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (((((((((((this.f66671id.hashCode() * 31) + Integer.hashCode(this.batteryLevel)) * 31) + this.location.hashCode()) * 31) + this.code.hashCode()) * 31) + this.fleetMarker.hashCode()) * 31) + this.filterHash.hashCode()) * 31) + this.updatedAt.hashCode();
    }

    public String toString() {
        String str = this.f66671id;
        int i = this.batteryLevel;
        Geolocation geolocation = this.location;
        String str2 = this.code;
        FleetMarker fleetMarker = this.fleetMarker;
        String str3 = this.filterHash;
        DateTime dateTime = this.updatedAt;
        return "BirdMapMarker(id=" + str + ", batteryLevel=" + i + ", location=" + geolocation + ", code=" + str2 + ", fleetMarker=" + fleetMarker + ", filterHash=" + str3 + ", updatedAt=" + dateTime + ")";
    }
}
