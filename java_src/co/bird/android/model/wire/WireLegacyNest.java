package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethod;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0011HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0006HÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00108\u001a\u00020\u000fHÆ\u0003J\u009d\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010:\u001a\u00020\nHÖ\u0001J\u0013\u0010;\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\nHÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\u0019\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\nHÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019¨\u0006E"}, m28432d2 = {"Lco/bird/android/model/wire/WireLegacyNest;", "Landroid/os/Parcelable;", "id", "", "zoneId", "location", "Lco/bird/android/model/wire/WireLocation;", "radius", "", "maxQuantity", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "notes", "formattedHours", "enabled", "", "createdAt", "Lorg/joda/time/DateTime;", "reviewedAt", "photos", "", "Lco/bird/android/model/wire/WireNestPhoto;", "creatorDisplayName", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;DILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getCreatorDisplayName", "getEnabled", "()Z", "getFormattedHours", "getId", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getMaxQuantity", "()I", "getNotes", "getPhotos", "()Ljava/util/List;", "getRadius", "()D", "getReviewedAt", "getZoneId", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireLegacyNest implements Parcelable {
    public static final Parcelable.Creator<WireLegacyNest> CREATOR = new Creator();
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    private final String address;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("creator_display_name")
    @InterfaceC41208ft5("creator_display_name")
    private final String creatorDisplayName;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("formatted_operational_hours")
    @InterfaceC41208ft5("formatted_operational_hours")
    private final String formattedHours;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66734id;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("max_quantity")
    @InterfaceC41208ft5("max_quantity")
    private final int maxQuantity;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("photos")
    @InterfaceC41208ft5("photos")
    private final List<WireNestPhoto> photos;
    @JsonProperty("radius")
    @InterfaceC41208ft5("radius")
    private final double radius;
    @JsonProperty("reviewed_at")
    @InterfaceC41208ft5("reviewed_at")
    private final DateTime reviewedAt;
    @JsonProperty("zone_id")
    @InterfaceC41208ft5("zone_id")
    private final String zoneId;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireLegacyNest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireLegacyNest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            WireLocation createFromParcel = WireLocation.CREATOR.createFromParcel(parcel);
            double readDouble = parcel.readDouble();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int i = 0;
            boolean z = parcel.readInt() != 0;
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (i != readInt2) {
                arrayList.add(WireNestPhoto.CREATOR.createFromParcel(parcel));
                i++;
                readInt2 = readInt2;
            }
            return new WireLegacyNest(readString, readString2, createFromParcel, readDouble, readInt, readString3, readString4, readString5, z, dateTime, dateTime2, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireLegacyNest[] newArray(int i) {
            return new WireLegacyNest[i];
        }
    }

    public WireLegacyNest() {
        this(null, null, null, 0.0d, 0, null, null, null, false, null, null, null, null, 8191, null);
    }

    public final String component1() {
        return this.f66734id;
    }

    public final DateTime component10() {
        return this.createdAt;
    }

    public final DateTime component11() {
        return this.reviewedAt;
    }

    public final List<WireNestPhoto> component12() {
        return this.photos;
    }

    public final String component13() {
        return this.creatorDisplayName;
    }

    public final String component2() {
        return this.zoneId;
    }

    public final WireLocation component3() {
        return this.location;
    }

    public final double component4() {
        return this.radius;
    }

    public final int component5() {
        return this.maxQuantity;
    }

    public final String component6() {
        return this.address;
    }

    public final String component7() {
        return this.notes;
    }

    public final String component8() {
        return this.formattedHours;
    }

    public final boolean component9() {
        return this.enabled;
    }

    public final WireLegacyNest copy(String id, String str, WireLocation location, double d, int i, String str2, String str3, String str4, boolean z, DateTime createdAt, DateTime dateTime, List<WireNestPhoto> photos, String str5) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(photos, "photos");
        return new WireLegacyNest(id, str, location, d, i, str2, str3, str4, z, createdAt, dateTime, photos, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireLegacyNest) {
            WireLegacyNest wireLegacyNest = (WireLegacyNest) obj;
            return Intrinsics.areEqual(this.f66734id, wireLegacyNest.f66734id) && Intrinsics.areEqual(this.zoneId, wireLegacyNest.zoneId) && Intrinsics.areEqual(this.location, wireLegacyNest.location) && Double.compare(this.radius, wireLegacyNest.radius) == 0 && this.maxQuantity == wireLegacyNest.maxQuantity && Intrinsics.areEqual(this.address, wireLegacyNest.address) && Intrinsics.areEqual(this.notes, wireLegacyNest.notes) && Intrinsics.areEqual(this.formattedHours, wireLegacyNest.formattedHours) && this.enabled == wireLegacyNest.enabled && Intrinsics.areEqual(this.createdAt, wireLegacyNest.createdAt) && Intrinsics.areEqual(this.reviewedAt, wireLegacyNest.reviewedAt) && Intrinsics.areEqual(this.photos, wireLegacyNest.photos) && Intrinsics.areEqual(this.creatorDisplayName, wireLegacyNest.creatorDisplayName);
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getCreatorDisplayName() {
        return this.creatorDisplayName;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getFormattedHours() {
        return this.formattedHours;
    }

    public final String getId() {
        return this.f66734id;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final int getMaxQuantity() {
        return this.maxQuantity;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final List<WireNestPhoto> getPhotos() {
        return this.photos;
    }

    public final double getRadius() {
        return this.radius;
    }

    public final DateTime getReviewedAt() {
        return this.reviewedAt;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66734id.hashCode() * 31;
        String str = this.zoneId;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.location.hashCode()) * 31) + Double.hashCode(this.radius)) * 31) + Integer.hashCode(this.maxQuantity)) * 31;
        String str2 = this.address;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.notes;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.formattedHours;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z = this.enabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode6 = (((hashCode5 + i) * 31) + this.createdAt.hashCode()) * 31;
        DateTime dateTime = this.reviewedAt;
        int hashCode7 = (((hashCode6 + (dateTime == null ? 0 : dateTime.hashCode())) * 31) + this.photos.hashCode()) * 31;
        String str5 = this.creatorDisplayName;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66734id;
        String str2 = this.zoneId;
        WireLocation wireLocation = this.location;
        double d = this.radius;
        int i = this.maxQuantity;
        String str3 = this.address;
        String str4 = this.notes;
        String str5 = this.formattedHours;
        boolean z = this.enabled;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.reviewedAt;
        List<WireNestPhoto> list = this.photos;
        String str6 = this.creatorDisplayName;
        return "WireLegacyNest(id=" + str + ", zoneId=" + str2 + ", location=" + wireLocation + ", radius=" + d + ", maxQuantity=" + i + ", address=" + str3 + ", notes=" + str4 + ", formattedHours=" + str5 + ", enabled=" + z + ", createdAt=" + dateTime + ", reviewedAt=" + dateTime2 + ", photos=" + list + ", creatorDisplayName=" + str6 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66734id);
        out.writeString(this.zoneId);
        this.location.writeToParcel(out, i);
        out.writeDouble(this.radius);
        out.writeInt(this.maxQuantity);
        out.writeString(this.address);
        out.writeString(this.notes);
        out.writeString(this.formattedHours);
        out.writeInt(this.enabled ? 1 : 0);
        out.writeSerializable(this.createdAt);
        out.writeSerializable(this.reviewedAt);
        List<WireNestPhoto> list = this.photos;
        out.writeInt(list.size());
        for (WireNestPhoto wireNestPhoto : list) {
            wireNestPhoto.writeToParcel(out, i);
        }
        out.writeString(this.creatorDisplayName);
    }

    public WireLegacyNest(String id, String str, WireLocation location, double d, int i, String str2, String str3, String str4, boolean z, DateTime createdAt, DateTime dateTime, List<WireNestPhoto> photos, String str5) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(photos, "photos");
        this.f66734id = id;
        this.zoneId = str;
        this.location = location;
        this.radius = d;
        this.maxQuantity = i;
        this.address = str2;
        this.notes = str3;
        this.formattedHours = str4;
        this.enabled = z;
        this.createdAt = createdAt;
        this.reviewedAt = dateTime;
        this.photos = photos;
        this.creatorDisplayName = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireLegacyNest(String str, String str2, WireLocation wireLocation, double d, int i, String str3, String str4, String str5, boolean z, DateTime dateTime, DateTime dateTime2, List list, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r2, r4, r5, r7, r8, r9, r10, r11, r12, (i2 & 1024) != 0 ? null : dateTime2, (i2 & 2048) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 4096) == 0 ? str6 : null);
        DateTime dateTime3;
        String str7 = (i2 & 1) != 0 ? "" : str;
        String str8 = (i2 & 2) != 0 ? null : str2;
        WireLocation wireLocation2 = (i2 & 4) != 0 ? new WireLocation(0.0d, 0.0d, null, null, null, null, false, null, null, 511, null) : wireLocation;
        double d2 = (i2 & 8) != 0 ? 9.33d : d;
        int i3 = (i2 & 16) != 0 ? 3 : i;
        String str9 = (i2 & 32) != 0 ? null : str3;
        String str10 = (i2 & 64) != 0 ? null : str4;
        String str11 = (i2 & 128) != 0 ? null : str5;
        boolean z2 = (i2 & 256) != 0 ? true : z;
        if ((i2 & 512) != 0) {
            dateTime3 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime3, "now()");
        } else {
            dateTime3 = dateTime;
        }
    }
}
