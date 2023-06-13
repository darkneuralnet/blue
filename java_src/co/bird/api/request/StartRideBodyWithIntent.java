package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.RideType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u00052\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006&"}, m28432d2 = {"Lco/bird/api/request/StartRideBodyWithIntent;", "", "birdId", "", "unlock", "", "type", "Lco/bird/android/model/constant/RideType;", "intentId", "chargeType", "Lco/bird/api/request/StartRideChargeType;", "userGuestId", "birdScanId", "(Ljava/lang/String;ZLco/bird/android/model/constant/RideType;Ljava/lang/String;Lco/bird/api/request/StartRideChargeType;Ljava/lang/String;Ljava/lang/String;)V", "getBirdId", "()Ljava/lang/String;", "getBirdScanId", "getChargeType", "()Lco/bird/api/request/StartRideChargeType;", "getIntentId", "getType", "()Lco/bird/android/model/constant/RideType;", "getUnlock", "()Z", "getUserGuestId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class StartRideBodyWithIntent {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("bird_scan_id")
    @InterfaceC41208ft5("bird_scan_id")
    private final String birdScanId;
    @JsonProperty("charge_type")
    @InterfaceC41208ft5("charge_type")
    private final StartRideChargeType chargeType;
    @JsonProperty("intent_id")
    @InterfaceC41208ft5("intent_id")
    private final String intentId;
    @JsonProperty("type")
    @InterfaceC41208ft5("type")
    private final RideType type;
    @JsonProperty("unlock")
    @InterfaceC41208ft5("unlock")
    private final boolean unlock;
    @JsonProperty("user_guest_id")
    @InterfaceC41208ft5("user_guest_id")
    private final String userGuestId;

    public StartRideBodyWithIntent(String birdId, boolean z, RideType type, String str, StartRideChargeType startRideChargeType, String str2, String str3) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.birdId = birdId;
        this.unlock = z;
        this.type = type;
        this.intentId = str;
        this.chargeType = startRideChargeType;
        this.userGuestId = str2;
        this.birdScanId = str3;
    }

    public static /* synthetic */ StartRideBodyWithIntent copy$default(StartRideBodyWithIntent startRideBodyWithIntent, String str, boolean z, RideType rideType, String str2, StartRideChargeType startRideChargeType, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = startRideBodyWithIntent.birdId;
        }
        if ((i & 2) != 0) {
            z = startRideBodyWithIntent.unlock;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            rideType = startRideBodyWithIntent.type;
        }
        RideType rideType2 = rideType;
        if ((i & 8) != 0) {
            str2 = startRideBodyWithIntent.intentId;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            startRideChargeType = startRideBodyWithIntent.chargeType;
        }
        StartRideChargeType startRideChargeType2 = startRideChargeType;
        if ((i & 32) != 0) {
            str3 = startRideBodyWithIntent.userGuestId;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            str4 = startRideBodyWithIntent.birdScanId;
        }
        return startRideBodyWithIntent.copy(str, z2, rideType2, str5, startRideChargeType2, str6, str4);
    }

    public final String component1() {
        return this.birdId;
    }

    public final boolean component2() {
        return this.unlock;
    }

    public final RideType component3() {
        return this.type;
    }

    public final String component4() {
        return this.intentId;
    }

    public final StartRideChargeType component5() {
        return this.chargeType;
    }

    public final String component6() {
        return this.userGuestId;
    }

    public final String component7() {
        return this.birdScanId;
    }

    public final StartRideBodyWithIntent copy(String birdId, boolean z, RideType type, String str, StartRideChargeType startRideChargeType, String str2, String str3) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(type, "type");
        return new StartRideBodyWithIntent(birdId, z, type, str, startRideChargeType, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartRideBodyWithIntent) {
            StartRideBodyWithIntent startRideBodyWithIntent = (StartRideBodyWithIntent) obj;
            return Intrinsics.areEqual(this.birdId, startRideBodyWithIntent.birdId) && this.unlock == startRideBodyWithIntent.unlock && this.type == startRideBodyWithIntent.type && Intrinsics.areEqual(this.intentId, startRideBodyWithIntent.intentId) && this.chargeType == startRideBodyWithIntent.chargeType && Intrinsics.areEqual(this.userGuestId, startRideBodyWithIntent.userGuestId) && Intrinsics.areEqual(this.birdScanId, startRideBodyWithIntent.birdScanId);
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getBirdScanId() {
        return this.birdScanId;
    }

    public final StartRideChargeType getChargeType() {
        return this.chargeType;
    }

    public final String getIntentId() {
        return this.intentId;
    }

    public final RideType getType() {
        return this.type;
    }

    public final boolean getUnlock() {
        return this.unlock;
    }

    public final String getUserGuestId() {
        return this.userGuestId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.birdId.hashCode() * 31;
        boolean z = this.unlock;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.type.hashCode()) * 31;
        String str = this.intentId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        StartRideChargeType startRideChargeType = this.chargeType;
        int hashCode4 = (hashCode3 + (startRideChargeType == null ? 0 : startRideChargeType.hashCode())) * 31;
        String str2 = this.userGuestId;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.birdScanId;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.birdId;
        boolean z = this.unlock;
        RideType rideType = this.type;
        String str2 = this.intentId;
        StartRideChargeType startRideChargeType = this.chargeType;
        String str3 = this.userGuestId;
        String str4 = this.birdScanId;
        return "StartRideBodyWithIntent(birdId=" + str + ", unlock=" + z + ", type=" + rideType + ", intentId=" + str2 + ", chargeType=" + startRideChargeType + ", userGuestId=" + str3 + ", birdScanId=" + str4 + ")";
    }

    public /* synthetic */ StartRideBodyWithIntent(String str, boolean z, RideType rideType, String str2, StartRideChargeType startRideChargeType, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? RideType.STANDARD : rideType, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : startRideChargeType, (i & 32) != 0 ? null : str3, (i & 64) == 0 ? str4 : null);
    }
}
