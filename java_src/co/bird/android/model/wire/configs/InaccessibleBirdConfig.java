package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006*"}, m28432d2 = {"Lco/bird/android/model/wire/configs/InaccessibleBirdConfig;", "", "reportMaxPhotosInput", "", "enableRiderCannotAccess", "", "enableChargerCannotAccess", "enableSuperchargerCannotAccess", "enableOperatorCannotAccess", "riderRoleConfig", "Lco/bird/android/model/wire/configs/InacccesibleBirdRoleConfig;", "chargerRoleConfig", "superchargerRoleConfig", "operatorRoleConfig", "(IZZZZLco/bird/android/model/wire/configs/InacccesibleBirdRoleConfig;Lco/bird/android/model/wire/configs/InacccesibleBirdRoleConfig;Lco/bird/android/model/wire/configs/InacccesibleBirdRoleConfig;Lco/bird/android/model/wire/configs/InacccesibleBirdRoleConfig;)V", "getChargerRoleConfig", "()Lco/bird/android/model/wire/configs/InacccesibleBirdRoleConfig;", "getEnableChargerCannotAccess", "()Z", "getEnableOperatorCannotAccess", "getEnableRiderCannotAccess", "getEnableSuperchargerCannotAccess", "getOperatorRoleConfig", "getReportMaxPhotosInput", "()I", "getRiderRoleConfig", "getSuperchargerRoleConfig", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class InaccessibleBirdConfig {
    @JsonProperty("charger_role_config")
    @InterfaceC41208ft5("charger_role_config")
    private final InacccesibleBirdRoleConfig chargerRoleConfig;
    @JsonProperty("enable_charger_cannot_access")
    @InterfaceC41208ft5("enable_charger_cannot_access")
    private final boolean enableChargerCannotAccess;
    @JsonProperty("enable_operator_cannot_access")
    @InterfaceC41208ft5("enable_operator_cannot_access")
    private final boolean enableOperatorCannotAccess;
    @JsonProperty("enable_rider_cannot_access")
    @InterfaceC41208ft5("enable_rider_cannot_access")
    private final boolean enableRiderCannotAccess;
    @JsonProperty("enable_supercharger_cannot_access")
    @InterfaceC41208ft5("enable_supercharger_cannot_access")
    private final boolean enableSuperchargerCannotAccess;
    @JsonProperty("operator_role_config")
    @InterfaceC41208ft5("operator_role_config")
    private final InacccesibleBirdRoleConfig operatorRoleConfig;
    @JsonProperty("report_max_photos_input")
    @InterfaceC41208ft5("report_max_photos_input")
    private final int reportMaxPhotosInput;
    @JsonProperty("rider_role_config")
    @InterfaceC41208ft5("rider_role_config")
    private final InacccesibleBirdRoleConfig riderRoleConfig;
    @JsonProperty("supercharger_role_config")
    @InterfaceC41208ft5("supercharger_role_config")
    private final InacccesibleBirdRoleConfig superchargerRoleConfig;

    public InaccessibleBirdConfig() {
        this(0, false, false, false, false, null, null, null, null, 511, null);
    }

    public final int component1() {
        return this.reportMaxPhotosInput;
    }

    public final boolean component2() {
        return this.enableRiderCannotAccess;
    }

    public final boolean component3() {
        return this.enableChargerCannotAccess;
    }

    public final boolean component4() {
        return this.enableSuperchargerCannotAccess;
    }

    public final boolean component5() {
        return this.enableOperatorCannotAccess;
    }

    public final InacccesibleBirdRoleConfig component6() {
        return this.riderRoleConfig;
    }

    public final InacccesibleBirdRoleConfig component7() {
        return this.chargerRoleConfig;
    }

    public final InacccesibleBirdRoleConfig component8() {
        return this.superchargerRoleConfig;
    }

    public final InacccesibleBirdRoleConfig component9() {
        return this.operatorRoleConfig;
    }

    public final InaccessibleBirdConfig copy(int i, boolean z, boolean z2, boolean z3, boolean z4, InacccesibleBirdRoleConfig riderRoleConfig, InacccesibleBirdRoleConfig chargerRoleConfig, InacccesibleBirdRoleConfig superchargerRoleConfig, InacccesibleBirdRoleConfig operatorRoleConfig) {
        Intrinsics.checkNotNullParameter(riderRoleConfig, "riderRoleConfig");
        Intrinsics.checkNotNullParameter(chargerRoleConfig, "chargerRoleConfig");
        Intrinsics.checkNotNullParameter(superchargerRoleConfig, "superchargerRoleConfig");
        Intrinsics.checkNotNullParameter(operatorRoleConfig, "operatorRoleConfig");
        return new InaccessibleBirdConfig(i, z, z2, z3, z4, riderRoleConfig, chargerRoleConfig, superchargerRoleConfig, operatorRoleConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InaccessibleBirdConfig) {
            InaccessibleBirdConfig inaccessibleBirdConfig = (InaccessibleBirdConfig) obj;
            return this.reportMaxPhotosInput == inaccessibleBirdConfig.reportMaxPhotosInput && this.enableRiderCannotAccess == inaccessibleBirdConfig.enableRiderCannotAccess && this.enableChargerCannotAccess == inaccessibleBirdConfig.enableChargerCannotAccess && this.enableSuperchargerCannotAccess == inaccessibleBirdConfig.enableSuperchargerCannotAccess && this.enableOperatorCannotAccess == inaccessibleBirdConfig.enableOperatorCannotAccess && Intrinsics.areEqual(this.riderRoleConfig, inaccessibleBirdConfig.riderRoleConfig) && Intrinsics.areEqual(this.chargerRoleConfig, inaccessibleBirdConfig.chargerRoleConfig) && Intrinsics.areEqual(this.superchargerRoleConfig, inaccessibleBirdConfig.superchargerRoleConfig) && Intrinsics.areEqual(this.operatorRoleConfig, inaccessibleBirdConfig.operatorRoleConfig);
        }
        return false;
    }

    public final InacccesibleBirdRoleConfig getChargerRoleConfig() {
        return this.chargerRoleConfig;
    }

    public final boolean getEnableChargerCannotAccess() {
        return this.enableChargerCannotAccess;
    }

    public final boolean getEnableOperatorCannotAccess() {
        return this.enableOperatorCannotAccess;
    }

    public final boolean getEnableRiderCannotAccess() {
        return this.enableRiderCannotAccess;
    }

    public final boolean getEnableSuperchargerCannotAccess() {
        return this.enableSuperchargerCannotAccess;
    }

    public final InacccesibleBirdRoleConfig getOperatorRoleConfig() {
        return this.operatorRoleConfig;
    }

    public final int getReportMaxPhotosInput() {
        return this.reportMaxPhotosInput;
    }

    public final InacccesibleBirdRoleConfig getRiderRoleConfig() {
        return this.riderRoleConfig;
    }

    public final InacccesibleBirdRoleConfig getSuperchargerRoleConfig() {
        return this.superchargerRoleConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.reportMaxPhotosInput) * 31;
        boolean z = this.enableRiderCannotAccess;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.enableChargerCannotAccess;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.enableSuperchargerCannotAccess;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.enableOperatorCannotAccess;
        return ((((((((i6 + (z4 ? 1 : z4 ? 1 : 0)) * 31) + this.riderRoleConfig.hashCode()) * 31) + this.chargerRoleConfig.hashCode()) * 31) + this.superchargerRoleConfig.hashCode()) * 31) + this.operatorRoleConfig.hashCode();
    }

    public String toString() {
        int i = this.reportMaxPhotosInput;
        boolean z = this.enableRiderCannotAccess;
        boolean z2 = this.enableChargerCannotAccess;
        boolean z3 = this.enableSuperchargerCannotAccess;
        boolean z4 = this.enableOperatorCannotAccess;
        InacccesibleBirdRoleConfig inacccesibleBirdRoleConfig = this.riderRoleConfig;
        InacccesibleBirdRoleConfig inacccesibleBirdRoleConfig2 = this.chargerRoleConfig;
        InacccesibleBirdRoleConfig inacccesibleBirdRoleConfig3 = this.superchargerRoleConfig;
        InacccesibleBirdRoleConfig inacccesibleBirdRoleConfig4 = this.operatorRoleConfig;
        return "InaccessibleBirdConfig(reportMaxPhotosInput=" + i + ", enableRiderCannotAccess=" + z + ", enableChargerCannotAccess=" + z2 + ", enableSuperchargerCannotAccess=" + z3 + ", enableOperatorCannotAccess=" + z4 + ", riderRoleConfig=" + inacccesibleBirdRoleConfig + ", chargerRoleConfig=" + inacccesibleBirdRoleConfig2 + ", superchargerRoleConfig=" + inacccesibleBirdRoleConfig3 + ", operatorRoleConfig=" + inacccesibleBirdRoleConfig4 + ")";
    }

    public InaccessibleBirdConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, InacccesibleBirdRoleConfig riderRoleConfig, InacccesibleBirdRoleConfig chargerRoleConfig, InacccesibleBirdRoleConfig superchargerRoleConfig, InacccesibleBirdRoleConfig operatorRoleConfig) {
        Intrinsics.checkNotNullParameter(riderRoleConfig, "riderRoleConfig");
        Intrinsics.checkNotNullParameter(chargerRoleConfig, "chargerRoleConfig");
        Intrinsics.checkNotNullParameter(superchargerRoleConfig, "superchargerRoleConfig");
        Intrinsics.checkNotNullParameter(operatorRoleConfig, "operatorRoleConfig");
        this.reportMaxPhotosInput = i;
        this.enableRiderCannotAccess = z;
        this.enableChargerCannotAccess = z2;
        this.enableSuperchargerCannotAccess = z3;
        this.enableOperatorCannotAccess = z4;
        this.riderRoleConfig = riderRoleConfig;
        this.chargerRoleConfig = chargerRoleConfig;
        this.superchargerRoleConfig = superchargerRoleConfig;
        this.operatorRoleConfig = operatorRoleConfig;
    }

    public /* synthetic */ InaccessibleBirdConfig(int i, boolean z, boolean z2, boolean z3, boolean z4, InacccesibleBirdRoleConfig inacccesibleBirdRoleConfig, InacccesibleBirdRoleConfig inacccesibleBirdRoleConfig2, InacccesibleBirdRoleConfig inacccesibleBirdRoleConfig3, InacccesibleBirdRoleConfig inacccesibleBirdRoleConfig4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 5 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4, (i2 & 32) != 0 ? new InacccesibleBirdRoleConfig(0.0f, 0, 3, null) : inacccesibleBirdRoleConfig, (i2 & 64) != 0 ? new InacccesibleBirdRoleConfig(0.0f, 0, 3, null) : inacccesibleBirdRoleConfig2, (i2 & 128) != 0 ? new InacccesibleBirdRoleConfig(0.0f, 0, 3, null) : inacccesibleBirdRoleConfig3, (i2 & 256) != 0 ? new InacccesibleBirdRoleConfig(0.0f, 0, 3, null) : inacccesibleBirdRoleConfig4);
    }
}
