package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R$\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/wire/configs/DeviceVerificationConfig;", "", "endpoints", "", "", "Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;", "recaptcha", "Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;", "(Ljava/util/Map;Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;)V", "getEndpoints", "()Ljava/util/Map;", "getRecaptcha", "()Lco/bird/android/model/wire/configs/DeviceVerificationRecaptchaConfig;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DeviceVerificationConfig {
    @JsonProperty("endpoints")
    @InterfaceC41208ft5("endpoints")
    private final Map<String, DeviceVerificationEndpointConfig> endpoints;
    @JsonProperty("recaptcha")
    @InterfaceC41208ft5("recaptcha")
    private final DeviceVerificationRecaptchaConfig recaptcha;

    public DeviceVerificationConfig() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceVerificationConfig copy$default(DeviceVerificationConfig deviceVerificationConfig, Map map, DeviceVerificationRecaptchaConfig deviceVerificationRecaptchaConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            map = deviceVerificationConfig.endpoints;
        }
        if ((i & 2) != 0) {
            deviceVerificationRecaptchaConfig = deviceVerificationConfig.recaptcha;
        }
        return deviceVerificationConfig.copy(map, deviceVerificationRecaptchaConfig);
    }

    public final Map<String, DeviceVerificationEndpointConfig> component1() {
        return this.endpoints;
    }

    public final DeviceVerificationRecaptchaConfig component2() {
        return this.recaptcha;
    }

    public final DeviceVerificationConfig copy(Map<String, DeviceVerificationEndpointConfig> map, DeviceVerificationRecaptchaConfig recaptcha) {
        Intrinsics.checkNotNullParameter(recaptcha, "recaptcha");
        return new DeviceVerificationConfig(map, recaptcha);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceVerificationConfig) {
            DeviceVerificationConfig deviceVerificationConfig = (DeviceVerificationConfig) obj;
            return Intrinsics.areEqual(this.endpoints, deviceVerificationConfig.endpoints) && Intrinsics.areEqual(this.recaptcha, deviceVerificationConfig.recaptcha);
        }
        return false;
    }

    public final Map<String, DeviceVerificationEndpointConfig> getEndpoints() {
        return this.endpoints;
    }

    public final DeviceVerificationRecaptchaConfig getRecaptcha() {
        return this.recaptcha;
    }

    public int hashCode() {
        Map<String, DeviceVerificationEndpointConfig> map = this.endpoints;
        return ((map == null ? 0 : map.hashCode()) * 31) + this.recaptcha.hashCode();
    }

    public String toString() {
        Map<String, DeviceVerificationEndpointConfig> map = this.endpoints;
        DeviceVerificationRecaptchaConfig deviceVerificationRecaptchaConfig = this.recaptcha;
        return "DeviceVerificationConfig(endpoints=" + map + ", recaptcha=" + deviceVerificationRecaptchaConfig + ")";
    }

    public DeviceVerificationConfig(Map<String, DeviceVerificationEndpointConfig> map, DeviceVerificationRecaptchaConfig recaptcha) {
        Intrinsics.checkNotNullParameter(recaptcha, "recaptcha");
        this.endpoints = map;
        this.recaptcha = recaptcha;
    }

    public /* synthetic */ DeviceVerificationConfig(Map map, DeviceVerificationRecaptchaConfig deviceVerificationRecaptchaConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? new DeviceVerificationRecaptchaConfig(null, 1, null) : deviceVerificationRecaptchaConfig);
    }
}
