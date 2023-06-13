package co.bird.android.model.persistence;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.OperatorMapZoneSelectability;
import co.bird.android.model.persistence.nestedstructures.ZoneAnnotation;
import co.bird.android.model.persistence.nestedstructures.ZoneOverlay;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J=\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m28432d2 = {"Lco/bird/android/model/persistence/ZoneData;", "", "zoneId", "", "overlay", "Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;", "annotation", "Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;", "selectability", "Lco/bird/android/model/constant/OperatorMapZoneSelectability;", "dataUpdatedAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;Lco/bird/android/model/constant/OperatorMapZoneSelectability;Lorg/joda/time/DateTime;)V", "getAnnotation", "()Lco/bird/android/model/persistence/nestedstructures/ZoneAnnotation;", "getDataUpdatedAt", "()Lorg/joda/time/DateTime;", "getOverlay", "()Lco/bird/android/model/persistence/nestedstructures/ZoneOverlay;", "getSelectability", "()Lco/bird/android/model/constant/OperatorMapZoneSelectability;", "getZoneId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "model-persistence_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ZoneData {
    private final ZoneAnnotation annotation;
    private final DateTime dataUpdatedAt;
    private final ZoneOverlay overlay;
    private final OperatorMapZoneSelectability selectability;
    private final String zoneId;

    public ZoneData(String zoneId, ZoneOverlay overlay, ZoneAnnotation zoneAnnotation, OperatorMapZoneSelectability selectability, DateTime dataUpdatedAt) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter(selectability, "selectability");
        Intrinsics.checkNotNullParameter(dataUpdatedAt, "dataUpdatedAt");
        this.zoneId = zoneId;
        this.overlay = overlay;
        this.annotation = zoneAnnotation;
        this.selectability = selectability;
        this.dataUpdatedAt = dataUpdatedAt;
    }

    public static /* synthetic */ ZoneData copy$default(ZoneData zoneData, String str, ZoneOverlay zoneOverlay, ZoneAnnotation zoneAnnotation, OperatorMapZoneSelectability operatorMapZoneSelectability, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zoneData.zoneId;
        }
        if ((i & 2) != 0) {
            zoneOverlay = zoneData.overlay;
        }
        ZoneOverlay zoneOverlay2 = zoneOverlay;
        if ((i & 4) != 0) {
            zoneAnnotation = zoneData.annotation;
        }
        ZoneAnnotation zoneAnnotation2 = zoneAnnotation;
        if ((i & 8) != 0) {
            operatorMapZoneSelectability = zoneData.selectability;
        }
        OperatorMapZoneSelectability operatorMapZoneSelectability2 = operatorMapZoneSelectability;
        if ((i & 16) != 0) {
            dateTime = zoneData.dataUpdatedAt;
        }
        return zoneData.copy(str, zoneOverlay2, zoneAnnotation2, operatorMapZoneSelectability2, dateTime);
    }

    public final String component1() {
        return this.zoneId;
    }

    public final ZoneOverlay component2() {
        return this.overlay;
    }

    public final ZoneAnnotation component3() {
        return this.annotation;
    }

    public final OperatorMapZoneSelectability component4() {
        return this.selectability;
    }

    public final DateTime component5() {
        return this.dataUpdatedAt;
    }

    public final ZoneData copy(String zoneId, ZoneOverlay overlay, ZoneAnnotation zoneAnnotation, OperatorMapZoneSelectability selectability, DateTime dataUpdatedAt) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        Intrinsics.checkNotNullParameter(selectability, "selectability");
        Intrinsics.checkNotNullParameter(dataUpdatedAt, "dataUpdatedAt");
        return new ZoneData(zoneId, overlay, zoneAnnotation, selectability, dataUpdatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneData) {
            ZoneData zoneData = (ZoneData) obj;
            return Intrinsics.areEqual(this.zoneId, zoneData.zoneId) && Intrinsics.areEqual(this.overlay, zoneData.overlay) && Intrinsics.areEqual(this.annotation, zoneData.annotation) && this.selectability == zoneData.selectability && Intrinsics.areEqual(this.dataUpdatedAt, zoneData.dataUpdatedAt);
        }
        return false;
    }

    public final ZoneAnnotation getAnnotation() {
        return this.annotation;
    }

    public final DateTime getDataUpdatedAt() {
        return this.dataUpdatedAt;
    }

    public final ZoneOverlay getOverlay() {
        return this.overlay;
    }

    public final OperatorMapZoneSelectability getSelectability() {
        return this.selectability;
    }

    public final String getZoneId() {
        return this.zoneId;
    }

    public int hashCode() {
        int hashCode = ((this.zoneId.hashCode() * 31) + this.overlay.hashCode()) * 31;
        ZoneAnnotation zoneAnnotation = this.annotation;
        return ((((hashCode + (zoneAnnotation == null ? 0 : zoneAnnotation.hashCode())) * 31) + this.selectability.hashCode()) * 31) + this.dataUpdatedAt.hashCode();
    }

    public String toString() {
        String str = this.zoneId;
        ZoneOverlay zoneOverlay = this.overlay;
        ZoneAnnotation zoneAnnotation = this.annotation;
        OperatorMapZoneSelectability operatorMapZoneSelectability = this.selectability;
        DateTime dateTime = this.dataUpdatedAt;
        return "ZoneData(zoneId=" + str + ", overlay=" + zoneOverlay + ", annotation=" + zoneAnnotation + ", selectability=" + operatorMapZoneSelectability + ", dataUpdatedAt=" + dateTime + ")";
    }
}
