package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.wire.WireLocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J«\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\t\u00108\u001a\u000209HÖ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u000209HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\u0019\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u000209HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006E"}, m28432d2 = {"Lco/bird/android/model/Delivery;", "Landroid/os/Parcelable;", "id", "", "location", "Lco/bird/android/model/wire/WireLocation;", "notes", PaymentMethod.BillingDetails.PARAM_ADDRESS, "photoUrl", "dropAt", "Lorg/joda/time/DateTime;", "createdAt", "releaseLocation", "releasePhotoUrl", "releasedAt", "canceledAt", "routeId", "user", "Lco/bird/android/model/User;", "schedule", "Lco/bird/android/model/DeliverySchedule;", "(Ljava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/wire/WireLocation;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Lco/bird/android/model/User;Lco/bird/android/model/DeliverySchedule;)V", "getAddress", "()Ljava/lang/String;", "getCanceledAt", "()Lorg/joda/time/DateTime;", "getCreatedAt", "getDropAt", "getId", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getNotes", "getPhotoUrl", "getReleaseLocation", "getReleasePhotoUrl", "getReleasedAt", "getRouteId", "getSchedule", "()Lco/bird/android/model/DeliverySchedule;", "getUser", "()Lco/bird/android/model/User;", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Delivery implements Parcelable {
    public static final Parcelable.Creator<Delivery> CREATOR = new Creator();
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    private final String address;
    @JsonProperty("canceled_at")
    @InterfaceC41208ft5("canceled_at")
    private final DateTime canceledAt;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("drop_at")
    @InterfaceC41208ft5("drop_at")
    private final DateTime dropAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66585id;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;
    @JsonProperty("photo_url")
    @InterfaceC41208ft5("photo_url")
    private final String photoUrl;
    @JsonProperty("release_location")
    @InterfaceC41208ft5("release_location")
    private final WireLocation releaseLocation;
    @JsonProperty("release_photo_url")
    @InterfaceC41208ft5("release_photo_url")
    private final String releasePhotoUrl;
    @JsonProperty("released_at")
    @InterfaceC41208ft5("released_at")
    private final DateTime releasedAt;
    @JsonProperty("route_id")
    @InterfaceC41208ft5("route_id")
    private final String routeId;
    @JsonProperty("schedule")
    @InterfaceC41208ft5("schedule")
    private final DeliverySchedule schedule;
    @JsonProperty("user")
    @InterfaceC41208ft5("user")
    private final User user;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<Delivery> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Delivery createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Delivery(parcel.readString(), (WireLocation) parcel.readParcelable(Delivery.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (WireLocation) parcel.readParcelable(Delivery.class.getClassLoader()), parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : User.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DeliverySchedule.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Delivery[] newArray(int i) {
            return new Delivery[i];
        }
    }

    public Delivery() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final String component1() {
        return this.f66585id;
    }

    public final DateTime component10() {
        return this.releasedAt;
    }

    public final DateTime component11() {
        return this.canceledAt;
    }

    public final String component12() {
        return this.routeId;
    }

    public final User component13() {
        return this.user;
    }

    public final DeliverySchedule component14() {
        return this.schedule;
    }

    public final WireLocation component2() {
        return this.location;
    }

    public final String component3() {
        return this.notes;
    }

    public final String component4() {
        return this.address;
    }

    public final String component5() {
        return this.photoUrl;
    }

    public final DateTime component6() {
        return this.dropAt;
    }

    public final DateTime component7() {
        return this.createdAt;
    }

    public final WireLocation component8() {
        return this.releaseLocation;
    }

    public final String component9() {
        return this.releasePhotoUrl;
    }

    public final Delivery copy(String id, WireLocation location, String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, WireLocation wireLocation, String str4, DateTime dateTime3, DateTime dateTime4, String routeId, User user, DeliverySchedule deliverySchedule) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        return new Delivery(id, location, str, str2, str3, dateTime, dateTime2, wireLocation, str4, dateTime3, dateTime4, routeId, user, deliverySchedule);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Delivery) {
            Delivery delivery = (Delivery) obj;
            return Intrinsics.areEqual(this.f66585id, delivery.f66585id) && Intrinsics.areEqual(this.location, delivery.location) && Intrinsics.areEqual(this.notes, delivery.notes) && Intrinsics.areEqual(this.address, delivery.address) && Intrinsics.areEqual(this.photoUrl, delivery.photoUrl) && Intrinsics.areEqual(this.dropAt, delivery.dropAt) && Intrinsics.areEqual(this.createdAt, delivery.createdAt) && Intrinsics.areEqual(this.releaseLocation, delivery.releaseLocation) && Intrinsics.areEqual(this.releasePhotoUrl, delivery.releasePhotoUrl) && Intrinsics.areEqual(this.releasedAt, delivery.releasedAt) && Intrinsics.areEqual(this.canceledAt, delivery.canceledAt) && Intrinsics.areEqual(this.routeId, delivery.routeId) && Intrinsics.areEqual(this.user, delivery.user) && Intrinsics.areEqual(this.schedule, delivery.schedule);
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final DateTime getCanceledAt() {
        return this.canceledAt;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final DateTime getDropAt() {
        return this.dropAt;
    }

    public final String getId() {
        return this.f66585id;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final WireLocation getReleaseLocation() {
        return this.releaseLocation;
    }

    public final String getReleasePhotoUrl() {
        return this.releasePhotoUrl;
    }

    public final DateTime getReleasedAt() {
        return this.releasedAt;
    }

    public final String getRouteId() {
        return this.routeId;
    }

    public final DeliverySchedule getSchedule() {
        return this.schedule;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode = ((this.f66585id.hashCode() * 31) + this.location.hashCode()) * 31;
        String str = this.notes;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.address;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photoUrl;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DateTime dateTime = this.dropAt;
        int hashCode5 = (hashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.createdAt;
        int hashCode6 = (hashCode5 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        WireLocation wireLocation = this.releaseLocation;
        int hashCode7 = (hashCode6 + (wireLocation == null ? 0 : wireLocation.hashCode())) * 31;
        String str4 = this.releasePhotoUrl;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DateTime dateTime3 = this.releasedAt;
        int hashCode9 = (hashCode8 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        DateTime dateTime4 = this.canceledAt;
        int hashCode10 = (((hashCode9 + (dateTime4 == null ? 0 : dateTime4.hashCode())) * 31) + this.routeId.hashCode()) * 31;
        User user = this.user;
        int hashCode11 = (hashCode10 + (user == null ? 0 : user.hashCode())) * 31;
        DeliverySchedule deliverySchedule = this.schedule;
        return hashCode11 + (deliverySchedule != null ? deliverySchedule.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66585id;
        WireLocation wireLocation = this.location;
        String str2 = this.notes;
        String str3 = this.address;
        String str4 = this.photoUrl;
        DateTime dateTime = this.dropAt;
        DateTime dateTime2 = this.createdAt;
        WireLocation wireLocation2 = this.releaseLocation;
        String str5 = this.releasePhotoUrl;
        DateTime dateTime3 = this.releasedAt;
        DateTime dateTime4 = this.canceledAt;
        String str6 = this.routeId;
        User user = this.user;
        DeliverySchedule deliverySchedule = this.schedule;
        return "Delivery(id=" + str + ", location=" + wireLocation + ", notes=" + str2 + ", address=" + str3 + ", photoUrl=" + str4 + ", dropAt=" + dateTime + ", createdAt=" + dateTime2 + ", releaseLocation=" + wireLocation2 + ", releasePhotoUrl=" + str5 + ", releasedAt=" + dateTime3 + ", canceledAt=" + dateTime4 + ", routeId=" + str6 + ", user=" + user + ", schedule=" + deliverySchedule + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66585id);
        out.writeParcelable(this.location, i);
        out.writeString(this.notes);
        out.writeString(this.address);
        out.writeString(this.photoUrl);
        out.writeSerializable(this.dropAt);
        out.writeSerializable(this.createdAt);
        out.writeParcelable(this.releaseLocation, i);
        out.writeString(this.releasePhotoUrl);
        out.writeSerializable(this.releasedAt);
        out.writeSerializable(this.canceledAt);
        out.writeString(this.routeId);
        User user = this.user;
        if (user == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            user.writeToParcel(out, i);
        }
        DeliverySchedule deliverySchedule = this.schedule;
        if (deliverySchedule == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        deliverySchedule.writeToParcel(out, i);
    }

    public Delivery(String id, WireLocation location, String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, WireLocation wireLocation, String str4, DateTime dateTime3, DateTime dateTime4, String routeId, User user, DeliverySchedule deliverySchedule) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        this.f66585id = id;
        this.location = location;
        this.notes = str;
        this.address = str2;
        this.photoUrl = str3;
        this.dropAt = dateTime;
        this.createdAt = dateTime2;
        this.releaseLocation = wireLocation;
        this.releasePhotoUrl = str4;
        this.releasedAt = dateTime3;
        this.canceledAt = dateTime4;
        this.routeId = routeId;
        this.user = user;
        this.schedule = deliverySchedule;
    }

    public /* synthetic */ Delivery(String str, WireLocation wireLocation, String str2, String str3, String str4, DateTime dateTime, DateTime dateTime2, WireLocation wireLocation2, String str5, DateTime dateTime3, DateTime dateTime4, String str6, User user, DeliverySchedule deliverySchedule, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new WireLocation(0.0d, 0.0d, null, null, null, null, false, null, null, 508, null) : wireLocation, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : dateTime, (i & 64) != 0 ? null : dateTime2, (i & 128) != 0 ? null : wireLocation2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : dateTime3, (i & 1024) != 0 ? null : dateTime4, (i & 2048) == 0 ? str6 : "", (i & 4096) != 0 ? null : user, (i & 8192) == 0 ? deliverySchedule : null);
    }
}
