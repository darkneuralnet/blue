package co.bird.android.model.wire.configs;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/wire/configs/AutoPayPlanConfig;", "Landroid/os/Parcelable;", "id", "", "refillAmount", "", "incentiveAmount", "googlePayIncentiveAmount", "(Ljava/lang/String;III)V", "getGooglePayIncentiveAmount", "()I", "getId", "()Ljava/lang/String;", "getIncentiveAmount", "getRefillAmount", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AutoPayPlanConfig implements Parcelable {
    public static final Parcelable.Creator<AutoPayPlanConfig> CREATOR = new Creator();
    @JsonProperty("google_pay_additional_incentive_amount")
    @InterfaceC41208ft5("google_pay_additional_incentive_amount")
    private final int googlePayIncentiveAmount;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66779id;
    @JsonProperty("incentive_amount")
    @InterfaceC41208ft5("incentive_amount")
    private final int incentiveAmount;
    @JsonProperty("refill_amount")
    @InterfaceC41208ft5("refill_amount")
    private final int refillAmount;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<AutoPayPlanConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoPayPlanConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoPayPlanConfig(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AutoPayPlanConfig[] newArray(int i) {
            return new AutoPayPlanConfig[i];
        }
    }

    public AutoPayPlanConfig() {
        this(null, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ AutoPayPlanConfig copy$default(AutoPayPlanConfig autoPayPlanConfig, String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = autoPayPlanConfig.f66779id;
        }
        if ((i4 & 2) != 0) {
            i = autoPayPlanConfig.refillAmount;
        }
        if ((i4 & 4) != 0) {
            i2 = autoPayPlanConfig.incentiveAmount;
        }
        if ((i4 & 8) != 0) {
            i3 = autoPayPlanConfig.googlePayIncentiveAmount;
        }
        return autoPayPlanConfig.copy(str, i, i2, i3);
    }

    public final String component1() {
        return this.f66779id;
    }

    public final int component2() {
        return this.refillAmount;
    }

    public final int component3() {
        return this.incentiveAmount;
    }

    public final int component4() {
        return this.googlePayIncentiveAmount;
    }

    public final AutoPayPlanConfig copy(String id, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new AutoPayPlanConfig(id, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutoPayPlanConfig) {
            AutoPayPlanConfig autoPayPlanConfig = (AutoPayPlanConfig) obj;
            return Intrinsics.areEqual(this.f66779id, autoPayPlanConfig.f66779id) && this.refillAmount == autoPayPlanConfig.refillAmount && this.incentiveAmount == autoPayPlanConfig.incentiveAmount && this.googlePayIncentiveAmount == autoPayPlanConfig.googlePayIncentiveAmount;
        }
        return false;
    }

    public final int getGooglePayIncentiveAmount() {
        return this.googlePayIncentiveAmount;
    }

    public final String getId() {
        return this.f66779id;
    }

    public final int getIncentiveAmount() {
        return this.incentiveAmount;
    }

    public final int getRefillAmount() {
        return this.refillAmount;
    }

    public int hashCode() {
        return (((((this.f66779id.hashCode() * 31) + Integer.hashCode(this.refillAmount)) * 31) + Integer.hashCode(this.incentiveAmount)) * 31) + Integer.hashCode(this.googlePayIncentiveAmount);
    }

    public String toString() {
        String str = this.f66779id;
        int i = this.refillAmount;
        int i2 = this.incentiveAmount;
        int i3 = this.googlePayIncentiveAmount;
        return "AutoPayPlanConfig(id=" + str + ", refillAmount=" + i + ", incentiveAmount=" + i2 + ", googlePayIncentiveAmount=" + i3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66779id);
        out.writeInt(this.refillAmount);
        out.writeInt(this.incentiveAmount);
        out.writeInt(this.googlePayIncentiveAmount);
    }

    public AutoPayPlanConfig(String id, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66779id = id;
        this.refillAmount = i;
        this.incentiveAmount = i2;
        this.googlePayIncentiveAmount = i3;
    }

    public /* synthetic */ AutoPayPlanConfig(String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }
}
