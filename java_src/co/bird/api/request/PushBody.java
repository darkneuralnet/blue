package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/request/PushBody;", "", "token", "", "platform", "sandbox", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getPlatform", "()Ljava/lang/String;", "getSandbox", "()Z", "getToken", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PushBody {
    @JsonProperty("platform")
    @InterfaceC41208ft5("platform")
    private final String platform;
    @JsonProperty("sandbox")
    @InterfaceC41208ft5("sandbox")
    private final boolean sandbox;
    @JsonProperty("token")
    @InterfaceC41208ft5("token")
    private final String token;

    public PushBody(String token, String platform, boolean z) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.token = token;
        this.platform = platform;
        this.sandbox = z;
    }

    public static /* synthetic */ PushBody copy$default(PushBody pushBody, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushBody.token;
        }
        if ((i & 2) != 0) {
            str2 = pushBody.platform;
        }
        if ((i & 4) != 0) {
            z = pushBody.sandbox;
        }
        return pushBody.copy(str, str2, z);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.platform;
    }

    public final boolean component3() {
        return this.sandbox;
    }

    public final PushBody copy(String token, String platform, boolean z) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(platform, "platform");
        return new PushBody(token, platform, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PushBody) {
            PushBody pushBody = (PushBody) obj;
            return Intrinsics.areEqual(this.token, pushBody.token) && Intrinsics.areEqual(this.platform, pushBody.platform) && this.sandbox == pushBody.sandbox;
        }
        return false;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final boolean getSandbox() {
        return this.sandbox;
    }

    public final String getToken() {
        return this.token;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.token.hashCode() * 31) + this.platform.hashCode()) * 31;
        boolean z = this.sandbox;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.token;
        String str2 = this.platform;
        boolean z = this.sandbox;
        return "PushBody(token=" + str + ", platform=" + str2 + ", sandbox=" + z + ")";
    }

    public /* synthetic */ PushBody(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "android" : str2, (i & 4) != 0 ? false : z);
    }
}
