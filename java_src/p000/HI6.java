package p000;

import androidx.recyclerview.widget.C11905h;
import co.bird.android.model.persistence.nestedstructures.ZoneDetail;
import co.bird.android.model.persistence.nestedstructures.ZoneDetails;
import co.bird.android.model.persistence.nestedstructures.ZoneStatus;
import co.bird.android.model.persistence.nestedstructures.ZoneSummary;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC2152F6;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"LHI6;", "LF6;", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "<init>", "()V", "zone-flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nZoneFlightSheetAdapterDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZoneFlightSheetAdapterDiff.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapterDiff\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,42:1\n18#2:43\n18#2:48\n18#2:53\n18#2:58\n18#2:63\n9#3,4:44\n9#3,4:49\n9#3,4:54\n9#3,4:59\n9#3,4:64\n*S KotlinDebug\n*F\n+ 1 ZoneFlightSheetAdapterDiff.kt\nco/bird/android/feature/zoneflightsheet/adapters/ZoneFlightSheetAdapterDiff\n*L\n17#1:43\n18#1:48\n26#1:53\n31#1:58\n35#1:63\n17#1:44,4\n18#1:49,4\n26#1:54,4\n31#1:59,4\n35#1:64,4\n*E\n"})
/* renamed from: HI6 */
/* loaded from: classes3.dex */
public final class HI6 implements InterfaceC2152F6 {
    @Override // p000.InterfaceC2152F6
    /* renamed from: a */
    public C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2) {
        return InterfaceC2152F6.C2153a.m107745a(this, list, list2);
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: b */
    public String mo29b(C2637G6 adapterItem) {
        String title;
        String title2;
        Intrinsics.checkNotNullParameter(adapterItem, "adapterItem");
        int m105817b = adapterItem.m105817b();
        if (m105817b == C37314Yj4.item_zone_flight_sheet_summary) {
            return "summary";
        }
        if (m105817b == C37314Yj4.item_zone_flight_sheet_status) {
            return "status";
        }
        ZoneDetails zoneDetails = null;
        if (m105817b == C37314Yj4.item_zone_flight_sheet_details_title) {
            Object m105816c = adapterItem.m105816c();
            if (m105816c instanceof ZoneDetails) {
                zoneDetails = m105816c;
            }
            ZoneDetails zoneDetails2 = zoneDetails;
            if (zoneDetails2 != null && (title2 = zoneDetails2.getTitle()) != null) {
                return title2;
            }
        } else if (m105817b == C37314Yj4.item_zone_flight_sheet_detail) {
            Object m105816c2 = adapterItem.m105816c();
            if (m105816c2 instanceof ZoneDetail) {
                zoneDetails = m105816c2;
            }
            ZoneDetail zoneDetail = zoneDetails;
            if (zoneDetail != null && (title = zoneDetail.getTitle()) != null) {
                return title;
            }
        }
        return "";
    }

    @Override // p000.InterfaceC2152F6
    /* renamed from: c */
    public boolean mo28c(C2637G6 oldItem, C2637G6 newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        Object m105816c = oldItem.m105816c();
        String str = null;
        if (m105816c instanceof ZoneSummary) {
            Object m105816c2 = newItem.m105816c();
            if (!(m105816c2 instanceof ZoneSummary)) {
                m105816c2 = null;
            }
            ZoneSummary zoneSummary = (ZoneSummary) m105816c2;
            String title = ((ZoneSummary) m105816c).getTitle();
            if (zoneSummary != null) {
                str = zoneSummary.getTitle();
            }
            if (Intrinsics.areEqual(title, str)) {
                return false;
            }
        } else if (!(m105816c instanceof ZoneStatus)) {
            if (m105816c instanceof ZoneDetails) {
                Object m105816c3 = newItem.m105816c();
                if (m105816c3 instanceof ZoneDetails) {
                    str = m105816c3;
                }
                if (Intrinsics.areEqual(m105816c, (ZoneDetails) str)) {
                    return false;
                }
            } else if (!(m105816c instanceof ZoneDetail)) {
                return false;
            } else {
                Object m105816c4 = newItem.m105816c();
                if (m105816c4 instanceof ZoneDetail) {
                    str = m105816c4;
                }
                if (Intrinsics.areEqual(m105816c, (ZoneDetail) str)) {
                    return false;
                }
            }
        }
        return true;
    }
}
