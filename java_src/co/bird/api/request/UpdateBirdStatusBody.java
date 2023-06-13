package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BirdStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lco/bird/api/request/UpdateBirdStatusBody;", "", "birdId", "", "field", "Lco/bird/android/model/constant/BirdStatus;", "value", "", "(Ljava/lang/String;Lco/bird/android/model/constant/BirdStatus;Z)V", "getBirdId", "()Ljava/lang/String;", "getField", "()Lco/bird/android/model/constant/BirdStatus;", "getValue", "()Z", "component1", "component2", "component3", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UpdateBirdStatusBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("field")
    @InterfaceC41208ft5("field")
    private final BirdStatus field;
    @JsonProperty("value")
    @InterfaceC41208ft5("value")
    private final boolean value;

    public UpdateBirdStatusBody(String birdId, BirdStatus field, boolean z) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(field, "field");
        this.birdId = birdId;
        this.field = field;
        this.value = z;
    }

    public static /* synthetic */ UpdateBirdStatusBody copy$default(UpdateBirdStatusBody updateBirdStatusBody, String str, BirdStatus birdStatus, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateBirdStatusBody.birdId;
        }
        if ((i & 2) != 0) {
            birdStatus = updateBirdStatusBody.field;
        }
        if ((i & 4) != 0) {
            z = updateBirdStatusBody.value;
        }
        return updateBirdStatusBody.copy(str, birdStatus, z);
    }

    public final String component1() {
        return this.birdId;
    }

    public final BirdStatus component2() {
        return this.field;
    }

    public final boolean component3() {
        return this.value;
    }

    public final UpdateBirdStatusBody copy(String birdId, BirdStatus field, boolean z) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(field, "field");
        return new UpdateBirdStatusBody(birdId, field, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateBirdStatusBody) {
            UpdateBirdStatusBody updateBirdStatusBody = (UpdateBirdStatusBody) obj;
            return Intrinsics.areEqual(this.birdId, updateBirdStatusBody.birdId) && this.field == updateBirdStatusBody.field && this.value == updateBirdStatusBody.value;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final BirdStatus getField() {
        return this.field;
    }

    public final boolean getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.birdId.hashCode() * 31) + this.field.hashCode()) * 31;
        boolean z = this.value;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.birdId;
        BirdStatus birdStatus = this.field;
        boolean z = this.value;
        return "UpdateBirdStatusBody(birdId=" + str + ", field=" + birdStatus + ", value=" + z + ")";
    }

    public /* synthetic */ UpdateBirdStatusBody(String str, BirdStatus birdStatus, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, birdStatus, (i & 4) != 0 ? true : z);
    }
}
