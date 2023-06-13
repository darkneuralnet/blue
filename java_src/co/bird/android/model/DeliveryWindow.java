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
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016JZ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010#J\t\u0010$\u001a\u00020\bHÖ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\bHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\bHÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u00060"}, m28432d2 = {"Lco/bird/android/model/DeliveryWindow;", "Landroid/os/Parcelable;", "id", "", "start", "Lorg/joda/time/DateTime;", "end", "rentalPeriodDays", "", PaymentMethod.BillingDetails.PARAM_ADDRESS, "location", "Lco/bird/android/model/wire/WireLocation;", "onDemandEstimatedTime", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILjava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/Integer;)V", "getAddress", "()Ljava/lang/String;", "getEnd", "()Lorg/joda/time/DateTime;", "getId", "getLocation", "()Lco/bird/android/model/wire/WireLocation;", "getOnDemandEstimatedTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRentalPeriodDays", "()I", "getStart", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILjava/lang/String;Lco/bird/android/model/wire/WireLocation;Ljava/lang/Integer;)Lco/bird/android/model/DeliveryWindow;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DeliveryWindow implements Parcelable {
    public static final Parcelable.Creator<DeliveryWindow> CREATOR = new Creator();
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    private final String address;
    @JsonProperty("window_end_at")
    @InterfaceC41208ft5("window_end_at")
    private final DateTime end;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66589id;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final WireLocation location;
    @JsonProperty("on_demand_estimated_time")
    @InterfaceC41208ft5("on_demand_estimated_time")
    private final Integer onDemandEstimatedTime;
    @JsonProperty("rental_period_days")
    @InterfaceC41208ft5("rental_period_days")
    private final int rentalPeriodDays;
    @JsonProperty("window_start_at")
    @InterfaceC41208ft5("window_start_at")
    private final DateTime start;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<DeliveryWindow> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeliveryWindow createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeliveryWindow(parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), parcel.readInt(), parcel.readString(), (WireLocation) parcel.readParcelable(DeliveryWindow.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeliveryWindow[] newArray(int i) {
            return new DeliveryWindow[i];
        }
    }

    public DeliveryWindow() {
        this(null, null, null, 0, null, null, null, 127, null);
    }

    public static /* synthetic */ DeliveryWindow copy$default(DeliveryWindow deliveryWindow, String str, DateTime dateTime, DateTime dateTime2, int i, String str2, WireLocation wireLocation, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deliveryWindow.f66589id;
        }
        if ((i2 & 2) != 0) {
            dateTime = deliveryWindow.start;
        }
        DateTime dateTime3 = dateTime;
        if ((i2 & 4) != 0) {
            dateTime2 = deliveryWindow.end;
        }
        DateTime dateTime4 = dateTime2;
        if ((i2 & 8) != 0) {
            i = deliveryWindow.rentalPeriodDays;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str2 = deliveryWindow.address;
        }
        String str3 = str2;
        if ((i2 & 32) != 0) {
            wireLocation = deliveryWindow.location;
        }
        WireLocation wireLocation2 = wireLocation;
        if ((i2 & 64) != 0) {
            num = deliveryWindow.onDemandEstimatedTime;
        }
        return deliveryWindow.copy(str, dateTime3, dateTime4, i3, str3, wireLocation2, num);
    }

    public final String component1() {
        return this.f66589id;
    }

    public final DateTime component2() {
        return this.start;
    }

    public final DateTime component3() {
        return this.end;
    }

    public final int component4() {
        return this.rentalPeriodDays;
    }

    public final String component5() {
        return this.address;
    }

    public final WireLocation component6() {
        return this.location;
    }

    public final Integer component7() {
        return this.onDemandEstimatedTime;
    }

    public final DeliveryWindow copy(String id, DateTime start, DateTime end, int i, String str, WireLocation wireLocation, Integer num) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        return new DeliveryWindow(id, start, end, i, str, wireLocation, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeliveryWindow) {
            DeliveryWindow deliveryWindow = (DeliveryWindow) obj;
            return Intrinsics.areEqual(this.f66589id, deliveryWindow.f66589id) && Intrinsics.areEqual(this.start, deliveryWindow.start) && Intrinsics.areEqual(this.end, deliveryWindow.end) && this.rentalPeriodDays == deliveryWindow.rentalPeriodDays && Intrinsics.areEqual(this.address, deliveryWindow.address) && Intrinsics.areEqual(this.location, deliveryWindow.location) && Intrinsics.areEqual(this.onDemandEstimatedTime, deliveryWindow.onDemandEstimatedTime);
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final DateTime getEnd() {
        return this.end;
    }

    public final String getId() {
        return this.f66589id;
    }

    public final WireLocation getLocation() {
        return this.location;
    }

    public final Integer getOnDemandEstimatedTime() {
        return this.onDemandEstimatedTime;
    }

    public final int getRentalPeriodDays() {
        return this.rentalPeriodDays;
    }

    public final DateTime getStart() {
        return this.start;
    }

    public int hashCode() {
        int hashCode = ((((((this.f66589id.hashCode() * 31) + this.start.hashCode()) * 31) + this.end.hashCode()) * 31) + Integer.hashCode(this.rentalPeriodDays)) * 31;
        String str = this.address;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        WireLocation wireLocation = this.location;
        int hashCode3 = (hashCode2 + (wireLocation == null ? 0 : wireLocation.hashCode())) * 31;
        Integer num = this.onDemandEstimatedTime;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66589id;
        DateTime dateTime = this.start;
        DateTime dateTime2 = this.end;
        int i = this.rentalPeriodDays;
        String str2 = this.address;
        WireLocation wireLocation = this.location;
        Integer num = this.onDemandEstimatedTime;
        return "DeliveryWindow(id=" + str + ", start=" + dateTime + ", end=" + dateTime2 + ", rentalPeriodDays=" + i + ", address=" + str2 + ", location=" + wireLocation + ", onDemandEstimatedTime=" + num + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        int intValue;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66589id);
        out.writeSerializable(this.start);
        out.writeSerializable(this.end);
        out.writeInt(this.rentalPeriodDays);
        out.writeString(this.address);
        out.writeParcelable(this.location, i);
        Integer num = this.onDemandEstimatedTime;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }

    public DeliveryWindow(String id, DateTime start, DateTime end, int i, String str, WireLocation wireLocation, Integer num) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.f66589id = id;
        this.start = start;
        this.end = end;
        this.rentalPeriodDays = i;
        this.address = str;
        this.location = wireLocation;
        this.onDemandEstimatedTime = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DeliveryWindow(String str, DateTime dateTime, DateTime dateTime2, int i, String str2, WireLocation wireLocation, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, r14, dateTime2, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : wireLocation, (i2 & 64) != 0 ? null : num);
        str = (i2 & 1) != 0 ? "" : str;
        if ((i2 & 2) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime3 = dateTime;
        if ((i2 & 4) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
    }
}
