package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.PaymentProvider;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, m28432d2 = {"Lco/bird/api/request/CreateCustomerBody;", "", "userId", "", "email", "nonce", "kind", "Lco/bird/android/model/constant/PaymentProvider;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/PaymentProvider;)V", "getEmail", "()Ljava/lang/String;", "getKind", "()Lco/bird/android/model/constant/PaymentProvider;", "getNonce", "getUserId", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CreateCustomerBody {
    @JsonProperty("email")
    @InterfaceC41208ft5("email")
    private final String email;
    @JsonProperty("kind")
    @InterfaceC41208ft5("kind")
    private final PaymentProvider kind;
    @JsonProperty("nonce")
    @InterfaceC41208ft5("nonce")
    private final String nonce;
    @JsonProperty("user_id")
    @InterfaceC41208ft5("user_id")
    private final String userId;

    public CreateCustomerBody(String userId, String email, String nonce, PaymentProvider kind) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.userId = userId;
        this.email = email;
        this.nonce = nonce;
        this.kind = kind;
    }

    public static /* synthetic */ CreateCustomerBody copy$default(CreateCustomerBody createCustomerBody, String str, String str2, String str3, PaymentProvider paymentProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createCustomerBody.userId;
        }
        if ((i & 2) != 0) {
            str2 = createCustomerBody.email;
        }
        if ((i & 4) != 0) {
            str3 = createCustomerBody.nonce;
        }
        if ((i & 8) != 0) {
            paymentProvider = createCustomerBody.kind;
        }
        return createCustomerBody.copy(str, str2, str3, paymentProvider);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.email;
    }

    public final String component3() {
        return this.nonce;
    }

    public final PaymentProvider component4() {
        return this.kind;
    }

    public final CreateCustomerBody copy(String userId, String email, String nonce, PaymentProvider kind) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new CreateCustomerBody(userId, email, nonce, kind);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CreateCustomerBody) {
            CreateCustomerBody createCustomerBody = (CreateCustomerBody) obj;
            return Intrinsics.areEqual(this.userId, createCustomerBody.userId) && Intrinsics.areEqual(this.email, createCustomerBody.email) && Intrinsics.areEqual(this.nonce, createCustomerBody.nonce) && this.kind == createCustomerBody.kind;
        }
        return false;
    }

    public final String getEmail() {
        return this.email;
    }

    public final PaymentProvider getKind() {
        return this.kind;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((this.userId.hashCode() * 31) + this.email.hashCode()) * 31) + this.nonce.hashCode()) * 31) + this.kind.hashCode();
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.email;
        String str3 = this.nonce;
        PaymentProvider paymentProvider = this.kind;
        return "CreateCustomerBody(userId=" + str + ", email=" + str2 + ", nonce=" + str3 + ", kind=" + paymentProvider + ")";
    }
}
