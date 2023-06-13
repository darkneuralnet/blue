package co.bird.android.model.wire;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/wire/WireRidePassSubscriptionPlanView;", "Landroid/os/Parcelable;", "id", "", "billingIntervalDescription", "(Ljava/lang/String;Ljava/lang/String;)V", "getBillingIntervalDescription", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireRidePassSubscriptionPlanView implements Parcelable {
    public static final Parcelable.Creator<WireRidePassSubscriptionPlanView> CREATOR = new Creator();
    @JsonProperty("billing_interval_description")
    @InterfaceC41208ft5("billing_interval_description")
    private final String billingIntervalDescription;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66755id;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<WireRidePassSubscriptionPlanView> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRidePassSubscriptionPlanView createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireRidePassSubscriptionPlanView(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRidePassSubscriptionPlanView[] newArray(int i) {
            return new WireRidePassSubscriptionPlanView[i];
        }
    }

    public WireRidePassSubscriptionPlanView() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ WireRidePassSubscriptionPlanView copy$default(WireRidePassSubscriptionPlanView wireRidePassSubscriptionPlanView, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireRidePassSubscriptionPlanView.f66755id;
        }
        if ((i & 2) != 0) {
            str2 = wireRidePassSubscriptionPlanView.billingIntervalDescription;
        }
        return wireRidePassSubscriptionPlanView.copy(str, str2);
    }

    public final String component1() {
        return this.f66755id;
    }

    public final String component2() {
        return this.billingIntervalDescription;
    }

    public final WireRidePassSubscriptionPlanView copy(String id, String billingIntervalDescription) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(billingIntervalDescription, "billingIntervalDescription");
        return new WireRidePassSubscriptionPlanView(id, billingIntervalDescription);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireRidePassSubscriptionPlanView) {
            WireRidePassSubscriptionPlanView wireRidePassSubscriptionPlanView = (WireRidePassSubscriptionPlanView) obj;
            return Intrinsics.areEqual(this.f66755id, wireRidePassSubscriptionPlanView.f66755id) && Intrinsics.areEqual(this.billingIntervalDescription, wireRidePassSubscriptionPlanView.billingIntervalDescription);
        }
        return false;
    }

    public final String getBillingIntervalDescription() {
        return this.billingIntervalDescription;
    }

    public final String getId() {
        return this.f66755id;
    }

    public int hashCode() {
        return (this.f66755id.hashCode() * 31) + this.billingIntervalDescription.hashCode();
    }

    public String toString() {
        String str = this.f66755id;
        String str2 = this.billingIntervalDescription;
        return "WireRidePassSubscriptionPlanView(id=" + str + ", billingIntervalDescription=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66755id);
        out.writeString(this.billingIntervalDescription);
    }

    public WireRidePassSubscriptionPlanView(String id, String billingIntervalDescription) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(billingIntervalDescription, "billingIntervalDescription");
        this.f66755id = id;
        this.billingIntervalDescription = billingIntervalDescription;
    }

    public /* synthetic */ WireRidePassSubscriptionPlanView(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
