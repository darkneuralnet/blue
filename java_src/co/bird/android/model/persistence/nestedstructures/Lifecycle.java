package co.bird.android.model.persistence.nestedstructures;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.BrainState;
import co.bird.android.model.constant.Condition;
import co.bird.android.model.constant.Placement;
import co.bird.android.model.constant.SpecialCondition;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/model/persistence/nestedstructures/Lifecycle;", "", "condition", "Lco/bird/android/model/constant/Condition;", "specialCondition", "Lco/bird/android/model/constant/SpecialCondition;", "brainState", "Lco/bird/android/model/constant/BrainState;", "placement", "Lco/bird/android/model/constant/Placement;", "(Lco/bird/android/model/constant/Condition;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/constant/BrainState;Lco/bird/android/model/constant/Placement;)V", "getBrainState", "()Lco/bird/android/model/constant/BrainState;", "getCondition", "()Lco/bird/android/model/constant/Condition;", "getPlacement", "()Lco/bird/android/model/constant/Placement;", "getSpecialCondition", "()Lco/bird/android/model/constant/SpecialCondition;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Lifecycle {
    @JsonProperty("brain_state")
    @InterfaceC41208ft5("brain_state")
    private final BrainState brainState;
    @JsonProperty("condition")
    @InterfaceC41208ft5("condition")
    private final Condition condition;
    @JsonProperty("placement")
    @InterfaceC41208ft5("placement")
    private final Placement placement;
    @JsonProperty("special_condition")
    @InterfaceC41208ft5("special_condition")
    private final SpecialCondition specialCondition;

    public Lifecycle(Condition condition, SpecialCondition specialCondition, BrainState brainState, Placement placement) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(specialCondition, "specialCondition");
        Intrinsics.checkNotNullParameter(brainState, "brainState");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.condition = condition;
        this.specialCondition = specialCondition;
        this.brainState = brainState;
        this.placement = placement;
    }

    public static /* synthetic */ Lifecycle copy$default(Lifecycle lifecycle, Condition condition, SpecialCondition specialCondition, BrainState brainState, Placement placement, int i, Object obj) {
        if ((i & 1) != 0) {
            condition = lifecycle.condition;
        }
        if ((i & 2) != 0) {
            specialCondition = lifecycle.specialCondition;
        }
        if ((i & 4) != 0) {
            brainState = lifecycle.brainState;
        }
        if ((i & 8) != 0) {
            placement = lifecycle.placement;
        }
        return lifecycle.copy(condition, specialCondition, brainState, placement);
    }

    public final Condition component1() {
        return this.condition;
    }

    public final SpecialCondition component2() {
        return this.specialCondition;
    }

    public final BrainState component3() {
        return this.brainState;
    }

    public final Placement component4() {
        return this.placement;
    }

    public final Lifecycle copy(Condition condition, SpecialCondition specialCondition, BrainState brainState, Placement placement) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(specialCondition, "specialCondition");
        Intrinsics.checkNotNullParameter(brainState, "brainState");
        Intrinsics.checkNotNullParameter(placement, "placement");
        return new Lifecycle(condition, specialCondition, brainState, placement);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Lifecycle) {
            Lifecycle lifecycle = (Lifecycle) obj;
            return this.condition == lifecycle.condition && this.specialCondition == lifecycle.specialCondition && this.brainState == lifecycle.brainState && this.placement == lifecycle.placement;
        }
        return false;
    }

    public final BrainState getBrainState() {
        return this.brainState;
    }

    public final Condition getCondition() {
        return this.condition;
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    public final SpecialCondition getSpecialCondition() {
        return this.specialCondition;
    }

    public int hashCode() {
        return (((((this.condition.hashCode() * 31) + this.specialCondition.hashCode()) * 31) + this.brainState.hashCode()) * 31) + this.placement.hashCode();
    }

    public String toString() {
        Condition condition = this.condition;
        SpecialCondition specialCondition = this.specialCondition;
        BrainState brainState = this.brainState;
        Placement placement = this.placement;
        return "Lifecycle(condition=" + condition + ", specialCondition=" + specialCondition + ", brainState=" + brainState + ", placement=" + placement + ")";
    }
}
