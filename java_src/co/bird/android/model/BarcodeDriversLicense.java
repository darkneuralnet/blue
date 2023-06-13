package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J½\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u00069"}, m28432d2 = {"Lco/bird/android/model/BarcodeDriversLicense;", "", "documentType", "", "firstName", "middleName", "lastName", "gender", "addressStreet", "addressCity", "addressState", "addressZip", "licenseNumber", "issueDate", "expiryDate", "birthDate", "issuingCountry", "rawValue", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressCity", "()Ljava/lang/String;", "getAddressState", "getAddressStreet", "getAddressZip", "getBirthDate", "getDocumentType", "getExpiryDate", "getFirstName", "getGender", "getIssueDate", "getIssuingCountry", "getLastName", "getLicenseNumber", "getMiddleName", "getRawValue", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BarcodeDriversLicense {
    private final String addressCity;
    private final String addressState;
    private final String addressStreet;
    private final String addressZip;
    private final String birthDate;
    private final String documentType;
    private final String expiryDate;
    private final String firstName;
    private final String gender;
    private final String issueDate;
    private final String issuingCountry;
    private final String lastName;
    private final String licenseNumber;
    private final String middleName;
    private final String rawValue;

    public BarcodeDriversLicense(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        this.documentType = str;
        this.firstName = str2;
        this.middleName = str3;
        this.lastName = str4;
        this.gender = str5;
        this.addressStreet = str6;
        this.addressCity = str7;
        this.addressState = str8;
        this.addressZip = str9;
        this.licenseNumber = str10;
        this.issueDate = str11;
        this.expiryDate = str12;
        this.birthDate = str13;
        this.issuingCountry = str14;
        this.rawValue = str15;
    }

    public final String component1() {
        return this.documentType;
    }

    public final String component10() {
        return this.licenseNumber;
    }

    public final String component11() {
        return this.issueDate;
    }

    public final String component12() {
        return this.expiryDate;
    }

    public final String component13() {
        return this.birthDate;
    }

    public final String component14() {
        return this.issuingCountry;
    }

    public final String component15() {
        return this.rawValue;
    }

    public final String component2() {
        return this.firstName;
    }

    public final String component3() {
        return this.middleName;
    }

    public final String component4() {
        return this.lastName;
    }

    public final String component5() {
        return this.gender;
    }

    public final String component6() {
        return this.addressStreet;
    }

    public final String component7() {
        return this.addressCity;
    }

    public final String component8() {
        return this.addressState;
    }

    public final String component9() {
        return this.addressZip;
    }

    public final BarcodeDriversLicense copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15) {
        return new BarcodeDriversLicense(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BarcodeDriversLicense) {
            BarcodeDriversLicense barcodeDriversLicense = (BarcodeDriversLicense) obj;
            return Intrinsics.areEqual(this.documentType, barcodeDriversLicense.documentType) && Intrinsics.areEqual(this.firstName, barcodeDriversLicense.firstName) && Intrinsics.areEqual(this.middleName, barcodeDriversLicense.middleName) && Intrinsics.areEqual(this.lastName, barcodeDriversLicense.lastName) && Intrinsics.areEqual(this.gender, barcodeDriversLicense.gender) && Intrinsics.areEqual(this.addressStreet, barcodeDriversLicense.addressStreet) && Intrinsics.areEqual(this.addressCity, barcodeDriversLicense.addressCity) && Intrinsics.areEqual(this.addressState, barcodeDriversLicense.addressState) && Intrinsics.areEqual(this.addressZip, barcodeDriversLicense.addressZip) && Intrinsics.areEqual(this.licenseNumber, barcodeDriversLicense.licenseNumber) && Intrinsics.areEqual(this.issueDate, barcodeDriversLicense.issueDate) && Intrinsics.areEqual(this.expiryDate, barcodeDriversLicense.expiryDate) && Intrinsics.areEqual(this.birthDate, barcodeDriversLicense.birthDate) && Intrinsics.areEqual(this.issuingCountry, barcodeDriversLicense.issuingCountry) && Intrinsics.areEqual(this.rawValue, barcodeDriversLicense.rawValue);
        }
        return false;
    }

    public final String getAddressCity() {
        return this.addressCity;
    }

    public final String getAddressState() {
        return this.addressState;
    }

    public final String getAddressStreet() {
        return this.addressStreet;
    }

    public final String getAddressZip() {
        return this.addressZip;
    }

    public final String getBirthDate() {
        return this.birthDate;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final String getExpiryDate() {
        return this.expiryDate;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getIssueDate() {
        return this.issueDate;
    }

    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLicenseNumber() {
        return this.licenseNumber;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getRawValue() {
        return this.rawValue;
    }

    public int hashCode() {
        String str = this.documentType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.firstName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.middleName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lastName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.gender;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.addressStreet;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.addressCity;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressState;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressZip;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.licenseNumber;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.issueDate;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.expiryDate;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.birthDate;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.issuingCountry;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.rawValue;
        return hashCode14 + (str15 != null ? str15.hashCode() : 0);
    }

    public String toString() {
        String str = this.documentType;
        String str2 = this.firstName;
        String str3 = this.middleName;
        String str4 = this.lastName;
        String str5 = this.gender;
        String str6 = this.addressStreet;
        String str7 = this.addressCity;
        String str8 = this.addressState;
        String str9 = this.addressZip;
        String str10 = this.licenseNumber;
        String str11 = this.issueDate;
        String str12 = this.expiryDate;
        String str13 = this.birthDate;
        String str14 = this.issuingCountry;
        String str15 = this.rawValue;
        return "BarcodeDriversLicense(documentType=" + str + ", firstName=" + str2 + ", middleName=" + str3 + ", lastName=" + str4 + ", gender=" + str5 + ", addressStreet=" + str6 + ", addressCity=" + str7 + ", addressState=" + str8 + ", addressZip=" + str9 + ", licenseNumber=" + str10 + ", issueDate=" + str11 + ", expiryDate=" + str12 + ", birthDate=" + str13 + ", issuingCountry=" + str14 + ", rawValue=" + str15 + ")";
    }
}
