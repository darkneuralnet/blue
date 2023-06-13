package co.bird.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003Jp\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010'J\t\u0010(\u001a\u00020\tHÖ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\tHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\tHÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010¨\u00064"}, m28432d2 = {"Lco/bird/api/response/HardCountResponse;", "Landroid/os/Parcelable;", "id", "", "warehouseId", "description", "startedAt", "Lorg/joda/time/DateTime;", "expectedQuantity", "", "failureScans", "successScans", "userFailureScans", "userSuccessScans", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;IIII)V", "getDescription", "()Ljava/lang/String;", "getExpectedQuantity", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFailureScans", "()I", "getId", "getStartedAt", "()Lorg/joda/time/DateTime;", "getSuccessScans", "getUserFailureScans", "getUserSuccessScans", "getWarehouseId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/Integer;IIII)Lco/bird/api/response/HardCountResponse;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class HardCountResponse implements Parcelable {
    public static final Parcelable.Creator<HardCountResponse> CREATOR = new Creator();
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("expected_quantity")
    @InterfaceC41208ft5("expected_quantity")
    private final Integer expectedQuantity;
    @JsonProperty("failure_count")
    @InterfaceC41208ft5("failure_count")
    private final int failureScans;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f68216id;
    @JsonProperty("started_at")
    @InterfaceC41208ft5("started_at")
    private final DateTime startedAt;
    @JsonProperty("success_count")
    @InterfaceC41208ft5("success_count")
    private final int successScans;
    @JsonProperty("user_failure_count")
    @InterfaceC41208ft5("user_failure_count")
    private final int userFailureScans;
    @JsonProperty("user_success_count")
    @InterfaceC41208ft5("user_success_count")
    private final int userSuccessScans;
    @JsonProperty("warehouse_id")
    @InterfaceC41208ft5("warehouse_id")
    private final String warehouseId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<HardCountResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HardCountResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HardCountResponse(parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HardCountResponse[] newArray(int i) {
            return new HardCountResponse[i];
        }
    }

    public HardCountResponse() {
        this(null, null, null, null, null, 0, 0, 0, 0, 511, null);
    }

    public final String component1() {
        return this.f68216id;
    }

    public final String component2() {
        return this.warehouseId;
    }

    public final String component3() {
        return this.description;
    }

    public final DateTime component4() {
        return this.startedAt;
    }

    public final Integer component5() {
        return this.expectedQuantity;
    }

    public final int component6() {
        return this.failureScans;
    }

    public final int component7() {
        return this.successScans;
    }

    public final int component8() {
        return this.userFailureScans;
    }

    public final int component9() {
        return this.userSuccessScans;
    }

    public final HardCountResponse copy(String id, String str, String str2, DateTime dateTime, Integer num, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new HardCountResponse(id, str, str2, dateTime, num, i, i2, i3, i4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HardCountResponse) {
            HardCountResponse hardCountResponse = (HardCountResponse) obj;
            return Intrinsics.areEqual(this.f68216id, hardCountResponse.f68216id) && Intrinsics.areEqual(this.warehouseId, hardCountResponse.warehouseId) && Intrinsics.areEqual(this.description, hardCountResponse.description) && Intrinsics.areEqual(this.startedAt, hardCountResponse.startedAt) && Intrinsics.areEqual(this.expectedQuantity, hardCountResponse.expectedQuantity) && this.failureScans == hardCountResponse.failureScans && this.successScans == hardCountResponse.successScans && this.userFailureScans == hardCountResponse.userFailureScans && this.userSuccessScans == hardCountResponse.userSuccessScans;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getExpectedQuantity() {
        return this.expectedQuantity;
    }

    public final int getFailureScans() {
        return this.failureScans;
    }

    public final String getId() {
        return this.f68216id;
    }

    public final DateTime getStartedAt() {
        return this.startedAt;
    }

    public final int getSuccessScans() {
        return this.successScans;
    }

    public final int getUserFailureScans() {
        return this.userFailureScans;
    }

    public final int getUserSuccessScans() {
        return this.userSuccessScans;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public int hashCode() {
        int hashCode = this.f68216id.hashCode() * 31;
        String str = this.warehouseId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DateTime dateTime = this.startedAt;
        int hashCode4 = (hashCode3 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Integer num = this.expectedQuantity;
        return ((((((((hashCode4 + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.failureScans)) * 31) + Integer.hashCode(this.successScans)) * 31) + Integer.hashCode(this.userFailureScans)) * 31) + Integer.hashCode(this.userSuccessScans);
    }

    public String toString() {
        String str = this.f68216id;
        String str2 = this.warehouseId;
        String str3 = this.description;
        DateTime dateTime = this.startedAt;
        Integer num = this.expectedQuantity;
        int i = this.failureScans;
        int i2 = this.successScans;
        int i3 = this.userFailureScans;
        int i4 = this.userSuccessScans;
        return "HardCountResponse(id=" + str + ", warehouseId=" + str2 + ", description=" + str3 + ", startedAt=" + dateTime + ", expectedQuantity=" + num + ", failureScans=" + i + ", successScans=" + i2 + ", userFailureScans=" + i3 + ", userSuccessScans=" + i4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int intValue;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f68216id);
        out.writeString(this.warehouseId);
        out.writeString(this.description);
        out.writeSerializable(this.startedAt);
        Integer num = this.expectedQuantity;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeInt(this.failureScans);
        out.writeInt(this.successScans);
        out.writeInt(this.userFailureScans);
        out.writeInt(this.userSuccessScans);
    }

    public HardCountResponse(String id, String str, String str2, DateTime dateTime, Integer num, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f68216id = id;
        this.warehouseId = str;
        this.description = str2;
        this.startedAt = dateTime;
        this.expectedQuantity = num;
        this.failureScans = i;
        this.successScans = i2;
        this.userFailureScans = i3;
        this.userSuccessScans = i4;
    }

    public /* synthetic */ HardCountResponse(String str, String str2, String str3, DateTime dateTime, Integer num, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? null : str2, (i5 & 4) != 0 ? null : str3, (i5 & 8) != 0 ? null : dateTime, (i5 & 16) == 0 ? num : null, (i5 & 32) != 0 ? 0 : i, (i5 & 64) != 0 ? 0 : i2, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) == 0 ? i4 : 0);
    }
}
