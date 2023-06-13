package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, m28432d2 = {"Lco/bird/api/request/BluetoothTrackBody;", "", "maxSpeed", "", "ecuType", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getEcuType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMaxSpeed", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lco/bird/api/request/BluetoothTrackBody;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BluetoothTrackBody {
    @JsonProperty("ecu_type")
    @InterfaceC41208ft5("ecu_type")
    private final Integer ecuType;
    @JsonProperty("max_speed")
    @InterfaceC41208ft5("max_speed")
    private final Integer maxSpeed;

    public BluetoothTrackBody() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ BluetoothTrackBody copy$default(BluetoothTrackBody bluetoothTrackBody, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = bluetoothTrackBody.maxSpeed;
        }
        if ((i & 2) != 0) {
            num2 = bluetoothTrackBody.ecuType;
        }
        return bluetoothTrackBody.copy(num, num2);
    }

    public final Integer component1() {
        return this.maxSpeed;
    }

    public final Integer component2() {
        return this.ecuType;
    }

    public final BluetoothTrackBody copy(Integer num, Integer num2) {
        return new BluetoothTrackBody(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BluetoothTrackBody) {
            BluetoothTrackBody bluetoothTrackBody = (BluetoothTrackBody) obj;
            return Intrinsics.areEqual(this.maxSpeed, bluetoothTrackBody.maxSpeed) && Intrinsics.areEqual(this.ecuType, bluetoothTrackBody.ecuType);
        }
        return false;
    }

    public final Integer getEcuType() {
        return this.ecuType;
    }

    public final Integer getMaxSpeed() {
        return this.maxSpeed;
    }

    public int hashCode() {
        Integer num = this.maxSpeed;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.ecuType;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.maxSpeed;
        Integer num2 = this.ecuType;
        return "BluetoothTrackBody(maxSpeed=" + num + ", ecuType=" + num2 + ")";
    }

    public BluetoothTrackBody(Integer num, Integer num2) {
        this.maxSpeed = num;
        this.ecuType = num2;
    }

    public /* synthetic */ BluetoothTrackBody(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
