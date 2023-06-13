package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m28432d2 = {"Lco/bird/api/request/CreateBirdBody;", "", "serialNumber", "", "(Ljava/lang/String;)V", "getSerialNumber", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class CreateBirdBody {
    @JsonProperty("serial_number")
    @InterfaceC41208ft5("serial_number")
    private final String serialNumber;

    public CreateBirdBody() {
        this(null, 1, null);
    }

    public static /* synthetic */ CreateBirdBody copy$default(CreateBirdBody createBirdBody, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createBirdBody.serialNumber;
        }
        return createBirdBody.copy(str);
    }

    public final String component1() {
        return this.serialNumber;
    }

    public final CreateBirdBody copy(String serialNumber) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        return new CreateBirdBody(serialNumber);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateBirdBody) && Intrinsics.areEqual(this.serialNumber, ((CreateBirdBody) obj).serialNumber);
    }

    public final String getSerialNumber() {
        return this.serialNumber;
    }

    public int hashCode() {
        return this.serialNumber.hashCode();
    }

    public String toString() {
        String str = this.serialNumber;
        return "CreateBirdBody(serialNumber=" + str + ")";
    }

    public CreateBirdBody(String serialNumber) {
        Intrinsics.checkNotNullParameter(serialNumber, "serialNumber");
        this.serialNumber = serialNumber;
    }

    public /* synthetic */ CreateBirdBody(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
