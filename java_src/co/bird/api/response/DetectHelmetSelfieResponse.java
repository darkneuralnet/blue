package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\fJV\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\tHÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000f¨\u0006#"}, m28432d2 = {"Lco/bird/api/response/DetectHelmetSelfieResponse;", "", "headCoverOnHeadConfidence", "", "headConfidence", "headCoverConfidence", "faceConfidence", "finalConfidence", "couponAmount", "", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)V", "getCouponAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFaceConfidence", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFinalConfidence", "getHeadConfidence", "getHeadCoverConfidence", "getHeadCoverOnHeadConfidence", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;)Lco/bird/api/response/DetectHelmetSelfieResponse;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DetectHelmetSelfieResponse {
    @JsonProperty("coupon_amount")
    @InterfaceC41208ft5("coupon_amount")
    private final Integer couponAmount;
    @JsonProperty("face_confidence")
    @InterfaceC41208ft5("face_confidence")
    private final Double faceConfidence;
    @JsonProperty("final_confidence")
    @InterfaceC41208ft5("final_confidence")
    private final Double finalConfidence;
    @JsonProperty("head_confidence")
    @InterfaceC41208ft5("head_confidence")
    private final Double headConfidence;
    @JsonProperty("head_cover_confidence")
    @InterfaceC41208ft5("head_cover_confidence")
    private final Double headCoverConfidence;
    @JsonProperty("head_cover_on_head_confidence")
    @InterfaceC41208ft5("head_cover_on_head_confidence")
    private final Double headCoverOnHeadConfidence;

    public DetectHelmetSelfieResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ DetectHelmetSelfieResponse copy$default(DetectHelmetSelfieResponse detectHelmetSelfieResponse, Double d, Double d2, Double d3, Double d4, Double d5, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            d = detectHelmetSelfieResponse.headCoverOnHeadConfidence;
        }
        if ((i & 2) != 0) {
            d2 = detectHelmetSelfieResponse.headConfidence;
        }
        Double d6 = d2;
        if ((i & 4) != 0) {
            d3 = detectHelmetSelfieResponse.headCoverConfidence;
        }
        Double d7 = d3;
        if ((i & 8) != 0) {
            d4 = detectHelmetSelfieResponse.faceConfidence;
        }
        Double d8 = d4;
        if ((i & 16) != 0) {
            d5 = detectHelmetSelfieResponse.finalConfidence;
        }
        Double d9 = d5;
        if ((i & 32) != 0) {
            num = detectHelmetSelfieResponse.couponAmount;
        }
        return detectHelmetSelfieResponse.copy(d, d6, d7, d8, d9, num);
    }

    public final Double component1() {
        return this.headCoverOnHeadConfidence;
    }

    public final Double component2() {
        return this.headConfidence;
    }

    public final Double component3() {
        return this.headCoverConfidence;
    }

    public final Double component4() {
        return this.faceConfidence;
    }

    public final Double component5() {
        return this.finalConfidence;
    }

    public final Integer component6() {
        return this.couponAmount;
    }

    public final DetectHelmetSelfieResponse copy(Double d, Double d2, Double d3, Double d4, Double d5, Integer num) {
        return new DetectHelmetSelfieResponse(d, d2, d3, d4, d5, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DetectHelmetSelfieResponse) {
            DetectHelmetSelfieResponse detectHelmetSelfieResponse = (DetectHelmetSelfieResponse) obj;
            return Intrinsics.areEqual((Object) this.headCoverOnHeadConfidence, (Object) detectHelmetSelfieResponse.headCoverOnHeadConfidence) && Intrinsics.areEqual((Object) this.headConfidence, (Object) detectHelmetSelfieResponse.headConfidence) && Intrinsics.areEqual((Object) this.headCoverConfidence, (Object) detectHelmetSelfieResponse.headCoverConfidence) && Intrinsics.areEqual((Object) this.faceConfidence, (Object) detectHelmetSelfieResponse.faceConfidence) && Intrinsics.areEqual((Object) this.finalConfidence, (Object) detectHelmetSelfieResponse.finalConfidence) && Intrinsics.areEqual(this.couponAmount, detectHelmetSelfieResponse.couponAmount);
        }
        return false;
    }

    public final Integer getCouponAmount() {
        return this.couponAmount;
    }

    public final Double getFaceConfidence() {
        return this.faceConfidence;
    }

    public final Double getFinalConfidence() {
        return this.finalConfidence;
    }

    public final Double getHeadConfidence() {
        return this.headConfidence;
    }

    public final Double getHeadCoverConfidence() {
        return this.headCoverConfidence;
    }

    public final Double getHeadCoverOnHeadConfidence() {
        return this.headCoverOnHeadConfidence;
    }

    public int hashCode() {
        Double d = this.headCoverOnHeadConfidence;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.headConfidence;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.headCoverConfidence;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.faceConfidence;
        int hashCode4 = (hashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.finalConfidence;
        int hashCode5 = (hashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Integer num = this.couponAmount;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        Double d = this.headCoverOnHeadConfidence;
        Double d2 = this.headConfidence;
        Double d3 = this.headCoverConfidence;
        Double d4 = this.faceConfidence;
        Double d5 = this.finalConfidence;
        Integer num = this.couponAmount;
        return "DetectHelmetSelfieResponse(headCoverOnHeadConfidence=" + d + ", headConfidence=" + d2 + ", headCoverConfidence=" + d3 + ", faceConfidence=" + d4 + ", finalConfidence=" + d5 + ", couponAmount=" + num + ")";
    }

    public DetectHelmetSelfieResponse(Double d, Double d2, Double d3, Double d4, Double d5, Integer num) {
        this.headCoverOnHeadConfidence = d;
        this.headConfidence = d2;
        this.headCoverConfidence = d3;
        this.faceConfidence = d4;
        this.finalConfidence = d5;
        this.couponAmount = num;
    }

    public /* synthetic */ DetectHelmetSelfieResponse(Double d, Double d2, Double d3, Double d4, Double d5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? null : d3, (i & 8) != 0 ? null : d4, (i & 16) != 0 ? null : d5, (i & 32) != 0 ? null : num);
    }
}
