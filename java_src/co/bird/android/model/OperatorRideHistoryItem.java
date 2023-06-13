package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.wire.WireBirdLocationTrack;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J~\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001¢\u0006\u0002\u0010)J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u0019\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00066"}, m28432d2 = {"Lco/bird/android/model/OperatorRideHistoryItem;", "Landroid/os/Parcelable;", "rideId", "", "rating", "", "distance", "duration", "endPhotoUrl", "startedAt", "Lorg/joda/time/DateTime;", "completedAt", "canceledAt", "tracks", "", "Lco/bird/android/model/wire/WireBirdLocationTrack;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)V", "getCanceledAt", "()Lorg/joda/time/DateTime;", "getCompletedAt", "getDistance", "()Ljava/lang/String;", "getDuration", "getEndPhotoUrl", "getRating", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRideId", "getStartedAt", "getTracks", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)Lco/bird/android/model/OperatorRideHistoryItem;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorRideHistoryItem implements Parcelable {
    public static final Parcelable.Creator<OperatorRideHistoryItem> CREATOR = new Creator();
    @JsonProperty("canceled_at")
    @InterfaceC41208ft5("canceled_at")
    private final DateTime canceledAt;
    @JsonProperty("completed_at")
    @InterfaceC41208ft5("completed_at")
    private final DateTime completedAt;
    @JsonProperty("distance")
    @InterfaceC41208ft5("distance")
    private final String distance;
    @JsonProperty("duration")
    @InterfaceC41208ft5("duration")
    private final String duration;
    @JsonProperty("end_photo_url")
    @InterfaceC41208ft5("end_photo_url")
    private final String endPhotoUrl;
    @JsonProperty("rating")
    @InterfaceC41208ft5("rating")
    private final Integer rating;
    @JsonProperty("ride_id")
    @InterfaceC41208ft5("ride_id")
    private final String rideId;
    @JsonProperty("started_at")
    @InterfaceC41208ft5("started_at")
    private final DateTime startedAt;
    @JsonProperty("tracks")
    @InterfaceC41208ft5("tracks")
    private final List<WireBirdLocationTrack> tracks;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<OperatorRideHistoryItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OperatorRideHistoryItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(parcel.readParcelable(OperatorRideHistoryItem.class.getClassLoader()));
            }
            return new OperatorRideHistoryItem(readString, valueOf, readString2, readString3, readString4, dateTime, dateTime2, dateTime3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OperatorRideHistoryItem[] newArray(int i) {
            return new OperatorRideHistoryItem[i];
        }
    }

    public OperatorRideHistoryItem() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public final String component1() {
        return this.rideId;
    }

    public final Integer component2() {
        return this.rating;
    }

    public final String component3() {
        return this.distance;
    }

    public final String component4() {
        return this.duration;
    }

    public final String component5() {
        return this.endPhotoUrl;
    }

    public final DateTime component6() {
        return this.startedAt;
    }

    public final DateTime component7() {
        return this.completedAt;
    }

    public final DateTime component8() {
        return this.canceledAt;
    }

    public final List<WireBirdLocationTrack> component9() {
        return this.tracks;
    }

    public final OperatorRideHistoryItem copy(String str, Integer num, String str2, String str3, String str4, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, List<WireBirdLocationTrack> tracks) {
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        return new OperatorRideHistoryItem(str, num, str2, str3, str4, dateTime, dateTime2, dateTime3, tracks);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorRideHistoryItem) {
            OperatorRideHistoryItem operatorRideHistoryItem = (OperatorRideHistoryItem) obj;
            return Intrinsics.areEqual(this.rideId, operatorRideHistoryItem.rideId) && Intrinsics.areEqual(this.rating, operatorRideHistoryItem.rating) && Intrinsics.areEqual(this.distance, operatorRideHistoryItem.distance) && Intrinsics.areEqual(this.duration, operatorRideHistoryItem.duration) && Intrinsics.areEqual(this.endPhotoUrl, operatorRideHistoryItem.endPhotoUrl) && Intrinsics.areEqual(this.startedAt, operatorRideHistoryItem.startedAt) && Intrinsics.areEqual(this.completedAt, operatorRideHistoryItem.completedAt) && Intrinsics.areEqual(this.canceledAt, operatorRideHistoryItem.canceledAt) && Intrinsics.areEqual(this.tracks, operatorRideHistoryItem.tracks);
        }
        return false;
    }

    public final DateTime getCanceledAt() {
        return this.canceledAt;
    }

    public final DateTime getCompletedAt() {
        return this.completedAt;
    }

    public final String getDistance() {
        return this.distance;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getEndPhotoUrl() {
        return this.endPhotoUrl;
    }

    public final Integer getRating() {
        return this.rating;
    }

    public final String getRideId() {
        return this.rideId;
    }

    public final DateTime getStartedAt() {
        return this.startedAt;
    }

    public final List<WireBirdLocationTrack> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        String str = this.rideId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.rating;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.distance;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.duration;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.endPhotoUrl;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DateTime dateTime = this.startedAt;
        int hashCode6 = (hashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.completedAt;
        int hashCode7 = (hashCode6 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.canceledAt;
        return ((hashCode7 + (dateTime3 != null ? dateTime3.hashCode() : 0)) * 31) + this.tracks.hashCode();
    }

    public String toString() {
        String str = this.rideId;
        Integer num = this.rating;
        String str2 = this.distance;
        String str3 = this.duration;
        String str4 = this.endPhotoUrl;
        DateTime dateTime = this.startedAt;
        DateTime dateTime2 = this.completedAt;
        DateTime dateTime3 = this.canceledAt;
        List<WireBirdLocationTrack> list = this.tracks;
        return "OperatorRideHistoryItem(rideId=" + str + ", rating=" + num + ", distance=" + str2 + ", duration=" + str3 + ", endPhotoUrl=" + str4 + ", startedAt=" + dateTime + ", completedAt=" + dateTime2 + ", canceledAt=" + dateTime3 + ", tracks=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int intValue;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.rideId);
        Integer num = this.rating;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.distance);
        out.writeString(this.duration);
        out.writeString(this.endPhotoUrl);
        out.writeSerializable(this.startedAt);
        out.writeSerializable(this.completedAt);
        out.writeSerializable(this.canceledAt);
        List<WireBirdLocationTrack> list = this.tracks;
        out.writeInt(list.size());
        for (WireBirdLocationTrack wireBirdLocationTrack : list) {
            out.writeParcelable(wireBirdLocationTrack, i);
        }
    }

    public OperatorRideHistoryItem(String str, Integer num, String str2, String str3, String str4, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, List<WireBirdLocationTrack> tracks) {
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        this.rideId = str;
        this.rating = num;
        this.distance = str2;
        this.duration = str3;
        this.endPhotoUrl = str4;
        this.startedAt = dateTime;
        this.completedAt = dateTime2;
        this.canceledAt = dateTime3;
        this.tracks = tracks;
    }

    public /* synthetic */ OperatorRideHistoryItem(String str, Integer num, String str2, String str3, String str4, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "", (i & 32) != 0 ? DateTime.now() : dateTime, (i & 64) != 0 ? null : dateTime2, (i & 128) == 0 ? dateTime3 : null, (i & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
