package co.bird.android.model.identification;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/identification/IdentificationDebugResponse;", "", "userAge", "", "expirationDays", "score", "", "ingestionResult", "Lco/bird/android/model/identification/IdentificationIngestionResult;", "secondsToResult", "(IIDLco/bird/android/model/identification/IdentificationIngestionResult;I)V", "getExpirationDays", "()I", "getIngestionResult", "()Lco/bird/android/model/identification/IdentificationIngestionResult;", "getScore", "()D", "getSecondsToResult", "getUserAge", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdentificationDebugResponse {
    private final int expirationDays;
    private final IdentificationIngestionResult ingestionResult;
    private final double score;
    private final int secondsToResult;
    private final int userAge;

    public IdentificationDebugResponse(int i, int i2, double d, IdentificationIngestionResult ingestionResult, int i3) {
        Intrinsics.checkNotNullParameter(ingestionResult, "ingestionResult");
        this.userAge = i;
        this.expirationDays = i2;
        this.score = d;
        this.ingestionResult = ingestionResult;
        this.secondsToResult = i3;
    }

    public static /* synthetic */ IdentificationDebugResponse copy$default(IdentificationDebugResponse identificationDebugResponse, int i, int i2, double d, IdentificationIngestionResult identificationIngestionResult, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = identificationDebugResponse.userAge;
        }
        if ((i4 & 2) != 0) {
            i2 = identificationDebugResponse.expirationDays;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            d = identificationDebugResponse.score;
        }
        double d2 = d;
        if ((i4 & 8) != 0) {
            identificationIngestionResult = identificationDebugResponse.ingestionResult;
        }
        IdentificationIngestionResult identificationIngestionResult2 = identificationIngestionResult;
        if ((i4 & 16) != 0) {
            i3 = identificationDebugResponse.secondsToResult;
        }
        return identificationDebugResponse.copy(i, i5, d2, identificationIngestionResult2, i3);
    }

    public final int component1() {
        return this.userAge;
    }

    public final int component2() {
        return this.expirationDays;
    }

    public final double component3() {
        return this.score;
    }

    public final IdentificationIngestionResult component4() {
        return this.ingestionResult;
    }

    public final int component5() {
        return this.secondsToResult;
    }

    public final IdentificationDebugResponse copy(int i, int i2, double d, IdentificationIngestionResult ingestionResult, int i3) {
        Intrinsics.checkNotNullParameter(ingestionResult, "ingestionResult");
        return new IdentificationDebugResponse(i, i2, d, ingestionResult, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IdentificationDebugResponse) {
            IdentificationDebugResponse identificationDebugResponse = (IdentificationDebugResponse) obj;
            return this.userAge == identificationDebugResponse.userAge && this.expirationDays == identificationDebugResponse.expirationDays && Double.compare(this.score, identificationDebugResponse.score) == 0 && this.ingestionResult == identificationDebugResponse.ingestionResult && this.secondsToResult == identificationDebugResponse.secondsToResult;
        }
        return false;
    }

    public final int getExpirationDays() {
        return this.expirationDays;
    }

    public final IdentificationIngestionResult getIngestionResult() {
        return this.ingestionResult;
    }

    public final double getScore() {
        return this.score;
    }

    public final int getSecondsToResult() {
        return this.secondsToResult;
    }

    public final int getUserAge() {
        return this.userAge;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.userAge) * 31) + Integer.hashCode(this.expirationDays)) * 31) + Double.hashCode(this.score)) * 31) + this.ingestionResult.hashCode()) * 31) + Integer.hashCode(this.secondsToResult);
    }

    public String toString() {
        int i = this.userAge;
        int i2 = this.expirationDays;
        double d = this.score;
        IdentificationIngestionResult identificationIngestionResult = this.ingestionResult;
        int i3 = this.secondsToResult;
        return "IdentificationDebugResponse(userAge=" + i + ", expirationDays=" + i2 + ", score=" + d + ", ingestionResult=" + identificationIngestionResult + ", secondsToResult=" + i3 + ")";
    }
}
