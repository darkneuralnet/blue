package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Settings;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\t\u0010<\u001a\u00020\u000bHÆ\u0003J\t\u0010=\u001a\u00020\u000bHÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J³\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001J\t\u0010@\u001a\u00020\u0006HÖ\u0001J\u0013\u0010A\u001a\u00020\u000b2\b\u0010B\u001a\u0004\u0018\u00010CHÖ\u0003J\t\u0010D\u001a\u00020\u0006HÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001J\u0019\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0016\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0016\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0016\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0016\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0016\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#¨\u0006K"}, m28432d2 = {"Lco/bird/android/model/DeliverySchedule;", "Landroid/os/Parcelable;", "id", "", "locationId", "cost", "", "currency", "location", "Lco/bird/android/model/DeliveryLocation;", "sunday", "", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "nextDeliveryAt", "Lorg/joda/time/DateTime;", "createdAt", "canceledAt", "availability", "Lco/bird/android/model/DeliveryAvailability;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lco/bird/android/model/DeliveryLocation;ZZZZZZZLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/DeliveryAvailability;)V", "getAvailability", "()Lco/bird/android/model/DeliveryAvailability;", "getCanceledAt", "()Lorg/joda/time/DateTime;", "getCost", "()I", "getCreatedAt", "getCurrency", "()Ljava/lang/String;", "getFriday", "()Z", "getId", "getLocation", "()Lco/bird/android/model/DeliveryLocation;", "getLocationId", "getMonday", "getNextDeliveryAt", "getSaturday", "getSunday", "getThursday", "getTuesday", "getWednesday", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DeliverySchedule implements Parcelable {
    public static final Parcelable.Creator<DeliverySchedule> CREATOR = new Creator();
    @JsonProperty("availability")
    @InterfaceC41208ft5("availability")
    private final DeliveryAvailability availability;
    @JsonProperty("canceled_at")
    @InterfaceC41208ft5("canceled_at")
    private final DateTime canceledAt;
    @JsonProperty("cost")
    @InterfaceC41208ft5("cost")
    private final int cost;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("friday")
    @InterfaceC41208ft5("friday")
    private final boolean friday;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66588id;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final DeliveryLocation location;
    @JsonProperty("location_id")
    @InterfaceC41208ft5("location_id")
    private final String locationId;
    @JsonProperty("monday")
    @InterfaceC41208ft5("monday")
    private final boolean monday;
    @JsonProperty("next_delivery_at")
    @InterfaceC41208ft5("next_delivery_at")
    private final DateTime nextDeliveryAt;
    @JsonProperty("saturday")
    @InterfaceC41208ft5("saturday")
    private final boolean saturday;
    @JsonProperty("sunday")
    @InterfaceC41208ft5("sunday")
    private final boolean sunday;
    @JsonProperty("thursday")
    @InterfaceC41208ft5("thursday")
    private final boolean thursday;
    @JsonProperty("tuesday")
    @InterfaceC41208ft5("tuesday")
    private final boolean tuesday;
    @JsonProperty("wednesday")
    @InterfaceC41208ft5("wednesday")
    private final boolean wednesday;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DeliverySchedule> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeliverySchedule createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeliverySchedule(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : DeliveryLocation.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readInt() == 0 ? null : DeliveryAvailability.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeliverySchedule[] newArray(int i) {
            return new DeliverySchedule[i];
        }
    }

    public DeliverySchedule() {
        this(null, null, 0, null, null, false, false, false, false, false, false, false, null, null, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    public final String component1() {
        return this.f66588id;
    }

    public final boolean component10() {
        return this.thursday;
    }

    public final boolean component11() {
        return this.friday;
    }

    public final boolean component12() {
        return this.saturday;
    }

    public final DateTime component13() {
        return this.nextDeliveryAt;
    }

    public final DateTime component14() {
        return this.createdAt;
    }

    public final DateTime component15() {
        return this.canceledAt;
    }

    public final DeliveryAvailability component16() {
        return this.availability;
    }

    public final String component2() {
        return this.locationId;
    }

    public final int component3() {
        return this.cost;
    }

    public final String component4() {
        return this.currency;
    }

    public final DeliveryLocation component5() {
        return this.location;
    }

    public final boolean component6() {
        return this.sunday;
    }

    public final boolean component7() {
        return this.monday;
    }

    public final boolean component8() {
        return this.tuesday;
    }

    public final boolean component9() {
        return this.wednesday;
    }

    public final DeliverySchedule copy(String id, String locationId, int i, String currency, DeliveryLocation deliveryLocation, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DeliveryAvailability deliveryAvailability) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new DeliverySchedule(id, locationId, i, currency, deliveryLocation, z, z2, z3, z4, z5, z6, z7, dateTime, dateTime2, dateTime3, deliveryAvailability);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeliverySchedule) {
            DeliverySchedule deliverySchedule = (DeliverySchedule) obj;
            return Intrinsics.areEqual(this.f66588id, deliverySchedule.f66588id) && Intrinsics.areEqual(this.locationId, deliverySchedule.locationId) && this.cost == deliverySchedule.cost && Intrinsics.areEqual(this.currency, deliverySchedule.currency) && Intrinsics.areEqual(this.location, deliverySchedule.location) && this.sunday == deliverySchedule.sunday && this.monday == deliverySchedule.monday && this.tuesday == deliverySchedule.tuesday && this.wednesday == deliverySchedule.wednesday && this.thursday == deliverySchedule.thursday && this.friday == deliverySchedule.friday && this.saturday == deliverySchedule.saturday && Intrinsics.areEqual(this.nextDeliveryAt, deliverySchedule.nextDeliveryAt) && Intrinsics.areEqual(this.createdAt, deliverySchedule.createdAt) && Intrinsics.areEqual(this.canceledAt, deliverySchedule.canceledAt) && this.availability == deliverySchedule.availability;
        }
        return false;
    }

    public final DeliveryAvailability getAvailability() {
        return this.availability;
    }

    public final DateTime getCanceledAt() {
        return this.canceledAt;
    }

    public final int getCost() {
        return this.cost;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final boolean getFriday() {
        return this.friday;
    }

    public final String getId() {
        return this.f66588id;
    }

    public final DeliveryLocation getLocation() {
        return this.location;
    }

    public final String getLocationId() {
        return this.locationId;
    }

    public final boolean getMonday() {
        return this.monday;
    }

    public final DateTime getNextDeliveryAt() {
        return this.nextDeliveryAt;
    }

    public final boolean getSaturday() {
        return this.saturday;
    }

    public final boolean getSunday() {
        return this.sunday;
    }

    public final boolean getThursday() {
        return this.thursday;
    }

    public final boolean getTuesday() {
        return this.tuesday;
    }

    public final boolean getWednesday() {
        return this.wednesday;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.f66588id.hashCode() * 31) + this.locationId.hashCode()) * 31) + Integer.hashCode(this.cost)) * 31) + this.currency.hashCode()) * 31;
        DeliveryLocation deliveryLocation = this.location;
        int hashCode2 = (hashCode + (deliveryLocation == null ? 0 : deliveryLocation.hashCode())) * 31;
        boolean z = this.sunday;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.monday;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.tuesday;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.wednesday;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.thursday;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        int i10 = (i8 + i9) * 31;
        boolean z6 = this.friday;
        int i11 = z6;
        if (z6 != 0) {
            i11 = 1;
        }
        int i12 = (i10 + i11) * 31;
        boolean z7 = this.saturday;
        int i13 = (i12 + (z7 ? 1 : z7 ? 1 : 0)) * 31;
        DateTime dateTime = this.nextDeliveryAt;
        int hashCode3 = (i13 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.createdAt;
        int hashCode4 = (hashCode3 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.canceledAt;
        int hashCode5 = (hashCode4 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        DeliveryAvailability deliveryAvailability = this.availability;
        return hashCode5 + (deliveryAvailability != null ? deliveryAvailability.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66588id;
        String str2 = this.locationId;
        int i = this.cost;
        String str3 = this.currency;
        DeliveryLocation deliveryLocation = this.location;
        boolean z = this.sunday;
        boolean z2 = this.monday;
        boolean z3 = this.tuesday;
        boolean z4 = this.wednesday;
        boolean z5 = this.thursday;
        boolean z6 = this.friday;
        boolean z7 = this.saturday;
        DateTime dateTime = this.nextDeliveryAt;
        DateTime dateTime2 = this.createdAt;
        DateTime dateTime3 = this.canceledAt;
        DeliveryAvailability deliveryAvailability = this.availability;
        return "DeliverySchedule(id=" + str + ", locationId=" + str2 + ", cost=" + i + ", currency=" + str3 + ", location=" + deliveryLocation + ", sunday=" + z + ", monday=" + z2 + ", tuesday=" + z3 + ", wednesday=" + z4 + ", thursday=" + z5 + ", friday=" + z6 + ", saturday=" + z7 + ", nextDeliveryAt=" + dateTime + ", createdAt=" + dateTime2 + ", canceledAt=" + dateTime3 + ", availability=" + deliveryAvailability + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66588id);
        out.writeString(this.locationId);
        out.writeInt(this.cost);
        out.writeString(this.currency);
        DeliveryLocation deliveryLocation = this.location;
        if (deliveryLocation == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            deliveryLocation.writeToParcel(out, i);
        }
        out.writeInt(this.sunday ? 1 : 0);
        out.writeInt(this.monday ? 1 : 0);
        out.writeInt(this.tuesday ? 1 : 0);
        out.writeInt(this.wednesday ? 1 : 0);
        out.writeInt(this.thursday ? 1 : 0);
        out.writeInt(this.friday ? 1 : 0);
        out.writeInt(this.saturday ? 1 : 0);
        out.writeSerializable(this.nextDeliveryAt);
        out.writeSerializable(this.createdAt);
        out.writeSerializable(this.canceledAt);
        DeliveryAvailability deliveryAvailability = this.availability;
        if (deliveryAvailability == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeString(deliveryAvailability.name());
    }

    public DeliverySchedule(String id, String locationId, int i, String currency, DeliveryLocation deliveryLocation, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DeliveryAvailability deliveryAvailability) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f66588id = id;
        this.locationId = locationId;
        this.cost = i;
        this.currency = currency;
        this.location = deliveryLocation;
        this.sunday = z;
        this.monday = z2;
        this.tuesday = z3;
        this.wednesday = z4;
        this.thursday = z5;
        this.friday = z6;
        this.saturday = z7;
        this.nextDeliveryAt = dateTime;
        this.createdAt = dateTime2;
        this.canceledAt = dateTime3;
        this.availability = deliveryAvailability;
    }

    public /* synthetic */ DeliverySchedule(String str, String str2, int i, String str3, DeliveryLocation deliveryLocation, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DeliveryAvailability deliveryAvailability, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) == 0 ? str2 : "", (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? Source.USD : str3, (i2 & 16) != 0 ? null : deliveryLocation, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? false : z4, (i2 & 512) != 0 ? false : z5, (i2 & 1024) != 0 ? false : z6, (i2 & 2048) == 0 ? z7 : false, (i2 & 4096) != 0 ? null : dateTime, (i2 & 8192) != 0 ? null : dateTime2, (i2 & 16384) != 0 ? null : dateTime3, (i2 & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : deliveryAvailability);
    }
}
