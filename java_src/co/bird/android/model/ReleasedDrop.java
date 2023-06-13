package co.bird.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/ReleasedDrop;", "Landroid/os/Parcelable;", "id", "", "quantity", "", "photoUrl", "releasedAt", "Lorg/joda/time/DateTime;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "(Ljava/lang/String;ILjava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getId", "getPhotoUrl", "getQuantity", "()I", "getReleasedAt", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ReleasedDrop implements Parcelable {
    public static final Parcelable.Creator<ReleasedDrop> CREATOR = new Creator();
    private final String address;

    /* renamed from: id */
    private final String f66618id;
    private final String photoUrl;
    private final int quantity;
    private final DateTime releasedAt;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<ReleasedDrop> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReleasedDrop createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReleasedDrop(parcel.readString(), parcel.readInt(), parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReleasedDrop[] newArray(int i) {
            return new ReleasedDrop[i];
        }
    }

    public ReleasedDrop(String id, int i, String str, DateTime releasedAt, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(releasedAt, "releasedAt");
        this.f66618id = id;
        this.quantity = i;
        this.photoUrl = str;
        this.releasedAt = releasedAt;
        this.address = str2;
    }

    public static /* synthetic */ ReleasedDrop copy$default(ReleasedDrop releasedDrop, String str, int i, String str2, DateTime dateTime, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = releasedDrop.f66618id;
        }
        if ((i2 & 2) != 0) {
            i = releasedDrop.quantity;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            str2 = releasedDrop.photoUrl;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            dateTime = releasedDrop.releasedAt;
        }
        DateTime dateTime2 = dateTime;
        if ((i2 & 16) != 0) {
            str3 = releasedDrop.address;
        }
        return releasedDrop.copy(str, i3, str4, dateTime2, str3);
    }

    public final String component1() {
        return this.f66618id;
    }

    public final int component2() {
        return this.quantity;
    }

    public final String component3() {
        return this.photoUrl;
    }

    public final DateTime component4() {
        return this.releasedAt;
    }

    public final String component5() {
        return this.address;
    }

    public final ReleasedDrop copy(String id, int i, String str, DateTime releasedAt, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(releasedAt, "releasedAt");
        return new ReleasedDrop(id, i, str, releasedAt, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReleasedDrop) {
            ReleasedDrop releasedDrop = (ReleasedDrop) obj;
            return Intrinsics.areEqual(this.f66618id, releasedDrop.f66618id) && this.quantity == releasedDrop.quantity && Intrinsics.areEqual(this.photoUrl, releasedDrop.photoUrl) && Intrinsics.areEqual(this.releasedAt, releasedDrop.releasedAt) && Intrinsics.areEqual(this.address, releasedDrop.address);
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getId() {
        return this.f66618id;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final DateTime getReleasedAt() {
        return this.releasedAt;
    }

    public int hashCode() {
        int hashCode = ((this.f66618id.hashCode() * 31) + Integer.hashCode(this.quantity)) * 31;
        String str = this.photoUrl;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.releasedAt.hashCode()) * 31;
        String str2 = this.address;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66618id;
        int i = this.quantity;
        String str2 = this.photoUrl;
        DateTime dateTime = this.releasedAt;
        String str3 = this.address;
        return "ReleasedDrop(id=" + str + ", quantity=" + i + ", photoUrl=" + str2 + ", releasedAt=" + dateTime + ", address=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66618id);
        out.writeInt(this.quantity);
        out.writeString(this.photoUrl);
        out.writeSerializable(this.releasedAt);
        out.writeString(this.address);
    }
}
