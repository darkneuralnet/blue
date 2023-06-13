package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m28432d2 = {"Lco/bird/android/model/AgreementKey;", "", "agreementRole", "Lco/bird/android/model/AgreementRole;", "partnerId", "", "userGuestId", "(Lco/bird/android/model/AgreementRole;Ljava/lang/String;Ljava/lang/String;)V", "getAgreementRole", "()Lco/bird/android/model/AgreementRole;", "getPartnerId", "()Ljava/lang/String;", "getUserGuestId", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AgreementKey {
    private final AgreementRole agreementRole;
    private final String partnerId;
    private final String userGuestId;

    public AgreementKey(AgreementRole agreementRole, String str, String str2) {
        Intrinsics.checkNotNullParameter(agreementRole, "agreementRole");
        this.agreementRole = agreementRole;
        this.partnerId = str;
        this.userGuestId = str2;
    }

    public static /* synthetic */ AgreementKey copy$default(AgreementKey agreementKey, AgreementRole agreementRole, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            agreementRole = agreementKey.agreementRole;
        }
        if ((i & 2) != 0) {
            str = agreementKey.partnerId;
        }
        if ((i & 4) != 0) {
            str2 = agreementKey.userGuestId;
        }
        return agreementKey.copy(agreementRole, str, str2);
    }

    public final AgreementRole component1() {
        return this.agreementRole;
    }

    public final String component2() {
        return this.partnerId;
    }

    public final String component3() {
        return this.userGuestId;
    }

    public final AgreementKey copy(AgreementRole agreementRole, String str, String str2) {
        Intrinsics.checkNotNullParameter(agreementRole, "agreementRole");
        return new AgreementKey(agreementRole, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AgreementKey) {
            AgreementKey agreementKey = (AgreementKey) obj;
            return this.agreementRole == agreementKey.agreementRole && Intrinsics.areEqual(this.partnerId, agreementKey.partnerId) && Intrinsics.areEqual(this.userGuestId, agreementKey.userGuestId);
        }
        return false;
    }

    public final AgreementRole getAgreementRole() {
        return this.agreementRole;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getUserGuestId() {
        return this.userGuestId;
    }

    public int hashCode() {
        int hashCode = this.agreementRole.hashCode() * 31;
        String str = this.partnerId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userGuestId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        AgreementRole agreementRole = this.agreementRole;
        String str = this.partnerId;
        String str2 = this.userGuestId;
        return "AgreementKey(agreementRole=" + agreementRole + ", partnerId=" + str + ", userGuestId=" + str2 + ")";
    }

    public /* synthetic */ AgreementKey(AgreementRole agreementRole, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(agreementRole, str, (i & 4) != 0 ? null : str2);
    }
}
