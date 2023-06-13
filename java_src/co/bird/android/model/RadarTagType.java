package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\u000b¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/RadarTagType;", "", "label", "", "descriptionHint", "(Ljava/lang/String;III)V", "getDescriptionHint", "()I", "getLabel", "toString", "", "EU", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum RadarTagType {
    EU(C45871nl4.radar_tag_type_eu_label, C45871nl4.radar_tag_type_eu_description_hint);
    
    private final int descriptionHint;
    private final int label;

    RadarTagType(int i, int i2) {
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
        String upperCase = name().toUpperCase();
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }
}
