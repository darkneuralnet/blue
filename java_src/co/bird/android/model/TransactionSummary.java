package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\u0006\u0010%\u001a\u00020 J\b\u0010&\u001a\u0004\u0018\u00010'J\t\u0010(\u001a\u00020 HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m28432d2 = {"Lco/bird/android/model/TransactionSummary;", "", "ride", "Lco/bird/android/model/TransactionSummaryRide;", "transaction", "Lco/bird/android/model/TransactionSummaryTransaction;", "charge", "Lco/bird/android/model/TransactionSummaryAdhocCharge;", "transactedInFull", "", "merchantTransaction", "Lco/bird/android/model/MerchantTransaction;", "(Lco/bird/android/model/TransactionSummaryRide;Lco/bird/android/model/TransactionSummaryTransaction;Lco/bird/android/model/TransactionSummaryAdhocCharge;ZLco/bird/android/model/MerchantTransaction;)V", "getCharge", "()Lco/bird/android/model/TransactionSummaryAdhocCharge;", "getMerchantTransaction", "()Lco/bird/android/model/MerchantTransaction;", "getRide", "()Lco/bird/android/model/TransactionSummaryRide;", "getTransactedInFull", "()Z", "getTransaction", "()Lco/bird/android/model/TransactionSummaryTransaction;", "component1", "component2", "component3", "component4", "component5", "copy", "cost", "", "currency", "", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "primaryKey", FraudDetectionData.KEY_TIMESTAMP, "Lorg/joda/time/DateTime;", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TransactionSummary {
    @JsonProperty("charge")
    @InterfaceC41208ft5("charge")
    private final TransactionSummaryAdhocCharge charge;
    @JsonProperty("merchant_transaction")
    @InterfaceC41208ft5("merchant_transaction")
    private final MerchantTransaction merchantTransaction;
    @JsonProperty("ride")
    @InterfaceC41208ft5("ride")
    private final TransactionSummaryRide ride;
    @JsonProperty("transacted_in_full")
    @InterfaceC41208ft5("transacted_in_full")
    private final boolean transactedInFull;
    @JsonProperty("transaction")
    @InterfaceC41208ft5("transaction")
    private final TransactionSummaryTransaction transaction;

    public TransactionSummary() {
        this(null, null, null, false, null, 31, null);
    }

    public static /* synthetic */ TransactionSummary copy$default(TransactionSummary transactionSummary, TransactionSummaryRide transactionSummaryRide, TransactionSummaryTransaction transactionSummaryTransaction, TransactionSummaryAdhocCharge transactionSummaryAdhocCharge, boolean z, MerchantTransaction merchantTransaction, int i, Object obj) {
        if ((i & 1) != 0) {
            transactionSummaryRide = transactionSummary.ride;
        }
        if ((i & 2) != 0) {
            transactionSummaryTransaction = transactionSummary.transaction;
        }
        TransactionSummaryTransaction transactionSummaryTransaction2 = transactionSummaryTransaction;
        if ((i & 4) != 0) {
            transactionSummaryAdhocCharge = transactionSummary.charge;
        }
        TransactionSummaryAdhocCharge transactionSummaryAdhocCharge2 = transactionSummaryAdhocCharge;
        if ((i & 8) != 0) {
            z = transactionSummary.transactedInFull;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            merchantTransaction = transactionSummary.merchantTransaction;
        }
        return transactionSummary.copy(transactionSummaryRide, transactionSummaryTransaction2, transactionSummaryAdhocCharge2, z2, merchantTransaction);
    }

    public final TransactionSummaryRide component1() {
        return this.ride;
    }

    public final TransactionSummaryTransaction component2() {
        return this.transaction;
    }

    public final TransactionSummaryAdhocCharge component3() {
        return this.charge;
    }

    public final boolean component4() {
        return this.transactedInFull;
    }

    public final MerchantTransaction component5() {
        return this.merchantTransaction;
    }

    public final TransactionSummary copy(TransactionSummaryRide transactionSummaryRide, TransactionSummaryTransaction transactionSummaryTransaction, TransactionSummaryAdhocCharge transactionSummaryAdhocCharge, boolean z, MerchantTransaction merchantTransaction) {
        return new TransactionSummary(transactionSummaryRide, transactionSummaryTransaction, transactionSummaryAdhocCharge, z, merchantTransaction);
    }

    public final long cost() {
        TransactionSummaryTransaction transactionSummaryTransaction = this.transaction;
        if (transactionSummaryTransaction != null) {
            return transactionSummaryTransaction.getAmount();
        }
        TransactionSummaryAdhocCharge transactionSummaryAdhocCharge = this.charge;
        if (transactionSummaryAdhocCharge != null) {
            return transactionSummaryAdhocCharge.getAmount();
        }
        return 0L;
    }

    public final String currency() {
        String currency;
        TransactionSummaryTransaction transactionSummaryTransaction = this.transaction;
        if (transactionSummaryTransaction == null || (currency = transactionSummaryTransaction.getCurrency()) == null) {
            TransactionSummaryAdhocCharge transactionSummaryAdhocCharge = this.charge;
            String currency2 = transactionSummaryAdhocCharge != null ? transactionSummaryAdhocCharge.getCurrency() : null;
            return currency2 == null ? Source.USD : currency2;
        }
        return currency;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TransactionSummary) {
            TransactionSummary transactionSummary = (TransactionSummary) obj;
            return Intrinsics.areEqual(this.ride, transactionSummary.ride) && Intrinsics.areEqual(this.transaction, transactionSummary.transaction) && Intrinsics.areEqual(this.charge, transactionSummary.charge) && this.transactedInFull == transactionSummary.transactedInFull && Intrinsics.areEqual(this.merchantTransaction, transactionSummary.merchantTransaction);
        }
        return false;
    }

    public final TransactionSummaryAdhocCharge getCharge() {
        return this.charge;
    }

    public final MerchantTransaction getMerchantTransaction() {
        return this.merchantTransaction;
    }

    public final TransactionSummaryRide getRide() {
        return this.ride;
    }

    public final boolean getTransactedInFull() {
        return this.transactedInFull;
    }

    public final TransactionSummaryTransaction getTransaction() {
        return this.transaction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        TransactionSummaryRide transactionSummaryRide = this.ride;
        int hashCode = (transactionSummaryRide == null ? 0 : transactionSummaryRide.hashCode()) * 31;
        TransactionSummaryTransaction transactionSummaryTransaction = this.transaction;
        int hashCode2 = (hashCode + (transactionSummaryTransaction == null ? 0 : transactionSummaryTransaction.hashCode())) * 31;
        TransactionSummaryAdhocCharge transactionSummaryAdhocCharge = this.charge;
        int hashCode3 = (hashCode2 + (transactionSummaryAdhocCharge == null ? 0 : transactionSummaryAdhocCharge.hashCode())) * 31;
        boolean z = this.transactedInFull;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        MerchantTransaction merchantTransaction = this.merchantTransaction;
        return i2 + (merchantTransaction != null ? merchantTransaction.hashCode() : 0);
    }

    public final String primaryKey() {
        String id;
        TransactionSummaryRide transactionSummaryRide = this.ride;
        if (transactionSummaryRide == null || (id = transactionSummaryRide.getId()) == null) {
            TransactionSummaryTransaction transactionSummaryTransaction = this.transaction;
            if (transactionSummaryTransaction != null) {
                return transactionSummaryTransaction.getId();
            }
            TransactionSummaryAdhocCharge transactionSummaryAdhocCharge = this.charge;
            String id2 = transactionSummaryAdhocCharge != null ? transactionSummaryAdhocCharge.getId() : null;
            return id2 == null ? "" : id2;
        }
        return id;
    }

    public final DateTime timestamp() {
        DateTime startedAt;
        TransactionSummaryRide transactionSummaryRide = this.ride;
        if (transactionSummaryRide == null || (startedAt = transactionSummaryRide.getStartedAt()) == null) {
            TransactionSummaryTransaction transactionSummaryTransaction = this.transaction;
            DateTime createdAt = transactionSummaryTransaction != null ? transactionSummaryTransaction.getCreatedAt() : null;
            if (createdAt == null) {
                TransactionSummaryAdhocCharge transactionSummaryAdhocCharge = this.charge;
                if (transactionSummaryAdhocCharge != null) {
                    return transactionSummaryAdhocCharge.getCreatedAt();
                }
                return null;
            }
            return createdAt;
        }
        return startedAt;
    }

    public String toString() {
        TransactionSummaryRide transactionSummaryRide = this.ride;
        TransactionSummaryTransaction transactionSummaryTransaction = this.transaction;
        TransactionSummaryAdhocCharge transactionSummaryAdhocCharge = this.charge;
        boolean z = this.transactedInFull;
        MerchantTransaction merchantTransaction = this.merchantTransaction;
        return "TransactionSummary(ride=" + transactionSummaryRide + ", transaction=" + transactionSummaryTransaction + ", charge=" + transactionSummaryAdhocCharge + ", transactedInFull=" + z + ", merchantTransaction=" + merchantTransaction + ")";
    }

    public TransactionSummary(TransactionSummaryRide transactionSummaryRide, TransactionSummaryTransaction transactionSummaryTransaction, TransactionSummaryAdhocCharge transactionSummaryAdhocCharge, boolean z, MerchantTransaction merchantTransaction) {
        this.ride = transactionSummaryRide;
        this.transaction = transactionSummaryTransaction;
        this.charge = transactionSummaryAdhocCharge;
        this.transactedInFull = z;
        this.merchantTransaction = merchantTransaction;
    }

    public /* synthetic */ TransactionSummary(TransactionSummaryRide transactionSummaryRide, TransactionSummaryTransaction transactionSummaryTransaction, TransactionSummaryAdhocCharge transactionSummaryAdhocCharge, boolean z, MerchantTransaction merchantTransaction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : transactionSummaryRide, (i & 2) != 0 ? null : transactionSummaryTransaction, (i & 4) != 0 ? null : transactionSummaryAdhocCharge, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : merchantTransaction);
    }
}
