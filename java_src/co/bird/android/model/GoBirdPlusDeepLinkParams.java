package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/GoBirdPlusDeepLinkParams;", "Lco/bird/android/model/GoDeepLinkParams;", "subscriptionPlanId", "", "(Ljava/lang/String;)V", "getSubscriptionPlanId", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class GoBirdPlusDeepLinkParams implements GoDeepLinkParams {
    private final String subscriptionPlanId;

    public GoBirdPlusDeepLinkParams(String str) {
        this.subscriptionPlanId = str;
    }

    public static /* synthetic */ GoBirdPlusDeepLinkParams copy$default(GoBirdPlusDeepLinkParams goBirdPlusDeepLinkParams, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goBirdPlusDeepLinkParams.subscriptionPlanId;
        }
        return goBirdPlusDeepLinkParams.copy(str);
    }

    public final String component1() {
        return this.subscriptionPlanId;
    }

    public final GoBirdPlusDeepLinkParams copy(String str) {
        return new GoBirdPlusDeepLinkParams(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GoBirdPlusDeepLinkParams) && Intrinsics.areEqual(this.subscriptionPlanId, ((GoBirdPlusDeepLinkParams) obj).subscriptionPlanId);
    }

    public final String getSubscriptionPlanId() {
        return this.subscriptionPlanId;
    }

    public int hashCode() {
        String str = this.subscriptionPlanId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.subscriptionPlanId;
        return "GoBirdPlusDeepLinkParams(subscriptionPlanId=" + str + ")";
    }
}
