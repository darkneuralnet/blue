package p000;

import co.bird.android.model.OperatorNotification;
import co.bird.android.model.persistence.Notification;
import co.bird.android.model.persistence.OperatorNotificationCategory;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\nH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\nH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060\n2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"LEa3;", "LDa3;", "Lio/reactivex/c;", "b", "", "fetchLatest", "", "", "categories", "P", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "g0", "Lco/bird/android/model/OperatorNotification;", "w", "id", "Lco/bird/android/model/persistence/Notification;", "l", "groupId", "Lco/bird/android/model/OperatorNotification$Notification;", "j0", "Leb3;", C17296a.f69688o, "Leb3;", "repo", "<init>", "(Leb3;)V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ea3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32552Ea3 implements InterfaceC32318Da3 {

    /* renamed from: a */
    public final InterfaceC40433eb3 f7718a;

    public C32552Ea3(InterfaceC40433eb3 repo) {
        Intrinsics.checkNotNullParameter(repo, "repo");
        this.f7718a = repo;
    }

    @Override // p000.InterfaceC32318Da3
    /* renamed from: P */
    public AbstractC23461c mo108781P(boolean z, List<String> list) {
        AbstractC23461c m33063X = this.f7718a.mo25365P(z, list).m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "repo.fetchOperatorNotifi…scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC32318Da3
    /* renamed from: b */
    public AbstractC23461c mo108780b() {
        AbstractC23461c m33063X = this.f7718a.mo25355b().m33063X(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33063X, "repo.fetchCategories()\n …scribeOn(Schedulers.io())");
        return m33063X;
    }

    @Override // p000.InterfaceC32318Da3
    /* renamed from: g0 */
    public Observable<List<OperatorNotificationCategory>> mo108779g0() {
        Observable<List<OperatorNotificationCategory>> subscribeOn = this.f7718a.mo25354g0().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamCategories()\n…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC32318Da3
    /* renamed from: j0 */
    public Observable<List<OperatorNotification.Notification>> mo108778j0(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Observable<List<OperatorNotification.Notification>> subscribeOn = this.f7718a.mo25353j0(groupId).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamOperatorNotif…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC32318Da3
    /* renamed from: l */
    public Observable<Notification> mo108777l(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Observable<Notification> subscribeOn = this.f7718a.mo25352l(id).subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamOperatorNotif…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    @Override // p000.InterfaceC32318Da3
    /* renamed from: w */
    public Observable<List<OperatorNotification>> mo108776w() {
        Observable<List<OperatorNotification>> subscribeOn = this.f7718a.mo25351w().subscribeOn(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(subscribeOn, "repo.streamOperatorNotif…scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
