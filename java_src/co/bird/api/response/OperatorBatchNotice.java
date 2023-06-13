package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/api/response/OperatorBatchNotice;", "", "birdId", "", "birdCode", "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirdCode", "()Ljava/lang/String;", "getBirdId", "getMessage", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class OperatorBatchNotice {
    @JsonProperty("bird_code")
    @InterfaceC41208ft5("bird_code")
    private final String birdCode;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final String message;

    public OperatorBatchNotice() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ OperatorBatchNotice copy$default(OperatorBatchNotice operatorBatchNotice, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = operatorBatchNotice.birdId;
        }
        if ((i & 2) != 0) {
            str2 = operatorBatchNotice.birdCode;
        }
        if ((i & 4) != 0) {
            str3 = operatorBatchNotice.message;
        }
        return operatorBatchNotice.copy(str, str2, str3);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.birdCode;
    }

    public final String component3() {
        return this.message;
    }

    public final OperatorBatchNotice copy(String str, String str2, String str3) {
        return new OperatorBatchNotice(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OperatorBatchNotice) {
            OperatorBatchNotice operatorBatchNotice = (OperatorBatchNotice) obj;
            return Intrinsics.areEqual(this.birdId, operatorBatchNotice.birdId) && Intrinsics.areEqual(this.birdCode, operatorBatchNotice.birdCode) && Intrinsics.areEqual(this.message, operatorBatchNotice.message);
        }
        return false;
    }

    public final String getBirdCode() {
        return this.birdCode;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.birdId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.birdCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.birdCode;
        String str3 = this.message;
        return "OperatorBatchNotice(birdId=" + str + ", birdCode=" + str2 + ", message=" + str3 + ")";
    }

    public OperatorBatchNotice(String str, String str2, String str3) {
        this.birdId = str;
        this.birdCode = str2;
        this.message = str3;
    }

    public /* synthetic */ OperatorBatchNotice(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
