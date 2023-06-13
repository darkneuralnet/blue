package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003JY\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006'"}, m28432d2 = {"Lco/bird/android/model/TransactionSummaryAdhocCharge;", "", "id", "", "receiptId", "amount", "", "kind", "featureKind", "Lco/bird/android/model/TransactionSummaryChargeFeatureKind;", "currency", "createdAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lco/bird/android/model/TransactionSummaryChargeFeatureKind;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getAmount", "()J", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getCurrency", "()Ljava/lang/String;", "getFeatureKind", "()Lco/bird/android/model/TransactionSummaryChargeFeatureKind;", "getId", "getKind", "getReceiptId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TransactionSummaryAdhocCharge {
    @JsonProperty("amount")
    @InterfaceC41208ft5("amount")
    private final long amount;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("feature_kind")
    @InterfaceC41208ft5("feature_kind")
    private final TransactionSummaryChargeFeatureKind featureKind;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66628id;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final String kind;
    @JsonProperty("receipt_id")
    @InterfaceC41208ft5("receipt_id")
    private final String receiptId;

    public TransactionSummaryAdhocCharge() {
        this(null, null, 0L, null, null, null, null, 127, null);
    }

    public final String component1() {
        return this.f66628id;
    }

    public final String component2() {
        return this.receiptId;
    }

    public final long component3() {
        return this.amount;
    }

    public final String component4() {
        return this.kind;
    }

    public final TransactionSummaryChargeFeatureKind component5() {
        return this.featureKind;
    }

    public final String component6() {
        return this.currency;
    }

    public final DateTime component7() {
        return this.createdAt;
    }

    public final TransactionSummaryAdhocCharge copy(String id, String str, long j, String str2, TransactionSummaryChargeFeatureKind transactionSummaryChargeFeatureKind, String str3, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new TransactionSummaryAdhocCharge(id, str, j, str2, transactionSummaryChargeFeatureKind, str3, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransactionSummaryAdhocCharge) {
            TransactionSummaryAdhocCharge transactionSummaryAdhocCharge = (TransactionSummaryAdhocCharge) obj;
            return Intrinsics.areEqual(this.f66628id, transactionSummaryAdhocCharge.f66628id) && Intrinsics.areEqual(this.receiptId, transactionSummaryAdhocCharge.receiptId) && this.amount == transactionSummaryAdhocCharge.amount && Intrinsics.areEqual(this.kind, transactionSummaryAdhocCharge.kind) && this.featureKind == transactionSummaryAdhocCharge.featureKind && Intrinsics.areEqual(this.currency, transactionSummaryAdhocCharge.currency) && Intrinsics.areEqual(this.createdAt, transactionSummaryAdhocCharge.createdAt);
        }
        return false;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final TransactionSummaryChargeFeatureKind getFeatureKind() {
        return this.featureKind;
    }

    public final String getId() {
        return this.f66628id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getReceiptId() {
        return this.receiptId;
    }

    public int hashCode() {
        int hashCode = this.f66628id.hashCode() * 31;
        String str = this.receiptId;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.amount)) * 31;
        String str2 = this.kind;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TransactionSummaryChargeFeatureKind transactionSummaryChargeFeatureKind = this.featureKind;
        int hashCode4 = (hashCode3 + (transactionSummaryChargeFeatureKind == null ? 0 : transactionSummaryChargeFeatureKind.hashCode())) * 31;
        String str3 = this.currency;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DateTime dateTime = this.createdAt;
        return hashCode5 + (dateTime != null ? dateTime.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66628id;
        String str2 = this.receiptId;
        long j = this.amount;
        String str3 = this.kind;
        TransactionSummaryChargeFeatureKind transactionSummaryChargeFeatureKind = this.featureKind;
        String str4 = this.currency;
        DateTime dateTime = this.createdAt;
        return "TransactionSummaryAdhocCharge(id=" + str + ", receiptId=" + str2 + ", amount=" + j + ", kind=" + str3 + ", featureKind=" + transactionSummaryChargeFeatureKind + ", currency=" + str4 + ", createdAt=" + dateTime + ")";
    }

    public TransactionSummaryAdhocCharge(String id, String str, long j, String str2, TransactionSummaryChargeFeatureKind transactionSummaryChargeFeatureKind, String str3, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f66628id = id;
        this.receiptId = str;
        this.amount = j;
        this.kind = str2;
        this.featureKind = transactionSummaryChargeFeatureKind;
        this.currency = str3;
        this.createdAt = dateTime;
    }

    public /* synthetic */ TransactionSummaryAdhocCharge(String str, String str2, long j, String str3, TransactionSummaryChargeFeatureKind transactionSummaryChargeFeatureKind, String str4, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : transactionSummaryChargeFeatureKind, (i & 32) != 0 ? null : str4, (i & 64) == 0 ? dateTime : null);
    }
}
