package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006("}, m28432d2 = {"Lco/bird/android/model/BirdInspectionPoint;", "Landroid/os/Parcelable;", "id", "", "area", "item", "enabled", "", "createdAt", "Lorg/joda/time/DateTime;", "mobileId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/joda/time/DateTime;Ljava/lang/String;)V", "getArea", "()Ljava/lang/String;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getEnabled", "()Z", "getId", "getItem", "getMobileId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdInspectionPoint implements Parcelable {
    public static final Parcelable.Creator<BirdInspectionPoint> CREATOR = new Creator();
    @JsonProperty("area")
    @InterfaceC41208ft5("area")
    private final String area;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66573id;
    @JsonProperty("item")
    @InterfaceC41208ft5("item")
    private final String item;
    @JsonProperty("mobile_id")
    @InterfaceC41208ft5("mobile_id")
    private final String mobileId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<BirdInspectionPoint> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BirdInspectionPoint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BirdInspectionPoint(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (DateTime) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BirdInspectionPoint[] newArray(int i) {
            return new BirdInspectionPoint[i];
        }
    }

    public BirdInspectionPoint() {
        this(null, null, null, false, null, null, 63, null);
    }

    public static /* synthetic */ BirdInspectionPoint copy$default(BirdInspectionPoint birdInspectionPoint, String str, String str2, String str3, boolean z, DateTime dateTime, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = birdInspectionPoint.f66573id;
        }
        if ((i & 2) != 0) {
            str2 = birdInspectionPoint.area;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = birdInspectionPoint.item;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            z = birdInspectionPoint.enabled;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            dateTime = birdInspectionPoint.createdAt;
        }
        DateTime dateTime2 = dateTime;
        if ((i & 32) != 0) {
            str4 = birdInspectionPoint.mobileId;
        }
        return birdInspectionPoint.copy(str, str5, str6, z2, dateTime2, str4);
    }

    public final String component1() {
        return this.f66573id;
    }

    public final String component2() {
        return this.area;
    }

    public final String component3() {
        return this.item;
    }

    public final boolean component4() {
        return this.enabled;
    }

    public final DateTime component5() {
        return this.createdAt;
    }

    public final String component6() {
        return this.mobileId;
    }

    public final BirdInspectionPoint copy(String id, String area, String item, boolean z, DateTime createdAt, String mobileId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(mobileId, "mobileId");
        return new BirdInspectionPoint(id, area, item, z, createdAt, mobileId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdInspectionPoint) {
            BirdInspectionPoint birdInspectionPoint = (BirdInspectionPoint) obj;
            return Intrinsics.areEqual(this.f66573id, birdInspectionPoint.f66573id) && Intrinsics.areEqual(this.area, birdInspectionPoint.area) && Intrinsics.areEqual(this.item, birdInspectionPoint.item) && this.enabled == birdInspectionPoint.enabled && Intrinsics.areEqual(this.createdAt, birdInspectionPoint.createdAt) && Intrinsics.areEqual(this.mobileId, birdInspectionPoint.mobileId);
        }
        return false;
    }

    public final String getArea() {
        return this.area;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getId() {
        return this.f66573id;
    }

    public final String getItem() {
        return this.item;
    }

    public final String getMobileId() {
        return this.mobileId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f66573id.hashCode() * 31) + this.area.hashCode()) * 31) + this.item.hashCode()) * 31;
        boolean z = this.enabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((((hashCode + i) * 31) + this.createdAt.hashCode()) * 31) + this.mobileId.hashCode();
    }

    public String toString() {
        String str = this.f66573id;
        String str2 = this.area;
        String str3 = this.item;
        boolean z = this.enabled;
        DateTime dateTime = this.createdAt;
        String str4 = this.mobileId;
        return "BirdInspectionPoint(id=" + str + ", area=" + str2 + ", item=" + str3 + ", enabled=" + z + ", createdAt=" + dateTime + ", mobileId=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66573id);
        out.writeString(this.area);
        out.writeString(this.item);
        out.writeInt(this.enabled ? 1 : 0);
        out.writeSerializable(this.createdAt);
        out.writeString(this.mobileId);
    }

    public BirdInspectionPoint(String id, String area, String item, boolean z, DateTime createdAt, String mobileId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(area, "area");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(mobileId, "mobileId");
        this.f66573id = id;
        this.area = area;
        this.item = item;
        this.enabled = z;
        this.createdAt = createdAt;
        this.mobileId = mobileId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ BirdInspectionPoint(String str, String str2, String str3, boolean z, DateTime dateTime, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r13, r1, r2, r3, dateTime, (i & 32) != 0 ? "" : str4);
        String str5 = (i & 1) != 0 ? "" : str;
        String str6 = (i & 2) != 0 ? "" : str2;
        String str7 = (i & 4) != 0 ? "" : str3;
        boolean z2 = (i & 8) != 0 ? true : z;
        if ((i & 16) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
