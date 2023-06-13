package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/AdyenCard;", "", "encryptedCardNumber", "", "encryptedExpiryMonth", "encryptedExpiryYear", "encryptedSecurityCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEncryptedCardNumber", "()Ljava/lang/String;", "getEncryptedExpiryMonth", "getEncryptedExpiryYear", "getEncryptedSecurityCode", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AdyenCard {
    private final String encryptedCardNumber;
    private final String encryptedExpiryMonth;
    private final String encryptedExpiryYear;
    private final String encryptedSecurityCode;

    public AdyenCard(String encryptedCardNumber, String encryptedExpiryMonth, String encryptedExpiryYear, String encryptedSecurityCode) {
        Intrinsics.checkNotNullParameter(encryptedCardNumber, "encryptedCardNumber");
        Intrinsics.checkNotNullParameter(encryptedExpiryMonth, "encryptedExpiryMonth");
        Intrinsics.checkNotNullParameter(encryptedExpiryYear, "encryptedExpiryYear");
        Intrinsics.checkNotNullParameter(encryptedSecurityCode, "encryptedSecurityCode");
        this.encryptedCardNumber = encryptedCardNumber;
        this.encryptedExpiryMonth = encryptedExpiryMonth;
        this.encryptedExpiryYear = encryptedExpiryYear;
        this.encryptedSecurityCode = encryptedSecurityCode;
    }

    public static /* synthetic */ AdyenCard copy$default(AdyenCard adyenCard, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adyenCard.encryptedCardNumber;
        }
        if ((i & 2) != 0) {
            str2 = adyenCard.encryptedExpiryMonth;
        }
        if ((i & 4) != 0) {
            str3 = adyenCard.encryptedExpiryYear;
        }
        if ((i & 8) != 0) {
            str4 = adyenCard.encryptedSecurityCode;
        }
        return adyenCard.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.encryptedCardNumber;
    }

    public final String component2() {
        return this.encryptedExpiryMonth;
    }

    public final String component3() {
        return this.encryptedExpiryYear;
    }

    public final String component4() {
        return this.encryptedSecurityCode;
    }

    public final AdyenCard copy(String encryptedCardNumber, String encryptedExpiryMonth, String encryptedExpiryYear, String encryptedSecurityCode) {
        Intrinsics.checkNotNullParameter(encryptedCardNumber, "encryptedCardNumber");
        Intrinsics.checkNotNullParameter(encryptedExpiryMonth, "encryptedExpiryMonth");
        Intrinsics.checkNotNullParameter(encryptedExpiryYear, "encryptedExpiryYear");
        Intrinsics.checkNotNullParameter(encryptedSecurityCode, "encryptedSecurityCode");
        return new AdyenCard(encryptedCardNumber, encryptedExpiryMonth, encryptedExpiryYear, encryptedSecurityCode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdyenCard) {
            AdyenCard adyenCard = (AdyenCard) obj;
            return Intrinsics.areEqual(this.encryptedCardNumber, adyenCard.encryptedCardNumber) && Intrinsics.areEqual(this.encryptedExpiryMonth, adyenCard.encryptedExpiryMonth) && Intrinsics.areEqual(this.encryptedExpiryYear, adyenCard.encryptedExpiryYear) && Intrinsics.areEqual(this.encryptedSecurityCode, adyenCard.encryptedSecurityCode);
        }
        return false;
    }

    public final String getEncryptedCardNumber() {
        return this.encryptedCardNumber;
    }

    public final String getEncryptedExpiryMonth() {
        return this.encryptedExpiryMonth;
    }

    public final String getEncryptedExpiryYear() {
        return this.encryptedExpiryYear;
    }

    public final String getEncryptedSecurityCode() {
        return this.encryptedSecurityCode;
    }

    public int hashCode() {
        return (((((this.encryptedCardNumber.hashCode() * 31) + this.encryptedExpiryMonth.hashCode()) * 31) + this.encryptedExpiryYear.hashCode()) * 31) + this.encryptedSecurityCode.hashCode();
    }

    public String toString() {
        String str = this.encryptedCardNumber;
        String str2 = this.encryptedExpiryMonth;
        String str3 = this.encryptedExpiryYear;
        String str4 = this.encryptedSecurityCode;
        return "AdyenCard(encryptedCardNumber=" + str + ", encryptedExpiryMonth=" + str2 + ", encryptedExpiryYear=" + str3 + ", encryptedSecurityCode=" + str4 + ")";
    }
}
