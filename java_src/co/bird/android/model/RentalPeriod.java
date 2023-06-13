package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u001eHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006*"}, m28432d2 = {"Lco/bird/android/model/RentalPeriod;", "Landroid/os/Parcelable;", "id", "", "longTermRentalId", "transactionId", "createdAt", "Lorg/joda/time/DateTime;", "updatedAt", "serviceStartsAt", "serviceEndsAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getId", "()Ljava/lang/String;", "getLongTermRentalId", "getServiceEndsAt", "getServiceStartsAt", "getTransactionId", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RentalPeriod implements Parcelable {
    public static final Parcelable.Creator<RentalPeriod> CREATOR = new Creator();
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66619id;
    @JsonProperty("long_term_rental_id")
    @InterfaceC41208ft5("long_term_rental_id")
    private final String longTermRentalId;
    @JsonProperty("service_ends_at")
    @InterfaceC41208ft5("service_ends_at")
    private final DateTime serviceEndsAt;
    @JsonProperty("service_starts_at")
    @InterfaceC41208ft5("service_starts_at")
    private final DateTime serviceStartsAt;
    @JsonProperty("transaction_id")
    @InterfaceC41208ft5("transaction_id")
    private final String transactionId;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<RentalPeriod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RentalPeriod createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RentalPeriod(parcel.readString(), parcel.readString(), parcel.readString(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable(), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RentalPeriod[] newArray(int i) {
            return new RentalPeriod[i];
        }
    }

    public RentalPeriod() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ RentalPeriod copy$default(RentalPeriod rentalPeriod, String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rentalPeriod.f66619id;
        }
        if ((i & 2) != 0) {
            str2 = rentalPeriod.longTermRentalId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = rentalPeriod.transactionId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            dateTime = rentalPeriod.createdAt;
        }
        DateTime dateTime5 = dateTime;
        if ((i & 16) != 0) {
            dateTime2 = rentalPeriod.updatedAt;
        }
        DateTime dateTime6 = dateTime2;
        if ((i & 32) != 0) {
            dateTime3 = rentalPeriod.serviceStartsAt;
        }
        DateTime dateTime7 = dateTime3;
        if ((i & 64) != 0) {
            dateTime4 = rentalPeriod.serviceEndsAt;
        }
        return rentalPeriod.copy(str, str4, str5, dateTime5, dateTime6, dateTime7, dateTime4);
    }

    public final String component1() {
        return this.f66619id;
    }

    public final String component2() {
        return this.longTermRentalId;
    }

    public final String component3() {
        return this.transactionId;
    }

    public final DateTime component4() {
        return this.createdAt;
    }

    public final DateTime component5() {
        return this.updatedAt;
    }

    public final DateTime component6() {
        return this.serviceStartsAt;
    }

    public final DateTime component7() {
        return this.serviceEndsAt;
    }

    public final RentalPeriod copy(String id, String longTermRentalId, String transactionId, DateTime createdAt, DateTime updatedAt, DateTime serviceStartsAt, DateTime serviceEndsAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(longTermRentalId, "longTermRentalId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(serviceStartsAt, "serviceStartsAt");
        Intrinsics.checkNotNullParameter(serviceEndsAt, "serviceEndsAt");
        return new RentalPeriod(id, longTermRentalId, transactionId, createdAt, updatedAt, serviceStartsAt, serviceEndsAt);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RentalPeriod) {
            RentalPeriod rentalPeriod = (RentalPeriod) obj;
            return Intrinsics.areEqual(this.f66619id, rentalPeriod.f66619id) && Intrinsics.areEqual(this.longTermRentalId, rentalPeriod.longTermRentalId) && Intrinsics.areEqual(this.transactionId, rentalPeriod.transactionId) && Intrinsics.areEqual(this.createdAt, rentalPeriod.createdAt) && Intrinsics.areEqual(this.updatedAt, rentalPeriod.updatedAt) && Intrinsics.areEqual(this.serviceStartsAt, rentalPeriod.serviceStartsAt) && Intrinsics.areEqual(this.serviceEndsAt, rentalPeriod.serviceEndsAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.f66619id;
    }

    public final String getLongTermRentalId() {
        return this.longTermRentalId;
    }

    public final DateTime getServiceEndsAt() {
        return this.serviceEndsAt;
    }

    public final DateTime getServiceStartsAt() {
        return this.serviceStartsAt;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return (((((((((((this.f66619id.hashCode() * 31) + this.longTermRentalId.hashCode()) * 31) + this.transactionId.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.serviceStartsAt.hashCode()) * 31) + this.serviceEndsAt.hashCode();
    }

    public String toString() {
        String str = this.f66619id;
        String str2 = this.longTermRentalId;
        String str3 = this.transactionId;
        DateTime dateTime = this.createdAt;
        DateTime dateTime2 = this.updatedAt;
        DateTime dateTime3 = this.serviceStartsAt;
        DateTime dateTime4 = this.serviceEndsAt;
        return "RentalPeriod(id=" + str + ", longTermRentalId=" + str2 + ", transactionId=" + str3 + ", createdAt=" + dateTime + ", updatedAt=" + dateTime2 + ", serviceStartsAt=" + dateTime3 + ", serviceEndsAt=" + dateTime4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66619id);
        out.writeString(this.longTermRentalId);
        out.writeString(this.transactionId);
        out.writeSerializable(this.createdAt);
        out.writeSerializable(this.updatedAt);
        out.writeSerializable(this.serviceStartsAt);
        out.writeSerializable(this.serviceEndsAt);
    }

    public RentalPeriod(String id, String longTermRentalId, String transactionId, DateTime createdAt, DateTime updatedAt, DateTime serviceStartsAt, DateTime serviceEndsAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(longTermRentalId, "longTermRentalId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(serviceStartsAt, "serviceStartsAt");
        Intrinsics.checkNotNullParameter(serviceEndsAt, "serviceEndsAt");
        this.f66619id = id;
        this.longTermRentalId = longTermRentalId;
        this.transactionId = transactionId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.serviceStartsAt = serviceStartsAt;
        this.serviceEndsAt = serviceEndsAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RentalPeriod(String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r14, r1, r0, r2, r3, r4, dateTime4);
        String str4 = (i & 1) != 0 ? "" : str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) == 0 ? str3 : "";
        if ((i & 8) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
        DateTime dateTime5 = dateTime;
        if ((i & 16) != 0) {
            dateTime2 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime2, "now()");
        }
        DateTime dateTime6 = dateTime2;
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
