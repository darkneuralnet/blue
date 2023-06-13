package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, m28432d2 = {"Lco/bird/android/model/wire/WireRidePassUserSubscriptionView;", "Landroid/os/Parcelable;", "id", "", "nextRenewalAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getId", "()Ljava/lang/String;", "getNextRenewalAt", "()Lorg/joda/time/DateTime;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRidePassUserSubscriptionView implements Parcelable {
    public static final Parcelable.Creator<WireRidePassUserSubscriptionView> CREATOR = new Creator();
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66756id;
    @JsonProperty("next_renewal_at")
    @InterfaceC41208ft5("next_renewal_at")
    private final DateTime nextRenewalAt;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireRidePassUserSubscriptionView> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRidePassUserSubscriptionView createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireRidePassUserSubscriptionView(parcel.readString(), (DateTime) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRidePassUserSubscriptionView[] newArray(int i) {
            return new WireRidePassUserSubscriptionView[i];
        }
    }

    public WireRidePassUserSubscriptionView() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ WireRidePassUserSubscriptionView copy$default(WireRidePassUserSubscriptionView wireRidePassUserSubscriptionView, String str, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireRidePassUserSubscriptionView.f66756id;
        }
        if ((i & 2) != 0) {
            dateTime = wireRidePassUserSubscriptionView.nextRenewalAt;
        }
        return wireRidePassUserSubscriptionView.copy(str, dateTime);
    }

    public final String component1() {
        return this.f66756id;
    }

    public final DateTime component2() {
        return this.nextRenewalAt;
    }

    public final WireRidePassUserSubscriptionView copy(String id, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new WireRidePassUserSubscriptionView(id, dateTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRidePassUserSubscriptionView) {
            WireRidePassUserSubscriptionView wireRidePassUserSubscriptionView = (WireRidePassUserSubscriptionView) obj;
            return Intrinsics.areEqual(this.f66756id, wireRidePassUserSubscriptionView.f66756id) && Intrinsics.areEqual(this.nextRenewalAt, wireRidePassUserSubscriptionView.nextRenewalAt);
        }
        return false;
    }

    public final String getId() {
        return this.f66756id;
    }

    public final DateTime getNextRenewalAt() {
        return this.nextRenewalAt;
    }

    public int hashCode() {
        int hashCode = this.f66756id.hashCode() * 31;
        DateTime dateTime = this.nextRenewalAt;
        return hashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }

    public String toString() {
        String str = this.f66756id;
        DateTime dateTime = this.nextRenewalAt;
        return "WireRidePassUserSubscriptionView(id=" + str + ", nextRenewalAt=" + dateTime + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66756id);
        out.writeSerializable(this.nextRenewalAt);
    }

    public WireRidePassUserSubscriptionView(String id, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66756id = id;
        this.nextRenewalAt = dateTime;
    }

    public /* synthetic */ WireRidePassUserSubscriptionView(String str, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : dateTime);
    }
}
