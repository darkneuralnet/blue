package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/response/DisputeRideFinalizeResponse;", "", "amount", "", "currency", "", "(Ljava/lang/Long;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lco/bird/api/response/DisputeRideFinalizeResponse;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class DisputeRideFinalizeResponse {
    @JsonProperty("amount")
    @InterfaceC41208ft5("amount")
    private final Long amount;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;

    public DisputeRideFinalizeResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ DisputeRideFinalizeResponse copy$default(DisputeRideFinalizeResponse disputeRideFinalizeResponse, Long l, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = disputeRideFinalizeResponse.amount;
        }
        if ((i & 2) != 0) {
            str = disputeRideFinalizeResponse.currency;
        }
        return disputeRideFinalizeResponse.copy(l, str);
    }

    public final Long component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final DisputeRideFinalizeResponse copy(Long l, String str) {
        return new DisputeRideFinalizeResponse(l, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DisputeRideFinalizeResponse) {
            DisputeRideFinalizeResponse disputeRideFinalizeResponse = (DisputeRideFinalizeResponse) obj;
            return Intrinsics.areEqual(this.amount, disputeRideFinalizeResponse.amount) && Intrinsics.areEqual(this.currency, disputeRideFinalizeResponse.currency);
        }
        return false;
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        Long l = this.amount;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.currency;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Long l = this.amount;
        String str = this.currency;
        return "DisputeRideFinalizeResponse(amount=" + l + ", currency=" + str + ")";
    }

    public DisputeRideFinalizeResponse(Long l, String str) {
        this.amount = l;
        this.currency = str;
    }

    public /* synthetic */ DisputeRideFinalizeResponse(Long l, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str);
    }
}
