package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.core.networking.AnalyticsFields;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m28432d2 = {"Lco/bird/api/request/BankRedirectOneTimeRefillResponse;", "", "publishableKey", "", "clientSecret", "success", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getClientSecret", "()Ljava/lang/String;", "getPublishableKey", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BankRedirectOneTimeRefillResponse {
    @JsonProperty("client_secret")
    @InterfaceC41208ft5("client_secret")
    private final String clientSecret;
    @JsonProperty(AnalyticsFields.PUBLISHABLE_KEY)
    @InterfaceC41208ft5(AnalyticsFields.PUBLISHABLE_KEY)
    private final String publishableKey;
    @JsonProperty("success")
    @InterfaceC41208ft5("success")
    private final boolean success;

    public BankRedirectOneTimeRefillResponse(String str, String str2, boolean z) {
        this.publishableKey = str;
        this.clientSecret = str2;
        this.success = z;
    }

    public static /* synthetic */ BankRedirectOneTimeRefillResponse copy$default(BankRedirectOneTimeRefillResponse bankRedirectOneTimeRefillResponse, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankRedirectOneTimeRefillResponse.publishableKey;
        }
        if ((i & 2) != 0) {
            str2 = bankRedirectOneTimeRefillResponse.clientSecret;
        }
        if ((i & 4) != 0) {
            z = bankRedirectOneTimeRefillResponse.success;
        }
        return bankRedirectOneTimeRefillResponse.copy(str, str2, z);
    }

    public final String component1() {
        return this.publishableKey;
    }

    public final String component2() {
        return this.clientSecret;
    }

    public final boolean component3() {
        return this.success;
    }

    public final BankRedirectOneTimeRefillResponse copy(String str, String str2, boolean z) {
        return new BankRedirectOneTimeRefillResponse(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BankRedirectOneTimeRefillResponse) {
            BankRedirectOneTimeRefillResponse bankRedirectOneTimeRefillResponse = (BankRedirectOneTimeRefillResponse) obj;
            return Intrinsics.areEqual(this.publishableKey, bankRedirectOneTimeRefillResponse.publishableKey) && Intrinsics.areEqual(this.clientSecret, bankRedirectOneTimeRefillResponse.clientSecret) && this.success == bankRedirectOneTimeRefillResponse.success;
        }
        return false;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.publishableKey;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientSecret;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.success;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.publishableKey;
        String str2 = this.clientSecret;
        boolean z = this.success;
        return "BankRedirectOneTimeRefillResponse(publishableKey=" + str + ", clientSecret=" + str2 + ", success=" + z + ")";
    }
}
