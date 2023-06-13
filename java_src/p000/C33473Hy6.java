package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.ClientIcon;
import co.bird.android.model.persistence.WarehouseFlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.ThemedColors;
import co.bird.android.model.persistence.nestedstructures.WarehouseDetails;
import co.bird.android.model.persistence.nestedstructures.WarehouseStatus;
import co.bird.android.model.persistence.nestedstructures.WarehouseSummary;
import co.bird.android.model.persistence.nestedstructures.WarehouseVehicle;
import co.bird.android.model.persistence.nestedstructures.WarehouseVehicleDetails;
import co.bird.android.model.wire.WireFormattedFlightSheetDetail;
import co.bird.android.model.wire.WireThemedColors;
import co.bird.android.model.wire.WireWarehouseDetails;
import co.bird.android.model.wire.WireWarehouseFlightSheetDetails;
import co.bird.android.model.wire.WireWarehouseStatus;
import co.bird.android.model.wire.WireWarehouseSummary;
import co.bird.android.model.wire.WireWarehouseVehicle;
import co.bird.android.model.wire.WireWarehouseVehicleDetails;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0005\u001a\n\u0010\n\u001a\u00020\t*\u00020\b\u001a\n\u0010\r\u001a\u00020\f*\u00020\u000b\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u000e\u001a\n\u0010\u0013\u001a\u00020\u0012*\u00020\u0011¨\u0006\u0014"}, m28432d2 = {"Lco/bird/android/model/wire/WireWarehouseFlightSheetDetails;", "", "warehouseId", "Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;", C17296a.f69688o, "Lco/bird/android/model/wire/WireWarehouseSummary;", "Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/wire/WireWarehouseStatus;", "Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;", "c", "Lco/bird/android/model/wire/WireWarehouseDetails;", "Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;", "b", "Lco/bird/android/model/wire/WireWarehouseVehicleDetails;", "Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;", "f", "Lco/bird/android/model/wire/WireWarehouseVehicle;", "Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicle;", "e", "co.bird.android.repository.warehouse-flight-sheet"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWarehouseFlightSheetConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseFlightSheetConversion.kt\nco/bird/android/repository/warehouseflightsheet/conversion/WarehouseFlightSheetConversionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1549#2:71\n1620#2,3:72\n1549#2:75\n1620#2,3:76\n*S KotlinDebug\n*F\n+ 1 WarehouseFlightSheetConversion.kt\nco/bird/android/repository/warehouseflightsheet/conversion/WarehouseFlightSheetConversionKt\n*L\n49#1:71\n49#1:72,3\n57#1:75\n57#1:76,3\n*E\n"})
/* renamed from: Hy6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33473Hy6 {
    /* renamed from: a */
    public static final WarehouseFlightSheetDetails m103141a(WireWarehouseFlightSheetDetails wireWarehouseFlightSheetDetails, String warehouseId) {
        WarehouseSummary warehouseSummary;
        WarehouseStatus warehouseStatus;
        WarehouseDetails warehouseDetails;
        WarehouseVehicleDetails warehouseVehicleDetails;
        Intrinsics.checkNotNullParameter(wireWarehouseFlightSheetDetails, "<this>");
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        WireWarehouseSummary summary = wireWarehouseFlightSheetDetails.getSummary();
        if (summary != null) {
            warehouseSummary = m103138d(summary);
        } else {
            warehouseSummary = null;
        }
        WireWarehouseStatus status = wireWarehouseFlightSheetDetails.getStatus();
        if (status != null) {
            warehouseStatus = m103139c(status);
        } else {
            warehouseStatus = null;
        }
        WireWarehouseDetails warehouseDetails2 = wireWarehouseFlightSheetDetails.getWarehouseDetails();
        if (warehouseDetails2 != null) {
            warehouseDetails = m103140b(warehouseDetails2);
        } else {
            warehouseDetails = null;
        }
        WireWarehouseVehicleDetails vehicleDetails = wireWarehouseFlightSheetDetails.getVehicleDetails();
        if (vehicleDetails != null) {
            warehouseVehicleDetails = m103136f(vehicleDetails);
        } else {
            warehouseVehicleDetails = null;
        }
        return new WarehouseFlightSheetDetails(warehouseId, warehouseSummary, warehouseStatus, warehouseDetails, warehouseVehicleDetails);
    }

    /* renamed from: b */
    public static final WarehouseDetails m103140b(WireWarehouseDetails wireWarehouseDetails) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireWarehouseDetails, "<this>");
        int idx = wireWarehouseDetails.getIdx();
        List<WireFormattedFlightSheetDetail> details = wireWarehouseDetails.getDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(details, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireFormattedFlightSheetDetail wireFormattedFlightSheetDetail : details) {
            arrayList.add(C47311qB0.m17963d(wireFormattedFlightSheetDetail));
        }
        return new WarehouseDetails(idx, arrayList);
    }

    /* renamed from: c */
    public static final WarehouseStatus m103139c(WireWarehouseStatus wireWarehouseStatus) {
        ThemedColors themedColors;
        Intrinsics.checkNotNullParameter(wireWarehouseStatus, "<this>");
        int idx = wireWarehouseStatus.getIdx();
        String title = wireWarehouseStatus.getTitle();
        String details = wireWarehouseStatus.getDetails();
        ClientIcon icon = wireWarehouseStatus.getIcon();
        WireThemedColors iconBackgroundColor = wireWarehouseStatus.getIconBackgroundColor();
        if (iconBackgroundColor != null) {
            themedColors = C47311qB0.m17961f(iconBackgroundColor);
        } else {
            themedColors = null;
        }
        return new WarehouseStatus(idx, title, details, icon, themedColors);
    }

    /* renamed from: d */
    public static final WarehouseSummary m103138d(WireWarehouseSummary wireWarehouseSummary) {
        Intrinsics.checkNotNullParameter(wireWarehouseSummary, "<this>");
        return new WarehouseSummary(wireWarehouseSummary.getIdx(), wireWarehouseSummary.getTitle(), wireWarehouseSummary.getCount());
    }

    /* renamed from: e */
    public static final WarehouseVehicle m103137e(WireWarehouseVehicle wireWarehouseVehicle) {
        ThemedColors themedColors;
        Intrinsics.checkNotNullParameter(wireWarehouseVehicle, "<this>");
        String birdId = wireWarehouseVehicle.getBirdId();
        String title = wireWarehouseVehicle.getTitle();
        ClientIcon statusIcon = wireWarehouseVehicle.getStatusIcon();
        WireThemedColors statusIconBackgroundColor = wireWarehouseVehicle.getStatusIconBackgroundColor();
        if (statusIconBackgroundColor != null) {
            themedColors = C47311qB0.m17961f(statusIconBackgroundColor);
        } else {
            themedColors = null;
        }
        return new WarehouseVehicle(birdId, title, statusIcon, themedColors, wireWarehouseVehicle.getBattery());
    }

    /* renamed from: f */
    public static final WarehouseVehicleDetails m103136f(WireWarehouseVehicleDetails wireWarehouseVehicleDetails) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(wireWarehouseVehicleDetails, "<this>");
        int idx = wireWarehouseVehicleDetails.getIdx();
        String title = wireWarehouseVehicleDetails.getTitle();
        List<WireWarehouseVehicle> vehicles = wireWarehouseVehicleDetails.getVehicles();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(vehicles, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WireWarehouseVehicle wireWarehouseVehicle : vehicles) {
            arrayList.add(m103137e(wireWarehouseVehicle));
        }
        return new WarehouseVehicleDetails(idx, title, arrayList);
    }
}
