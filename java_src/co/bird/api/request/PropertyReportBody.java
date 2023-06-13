package co.bird.api.request;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.PropertyReportAction;
import co.bird.android.model.PropertyReportNextStep;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001f"}, m28432d2 = {"Lco/bird/api/request/PropertyReportBody;", "", "birdId", "", "cannotAccessReportId", "action", "Lco/bird/android/model/PropertyReportAction;", "nextStep", "Lco/bird/android/model/PropertyReportNextStep;", "notes", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/PropertyReportAction;Lco/bird/android/model/PropertyReportNextStep;Ljava/lang/String;)V", "getAction", "()Lco/bird/android/model/PropertyReportAction;", "getBirdId", "()Ljava/lang/String;", "getCannotAccessReportId", "getNextStep", "()Lco/bird/android/model/PropertyReportNextStep;", "getNotes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PropertyReportBody {
    @JsonProperty("action")
    @InterfaceC41208ft5("action")
    private final PropertyReportAction action;
    @JsonProperty("bird_id")
    @InterfaceC41208ft5("bird_id")
    private final String birdId;
    @JsonProperty("cannot_access_report_id")
    @InterfaceC41208ft5("cannot_access_report_id")
    private final String cannotAccessReportId;
    @JsonProperty("next_step")
    @InterfaceC41208ft5("next_step")
    private final PropertyReportNextStep nextStep;
    @JsonProperty("notes")
    @InterfaceC41208ft5("notes")
    private final String notes;

    public PropertyReportBody(String birdId, String cannotAccessReportId, PropertyReportAction action, PropertyReportNextStep nextStep, String str) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(cannotAccessReportId, "cannotAccessReportId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        this.birdId = birdId;
        this.cannotAccessReportId = cannotAccessReportId;
        this.action = action;
        this.nextStep = nextStep;
        this.notes = str;
    }

    public static /* synthetic */ PropertyReportBody copy$default(PropertyReportBody propertyReportBody, String str, String str2, PropertyReportAction propertyReportAction, PropertyReportNextStep propertyReportNextStep, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = propertyReportBody.birdId;
        }
        if ((i & 2) != 0) {
            str2 = propertyReportBody.cannotAccessReportId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            propertyReportAction = propertyReportBody.action;
        }
        PropertyReportAction propertyReportAction2 = propertyReportAction;
        if ((i & 8) != 0) {
            propertyReportNextStep = propertyReportBody.nextStep;
        }
        PropertyReportNextStep propertyReportNextStep2 = propertyReportNextStep;
        if ((i & 16) != 0) {
            str3 = propertyReportBody.notes;
        }
        return propertyReportBody.copy(str, str4, propertyReportAction2, propertyReportNextStep2, str3);
    }

    public final String component1() {
        return this.birdId;
    }

    public final String component2() {
        return this.cannotAccessReportId;
    }

    public final PropertyReportAction component3() {
        return this.action;
    }

    public final PropertyReportNextStep component4() {
        return this.nextStep;
    }

    public final String component5() {
        return this.notes;
    }

    public final PropertyReportBody copy(String birdId, String cannotAccessReportId, PropertyReportAction action, PropertyReportNextStep nextStep, String str) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        Intrinsics.checkNotNullParameter(cannotAccessReportId, "cannotAccessReportId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(nextStep, "nextStep");
        return new PropertyReportBody(birdId, cannotAccessReportId, action, nextStep, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PropertyReportBody) {
            PropertyReportBody propertyReportBody = (PropertyReportBody) obj;
            return Intrinsics.areEqual(this.birdId, propertyReportBody.birdId) && Intrinsics.areEqual(this.cannotAccessReportId, propertyReportBody.cannotAccessReportId) && this.action == propertyReportBody.action && this.nextStep == propertyReportBody.nextStep && Intrinsics.areEqual(this.notes, propertyReportBody.notes);
        }
        return false;
    }

    public final PropertyReportAction getAction() {
        return this.action;
    }

    public final String getBirdId() {
        return this.birdId;
    }

    public final String getCannotAccessReportId() {
        return this.cannotAccessReportId;
    }

    public final PropertyReportNextStep getNextStep() {
        return this.nextStep;
    }

    public final String getNotes() {
        return this.notes;
    }

    public int hashCode() {
        int hashCode = ((((((this.birdId.hashCode() * 31) + this.cannotAccessReportId.hashCode()) * 31) + this.action.hashCode()) * 31) + this.nextStep.hashCode()) * 31;
        String str = this.notes;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.birdId;
        String str2 = this.cannotAccessReportId;
        PropertyReportAction propertyReportAction = this.action;
        PropertyReportNextStep propertyReportNextStep = this.nextStep;
        String str3 = this.notes;
        return "PropertyReportBody(birdId=" + str + ", cannotAccessReportId=" + str2 + ", action=" + propertyReportAction + ", nextStep=" + propertyReportNextStep + ", notes=" + str3 + ")";
    }

    public /* synthetic */ PropertyReportBody(String str, String str2, PropertyReportAction propertyReportAction, PropertyReportNextStep propertyReportNextStep, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, propertyReportAction, propertyReportNextStep, (i & 16) != 0 ? null : str3);
    }
}
