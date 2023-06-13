package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/RefreshWarehouseButton;", "Lco/bird/android/model/WarehouseFlightSheetButton;", "warehouseId", "", "title", "updatedAt", "Lorg/joda/time/DateTime;", "(Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "getTitle", "()Ljava/lang/String;", "getUpdatedAt", "()Lorg/joda/time/DateTime;", "getWarehouseId", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RefreshWarehouseButton implements WarehouseFlightSheetButton {
    private final String title;
    private final DateTime updatedAt;
    private final String warehouseId;

    public RefreshWarehouseButton(String warehouseId, String title, DateTime updatedAt) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        this.warehouseId = warehouseId;
        this.title = title;
        this.updatedAt = updatedAt;
    }

    public static /* synthetic */ RefreshWarehouseButton copy$default(RefreshWarehouseButton refreshWarehouseButton, String str, String str2, DateTime dateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = refreshWarehouseButton.warehouseId;
        }
        if ((i & 2) != 0) {
            str2 = refreshWarehouseButton.title;
        }
        if ((i & 4) != 0) {
            dateTime = refreshWarehouseButton.updatedAt;
        }
        return refreshWarehouseButton.copy(str, str2, dateTime);
    }

    public final String component1() {
        return this.warehouseId;
    }

    public final String component2() {
        return this.title;
    }

    public final DateTime component3() {
        return this.updatedAt;
    }

    public final RefreshWarehouseButton copy(String warehouseId, String title, DateTime updatedAt) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        return new RefreshWarehouseButton(warehouseId, title, updatedAt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RefreshWarehouseButton) {
            RefreshWarehouseButton refreshWarehouseButton = (RefreshWarehouseButton) obj;
            return Intrinsics.areEqual(this.warehouseId, refreshWarehouseButton.warehouseId) && Intrinsics.areEqual(this.title, refreshWarehouseButton.title) && Intrinsics.areEqual(this.updatedAt, refreshWarehouseButton.updatedAt);
        }
        return false;
    }

    public final String getTitle() {
        return this.title;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getWarehouseId() {
        return this.warehouseId;
    }

    public int hashCode() {
        return (((this.warehouseId.hashCode() * 31) + this.title.hashCode()) * 31) + this.updatedAt.hashCode();
    }

    public String toString() {
        String str = this.warehouseId;
        String str2 = this.title;
        DateTime dateTime = this.updatedAt;
        return "RefreshWarehouseButton(warehouseId=" + str + ", title=" + str2 + ", updatedAt=" + dateTime + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RefreshWarehouseButton(String str, String str2, DateTime dateTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, dateTime);
        if ((i & 4) != 0) {
            dateTime = DateTime.now();
            Intrinsics.checkNotNullExpressionValue(dateTime, "now()");
        }
    }
}
