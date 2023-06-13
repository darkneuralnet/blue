package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/IN_RESTRICTED_PARKING_AREA;", "Lco/bird/android/model/RiderAreaState;", "parkingFineAmount", "", "fineCurrency", "", "noParkingFineAlertTitle", "noParkingFineAlertMessage", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFineCurrency", "()Ljava/lang/String;", "getNoParkingFineAlertMessage", "getNoParkingFineAlertTitle", "getParkingFineAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/IN_RESTRICTED_PARKING_AREA;", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IN_RESTRICTED_PARKING_AREA extends RiderAreaState {
    private final String fineCurrency;
    private final String noParkingFineAlertMessage;
    private final String noParkingFineAlertTitle;
    private final Integer parkingFineAmount;

    public IN_RESTRICTED_PARKING_AREA() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ IN_RESTRICTED_PARKING_AREA copy$default(IN_RESTRICTED_PARKING_AREA in_restricted_parking_area, Integer num, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = in_restricted_parking_area.parkingFineAmount;
        }
        if ((i & 2) != 0) {
            str = in_restricted_parking_area.fineCurrency;
        }
        if ((i & 4) != 0) {
            str2 = in_restricted_parking_area.noParkingFineAlertTitle;
        }
        if ((i & 8) != 0) {
            str3 = in_restricted_parking_area.noParkingFineAlertMessage;
        }
        return in_restricted_parking_area.copy(num, str, str2, str3);
    }

    public final Integer component1() {
        return this.parkingFineAmount;
    }

    public final String component2() {
        return this.fineCurrency;
    }

    public final String component3() {
        return this.noParkingFineAlertTitle;
    }

    public final String component4() {
        return this.noParkingFineAlertMessage;
    }

    public final IN_RESTRICTED_PARKING_AREA copy(Integer num, String str, String str2, String str3) {
        return new IN_RESTRICTED_PARKING_AREA(num, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IN_RESTRICTED_PARKING_AREA) {
            IN_RESTRICTED_PARKING_AREA in_restricted_parking_area = (IN_RESTRICTED_PARKING_AREA) obj;
            return Intrinsics.areEqual(this.parkingFineAmount, in_restricted_parking_area.parkingFineAmount) && Intrinsics.areEqual(this.fineCurrency, in_restricted_parking_area.fineCurrency) && Intrinsics.areEqual(this.noParkingFineAlertTitle, in_restricted_parking_area.noParkingFineAlertTitle) && Intrinsics.areEqual(this.noParkingFineAlertMessage, in_restricted_parking_area.noParkingFineAlertMessage);
        }
        return false;
    }

    public final String getFineCurrency() {
        return this.fineCurrency;
    }

    public final String getNoParkingFineAlertMessage() {
        return this.noParkingFineAlertMessage;
    }

    public final String getNoParkingFineAlertTitle() {
        return this.noParkingFineAlertTitle;
    }

    public final Integer getParkingFineAmount() {
        return this.parkingFineAmount;
    }

    public int hashCode() {
        Integer num = this.parkingFineAmount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.fineCurrency;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.noParkingFineAlertTitle;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.noParkingFineAlertMessage;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.parkingFineAmount;
        String str = this.fineCurrency;
        String str2 = this.noParkingFineAlertTitle;
        String str3 = this.noParkingFineAlertMessage;
        return "IN_RESTRICTED_PARKING_AREA(parkingFineAmount=" + num + ", fineCurrency=" + str + ", noParkingFineAlertTitle=" + str2 + ", noParkingFineAlertMessage=" + str3 + ")";
    }

    public /* synthetic */ IN_RESTRICTED_PARKING_AREA(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public IN_RESTRICTED_PARKING_AREA(Integer num, String str, String str2, String str3) {
        super(null);
        this.parkingFineAmount = num;
        this.fineCurrency = str;
        this.noParkingFineAlertTitle = str2;
        this.noParkingFineAlertMessage = str3;
    }
}
