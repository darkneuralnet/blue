package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J.\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/model/Zone;", "", "nearestDistance", "", "rules", "", "name", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getNearestDistance", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRules", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lco/bird/android/model/Zone;", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class Zone {
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("nearest_distance")
    @InterfaceC41208ft5("nearest_distance")
    private final Double nearestDistance;
    @JsonProperty("rules")
    @InterfaceC41208ft5("rules")
    private final String rules;

    public Zone() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Zone copy$default(Zone zone, Double d, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = zone.nearestDistance;
        }
        if ((i & 2) != 0) {
            str = zone.rules;
        }
        if ((i & 4) != 0) {
            str2 = zone.name;
        }
        return zone.copy(d, str, str2);
    }

    public final Double component1() {
        return this.nearestDistance;
    }

    public final String component2() {
        return this.rules;
    }

    public final String component3() {
        return this.name;
    }

    public final Zone copy(Double d, String rules, String name) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(name, "name");
        return new Zone(d, rules, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Zone) {
            Zone zone = (Zone) obj;
            return Intrinsics.areEqual((Object) this.nearestDistance, (Object) zone.nearestDistance) && Intrinsics.areEqual(this.rules, zone.rules) && Intrinsics.areEqual(this.name, zone.name);
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final Double getNearestDistance() {
        return this.nearestDistance;
    }

    public final String getRules() {
        return this.rules;
    }

    public int hashCode() {
        Double d = this.nearestDistance;
        return ((((d == null ? 0 : d.hashCode()) * 31) + this.rules.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        Double d = this.nearestDistance;
        String str = this.rules;
        String str2 = this.name;
        return "Zone(nearestDistance=" + d + ", rules=" + str + ", name=" + str2 + ")";
    }

    public Zone(Double d, String rules, String name) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        Intrinsics.checkNotNullParameter(name, "name");
        this.nearestDistance = d;
        this.rules = rules;
        this.name = name;
    }

    public /* synthetic */ Zone(Double d, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Double.valueOf(0.0d) : d, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
