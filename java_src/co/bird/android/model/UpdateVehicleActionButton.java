package co.bird.android.model;

import co.bird.android.model.wire.WireBird;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m28432d2 = {"Lco/bird/android/model/UpdateVehicleActionButton;", "Lco/bird/android/model/CommandCenterButton;", Entry.TYPE_TEXT, "", "bird", "Lco/bird/android/model/wire/WireBird;", "workOrder", "Lco/bird/android/model/WorkOrder;", "(Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/WorkOrder;)V", "getBird", "()Lco/bird/android/model/wire/WireBird;", "getText", "()Ljava/lang/String;", "getWorkOrder", "()Lco/bird/android/model/WorkOrder;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UpdateVehicleActionButton extends CommandCenterButton {
    private final WireBird bird;
    private final String text;
    private final WorkOrder workOrder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateVehicleActionButton(String str, WireBird bird, WorkOrder workOrder) {
        super(null);
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.text = str;
        this.bird = bird;
        this.workOrder = workOrder;
    }

    public static /* synthetic */ UpdateVehicleActionButton copy$default(UpdateVehicleActionButton updateVehicleActionButton, String str, WireBird wireBird, WorkOrder workOrder, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateVehicleActionButton.text;
        }
        if ((i & 2) != 0) {
            wireBird = updateVehicleActionButton.bird;
        }
        if ((i & 4) != 0) {
            workOrder = updateVehicleActionButton.workOrder;
        }
        return updateVehicleActionButton.copy(str, wireBird, workOrder);
    }

    public final String component1() {
        return this.text;
    }

    public final WireBird component2() {
        return this.bird;
    }

    public final WorkOrder component3() {
        return this.workOrder;
    }

    public final UpdateVehicleActionButton copy(String str, WireBird bird, WorkOrder workOrder) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return new UpdateVehicleActionButton(str, bird, workOrder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateVehicleActionButton) {
            UpdateVehicleActionButton updateVehicleActionButton = (UpdateVehicleActionButton) obj;
            return Intrinsics.areEqual(this.text, updateVehicleActionButton.text) && Intrinsics.areEqual(this.bird, updateVehicleActionButton.bird) && Intrinsics.areEqual(this.workOrder, updateVehicleActionButton.workOrder);
        }
        return false;
    }

    @Override // co.bird.android.model.CommandCenterButton
    public WireBird getBird() {
        return this.bird;
    }

    @Override // co.bird.android.model.CommandCenterButton
    public String getText() {
        return this.text;
    }

    public final WorkOrder getWorkOrder() {
        return this.workOrder;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.bird.hashCode()) * 31;
        WorkOrder workOrder = this.workOrder;
        return hashCode + (workOrder != null ? workOrder.hashCode() : 0);
    }

    public String toString() {
        String str = this.text;
        WireBird wireBird = this.bird;
        WorkOrder workOrder = this.workOrder;
        return "UpdateVehicleActionButton(text=" + str + ", bird=" + wireBird + ", workOrder=" + workOrder + ")";
    }
}