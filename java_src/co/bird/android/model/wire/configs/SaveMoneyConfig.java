package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28432d2 = {"Lco/bird/android/model/wire/configs/SaveMoneyConfig;", "", "enabled", "", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SaveMoneyConfig {
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;

    public SaveMoneyConfig() {
        this(false, 1, null);
    }

    public static /* synthetic */ SaveMoneyConfig copy$default(SaveMoneyConfig saveMoneyConfig, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = saveMoneyConfig.enabled;
        }
        return saveMoneyConfig.copy(z);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final SaveMoneyConfig copy(boolean z) {
        return new SaveMoneyConfig(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SaveMoneyConfig) && this.enabled == ((SaveMoneyConfig) obj).enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        boolean z = this.enabled;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.enabled;
        return "SaveMoneyConfig(enabled=" + z + ")";
    }

    public SaveMoneyConfig(boolean z) {
        this.enabled = z;
    }

    public /* synthetic */ SaveMoneyConfig(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
