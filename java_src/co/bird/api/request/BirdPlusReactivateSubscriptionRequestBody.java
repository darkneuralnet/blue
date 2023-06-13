package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28432d2 = {"Lco/bird/api/request/BirdPlusReactivateSubscriptionRequestBody;", "", "userBirdPlusSubscriptionId", "", "(Ljava/lang/String;)V", "getUserBirdPlusSubscriptionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdPlusReactivateSubscriptionRequestBody {
    @JsonProperty("user_bird_plus_subscription_id")
    @InterfaceC41208ft5("user_bird_plus_subscription_id")
    private final String userBirdPlusSubscriptionId;

    public BirdPlusReactivateSubscriptionRequestBody(String userBirdPlusSubscriptionId) {
        Intrinsics.checkNotNullParameter(userBirdPlusSubscriptionId, "userBirdPlusSubscriptionId");
        this.userBirdPlusSubscriptionId = userBirdPlusSubscriptionId;
    }

    public static /* synthetic */ BirdPlusReactivateSubscriptionRequestBody copy$default(BirdPlusReactivateSubscriptionRequestBody birdPlusReactivateSubscriptionRequestBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = birdPlusReactivateSubscriptionRequestBody.userBirdPlusSubscriptionId;
        }
        return birdPlusReactivateSubscriptionRequestBody.copy(str);
    }

    public final String component1() {
        return this.userBirdPlusSubscriptionId;
    }

    public final BirdPlusReactivateSubscriptionRequestBody copy(String userBirdPlusSubscriptionId) {
        Intrinsics.checkNotNullParameter(userBirdPlusSubscriptionId, "userBirdPlusSubscriptionId");
        return new BirdPlusReactivateSubscriptionRequestBody(userBirdPlusSubscriptionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BirdPlusReactivateSubscriptionRequestBody) && Intrinsics.areEqual(this.userBirdPlusSubscriptionId, ((BirdPlusReactivateSubscriptionRequestBody) obj).userBirdPlusSubscriptionId);
    }

    public final String getUserBirdPlusSubscriptionId() {
        return this.userBirdPlusSubscriptionId;
    }

    public int hashCode() {
        return this.userBirdPlusSubscriptionId.hashCode();
    }

    public String toString() {
        String str = this.userBirdPlusSubscriptionId;
        return "BirdPlusReactivateSubscriptionRequestBody(userBirdPlusSubscriptionId=" + str + ")";
    }
}
