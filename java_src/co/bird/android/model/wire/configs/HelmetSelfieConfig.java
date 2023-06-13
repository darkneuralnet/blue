package co.bird.android.model.wire.configs;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012Jj\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010$J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\u0013\u0010&\u001a\u00020\u00032\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u0006HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001a\u0010\u0012¨\u00061"}, m28432d2 = {"Lco/bird/android/model/wire/configs/HelmetSelfieConfig;", "Landroid/os/Parcelable;", "enablePostRide", "", "enablePreRide", "incentiveAmount", "", "fineAmount", "requiredPreRideDetectionConfidence", "", "maxRideCount", "minRideCount", "rideFrequency", "(ZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getEnablePostRide", "()Z", "getEnablePreRide", "getFineAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIncentiveAmount", "getMaxRideCount", "getMinRideCount", "getRequiredPreRideDetectionConfidence", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getRideFrequency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/android/model/wire/configs/HelmetSelfieConfig;", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class HelmetSelfieConfig implements Parcelable {
    public static final Parcelable.Creator<HelmetSelfieConfig> CREATOR = new Creator();
    @JsonProperty("enable_post_ride")
    @InterfaceC41208ft5("enable_post_ride")
    private final boolean enablePostRide;
    @JsonProperty("enable_pre_ride")
    @InterfaceC41208ft5("enable_pre_ride")
    private final boolean enablePreRide;
    @JsonProperty("fine_amount")
    @InterfaceC41208ft5("fine_amount")
    private final Integer fineAmount;
    @JsonProperty("incentive_amount")
    @InterfaceC41208ft5("incentive_amount")
    private final Integer incentiveAmount;
    @JsonProperty("max_ride_count")
    @InterfaceC41208ft5("max_ride_count")
    private final Integer maxRideCount;
    @JsonProperty("min_ride_count")
    @InterfaceC41208ft5("min_ride_count")
    private final Integer minRideCount;
    @JsonProperty("required_pre_ride_detection_confidence")
    @InterfaceC41208ft5("required_pre_ride_detection_confidence")
    private final Float requiredPreRideDetectionConfidence;
    @JsonProperty("ride_frequency")
    @InterfaceC41208ft5("ride_frequency")
    private final Integer rideFrequency;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Creator implements Parcelable.Creator<HelmetSelfieConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HelmetSelfieConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HelmetSelfieConfig(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HelmetSelfieConfig[] newArray(int i) {
            return new HelmetSelfieConfig[i];
        }
    }

    public HelmetSelfieConfig() {
        this(false, false, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final boolean component1() {
        return this.enablePostRide;
    }

    public final boolean component2() {
        return this.enablePreRide;
    }

    public final Integer component3() {
        return this.incentiveAmount;
    }

    public final Integer component4() {
        return this.fineAmount;
    }

    public final Float component5() {
        return this.requiredPreRideDetectionConfidence;
    }

    public final Integer component6() {
        return this.maxRideCount;
    }

    public final Integer component7() {
        return this.minRideCount;
    }

    public final Integer component8() {
        return this.rideFrequency;
    }

    public final HelmetSelfieConfig copy(boolean z, boolean z2, Integer num, Integer num2, Float f, Integer num3, Integer num4, Integer num5) {
        return new HelmetSelfieConfig(z, z2, num, num2, f, num3, num4, num5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HelmetSelfieConfig) {
            HelmetSelfieConfig helmetSelfieConfig = (HelmetSelfieConfig) obj;
            return this.enablePostRide == helmetSelfieConfig.enablePostRide && this.enablePreRide == helmetSelfieConfig.enablePreRide && Intrinsics.areEqual(this.incentiveAmount, helmetSelfieConfig.incentiveAmount) && Intrinsics.areEqual(this.fineAmount, helmetSelfieConfig.fineAmount) && Intrinsics.areEqual((Object) this.requiredPreRideDetectionConfidence, (Object) helmetSelfieConfig.requiredPreRideDetectionConfidence) && Intrinsics.areEqual(this.maxRideCount, helmetSelfieConfig.maxRideCount) && Intrinsics.areEqual(this.minRideCount, helmetSelfieConfig.minRideCount) && Intrinsics.areEqual(this.rideFrequency, helmetSelfieConfig.rideFrequency);
        }
        return false;
    }

    public final boolean getEnablePostRide() {
        return this.enablePostRide;
    }

    public final boolean getEnablePreRide() {
        return this.enablePreRide;
    }

    public final Integer getFineAmount() {
        return this.fineAmount;
    }

    public final Integer getIncentiveAmount() {
        return this.incentiveAmount;
    }

    public final Integer getMaxRideCount() {
        return this.maxRideCount;
    }

    public final Integer getMinRideCount() {
        return this.minRideCount;
    }

    public final Float getRequiredPreRideDetectionConfidence() {
        return this.requiredPreRideDetectionConfidence;
    }

    public final Integer getRideFrequency() {
        return this.rideFrequency;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public int hashCode() {
        boolean z = this.enablePostRide;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.enablePreRide;
        int i2 = (i + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        Integer num = this.incentiveAmount;
        int hashCode = (i2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.fineAmount;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.requiredPreRideDetectionConfidence;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num3 = this.maxRideCount;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.minRideCount;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.rideFrequency;
        return hashCode5 + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.enablePostRide;
        boolean z2 = this.enablePreRide;
        Integer num = this.incentiveAmount;
        Integer num2 = this.fineAmount;
        Float f = this.requiredPreRideDetectionConfidence;
        Integer num3 = this.maxRideCount;
        Integer num4 = this.minRideCount;
        Integer num5 = this.rideFrequency;
        return "HelmetSelfieConfig(enablePostRide=" + z + ", enablePreRide=" + z2 + ", incentiveAmount=" + num + ", fineAmount=" + num2 + ", requiredPreRideDetectionConfidence=" + f + ", maxRideCount=" + num3 + ", minRideCount=" + num4 + ", rideFrequency=" + num5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.enablePostRide ? 1 : 0);
        out.writeInt(this.enablePreRide ? 1 : 0);
        Integer num = this.incentiveAmount;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.fineAmount;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Float f = this.requiredPreRideDetectionConfidence;
        if (f == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeFloat(f.floatValue());
        }
        Integer num3 = this.maxRideCount;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        Integer num4 = this.minRideCount;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num4.intValue());
        }
        Integer num5 = this.rideFrequency;
        if (num5 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num5.intValue());
    }

    public HelmetSelfieConfig(boolean z, boolean z2, Integer num, Integer num2, Float f, Integer num3, Integer num4, Integer num5) {
        this.enablePostRide = z;
        this.enablePreRide = z2;
        this.incentiveAmount = num;
        this.fineAmount = num2;
        this.requiredPreRideDetectionConfidence = f;
        this.maxRideCount = num3;
        this.minRideCount = num4;
        this.rideFrequency = num5;
    }

    public /* synthetic */ HelmetSelfieConfig(boolean z, boolean z2, Integer num, Integer num2, Float f, Integer num3, Integer num4, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4, (i & 128) == 0 ? num5 : null);
    }
}
