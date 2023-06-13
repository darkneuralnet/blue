package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\tR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000e\u0010\tR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\t¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/RequirementsResult;", "", "rectDetected", "", "landmarksDetected", "faceDetected", "textDetected", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getFaceDetected", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isSatisfied", "()Z", "getLandmarksDetected", "getRectDetected", "getTextDetected", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lco/bird/android/model/RequirementsResult;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RequirementsResult {
    private final Boolean faceDetected;
    private final boolean isSatisfied;
    private final Boolean landmarksDetected;
    private final Boolean rectDetected;
    private final Boolean textDetected;

    public RequirementsResult() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ RequirementsResult copy$default(RequirementsResult requirementsResult, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = requirementsResult.rectDetected;
        }
        if ((i & 2) != 0) {
            bool2 = requirementsResult.landmarksDetected;
        }
        if ((i & 4) != 0) {
            bool3 = requirementsResult.faceDetected;
        }
        if ((i & 8) != 0) {
            bool4 = requirementsResult.textDetected;
        }
        return requirementsResult.copy(bool, bool2, bool3, bool4);
    }

    public final Boolean component1() {
        return this.rectDetected;
    }

    public final Boolean component2() {
        return this.landmarksDetected;
    }

    public final Boolean component3() {
        return this.faceDetected;
    }

    public final Boolean component4() {
        return this.textDetected;
    }

    public final RequirementsResult copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        return new RequirementsResult(bool, bool2, bool3, bool4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RequirementsResult) {
            RequirementsResult requirementsResult = (RequirementsResult) obj;
            return Intrinsics.areEqual(this.rectDetected, requirementsResult.rectDetected) && Intrinsics.areEqual(this.landmarksDetected, requirementsResult.landmarksDetected) && Intrinsics.areEqual(this.faceDetected, requirementsResult.faceDetected) && Intrinsics.areEqual(this.textDetected, requirementsResult.textDetected);
        }
        return false;
    }

    public final Boolean getFaceDetected() {
        return this.faceDetected;
    }

    public final Boolean getLandmarksDetected() {
        return this.landmarksDetected;
    }

    public final Boolean getRectDetected() {
        return this.rectDetected;
    }

    public final Boolean getTextDetected() {
        return this.textDetected;
    }

    public int hashCode() {
        Boolean bool = this.rectDetected;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.landmarksDetected;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.faceDetected;
        int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.textDetected;
        return hashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final boolean isSatisfied() {
        return this.isSatisfied;
    }

    public String toString() {
        Boolean bool = this.rectDetected;
        Boolean bool2 = this.landmarksDetected;
        Boolean bool3 = this.faceDetected;
        Boolean bool4 = this.textDetected;
        return "RequirementsResult(rectDetected=" + bool + ", landmarksDetected=" + bool2 + ", faceDetected=" + bool3 + ", textDetected=" + bool4 + ")";
    }

    public RequirementsResult(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        this.rectDetected = bool;
        this.landmarksDetected = bool2;
        this.faceDetected = bool3;
        this.textDetected = bool4;
        Boolean bool5 = Boolean.FALSE;
        this.isSatisfied = (Intrinsics.areEqual(bool, bool5) || Intrinsics.areEqual(bool2, bool5) || Intrinsics.areEqual(bool3, bool5) || Intrinsics.areEqual(bool4, bool5)) ? false : true;
    }

    public /* synthetic */ RequirementsResult(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, (i & 8) != 0 ? null : bool4);
    }
}
