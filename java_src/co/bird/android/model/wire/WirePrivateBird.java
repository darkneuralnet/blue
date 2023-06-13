package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.OwnershipKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003JU\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 HÖ\u0001R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006,"}, m28432d2 = {"Lco/bird/android/model/wire/WirePrivateBird;", "Landroid/os/Parcelable;", "id", "", "userId", "endedAt", "Lorg/joda/time/DateTime;", "userFirstScanAt", "ownershipKind", "Lco/bird/android/model/constant/OwnershipKind;", "createdAt", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/OwnershipKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getEndedAt", "getId", "()Ljava/lang/String;", "getOwnershipKind", "()Lco/bird/android/model/constant/OwnershipKind;", "getUpdatedAt", "getUserFirstScanAt", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WirePrivateBird implements Parcelable {
    public static final Parcelable.Creator<WirePrivateBird> CREATOR = new Creator();
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("ended_at")
    @InterfaceC41208ft5("ended_at")
    private final DateTime endedAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66752id;
    @JsonProperty("ownership_kind")
    @InterfaceC41208ft5("ownership_kind")
    private final OwnershipKind ownershipKind;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;
    @JsonProperty("user_first_scan_at")
    @InterfaceC41208ft5("user_first_scan_at")
    private final DateTime userFirstScanAt;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WirePrivateBird> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WirePrivateBird createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WirePrivateBird(parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : OwnershipKind.valueOf(parcel.readString()), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WirePrivateBird[] newArray(int i) {
            return new WirePrivateBird[i];
        }
    }

    public WirePrivateBird() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ WirePrivateBird copy$default(WirePrivateBird wirePrivateBird, String str, String str2, DateTime dateTime, DateTime dateTime2, OwnershipKind ownershipKind, DateTime dateTime3, DateTime dateTime4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wirePrivateBird.f66752id;
        }
        if ((i & 2) != 0) {
            str2 = wirePrivateBird.userId;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            dateTime = wirePrivateBird.endedAt;
        }
        DateTime dateTime5 = dateTime;
        if ((i & 8) != 0) {
            dateTime2 = wirePrivateBird.userFirstScanAt;
        }
        DateTime dateTime6 = dateTime2;
        if ((i & 16) != 0) {
            ownershipKind = wirePrivateBird.ownershipKind;
        }
        OwnershipKind ownershipKind2 = ownershipKind;
        if ((i & 32) != 0) {
            dateTime3 = wirePrivateBird.createdAt;
        }
        DateTime dateTime7 = dateTime3;
        if ((i & 64) != 0) {
            dateTime4 = wirePrivateBird.updatedAt;
        }
        return wirePrivateBird.copy(str, str3, dateTime5, dateTime6, ownershipKind2, dateTime7, dateTime4);
    }

    public final String component1() {
        return this.f66752id;
    }

    public final String component2() {
        return this.userId;
    }

    public final DateTime component3() {
        return this.endedAt;
    }

    public final DateTime component4() {
        return this.userFirstScanAt;
    }

    public final OwnershipKind component5() {
        return this.ownershipKind;
    }

    public final DateTime component6() {
        return this.createdAt;
    }

    public final DateTime component7() {
        return this.updatedAt;
    }

    public final WirePrivateBird copy(String id, String userId, DateTime dateTime, DateTime dateTime2, OwnershipKind ownershipKind, DateTime createdAt, DateTime updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new WirePrivateBird(id, userId, dateTime, dateTime2, ownershipKind, createdAt, updatedAt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WirePrivateBird) {
            WirePrivateBird wirePrivateBird = (WirePrivateBird) obj;
            return Intrinsics.areEqual(this.f66752id, wirePrivateBird.f66752id) && Intrinsics.areEqual(this.userId, wirePrivateBird.userId) && Intrinsics.areEqual(this.endedAt, wirePrivateBird.endedAt) && Intrinsics.areEqual(this.userFirstScanAt, wirePrivateBird.userFirstScanAt) && this.ownershipKind == wirePrivateBird.ownershipKind && Intrinsics.areEqual(this.createdAt, wirePrivateBird.createdAt) && Intrinsics.areEqual(this.updatedAt, wirePrivateBird.updatedAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final DateTime getEndedAt() {
        return this.endedAt;
    }

    public final String getId() {
        return this.f66752id;
    }

    public final OwnershipKind getOwnershipKind() {
        return this.ownershipKind;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public final DateTime getUserFirstScanAt() {
        return this.userFirstScanAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((this.f66752id.hashCode() * 31) + this.userId.hashCode()) * 31;
        DateTime dateTime = this.endedAt;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.userFirstScanAt;
        int hashCode3 = (hashCode2 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        OwnershipKind ownershipKind = this.ownershipKind;
        return ((((hashCode3 + (ownershipKind != null ? ownershipKind.hashCode() : 0)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode();
    }

    public String toString() {
        String str = this.f66752id;
        String str2 = this.userId;
        DateTime dateTime = this.endedAt;
        DateTime dateTime2 = this.userFirstScanAt;
        OwnershipKind ownershipKind = this.ownershipKind;
        DateTime dateTime3 = this.createdAt;
        DateTime dateTime4 = this.updatedAt;
        return "WirePrivateBird(id=" + str + ", userId=" + str2 + ", endedAt=" + dateTime + ", userFirstScanAt=" + dateTime2 + ", ownershipKind=" + ownershipKind + ", createdAt=" + dateTime3 + ", updatedAt=" + dateTime4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66752id);
        out.writeString(this.userId);
        out.writeSerializable(this.endedAt);
        out.writeSerializable(this.userFirstScanAt);
        OwnershipKind ownershipKind = this.ownershipKind;
        if (ownershipKind == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(ownershipKind.name());
        }
        out.writeSerializable(this.createdAt);
        out.writeSerializable(this.updatedAt);
    }

    public WirePrivateBird(String id, String userId, DateTime dateTime, DateTime dateTime2, OwnershipKind ownershipKind, DateTime createdAt, DateTime updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f66752id = id;
        this.userId = userId;
        this.endedAt = dateTime;
        this.userFirstScanAt = dateTime2;
        this.ownershipKind = ownershipKind;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WirePrivateBird(String str, String str2, DateTime dateTime, DateTime dateTime2, OwnershipKind ownershipKind, DateTime dateTime3, DateTime dateTime4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r14, r0, r1, r2, r3, r4, dateTime4);
        String str3 = (i & 1) != 0 ? "" : str;
        String str4 = (i & 2) == 0 ? str2 : "";
        DateTime dateTime5 = (i & 4) != 0 ? null : dateTime;
        DateTime dateTime6 = (i & 8) != 0 ? null : dateTime2;
        OwnershipKind ownershipKind2 = (i & 16) != 0 ? null : ownershipKind;
        if ((i & 32) != 0) {
            dateTime3 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime3, "now()");
        }
        DateTime dateTime7 = dateTime3;
        if ((i & 64) != 0) {
            dateTime4 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime4, "now()");
        }
    }
}
