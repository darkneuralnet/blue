package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.AnalyticsFields;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/request/CaptureValidationRequest;", "", "sessionId", "", "scanIdentifier", "previousBirdIds", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPreviousBirdIds", "()Ljava/util/List;", "getScanIdentifier", "()Ljava/lang/String;", "getSessionId", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CaptureValidationRequest {
    @JsonProperty("previous_bird_ids")
    @InterfaceC41208ft5("previous_bird_ids")
    private final List<String> previousBirdIds;
    @JsonProperty("scan_identifier")
    @InterfaceC41208ft5("scan_identifier")
    private final String scanIdentifier;
    @JsonProperty(AnalyticsFields.SESSION_ID)
    @InterfaceC41208ft5(AnalyticsFields.SESSION_ID)
    private final String sessionId;

    public CaptureValidationRequest(String sessionId, String scanIdentifier, List<String> previousBirdIds) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        Intrinsics.checkNotNullParameter(previousBirdIds, "previousBirdIds");
        this.sessionId = sessionId;
        this.scanIdentifier = scanIdentifier;
        this.previousBirdIds = previousBirdIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptureValidationRequest copy$default(CaptureValidationRequest captureValidationRequest, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = captureValidationRequest.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = captureValidationRequest.scanIdentifier;
        }
        if ((i & 4) != 0) {
            list = captureValidationRequest.previousBirdIds;
        }
        return captureValidationRequest.copy(str, str2, list);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.scanIdentifier;
    }

    public final List<String> component3() {
        return this.previousBirdIds;
    }

    public final CaptureValidationRequest copy(String sessionId, String scanIdentifier, List<String> previousBirdIds) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(scanIdentifier, "scanIdentifier");
        Intrinsics.checkNotNullParameter(previousBirdIds, "previousBirdIds");
        return new CaptureValidationRequest(sessionId, scanIdentifier, previousBirdIds);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CaptureValidationRequest) {
            CaptureValidationRequest captureValidationRequest = (CaptureValidationRequest) obj;
            return Intrinsics.areEqual(this.sessionId, captureValidationRequest.sessionId) && Intrinsics.areEqual(this.scanIdentifier, captureValidationRequest.scanIdentifier) && Intrinsics.areEqual(this.previousBirdIds, captureValidationRequest.previousBirdIds);
        }
        return false;
    }

    public final List<String> getPreviousBirdIds() {
        return this.previousBirdIds;
    }

    public final String getScanIdentifier() {
        return this.scanIdentifier;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        return (((this.sessionId.hashCode() * 31) + this.scanIdentifier.hashCode()) * 31) + this.previousBirdIds.hashCode();
    }

    public String toString() {
        String str = this.sessionId;
        String str2 = this.scanIdentifier;
        List<String> list = this.previousBirdIds;
        return "CaptureValidationRequest(sessionId=" + str + ", scanIdentifier=" + str2 + ", previousBirdIds=" + list + ")";
    }
}
