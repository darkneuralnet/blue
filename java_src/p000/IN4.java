package p000;

import android.net.Uri;
import co.bird.android.widget.RetakeablePhotoView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\u0010"}, m28432d2 = {"LIN4;", "LHN4;", "Lio/reactivex/Observable;", "", C17296a.f69688o, "", "show", "b", "Landroid/net/Uri;", "uri", "c", "Lco/bird/android/widget/RetakeablePhotoView;", "Lco/bird/android/widget/RetakeablePhotoView;", "retakeablePhotoView", "<init>", "(Lco/bird/android/widget/RetakeablePhotoView;)V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: IN4 */
/* loaded from: classes3.dex */
public final class IN4 implements HN4 {

    /* renamed from: a */
    public final RetakeablePhotoView f15417a;

    public IN4(RetakeablePhotoView retakeablePhotoView) {
        Intrinsics.checkNotNullParameter(retakeablePhotoView, "retakeablePhotoView");
        this.f15417a = retakeablePhotoView;
    }

    @Override // p000.HN4
    /* renamed from: a */
    public Observable<Unit> mo102444a() {
        return C44626lf5.clicksThrottle$default(this.f15417a, 0L, 1, null);
    }

    @Override // p000.HN4
    /* renamed from: b */
    public void mo102443b(boolean z) {
        C49520tu6.show$default(this.f15417a, z, 0, 2, null);
    }

    @Override // p000.HN4
    /* renamed from: c */
    public void mo102442c(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f15417a.setImage(uri);
    }
}
