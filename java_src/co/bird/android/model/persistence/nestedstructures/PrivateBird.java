package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.OwnershipKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003Ja\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006("}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/PrivateBird;", "", "id", "", "nickname", "userId", "endedAt", "Lorg/joda/time/DateTime;", "userFirstScanAt", "ownershipKind", "Lco/bird/android/model/constant/OwnershipKind;", "createdAt", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lco/bird/android/model/constant/OwnershipKind;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getEndedAt", "getId", "()Ljava/lang/String;", "getNickname", "getOwnershipKind", "()Lco/bird/android/model/constant/OwnershipKind;", "getUpdatedAt", "getUserFirstScanAt", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PrivateBird {
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("ended_at")
    @InterfaceC41208ft5("ended_at")
    private final DateTime endedAt;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66700id;
    @JsonProperty("nickname")
    @InterfaceC41208ft5("nickname")
    private final String nickname;
    @JsonProperty("ownership_kind")
    @InterfaceC41208ft5("ownership_kind")
    private final OwnershipKind ownershipKind;
    @JsonProperty("updated_at")
    @InterfaceC41208ft5("updated_at")
    private final DateTime updatedAt;
    @JsonProperty("user_first_scan_at")
    @InterfaceC41208ft5("user_first_scan_at")
    private final DateTime userFirstScanAt;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    public PrivateBird() {
        this(null, null, null, null, null, null, null, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
    }

    public final String component1() {
        return this.f66700id;
    }

    public final String component2() {
        return this.nickname;
    }

    public final String component3() {
        return this.userId;
    }

    public final DateTime component4() {
        return this.endedAt;
    }

    public final DateTime component5() {
        return this.userFirstScanAt;
    }

    public final OwnershipKind component6() {
        return this.ownershipKind;
    }

    public final DateTime component7() {
        return this.createdAt;
    }

    public final DateTime component8() {
        return this.updatedAt;
    }

    public final PrivateBird copy(String id, String str, String userId, DateTime dateTime, DateTime dateTime2, OwnershipKind ownershipKind, DateTime createdAt, DateTime updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new PrivateBird(id, str, userId, dateTime, dateTime2, ownershipKind, createdAt, updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrivateBird) {
            PrivateBird privateBird = (PrivateBird) obj;
            return Intrinsics.areEqual(this.f66700id, privateBird.f66700id) && Intrinsics.areEqual(this.nickname, privateBird.nickname) && Intrinsics.areEqual(this.userId, privateBird.userId) && Intrinsics.areEqual(this.endedAt, privateBird.endedAt) && Intrinsics.areEqual(this.userFirstScanAt, privateBird.userFirstScanAt) && this.ownershipKind == privateBird.ownershipKind && Intrinsics.areEqual(this.createdAt, privateBird.createdAt) && Intrinsics.areEqual(this.updatedAt, privateBird.updatedAt);
        }
        return false;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final DateTime getEndedAt() {
        return this.endedAt;
    }

    public final String getId() {
        return this.f66700id;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final OwnershipKind getOwnershipKind() {
        return this.ownershipKind;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public final DateTime getUserFirstScanAt() {
        return this.userFirstScanAt;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = this.f66700id.hashCode() * 31;
        String str = this.nickname;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.userId.hashCode()) * 31;
        DateTime dateTime = this.endedAt;
        int hashCode3 = (hashCode2 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.userFirstScanAt;
        int hashCode4 = (hashCode3 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        OwnershipKind ownershipKind = this.ownershipKind;
        return ((((hashCode4 + (ownershipKind != null ? ownershipKind.hashCode() : 0)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode();
    }

    public String toString() {
        String str = this.f66700id;
        String str2 = this.nickname;
        String str3 = this.userId;
        DateTime dateTime = this.endedAt;
        DateTime dateTime2 = this.userFirstScanAt;
        OwnershipKind ownershipKind = this.ownershipKind;
        DateTime dateTime3 = this.createdAt;
        DateTime dateTime4 = this.updatedAt;
        return "PrivateBird(id=" + str + ", nickname=" + str2 + ", userId=" + str3 + ", endedAt=" + dateTime + ", userFirstScanAt=" + dateTime2 + ", ownershipKind=" + ownershipKind + ", createdAt=" + dateTime3 + ", updatedAt=" + dateTime4 + ")";
    }

    public PrivateBird(String id, String str, String userId, DateTime dateTime, DateTime dateTime2, OwnershipKind ownershipKind, DateTime createdAt, DateTime updatedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.f66700id = id;
        this.nickname = str;
        this.userId = userId;
        this.endedAt = dateTime;
        this.userFirstScanAt = dateTime2;
        this.ownershipKind = ownershipKind;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PrivateBird(String str, String str2, String str3, DateTime dateTime, DateTime dateTime2, OwnershipKind ownershipKind, DateTime dateTime3, DateTime dateTime4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r2, r5, r6, r4, r7, r0);
        DateTime dateTime5;
        DateTime dateTime6;
        String str4 = (i & 1) != 0 ? "" : str;
        String str5 = (i & 2) != 0 ? null : str2;
        String str6 = (i & 4) == 0 ? str3 : "";
        DateTime dateTime7 = (i & 8) != 0 ? null : dateTime;
        DateTime dateTime8 = (i & 16) != 0 ? null : dateTime2;
        OwnershipKind ownershipKind2 = (i & 32) == 0 ? ownershipKind : null;
        if ((i & 64) != 0) {
            dateTime5 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime5, "now()");
        } else {
            dateTime5 = dateTime3;
        }
        if ((i & 128) != 0) {
            dateTime6 = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime6, "now()");
        } else {
            dateTime6 = dateTime4;
        }
    }
}
