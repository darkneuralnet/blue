package co.bird.android.model;

import co.bird.android.model.persistence.nestedstructures.Geolocation;
import co.bird.android.model.wire.WireBirdLocationTrack;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/model/FlightSheetMap;", "", "tracks", "", "Lco/bird/android/model/wire/WireBirdLocationTrack;", RequestHeadersFactory.MODEL, "", "displayPartnerName", "", "location", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "(Ljava/util/List;Ljava/lang/String;ZLco/bird/android/model/persistence/nestedstructures/Geolocation;)V", "getDisplayPartnerName", "()Z", "getLocation", "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "getModel", "()Ljava/lang/String;", "getTracks", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlightSheetMap {
    private final boolean displayPartnerName;
    private final Geolocation location;
    private final String model;
    private final List<WireBirdLocationTrack> tracks;

    public FlightSheetMap(List<WireBirdLocationTrack> tracks, String str, boolean z, Geolocation location) {
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        Intrinsics.checkNotNullParameter(location, "location");
        this.tracks = tracks;
        this.model = str;
        this.displayPartnerName = z;
        this.location = location;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlightSheetMap copy$default(FlightSheetMap flightSheetMap, List list, String str, boolean z, Geolocation geolocation, int i, Object obj) {
        if ((i & 1) != 0) {
            list = flightSheetMap.tracks;
        }
        if ((i & 2) != 0) {
            str = flightSheetMap.model;
        }
        if ((i & 4) != 0) {
            z = flightSheetMap.displayPartnerName;
        }
        if ((i & 8) != 0) {
            geolocation = flightSheetMap.location;
        }
        return flightSheetMap.copy(list, str, z, geolocation);
    }

    public final List<WireBirdLocationTrack> component1() {
        return this.tracks;
    }

    public final String component2() {
        return this.model;
    }

    public final boolean component3() {
        return this.displayPartnerName;
    }

    public final Geolocation component4() {
        return this.location;
    }

    public final FlightSheetMap copy(List<WireBirdLocationTrack> tracks, String str, boolean z, Geolocation location) {
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        Intrinsics.checkNotNullParameter(location, "location");
        return new FlightSheetMap(tracks, str, z, location);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlightSheetMap) {
            FlightSheetMap flightSheetMap = (FlightSheetMap) obj;
            return Intrinsics.areEqual(this.tracks, flightSheetMap.tracks) && Intrinsics.areEqual(this.model, flightSheetMap.model) && this.displayPartnerName == flightSheetMap.displayPartnerName && Intrinsics.areEqual(this.location, flightSheetMap.location);
        }
        return false;
    }

    public final boolean getDisplayPartnerName() {
        return this.displayPartnerName;
    }

    public final Geolocation getLocation() {
        return this.location;
    }

    public final String getModel() {
        return this.model;
    }

    public final List<WireBirdLocationTrack> getTracks() {
        return this.tracks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.tracks.hashCode() * 31;
        String str = this.model;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.displayPartnerName;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode2 + i) * 31) + this.location.hashCode();
    }

    public String toString() {
        List<WireBirdLocationTrack> list = this.tracks;
        String str = this.model;
        boolean z = this.displayPartnerName;
        Geolocation geolocation = this.location;
        return "FlightSheetMap(tracks=" + list + ", model=" + str + ", displayPartnerName=" + z + ", location=" + geolocation + ")";
    }

    public /* synthetic */ FlightSheetMap(List list, String str, boolean z, Geolocation geolocation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, (i & 4) != 0 ? false : z, geolocation);
    }
}
