package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/wire/WireEndRidePhotoParkingEvaluation;", "Landroid/os/Parcelable;", "id", "", "photoUrl", "properParking", "", "reason", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getPhotoUrl", "getProperParking", "()Z", "getReason", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireEndRidePhotoParkingEvaluation implements Parcelable {
    public static final Parcelable.Creator<WireEndRidePhotoParkingEvaluation> CREATOR = new Creator();
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66725id;
    @JsonProperty("photo_url")
    @InterfaceC41208ft5("photo_url")
    private final String photoUrl;
    @JsonProperty("proper_parking")
    @InterfaceC41208ft5("proper_parking")
    private final boolean properParking;
    @JsonProperty("reason")
    @InterfaceC41208ft5("reason")
    private final String reason;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireEndRidePhotoParkingEvaluation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireEndRidePhotoParkingEvaluation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireEndRidePhotoParkingEvaluation(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireEndRidePhotoParkingEvaluation[] newArray(int i) {
            return new WireEndRidePhotoParkingEvaluation[i];
        }
    }

    public WireEndRidePhotoParkingEvaluation() {
        this(null, null, false, null, 15, null);
    }

    public static /* synthetic */ WireEndRidePhotoParkingEvaluation copy$default(WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireEndRidePhotoParkingEvaluation.f66725id;
        }
        if ((i & 2) != 0) {
            str2 = wireEndRidePhotoParkingEvaluation.photoUrl;
        }
        if ((i & 4) != 0) {
            z = wireEndRidePhotoParkingEvaluation.properParking;
        }
        if ((i & 8) != 0) {
            str3 = wireEndRidePhotoParkingEvaluation.reason;
        }
        return wireEndRidePhotoParkingEvaluation.copy(str, str2, z, str3);
    }

    public final String component1() {
        return this.f66725id;
    }

    public final String component2() {
        return this.photoUrl;
    }

    public final boolean component3() {
        return this.properParking;
    }

    public final String component4() {
        return this.reason;
    }

    public final WireEndRidePhotoParkingEvaluation copy(String id, String str, boolean z, String reason) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        return new WireEndRidePhotoParkingEvaluation(id, str, z, reason);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireEndRidePhotoParkingEvaluation) {
            WireEndRidePhotoParkingEvaluation wireEndRidePhotoParkingEvaluation = (WireEndRidePhotoParkingEvaluation) obj;
            return Intrinsics.areEqual(this.f66725id, wireEndRidePhotoParkingEvaluation.f66725id) && Intrinsics.areEqual(this.photoUrl, wireEndRidePhotoParkingEvaluation.photoUrl) && this.properParking == wireEndRidePhotoParkingEvaluation.properParking && Intrinsics.areEqual(this.reason, wireEndRidePhotoParkingEvaluation.reason);
        }
        return false;
    }

    public final String getId() {
        return this.f66725id;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final boolean getProperParking() {
        return this.properParking;
    }

    public final String getReason() {
        return this.reason;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66725id.hashCode() * 31;
        String str = this.photoUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.properParking;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode2 + i) * 31) + this.reason.hashCode();
    }

    public String toString() {
        String str = this.f66725id;
        String str2 = this.photoUrl;
        boolean z = this.properParking;
        String str3 = this.reason;
        return "WireEndRidePhotoParkingEvaluation(id=" + str + ", photoUrl=" + str2 + ", properParking=" + z + ", reason=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66725id);
        out.writeString(this.photoUrl);
        out.writeInt(this.properParking ? 1 : 0);
        out.writeString(this.reason);
    }

    public WireEndRidePhotoParkingEvaluation(String id, String str, boolean z, String reason) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f66725id = id;
        this.photoUrl = str;
        this.properParking = z;
        this.reason = reason;
    }

    public /* synthetic */ WireEndRidePhotoParkingEvaluation(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3);
    }
}
