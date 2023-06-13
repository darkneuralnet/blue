package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PaymentMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/api/request/BankRedirectOneTimeRefillRequest;", "", "amount", "", "paymentMethod", "Lco/bird/android/model/constant/PaymentMethod;", "intentId", "", "(JLco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;)V", "getAmount", "()J", "getIntentId", "()Ljava/lang/String;", "getPaymentMethod", "()Lco/bird/android/model/constant/PaymentMethod;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BankRedirectOneTimeRefillRequest {
    @JsonProperty("amount")
    @InterfaceC41208ft5("amount")
    private final long amount;
    @JsonProperty("intent_id")
    @InterfaceC41208ft5("intent_id")
    private final String intentId;
    @JsonProperty("payment_method_type")
    @InterfaceC41208ft5("payment_method_type")
    private final PaymentMethod paymentMethod;

    public BankRedirectOneTimeRefillRequest(long j, PaymentMethod paymentMethod, String str) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.amount = j;
        this.paymentMethod = paymentMethod;
        this.intentId = str;
    }

    public static /* synthetic */ BankRedirectOneTimeRefillRequest copy$default(BankRedirectOneTimeRefillRequest bankRedirectOneTimeRefillRequest, long j, PaymentMethod paymentMethod, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = bankRedirectOneTimeRefillRequest.amount;
        }
        if ((i & 2) != 0) {
            paymentMethod = bankRedirectOneTimeRefillRequest.paymentMethod;
        }
        if ((i & 4) != 0) {
            str = bankRedirectOneTimeRefillRequest.intentId;
        }
        return bankRedirectOneTimeRefillRequest.copy(j, paymentMethod, str);
    }

    public final long component1() {
        return this.amount;
    }

    public final PaymentMethod component2() {
        return this.paymentMethod;
    }

    public final String component3() {
        return this.intentId;
    }

    public final BankRedirectOneTimeRefillRequest copy(long j, PaymentMethod paymentMethod, String str) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        return new BankRedirectOneTimeRefillRequest(j, paymentMethod, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BankRedirectOneTimeRefillRequest) {
            BankRedirectOneTimeRefillRequest bankRedirectOneTimeRefillRequest = (BankRedirectOneTimeRefillRequest) obj;
            return this.amount == bankRedirectOneTimeRefillRequest.amount && this.paymentMethod == bankRedirectOneTimeRefillRequest.paymentMethod && Intrinsics.areEqual(this.intentId, bankRedirectOneTimeRefillRequest.intentId);
        }
        return false;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final String getIntentId() {
        return this.intentId;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.amount) * 31) + this.paymentMethod.hashCode()) * 31;
        String str = this.intentId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.amount;
        PaymentMethod paymentMethod = this.paymentMethod;
        String str = this.intentId;
        return "BankRedirectOneTimeRefillRequest(amount=" + j + ", paymentMethod=" + paymentMethod + ", intentId=" + str + ")";
    }
}
