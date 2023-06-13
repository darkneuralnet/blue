package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007¢\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÆ\u0003Jk\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007HÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u0006."}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/FlightSheetRideHistory;", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetSection;", "idx", "", "title", "", "details", "", "Lco/bird/android/model/persistence/nestedstructures/FlightSheetDetail;", "endPhotoUrl", "rating", RequestHeadersFactory.MODEL, "Lco/bird/android/model/constant/BirdModel;", "location", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "tracks", "Lco/bird/android/model/persistence/nestedstructures/BirdLocationTrack;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;ILco/bird/android/model/constant/BirdModel;Lco/bird/android/model/persistence/nestedstructures/Geolocation;Ljava/util/List;)V", "getDetails", "()Ljava/util/List;", "getEndPhotoUrl", "()Ljava/lang/String;", "getIdx", "()I", "getLocation", "()Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "getModel", "()Lco/bird/android/model/constant/BirdModel;", "getRating", "getTitle", "getTracks", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FlightSheetRideHistory implements FlightSheetSection {
    @JsonProperty("details")
    @InterfaceC41208ft5("details")
    private final List<FlightSheetDetail> details;
    @JsonProperty("end_photo_url")
    @InterfaceC41208ft5("end_photo_url")
    private final String endPhotoUrl;
    @JsonProperty("idx")
    @InterfaceC41208ft5("idx")
    private final int idx;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final Geolocation location;
    @JsonProperty(RequestHeadersFactory.MODEL)
    @InterfaceC41208ft5(RequestHeadersFactory.MODEL)
    private final BirdModel model;
    @JsonProperty("rating")
    @InterfaceC41208ft5("rating")
    private final int rating;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("tracks")
    @InterfaceC41208ft5("tracks")
    private final List<BirdLocationTrack> tracks;

    public FlightSheetRideHistory(int i, String str, List<FlightSheetDetail> details, String str2, int i2, BirdModel birdModel, Geolocation location, List<BirdLocationTrack> tracks) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        this.idx = i;
        this.title = str;
        this.details = details;
        this.endPhotoUrl = str2;
        this.rating = i2;
        this.model = birdModel;
        this.location = location;
        this.tracks = tracks;
    }

    public final int component1() {
        return this.idx;
    }

    public final String component2() {
        return this.title;
    }

    public final List<FlightSheetDetail> component3() {
        return this.details;
    }

    public final String component4() {
        return this.endPhotoUrl;
    }

    public final int component5() {
        return this.rating;
    }

    public final BirdModel component6() {
        return this.model;
    }

    public final Geolocation component7() {
        return this.location;
    }

    public final List<BirdLocationTrack> component8() {
        return this.tracks;
    }

    public final FlightSheetRideHistory copy(int i, String str, List<FlightSheetDetail> details, String str2, int i2, BirdModel birdModel, Geolocation location, List<BirdLocationTrack> tracks) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        return new FlightSheetRideHistory(i, str, details, str2, i2, birdModel, location, tracks);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlightSheetRideHistory) {
            FlightSheetRideHistory flightSheetRideHistory = (FlightSheetRideHistory) obj;
            return this.idx == flightSheetRideHistory.idx && Intrinsics.areEqual(this.title, flightSheetRideHistory.title) && Intrinsics.areEqual(this.details, flightSheetRideHistory.details) && Intrinsics.areEqual(this.endPhotoUrl, flightSheetRideHistory.endPhotoUrl) && this.rating == flightSheetRideHistory.rating && this.model == flightSheetRideHistory.model && Intrinsics.areEqual(this.location, flightSheetRideHistory.location) && Intrinsics.areEqual(this.tracks, flightSheetRideHistory.tracks);
        }
        return false;
    }

    public final List<FlightSheetDetail> getDetails() {
        return this.details;
    }

    public final String getEndPhotoUrl() {
        return this.endPhotoUrl;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetSection
    public int getIdx() {
        return this.idx;
    }

    public final Geolocation getLocation() {
        return this.location;
    }

    public final BirdModel getModel() {
        return this.model;
    }

    public final int getRating() {
        return this.rating;
    }

    @Override // co.bird.android.model.persistence.nestedstructures.FlightSheetSection
    public String getTitle() {
        return this.title;
    }

    public final List<BirdLocationTrack> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.idx) * 31;
        String str = this.title;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.details.hashCode()) * 31;
        String str2 = this.endPhotoUrl;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.rating)) * 31;
        BirdModel birdModel = this.model;
        return ((((hashCode3 + (birdModel != null ? birdModel.hashCode() : 0)) * 31) + this.location.hashCode()) * 31) + this.tracks.hashCode();
    }

    public String toString() {
        int i = this.idx;
        String str = this.title;
        List<FlightSheetDetail> list = this.details;
        String str2 = this.endPhotoUrl;
        int i2 = this.rating;
        BirdModel birdModel = this.model;
        Geolocation geolocation = this.location;
        List<BirdLocationTrack> list2 = this.tracks;
        return "FlightSheetRideHistory(idx=" + i + ", title=" + str + ", details=" + list + ", endPhotoUrl=" + str2 + ", rating=" + i2 + ", model=" + birdModel + ", location=" + geolocation + ", tracks=" + list2 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FlightSheetRideHistory(int i, String str, List list, String str2, int i2, BirdModel birdModel, Geolocation geolocation, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r4, r5, r6, r7, r8, geolocation, r10);
        List list3;
        List list4;
        List emptyList;
        List emptyList2;
        int i4 = (i3 & 1) != 0 ? Integer.MAX_VALUE : i;
        String str3 = (i3 & 2) != 0 ? null : str;
        if ((i3 & 4) != 0) {
            emptyList2 = CollectionsKt__CollectionsKt.emptyList();
            list3 = emptyList2;
        } else {
            list3 = list;
        }
        String str4 = (i3 & 8) != 0 ? null : str2;
        int i5 = (i3 & 16) != 0 ? 0 : i2;
        BirdModel birdModel2 = (i3 & 32) != 0 ? null : birdModel;
        if ((i3 & 128) != 0) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            list4 = emptyList;
        } else {
            list4 = list2;
        }
    }
}
