package co.bird.android.model.wire.configs;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003Jb\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, m28432d2 = {"Lco/bird/android/model/wire/configs/IdentificationConfig;", "", "enableIdentificationService", "", "onboardingBeforePayment", "autoScanTimeoutSeconds", "", "identificationHelpArticle", "", "minLandmarkWidthRatio", "", "minRectangleConfidence", "enableManualImageHeuristics", "pendingSubmissionPollingIntervalSeconds", "", "(ZZILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZJ)V", "getAutoScanTimeoutSeconds", "()I", "getEnableIdentificationService", "()Z", "getEnableManualImageHeuristics", "getIdentificationHelpArticle", "()Ljava/lang/String;", "getMinLandmarkWidthRatio", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMinRectangleConfidence", "getOnboardingBeforePayment", "getPendingSubmissionPollingIntervalSeconds", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ZZILjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;ZJ)Lco/bird/android/model/wire/configs/IdentificationConfig;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdentificationConfig {
    @JsonProperty("auto_scan_timeout_seconds")
    @InterfaceC41208ft5("auto_scan_timeout_seconds")
    private final int autoScanTimeoutSeconds;
    @JsonProperty("enable_identification_service")
    @InterfaceC41208ft5("enable_identification_service")
    private final boolean enableIdentificationService;
    @JsonProperty("enable_manual_image_heuristics")
    @InterfaceC41208ft5("enable_manual_image_heuristics")
    private final boolean enableManualImageHeuristics;
    @JsonProperty("identification_help_article")
    @InterfaceC41208ft5("identification_help_article")
    private final String identificationHelpArticle;
    @JsonProperty("min_landmark_width_ratio")
    @InterfaceC41208ft5("min_landmark_width_ratio")
    private final Double minLandmarkWidthRatio;
    @JsonProperty("min_rectangle_confidence")
    @InterfaceC41208ft5("min_rectangle_confidence")
    private final Double minRectangleConfidence;
    @JsonProperty("onboarding_before_payment")
    @InterfaceC41208ft5("onboarding_before_payment")
    private final boolean onboardingBeforePayment;
    @JsonProperty("pending_submission_polling_interval_seconds")
    @JsonAlias({"polling_interval_seconds", "pending_interval_seconds", "submission_polling_interval_seconds"})
    @InterfaceC41208ft5(alternate = {"polling_interval_seconds", "pending_interval_seconds", "submission_polling_interval_seconds"}, value = "pending_submission_polling_interval_seconds")
    private final long pendingSubmissionPollingIntervalSeconds;

    public IdentificationConfig() {
        this(false, false, 0, null, null, null, false, 0L, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final boolean component1() {
        return this.enableIdentificationService;
    }

    public final boolean component2() {
        return this.onboardingBeforePayment;
    }

    public final int component3() {
        return this.autoScanTimeoutSeconds;
    }

    public final String component4() {
        return this.identificationHelpArticle;
    }

    public final Double component5() {
        return this.minLandmarkWidthRatio;
    }

    public final Double component6() {
        return this.minRectangleConfidence;
    }

    public final boolean component7() {
        return this.enableManualImageHeuristics;
    }

    public final long component8() {
        return this.pendingSubmissionPollingIntervalSeconds;
    }

    public final IdentificationConfig copy(boolean z, boolean z2, int i, String identificationHelpArticle, Double d, Double d2, boolean z3, long j) {
        Intrinsics.checkNotNullParameter(identificationHelpArticle, "identificationHelpArticle");
        return new IdentificationConfig(z, z2, i, identificationHelpArticle, d, d2, z3, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentificationConfig) {
            IdentificationConfig identificationConfig = (IdentificationConfig) obj;
            return this.enableIdentificationService == identificationConfig.enableIdentificationService && this.onboardingBeforePayment == identificationConfig.onboardingBeforePayment && this.autoScanTimeoutSeconds == identificationConfig.autoScanTimeoutSeconds && Intrinsics.areEqual(this.identificationHelpArticle, identificationConfig.identificationHelpArticle) && Intrinsics.areEqual((Object) this.minLandmarkWidthRatio, (Object) identificationConfig.minLandmarkWidthRatio) && Intrinsics.areEqual((Object) this.minRectangleConfidence, (Object) identificationConfig.minRectangleConfidence) && this.enableManualImageHeuristics == identificationConfig.enableManualImageHeuristics && this.pendingSubmissionPollingIntervalSeconds == identificationConfig.pendingSubmissionPollingIntervalSeconds;
        }
        return false;
    }

    public final int getAutoScanTimeoutSeconds() {
        return this.autoScanTimeoutSeconds;
    }

    public final boolean getEnableIdentificationService() {
        return this.enableIdentificationService;
    }

    public final boolean getEnableManualImageHeuristics() {
        return this.enableManualImageHeuristics;
    }

    public final String getIdentificationHelpArticle() {
        return this.identificationHelpArticle;
    }

    public final Double getMinLandmarkWidthRatio() {
        return this.minLandmarkWidthRatio;
    }

    public final Double getMinRectangleConfidence() {
        return this.minRectangleConfidence;
    }

    public final boolean getOnboardingBeforePayment() {
        return this.onboardingBeforePayment;
    }

    public final long getPendingSubmissionPollingIntervalSeconds() {
        return this.pendingSubmissionPollingIntervalSeconds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.enableIdentificationService;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.onboardingBeforePayment;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int hashCode = (((((i + i2) * 31) + Integer.hashCode(this.autoScanTimeoutSeconds)) * 31) + this.identificationHelpArticle.hashCode()) * 31;
        Double d = this.minLandmarkWidthRatio;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.minRectangleConfidence;
        int hashCode3 = (hashCode2 + (d2 != null ? d2.hashCode() : 0)) * 31;
        boolean z2 = this.enableManualImageHeuristics;
        return ((hashCode3 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + Long.hashCode(this.pendingSubmissionPollingIntervalSeconds);
    }

    public String toString() {
        boolean z = this.enableIdentificationService;
        boolean z2 = this.onboardingBeforePayment;
        int i = this.autoScanTimeoutSeconds;
        String str = this.identificationHelpArticle;
        Double d = this.minLandmarkWidthRatio;
        Double d2 = this.minRectangleConfidence;
        boolean z3 = this.enableManualImageHeuristics;
        long j = this.pendingSubmissionPollingIntervalSeconds;
        return "IdentificationConfig(enableIdentificationService=" + z + ", onboardingBeforePayment=" + z2 + ", autoScanTimeoutSeconds=" + i + ", identificationHelpArticle=" + str + ", minLandmarkWidthRatio=" + d + ", minRectangleConfidence=" + d2 + ", enableManualImageHeuristics=" + z3 + ", pendingSubmissionPollingIntervalSeconds=" + j + ")";
    }

    public IdentificationConfig(boolean z, boolean z2, int i, String identificationHelpArticle, Double d, Double d2, boolean z3, long j) {
        Intrinsics.checkNotNullParameter(identificationHelpArticle, "identificationHelpArticle");
        this.enableIdentificationService = z;
        this.onboardingBeforePayment = z2;
        this.autoScanTimeoutSeconds = i;
        this.identificationHelpArticle = identificationHelpArticle;
        this.minLandmarkWidthRatio = d;
        this.minRectangleConfidence = d2;
        this.enableManualImageHeuristics = z3;
        this.pendingSubmissionPollingIntervalSeconds = j;
    }

    public /* synthetic */ IdentificationConfig(boolean z, boolean z2, int i, String str, Double d, Double d2, boolean z3, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 10 : i, (i2 & 8) != 0 ? "" : str, (i2 & 16) != 0 ? null : d, (i2 & 32) == 0 ? d2 : null, (i2 & 64) == 0 ? z3 : false, (i2 & 128) != 0 ? 2L : j);
    }
}
