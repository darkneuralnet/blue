package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/response/ProvisionSmartlockResponse;", "", "smartlockResponse", "Lco/bird/api/response/ProvisionalSmartlock;", "key", "Lco/bird/api/response/ProvisionalKey;", "(Lco/bird/api/response/ProvisionalSmartlock;Lco/bird/api/response/ProvisionalKey;)V", "getKey", "()Lco/bird/api/response/ProvisionalKey;", "getSmartlockResponse", "()Lco/bird/api/response/ProvisionalSmartlock;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ProvisionSmartlockResponse {
    @JsonProperty("key")
    @InterfaceC41208ft5("key")
    private final ProvisionalKey key;
    @JsonProperty("smartlock")
    @InterfaceC41208ft5("smartlock")
    private final ProvisionalSmartlock smartlockResponse;

    public ProvisionSmartlockResponse(ProvisionalSmartlock smartlockResponse, ProvisionalKey key) {
        Intrinsics.checkNotNullParameter(smartlockResponse, "smartlockResponse");
        Intrinsics.checkNotNullParameter(key, "key");
        this.smartlockResponse = smartlockResponse;
        this.key = key;
    }

    public static /* synthetic */ ProvisionSmartlockResponse copy$default(ProvisionSmartlockResponse provisionSmartlockResponse, ProvisionalSmartlock provisionalSmartlock, ProvisionalKey provisionalKey, int i, Object obj) {
        if ((i & 1) != 0) {
            provisionalSmartlock = provisionSmartlockResponse.smartlockResponse;
        }
        if ((i & 2) != 0) {
            provisionalKey = provisionSmartlockResponse.key;
        }
        return provisionSmartlockResponse.copy(provisionalSmartlock, provisionalKey);
    }

    public final ProvisionalSmartlock component1() {
        return this.smartlockResponse;
    }

    public final ProvisionalKey component2() {
        return this.key;
    }

    public final ProvisionSmartlockResponse copy(ProvisionalSmartlock smartlockResponse, ProvisionalKey key) {
        Intrinsics.checkNotNullParameter(smartlockResponse, "smartlockResponse");
        Intrinsics.checkNotNullParameter(key, "key");
        return new ProvisionSmartlockResponse(smartlockResponse, key);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProvisionSmartlockResponse) {
            ProvisionSmartlockResponse provisionSmartlockResponse = (ProvisionSmartlockResponse) obj;
            return Intrinsics.areEqual(this.smartlockResponse, provisionSmartlockResponse.smartlockResponse) && Intrinsics.areEqual(this.key, provisionSmartlockResponse.key);
        }
        return false;
    }

    public final ProvisionalKey getKey() {
        return this.key;
    }

    public final ProvisionalSmartlock getSmartlockResponse() {
        return this.smartlockResponse;
    }

    public int hashCode() {
        return (this.smartlockResponse.hashCode() * 31) + this.key.hashCode();
    }

    public String toString() {
        ProvisionalSmartlock provisionalSmartlock = this.smartlockResponse;
        ProvisionalKey provisionalKey = this.key;
        return "ProvisionSmartlockResponse(smartlockResponse=" + provisionalSmartlock + ", key=" + provisionalKey + ")";
    }
}
