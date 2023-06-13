package co.bird.android.model.wire.configs;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\f¨\u0006\""}, m28432d2 = {"Lco/bird/android/model/wire/configs/RiderHomeAreaPromptConfig;", "Landroid/os/Parcelable;", "enabled", "", "maxRideCount", "", "minRideCount", "rideFrequency", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getEnabled", "()Z", "getMaxRideCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMinRideCount", "getRideFrequency", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/wire/configs/RiderHomeAreaPromptConfig;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RiderHomeAreaPromptConfig implements Parcelable {
    public static final Parcelable.Creator<RiderHomeAreaPromptConfig> CREATOR = new Creator();
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("max_ride_count")
    @InterfaceC41208ft5("max_ride_count")
    private final Integer maxRideCount;
    @JsonProperty("min_ride_count")
    @InterfaceC41208ft5("min_ride_count")
    private final Integer minRideCount;
    @JsonProperty("ride_frequency")
    @InterfaceC41208ft5("ride_frequency")
    private final Integer rideFrequency;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<RiderHomeAreaPromptConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiderHomeAreaPromptConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RiderHomeAreaPromptConfig(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiderHomeAreaPromptConfig[] newArray(int i) {
            return new RiderHomeAreaPromptConfig[i];
        }
    }

    public RiderHomeAreaPromptConfig() {
        this(false, null, null, null, 15, null);
    }

    public static /* synthetic */ RiderHomeAreaPromptConfig copy$default(RiderHomeAreaPromptConfig riderHomeAreaPromptConfig, boolean z, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = riderHomeAreaPromptConfig.enabled;
        }
        if ((i & 2) != 0) {
            num = riderHomeAreaPromptConfig.maxRideCount;
        }
        if ((i & 4) != 0) {
            num2 = riderHomeAreaPromptConfig.minRideCount;
        }
        if ((i & 8) != 0) {
            num3 = riderHomeAreaPromptConfig.rideFrequency;
        }
        return riderHomeAreaPromptConfig.copy(z, num, num2, num3);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final Integer component2() {
        return this.maxRideCount;
    }

    public final Integer component3() {
        return this.minRideCount;
    }

    public final Integer component4() {
        return this.rideFrequency;
    }

    public final RiderHomeAreaPromptConfig copy(boolean z, Integer num, Integer num2, Integer num3) {
        return new RiderHomeAreaPromptConfig(z, num, num2, num3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RiderHomeAreaPromptConfig) {
            RiderHomeAreaPromptConfig riderHomeAreaPromptConfig = (RiderHomeAreaPromptConfig) obj;
            return this.enabled == riderHomeAreaPromptConfig.enabled && Intrinsics.areEqual(this.maxRideCount, riderHomeAreaPromptConfig.maxRideCount) && Intrinsics.areEqual(this.minRideCount, riderHomeAreaPromptConfig.minRideCount) && Intrinsics.areEqual(this.rideFrequency, riderHomeAreaPromptConfig.rideFrequency);
        }
        return false;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final Integer getMaxRideCount() {
        return this.maxRideCount;
    }

    public final Integer getMinRideCount() {
        return this.minRideCount;
    }

    public final Integer getRideFrequency() {
        return this.rideFrequency;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.maxRideCount;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.minRideCount;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.rideFrequency;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        Integer num = this.maxRideCount;
        Integer num2 = this.minRideCount;
        Integer num3 = this.rideFrequency;
        return "RiderHomeAreaPromptConfig(enabled=" + z + ", maxRideCount=" + num + ", minRideCount=" + num2 + ", rideFrequency=" + num3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.enabled ? 1 : 0);
        Integer num = this.maxRideCount;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.minRideCount;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Integer num3 = this.rideFrequency;
        if (num3 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num3.intValue());
    }

    public RiderHomeAreaPromptConfig(boolean z, Integer num, Integer num2, Integer num3) {
        this.enabled = z;
        this.maxRideCount = num;
        this.minRideCount = num2;
        this.rideFrequency = num3;
    }

    public /* synthetic */ RiderHomeAreaPromptConfig(boolean z, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }
}
