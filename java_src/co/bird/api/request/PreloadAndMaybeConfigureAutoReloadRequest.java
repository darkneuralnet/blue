package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/request/PreloadAndMaybeConfigureAutoReloadRequest;", "", "optionId", "", "enableAutoReload", "", "intentId", "(Ljava/lang/String;ZLjava/lang/String;)V", "getEnableAutoReload", "()Z", "getIntentId", "()Ljava/lang/String;", "getOptionId", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PreloadAndMaybeConfigureAutoReloadRequest {
    private final boolean enableAutoReload;
    private final String intentId;
    private final String optionId;

    public PreloadAndMaybeConfigureAutoReloadRequest(String optionId, boolean z, String str) {
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        this.optionId = optionId;
        this.enableAutoReload = z;
        this.intentId = str;
    }

    public static /* synthetic */ PreloadAndMaybeConfigureAutoReloadRequest copy$default(PreloadAndMaybeConfigureAutoReloadRequest preloadAndMaybeConfigureAutoReloadRequest, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preloadAndMaybeConfigureAutoReloadRequest.optionId;
        }
        if ((i & 2) != 0) {
            z = preloadAndMaybeConfigureAutoReloadRequest.enableAutoReload;
        }
        if ((i & 4) != 0) {
            str2 = preloadAndMaybeConfigureAutoReloadRequest.intentId;
        }
        return preloadAndMaybeConfigureAutoReloadRequest.copy(str, z, str2);
    }

    public final String component1() {
        return this.optionId;
    }

    public final boolean component2() {
        return this.enableAutoReload;
    }

    public final String component3() {
        return this.intentId;
    }

    public final PreloadAndMaybeConfigureAutoReloadRequest copy(String optionId, boolean z, String str) {
        Intrinsics.checkNotNullParameter(optionId, "optionId");
        return new PreloadAndMaybeConfigureAutoReloadRequest(optionId, z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PreloadAndMaybeConfigureAutoReloadRequest) {
            PreloadAndMaybeConfigureAutoReloadRequest preloadAndMaybeConfigureAutoReloadRequest = (PreloadAndMaybeConfigureAutoReloadRequest) obj;
            return Intrinsics.areEqual(this.optionId, preloadAndMaybeConfigureAutoReloadRequest.optionId) && this.enableAutoReload == preloadAndMaybeConfigureAutoReloadRequest.enableAutoReload && Intrinsics.areEqual(this.intentId, preloadAndMaybeConfigureAutoReloadRequest.intentId);
        }
        return false;
    }

    public final boolean getEnableAutoReload() {
        return this.enableAutoReload;
    }

    public final String getIntentId() {
        return this.intentId;
    }

    public final String getOptionId() {
        return this.optionId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.optionId.hashCode() * 31;
        boolean z = this.enableAutoReload;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.intentId;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.optionId;
        boolean z = this.enableAutoReload;
        String str2 = this.intentId;
        return "PreloadAndMaybeConfigureAutoReloadRequest(optionId=" + str + ", enableAutoReload=" + z + ", intentId=" + str2 + ")";
    }

    public /* synthetic */ PreloadAndMaybeConfigureAutoReloadRequest(String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? null : str2);
    }
}
