package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lco/bird/api/request/WireIdentificationIntentPermissionRequest;", "", "intent", "", "habitatId", "userGuestId", "birdModel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBirdModel", "()Ljava/lang/String;", "getHabitatId", "getIntent", "getUserGuestId", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireIdentificationIntentPermissionRequest {
    @JsonProperty("bird_model")
    @InterfaceC41208ft5("bird_model")
    private final String birdModel;
    @JsonProperty("habitat_id")
    @InterfaceC41208ft5("habitat_id")
    private final String habitatId;
    @JsonProperty("intent")
    @InterfaceC41208ft5("intent")
    private final String intent;
    @JsonProperty("user_guest_id")
    @InterfaceC41208ft5("user_guest_id")
    private final String userGuestId;

    public WireIdentificationIntentPermissionRequest(String intent, String habitatId, String str, String str2) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(habitatId, "habitatId");
        this.intent = intent;
        this.habitatId = habitatId;
        this.userGuestId = str;
        this.birdModel = str2;
    }

    public static /* synthetic */ WireIdentificationIntentPermissionRequest copy$default(WireIdentificationIntentPermissionRequest wireIdentificationIntentPermissionRequest, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireIdentificationIntentPermissionRequest.intent;
        }
        if ((i & 2) != 0) {
            str2 = wireIdentificationIntentPermissionRequest.habitatId;
        }
        if ((i & 4) != 0) {
            str3 = wireIdentificationIntentPermissionRequest.userGuestId;
        }
        if ((i & 8) != 0) {
            str4 = wireIdentificationIntentPermissionRequest.birdModel;
        }
        return wireIdentificationIntentPermissionRequest.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.intent;
    }

    public final String component2() {
        return this.habitatId;
    }

    public final String component3() {
        return this.userGuestId;
    }

    public final String component4() {
        return this.birdModel;
    }

    public final WireIdentificationIntentPermissionRequest copy(String intent, String habitatId, String str, String str2) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(habitatId, "habitatId");
        return new WireIdentificationIntentPermissionRequest(intent, habitatId, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireIdentificationIntentPermissionRequest) {
            WireIdentificationIntentPermissionRequest wireIdentificationIntentPermissionRequest = (WireIdentificationIntentPermissionRequest) obj;
            return Intrinsics.areEqual(this.intent, wireIdentificationIntentPermissionRequest.intent) && Intrinsics.areEqual(this.habitatId, wireIdentificationIntentPermissionRequest.habitatId) && Intrinsics.areEqual(this.userGuestId, wireIdentificationIntentPermissionRequest.userGuestId) && Intrinsics.areEqual(this.birdModel, wireIdentificationIntentPermissionRequest.birdModel);
        }
        return false;
    }

    public final String getBirdModel() {
        return this.birdModel;
    }

    public final String getHabitatId() {
        return this.habitatId;
    }

    public final String getIntent() {
        return this.intent;
    }

    public final String getUserGuestId() {
        return this.userGuestId;
    }

    public int hashCode() {
        int hashCode = ((this.intent.hashCode() * 31) + this.habitatId.hashCode()) * 31;
        String str = this.userGuestId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.birdModel;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.intent;
        String str2 = this.habitatId;
        String str3 = this.userGuestId;
        String str4 = this.birdModel;
        return "WireIdentificationIntentPermissionRequest(intent=" + str + ", habitatId=" + str2 + ", userGuestId=" + str3 + ", birdModel=" + str4 + ")";
    }

    public /* synthetic */ WireIdentificationIntentPermissionRequest(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
