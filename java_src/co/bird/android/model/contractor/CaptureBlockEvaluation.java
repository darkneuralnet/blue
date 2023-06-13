package co.bird.android.model.contractor;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/contractor/CaptureBlockEvaluation;", "", "title", "", "message", "type", "Lco/bird/android/model/contractor/CaptureBlockKind;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/contractor/CaptureBlockKind;)V", "getMessage", "()Ljava/lang/String;", "getTitle", "getType", "()Lco/bird/android/model/contractor/CaptureBlockKind;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CaptureBlockEvaluation {
    @JsonProperty("message")
    @InterfaceC41208ft5("message")
    private final String message;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final CaptureBlockKind type;

    public CaptureBlockEvaluation() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CaptureBlockEvaluation copy$default(CaptureBlockEvaluation captureBlockEvaluation, String str, String str2, CaptureBlockKind captureBlockKind, int i, Object obj) {
        if ((i & 1) != 0) {
            str = captureBlockEvaluation.title;
        }
        if ((i & 2) != 0) {
            str2 = captureBlockEvaluation.message;
        }
        if ((i & 4) != 0) {
            captureBlockKind = captureBlockEvaluation.type;
        }
        return captureBlockEvaluation.copy(str, str2, captureBlockKind);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.message;
    }

    public final CaptureBlockKind component3() {
        return this.type;
    }

    public final CaptureBlockEvaluation copy(String str, String str2, CaptureBlockKind captureBlockKind) {
        return new CaptureBlockEvaluation(str, str2, captureBlockKind);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CaptureBlockEvaluation) {
            CaptureBlockEvaluation captureBlockEvaluation = (CaptureBlockEvaluation) obj;
            return Intrinsics.areEqual(this.title, captureBlockEvaluation.title) && Intrinsics.areEqual(this.message, captureBlockEvaluation.message) && this.type == captureBlockEvaluation.type;
        }
        return false;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public final CaptureBlockKind getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CaptureBlockKind captureBlockKind = this.type;
        return hashCode2 + (captureBlockKind != null ? captureBlockKind.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.message;
        CaptureBlockKind captureBlockKind = this.type;
        return "CaptureBlockEvaluation(title=" + str + ", message=" + str2 + ", type=" + captureBlockKind + ")";
    }

    public CaptureBlockEvaluation(String str, String str2, CaptureBlockKind captureBlockKind) {
        this.title = str;
        this.message = str2;
        this.type = captureBlockKind;
    }

    public /* synthetic */ CaptureBlockEvaluation(String str, String str2, CaptureBlockKind captureBlockKind, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? CaptureBlockKind.UNKNOWN : captureBlockKind);
    }
}
