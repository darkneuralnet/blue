package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.FlightSheetVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorFlightSheetConfig;", "", "enableFlightSheet", "", "version", "Lco/bird/android/model/constant/FlightSheetVersion;", "(ZLco/bird/android/model/constant/FlightSheetVersion;)V", "getEnableFlightSheet", "()Z", "getVersion", "()Lco/bird/android/model/constant/FlightSheetVersion;", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorFlightSheetConfig {
    @JsonProperty("enable_flight_sheet")
    @InterfaceC41208ft5("enable_flight_sheet")
    private final boolean enableFlightSheet;
    @JsonProperty("version")
    @InterfaceC41208ft5("version")
    private final FlightSheetVersion version;

    public OperatorFlightSheetConfig() {
        this(false, null, 3, null);
    }

    public static /* synthetic */ OperatorFlightSheetConfig copy$default(OperatorFlightSheetConfig operatorFlightSheetConfig, boolean z, FlightSheetVersion flightSheetVersion, int i, Object obj) {
        if ((i & 1) != 0) {
            z = operatorFlightSheetConfig.enableFlightSheet;
        }
        if ((i & 2) != 0) {
            flightSheetVersion = operatorFlightSheetConfig.version;
        }
        return operatorFlightSheetConfig.copy(z, flightSheetVersion);
    }

    public final boolean component1() {
        return this.enableFlightSheet;
    }

    public final FlightSheetVersion component2() {
        return this.version;
    }

    public final OperatorFlightSheetConfig copy(boolean z, FlightSheetVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        return new OperatorFlightSheetConfig(z, version);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorFlightSheetConfig) {
            OperatorFlightSheetConfig operatorFlightSheetConfig = (OperatorFlightSheetConfig) obj;
            return this.enableFlightSheet == operatorFlightSheetConfig.enableFlightSheet && this.version == operatorFlightSheetConfig.version;
        }
        return false;
    }

    public final boolean getEnableFlightSheet() {
        return this.enableFlightSheet;
    }

    public final FlightSheetVersion getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.enableFlightSheet;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.version.hashCode();
    }

    public String toString() {
        boolean z = this.enableFlightSheet;
        FlightSheetVersion flightSheetVersion = this.version;
        return "OperatorFlightSheetConfig(enableFlightSheet=" + z + ", version=" + flightSheetVersion + ")";
    }

    public OperatorFlightSheetConfig(boolean z, FlightSheetVersion version) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.enableFlightSheet = z;
        this.version = version;
    }

    public /* synthetic */ OperatorFlightSheetConfig(boolean z, FlightSheetVersion flightSheetVersion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? FlightSheetVersion.UNKNOWN : flightSheetVersion);
    }
}
