package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdStatus;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001fHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, m28432d2 = {"Lco/bird/android/model/wire/WireBirdEvent;", "Landroid/os/Parcelable;", "id", "", "birdId", "rideId", "status", "Lco/bird/android/model/constant/BirdStatus;", "value", "", "createdAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/BirdStatus;ZLorg/joda/time/DateTime;)V", "getBirdId", "()Ljava/lang/String;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "getRideId", "getStatus", "()Lco/bird/android/model/constant/BirdStatus;", "getValue", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBirdEvent implements Parcelable {
    public static final Parcelable.Creator<WireBirdEvent> CREATOR = new Creator();
    @JsonProperty("bird_id")
    @JsonAlias({"birdId"})
    @InterfaceC41208ft5(alternate = {"birdId"}, value = "bird_id")
    private final String birdId;
    @JsonProperty("created_at")
    @JsonAlias({"createdAt"})
    @InterfaceC41208ft5(alternate = {"createdAt"}, value = "created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66718id;
    @JsonProperty("ride_id")
    @JsonAlias({"rideId"})
    @InterfaceC41208ft5(alternate = {"rideId"}, value = "ride_id")
    private final String rideId;
    @JsonProperty("status_field")
    @JsonAlias({"statusField"})
    @InterfaceC41208ft5(alternate = {"statusField"}, value = "status_field")
    private final BirdStatus status;
    @JsonProperty("value")
    @InterfaceC41208ft5("value")
    private final boolean value;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireBirdEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBirdEvent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireBirdEvent(parcel.readString(), parcel.readString(), parcel.readString(), BirdStatus.valueOf(parcel.readString()), parcel.readInt() != 0, (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBirdEvent[] newArray(int i) {
            return new WireBirdEvent[i];
        }
    }

    public WireBirdEvent() {
        this(null, null, null, null, false, null, 63, null);
    }

    public static /* synthetic */ WireBirdEvent copy$default(WireBirdEvent wireBirdEvent, String str, String str2, String str3, BirdStatus birdStatus, boolean z, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireBirdEvent.f66718id;
        }
        if ((i & 2) != 0) {
            str2 = wireBirdEvent.birdId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = wireBirdEvent.rideId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            birdStatus = wireBirdEvent.status;
        }
        BirdStatus birdStatus2 = birdStatus;
        if ((i & 16) != 0) {
            z = wireBirdEvent.value;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            dateTime = wireBirdEvent.createdAt;
        }
        return wireBirdEvent.copy(str, str4, str5, birdStatus2, z2, dateTime);
    }

    public final String component1() {
        return this.f66718id;
    }

    public final String component2() {
        return this.birdId;
    }

    public final String component3() {
        return this.rideId;
    }

    public final BirdStatus component4() {
        return this.status;
    }

    public final boolean component5() {
        return this.value;
    }

    public final DateTime component6() {
        return this.createdAt;
    }

    public final WireBirdEvent copy(String id, String birdId, String rideId, BirdStatus status, boolean z, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new WireBirdEvent(id, birdId, rideId, status, z, createdAt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBirdEvent) {
            WireBirdEvent wireBirdEvent = (WireBirdEvent) obj;
            return Intrinsics.areEqual(this.f66718id, wireBirdEvent.f66718id) && Intrinsics.areEqual(this.birdId, wireBirdEvent.birdId) && Intrinsics.areEqual(this.rideId, wireBirdEvent.rideId) && this.status == wireBirdEvent.status && this.value == wireBirdEvent.value && Intrinsics.areEqual(this.createdAt, wireBirdEvent.createdAt);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f66718id;
    }

    public final String getRideId() {
        return this.rideId;
    }

    public final BirdStatus getStatus() {
        return this.status;
    }

    public final boolean getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f66718id.hashCode() * 31) + this.birdId.hashCode()) * 31) + this.rideId.hashCode()) * 31) + this.status.hashCode()) * 31;
        boolean z = this.value;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        String str = this.f66718id;
        String str2 = this.birdId;
        String str3 = this.rideId;
        BirdStatus birdStatus = this.status;
        boolean z = this.value;
        DateTime dateTime = this.createdAt;
        return "WireBirdEvent(id=" + str + ", birdId=" + str2 + ", rideId=" + str3 + ", status=" + birdStatus + ", value=" + z + ", createdAt=" + dateTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66718id);
        out.writeString(this.birdId);
        out.writeString(this.rideId);
        out.writeString(this.status.name());
        out.writeInt(this.value ? 1 : 0);
        out.writeSerializable(this.createdAt);
    }

    public WireBirdEvent(String id, String birdId, String rideId, BirdStatus status, boolean z, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f66718id = id;
        this.birdId = birdId;
        this.rideId = rideId;
        this.status = status;
        this.value = z;
        this.createdAt = createdAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireBirdEvent(String str, String str2, String str3, BirdStatus birdStatus, boolean z, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r12, r1, r0, r2, r3, dateTime);
        String str4 = (i & 1) != 0 ? "" : str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) == 0 ? str3 : "";
        BirdStatus birdStatus2 = (i & 8) != 0 ? BirdStatus.LOCKED : birdStatus;
        boolean z2 = (i & 16) != 0 ? false : z;
        if ((i & 32) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
