package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006*"}, m28432d2 = {"Lco/bird/api/request/TaxInformationBody;", "", "firstName", "", "lastName", "fiscalCode", PaymentMethod.BillingDetails.PARAM_ADDRESS, "postalCode", "city", "province", "country", "vatId", "companyName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Ljava/lang/String;", "getCity", "getCompanyName", "getCountry", "getFirstName", "getFiscalCode", "getLastName", "getPostalCode", "getProvince", "getVatId", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class TaxInformationBody {
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    private final String address;
    @JsonProperty("city")
    @InterfaceC41208ft5("city")
    private final String city;
    @JsonProperty("company_name")
    @InterfaceC41208ft5("company_name")
    private final String companyName;
    @JsonProperty("country")
    @InterfaceC41208ft5("country")
    private final String country;
    @JsonProperty("first_name")
    @InterfaceC41208ft5("first_name")
    private final String firstName;
    @JsonProperty("fiscal_code")
    @InterfaceC41208ft5("fiscal_code")
    private final String fiscalCode;
    @JsonProperty("last_name")
    @InterfaceC41208ft5("last_name")
    private final String lastName;
    @JsonProperty("postal_code")
    @InterfaceC41208ft5("postal_code")
    private final String postalCode;
    @JsonProperty("province")
    @InterfaceC41208ft5("province")
    private final String province;
    @JsonProperty("vat_id")
    @InterfaceC41208ft5("vat_id")
    private final String vatId;

    public TaxInformationBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.firstName = str;
        this.lastName = str2;
        this.fiscalCode = str3;
        this.address = str4;
        this.postalCode = str5;
        this.city = str6;
        this.province = str7;
        this.country = str8;
        this.vatId = str9;
        this.companyName = str10;
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component10() {
        return this.companyName;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.fiscalCode;
    }

    public final String component4() {
        return this.address;
    }

    public final String component5() {
        return this.postalCode;
    }

    public final String component6() {
        return this.city;
    }

    public final String component7() {
        return this.province;
    }

    public final String component8() {
        return this.country;
    }

    public final String component9() {
        return this.vatId;
    }

    public final TaxInformationBody copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return new TaxInformationBody(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TaxInformationBody) {
            TaxInformationBody taxInformationBody = (TaxInformationBody) obj;
            return Intrinsics.areEqual(this.firstName, taxInformationBody.firstName) && Intrinsics.areEqual(this.lastName, taxInformationBody.lastName) && Intrinsics.areEqual(this.fiscalCode, taxInformationBody.fiscalCode) && Intrinsics.areEqual(this.address, taxInformationBody.address) && Intrinsics.areEqual(this.postalCode, taxInformationBody.postalCode) && Intrinsics.areEqual(this.city, taxInformationBody.city) && Intrinsics.areEqual(this.province, taxInformationBody.province) && Intrinsics.areEqual(this.country, taxInformationBody.country) && Intrinsics.areEqual(this.vatId, taxInformationBody.vatId) && Intrinsics.areEqual(this.companyName, taxInformationBody.companyName);
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCompanyName() {
        return this.companyName;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFiscalCode() {
        return this.fiscalCode;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getProvince() {
        return this.province;
    }

    public final String getVatId() {
        return this.vatId;
    }

    public int hashCode() {
        String str = this.firstName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fiscalCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.address;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.postalCode;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.city;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.province;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.country;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.vatId;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.companyName;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.fiscalCode;
        String str4 = this.address;
        String str5 = this.postalCode;
        String str6 = this.city;
        String str7 = this.province;
        String str8 = this.country;
        String str9 = this.vatId;
        String str10 = this.companyName;
        return "TaxInformationBody(firstName=" + str + ", lastName=" + str2 + ", fiscalCode=" + str3 + ", address=" + str4 + ", postalCode=" + str5 + ", city=" + str6 + ", province=" + str7 + ", country=" + str8 + ", vatId=" + str9 + ", companyName=" + str10 + ")";
    }

    public /* synthetic */ TaxInformationBody(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10);
    }
}
