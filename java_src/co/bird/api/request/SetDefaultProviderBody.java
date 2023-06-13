package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PaymentProvider;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, m28432d2 = {"Lco/bird/api/request/SetDefaultProviderBody;", "", "kind", "Lco/bird/android/model/constant/PaymentProvider;", "userId", "", "defaultPaymentMethodId", "(Lco/bird/android/model/constant/PaymentProvider;Ljava/lang/String;Ljava/lang/String;)V", "getDefaultPaymentMethodId", "()Ljava/lang/String;", "getKind", "()Lco/bird/android/model/constant/PaymentProvider;", "getUserId", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SetDefaultProviderBody {
    @JsonProperty("default_payment_method")
    @InterfaceC41208ft5("default_payment_method")
    private final String defaultPaymentMethodId;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final PaymentProvider kind;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    public SetDefaultProviderBody(PaymentProvider kind, String userId, String str) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.kind = kind;
        this.userId = userId;
        this.defaultPaymentMethodId = str;
    }

    public static /* synthetic */ SetDefaultProviderBody copy$default(SetDefaultProviderBody setDefaultProviderBody, PaymentProvider paymentProvider, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentProvider = setDefaultProviderBody.kind;
        }
        if ((i & 2) != 0) {
            str = setDefaultProviderBody.userId;
        }
        if ((i & 4) != 0) {
            str2 = setDefaultProviderBody.defaultPaymentMethodId;
        }
        return setDefaultProviderBody.copy(paymentProvider, str, str2);
    }

    public final PaymentProvider component1() {
        return this.kind;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.defaultPaymentMethodId;
    }

    public final SetDefaultProviderBody copy(PaymentProvider kind, String userId, String str) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new SetDefaultProviderBody(kind, userId, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetDefaultProviderBody) {
            SetDefaultProviderBody setDefaultProviderBody = (SetDefaultProviderBody) obj;
            return this.kind == setDefaultProviderBody.kind && Intrinsics.areEqual(this.userId, setDefaultProviderBody.userId) && Intrinsics.areEqual(this.defaultPaymentMethodId, setDefaultProviderBody.defaultPaymentMethodId);
        }
        return false;
    }

    public final String getDefaultPaymentMethodId() {
        return this.defaultPaymentMethodId;
    }

    public final PaymentProvider getKind() {
        return this.kind;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((this.kind.hashCode() * 31) + this.userId.hashCode()) * 31;
        String str = this.defaultPaymentMethodId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        PaymentProvider paymentProvider = this.kind;
        String str = this.userId;
        String str2 = this.defaultPaymentMethodId;
        return "SetDefaultProviderBody(kind=" + paymentProvider + ", userId=" + str + ", defaultPaymentMethodId=" + str2 + ")";
    }

    public /* synthetic */ SetDefaultProviderBody(PaymentProvider paymentProvider, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentProvider, str, (i & 4) != 0 ? null : str2);
    }
}
