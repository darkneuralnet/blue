package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.DateUtils;
import okhttp3.internal.http2.Settings;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÉ\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017¨\u0006@"}, m28432d2 = {"Lco/bird/api/request/UpdateContractorBody;", "", "firstName", "", "lastName", PaymentMethod.BillingDetails.PARAM_PHONE, "birthdate", "Lorg/joda/time/LocalDateTime;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "unitIdentifier", "city", TransferTable.COLUMN_STATE, "country", "postalCode", "agreedAt", "Lorg/joda/time/DateTime;", "taxIdToken", "externalAccountToken", "tutorialCompletedAt", "depositAgreedAt", "addressConfirmedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getAddress", "()Ljava/lang/String;", "getAddressConfirmedAt", "()Lorg/joda/time/DateTime;", "getAgreedAt", "getBirthdate", "()Lorg/joda/time/LocalDateTime;", "getCity", "getCountry", "getDepositAgreedAt", "getExternalAccountToken", "getFirstName", "getLastName", "getPhone", "getPostalCode", "getState", "getTaxIdToken", "getTutorialCompletedAt", "getUnitIdentifier", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UpdateContractorBody {
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_ADDRESS)
    private final String address;
    @JsonProperty("address_confirmed_at")
    @InterfaceC41208ft5("address_confirmed_at")
    private final DateTime addressConfirmedAt;
    @JsonProperty("agreed_at")
    @InterfaceC41208ft5("agreed_at")
    private final DateTime agreedAt;
    @JsonProperty("birthdate")
    @InterfaceC41208ft5("birthdate")
    private final LocalDateTime birthdate;
    @JsonProperty("city")
    @InterfaceC41208ft5("city")
    private final String city;
    @JsonProperty("country")
    @InterfaceC41208ft5("country")
    private final String country;
    @JsonProperty("deposit_agreed_at")
    @InterfaceC41208ft5("deposit_agreed_at")
    private final DateTime depositAgreedAt;
    @JsonProperty("external_account_token")
    @InterfaceC41208ft5("external_account_token")
    private final String externalAccountToken;
    @JsonProperty("first_name")
    @InterfaceC41208ft5("first_name")
    private final String firstName;
    @JsonProperty("last_name")
    @InterfaceC41208ft5("last_name")
    private final String lastName;
    @JsonProperty(PaymentMethod.BillingDetails.PARAM_PHONE)
    @InterfaceC41208ft5(PaymentMethod.BillingDetails.PARAM_PHONE)
    private final String phone;
    @JsonProperty("postal_code")
    @InterfaceC41208ft5("postal_code")
    private final String postalCode;
    @JsonProperty(TransferTable.COLUMN_STATE)
    @InterfaceC41208ft5(TransferTable.COLUMN_STATE)
    private final String state;
    @JsonProperty("tax_id_token")
    @InterfaceC41208ft5("tax_id_token")
    private final String taxIdToken;
    @JsonProperty("tutorial_completed_at")
    @InterfaceC41208ft5("tutorial_completed_at")
    private final DateTime tutorialCompletedAt;
    @JsonProperty("unit_identifier")
    @InterfaceC41208ft5("unit_identifier")
    private final String unitIdentifier;

    public UpdateContractorBody() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component10() {
        return this.postalCode;
    }

    public final DateTime component11() {
        return this.agreedAt;
    }

    public final String component12() {
        return this.taxIdToken;
    }

    public final String component13() {
        return this.externalAccountToken;
    }

    public final DateTime component14() {
        return this.tutorialCompletedAt;
    }

    public final DateTime component15() {
        return this.depositAgreedAt;
    }

    public final DateTime component16() {
        return this.addressConfirmedAt;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.phone;
    }

    public final LocalDateTime component4() {
        return this.birthdate;
    }

    public final String component5() {
        return this.address;
    }

    public final String component6() {
        return this.unitIdentifier;
    }

    public final String component7() {
        return this.city;
    }

    public final String component8() {
        return this.state;
    }

    public final String component9() {
        return this.country;
    }

    public final UpdateContractorBody copy(String str, String str2, String str3, LocalDateTime localDateTime, String str4, String str5, String str6, String str7, String str8, String str9, DateTime dateTime, String str10, String str11, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4) {
        return new UpdateContractorBody(str, str2, str3, localDateTime, str4, str5, str6, str7, str8, str9, dateTime, str10, str11, dateTime2, dateTime3, dateTime4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateContractorBody) {
            UpdateContractorBody updateContractorBody = (UpdateContractorBody) obj;
            return Intrinsics.areEqual(this.firstName, updateContractorBody.firstName) && Intrinsics.areEqual(this.lastName, updateContractorBody.lastName) && Intrinsics.areEqual(this.phone, updateContractorBody.phone) && Intrinsics.areEqual(this.birthdate, updateContractorBody.birthdate) && Intrinsics.areEqual(this.address, updateContractorBody.address) && Intrinsics.areEqual(this.unitIdentifier, updateContractorBody.unitIdentifier) && Intrinsics.areEqual(this.city, updateContractorBody.city) && Intrinsics.areEqual(this.state, updateContractorBody.state) && Intrinsics.areEqual(this.country, updateContractorBody.country) && Intrinsics.areEqual(this.postalCode, updateContractorBody.postalCode) && Intrinsics.areEqual(this.agreedAt, updateContractorBody.agreedAt) && Intrinsics.areEqual(this.taxIdToken, updateContractorBody.taxIdToken) && Intrinsics.areEqual(this.externalAccountToken, updateContractorBody.externalAccountToken) && Intrinsics.areEqual(this.tutorialCompletedAt, updateContractorBody.tutorialCompletedAt) && Intrinsics.areEqual(this.depositAgreedAt, updateContractorBody.depositAgreedAt) && Intrinsics.areEqual(this.addressConfirmedAt, updateContractorBody.addressConfirmedAt);
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final DateTime getAddressConfirmedAt() {
        return this.addressConfirmedAt;
    }

    public final DateTime getAgreedAt() {
        return this.agreedAt;
    }

    public final LocalDateTime getBirthdate() {
        return this.birthdate;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final DateTime getDepositAgreedAt() {
        return this.depositAgreedAt;
    }

    public final String getExternalAccountToken() {
        return this.externalAccountToken;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTaxIdToken() {
        return this.taxIdToken;
    }

    public final DateTime getTutorialCompletedAt() {
        return this.tutorialCompletedAt;
    }

    public final String getUnitIdentifier() {
        return this.unitIdentifier;
    }

    public int hashCode() {
        String str = this.firstName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LocalDateTime localDateTime = this.birthdate;
        int hashCode4 = (hashCode3 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        String str4 = this.address;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.unitIdentifier;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.city;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.state;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.country;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.postalCode;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        DateTime dateTime = this.agreedAt;
        int hashCode11 = (hashCode10 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        String str10 = this.taxIdToken;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.externalAccountToken;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        DateTime dateTime2 = this.tutorialCompletedAt;
        int hashCode14 = (hashCode13 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        DateTime dateTime3 = this.depositAgreedAt;
        int hashCode15 = (hashCode14 + (dateTime3 == null ? 0 : dateTime3.hashCode())) * 31;
        DateTime dateTime4 = this.addressConfirmedAt;
        return hashCode15 + (dateTime4 != null ? dateTime4.hashCode() : 0);
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.phone;
        LocalDateTime localDateTime = this.birthdate;
        String str4 = this.address;
        String str5 = this.unitIdentifier;
        String str6 = this.city;
        String str7 = this.state;
        String str8 = this.country;
        String str9 = this.postalCode;
        DateTime dateTime = this.agreedAt;
        String str10 = this.taxIdToken;
        String str11 = this.externalAccountToken;
        DateTime dateTime2 = this.tutorialCompletedAt;
        DateTime dateTime3 = this.depositAgreedAt;
        DateTime dateTime4 = this.addressConfirmedAt;
        return "UpdateContractorBody(firstName=" + str + ", lastName=" + str2 + ", phone=" + str3 + ", birthdate=" + localDateTime + ", address=" + str4 + ", unitIdentifier=" + str5 + ", city=" + str6 + ", state=" + str7 + ", country=" + str8 + ", postalCode=" + str9 + ", agreedAt=" + dateTime + ", taxIdToken=" + str10 + ", externalAccountToken=" + str11 + ", tutorialCompletedAt=" + dateTime2 + ", depositAgreedAt=" + dateTime3 + ", addressConfirmedAt=" + dateTime4 + ")";
    }

    public UpdateContractorBody(String str, String str2, String str3, LocalDateTime localDateTime, String str4, String str5, String str6, String str7, String str8, String str9, DateTime dateTime, String str10, String str11, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4) {
        this.firstName = str;
        this.lastName = str2;
        this.phone = str3;
        this.birthdate = localDateTime;
        this.address = str4;
        this.unitIdentifier = str5;
        this.city = str6;
        this.state = str7;
        this.country = str8;
        this.postalCode = str9;
        this.agreedAt = dateTime;
        this.taxIdToken = str10;
        this.externalAccountToken = str11;
        this.tutorialCompletedAt = dateTime2;
        this.depositAgreedAt = dateTime3;
        this.addressConfirmedAt = dateTime4;
    }

    public /* synthetic */ UpdateContractorBody(String str, String str2, String str3, LocalDateTime localDateTime, String str4, String str5, String str6, String str7, String str8, String str9, DateTime dateTime, String str10, String str11, DateTime dateTime2, DateTime dateTime3, DateTime dateTime4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : localDateTime, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : dateTime, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & 8192) != 0 ? null : dateTime2, (i & 16384) != 0 ? null : dateTime3, (i & DateUtils.FORMAT_ABBREV_WEEKDAY) != 0 ? null : dateTime4);
    }
}
