package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Source;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/LongTermRentalTransaction;", "", "id", "", "currency", "amount", "", "createdAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;JLorg/joda/time/DateTime;)V", "getAmount", "()J", "getCreatedAt", "()Lorg/joda/time/DateTime;", "getCurrency", "()Ljava/lang/String;", "getId", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LongTermRentalTransaction {
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
    private final String f66604id;

    public LongTermRentalTransaction() {
        this(null, null, 0L, null, 15, null);
    }

    public static /* synthetic */ LongTermRentalTransaction copy$default(LongTermRentalTransaction longTermRentalTransaction, String str, String str2, long j, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = longTermRentalTransaction.f66604id;
        }
        if ((i & 2) != 0) {
            str2 = longTermRentalTransaction.currency;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            j = longTermRentalTransaction.amount;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            dateTime = longTermRentalTransaction.createdAt;
        }
        return longTermRentalTransaction.copy(str, str3, j2, dateTime);
    }

    public final String component1() {
        return this.f66604id;
    }

    public final String component2() {
        return this.currency;
    }

    public final long component3() {
        return this.amount;
    }

    public final DateTime component4() {
        return this.createdAt;
    }

    public final LongTermRentalTransaction copy(String id, String currency, long j, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new LongTermRentalTransaction(id, currency, j, dateTime);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LongTermRentalTransaction) {
            LongTermRentalTransaction longTermRentalTransaction = (LongTermRentalTransaction) obj;
            return Intrinsics.areEqual(this.f66604id, longTermRentalTransaction.f66604id) && Intrinsics.areEqual(this.currency, longTermRentalTransaction.currency) && this.amount == longTermRentalTransaction.amount && Intrinsics.areEqual(this.createdAt, longTermRentalTransaction.createdAt);
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
        return this.f66604id;
    }

    public int hashCode() {
        int hashCode = ((((this.f66604id.hashCode() * 31) + this.currency.hashCode()) * 31) + Long.hashCode(this.amount)) * 31;
        DateTime dateTime = this.createdAt;
        return hashCode + (dateTime == null ? 0 : dateTime.hashCode());
    }

    public String toString() {
        String str = this.f66604id;
        String str2 = this.currency;
        long j = this.amount;
        DateTime dateTime = this.createdAt;
        return "LongTermRentalTransaction(id=" + str + ", currency=" + str2 + ", amount=" + j + ", createdAt=" + dateTime + ")";
    }

    public LongTermRentalTransaction(String id, String currency, long j, DateTime dateTime) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f66604id = id;
        this.currency = currency;
        this.amount = j;
        this.createdAt = dateTime;
    }

    public /* synthetic */ LongTermRentalTransaction(String str, String str2, long j, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Source.USD : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? null : dateTime);
    }
}
