package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/GoOperatorMapDeeplinkParams;", "Lco/bird/android/model/GoDeepLinkParams;", "birdCode", "", "bountyId", "promptBountyDesignationReaccept", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getBirdCode", "()Ljava/lang/String;", "getBountyId", "getPromptBountyDesignationReaccept", "()Z", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class GoOperatorMapDeeplinkParams implements GoDeepLinkParams {
    private final String birdCode;
    private final String bountyId;
    private final boolean promptBountyDesignationReaccept;

    public GoOperatorMapDeeplinkParams(String str, String str2, boolean z) {
        this.birdCode = str;
        this.bountyId = str2;
        this.promptBountyDesignationReaccept = z;
    }

    public static /* synthetic */ GoOperatorMapDeeplinkParams copy$default(GoOperatorMapDeeplinkParams goOperatorMapDeeplinkParams, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goOperatorMapDeeplinkParams.birdCode;
        }
        if ((i & 2) != 0) {
            str2 = goOperatorMapDeeplinkParams.bountyId;
        }
        if ((i & 4) != 0) {
            z = goOperatorMapDeeplinkParams.promptBountyDesignationReaccept;
        }
        return goOperatorMapDeeplinkParams.copy(str, str2, z);
    }

    public final String component1() {
        return this.birdCode;
    }

    public final String component2() {
        return this.bountyId;
    }

    public final boolean component3() {
        return this.promptBountyDesignationReaccept;
    }

    public final GoOperatorMapDeeplinkParams copy(String str, String str2, boolean z) {
        return new GoOperatorMapDeeplinkParams(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GoOperatorMapDeeplinkParams) {
            GoOperatorMapDeeplinkParams goOperatorMapDeeplinkParams = (GoOperatorMapDeeplinkParams) obj;
            return Intrinsics.areEqual(this.birdCode, goOperatorMapDeeplinkParams.birdCode) && Intrinsics.areEqual(this.bountyId, goOperatorMapDeeplinkParams.bountyId) && this.promptBountyDesignationReaccept == goOperatorMapDeeplinkParams.promptBountyDesignationReaccept;
        }
        return false;
    }

    public final String getBirdCode() {
        return this.birdCode;
    }

    public final String getBountyId() {
        return this.bountyId;
    }

    public final boolean getPromptBountyDesignationReaccept() {
        return this.promptBountyDesignationReaccept;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.birdCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bountyId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.promptBountyDesignationReaccept;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.birdCode;
        String str2 = this.bountyId;
        boolean z = this.promptBountyDesignationReaccept;
        return "GoOperatorMapDeeplinkParams(birdCode=" + str + ", bountyId=" + str2 + ", promptBountyDesignationReaccept=" + z + ")";
    }
}
