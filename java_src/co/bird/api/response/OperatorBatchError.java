package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lco/bird/api/response/OperatorBatchError;", "", "errorCode", "", "birdId", "birdCode", "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirdCode", "()Ljava/lang/String;", "getBirdId", "getErrorCode", "getMessage", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorBatchError {
    @JsonProperty("bird_code")
    @InterfaceC41208ft5("bird_code")
    private final String birdCode;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("error_code")
    @InterfaceC41208ft5("error_code")
    private final String errorCode;
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final String message;

    public OperatorBatchError() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ OperatorBatchError copy$default(OperatorBatchError operatorBatchError, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = operatorBatchError.errorCode;
        }
        if ((i & 2) != 0) {
            str2 = operatorBatchError.birdId;
        }
        if ((i & 4) != 0) {
            str3 = operatorBatchError.birdCode;
        }
        if ((i & 8) != 0) {
            str4 = operatorBatchError.message;
        }
        return operatorBatchError.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.errorCode;
    }

    public final String component2() {
        return this.birdId;
    }

    public final String component3() {
        return this.birdCode;
    }

    public final String component4() {
        return this.message;
    }

    public final OperatorBatchError copy(String str, String str2, String str3, String str4) {
        return new OperatorBatchError(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorBatchError) {
            OperatorBatchError operatorBatchError = (OperatorBatchError) obj;
            return Intrinsics.areEqual(this.errorCode, operatorBatchError.errorCode) && Intrinsics.areEqual(this.birdId, operatorBatchError.birdId) && Intrinsics.areEqual(this.birdCode, operatorBatchError.birdCode) && Intrinsics.areEqual(this.message, operatorBatchError.message);
        }
        return false;
    }

    public final String getBirdCode() {
        return this.birdCode;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.errorCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.birdId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.birdCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.message;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.errorCode;
        String str2 = this.birdId;
        String str3 = this.birdCode;
        String str4 = this.message;
        return "OperatorBatchError(errorCode=" + str + ", birdId=" + str2 + ", birdCode=" + str3 + ", message=" + str4 + ")";
    }

    public OperatorBatchError(String str, String str2, String str3, String str4) {
        this.errorCode = str;
        this.birdId = str2;
        this.birdCode = str3;
        this.message = str4;
    }

    public /* synthetic */ OperatorBatchError(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
