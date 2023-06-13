package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PaymentProvider;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, m28432d2 = {"Lco/bird/api/request/BirdCustomer;", "", "kind", "Lco/bird/android/model/constant/PaymentProvider;", "userId", "", "externalId", "currency", "email", "(Lco/bird/android/model/constant/PaymentProvider;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getEmail", "getExternalId", "getKind", "()Lco/bird/android/model/constant/PaymentProvider;", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BirdCustomer {
    @JsonProperty("currency")
    @InterfaceC41208ft5("currency")
    private final String currency;
    @JsonProperty("email")
    @InterfaceC41208ft5("email")
    private final String email;
    @JsonProperty("external_id")
    @InterfaceC41208ft5("external_id")
    private final String externalId;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final PaymentProvider kind;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    public BirdCustomer(PaymentProvider kind, String userId, String externalId, String currency, String str) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.kind = kind;
        this.userId = userId;
        this.externalId = externalId;
        this.currency = currency;
        this.email = str;
    }

    public static /* synthetic */ BirdCustomer copy$default(BirdCustomer birdCustomer, PaymentProvider paymentProvider, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentProvider = birdCustomer.kind;
        }
        if ((i & 2) != 0) {
            str = birdCustomer.userId;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = birdCustomer.externalId;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = birdCustomer.currency;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = birdCustomer.email;
        }
        return birdCustomer.copy(paymentProvider, str5, str6, str7, str4);
    }

    public final PaymentProvider component1() {
        return this.kind;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.externalId;
    }

    public final String component4() {
        return this.currency;
    }

    public final String component5() {
        return this.email;
    }

    public final BirdCustomer copy(PaymentProvider kind, String userId, String externalId, String currency, String str) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new BirdCustomer(kind, userId, externalId, currency, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BirdCustomer) {
            BirdCustomer birdCustomer = (BirdCustomer) obj;
            return this.kind == birdCustomer.kind && Intrinsics.areEqual(this.userId, birdCustomer.userId) && Intrinsics.areEqual(this.externalId, birdCustomer.externalId) && Intrinsics.areEqual(this.currency, birdCustomer.currency) && Intrinsics.areEqual(this.email, birdCustomer.email);
        }
        return false;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getExternalId() {
        return this.externalId;
    }

    public final PaymentProvider getKind() {
        return this.kind;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int hashCode = ((((((this.kind.hashCode() * 31) + this.userId.hashCode()) * 31) + this.externalId.hashCode()) * 31) + this.currency.hashCode()) * 31;
        String str = this.email;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        PaymentProvider paymentProvider = this.kind;
        String str = this.userId;
        String str2 = this.externalId;
        String str3 = this.currency;
        String str4 = this.email;
        return "BirdCustomer(kind=" + paymentProvider + ", userId=" + str + ", externalId=" + str2 + ", currency=" + str3 + ", email=" + str4 + ")";
    }

    public /* synthetic */ BirdCustomer(PaymentProvider paymentProvider, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentProvider, str, str2, str3, (i & 16) != 0 ? null : str4);
    }
}
