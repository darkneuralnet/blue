package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/wire/configs/UserTrackingConfig;", "", "enabled", "", "trackIntervalSeconds", "", "bluetoothScanDurationSeconds", "(ZII)V", "getBluetoothScanDurationSeconds", "()I", "getEnabled", "()Z", "getTrackIntervalSeconds", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UserTrackingConfig {
    @JsonProperty("bluetooth_scan_duration_seconds")
    @InterfaceC41208ft5("bluetooth_scan_duration_seconds")
    private final int bluetoothScanDurationSeconds;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("track_interval_seconds")
    @InterfaceC41208ft5("track_interval_seconds")
    private final int trackIntervalSeconds;

    public UserTrackingConfig() {
        this(false, 0, 0, 7, null);
    }

    public static /* synthetic */ UserTrackingConfig copy$default(UserTrackingConfig userTrackingConfig, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = userTrackingConfig.enabled;
        }
        if ((i3 & 2) != 0) {
            i = userTrackingConfig.trackIntervalSeconds;
        }
        if ((i3 & 4) != 0) {
            i2 = userTrackingConfig.bluetoothScanDurationSeconds;
        }
        return userTrackingConfig.copy(z, i, i2);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final int component2() {
        return this.trackIntervalSeconds;
    }

    public final int component3() {
        return this.bluetoothScanDurationSeconds;
    }

    public final UserTrackingConfig copy(boolean z, int i, int i2) {
        return new UserTrackingConfig(z, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserTrackingConfig) {
            UserTrackingConfig userTrackingConfig = (UserTrackingConfig) obj;
            return this.enabled == userTrackingConfig.enabled && this.trackIntervalSeconds == userTrackingConfig.trackIntervalSeconds && this.bluetoothScanDurationSeconds == userTrackingConfig.bluetoothScanDurationSeconds;
        }
        return false;
    }

    public final int getBluetoothScanDurationSeconds() {
        return this.bluetoothScanDurationSeconds;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getTrackIntervalSeconds() {
        return this.trackIntervalSeconds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.enabled;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + Integer.hashCode(this.trackIntervalSeconds)) * 31) + Integer.hashCode(this.bluetoothScanDurationSeconds);
    }

    public String toString() {
        boolean z = this.enabled;
        int i = this.trackIntervalSeconds;
        int i2 = this.bluetoothScanDurationSeconds;
        return "UserTrackingConfig(enabled=" + z + ", trackIntervalSeconds=" + i + ", bluetoothScanDurationSeconds=" + i2 + ")";
    }

    public UserTrackingConfig(boolean z, int i, int i2) {
        this.enabled = z;
        this.trackIntervalSeconds = i;
        this.bluetoothScanDurationSeconds = i2;
    }

    public /* synthetic */ UserTrackingConfig(boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 60 : i, (i3 & 4) != 0 ? 5 : i2);
    }
}
