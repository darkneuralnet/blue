package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/api/response/QuickCaptureResponse;", "", "success", "", "timeout", "", "(ZI)V", "getSuccess", "()Z", "getTimeout", "()I", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class QuickCaptureResponse {
    @JsonProperty("success")
    @InterfaceC41208ft5("success")
    private final boolean success;
    @JsonProperty("timeout")
    @InterfaceC41208ft5("timeout")
    private final int timeout;

    public QuickCaptureResponse() {
        this(false, 0, 3, null);
    }

    public static /* synthetic */ QuickCaptureResponse copy$default(QuickCaptureResponse quickCaptureResponse, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = quickCaptureResponse.success;
        }
        if ((i2 & 2) != 0) {
            i = quickCaptureResponse.timeout;
        }
        return quickCaptureResponse.copy(z, i);
    }

    public final boolean component1() {
        return this.success;
    }

    public final int component2() {
        return this.timeout;
    }

    public final QuickCaptureResponse copy(boolean z, int i) {
        return new QuickCaptureResponse(z, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QuickCaptureResponse) {
            QuickCaptureResponse quickCaptureResponse = (QuickCaptureResponse) obj;
            return this.success == quickCaptureResponse.success && this.timeout == quickCaptureResponse.timeout;
        }
        return false;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public final int getTimeout() {
        return this.timeout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.success;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + Integer.hashCode(this.timeout);
    }

    public String toString() {
        boolean z = this.success;
        int i = this.timeout;
        return "QuickCaptureResponse(success=" + z + ", timeout=" + i + ")";
    }

    public QuickCaptureResponse(boolean z, int i) {
        this.success = z;
        this.timeout = i;
    }

    public /* synthetic */ QuickCaptureResponse(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i);
    }
}
