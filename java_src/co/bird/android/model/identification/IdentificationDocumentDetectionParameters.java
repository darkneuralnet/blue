package co.bird.android.model.identification;

import co.bird.android.model.LegacyRepairType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\"\u001a\u00020\tHÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010%\u001a\u00020\tHÆ\u0003J|\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006."}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;", "", "aspectRatio", "", "aspectRatioTolerancePercent", "quadratureToleranceDegrees", "minimumSize", "blurVarianceThreshold", "faceRequired", "", "stringRequirements", "", "Lco/bird/android/model/identification/IdentificationDocumentStringsRequirements;", "minLandmarkWidthRatio", "enableManualImageHeuristics", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;Z)V", "getAspectRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAspectRatioTolerancePercent", "getBlurVarianceThreshold", "getEnableManualImageHeuristics", "()Z", "getFaceRequired", "getMinLandmarkWidthRatio", "getMinimumSize", "getQuadratureToleranceDegrees", "getStringRequirements", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/util/List;Ljava/lang/Double;Z)Lco/bird/android/model/identification/IdentificationDocumentDetectionParameters;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdentificationDocumentDetectionParameters {
    private final Double aspectRatio;
    private final Double aspectRatioTolerancePercent;
    private final Double blurVarianceThreshold;
    private final boolean enableManualImageHeuristics;
    private final boolean faceRequired;
    private final Double minLandmarkWidthRatio;
    private final Double minimumSize;
    private final Double quadratureToleranceDegrees;
    private final List<IdentificationDocumentStringsRequirements> stringRequirements;

    public IdentificationDocumentDetectionParameters(Double d, Double d2, Double d3, Double d4, Double d5, boolean z, List<IdentificationDocumentStringsRequirements> list, Double d6, boolean z2) {
        this.aspectRatio = d;
        this.aspectRatioTolerancePercent = d2;
        this.quadratureToleranceDegrees = d3;
        this.minimumSize = d4;
        this.blurVarianceThreshold = d5;
        this.faceRequired = z;
        this.stringRequirements = list;
        this.minLandmarkWidthRatio = d6;
        this.enableManualImageHeuristics = z2;
    }

    public final Double component1() {
        return this.aspectRatio;
    }

    public final Double component2() {
        return this.aspectRatioTolerancePercent;
    }

    public final Double component3() {
        return this.quadratureToleranceDegrees;
    }

    public final Double component4() {
        return this.minimumSize;
    }

    public final Double component5() {
        return this.blurVarianceThreshold;
    }

    public final boolean component6() {
        return this.faceRequired;
    }

    public final List<IdentificationDocumentStringsRequirements> component7() {
        return this.stringRequirements;
    }

    public final Double component8() {
        return this.minLandmarkWidthRatio;
    }

    public final boolean component9() {
        return this.enableManualImageHeuristics;
    }

    public final IdentificationDocumentDetectionParameters copy(Double d, Double d2, Double d3, Double d4, Double d5, boolean z, List<IdentificationDocumentStringsRequirements> list, Double d6, boolean z2) {
        return new IdentificationDocumentDetectionParameters(d, d2, d3, d4, d5, z, list, d6, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentificationDocumentDetectionParameters) {
            IdentificationDocumentDetectionParameters identificationDocumentDetectionParameters = (IdentificationDocumentDetectionParameters) obj;
            return Intrinsics.areEqual((Object) this.aspectRatio, (Object) identificationDocumentDetectionParameters.aspectRatio) && Intrinsics.areEqual((Object) this.aspectRatioTolerancePercent, (Object) identificationDocumentDetectionParameters.aspectRatioTolerancePercent) && Intrinsics.areEqual((Object) this.quadratureToleranceDegrees, (Object) identificationDocumentDetectionParameters.quadratureToleranceDegrees) && Intrinsics.areEqual((Object) this.minimumSize, (Object) identificationDocumentDetectionParameters.minimumSize) && Intrinsics.areEqual((Object) this.blurVarianceThreshold, (Object) identificationDocumentDetectionParameters.blurVarianceThreshold) && this.faceRequired == identificationDocumentDetectionParameters.faceRequired && Intrinsics.areEqual(this.stringRequirements, identificationDocumentDetectionParameters.stringRequirements) && Intrinsics.areEqual((Object) this.minLandmarkWidthRatio, (Object) identificationDocumentDetectionParameters.minLandmarkWidthRatio) && this.enableManualImageHeuristics == identificationDocumentDetectionParameters.enableManualImageHeuristics;
        }
        return false;
    }

    public final Double getAspectRatio() {
        return this.aspectRatio;
    }

    public final Double getAspectRatioTolerancePercent() {
        return this.aspectRatioTolerancePercent;
    }

    public final Double getBlurVarianceThreshold() {
        return this.blurVarianceThreshold;
    }

    public final boolean getEnableManualImageHeuristics() {
        return this.enableManualImageHeuristics;
    }

    public final boolean getFaceRequired() {
        return this.faceRequired;
    }

    public final Double getMinLandmarkWidthRatio() {
        return this.minLandmarkWidthRatio;
    }

    public final Double getMinimumSize() {
        return this.minimumSize;
    }

    public final Double getQuadratureToleranceDegrees() {
        return this.quadratureToleranceDegrees;
    }

    public final List<IdentificationDocumentStringsRequirements> getStringRequirements() {
        return this.stringRequirements;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Double d = this.aspectRatio;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.aspectRatioTolerancePercent;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.quadratureToleranceDegrees;
        int hashCode3 = (hashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.minimumSize;
        int hashCode4 = (hashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.blurVarianceThreshold;
        int hashCode5 = (hashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        boolean z = this.faceRequired;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        List<IdentificationDocumentStringsRequirements> list = this.stringRequirements;
        int hashCode6 = (i2 + (list == null ? 0 : list.hashCode())) * 31;
        Double d6 = this.minLandmarkWidthRatio;
        int hashCode7 = (hashCode6 + (d6 != null ? d6.hashCode() : 0)) * 31;
        boolean z2 = this.enableManualImageHeuristics;
        return hashCode7 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        Double d = this.aspectRatio;
        Double d2 = this.aspectRatioTolerancePercent;
        Double d3 = this.quadratureToleranceDegrees;
        Double d4 = this.minimumSize;
        Double d5 = this.blurVarianceThreshold;
        boolean z = this.faceRequired;
        List<IdentificationDocumentStringsRequirements> list = this.stringRequirements;
        Double d6 = this.minLandmarkWidthRatio;
        boolean z2 = this.enableManualImageHeuristics;
        return "IdentificationDocumentDetectionParameters(aspectRatio=" + d + ", aspectRatioTolerancePercent=" + d2 + ", quadratureToleranceDegrees=" + d3 + ", minimumSize=" + d4 + ", blurVarianceThreshold=" + d5 + ", faceRequired=" + z + ", stringRequirements=" + list + ", minLandmarkWidthRatio=" + d6 + ", enableManualImageHeuristics=" + z2 + ")";
    }

    public /* synthetic */ IdentificationDocumentDetectionParameters(Double d, Double d2, Double d3, Double d4, Double d5, boolean z, List list, Double d6, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, d4, d5, (i & 32) != 0 ? false : z, list, d6, z2);
    }
}
