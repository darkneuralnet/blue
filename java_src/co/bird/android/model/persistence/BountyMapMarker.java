package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/persistence/BountyMapMarker;", "", "id", "", "location", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "marker", "Lco/bird/android/model/persistence/FleetMarker;", "updatedAt", "Lorg/joda/time/DateTime;", "countdownUntil", "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Lco/bird/android/model/persistence/FleetMarker;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getCountdownUntil", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getLocation", "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "getMarker", "()Lco/bird/android/model/persistence/FleetMarker;", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BountyMapMarker {
    private final DateTime countdownUntil;

    /* renamed from: id */
    private final String f66674id;
    private final Geolocation location;
    private final FleetMarker marker;
    private final DateTime updatedAt;

    public BountyMapMarker(String id, Geolocation location, FleetMarker fleetMarker, DateTime updatedAt, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f66674id = id;
        this.location = location;
        this.marker = fleetMarker;
        this.updatedAt = updatedAt;
        this.countdownUntil = dateTime;
    }

    public static /* synthetic */ BountyMapMarker copy$default(BountyMapMarker bountyMapMarker, String str, Geolocation geolocation, FleetMarker fleetMarker, DateTime dateTime, DateTime dateTime2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bountyMapMarker.f66674id;
        }
        if ((i & 2) != 0) {
            geolocation = bountyMapMarker.location;
        }
        Geolocation geolocation2 = geolocation;
        if ((i & 4) != 0) {
            fleetMarker = bountyMapMarker.marker;
        }
        FleetMarker fleetMarker2 = fleetMarker;
        if ((i & 8) != 0) {
            dateTime = bountyMapMarker.updatedAt;
        }
        DateTime dateTime3 = dateTime;
        if ((i & 16) != 0) {
            dateTime2 = bountyMapMarker.countdownUntil;
        }
        return bountyMapMarker.copy(str, geolocation2, fleetMarker2, dateTime3, dateTime2);
    }

    public final String component1() {
        return this.f66674id;
    }

    public final Geolocation component2() {
        return this.location;
    }

    public final FleetMarker component3() {
        return this.marker;
    }

    public final DateTime component4() {
        return this.updatedAt;
    }

    public final DateTime component5() {
        return this.countdownUntil;
    }

    public final BountyMapMarker copy(String id, Geolocation location, FleetMarker fleetMarker, DateTime updatedAt, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new BountyMapMarker(id, location, fleetMarker, updatedAt, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BountyMapMarker) {
            BountyMapMarker bountyMapMarker = (BountyMapMarker) obj;
            return Intrinsics.areEqual(this.f66674id, bountyMapMarker.f66674id) && Intrinsics.areEqual(this.location, bountyMapMarker.location) && Intrinsics.areEqual(this.marker, bountyMapMarker.marker) && Intrinsics.areEqual(this.updatedAt, bountyMapMarker.updatedAt) && Intrinsics.areEqual(this.countdownUntil, bountyMapMarker.countdownUntil);
        }
        return false;
    }

    public final DateTime getCountdownUntil() {
        return this.countdownUntil;
    }

    public final String getId() {
        return this.f66674id;
    }

    public final Geolocation getLocation() {
        return this.location;
    }

    public final FleetMarker getMarker() {
        return this.marker;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int hashCode = ((this.f66674id.hashCode() * 31) + this.location.hashCode()) * 31;
        FleetMarker fleetMarker = this.marker;
        int hashCode2 = (((hashCode + (fleetMarker == null ? 0 : fleetMarker.hashCode())) * 31) + this.updatedAt.hashCode()) * 31;
        DateTime dateTime = this.countdownUntil;
        return hashCode2 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66674id;
        Geolocation geolocation = this.location;
        FleetMarker fleetMarker = this.marker;
        DateTime dateTime = this.updatedAt;
        DateTime dateTime2 = this.countdownUntil;
        return "BountyMapMarker(id=" + str + ", location=" + geolocation + ", marker=" + fleetMarker + ", updatedAt=" + dateTime + ", countdownUntil=" + dateTime2 + ")";
    }
}
