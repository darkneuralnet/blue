package co.bird.android.model.filter;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.Area;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/filter/KeyBasedAreasFilter;", "", "birdSelected", "", "areaKey", "", "(ZLjava/lang/String;)V", "getAreaKey", "()Ljava/lang/String;", "getBirdSelected", "()Z", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "filter", "area", "Lco/bird/android/model/persistence/Area;", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class KeyBasedAreasFilter {
    private final String areaKey;
    private final boolean birdSelected;

    public KeyBasedAreasFilter() {
        this(false, null, 3, null);
    }

    public static /* synthetic */ KeyBasedAreasFilter copy$default(KeyBasedAreasFilter keyBasedAreasFilter, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = keyBasedAreasFilter.birdSelected;
        }
        if ((i & 2) != 0) {
            str = keyBasedAreasFilter.areaKey;
        }
        return keyBasedAreasFilter.copy(z, str);
    }

    public final boolean component1() {
        return this.birdSelected;
    }

    public final String component2() {
        return this.areaKey;
    }

    public final KeyBasedAreasFilter copy(boolean z, String str) {
        return new KeyBasedAreasFilter(z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KeyBasedAreasFilter) {
            KeyBasedAreasFilter keyBasedAreasFilter = (KeyBasedAreasFilter) obj;
            return this.birdSelected == keyBasedAreasFilter.birdSelected && Intrinsics.areEqual(this.areaKey, keyBasedAreasFilter.areaKey);
        }
        return false;
    }

    public final boolean filter(Area area) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(area, "area");
        if (!this.birdSelected) {
            return true;
        }
        List<String> areaKeys = area.getAreaKeys();
        if (areaKeys != null && !areaKeys.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z || this.areaKey == null) {
            return true;
        }
        List<String> areaKeys2 = area.getAreaKeys();
        if (areaKeys2 != null && areaKeys2.contains(this.areaKey)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return true;
        }
        return false;
    }

    public final String getAreaKey() {
        return this.areaKey;
    }

    public final boolean getBirdSelected() {
        return this.birdSelected;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.birdSelected;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.areaKey;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        boolean z = this.birdSelected;
        String str = this.areaKey;
        return "KeyBasedAreasFilter(birdSelected=" + z + ", areaKey=" + str + ")";
    }

    public KeyBasedAreasFilter(boolean z, String str) {
        this.birdSelected = z;
        this.areaKey = str;
    }

    public /* synthetic */ KeyBasedAreasFilter(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
    }
}
