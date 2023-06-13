package co.bird.android.model.wire;

import co.bird.android.model.LegacyRepairType;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m28432d2 = {"Lco/bird/android/model/wire/WireTaskEntry;", "", "x", "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "", "model-wire_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class WireTaskEntry {
    @JsonProperty("label")
    @JsonAlias({"x", "x_value"})
    @InterfaceC41208ft5(alternate = {"x", "x_value"}, value = "label")

    /* renamed from: x */
    private final float f66767x;
    @JsonProperty("value")
    @JsonAlias({"y", "y_value"})
    @InterfaceC41208ft5(alternate = {"y", "y_value"}, value = "value")

    /* renamed from: y */
    private final float f66768y;

    public WireTaskEntry() {
        this(0.0f, 0.0f, 3, null);
    }

    public static /* synthetic */ WireTaskEntry copy$default(WireTaskEntry wireTaskEntry, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = wireTaskEntry.f66767x;
        }
        if ((i & 2) != 0) {
            f2 = wireTaskEntry.f66768y;
        }
        return wireTaskEntry.copy(f, f2);
    }

    public final float component1() {
        return this.f66767x;
    }

    public final float component2() {
        return this.f66768y;
    }

    public final WireTaskEntry copy(float f, float f2) {
        return new WireTaskEntry(f, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WireTaskEntry) {
            WireTaskEntry wireTaskEntry = (WireTaskEntry) obj;
            return Float.compare(this.f66767x, wireTaskEntry.f66767x) == 0 && Float.compare(this.f66768y, wireTaskEntry.f66768y) == 0;
        }
        return false;
    }

    public final float getX() {
        return this.f66767x;
    }

    public final float getY() {
        return this.f66768y;
    }

    public int hashCode() {
        return (Float.hashCode(this.f66767x) * 31) + Float.hashCode(this.f66768y);
    }

    public String toString() {
        float f = this.f66767x;
        float f2 = this.f66768y;
        return "WireTaskEntry(x=" + f + ", y=" + f2 + ")";
    }

    public WireTaskEntry(float f, float f2) {
        this.f66767x = f;
        this.f66768y = f2;
    }

    public /* synthetic */ WireTaskEntry(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
