package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.RefreshWarehouseButton;
import co.bird.android.model.constant.FlightSheetDetailFormat;
import co.bird.android.model.persistence.WarehouseFlightSheetDetails;
import co.bird.android.model.persistence.nestedstructures.FormattedFlightSheetDetail;
import co.bird.android.model.persistence.nestedstructures.WarehouseDetails;
import co.bird.android.model.persistence.nestedstructures.WarehouseFlightSheetSection;
import co.bird.android.model.persistence.nestedstructures.WarehouseStatus;
import co.bird.android.model.persistence.nestedstructures.WarehouseSummary;
import co.bird.android.model.persistence.nestedstructures.WarehouseVehicle;
import co.bird.android.model.persistence.nestedstructures.WarehouseVehicleDetails;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¨\u0006\u0017"}, m28432d2 = {"LIy6;", "", "Lco/bird/android/model/persistence/WarehouseFlightSheetDetails;", "warehouseFlightSheetDetails", "", "LH6;", C17296a.f69688o, "Lco/bird/android/model/persistence/nestedstructures/WarehouseSummary;", "summary", "c", "Lco/bird/android/model/persistence/nestedstructures/WarehouseStatus;", "status", "b", "Lco/bird/android/model/persistence/nestedstructures/WarehouseDetails;", "warehouseDetails", DateTokenConverter.CONVERTER_KEY, "", "warehouseId", "Lco/bird/android/model/persistence/nestedstructures/WarehouseVehicleDetails;", "warehouseVehicleDetails", "e", "<init>", "()V", "warehouse-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWarehouseFlightSheetConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseFlightSheetConverter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1045#2:94\n1603#2,9:95\n1855#2:104\n1856#2:106\n1612#2:107\n1549#2:108\n1620#2,3:109\n1549#2:113\n1620#2,3:114\n1#3:105\n1#3:112\n*S KotlinDebug\n*F\n+ 1 WarehouseFlightSheetConverter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetConverter\n*L\n25#1:94\n26#1:95,9\n26#1:104\n26#1:106\n26#1:107\n59#1:108\n59#1:109,3\n73#1:113\n73#1:114,3\n26#1:105\n*E\n"})
/* renamed from: Iy6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33707Iy6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Iy6$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C3825a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlightSheetDetailFormat.values().length];
            try {
                iArr[FlightSheetDetailFormat.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 WarehouseFlightSheetConverter.kt\nco/bird/android/feature/warehouseflightsheet/adapters/WarehouseFlightSheetConverter\n*L\n1#1,328:1\n25#2:329\n*E\n"})
    /* renamed from: Iy6$b */
    /* loaded from: classes3.dex */
    public static final class C3826b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((WarehouseFlightSheetSection) t).getIdx()), Integer.valueOf(((WarehouseFlightSheetSection) t2).getIdx()));
            return compareValues;
        }
    }

    /* renamed from: a */
    public final List<C3023H6> m101418a(WarehouseFlightSheetDetails warehouseFlightSheetDetails) {
        List listOfNotNull;
        List<WarehouseFlightSheetSection> sortedWith;
        C3023H6 c3023h6;
        Intrinsics.checkNotNullParameter(warehouseFlightSheetDetails, "warehouseFlightSheetDetails");
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new WarehouseFlightSheetSection[]{warehouseFlightSheetDetails.getSummary(), warehouseFlightSheetDetails.getStatus(), warehouseFlightSheetDetails.getWarehouseDetails(), warehouseFlightSheetDetails.getVehicleDetails()});
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(listOfNotNull, new C3826b());
        ArrayList arrayList = new ArrayList();
        for (WarehouseFlightSheetSection warehouseFlightSheetSection : sortedWith) {
            if (warehouseFlightSheetSection instanceof WarehouseSummary) {
                c3023h6 = m101416c((WarehouseSummary) warehouseFlightSheetSection);
            } else if (warehouseFlightSheetSection instanceof WarehouseStatus) {
                c3023h6 = m101417b((WarehouseStatus) warehouseFlightSheetSection);
            } else if (warehouseFlightSheetSection instanceof WarehouseDetails) {
                c3023h6 = m101415d((WarehouseDetails) warehouseFlightSheetSection);
            } else if (warehouseFlightSheetSection instanceof WarehouseVehicleDetails) {
                c3023h6 = m101414e(warehouseFlightSheetDetails.getWarehouseId(), (WarehouseVehicleDetails) warehouseFlightSheetSection);
            } else {
                c3023h6 = null;
            }
            if (c3023h6 != null) {
                arrayList.add(c3023h6);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C3023H6 m101417b(WarehouseStatus warehouseStatus) {
        return new C3023H6(new ArrayList(), new C2637G6(warehouseStatus, C36612Vj4.item_warehouse_flight_sheet_status, false, 4, null), null, 4, null);
    }

    /* renamed from: c */
    public final C3023H6 m101416c(WarehouseSummary warehouseSummary) {
        return new C3023H6(new ArrayList(), new C2637G6(warehouseSummary, C36612Vj4.item_warehouse_flight_sheet_summary, false, 4, null), null, 4, null);
    }

    /* renamed from: d */
    public final C3023H6 m101415d(WarehouseDetails warehouseDetails) {
        int collectionSizeOrDefault;
        List mutableList;
        int i;
        List<FormattedFlightSheetDetail> details = warehouseDetails.getDetails();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(details, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (FormattedFlightSheetDetail formattedFlightSheetDetail : details) {
            if (C3825a.$EnumSwitchMapping$0[formattedFlightSheetDetail.getFormat().ordinal()] == 1) {
                i = C38728bk4.item_formatted_flight_sheet_detail_short;
            } else {
                i = C38728bk4.item_formatted_flight_sheet_detail_long;
            }
            arrayList.add(new C2637G6(formattedFlightSheetDetail, i, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, null, null, 6, null);
    }

    /* renamed from: e */
    public final C3023H6 m101414e(String str, WarehouseVehicleDetails warehouseVehicleDetails) {
        int collectionSizeOrDefault;
        List mutableList;
        List<WarehouseVehicle> vehicles = warehouseVehicleDetails.getVehicles();
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(vehicles, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (WarehouseVehicle warehouseVehicle : vehicles) {
            arrayList.add(new C2637G6(warehouseVehicle, C36612Vj4.item_warehouse_flight_sheet_vehicle_detail, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, new C2637G6(new RefreshWarehouseButton(str, warehouseVehicleDetails.getTitle(), null, 4, null), C36612Vj4.item_warehouse_flight_sheet_vehicle_details_title, false, 4, null), null, 4, null);
    }
}
