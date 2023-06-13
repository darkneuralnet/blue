package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/wire/configs/PrivateBirdAdHocPairingConfig;", "", "allowedModels", "", "", "", "(Ljava/util/Map;)V", "getAllowedModels", "()Ljava/util/Map;", "component1", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PrivateBirdAdHocPairingConfig {
    @JsonProperty("allowed_models")
    @InterfaceC41208ft5("allowed_models")
    private final Map<String, Boolean> allowedModels;

    public PrivateBirdAdHocPairingConfig() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivateBirdAdHocPairingConfig copy$default(PrivateBirdAdHocPairingConfig privateBirdAdHocPairingConfig, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = privateBirdAdHocPairingConfig.allowedModels;
        }
        return privateBirdAdHocPairingConfig.copy(map);
    }

    public final Map<String, Boolean> component1() {
        return this.allowedModels;
    }

    public final PrivateBirdAdHocPairingConfig copy(Map<String, Boolean> allowedModels) {
        Intrinsics.checkNotNullParameter(allowedModels, "allowedModels");
        return new PrivateBirdAdHocPairingConfig(allowedModels);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrivateBirdAdHocPairingConfig) && Intrinsics.areEqual(this.allowedModels, ((PrivateBirdAdHocPairingConfig) obj).allowedModels);
    }

    public final Map<String, Boolean> getAllowedModels() {
        return this.allowedModels;
    }

    public int hashCode() {
        return this.allowedModels.hashCode();
    }

    public String toString() {
        Map<String, Boolean> map = this.allowedModels;
        return "PrivateBirdAdHocPairingConfig(allowedModels=" + map + ")";
    }

    public PrivateBirdAdHocPairingConfig(Map<String, Boolean> allowedModels) {
        Intrinsics.checkNotNullParameter(allowedModels, "allowedModels");
        this.allowedModels = allowedModels;
    }

    public /* synthetic */ PrivateBirdAdHocPairingConfig(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt__MapsKt.emptyMap() : map);
    }
}
