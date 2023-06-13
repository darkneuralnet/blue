package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/wire/WireWarehouse;", "", "id", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireWarehouse {
    @JsonProperty("id")
    @InterfaceC41208ft5("id")

    /* renamed from: id */
    private final String f66775id;
    @JsonProperty("name")
    @InterfaceC41208ft5("name")
    private final String name;

    public WireWarehouse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ WireWarehouse copy$default(WireWarehouse wireWarehouse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wireWarehouse.f66775id;
        }
        if ((i & 2) != 0) {
            str2 = wireWarehouse.name;
        }
        return wireWarehouse.copy(str, str2);
    }

    public final String component1() {
        return this.f66775id;
    }

    public final String component2() {
        return this.name;
    }

    public final WireWarehouse copy(String id, String name) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new WireWarehouse(id, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireWarehouse) {
            WireWarehouse wireWarehouse = (WireWarehouse) obj;
            return Intrinsics.areEqual(this.f66775id, wireWarehouse.f66775id) && Intrinsics.areEqual(this.name, wireWarehouse.name);
        }
        return false;
    }

    public final String getId() {
        return this.f66775id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (this.f66775id.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        String str = this.f66775id;
        String str2 = this.name;
        return "WireWarehouse(id=" + str + ", name=" + str2 + ")";
    }

    public WireWarehouse(String id, String name) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f66775id = id;
        this.name = name;
    }

    public /* synthetic */ WireWarehouse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
