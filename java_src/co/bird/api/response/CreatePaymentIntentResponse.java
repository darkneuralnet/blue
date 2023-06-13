package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/api/response/CreatePaymentIntentResponse;", "", "intentId", "", "secretId", "(Ljava/lang/String;Ljava/lang/String;)V", "getIntentId", "()Ljava/lang/String;", "getSecretId", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CreatePaymentIntentResponse {
    @JsonProperty("intent_id")
    @InterfaceC41208ft5("intent_id")
    private final String intentId;
    @JsonProperty("secret_id")
    @InterfaceC41208ft5("secret_id")
    private final String secretId;

    public CreatePaymentIntentResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CreatePaymentIntentResponse copy$default(CreatePaymentIntentResponse createPaymentIntentResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createPaymentIntentResponse.intentId;
        }
        if ((i & 2) != 0) {
            str2 = createPaymentIntentResponse.secretId;
        }
        return createPaymentIntentResponse.copy(str, str2);
    }

    public final String component1() {
        return this.intentId;
    }

    public final String component2() {
        return this.secretId;
    }

    public final CreatePaymentIntentResponse copy(String intentId, String secretId) {
        Intrinsics.checkNotNullParameter(intentId, "intentId");
        Intrinsics.checkNotNullParameter(secretId, "secretId");
        return new CreatePaymentIntentResponse(intentId, secretId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreatePaymentIntentResponse) {
            CreatePaymentIntentResponse createPaymentIntentResponse = (CreatePaymentIntentResponse) obj;
            return Intrinsics.areEqual(this.intentId, createPaymentIntentResponse.intentId) && Intrinsics.areEqual(this.secretId, createPaymentIntentResponse.secretId);
        }
        return false;
    }

    public final String getIntentId() {
        return this.intentId;
    }

    public final String getSecretId() {
        return this.secretId;
    }

    public int hashCode() {
        return (this.intentId.hashCode() * 31) + this.secretId.hashCode();
    }

    public String toString() {
        String str = this.intentId;
        String str2 = this.secretId;
        return "CreatePaymentIntentResponse(intentId=" + str + ", secretId=" + str2 + ")";
    }

    public CreatePaymentIntentResponse(String intentId, String secretId) {
        Intrinsics.checkNotNullParameter(intentId, "intentId");
        Intrinsics.checkNotNullParameter(secretId, "secretId");
        this.intentId = intentId;
        this.secretId = secretId;
    }

    public /* synthetic */ CreatePaymentIntentResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
