package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.persistence.Announcement;
import co.bird.android.model.persistence.FeatureAnnouncementDialogResponse;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, m28432d2 = {"Lxk1;", "", "Lio/reactivex/Observable;", "", "W4", "Lco/bird/android/model/persistence/Announcement;", "announcement", "Lio/reactivex/c;", "ia", "Lco/bird/android/model/constant/AnnouncementContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "startingBirdCode", "Lco/bird/android/model/persistence/FeatureAnnouncementDialogResponse;", "nj", "l9", "announcement_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: xk1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC51786xk1 {
    /* renamed from: W4 */
    Observable<Unit> mo4759W4();

    /* renamed from: ia */
    AbstractC23461c mo4758ia(Announcement announcement);

    /* renamed from: l9 */
    void mo4757l9();

    /* renamed from: nj */
    Observable<FeatureAnnouncementDialogResponse> mo4756nj(AnnouncementContext announcementContext, Announcement announcement, String str);
}
