package co.bird.android.model.constant;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jm\u0010&\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, m28432d2 = {"Lco/bird/android/model/constant/PaymentMethodDetails;", "", "id", "", AccountRangeJsonParser.FIELD_BRAND, "lastCardNumbers", "expMonth", "expYear", "default", "", "gatewayKind", "Lco/bird/android/model/constant/PaymentGatewayKind;", "type", "Lco/bird/android/model/constant/PaymentMethod;", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Lco/bird/android/model/constant/PaymentMethod;Ljava/lang/String;)V", "getBrand", "()Ljava/lang/String;", "getDefault", "()Z", "getEmail", "getExpMonth", "getExpYear", "getGatewayKind", "()Lco/bird/android/model/constant/PaymentGatewayKind;", "getId", "getLastCardNumbers", "getType", "()Lco/bird/android/model/constant/PaymentMethod;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PaymentMethodDetails {
    @InterfaceC41208ft5(AccountRangeJsonParser.FIELD_BRAND)
    private final String brand;
    @InterfaceC41208ft5("default")

    /* renamed from: default  reason: not valid java name */
    private final boolean f122578default;
    @InterfaceC41208ft5("email")
    private final String email;
    @InterfaceC41208ft5("exp_month")
    private final String expMonth;
    @InterfaceC41208ft5("exp_year")
    private final String expYear;
    @InterfaceC41208ft5("gateway_kind")
    private final PaymentGatewayKind gatewayKind;
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66653id;
    @InterfaceC41208ft5("last_card_numbers")
    private final String lastCardNumbers;
    @InterfaceC41208ft5("type")
    private final PaymentMethod type;

    public PaymentMethodDetails(@JsonProperty("id") String id, @JsonProperty("brand") String str, @JsonProperty("last_card_numbers") String str2, @JsonProperty("exp_month") String str3, @JsonProperty("exp_year") String str4, @JsonProperty("default") boolean z, @JsonProperty("gateway_kind") PaymentGatewayKind gatewayKind, @JsonProperty("type") PaymentMethod type, @JsonProperty("email") String str5) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(gatewayKind, "gatewayKind");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f66653id = id;
        this.brand = str;
        this.lastCardNumbers = str2;
        this.expMonth = str3;
        this.expYear = str4;
        this.f122578default = z;
        this.gatewayKind = gatewayKind;
        this.type = type;
        this.email = str5;
    }

    public final String component1() {
        return this.f66653id;
    }

    public final String component2() {
        return this.brand;
    }

    public final String component3() {
        return this.lastCardNumbers;
    }

    public final String component4() {
        return this.expMonth;
    }

    public final String component5() {
        return this.expYear;
    }

    public final boolean component6() {
        return this.f122578default;
    }

    public final PaymentGatewayKind component7() {
        return this.gatewayKind;
    }

    public final PaymentMethod component8() {
        return this.type;
    }

    public final String component9() {
        return this.email;
    }

    public final PaymentMethodDetails copy(@JsonProperty("id") String id, @JsonProperty("brand") String str, @JsonProperty("last_card_numbers") String str2, @JsonProperty("exp_month") String str3, @JsonProperty("exp_year") String str4, @JsonProperty("default") boolean z, @JsonProperty("gateway_kind") PaymentGatewayKind gatewayKind, @JsonProperty("type") PaymentMethod type, @JsonProperty("email") String str5) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(gatewayKind, "gatewayKind");
        Intrinsics.checkNotNullParameter(type, "type");
        return new PaymentMethodDetails(id, str, str2, str3, str4, z, gatewayKind, type, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentMethodDetails) {
            PaymentMethodDetails paymentMethodDetails = (PaymentMethodDetails) obj;
            return Intrinsics.areEqual(this.f66653id, paymentMethodDetails.f66653id) && Intrinsics.areEqual(this.brand, paymentMethodDetails.brand) && Intrinsics.areEqual(this.lastCardNumbers, paymentMethodDetails.lastCardNumbers) && Intrinsics.areEqual(this.expMonth, paymentMethodDetails.expMonth) && Intrinsics.areEqual(this.expYear, paymentMethodDetails.expYear) && this.f122578default == paymentMethodDetails.f122578default && this.gatewayKind == paymentMethodDetails.gatewayKind && this.type == paymentMethodDetails.type && Intrinsics.areEqual(this.email, paymentMethodDetails.email);
        }
        return false;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final boolean getDefault() {
        return this.f122578default;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getExpMonth() {
        return this.expMonth;
    }

    public final String getExpYear() {
        return this.expYear;
    }

    public final PaymentGatewayKind getGatewayKind() {
        return this.gatewayKind;
    }

    public final String getId() {
        return this.f66653id;
    }

    public final String getLastCardNumbers() {
        return this.lastCardNumbers;
    }

    public final PaymentMethod getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f66653id.hashCode() * 31;
        String str = this.brand;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastCardNumbers;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expMonth;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.expYear;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        boolean z = this.f122578default;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode6 = (((((hashCode5 + i) * 31) + this.gatewayKind.hashCode()) * 31) + this.type.hashCode()) * 31;
        String str5 = this.email;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.f66653id;
        String str2 = this.brand;
        String str3 = this.lastCardNumbers;
        String str4 = this.expMonth;
        String str5 = this.expYear;
        boolean z = this.f122578default;
        PaymentGatewayKind paymentGatewayKind = this.gatewayKind;
        PaymentMethod paymentMethod = this.type;
        String str6 = this.email;
        return "PaymentMethodDetails(id=" + str + ", brand=" + str2 + ", lastCardNumbers=" + str3 + ", expMonth=" + str4 + ", expYear=" + str5 + ", default=" + z + ", gatewayKind=" + paymentGatewayKind + ", type=" + paymentMethod + ", email=" + str6 + ")";
    }

    public /* synthetic */ PaymentMethodDetails(String str, String str2, String str3, String str4, String str5, boolean z, PaymentGatewayKind paymentGatewayKind, PaymentMethod paymentMethod, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, z, paymentGatewayKind, paymentMethod, (i & 256) != 0 ? null : str6);
    }
}
