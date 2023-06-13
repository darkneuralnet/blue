package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/api/request/ConfigureAutoReloadRequest;", "", "optionId", "", "enable", "", "(Ljava/lang/String;Z)V", "getEnable", "()Z", "getOptionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ConfigureAutoReloadRequest {
    private final boolean enable;
    private final String optionId;

    public ConfigureAutoReloadRequest(String str, boolean z) {
        this.optionId = str;
        this.enable = z;
    }

    public static /* synthetic */ ConfigureAutoReloadRequest copy$default(ConfigureAutoReloadRequest configureAutoReloadRequest, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = configureAutoReloadRequest.optionId;
        }
        if ((i & 2) != 0) {
            z = configureAutoReloadRequest.enable;
        }
        return configureAutoReloadRequest.copy(str, z);
    }

    public final String component1() {
        return this.optionId;
    }

    public final boolean component2() {
        return this.enable;
    }

    public final ConfigureAutoReloadRequest copy(String str, boolean z) {
        return new ConfigureAutoReloadRequest(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfigureAutoReloadRequest) {
            ConfigureAutoReloadRequest configureAutoReloadRequest = (ConfigureAutoReloadRequest) obj;
            return Intrinsics.areEqual(this.optionId, configureAutoReloadRequest.optionId) && this.enable == configureAutoReloadRequest.enable;
        }
        return false;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getOptionId() {
        return this.optionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.optionId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.enable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.optionId;
        boolean z = this.enable;
        return "ConfigureAutoReloadRequest(optionId=" + str + ", enable=" + z + ")";
    }
}
