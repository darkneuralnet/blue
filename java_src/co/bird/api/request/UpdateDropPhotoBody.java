package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/api/request/UpdateDropPhotoBody;", "", "dropId", "", "photoUrl", "(Ljava/lang/String;Ljava/lang/String;)V", "getDropId", "()Ljava/lang/String;", "getPhotoUrl", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UpdateDropPhotoBody {
    @JsonProperty("drop_id")
    @InterfaceC41208ft5("drop_id")
    private final String dropId;
    @JsonProperty("photo_url")
    @InterfaceC41208ft5("photo_url")
    private final String photoUrl;

    public UpdateDropPhotoBody(String dropId, String str) {
        Intrinsics.checkNotNullParameter(dropId, "dropId");
        this.dropId = dropId;
        this.photoUrl = str;
    }

    public static /* synthetic */ UpdateDropPhotoBody copy$default(UpdateDropPhotoBody updateDropPhotoBody, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateDropPhotoBody.dropId;
        }
        if ((i & 2) != 0) {
            str2 = updateDropPhotoBody.photoUrl;
        }
        return updateDropPhotoBody.copy(str, str2);
    }

    public final String component1() {
        return this.dropId;
    }

    public final String component2() {
        return this.photoUrl;
    }

    public final UpdateDropPhotoBody copy(String dropId, String str) {
        Intrinsics.checkNotNullParameter(dropId, "dropId");
        return new UpdateDropPhotoBody(dropId, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateDropPhotoBody) {
            UpdateDropPhotoBody updateDropPhotoBody = (UpdateDropPhotoBody) obj;
            return Intrinsics.areEqual(this.dropId, updateDropPhotoBody.dropId) && Intrinsics.areEqual(this.photoUrl, updateDropPhotoBody.photoUrl);
        }
        return false;
    }

    public final String getDropId() {
        return this.dropId;
    }

    public final String getPhotoUrl() {
        return this.photoUrl;
    }

    public int hashCode() {
        int hashCode = this.dropId.hashCode() * 31;
        String str = this.photoUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.dropId;
        String str2 = this.photoUrl;
        return "UpdateDropPhotoBody(dropId=" + str + ", photoUrl=" + str2 + ")";
    }
}
