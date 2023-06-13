package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/wire/configs/LocalizationOtaConfig;", "", "enabled", "", "birdProjectId", "", "enableCacheBusting", "(ZLjava/lang/String;Z)V", "getBirdProjectId", "()Ljava/lang/String;", "getEnableCacheBusting", "()Z", "getEnabled", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LocalizationOtaConfig {
    @JsonProperty("bird_project_id")
    @InterfaceC41208ft5("bird_project_id")
    private final String birdProjectId;
    @JsonProperty("enable_cache_busting")
    @InterfaceC41208ft5("enable_cache_busting")
    private final boolean enableCacheBusting;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;

    public LocalizationOtaConfig() {
        this(false, null, false, 7, null);
    }

    public static /* synthetic */ LocalizationOtaConfig copy$default(LocalizationOtaConfig localizationOtaConfig, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = localizationOtaConfig.enabled;
        }
        if ((i & 2) != 0) {
            str = localizationOtaConfig.birdProjectId;
        }
        if ((i & 4) != 0) {
            z2 = localizationOtaConfig.enableCacheBusting;
        }
        return localizationOtaConfig.copy(z, str, z2);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final String component2() {
        return this.birdProjectId;
    }

    public final boolean component3() {
        return this.enableCacheBusting;
    }

    public final LocalizationOtaConfig copy(boolean z, String str, boolean z2) {
        return new LocalizationOtaConfig(z, str, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalizationOtaConfig) {
            LocalizationOtaConfig localizationOtaConfig = (LocalizationOtaConfig) obj;
            return this.enabled == localizationOtaConfig.enabled && Intrinsics.areEqual(this.birdProjectId, localizationOtaConfig.birdProjectId) && this.enableCacheBusting == localizationOtaConfig.enableCacheBusting;
        }
        return false;
    }

    public final String getBirdProjectId() {
        return this.birdProjectId;
    }

    public final boolean getEnableCacheBusting() {
        return this.enableCacheBusting;
    }

    public final boolean getEnabled() {
        return this.enabled;
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
        int i = r0 * 31;
        String str = this.birdProjectId;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        boolean z2 = this.enableCacheBusting;
        return hashCode + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.enabled;
        String str = this.birdProjectId;
        boolean z2 = this.enableCacheBusting;
        return "LocalizationOtaConfig(enabled=" + z + ", birdProjectId=" + str + ", enableCacheBusting=" + z2 + ")";
    }

    public LocalizationOtaConfig(boolean z, String str, boolean z2) {
        this.enabled = z;
        this.birdProjectId = str;
        this.enableCacheBusting = z2;
    }

    public /* synthetic */ LocalizationOtaConfig(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2);
    }
}
