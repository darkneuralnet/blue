package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/wire/configs/OperatorPermissionsConfig;", "", "requireLocationServices", "", "requireCamera", "requireNotifications", "requireBluetooth", "(ZZZZ)V", "getRequireBluetooth", "()Z", "getRequireCamera", "getRequireLocationServices", "getRequireNotifications", "component1", "component2", "component3", "component4", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorPermissionsConfig {
    @JsonProperty("require_bluetooth")
    @InterfaceC41208ft5("require_bluetooth")
    private final boolean requireBluetooth;
    @JsonProperty("require_camera")
    @InterfaceC41208ft5("require_camera")
    private final boolean requireCamera;
    @JsonProperty("require_location_services")
    @InterfaceC41208ft5("require_location_services")
    private final boolean requireLocationServices;
    @JsonProperty("require_notifications")
    @InterfaceC41208ft5("require_notifications")
    private final boolean requireNotifications;

    public OperatorPermissionsConfig() {
        this(false, false, false, false, 15, null);
    }

    public static /* synthetic */ OperatorPermissionsConfig copy$default(OperatorPermissionsConfig operatorPermissionsConfig, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = operatorPermissionsConfig.requireLocationServices;
        }
        if ((i & 2) != 0) {
            z2 = operatorPermissionsConfig.requireCamera;
        }
        if ((i & 4) != 0) {
            z3 = operatorPermissionsConfig.requireNotifications;
        }
        if ((i & 8) != 0) {
            z4 = operatorPermissionsConfig.requireBluetooth;
        }
        return operatorPermissionsConfig.copy(z, z2, z3, z4);
    }

    public final boolean component1() {
        return this.requireLocationServices;
    }

    public final boolean component2() {
        return this.requireCamera;
    }

    public final boolean component3() {
        return this.requireNotifications;
    }

    public final boolean component4() {
        return this.requireBluetooth;
    }

    public final OperatorPermissionsConfig copy(boolean z, boolean z2, boolean z3, boolean z4) {
        return new OperatorPermissionsConfig(z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorPermissionsConfig) {
            OperatorPermissionsConfig operatorPermissionsConfig = (OperatorPermissionsConfig) obj;
            return this.requireLocationServices == operatorPermissionsConfig.requireLocationServices && this.requireCamera == operatorPermissionsConfig.requireCamera && this.requireNotifications == operatorPermissionsConfig.requireNotifications && this.requireBluetooth == operatorPermissionsConfig.requireBluetooth;
        }
        return false;
    }

    public final boolean getRequireBluetooth() {
        return this.requireBluetooth;
    }

    public final boolean getRequireCamera() {
        return this.requireCamera;
    }

    public final boolean getRequireLocationServices() {
        return this.requireLocationServices;
    }

    public final boolean getRequireNotifications() {
        return this.requireNotifications;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z = this.requireLocationServices;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.requireCamera;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.requireNotifications;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z2 = this.requireBluetooth;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.requireLocationServices;
        boolean z2 = this.requireCamera;
        boolean z3 = this.requireNotifications;
        boolean z4 = this.requireBluetooth;
        return "OperatorPermissionsConfig(requireLocationServices=" + z + ", requireCamera=" + z2 + ", requireNotifications=" + z3 + ", requireBluetooth=" + z4 + ")";
    }

    public OperatorPermissionsConfig(boolean z, boolean z2, boolean z3, boolean z4) {
        this.requireLocationServices = z;
        this.requireCamera = z2;
        this.requireNotifications = z3;
        this.requireBluetooth = z4;
    }

    public /* synthetic */ OperatorPermissionsConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }
}
