package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/api/request/CommunicationOptInRequestBody;", "", "optedIn", "", "optInAgreementString", "", "(ZLjava/lang/String;)V", "getOptInAgreementString", "()Ljava/lang/String;", "getOptedIn", "()Z", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CommunicationOptInRequestBody {
    @JsonProperty("opt_in_agreement_string")
    @InterfaceC41208ft5("opt_in_agreement_string")
    private final String optInAgreementString;
    @JsonProperty("opted_in")
    @InterfaceC41208ft5("opted_in")
    private final boolean optedIn;

    public CommunicationOptInRequestBody(boolean z, String optInAgreementString) {
        Intrinsics.checkNotNullParameter(optInAgreementString, "optInAgreementString");
        this.optedIn = z;
        this.optInAgreementString = optInAgreementString;
    }

    public static /* synthetic */ CommunicationOptInRequestBody copy$default(CommunicationOptInRequestBody communicationOptInRequestBody, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = communicationOptInRequestBody.optedIn;
        }
        if ((i & 2) != 0) {
            str = communicationOptInRequestBody.optInAgreementString;
        }
        return communicationOptInRequestBody.copy(z, str);
    }

    public final boolean component1() {
        return this.optedIn;
    }

    public final String component2() {
        return this.optInAgreementString;
    }

    public final CommunicationOptInRequestBody copy(boolean z, String optInAgreementString) {
        Intrinsics.checkNotNullParameter(optInAgreementString, "optInAgreementString");
        return new CommunicationOptInRequestBody(z, optInAgreementString);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommunicationOptInRequestBody) {
            CommunicationOptInRequestBody communicationOptInRequestBody = (CommunicationOptInRequestBody) obj;
            return this.optedIn == communicationOptInRequestBody.optedIn && Intrinsics.areEqual(this.optInAgreementString, communicationOptInRequestBody.optInAgreementString);
        }
        return false;
    }

    public final String getOptInAgreementString() {
        return this.optInAgreementString;
    }

    public final boolean getOptedIn() {
        return this.optedIn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.optedIn;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (r0 * 31) + this.optInAgreementString.hashCode();
    }

    public String toString() {
        boolean z = this.optedIn;
        String str = this.optInAgreementString;
        return "CommunicationOptInRequestBody(optedIn=" + z + ", optInAgreementString=" + str + ")";
    }
}
