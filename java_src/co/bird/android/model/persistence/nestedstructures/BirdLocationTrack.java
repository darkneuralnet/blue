package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;", "", "location", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "createdAt", "Lorg/joda/time/DateTime;", "(Lco/bird/android/model/persistence/nestedstructures/Geolocation;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getLocation", "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdLocationTrack {
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final Geolocation location;

    public BirdLocationTrack(Geolocation location, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.location = location;
        this.createdAt = createdAt;
    }

    public static /* synthetic */ BirdLocationTrack copy$default(BirdLocationTrack birdLocationTrack, Geolocation geolocation, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            geolocation = birdLocationTrack.location;
        }
        if ((i & 2) != 0) {
            dateTime = birdLocationTrack.createdAt;
        }
        return birdLocationTrack.copy(geolocation, dateTime);
    }

    public final Geolocation component1() {
        return this.location;
    }

    public final DateTime component2() {
        return this.createdAt;
    }

    public final BirdLocationTrack copy(Geolocation location, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new BirdLocationTrack(location, createdAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdLocationTrack) {
            BirdLocationTrack birdLocationTrack = (BirdLocationTrack) obj;
            return Intrinsics.areEqual(this.location, birdLocationTrack.location) && Intrinsics.areEqual(this.createdAt, birdLocationTrack.createdAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final Geolocation getLocation() {
        return this.location;
    }

    public int hashCode() {
        return (this.location.hashCode() * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        Geolocation geolocation = this.location;
        DateTime dateTime = this.createdAt;
        return "BirdLocationTrack(location=" + geolocation + ", createdAt=" + dateTime + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BirdLocationTrack(Geolocation geolocation, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(geolocation, dateTime);
        if ((i & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
