package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.InspectionFlow;
import co.bird.android.model.NonRepair;
import co.bird.android.model.NonRepairReason;
import co.bird.android.model.RepairFlow;
import co.bird.android.model.RepairFlowStatus;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH&J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&JJ\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H&J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0019"}, m28432d2 = {"Lrn6;", "", "", "vehicleId", "Lio/reactivex/F;", "Lco/bird/android/model/RepairFlowStatus;", C17296a.f69688o, "Lco/bird/android/model/InspectionFlow;", "c", "", "selectedCategories", "selectedIssues", "f", "Lco/bird/android/model/RepairFlow;", "b", "issueId", "selectedRepairs", "Lco/bird/android/model/NonRepair;", "selectedNonRepair", "Lco/bird/android/model/NonRepairReason;", "selectedNonRepairReason", "notes", "e", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rn6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC48265rn6 {
    /* renamed from: a */
    AbstractC23442F<RepairFlowStatus> mo13671a(String str);

    /* renamed from: b */
    AbstractC23442F<RepairFlow> mo13670b(String str);

    /* renamed from: c */
    AbstractC23442F<InspectionFlow> mo13669c(String str);

    /* renamed from: d */
    AbstractC23461c mo13668d(String str);

    /* renamed from: e */
    AbstractC23442F<RepairFlow> mo13667e(String str, String str2, List<String> list, NonRepair nonRepair, NonRepairReason nonRepairReason, String str3);

    /* renamed from: f */
    AbstractC23442F<InspectionFlow> mo13666f(String str, List<String> list, List<String> list2);
}
