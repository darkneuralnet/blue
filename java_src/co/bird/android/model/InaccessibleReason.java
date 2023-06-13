package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/InaccessibleReason;", "", "label", "", "descriptionHint", "(Ljava/lang/String;III)V", "getDescriptionHint", "()I", "getLabel", "toString", "", "ON_PRIVATE_PROPERTY", "ON_BUSINESS_PROPERTY", "INSIDE_CAR", "SUBMERGED", "MISSING", "OTHER", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum InaccessibleReason {
    ON_PRIVATE_PROPERTY(C45871nl4.inaccessible_reason_private_property_label, C45871nl4.inaccessible_reason_private_property_description_hint),
    ON_BUSINESS_PROPERTY(C45871nl4.inaccessible_reason_business_property_label, C45871nl4.inaccessible_reason_business_property_description_hint),
    INSIDE_CAR(C45871nl4.inaccessible_reason_inside_car_label, C45871nl4.inaccessible_reason_inside_car_description_hint),
    SUBMERGED(C45871nl4.inaccessible_reason_submerged_label, C45871nl4.inaccessible_reason_submerged_description_hint),
    MISSING(C45871nl4.inaccessible_reason_missing_label, C45871nl4.inaccessible_reason_missing_description_hint),
    OTHER(C45871nl4.inaccessible_reason_other_label, C45871nl4.inaccessible_reason_other_description_hint);
    
    private final int descriptionHint;
    private final int label;

    InaccessibleReason(int i, int i2) {
        this.label = i;
        this.descriptionHint = i2;
    }

    public final int getDescriptionHint() {
        return this.descriptionHint;
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
