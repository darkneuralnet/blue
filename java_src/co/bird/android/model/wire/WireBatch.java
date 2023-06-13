package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/wire/WireBatch;", "Landroid/os/Parcelable;", "id", "", "description", "warehouseId", "createdAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getDescription", "()Ljava/lang/String;", "getId", "getWarehouseId", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireBatch implements Parcelable {
    public static final Parcelable.Creator<WireBatch> CREATOR = new Creator();
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66716id;
    @JsonProperty("warehouse_id")
    @InterfaceC41208ft5("warehouse_id")
    private final String warehouseId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireBatch> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBatch createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireBatch(parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireBatch[] newArray(int i) {
            return new WireBatch[i];
        }
    }

    public WireBatch() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ WireBatch copy$default(WireBatch wireBatch, String str, String str2, String str3, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireBatch.f66716id;
        }
        if ((i & 2) != 0) {
            str2 = wireBatch.description;
        }
        if ((i & 4) != 0) {
            str3 = wireBatch.warehouseId;
        }
        if ((i & 8) != 0) {
            dateTime = wireBatch.createdAt;
        }
        return wireBatch.copy(str, str2, str3, dateTime);
    }

    public final String component1() {
        return this.f66716id;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.warehouseId;
    }

    public final DateTime component4() {
        return this.createdAt;
    }

    public final WireBatch copy(String id, String description, String str, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        return new WireBatch(id, description, str, createdAt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireBatch) {
            WireBatch wireBatch = (WireBatch) obj;
            return Intrinsics.areEqual(this.f66716id, wireBatch.f66716id) && Intrinsics.areEqual(this.description, wireBatch.description) && Intrinsics.areEqual(this.warehouseId, wireBatch.warehouseId) && Intrinsics.areEqual(this.createdAt, wireBatch.createdAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f66716id;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public int hashCode() {
        int hashCode = ((this.f66716id.hashCode() * 31) + this.description.hashCode()) * 31;
        String str = this.warehouseId;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.createdAt.hashCode();
    }

    public String toString() {
        String str = this.f66716id;
        String str2 = this.description;
        String str3 = this.warehouseId;
        DateTime dateTime = this.createdAt;
        return "WireBatch(id=" + str + ", description=" + str2 + ", warehouseId=" + str3 + ", createdAt=" + dateTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66716id);
        out.writeString(this.description);
        out.writeString(this.warehouseId);
        out.writeSerializable(this.createdAt);
    }

    public WireBatch(String id, String description, String str, DateTime createdAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        this.f66716id = id;
        this.description = description;
        this.warehouseId = str;
        this.createdAt = createdAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireBatch(String str, String str2, String str3, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, dateTime);
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        str3 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
