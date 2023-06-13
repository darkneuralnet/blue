package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR$\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/persistence/AnalyticsEntity;", "", "id", "", "name", "", "properties", "", "(ILjava/lang/String;Ljava/util/Map;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getProperties", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class AnalyticsEntity {

    /* renamed from: id */
    private final transient int f66667id;
    private final String name;
    private final Map<String, Object> properties;

    public AnalyticsEntity(int i, String name, Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.f66667id = i;
        this.name = name;
        this.properties = properties;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsEntity copy$default(AnalyticsEntity analyticsEntity, int i, String str, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = analyticsEntity.f66667id;
        }
        if ((i2 & 2) != 0) {
            str = analyticsEntity.name;
        }
        if ((i2 & 4) != 0) {
            map = analyticsEntity.properties;
        }
        return analyticsEntity.copy(i, str, map);
    }

    public final int component1() {
        return this.f66667id;
    }

    public final String component2() {
        return this.name;
    }

    public final Map<String, Object> component3() {
        return this.properties;
    }

    public final AnalyticsEntity copy(int i, String name, Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(properties, "properties");
        return new AnalyticsEntity(i, name, properties);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnalyticsEntity) {
            AnalyticsEntity analyticsEntity = (AnalyticsEntity) obj;
            return this.f66667id == analyticsEntity.f66667id && Intrinsics.areEqual(this.name, analyticsEntity.name) && Intrinsics.areEqual(this.properties, analyticsEntity.properties);
        }
        return false;
    }

    public final int getId() {
        return this.f66667id;
    }

    public final String getName() {
        return this.name;
    }

    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f66667id) * 31) + this.name.hashCode()) * 31) + this.properties.hashCode();
    }

    public String toString() {
        int i = this.f66667id;
        String str = this.name;
        Map<String, Object> map = this.properties;
        return "AnalyticsEntity(id=" + i + ", name=" + str + ", properties=" + map + ")";
    }

    public /* synthetic */ AnalyticsEntity(int i, String str, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str, map);
    }
}
