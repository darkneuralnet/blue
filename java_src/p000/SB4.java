package p000;

import co.bird.android.model.BirdSummaryBody;
import co.bird.android.model.Issue;
import co.bird.android.model.MobilePartner;
import co.bird.android.model.RepairType;
import co.bird.android.model.RepairTypeLock;
import co.bird.android.model.WorkOrder;
import io.reactivex.AbstractC23442F;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JX\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nH&¨\u0006\u0012"}, m28432d2 = {"LSB4;", "", "Lco/bird/android/model/BirdSummaryBody;", "birdSummaryBody", "Lco/bird/android/model/MobilePartner;", "partner", "Lco/bird/android/model/WorkOrder;", "workOrder", "", "Lco/bird/android/model/Issue;", "", "Lco/bird/android/model/RepairType;", "issueRepairs", "Lco/bird/android/model/RepairTypeLock;", "repairs", "Lio/reactivex/F;", "LH6;", "f", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: SB4 */
/* loaded from: classes3.dex */
public interface SB4 {
    /* renamed from: f */
    AbstractC23442F<List<C3023H6>> mo81887f(BirdSummaryBody birdSummaryBody, MobilePartner mobilePartner, WorkOrder workOrder, Map<Issue, ? extends List<RepairType>> map, List<RepairTypeLock> list);
}
