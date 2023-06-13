package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005HÆ\u0003J-\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR&\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/AnalyticsEventData;", "", "name", "", "properties", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getProperties", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AnalyticsEventData {
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("properties")
    @InterfaceC41208ft5("properties")
    private final Map<String, Object> properties;

    public AnalyticsEventData() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsEventData copy$default(AnalyticsEventData analyticsEventData, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = analyticsEventData.name;
        }
        if ((i & 2) != 0) {
            map = analyticsEventData.properties;
        }
        return analyticsEventData.copy(str, map);
    }

    public final String component1() {
        return this.name;
    }

    public final Map<String, Object> component2() {
        return this.properties;
    }

    public final AnalyticsEventData copy(String name, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new AnalyticsEventData(name, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnalyticsEventData) {
            AnalyticsEventData analyticsEventData = (AnalyticsEventData) obj;
            return Intrinsics.areEqual(this.name, analyticsEventData.name) && Intrinsics.areEqual(this.properties, analyticsEventData.properties);
        }
        return false;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        Map<String, Object> map = this.properties;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        String str = this.name;
        Map<String, Object> map = this.properties;
        return "AnalyticsEventData(name=" + str + ", properties=" + map + ")";
    }

    public AnalyticsEventData(String name, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.properties = map;
    }

    public /* synthetic */ AnalyticsEventData(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : map);
    }
}
