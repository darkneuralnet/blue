package co.bird.android.model;

import co.bird.android.model.wire.WireMerchant;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0084\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016¨\u00066"}, m28432d2 = {"Lco/bird/android/model/MerchantTransaction;", "", "id", "", "userId", "merchant", "Lco/bird/android/model/wire/WireMerchant;", "merchantId", "merchantSiteId", "amount", "", "billedAmount", "currency", "preTipAmount", "tipAmount", "date", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMerchant;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lorg/joda/time/DateTime;)V", "getAmount", "()J", "getBilledAmount", "getCurrency", "()Ljava/lang/String;", "getDate", "()Lorg/joda/time/DateTime;", "getId", "getMerchant", "()Lco/bird/android/model/wire/WireMerchant;", "getMerchantId", "getMerchantSiteId", "getPreTipAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTipAmount", "getUserId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/wire/WireMerchant;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Lorg/joda/time/DateTime;)Lco/bird/android/model/MerchantTransaction;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class MerchantTransaction {
    @JsonProperty("amount")
    @InterfaceC41208ft5("amount")
    private final long amount;
    @JsonProperty("billed_amount")
    @InterfaceC41208ft5("billed_amount")
    private final long billedAmount;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("transaction_date")
    @InterfaceC41208ft5("transaction_date")
    private final DateTime date;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66605id;
    @JsonProperty("merchant")
    @InterfaceC41208ft5("merchant")
    private final WireMerchant merchant;
    @JsonProperty("merchant_id")
    @InterfaceC41208ft5("merchant_id")
    private final String merchantId;
    @JsonProperty("merchant_site_id")
    @InterfaceC41208ft5("merchant_site_id")
    private final String merchantSiteId;
    @JsonProperty("pre_tip_amount")
    @InterfaceC41208ft5("pre_tip_amount")
    private final Long preTipAmount;
    @JsonProperty("tip_amount")
    @InterfaceC41208ft5("tip_amount")
    private final Long tipAmount;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    public MerchantTransaction() {
        this(null, null, null, null, null, 0L, 0L, null, null, null, null, 2047, null);
    }

    public final String component1() {
        return this.f66605id;
    }

    public final Long component10() {
        return this.tipAmount;
    }

    public final DateTime component11() {
        return this.date;
    }

    public final String component2() {
        return this.userId;
    }

    public final WireMerchant component3() {
        return this.merchant;
    }

    public final String component4() {
        return this.merchantId;
    }

    public final String component5() {
        return this.merchantSiteId;
    }

    public final long component6() {
        return this.amount;
    }

    public final long component7() {
        return this.billedAmount;
    }

    public final String component8() {
        return this.currency;
    }

    public final Long component9() {
        return this.preTipAmount;
    }

    public final MerchantTransaction copy(String id, String userId, WireMerchant wireMerchant, String merchantId, String merchantSiteId, long j, long j2, String currency, Long l, Long l2, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new MerchantTransaction(id, userId, wireMerchant, merchantId, merchantSiteId, j, j2, currency, l, l2, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MerchantTransaction) {
            MerchantTransaction merchantTransaction = (MerchantTransaction) obj;
            return Intrinsics.areEqual(this.f66605id, merchantTransaction.f66605id) && Intrinsics.areEqual(this.userId, merchantTransaction.userId) && Intrinsics.areEqual(this.merchant, merchantTransaction.merchant) && Intrinsics.areEqual(this.merchantId, merchantTransaction.merchantId) && Intrinsics.areEqual(this.merchantSiteId, merchantTransaction.merchantSiteId) && this.amount == merchantTransaction.amount && this.billedAmount == merchantTransaction.billedAmount && Intrinsics.areEqual(this.currency, merchantTransaction.currency) && Intrinsics.areEqual(this.preTipAmount, merchantTransaction.preTipAmount) && Intrinsics.areEqual(this.tipAmount, merchantTransaction.tipAmount) && Intrinsics.areEqual(this.date, merchantTransaction.date);
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

    public final DateTime getDate() {
        return this.date;
    }

    public final String getId() {
        return this.f66605id;
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

    public final Long getPreTipAmount() {
        return this.preTipAmount;
    }

    public final Long getTipAmount() {
        return this.tipAmount;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((this.f66605id.hashCode() * 31) + this.userId.hashCode()) * 31;
        WireMerchant wireMerchant = this.merchant;
        int hashCode2 = (((((((((((hashCode + (wireMerchant == null ? 0 : wireMerchant.hashCode())) * 31) + this.merchantId.hashCode()) * 31) + this.merchantSiteId.hashCode()) * 31) + Long.hashCode(this.amount)) * 31) + Long.hashCode(this.billedAmount)) * 31) + this.currency.hashCode()) * 31;
        Long l = this.preTipAmount;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.tipAmount;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        DateTime dateTime = this.date;
        return hashCode4 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66605id;
        String str2 = this.userId;
        WireMerchant wireMerchant = this.merchant;
        String str3 = this.merchantId;
        String str4 = this.merchantSiteId;
        long j = this.amount;
        long j2 = this.billedAmount;
        String str5 = this.currency;
        Long l = this.preTipAmount;
        Long l2 = this.tipAmount;
        DateTime dateTime = this.date;
        return "MerchantTransaction(id=" + str + ", userId=" + str2 + ", merchant=" + wireMerchant + ", merchantId=" + str3 + ", merchantSiteId=" + str4 + ", amount=" + j + ", billedAmount=" + j2 + ", currency=" + str5 + ", preTipAmount=" + l + ", tipAmount=" + l2 + ", date=" + dateTime + ")";
    }

    public MerchantTransaction(String id, String userId, WireMerchant wireMerchant, String merchantId, String merchantSiteId, long j, long j2, String currency, Long l, Long l2, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(merchantSiteId, "merchantSiteId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f66605id = id;
        this.userId = userId;
        this.merchant = wireMerchant;
        this.merchantId = merchantId;
        this.merchantSiteId = merchantSiteId;
        this.amount = j;
        this.billedAmount = j2;
        this.currency = currency;
        this.preTipAmount = l;
        this.tipAmount = l2;
        this.date = dateTime;
    }

    public /* synthetic */ MerchantTransaction(String str, String str2, WireMerchant wireMerchant, String str3, String str4, long j, long j2, String str5, Long l, Long l2, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : wireMerchant, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? 0L : j, (i & 64) == 0 ? j2 : 0L, (i & 128) == 0 ? str5 : "", (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : l2, (i & 1024) == 0 ? dateTime : null);
    }
}
