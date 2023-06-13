package co.bird.android.model;

import co.bird.android.model.constant.IncomingTransactionKind;
import co.bird.android.model.constant.IncomingTransactionSourceKind;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003JS\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, m28432d2 = {"Lco/bird/android/model/TransactionSummaryTransaction;", "", "id", "", "amount", "", "transactionKind", "Lco/bird/android/model/constant/IncomingTransactionKind;", "sourceKind", "Lco/bird/android/model/constant/IncomingTransactionSourceKind;", "currency", "createdAt", "Lorg/joda/time/DateTime;", "metadata", "Lco/bird/android/model/TransactionMetadata;", "(Ljava/lang/String;JLco/bird/android/model/constant/IncomingTransactionKind;Lco/bird/android/model/constant/IncomingTransactionSourceKind;Ljava/lang/String;Lorg/joda/time/DateTime;Lco/bird/android/model/TransactionMetadata;)V", "getAmount", "()J", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getCurrency", "()Ljava/lang/String;", "getId", "getMetadata", "()Lco/bird/android/model/TransactionMetadata;", "getSourceKind", "()Lco/bird/android/model/constant/IncomingTransactionSourceKind;", "getTransactionKind", "()Lco/bird/android/model/constant/IncomingTransactionKind;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TransactionSummaryTransaction {
    @JsonProperty("amount")
    @InterfaceC41208ft5("amount")
    private final long amount;
    @JsonProperty("created_at")
    @InterfaceC41208ft5("created_at")
    private final DateTime createdAt;
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66630id;
    @JsonProperty("metadata")
    @InterfaceC41208ft5("metadata")
    private final TransactionMetadata metadata;
    @JsonProperty("source_kind")
    @InterfaceC41208ft5("source_kind")
    private final IncomingTransactionSourceKind sourceKind;
    @JsonProperty("transaction_kind")
    @InterfaceC41208ft5("transaction_kind")
    private final IncomingTransactionKind transactionKind;

    public TransactionSummaryTransaction() {
        this(null, 0L, null, null, null, null, null, 127, null);
    }

    public final String component1() {
        return this.f66630id;
    }

    public final long component2() {
        return this.amount;
    }

    public final IncomingTransactionKind component3() {
        return this.transactionKind;
    }

    public final IncomingTransactionSourceKind component4() {
        return this.sourceKind;
    }

    public final String component5() {
        return this.currency;
    }

    public final DateTime component6() {
        return this.createdAt;
    }

    public final TransactionMetadata component7() {
        return this.metadata;
    }

    public final TransactionSummaryTransaction copy(String id, long j, IncomingTransactionKind transactionKind, IncomingTransactionSourceKind sourceKind, String currency, DateTime dateTime, TransactionMetadata transactionMetadata) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(transactionKind, "transactionKind");
        Intrinsics.checkNotNullParameter(sourceKind, "sourceKind");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new TransactionSummaryTransaction(id, j, transactionKind, sourceKind, currency, dateTime, transactionMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransactionSummaryTransaction) {
            TransactionSummaryTransaction transactionSummaryTransaction = (TransactionSummaryTransaction) obj;
            return Intrinsics.areEqual(this.f66630id, transactionSummaryTransaction.f66630id) && this.amount == transactionSummaryTransaction.amount && this.transactionKind == transactionSummaryTransaction.transactionKind && this.sourceKind == transactionSummaryTransaction.sourceKind && Intrinsics.areEqual(this.currency, transactionSummaryTransaction.currency) && Intrinsics.areEqual(this.createdAt, transactionSummaryTransaction.createdAt) && Intrinsics.areEqual(this.metadata, transactionSummaryTransaction.metadata);
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

    public final String getId() {
        return this.f66630id;
    }

    public final TransactionMetadata getMetadata() {
        return this.metadata;
    }

    public final IncomingTransactionSourceKind getSourceKind() {
        return this.sourceKind;
    }

    public final IncomingTransactionKind getTransactionKind() {
        return this.transactionKind;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f66630id.hashCode() * 31) + Long.hashCode(this.amount)) * 31) + this.transactionKind.hashCode()) * 31) + this.sourceKind.hashCode()) * 31) + this.currency.hashCode()) * 31;
        DateTime dateTime = this.createdAt;
        int hashCode2 = (hashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        TransactionMetadata transactionMetadata = this.metadata;
        return hashCode2 + (transactionMetadata != null ? transactionMetadata.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66630id;
        long j = this.amount;
        IncomingTransactionKind incomingTransactionKind = this.transactionKind;
        IncomingTransactionSourceKind incomingTransactionSourceKind = this.sourceKind;
        String str2 = this.currency;
        DateTime dateTime = this.createdAt;
        TransactionMetadata transactionMetadata = this.metadata;
        return "TransactionSummaryTransaction(id=" + str + ", amount=" + j + ", transactionKind=" + incomingTransactionKind + ", sourceKind=" + incomingTransactionSourceKind + ", currency=" + str2 + ", createdAt=" + dateTime + ", metadata=" + transactionMetadata + ")";
    }

    public TransactionSummaryTransaction(String id, long j, IncomingTransactionKind transactionKind, IncomingTransactionSourceKind sourceKind, String currency, DateTime dateTime, TransactionMetadata transactionMetadata) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(transactionKind, "transactionKind");
        Intrinsics.checkNotNullParameter(sourceKind, "sourceKind");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f66630id = id;
        this.amount = j;
        this.transactionKind = transactionKind;
        this.sourceKind = sourceKind;
        this.currency = currency;
        this.createdAt = dateTime;
        this.metadata = transactionMetadata;
    }

    public /* synthetic */ TransactionSummaryTransaction(String str, long j, IncomingTransactionKind incomingTransactionKind, IncomingTransactionSourceKind incomingTransactionSourceKind, String str2, DateTime dateTime, TransactionMetadata transactionMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? IncomingTransactionKind.UNKNOWN : incomingTransactionKind, (i & 8) != 0 ? IncomingTransactionSourceKind.UNKNOWN : incomingTransactionSourceKind, (i & 16) != 0 ? Source.USD : str2, (i & 32) != 0 ? null : dateTime, (i & 64) == 0 ? transactionMetadata : null);
    }
}
