package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003J_\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m28432d2 = {"Lco/bird/android/model/wire/configs/DeviceVerificationEndpointConfig;", "", "action", "", "enabled", "", "service", "httpMethod", "path", "verificationMethods", "", "Lco/bird/android/model/wire/configs/VerificationMethod;", "strategy", "Lco/bird/android/model/wire/configs/DeviceVerificationStrategy;", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lco/bird/android/model/wire/configs/DeviceVerificationStrategy;)V", "getAction", "()Ljava/lang/String;", "getEnabled", "()Z", "getHttpMethod", "getPath", "getService", "getStrategy", "()Lco/bird/android/model/wire/configs/DeviceVerificationStrategy;", "getVerificationMethods", "()Ljava/util/Set;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DeviceVerificationEndpointConfig {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final String action;
    @JsonProperty("enabled")
    @InterfaceC41208ft5("enabled")
    private final boolean enabled;
    @JsonProperty("http_method")
    @InterfaceC41208ft5("http_method")
    private final String httpMethod;
    @JsonProperty("path")
    @InterfaceC41208ft5("path")
    private final String path;
    @JsonProperty("service")
    @InterfaceC41208ft5("service")
    private final String service;
    @JsonProperty("strategy")
    @InterfaceC41208ft5("strategy")
    private final DeviceVerificationStrategy strategy;
    @JsonProperty("verification_methods")
    @InterfaceC41208ft5("verification_methods")
    private final Set<VerificationMethod> verificationMethods;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceVerificationEndpointConfig(String action, boolean z, String str, String str2, String str3, Set<? extends VerificationMethod> set, DeviceVerificationStrategy deviceVerificationStrategy) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.action = action;
        this.enabled = z;
        this.service = str;
        this.httpMethod = str2;
        this.path = str3;
        this.verificationMethods = set;
        this.strategy = deviceVerificationStrategy;
    }

    public static /* synthetic */ DeviceVerificationEndpointConfig copy$default(DeviceVerificationEndpointConfig deviceVerificationEndpointConfig, String str, boolean z, String str2, String str3, String str4, Set set, DeviceVerificationStrategy deviceVerificationStrategy, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceVerificationEndpointConfig.action;
        }
        if ((i & 2) != 0) {
            z = deviceVerificationEndpointConfig.enabled;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            str2 = deviceVerificationEndpointConfig.service;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = deviceVerificationEndpointConfig.httpMethod;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = deviceVerificationEndpointConfig.path;
        }
        String str7 = str4;
        Set<VerificationMethod> set2 = set;
        if ((i & 32) != 0) {
            set2 = deviceVerificationEndpointConfig.verificationMethods;
        }
        Set set3 = set2;
        if ((i & 64) != 0) {
            deviceVerificationStrategy = deviceVerificationEndpointConfig.strategy;
        }
        return deviceVerificationEndpointConfig.copy(str, z2, str5, str6, str7, set3, deviceVerificationStrategy);
    }

    public final String component1() {
        return this.action;
    }

    public final boolean component2() {
        return this.enabled;
    }

    public final String component3() {
        return this.service;
    }

    public final String component4() {
        return this.httpMethod;
    }

    public final String component5() {
        return this.path;
    }

    public final Set<VerificationMethod> component6() {
        return this.verificationMethods;
    }

    public final DeviceVerificationStrategy component7() {
        return this.strategy;
    }

    public final DeviceVerificationEndpointConfig copy(String action, boolean z, String str, String str2, String str3, Set<? extends VerificationMethod> set, DeviceVerificationStrategy deviceVerificationStrategy) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new DeviceVerificationEndpointConfig(action, z, str, str2, str3, set, deviceVerificationStrategy);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceVerificationEndpointConfig) {
            DeviceVerificationEndpointConfig deviceVerificationEndpointConfig = (DeviceVerificationEndpointConfig) obj;
            return Intrinsics.areEqual(this.action, deviceVerificationEndpointConfig.action) && this.enabled == deviceVerificationEndpointConfig.enabled && Intrinsics.areEqual(this.service, deviceVerificationEndpointConfig.service) && Intrinsics.areEqual(this.httpMethod, deviceVerificationEndpointConfig.httpMethod) && Intrinsics.areEqual(this.path, deviceVerificationEndpointConfig.path) && Intrinsics.areEqual(this.verificationMethods, deviceVerificationEndpointConfig.verificationMethods) && this.strategy == deviceVerificationEndpointConfig.strategy;
        }
        return false;
    }

    public final String getAction() {
        return this.action;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getHttpMethod() {
        return this.httpMethod;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getService() {
        return this.service;
    }

    public final DeviceVerificationStrategy getStrategy() {
        return this.strategy;
    }

    public final Set<VerificationMethod> getVerificationMethods() {
        return this.verificationMethods;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.action.hashCode() * 31;
        boolean z = this.enabled;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.service;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.httpMethod;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.path;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Set<VerificationMethod> set = this.verificationMethods;
        int hashCode5 = (hashCode4 + (set == null ? 0 : set.hashCode())) * 31;
        DeviceVerificationStrategy deviceVerificationStrategy = this.strategy;
        return hashCode5 + (deviceVerificationStrategy != null ? deviceVerificationStrategy.hashCode() : 0);
    }

    public String toString() {
        String str = this.action;
        boolean z = this.enabled;
        String str2 = this.service;
        String str3 = this.httpMethod;
        String str4 = this.path;
        Set<VerificationMethod> set = this.verificationMethods;
        DeviceVerificationStrategy deviceVerificationStrategy = this.strategy;
        return "DeviceVerificationEndpointConfig(action=" + str + ", enabled=" + z + ", service=" + str2 + ", httpMethod=" + str3 + ", path=" + str4 + ", verificationMethods=" + set + ", strategy=" + deviceVerificationStrategy + ")";
    }

    public /* synthetic */ DeviceVerificationEndpointConfig(String str, boolean z, String str2, String str3, String str4, Set set, DeviceVerificationStrategy deviceVerificationStrategy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : set, (i & 64) == 0 ? deviceVerificationStrategy : null);
    }
}
