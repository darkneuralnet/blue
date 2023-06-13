package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/PropertyReportNextStep;", "", "label", "", "(Ljava/lang/String;II)V", "getLabel", "()I", "toString", "", "FOLLOW_UP_VISIT", "ESCALATE_TO_HRR", "NO_ACTION_NEEDED", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum PropertyReportNextStep {
    FOLLOW_UP_VISIT(C45871nl4.property_report_next_step_follow_up_visit),
    ESCALATE_TO_HRR(C45871nl4.property_report_next_step_escalate_to_hrr),
    NO_ACTION_NEEDED(C45871nl4.property_report_next_step_no_action_needed);
    
    private final int label;

    PropertyReportNextStep(int i) {
        this.label = i;
    }

    public final int getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }
}
