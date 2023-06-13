package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorNestMapConfig;", "", "enabled", "", "enableReleaseAllTasksToStorageNest", "enableClaimNestWithoutTask", "enableMultiNestClaim", "enableNestMultiClaimManualSelection", "expandedPinZoomThreshold", "", "enableExpandedNestPin", "(ZZZZZFZ)V", "getEnableClaimNestWithoutTask", "()Z", "getEnableExpandedNestPin", "getEnableMultiNestClaim", "getEnableNestMultiClaimManualSelection", "getEnableReleaseAllTasksToStorageNest", "getEnabled", "getExpandedPinZoomThreshold", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorNestMapConfig {
    @JsonProperty("enable_claim_nest_without_task")
    @InterfaceC41208ft5("enable_claim_nest_without_task")
    private final boolean enableClaimNestWithoutTask;
    @JsonProperty("enable_expanded_nest_pin")
    @InterfaceC41208ft5("enable_expanded_nest_pin")
    private final boolean enableExpandedNestPin;
    @JsonProperty("enable_multi_nest_claim")
    @InterfaceC41208ft5("enable_multi_nest_claim")
    private final boolean enableMultiNestClaim;
    @JsonProperty("enable_nest_multi_claim_manual_selection")
    @InterfaceC41208ft5("enable_nest_multi_claim_manual_selection")
    private final boolean enableNestMultiClaimManualSelection;
    @JsonProperty("enable_storage_nest_release_all_tasks")
    @InterfaceC41208ft5("enable_storage_nest_release_all_tasks")
    private final boolean enableReleaseAllTasksToStorageNest;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("expanded_pin_zoom_threshold")
    @InterfaceC41208ft5("expanded_pin_zoom_threshold")
    private final float expandedPinZoomThreshold;

    public OperatorNestMapConfig() {
        this(false, false, false, false, false, 0.0f, false, 127, null);
    }

    public static /* synthetic */ OperatorNestMapConfig copy$default(OperatorNestMapConfig operatorNestMapConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            z = operatorNestMapConfig.enabled;
        }
        if ((i & 2) != 0) {
            z2 = operatorNestMapConfig.enableReleaseAllTasksToStorageNest;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = operatorNestMapConfig.enableClaimNestWithoutTask;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = operatorNestMapConfig.enableMultiNestClaim;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = operatorNestMapConfig.enableNestMultiClaimManualSelection;
        }
        boolean z10 = z5;
        if ((i & 32) != 0) {
            f = operatorNestMapConfig.expandedPinZoomThreshold;
        }
        float f2 = f;
        if ((i & 64) != 0) {
            z6 = operatorNestMapConfig.enableExpandedNestPin;
        }
        return operatorNestMapConfig.copy(z, z7, z8, z9, z10, f2, z6);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final boolean component2() {
        return this.enableReleaseAllTasksToStorageNest;
    }

    public final boolean component3() {
        return this.enableClaimNestWithoutTask;
    }

    public final boolean component4() {
        return this.enableMultiNestClaim;
    }

    public final boolean component5() {
        return this.enableNestMultiClaimManualSelection;
    }

    public final float component6() {
        return this.expandedPinZoomThreshold;
    }

    public final boolean component7() {
        return this.enableExpandedNestPin;
    }

    public final OperatorNestMapConfig copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f, boolean z6) {
        return new OperatorNestMapConfig(z, z2, z3, z4, z5, f, z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorNestMapConfig) {
            OperatorNestMapConfig operatorNestMapConfig = (OperatorNestMapConfig) obj;
            return this.enabled == operatorNestMapConfig.enabled && this.enableReleaseAllTasksToStorageNest == operatorNestMapConfig.enableReleaseAllTasksToStorageNest && this.enableClaimNestWithoutTask == operatorNestMapConfig.enableClaimNestWithoutTask && this.enableMultiNestClaim == operatorNestMapConfig.enableMultiNestClaim && this.enableNestMultiClaimManualSelection == operatorNestMapConfig.enableNestMultiClaimManualSelection && Float.compare(this.expandedPinZoomThreshold, operatorNestMapConfig.expandedPinZoomThreshold) == 0 && this.enableExpandedNestPin == operatorNestMapConfig.enableExpandedNestPin;
        }
        return false;
    }

    public final boolean getEnableClaimNestWithoutTask() {
        return this.enableClaimNestWithoutTask;
    }

    public final boolean getEnableExpandedNestPin() {
        return this.enableExpandedNestPin;
    }

    public final boolean getEnableMultiNestClaim() {
        return this.enableMultiNestClaim;
    }

    public final boolean getEnableNestMultiClaimManualSelection() {
        return this.enableNestMultiClaimManualSelection;
    }

    public final boolean getEnableReleaseAllTasksToStorageNest() {
        return this.enableReleaseAllTasksToStorageNest;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final float getExpandedPinZoomThreshold() {
        return this.expandedPinZoomThreshold;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.enableReleaseAllTasksToStorageNest;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.enableClaimNestWithoutTask;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r23 = this.enableMultiNestClaim;
        int i6 = r23;
        if (r23 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r24 = this.enableNestMultiClaimManualSelection;
        int i8 = r24;
        if (r24 != 0) {
            i8 = 1;
        }
        int hashCode = (((i7 + i8) * 31) + Float.hashCode(this.expandedPinZoomThreshold)) * 31;
        boolean z2 = this.enableExpandedNestPin;
        return hashCode + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        boolean z2 = this.enableReleaseAllTasksToStorageNest;
        boolean z3 = this.enableClaimNestWithoutTask;
        boolean z4 = this.enableMultiNestClaim;
        boolean z5 = this.enableNestMultiClaimManualSelection;
        float f = this.expandedPinZoomThreshold;
        boolean z6 = this.enableExpandedNestPin;
        return "OperatorNestMapConfig(enabled=" + z + ", enableReleaseAllTasksToStorageNest=" + z2 + ", enableClaimNestWithoutTask=" + z3 + ", enableMultiNestClaim=" + z4 + ", enableNestMultiClaimManualSelection=" + z5 + ", expandedPinZoomThreshold=" + f + ", enableExpandedNestPin=" + z6 + ")";
    }

    public OperatorNestMapConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f, boolean z6) {
        this.enabled = z;
        this.enableReleaseAllTasksToStorageNest = z2;
        this.enableClaimNestWithoutTask = z3;
        this.enableMultiNestClaim = z4;
        this.enableNestMultiClaimManualSelection = z5;
        this.expandedPinZoomThreshold = f;
        this.enableExpandedNestPin = z6;
    }

    public /* synthetic */ OperatorNestMapConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, float f, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? 16.0f : f, (i & 64) != 0 ? false : z6);
    }
}
