package p000;

import co.bird.android.model.persistence.ZoneAssignmentGroup;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Lju4;", "Liu4;", "Lio/reactivex/c;", "o0", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/ZoneAssignmentGroup;", "z0", "", "id", "A0", "LAu4;", C17296a.f69688o, "LAu4;", "repo", "<init>", "(LAu4;)V", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ju4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43589ju4 implements InterfaceC42996iu4 {

    /* renamed from: a */
    public final InterfaceC31797Au4 f93518a;

    public C43589ju4(InterfaceC31797Au4 repo) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f93518a = repo;
    }

    @Override // p000.InterfaceC42996iu4
    /* renamed from: A0 */
    public AbstractC23461c mo29772A0(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        AbstractC23461c m33063X = this.f93518a.mo111369Q0(id).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "repo.cancelCappedZoneRes…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC42996iu4
    /* renamed from: o0 */
    public AbstractC23461c mo29771o0() {
        AbstractC23461c m33063X = this.f93518a.mo111368o0().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "repo.fetchZoneAssignment…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC42996iu4
    /* renamed from: z0 */
    public Observable<List<ZoneAssignmentGroup>> mo29770z0() {
        Observable<List<ZoneAssignmentGroup>> subscribeOn = this.f93518a.mo111367z0().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamZoneAssignmen…scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
