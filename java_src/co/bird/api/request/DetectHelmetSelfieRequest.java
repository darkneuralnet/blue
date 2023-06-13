package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/request/DetectHelmetSelfieRequest;", "", "imageUrl", "", "minConfidence", "", "rideId", "(Ljava/lang/String;FLjava/lang/String;)V", "getImageUrl", "()Ljava/lang/String;", "getMinConfidence", "()F", "getRideId", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DetectHelmetSelfieRequest {
    @JsonProperty("image_url")
    @InterfaceC41208ft5("image_url")
    private final String imageUrl;
    @JsonProperty("min_confidence")
    @InterfaceC41208ft5("min_confidence")
    private final float minConfidence;
    @JsonProperty("ride_id")
    @InterfaceC41208ft5("ride_id")
    private final String rideId;

    public DetectHelmetSelfieRequest(String imageUrl, float f, String str) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.imageUrl = imageUrl;
        this.minConfidence = f;
        this.rideId = str;
    }

    public static /* synthetic */ DetectHelmetSelfieRequest copy$default(DetectHelmetSelfieRequest detectHelmetSelfieRequest, String str, float f, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detectHelmetSelfieRequest.imageUrl;
        }
        if ((i & 2) != 0) {
            f = detectHelmetSelfieRequest.minConfidence;
        }
        if ((i & 4) != 0) {
            str2 = detectHelmetSelfieRequest.rideId;
        }
        return detectHelmetSelfieRequest.copy(str, f, str2);
    }

    public final String component1() {
        return this.imageUrl;
    }

    public final float component2() {
        return this.minConfidence;
    }

    public final String component3() {
        return this.rideId;
    }

    public final DetectHelmetSelfieRequest copy(String imageUrl, float f, String str) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new DetectHelmetSelfieRequest(imageUrl, f, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DetectHelmetSelfieRequest) {
            DetectHelmetSelfieRequest detectHelmetSelfieRequest = (DetectHelmetSelfieRequest) obj;
            return Intrinsics.areEqual(this.imageUrl, detectHelmetSelfieRequest.imageUrl) && Float.compare(this.minConfidence, detectHelmetSelfieRequest.minConfidence) == 0 && Intrinsics.areEqual(this.rideId, detectHelmetSelfieRequest.rideId);
        }
        return false;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final float getMinConfidence() {
        return this.minConfidence;
    }

    public final String getRideId() {
        return this.rideId;
    }

    public int hashCode() {
        int hashCode = ((this.imageUrl.hashCode() * 31) + Float.hashCode(this.minConfidence)) * 31;
        String str = this.rideId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.imageUrl;
        float f = this.minConfidence;
        String str2 = this.rideId;
        return "DetectHelmetSelfieRequest(imageUrl=" + str + ", minConfidence=" + f + ", rideId=" + str2 + ")";
    }

    public /* synthetic */ DetectHelmetSelfieRequest(String str, float f, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, (i & 4) != 0 ? null : str2);
    }
}
