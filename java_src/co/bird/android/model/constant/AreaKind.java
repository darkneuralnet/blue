package co.bird.android.model.constant;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/constant/AreaKind;", "", "areaName", "", "areaValue", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAreaName", "()Ljava/lang/String;", "getAreaValue", "OPERATIONAL", "NO_PARKING", "NO_RIDING", "SLOW_SPEED", "PREFERRED_PARKING", "DEMAND_CELLS", "FEE_MODIFIED", "REQUIRED_RELEASES", "UNKNOWN", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum AreaKind {
    OPERATIONAL("Operational", "OPERATIONAL"),
    NO_PARKING("No Parking", "NO_PARKING"),
    NO_RIDING("No Riding", "NO_RIDING"),
    SLOW_SPEED("Slow Speed", "SLOW_SPEED"),
    PREFERRED_PARKING("Preferred Parking", "PREFERRED_PARKING"),
    DEMAND_CELLS("Revenue Map", "DEMAND_CELLS"),
    FEE_MODIFIED("Fee Map", "FEE_MODIFIED"),
    REQUIRED_RELEASES("Required Releases", "REQUIRED_RELEASES"),
    UNKNOWN("Unknown", "UNKNOWN");
    
    private final String areaName;
    private final String areaValue;

    AreaKind(String str, String str2) {
        this.areaName = str;
        this.areaValue = str2;
    }

    public final String getAreaName() {
        return this.areaName;
    }

    public final String getAreaValue() {
        return this.areaValue;
    }
}
