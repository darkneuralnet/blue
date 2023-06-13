package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.NonComplianceWarningKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m28432d2 = {"Lco/bird/api/request/NonComplianceWarningBody;", "", "warningKind", "Lco/bird/android/model/NonComplianceWarningKind;", "rideId", "", "currency", "amount", "", "(Lco/bird/android/model/NonComplianceWarningKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrency", "()Ljava/lang/String;", "getRideId", "getWarningKind", "()Lco/bird/android/model/NonComplianceWarningKind;", "component1", "component2", "component3", "component4", "copy", "(Lco/bird/android/model/NonComplianceWarningKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lco/bird/api/request/NonComplianceWarningBody;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class NonComplianceWarningBody {
    @JsonProperty("amount")
    @InterfaceC41208ft5("amount")
    private final Integer amount;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("ride_id")
    @InterfaceC41208ft5("ride_id")
    private final String rideId;
    @JsonProperty("warning_kind")
    @InterfaceC41208ft5("warning_kind")
    private final NonComplianceWarningKind warningKind;

    public NonComplianceWarningBody(NonComplianceWarningKind warningKind, String str, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(warningKind, "warningKind");
        this.warningKind = warningKind;
        this.rideId = str;
        this.currency = str2;
        this.amount = num;
    }

    public static /* synthetic */ NonComplianceWarningBody copy$default(NonComplianceWarningBody nonComplianceWarningBody, NonComplianceWarningKind nonComplianceWarningKind, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            nonComplianceWarningKind = nonComplianceWarningBody.warningKind;
        }
        if ((i & 2) != 0) {
            str = nonComplianceWarningBody.rideId;
        }
        if ((i & 4) != 0) {
            str2 = nonComplianceWarningBody.currency;
        }
        if ((i & 8) != 0) {
            num = nonComplianceWarningBody.amount;
        }
        return nonComplianceWarningBody.copy(nonComplianceWarningKind, str, str2, num);
    }

    public final NonComplianceWarningKind component1() {
        return this.warningKind;
    }

    public final String component2() {
        return this.rideId;
    }

    public final String component3() {
        return this.currency;
    }

    public final Integer component4() {
        return this.amount;
    }

    public final NonComplianceWarningBody copy(NonComplianceWarningKind warningKind, String str, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(warningKind, "warningKind");
        return new NonComplianceWarningBody(warningKind, str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NonComplianceWarningBody) {
            NonComplianceWarningBody nonComplianceWarningBody = (NonComplianceWarningBody) obj;
            return this.warningKind == nonComplianceWarningBody.warningKind && Intrinsics.areEqual(this.rideId, nonComplianceWarningBody.rideId) && Intrinsics.areEqual(this.currency, nonComplianceWarningBody.currency) && Intrinsics.areEqual(this.amount, nonComplianceWarningBody.amount);
        }
        return false;
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getRideId() {
        return this.rideId;
    }

    public final NonComplianceWarningKind getWarningKind() {
        return this.warningKind;
    }

    public int hashCode() {
        int hashCode = this.warningKind.hashCode() * 31;
        String str = this.rideId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.amount;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        NonComplianceWarningKind nonComplianceWarningKind = this.warningKind;
        String str = this.rideId;
        String str2 = this.currency;
        Integer num = this.amount;
        return "NonComplianceWarningBody(warningKind=" + nonComplianceWarningKind + ", rideId=" + str + ", currency=" + str2 + ", amount=" + num + ")";
    }

    public /* synthetic */ NonComplianceWarningBody(NonComplianceWarningKind nonComplianceWarningKind, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nonComplianceWarningKind, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num);
    }
}
