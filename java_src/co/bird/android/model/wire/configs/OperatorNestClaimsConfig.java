package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorNestClaimsConfig;", "", "enable", "", "claimCooldownMinutes", "", "(ZI)V", "getClaimCooldownMinutes", "()I", "getEnable", "()Z", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorNestClaimsConfig {
    @JsonProperty("claim_cooldown_minutes")
    @InterfaceC41208ft5("claim_cooldown_minutes")
    private final int claimCooldownMinutes;
    @JsonProperty("enable")
    @InterfaceC41208ft5("enable")
    private final boolean enable;

    public OperatorNestClaimsConfig() {
        this(false, 0, 3, null);
    }

    public static /* synthetic */ OperatorNestClaimsConfig copy$default(OperatorNestClaimsConfig operatorNestClaimsConfig, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = operatorNestClaimsConfig.enable;
        }
        if ((i2 & 2) != 0) {
            i = operatorNestClaimsConfig.claimCooldownMinutes;
        }
        return operatorNestClaimsConfig.copy(z, i);
    }

    public final boolean component1() {
        return this.enable;
    }

    public final int component2() {
        return this.claimCooldownMinutes;
    }

    public final OperatorNestClaimsConfig copy(boolean z, int i) {
        return new OperatorNestClaimsConfig(z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorNestClaimsConfig) {
            OperatorNestClaimsConfig operatorNestClaimsConfig = (OperatorNestClaimsConfig) obj;
            return this.enable == operatorNestClaimsConfig.enable && this.claimCooldownMinutes == operatorNestClaimsConfig.claimCooldownMinutes;
        }
        return false;
    }

    public final int getClaimCooldownMinutes() {
        return this.claimCooldownMinutes;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.enable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + Integer.hashCode(this.claimCooldownMinutes);
    }

    public String toString() {
        boolean z = this.enable;
        int i = this.claimCooldownMinutes;
        return "OperatorNestClaimsConfig(enable=" + z + ", claimCooldownMinutes=" + i + ")";
    }

    public OperatorNestClaimsConfig(boolean z, int i) {
        this.enable = z;
        this.claimCooldownMinutes = i;
    }

    public /* synthetic */ OperatorNestClaimsConfig(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i);
    }
}
