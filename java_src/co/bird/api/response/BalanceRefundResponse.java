package co.bird.api.response;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m28432d2 = {"Lco/bird/api/response/BalanceRefundResponse;", "", "amount", "", "currency", "", "title", "description", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrency", "()Ljava/lang/String;", "getDescription", "getTitle", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco/bird/api/response/BalanceRefundResponse;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BalanceRefundResponse {
    @JsonProperty("amount")
    @InterfaceC41208ft5("amount")
    private final Integer amount;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("description")
    @InterfaceC41208ft5("description")
    private final String description;
    @JsonProperty("title")
    @InterfaceC41208ft5("title")
    private final String title;

    public BalanceRefundResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ BalanceRefundResponse copy$default(BalanceRefundResponse balanceRefundResponse, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = balanceRefundResponse.amount;
        }
        if ((i & 2) != 0) {
            str = balanceRefundResponse.currency;
        }
        if ((i & 4) != 0) {
            str2 = balanceRefundResponse.title;
        }
        if ((i & 8) != 0) {
            str3 = balanceRefundResponse.description;
        }
        return balanceRefundResponse.copy(num, str, str2, str3);
    }

    public final Integer component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final BalanceRefundResponse copy(Integer num, String str, String str2, String str3) {
        return new BalanceRefundResponse(num, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BalanceRefundResponse) {
            BalanceRefundResponse balanceRefundResponse = (BalanceRefundResponse) obj;
            return Intrinsics.areEqual(this.amount, balanceRefundResponse.amount) && Intrinsics.areEqual(this.currency, balanceRefundResponse.currency) && Intrinsics.areEqual(this.title, balanceRefundResponse.title) && Intrinsics.areEqual(this.description, balanceRefundResponse.description);
        }
        return false;
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.amount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.currency;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.amount;
        String str = this.currency;
        String str2 = this.title;
        String str3 = this.description;
        return "BalanceRefundResponse(amount=" + num + ", currency=" + str + ", title=" + str2 + ", description=" + str3 + ")";
    }

    public BalanceRefundResponse(Integer num, String str, String str2, String str3) {
        this.amount = num;
        this.currency = str;
        this.title = str2;
        this.description = str3;
    }

    public /* synthetic */ BalanceRefundResponse(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
