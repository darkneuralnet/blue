package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017¨\u00066"}, m28432d2 = {"Lco/bird/android/model/wire/WireTransaction;", "", "id", "", "payableAmount", "", "billedAmount", "amount", "merchantSiteId", "merchant", "Lco/bird/android/model/wire/WireMerchant;", "transactionDate", "Lorg/joda/time/DateTime;", "userId", "externalTransactionId", "merchantId", "currency", "externalTransactionKind", "(Ljava/lang/String;JJJLjava/lang/String;Lco/bird/android/model/wire/WireMerchant;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()J", "getBilledAmount", "getCurrency", "()Ljava/lang/String;", "getExternalTransactionId", "getExternalTransactionKind", "getId", "getMerchant", "()Lco/bird/android/model/wire/WireMerchant;", "getMerchantId", "getMerchantSiteId", "getPayableAmount", "getTransactionDate", "()Lorg/joda/time/DateTime;", "getUserId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireTransaction {
    @JsonProperty("amount")
    @InterfaceC41208ft5("amount")
    private final long amount;
    @JsonProperty("billed_amount")
    @InterfaceC41208ft5("billed_amount")
    private final long billedAmount;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("external_transaction_id")
    @InterfaceC41208ft5("external_transaction_id")
    private final String externalTransactionId;
    @JsonProperty("external_transaction_kind")
    @InterfaceC41208ft5("external_transaction_kind")
    private final String externalTransactionKind;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66769id;
    @JsonProperty("merchant")
    @InterfaceC41208ft5("merchant")
    private final WireMerchant merchant;
    @JsonProperty("merchant_id")
    @InterfaceC41208ft5("merchant_id")
    private final String merchantId;
    @JsonProperty("merchant_site_id")
    @InterfaceC41208ft5("merchant_site_id")
    private final String merchantSiteId;
    @JsonProperty("payable_amount")
    @InterfaceC41208ft5("payable_amount")
    private final long payableAmount;
    @JsonProperty("transaction_date")
    @InterfaceC41208ft5("transaction_date")
    private final DateTime transactionDate;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    public WireTransaction(String id, long j, long j2, long j3, String merchantSiteId, WireMerchant merchant, DateTime transactionDate, String userId, String externalTransactionId, String merchantId, String currency, String externalTransactionKind) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(transactionDate, "transactionDate");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(externalTransactionId, "externalTransactionId");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(externalTransactionKind, "externalTransactionKind");
        this.f66769id = id;
        this.payableAmount = j;
        this.billedAmount = j2;
        this.amount = j3;
        this.merchantSiteId = merchantSiteId;
        this.merchant = merchant;
        this.transactionDate = transactionDate;
        this.userId = userId;
        this.externalTransactionId = externalTransactionId;
        this.merchantId = merchantId;
        this.currency = currency;
        this.externalTransactionKind = externalTransactionKind;
    }

    public final String component1() {
        return this.f66769id;
    }

    public final String component10() {
        return this.merchantId;
    }

    public final String component11() {
        return this.currency;
    }

    public final String component12() {
        return this.externalTransactionKind;
    }

    public final long component2() {
        return this.payableAmount;
    }

    public final long component3() {
        return this.billedAmount;
    }

    public final long component4() {
        return this.amount;
    }

    public final String component5() {
        return this.merchantSiteId;
    }

    public final WireMerchant component6() {
        return this.merchant;
    }

    public final DateTime component7() {
        return this.transactionDate;
    }

    public final String component8() {
        return this.userId;
    }

    public final String component9() {
        return this.externalTransactionId;
    }

    public final WireTransaction copy(String id, long j, long j2, long j3, String merchantSiteId, WireMerchant merchant, DateTime transactionDate, String userId, String externalTransactionId, String merchantId, String currency, String externalTransactionKind) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(merchant, "merchant");
        Intrinsics.checkNotNullParameter(transactionDate, "transactionDate");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(externalTransactionId, "externalTransactionId");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(externalTransactionKind, "externalTransactionKind");
        return new WireTransaction(id, j, j2, j3, merchantSiteId, merchant, transactionDate, userId, externalTransactionId, merchantId, currency, externalTransactionKind);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireTransaction) {
            WireTransaction wireTransaction = (WireTransaction) obj;
            return Intrinsics.areEqual(this.f66769id, wireTransaction.f66769id) && this.payableAmount == wireTransaction.payableAmount && this.billedAmount == wireTransaction.billedAmount && this.amount == wireTransaction.amount && Intrinsics.areEqual(this.merchantSiteId, wireTransaction.merchantSiteId) && Intrinsics.areEqual(this.merchant, wireTransaction.merchant) && Intrinsics.areEqual(this.transactionDate, wireTransaction.transactionDate) && Intrinsics.areEqual(this.userId, wireTransaction.userId) && Intrinsics.areEqual(this.externalTransactionId, wireTransaction.externalTransactionId) && Intrinsics.areEqual(this.merchantId, wireTransaction.merchantId) && Intrinsics.areEqual(this.currency, wireTransaction.currency) && Intrinsics.areEqual(this.externalTransactionKind, wireTransaction.externalTransactionKind);
        }
        return false;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final long getBilledAmount() {
        return this.billedAmount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getExternalTransactionId() {
        return this.externalTransactionId;
    }

    public final String getExternalTransactionKind() {
        return this.externalTransactionKind;
    }

    public final String getId() {
        return this.f66769id;
    }

    public final WireMerchant getMerchant() {
        return this.merchant;
    }

    public final String getMerchantId() {
        return this.merchantId;
    }

    public final String getMerchantSiteId() {
        return this.merchantSiteId;
    }

    public final long getPayableAmount() {
        return this.payableAmount;
    }

    public final DateTime getTransactionDate() {
        return this.transactionDate;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f66769id.hashCode() * 31) + Long.hashCode(this.payableAmount)) * 31) + Long.hashCode(this.billedAmount)) * 31) + Long.hashCode(this.amount)) * 31) + this.merchantSiteId.hashCode()) * 31) + this.merchant.hashCode()) * 31) + this.transactionDate.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.externalTransactionId.hashCode()) * 31) + this.merchantId.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.externalTransactionKind.hashCode();
    }

    public String toString() {
        String str = this.f66769id;
        long j = this.payableAmount;
        long j2 = this.billedAmount;
        long j3 = this.amount;
        String str2 = this.merchantSiteId;
        WireMerchant wireMerchant = this.merchant;
        DateTime dateTime = this.transactionDate;
        String str3 = this.userId;
        String str4 = this.externalTransactionId;
        String str5 = this.merchantId;
        String str6 = this.currency;
        String str7 = this.externalTransactionKind;
        return "WireTransaction(id=" + str + ", payableAmount=" + j + ", billedAmount=" + j2 + ", amount=" + j3 + ", merchantSiteId=" + str2 + ", merchant=" + wireMerchant + ", transactionDate=" + dateTime + ", userId=" + str3 + ", externalTransactionId=" + str4 + ", merchantId=" + str5 + ", currency=" + str6 + ", externalTransactionKind=" + str7 + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ WireTransaction(String str, long j, long j2, long j3, String str2, WireMerchant wireMerchant, DateTime dateTime, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, r7, r9, r11, r1, wireMerchant, r13, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? "" : str4, (i & 512) != 0 ? "" : str5, (i & 1024) != 0 ? "" : str6, (i & 2048) != 0 ? "" : str7);
        DateTime dateTime2;
        String str8 = (i & 1) != 0 ? "" : str;
        long j4 = (i & 2) != 0 ? 0L : j;
        long j5 = (i & 4) != 0 ? 0L : j2;
        long j6 = (i & 8) != 0 ? 0L : j3;
        String str9 = (i & 16) != 0 ? "" : str2;
        if ((i & 64) != 0) {
            DateTime now = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(now, "now()");
            dateTime2 = now;
        } else {
            dateTime2 = dateTime;
        }
    }
}
