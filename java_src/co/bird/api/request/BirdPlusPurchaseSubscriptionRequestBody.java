package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m28432d2 = {"Lco/bird/api/request/BirdPlusPurchaseSubscriptionRequestBody;", "", "birdPlusSubscriptionPlanId", "", "trial", "", "(Ljava/lang/String;Z)V", "getBirdPlusSubscriptionPlanId", "()Ljava/lang/String;", "getTrial", "()Z", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdPlusPurchaseSubscriptionRequestBody {
    @JsonProperty("bird_plus_subscription_plan_id")
    @InterfaceC41208ft5("bird_plus_subscription_plan_id")
    private final String birdPlusSubscriptionPlanId;
    @JsonProperty("trial")
    @InterfaceC41208ft5("trial")
    private final boolean trial;

    public BirdPlusPurchaseSubscriptionRequestBody(String birdPlusSubscriptionPlanId, boolean z) {
        Intrinsics.checkNotNullParameter(birdPlusSubscriptionPlanId, "birdPlusSubscriptionPlanId");
        this.birdPlusSubscriptionPlanId = birdPlusSubscriptionPlanId;
        this.trial = z;
    }

    public static /* synthetic */ BirdPlusPurchaseSubscriptionRequestBody copy$default(BirdPlusPurchaseSubscriptionRequestBody birdPlusPurchaseSubscriptionRequestBody, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = birdPlusPurchaseSubscriptionRequestBody.birdPlusSubscriptionPlanId;
        }
        if ((i & 2) != 0) {
            z = birdPlusPurchaseSubscriptionRequestBody.trial;
        }
        return birdPlusPurchaseSubscriptionRequestBody.copy(str, z);
    }

    public final String component1() {
        return this.birdPlusSubscriptionPlanId;
    }

    public final boolean component2() {
        return this.trial;
    }

    public final BirdPlusPurchaseSubscriptionRequestBody copy(String birdPlusSubscriptionPlanId, boolean z) {
        Intrinsics.checkNotNullParameter(birdPlusSubscriptionPlanId, "birdPlusSubscriptionPlanId");
        return new BirdPlusPurchaseSubscriptionRequestBody(birdPlusSubscriptionPlanId, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdPlusPurchaseSubscriptionRequestBody) {
            BirdPlusPurchaseSubscriptionRequestBody birdPlusPurchaseSubscriptionRequestBody = (BirdPlusPurchaseSubscriptionRequestBody) obj;
            return Intrinsics.areEqual(this.birdPlusSubscriptionPlanId, birdPlusPurchaseSubscriptionRequestBody.birdPlusSubscriptionPlanId) && this.trial == birdPlusPurchaseSubscriptionRequestBody.trial;
        }
        return false;
    }

    public final String getBirdPlusSubscriptionPlanId() {
        return this.birdPlusSubscriptionPlanId;
    }

    public final boolean getTrial() {
        return this.trial;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.birdPlusSubscriptionPlanId.hashCode() * 31;
        boolean z = this.trial;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.birdPlusSubscriptionPlanId;
        boolean z = this.trial;
        return "BirdPlusPurchaseSubscriptionRequestBody(birdPlusSubscriptionPlanId=" + str + ", trial=" + z + ")";
    }
}
