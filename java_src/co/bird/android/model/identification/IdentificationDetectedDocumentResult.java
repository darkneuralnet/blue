package co.bird.android.model.identification;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JJ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;", "", "rectangleDetected", "", "blurVariance", "", "faceDetected", "stringDetectionResult", "Lco/bird/android/model/identification/IdentificationDetectedStringsResult;", Entry.TYPE_IMAGE, "", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Lco/bird/android/model/identification/IdentificationDetectedStringsResult;[B)V", "getBlurVariance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getFaceDetected", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getImage", "()[B", "getRectangleDetected", "getStringDetectionResult", "()Lco/bird/android/model/identification/IdentificationDetectedStringsResult;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Boolean;Lco/bird/android/model/identification/IdentificationDetectedStringsResult;[B)Lco/bird/android/model/identification/IdentificationDetectedDocumentResult;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdentificationDetectedDocumentResult {
    private final Double blurVariance;
    private final Boolean faceDetected;
    private final byte[] image;
    private final Boolean rectangleDetected;
    private final IdentificationDetectedStringsResult stringDetectionResult;

    public IdentificationDetectedDocumentResult(Boolean bool, Double d, Boolean bool2, IdentificationDetectedStringsResult identificationDetectedStringsResult, byte[] bArr) {
        this.rectangleDetected = bool;
        this.blurVariance = d;
        this.faceDetected = bool2;
        this.stringDetectionResult = identificationDetectedStringsResult;
        this.image = bArr;
    }

    public static /* synthetic */ IdentificationDetectedDocumentResult copy$default(IdentificationDetectedDocumentResult identificationDetectedDocumentResult, Boolean bool, Double d, Boolean bool2, IdentificationDetectedStringsResult identificationDetectedStringsResult, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = identificationDetectedDocumentResult.rectangleDetected;
        }
        if ((i & 2) != 0) {
            d = identificationDetectedDocumentResult.blurVariance;
        }
        Double d2 = d;
        if ((i & 4) != 0) {
            bool2 = identificationDetectedDocumentResult.faceDetected;
        }
        Boolean bool3 = bool2;
        if ((i & 8) != 0) {
            identificationDetectedStringsResult = identificationDetectedDocumentResult.stringDetectionResult;
        }
        IdentificationDetectedStringsResult identificationDetectedStringsResult2 = identificationDetectedStringsResult;
        if ((i & 16) != 0) {
            bArr = identificationDetectedDocumentResult.image;
        }
        return identificationDetectedDocumentResult.copy(bool, d2, bool3, identificationDetectedStringsResult2, bArr);
    }

    public final Boolean component1() {
        return this.rectangleDetected;
    }

    public final Double component2() {
        return this.blurVariance;
    }

    public final Boolean component3() {
        return this.faceDetected;
    }

    public final IdentificationDetectedStringsResult component4() {
        return this.stringDetectionResult;
    }

    public final byte[] component5() {
        return this.image;
    }

    public final IdentificationDetectedDocumentResult copy(Boolean bool, Double d, Boolean bool2, IdentificationDetectedStringsResult identificationDetectedStringsResult, byte[] bArr) {
        return new IdentificationDetectedDocumentResult(bool, d, bool2, identificationDetectedStringsResult, bArr);
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(IdentificationDetectedDocumentResult.class, cls)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type co.bird.android.model.identification.IdentificationDetectedDocumentResult");
        IdentificationDetectedDocumentResult identificationDetectedDocumentResult = (IdentificationDetectedDocumentResult) obj;
        if (!Intrinsics.areEqual(this.rectangleDetected, identificationDetectedDocumentResult.rectangleDetected) || !Intrinsics.areEqual(this.blurVariance, identificationDetectedDocumentResult.blurVariance) || !Intrinsics.areEqual(this.faceDetected, identificationDetectedDocumentResult.faceDetected) || !Intrinsics.areEqual(this.stringDetectionResult, identificationDetectedDocumentResult.stringDetectionResult)) {
            return false;
        }
        byte[] bArr = this.image;
        if (bArr != null) {
            byte[] bArr2 = identificationDetectedDocumentResult.image;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (identificationDetectedDocumentResult.image != null) {
            return false;
        }
        return true;
    }

    public final Double getBlurVariance() {
        return this.blurVariance;
    }

    public final Boolean getFaceDetected() {
        return this.faceDetected;
    }

    public final byte[] getImage() {
        return this.image;
    }

    public final Boolean getRectangleDetected() {
        return this.rectangleDetected;
    }

    public final IdentificationDetectedStringsResult getStringDetectionResult() {
        return this.stringDetectionResult;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        Boolean bool = this.rectangleDetected;
        int i5 = 0;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        Double d = this.blurVariance;
        if (d != null) {
            i2 = d.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        Boolean bool2 = this.faceDetected;
        if (bool2 != null) {
            i3 = bool2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        IdentificationDetectedStringsResult identificationDetectedStringsResult = this.stringDetectionResult;
        if (identificationDetectedStringsResult != null) {
            i4 = identificationDetectedStringsResult.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        byte[] bArr = this.image;
        if (bArr != null) {
            i5 = Arrays.hashCode(bArr);
        }
        return i9 + i5;
    }

    public String toString() {
        Boolean bool = this.rectangleDetected;
        Double d = this.blurVariance;
        Boolean bool2 = this.faceDetected;
        IdentificationDetectedStringsResult identificationDetectedStringsResult = this.stringDetectionResult;
        String arrays = Arrays.toString(this.image);
        return "IdentificationDetectedDocumentResult(rectangleDetected=" + bool + ", blurVariance=" + d + ", faceDetected=" + bool2 + ", stringDetectionResult=" + identificationDetectedStringsResult + ", image=" + arrays + ")";
    }
}
