package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, m28432d2 = {"Lco/bird/android/model/PartnerUser;", "", "partnerId", "", "userId", "role", "Lco/bird/android/model/PartnerUserRole;", "ridesCount", "", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/PartnerUserRole;Ljava/lang/Integer;)V", "getPartnerId", "()Ljava/lang/String;", "getRidesCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRole", "()Lco/bird/android/model/PartnerUserRole;", "getUserId", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/PartnerUserRole;Ljava/lang/Integer;)Lco/bird/android/model/PartnerUser;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PartnerUser {
    @JsonProperty("partner_id")
    @InterfaceC41208ft5("partner_id")
    private final String partnerId;
    @JsonProperty("rides_count")
    @InterfaceC41208ft5("rides_count")
    private final Integer ridesCount;
    @JsonProperty("role")
    @InterfaceC41208ft5("role")
    private final PartnerUserRole role;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    public PartnerUser(String partnerId, String userId, PartnerUserRole role, Integer num) {
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(role, "role");
        this.partnerId = partnerId;
        this.userId = userId;
        this.role = role;
        this.ridesCount = num;
    }

    public static /* synthetic */ PartnerUser copy$default(PartnerUser partnerUser, String str, String str2, PartnerUserRole partnerUserRole, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partnerUser.partnerId;
        }
        if ((i & 2) != 0) {
            str2 = partnerUser.userId;
        }
        if ((i & 4) != 0) {
            partnerUserRole = partnerUser.role;
        }
        if ((i & 8) != 0) {
            num = partnerUser.ridesCount;
        }
        return partnerUser.copy(str, str2, partnerUserRole, num);
    }

    public final String component1() {
        return this.partnerId;
    }

    public final String component2() {
        return this.userId;
    }

    public final PartnerUserRole component3() {
        return this.role;
    }

    public final Integer component4() {
        return this.ridesCount;
    }

    public final PartnerUser copy(String partnerId, String userId, PartnerUserRole role, Integer num) {
        Intrinsics.checkNotNullParameter(partnerId, "partnerId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(role, "role");
        return new PartnerUser(partnerId, userId, role, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PartnerUser) {
            PartnerUser partnerUser = (PartnerUser) obj;
            return Intrinsics.areEqual(this.partnerId, partnerUser.partnerId) && Intrinsics.areEqual(this.userId, partnerUser.userId) && this.role == partnerUser.role && Intrinsics.areEqual(this.ridesCount, partnerUser.ridesCount);
        }
        return false;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final Integer getRidesCount() {
        return this.ridesCount;
    }

    public final PartnerUserRole getRole() {
        return this.role;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((((this.partnerId.hashCode() * 31) + this.userId.hashCode()) * 31) + this.role.hashCode()) * 31;
        Integer num = this.ridesCount;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        String str = this.partnerId;
        String str2 = this.userId;
        PartnerUserRole partnerUserRole = this.role;
        Integer num = this.ridesCount;
        return "PartnerUser(partnerId=" + str + ", userId=" + str2 + ", role=" + partnerUserRole + ", ridesCount=" + num + ")";
    }

    public /* synthetic */ PartnerUser(String str, String str2, PartnerUserRole partnerUserRole, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, partnerUserRole, (i & 8) != 0 ? null : num);
    }
}
