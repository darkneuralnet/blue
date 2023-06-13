package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.AdyenEnvironment;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/wire/configs/AdyenConfig;", "", "environment", "Lco/bird/android/model/constant/AdyenEnvironment;", "publicKey", "", "clientKey", "(Lco/bird/android/model/constant/AdyenEnvironment;Ljava/lang/String;Ljava/lang/String;)V", "getClientKey", "()Ljava/lang/String;", "getEnvironment", "()Lco/bird/android/model/constant/AdyenEnvironment;", "getPublicKey", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AdyenConfig {
    @JsonProperty("client_key")
    @InterfaceC41208ft5("client_key")
    private final String clientKey;
    @JsonProperty("environment")
    @InterfaceC41208ft5("environment")
    private final AdyenEnvironment environment;
    @JsonProperty("public_key")
    @InterfaceC41208ft5("public_key")
    private final String publicKey;

    public AdyenConfig() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AdyenConfig copy$default(AdyenConfig adyenConfig, AdyenEnvironment adyenEnvironment, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            adyenEnvironment = adyenConfig.environment;
        }
        if ((i & 2) != 0) {
            str = adyenConfig.publicKey;
        }
        if ((i & 4) != 0) {
            str2 = adyenConfig.clientKey;
        }
        return adyenConfig.copy(adyenEnvironment, str, str2);
    }

    public final AdyenEnvironment component1() {
        return this.environment;
    }

    public final String component2() {
        return this.publicKey;
    }

    public final String component3() {
        return this.clientKey;
    }

    public final AdyenConfig copy(AdyenEnvironment adyenEnvironment, String str, String str2) {
        return new AdyenConfig(adyenEnvironment, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdyenConfig) {
            AdyenConfig adyenConfig = (AdyenConfig) obj;
            return this.environment == adyenConfig.environment && Intrinsics.areEqual(this.publicKey, adyenConfig.publicKey) && Intrinsics.areEqual(this.clientKey, adyenConfig.clientKey);
        }
        return false;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final AdyenEnvironment getEnvironment() {
        return this.environment;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        AdyenEnvironment adyenEnvironment = this.environment;
        int hashCode = (adyenEnvironment == null ? 0 : adyenEnvironment.hashCode()) * 31;
        String str = this.publicKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clientKey;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        AdyenEnvironment adyenEnvironment = this.environment;
        String str = this.publicKey;
        String str2 = this.clientKey;
        return "AdyenConfig(environment=" + adyenEnvironment + ", publicKey=" + str + ", clientKey=" + str2 + ")";
    }

    public AdyenConfig(AdyenEnvironment adyenEnvironment, String str, String str2) {
        this.environment = adyenEnvironment;
        this.publicKey = str;
        this.clientKey = str2;
    }

    public /* synthetic */ AdyenConfig(AdyenEnvironment adyenEnvironment, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : adyenEnvironment, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
