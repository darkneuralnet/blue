package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/response/DisputeRideCreateResponse;", "", "titleText", "", "bodyText", "eligible", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getBodyText", "()Ljava/lang/String;", "getEligible", "()Z", "getTitleText", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DisputeRideCreateResponse {
    @JsonProperty("body_text")
    @InterfaceC41208ft5("body_text")
    private final String bodyText;
    @JsonProperty("eligible")
    @InterfaceC41208ft5("eligible")
    private final boolean eligible;
    @JsonProperty("title_text")
    @InterfaceC41208ft5("title_text")
    private final String titleText;

    public DisputeRideCreateResponse() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ DisputeRideCreateResponse copy$default(DisputeRideCreateResponse disputeRideCreateResponse, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = disputeRideCreateResponse.titleText;
        }
        if ((i & 2) != 0) {
            str2 = disputeRideCreateResponse.bodyText;
        }
        if ((i & 4) != 0) {
            z = disputeRideCreateResponse.eligible;
        }
        return disputeRideCreateResponse.copy(str, str2, z);
    }

    public final String component1() {
        return this.titleText;
    }

    public final String component2() {
        return this.bodyText;
    }

    public final boolean component3() {
        return this.eligible;
    }

    public final DisputeRideCreateResponse copy(String str, String str2, boolean z) {
        return new DisputeRideCreateResponse(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DisputeRideCreateResponse) {
            DisputeRideCreateResponse disputeRideCreateResponse = (DisputeRideCreateResponse) obj;
            return Intrinsics.areEqual(this.titleText, disputeRideCreateResponse.titleText) && Intrinsics.areEqual(this.bodyText, disputeRideCreateResponse.bodyText) && this.eligible == disputeRideCreateResponse.eligible;
        }
        return false;
    }

    public final String getBodyText() {
        return this.bodyText;
    }

    public final boolean getEligible() {
        return this.eligible;
    }

    public final String getTitleText() {
        return this.titleText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.titleText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bodyText;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.eligible;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.titleText;
        String str2 = this.bodyText;
        boolean z = this.eligible;
        return "DisputeRideCreateResponse(titleText=" + str + ", bodyText=" + str2 + ", eligible=" + z + ")";
    }

    public DisputeRideCreateResponse(String str, String str2, boolean z) {
        this.titleText = str;
        this.bodyText = str2;
        this.eligible = z;
    }

    public /* synthetic */ DisputeRideCreateResponse(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
    }
}
