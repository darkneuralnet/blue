package p000;

import co.bird.android.model.IssueCreateSource;
import com.facebook.share.internal.C17296a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0004¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/model/IssueCreateSource;", "", C17296a.f69688o, "", "Ljava/util/Set;", "DISPUTABLE_SOURCES", "workorders_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ia2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42794ia2 {

    /* renamed from: a */
    public static final Set<IssueCreateSource> f87487a;

    static {
        Set<IssueCreateSource> of;
        of = SetsKt__SetsKt.setOf((Object[]) new IssueCreateSource[]{IssueCreateSource.VEHICLE_FAULT_CODE, IssueCreateSource.RIDER_REPORT, IssueCreateSource.FIELD_CENTER});
        f87487a = of;
    }

    /* renamed from: a */
    public static final boolean m33794a(IssueCreateSource issueCreateSource) {
        boolean contains;
        contains = CollectionsKt___CollectionsKt.contains(f87487a, issueCreateSource);
        return contains;
    }
}
