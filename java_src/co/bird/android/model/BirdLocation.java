package co.bird.android.model;

import co.bird.android.model.constant.BirdLocationSource;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/BirdLocation;", "", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/constant/BirdLocationSource;", "displayName", "", "location", "Lco/bird/android/model/wire/WireLocation;", "createdAt", "Lorg/joda/time/DateTime;", "(Lco/bird/android/model/constant/BirdLocationSource;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getDisplayName", "()Ljava/lang/String;", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getSource", "()Lco/bird/android/model/constant/BirdLocationSource;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdLocation {
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("display_name")
    @InterfaceC41208ft5("display_name")
    private final String displayName;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty(Stripe3ds2AuthParams.FIELD_SOURCE)
    @InterfaceC41208ft5(Stripe3ds2AuthParams.FIELD_SOURCE)
    private final BirdLocationSource source;

    public BirdLocation() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ BirdLocation copy$default(BirdLocation birdLocation, BirdLocationSource birdLocationSource, String str, WireLocation wireLocation, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            birdLocationSource = birdLocation.source;
        }
        if ((i & 2) != 0) {
            str = birdLocation.displayName;
        }
        if ((i & 4) != 0) {
            wireLocation = birdLocation.location;
        }
        if ((i & 8) != 0) {
            dateTime = birdLocation.createdAt;
        }
        return birdLocation.copy(birdLocationSource, str, wireLocation, dateTime);
    }

    public final BirdLocationSource component1() {
        return this.source;
    }

    public final String component2() {
        return this.displayName;
    }

    public final WireLocation component3() {
        return this.location;
    }

    public final DateTime component4() {
        return this.createdAt;
    }

    public final BirdLocation copy(BirdLocationSource source, String str, WireLocation location, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(location, "location");
        return new BirdLocation(source, str, location, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdLocation) {
            BirdLocation birdLocation = (BirdLocation) obj;
            return this.source == birdLocation.source && Intrinsics.areEqual(this.displayName, birdLocation.displayName) && Intrinsics.areEqual(this.location, birdLocation.location) && Intrinsics.areEqual(this.createdAt, birdLocation.createdAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final BirdLocationSource getSource() {
        return this.source;
    }

    public int hashCode() {
        int hashCode = this.source.hashCode() * 31;
        String str = this.displayName;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.location.hashCode()) * 31;
        DateTime dateTime = this.createdAt;
        return hashCode2 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        BirdLocationSource birdLocationSource = this.source;
        String str = this.displayName;
        WireLocation wireLocation = this.location;
        DateTime dateTime = this.createdAt;
        return "BirdLocation(source=" + birdLocationSource + ", displayName=" + str + ", location=" + wireLocation + ", createdAt=" + dateTime + ")";
    }

    public BirdLocation(BirdLocationSource source, String str, WireLocation location, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(location, "location");
        this.source = source;
        this.displayName = str;
        this.location = location;
        this.createdAt = dateTime;
    }

    public /* synthetic */ BirdLocation(BirdLocationSource birdLocationSource, String str, WireLocation wireLocation, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        BirdLocation birdLocation;
        BirdLocationSource birdLocationSource2 = (i & 1) != 0 ? BirdLocationSource.UNKNOWN : birdLocationSource;
        DateTime dateTime2 = null;
        String str2 = (i & 2) != 0 ? null : str;
        WireLocation wireLocation2 = (i & 4) != 0 ? new WireLocation(0.0d, 0.0d, null, null, null, null, false, null, null, 508, null) : wireLocation;
        if ((i & 8) != 0) {
            birdLocation = this;
        } else {
            birdLocation = this;
            dateTime2 = dateTime;
        }
        new BirdLocation(birdLocationSource2, str2, wireLocation2, dateTime2);
    }
}
