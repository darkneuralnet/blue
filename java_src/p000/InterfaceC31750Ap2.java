package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IssueTypeLock;
import co.bird.android.model.WorkOrder;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J\u0016\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0016\u0010\u000f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¨\u0006\u0010"}, m28432d2 = {"LAp2;", "LDE;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/WorkOrder;", "workOrder", "", "returnAddedIssues", "recordInspectionEvent", "", "b", "", "Lco/bird/android/model/IssueTypeLock;", "issues", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ap2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC31750Ap2 extends InterfaceC1433DE {
    /* renamed from: a */
    void mo76285a(List<IssueTypeLock> list);

    /* renamed from: b */
    void mo76283b(WireBird wireBird, WorkOrder workOrder, boolean z, boolean z2);

    /* renamed from: d */
    void mo76281d(List<IssueTypeLock> list);
}
