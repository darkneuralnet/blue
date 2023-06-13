package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.persistence.Announcement;
import co.bird.android.model.persistence.FeatureAnnouncementDialogResponse;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0096\u0001J\t\u0010\u0006\u001a\u00020\u0004H\u0096\u0001J+\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0001J\u0011\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¨\u0006\u0019"}, m28432d2 = {"LI60;", "LmA;", "Lxk1;", "Lio/reactivex/Observable;", "", "W4", "l9", "Lco/bird/android/model/constant/AnnouncementContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/model/persistence/Announcement;", "announcement", "", "startingBirdCode", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;", "nj", "Lio/reactivex/c;", "ia", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lf3;", "binding", "Lyk1;", "announcementModalUiDelegate", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lf3;Lyk1;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: I60 */
/* loaded from: classes3.dex */
public final class I60 extends C25922mA implements InterfaceC51786xk1 {

    /* renamed from: d */
    public final /* synthetic */ C52379yk1 f14523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I60(BaseActivity activity, C20179f3 binding, C52379yk1 announcementModalUiDelegate) {
        super(activity, binding);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(announcementModalUiDelegate, "announcementModalUiDelegate");
        this.f14523d = announcementModalUiDelegate;
    }

    @Override // p000.InterfaceC51786xk1
    /* renamed from: W4 */
    public Observable<Unit> mo4759W4() {
        return this.f14523d.mo4759W4();
    }

    @Override // p000.InterfaceC51786xk1
    /* renamed from: ia */
    public AbstractC23461c mo4758ia(Announcement announcement) {
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        return this.f14523d.mo4758ia(announcement);
    }

    @Override // p000.InterfaceC51786xk1
    /* renamed from: l9 */
    public void mo4757l9() {
        this.f14523d.mo4757l9();
    }

    @Override // p000.InterfaceC51786xk1
    /* renamed from: nj */
    public Observable<FeatureAnnouncementDialogResponse> mo4756nj(AnnouncementContext context, Announcement announcement, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        return this.f14523d.mo4756nj(context, announcement, str);
    }
}
