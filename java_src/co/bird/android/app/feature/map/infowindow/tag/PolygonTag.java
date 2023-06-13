package co.bird.android.app.feature.map.infowindow.tag;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b(\b\u0086\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010 \u001a\u00020\bHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010'\u001a\u00020\bHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\bHÆ\u0003J\u0094\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0006HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001d\u0010\u0015¨\u00060"}, m28432d2 = {"Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;", "", "title", "", "notes", "titleColor", "", "canShowInfoWindow", "", "isNoRide", "noRideColor", "isNoPark", "noParkColor", "isSlow", "slowColor", "isParkingSpot", "parkingColor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;)V", "getCanShowInfoWindow", "()Z", "getNoParkColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNoRideColor", "getNotes", "()Ljava/lang/String;", "getParkingColor", "getSlowColor", "getTitle", "getTitleColor", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;ZLjava/lang/Integer;)Lco/bird/android/app/feature/map/infowindow/tag/PolygonTag;", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class PolygonTag {
    private final boolean canShowInfoWindow;
    private final boolean isNoPark;
    private final boolean isNoRide;
    private final boolean isParkingSpot;
    private final boolean isSlow;
    private final Integer noParkColor;
    private final Integer noRideColor;
    private final String notes;
    private final Integer parkingColor;
    private final Integer slowColor;
    private final String title;
    private final Integer titleColor;

    public PolygonTag(String str, String str2, Integer num, boolean z, boolean z2, Integer num2, boolean z3, Integer num3, boolean z4, Integer num4, boolean z5, Integer num5) {
        this.title = str;
        this.notes = str2;
        this.titleColor = num;
        this.canShowInfoWindow = z;
        this.isNoRide = z2;
        this.noRideColor = num2;
        this.isNoPark = z3;
        this.noParkColor = num3;
        this.isSlow = z4;
        this.slowColor = num4;
        this.isParkingSpot = z5;
        this.parkingColor = num5;
    }

    public final String component1() {
        return this.title;
    }

    public final Integer component10() {
        return this.slowColor;
    }

    public final boolean component11() {
        return this.isParkingSpot;
    }

    public final Integer component12() {
        return this.parkingColor;
    }

    public final String component2() {
        return this.notes;
    }

    public final Integer component3() {
        return this.titleColor;
    }

    public final boolean component4() {
        return this.canShowInfoWindow;
    }

    public final boolean component5() {
        return this.isNoRide;
    }

    public final Integer component6() {
        return this.noRideColor;
    }

    public final boolean component7() {
        return this.isNoPark;
    }

    public final Integer component8() {
        return this.noParkColor;
    }

    public final boolean component9() {
        return this.isSlow;
    }

    public final PolygonTag copy(String str, String str2, Integer num, boolean z, boolean z2, Integer num2, boolean z3, Integer num3, boolean z4, Integer num4, boolean z5, Integer num5) {
        return new PolygonTag(str, str2, num, z, z2, num2, z3, num3, z4, num4, z5, num5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PolygonTag) {
            PolygonTag polygonTag = (PolygonTag) obj;
            return Intrinsics.areEqual(this.title, polygonTag.title) && Intrinsics.areEqual(this.notes, polygonTag.notes) && Intrinsics.areEqual(this.titleColor, polygonTag.titleColor) && this.canShowInfoWindow == polygonTag.canShowInfoWindow && this.isNoRide == polygonTag.isNoRide && Intrinsics.areEqual(this.noRideColor, polygonTag.noRideColor) && this.isNoPark == polygonTag.isNoPark && Intrinsics.areEqual(this.noParkColor, polygonTag.noParkColor) && this.isSlow == polygonTag.isSlow && Intrinsics.areEqual(this.slowColor, polygonTag.slowColor) && this.isParkingSpot == polygonTag.isParkingSpot && Intrinsics.areEqual(this.parkingColor, polygonTag.parkingColor);
        }
        return false;
    }

    public final boolean getCanShowInfoWindow() {
        return this.canShowInfoWindow;
    }

    public final Integer getNoParkColor() {
        return this.noParkColor;
    }

    public final Integer getNoRideColor() {
        return this.noRideColor;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final Integer getParkingColor() {
        return this.parkingColor;
    }

    public final Integer getSlowColor() {
        return this.slowColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTitleColor() {
        return this.titleColor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.notes;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.titleColor;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z = this.canShowInfoWindow;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z2 = this.isNoRide;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        Integer num2 = this.noRideColor;
        int hashCode4 = (i4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        boolean z3 = this.isNoPark;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (hashCode4 + i5) * 31;
        Integer num3 = this.noParkColor;
        int hashCode5 = (i6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        boolean z4 = this.isSlow;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (hashCode5 + i7) * 31;
        Integer num4 = this.slowColor;
        int hashCode6 = (i8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        boolean z5 = this.isParkingSpot;
        int i9 = (hashCode6 + (z5 ? 1 : z5 ? 1 : 0)) * 31;
        Integer num5 = this.parkingColor;
        return i9 + (num5 != null ? num5.hashCode() : 0);
    }

    public final boolean isNoPark() {
        return this.isNoPark;
    }

    public final boolean isNoRide() {
        return this.isNoRide;
    }

    public final boolean isParkingSpot() {
        return this.isParkingSpot;
    }

    public final boolean isSlow() {
        return this.isSlow;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.notes;
        Integer num = this.titleColor;
        boolean z = this.canShowInfoWindow;
        boolean z2 = this.isNoRide;
        Integer num2 = this.noRideColor;
        boolean z3 = this.isNoPark;
        Integer num3 = this.noParkColor;
        boolean z4 = this.isSlow;
        Integer num4 = this.slowColor;
        boolean z5 = this.isParkingSpot;
        Integer num5 = this.parkingColor;
        return "PolygonTag(title=" + str + ", notes=" + str2 + ", titleColor=" + num + ", canShowInfoWindow=" + z + ", isNoRide=" + z2 + ", noRideColor=" + num2 + ", isNoPark=" + z3 + ", noParkColor=" + num3 + ", isSlow=" + z4 + ", slowColor=" + num4 + ", isParkingSpot=" + z5 + ", parkingColor=" + num5 + ")";
    }

    public /* synthetic */ PolygonTag(String str, String str2, Integer num, boolean z, boolean z2, Integer num2, boolean z3, Integer num3, boolean z4, Integer num4, boolean z5, Integer num5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? null : num4, (i & 1024) != 0 ? false : z5, (i & 2048) != 0 ? null : num5);
    }
}
