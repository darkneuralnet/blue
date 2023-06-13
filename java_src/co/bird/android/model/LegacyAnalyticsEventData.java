package co.bird.android.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003JA\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR&\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/model/LegacyAnalyticsEventData;", "", "id", "", "name", "properties", "", "time", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lorg/joda/time/DateTime;)V", "getId", "()Ljava/lang/String;", "getName", "getProperties", "()Ljava/util/Map;", "getTime", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class LegacyAnalyticsEventData {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66600id;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;
    @JsonProperty("properties")
    @InterfaceC41208ft5("properties")
    private final Map<String, Object> properties;
    @JsonProperty("time")
    @InterfaceC41208ft5("time")
    private final DateTime time;

    public LegacyAnalyticsEventData() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LegacyAnalyticsEventData copy$default(LegacyAnalyticsEventData legacyAnalyticsEventData, String str, String str2, Map map, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = legacyAnalyticsEventData.f66600id;
        }
        if ((i & 2) != 0) {
            str2 = legacyAnalyticsEventData.name;
        }
        if ((i & 4) != 0) {
            map = legacyAnalyticsEventData.properties;
        }
        if ((i & 8) != 0) {
            dateTime = legacyAnalyticsEventData.time;
        }
        return legacyAnalyticsEventData.copy(str, str2, map, dateTime);
    }

    public final String component1() {
        return this.f66600id;
    }

    public final String component2() {
        return this.name;
    }

    public final Map<String, Object> component3() {
        return this.properties;
    }

    public final DateTime component4() {
        return this.time;
    }

    public final LegacyAnalyticsEventData copy(String id, String name, Map<String, ? extends Object> map, DateTime time) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(time, "time");
        return new LegacyAnalyticsEventData(id, name, map, time);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LegacyAnalyticsEventData) {
            LegacyAnalyticsEventData legacyAnalyticsEventData = (LegacyAnalyticsEventData) obj;
            return Intrinsics.areEqual(this.f66600id, legacyAnalyticsEventData.f66600id) && Intrinsics.areEqual(this.name, legacyAnalyticsEventData.name) && Intrinsics.areEqual(this.properties, legacyAnalyticsEventData.properties) && Intrinsics.areEqual(this.time, legacyAnalyticsEventData.time);
        }
        return false;
    }

    public final String getId() {
        return this.f66600id;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    public final DateTime getTime() {
        return this.time;
    }

    public int hashCode() {
        int hashCode = ((this.f66600id.hashCode() * 31) + this.name.hashCode()) * 31;
        Map<String, Object> map = this.properties;
        return ((hashCode + (map == null ? 0 : map.hashCode())) * 31) + this.time.hashCode();
    }

    public String toString() {
        String str = this.f66600id;
        String str2 = this.name;
        Map<String, Object> map = this.properties;
        DateTime dateTime = this.time;
        return "LegacyAnalyticsEventData(id=" + str + ", name=" + str2 + ", properties=" + map + ", time=" + dateTime + ")";
    }

    public LegacyAnalyticsEventData(String id, String name, Map<String, ? extends Object> map, DateTime time) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(time, "time");
        this.f66600id = id;
        this.name = name;
        this.properties = map;
        this.time = time;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ LegacyAnalyticsEventData(String str, String str2, Map map, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, map, dateTime);
        if ((i & 1) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
        str2 = (i & 2) != 0 ? "" : str2;
        map = (i & 4) != 0 ? null : map;
        if ((i & 8) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
