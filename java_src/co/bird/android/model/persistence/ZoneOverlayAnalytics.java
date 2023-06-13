package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.ZoneOverlay;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/persistence/ZoneOverlayAnalytics;", "", "zoneId", "", "overlay", "Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;", "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;)V", "getOverlay", "()Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;", "getZoneId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneOverlayAnalytics {
    private final ZoneOverlay overlay;
    private final String zoneId;

    public ZoneOverlayAnalytics(String zoneId, ZoneOverlay overlay) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        this.zoneId = zoneId;
        this.overlay = overlay;
    }

    public static /* synthetic */ ZoneOverlayAnalytics copy$default(ZoneOverlayAnalytics zoneOverlayAnalytics, String str, ZoneOverlay zoneOverlay, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zoneOverlayAnalytics.zoneId;
        }
        if ((i & 2) != 0) {
            zoneOverlay = zoneOverlayAnalytics.overlay;
        }
        return zoneOverlayAnalytics.copy(str, zoneOverlay);
    }

    public final String component1() {
        return this.zoneId;
    }

    public final ZoneOverlay component2() {
        return this.overlay;
    }

    public final ZoneOverlayAnalytics copy(String zoneId, ZoneOverlay overlay) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        return new ZoneOverlayAnalytics(zoneId, overlay);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOverlayAnalytics) {
            ZoneOverlayAnalytics zoneOverlayAnalytics = (ZoneOverlayAnalytics) obj;
            return Intrinsics.areEqual(this.zoneId, zoneOverlayAnalytics.zoneId) && Intrinsics.areEqual(this.overlay, zoneOverlayAnalytics.overlay);
        }
        return false;
    }

    public final ZoneOverlay getOverlay() {
        return this.overlay;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        return (this.zoneId.hashCode() * 31) + this.overlay.hashCode();
    }

    public String toString() {
        String str = this.zoneId;
        ZoneOverlay zoneOverlay = this.overlay;
        return "ZoneOverlayAnalytics(zoneId=" + str + ", overlay=" + zoneOverlay + ")";
    }
}