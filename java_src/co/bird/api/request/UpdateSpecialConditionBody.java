package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.LifecycleFlow;
import co.bird.android.model.LifecycleSource;
import co.bird.android.model.LifecycleSourceKind;
import co.bird.android.model.constant.SpecialCondition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m28432d2 = {"Lco/bird/api/request/UpdateSpecialConditionBody;", "", "birdId", "", "specialCondition", "Lco/bird/android/model/constant/SpecialCondition;", "sourceKind", "Lco/bird/android/model/LifecycleSourceKind;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/LifecycleSource;", "flow", "Lco/bird/android/model/LifecycleFlow;", "(Ljava/lang/String;Lco/bird/android/model/constant/SpecialCondition;Lco/bird/android/model/LifecycleSourceKind;Lco/bird/android/model/LifecycleSource;Lco/bird/android/model/LifecycleFlow;)V", "getBirdId", "()Ljava/lang/String;", "getFlow", "()Lco/bird/android/model/LifecycleFlow;", "getSource", "()Lco/bird/android/model/LifecycleSource;", "getSourceKind", "()Lco/bird/android/model/LifecycleSourceKind;", "getSpecialCondition", "()Lco/bird/android/model/constant/SpecialCondition;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UpdateSpecialConditionBody {
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("flow")
    @InterfaceC41208ft5("flow")
    private final LifecycleFlow flow;
    @JsonProperty(Stripe3ds2AuthParams.FIELD_SOURCE)
    @InterfaceC41208ft5(Stripe3ds2AuthParams.FIELD_SOURCE)
    private final LifecycleSource source;
    @JsonProperty("source_kind")
    @InterfaceC41208ft5("source_kind")
    private final LifecycleSourceKind sourceKind;
    @JsonProperty("special_condition")
    @InterfaceC41208ft5("special_condition")
    private final SpecialCondition specialCondition;

    public UpdateSpecialConditionBody(String birdId, SpecialCondition specialCondition, LifecycleSourceKind sourceKind, LifecycleSource source, LifecycleFlow flow) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(specialCondition, "specialCondition");
        Intrinsics.checkNotNullParameter(sourceKind, "sourceKind");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.birdId = birdId;
        this.specialCondition = specialCondition;
        this.sourceKind = sourceKind;
        this.source = source;
        this.flow = flow;
    }

    public static /* synthetic */ UpdateSpecialConditionBody copy$default(UpdateSpecialConditionBody updateSpecialConditionBody, String str, SpecialCondition specialCondition, LifecycleSourceKind lifecycleSourceKind, LifecycleSource lifecycleSource, LifecycleFlow lifecycleFlow, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateSpecialConditionBody.birdId;
        }
        if ((i & 2) != 0) {
            specialCondition = updateSpecialConditionBody.specialCondition;
        }
        SpecialCondition specialCondition2 = specialCondition;
        if ((i & 4) != 0) {
            lifecycleSourceKind = updateSpecialConditionBody.sourceKind;
        }
        LifecycleSourceKind lifecycleSourceKind2 = lifecycleSourceKind;
        if ((i & 8) != 0) {
            lifecycleSource = updateSpecialConditionBody.source;
        }
        LifecycleSource lifecycleSource2 = lifecycleSource;
        if ((i & 16) != 0) {
            lifecycleFlow = updateSpecialConditionBody.flow;
        }
        return updateSpecialConditionBody.copy(str, specialCondition2, lifecycleSourceKind2, lifecycleSource2, lifecycleFlow);
    }

    public final String component1() {
        return this.birdId;
    }

    public final SpecialCondition component2() {
        return this.specialCondition;
    }

    public final LifecycleSourceKind component3() {
        return this.sourceKind;
    }

    public final LifecycleSource component4() {
        return this.source;
    }

    public final LifecycleFlow component5() {
        return this.flow;
    }

    public final UpdateSpecialConditionBody copy(String birdId, SpecialCondition specialCondition, LifecycleSourceKind sourceKind, LifecycleSource source, LifecycleFlow flow) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(specialCondition, "specialCondition");
        Intrinsics.checkNotNullParameter(sourceKind, "sourceKind");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(flow, "flow");
        return new UpdateSpecialConditionBody(birdId, specialCondition, sourceKind, source, flow);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateSpecialConditionBody) {
            UpdateSpecialConditionBody updateSpecialConditionBody = (UpdateSpecialConditionBody) obj;
            return Intrinsics.areEqual(this.birdId, updateSpecialConditionBody.birdId) && this.specialCondition == updateSpecialConditionBody.specialCondition && this.sourceKind == updateSpecialConditionBody.sourceKind && this.source == updateSpecialConditionBody.source && this.flow == updateSpecialConditionBody.flow;
        }
        return false;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final LifecycleFlow getFlow() {
        return this.flow;
    }

    public final LifecycleSource getSource() {
        return this.source;
    }

    public final LifecycleSourceKind getSourceKind() {
        return this.sourceKind;
    }

    public final SpecialCondition getSpecialCondition() {
        return this.specialCondition;
    }

    public int hashCode() {
        return (((((((this.birdId.hashCode() * 31) + this.specialCondition.hashCode()) * 31) + this.sourceKind.hashCode()) * 31) + this.source.hashCode()) * 31) + this.flow.hashCode();
    }

    public String toString() {
        String str = this.birdId;
        SpecialCondition specialCondition = this.specialCondition;
        LifecycleSourceKind lifecycleSourceKind = this.sourceKind;
        LifecycleSource lifecycleSource = this.source;
        LifecycleFlow lifecycleFlow = this.flow;
        return "UpdateSpecialConditionBody(birdId=" + str + ", specialCondition=" + specialCondition + ", sourceKind=" + lifecycleSourceKind + ", source=" + lifecycleSource + ", flow=" + lifecycleFlow + ")";
    }
}
