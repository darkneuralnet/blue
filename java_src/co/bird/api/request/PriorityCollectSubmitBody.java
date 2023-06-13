package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.ScanMode;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, m28432d2 = {"Lco/bird/api/request/PriorityCollectSubmitBody;", "", "birdId", "", "location", "photoUrl", "mode", "Lco/bird/android/model/constant/ScanMode;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/ScanMode;)V", "getBirdId", "()Ljava/lang/String;", "getLocation", "getMode", "()Lco/bird/android/model/constant/ScanMode;", "getPhotoUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PriorityCollectSubmitBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("location")
    @InterfaceC41208ft5("location")
    private final String location;
    @JsonProperty("request_role")
    @InterfaceC41208ft5("request_role")
    private final ScanMode mode;
    @JsonProperty("photo_url")
    @InterfaceC41208ft5("photo_url")
    private final String photoUrl;

    public PriorityCollectSubmitBody(String birdId, String location, String photoUrl, ScanMode mode) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.birdId = birdId;
        this.location = location;
        this.photoUrl = photoUrl;
        this.mode = mode;
    }

    public static /* synthetic */ PriorityCollectSubmitBody copy$default(PriorityCollectSubmitBody priorityCollectSubmitBody, String str, String str2, String str3, ScanMode scanMode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = priorityCollectSubmitBody.birdId;
        }
        if ((i & 2) != 0) {
            str2 = priorityCollectSubmitBody.location;
        }
        if ((i & 4) != 0) {
            str3 = priorityCollectSubmitBody.photoUrl;
        }
        if ((i & 8) != 0) {
            scanMode = priorityCollectSubmitBody.mode;
        }
        return priorityCollectSubmitBody.copy(str, str2, str3, scanMode);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.location;
    }

    public final String component3() {
        return this.photoUrl;
    }

    public final ScanMode component4() {
        return this.mode;
    }

    public final PriorityCollectSubmitBody copy(String birdId, String location, String photoUrl, ScanMode mode) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(photoUrl, "photoUrl");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new PriorityCollectSubmitBody(birdId, location, photoUrl, mode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PriorityCollectSubmitBody) {
            PriorityCollectSubmitBody priorityCollectSubmitBody = (PriorityCollectSubmitBody) obj;
            return Intrinsics.areEqual(this.birdId, priorityCollectSubmitBody.birdId) && Intrinsics.areEqual(this.location, priorityCollectSubmitBody.location) && Intrinsics.areEqual(this.photoUrl, priorityCollectSubmitBody.photoUrl) && this.mode == priorityCollectSubmitBody.mode;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getLocation() {
        return this.location;
    }

    public final ScanMode getMode() {
        return this.mode;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public int hashCode() {
        return (((((this.birdId.hashCode() * 31) + this.location.hashCode()) * 31) + this.photoUrl.hashCode()) * 31) + this.mode.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.location;
        String str3 = this.photoUrl;
        ScanMode scanMode = this.mode;
        return "PriorityCollectSubmitBody(birdId=" + str + ", location=" + str2 + ", photoUrl=" + str3 + ", mode=" + scanMode + ")";
    }
}
