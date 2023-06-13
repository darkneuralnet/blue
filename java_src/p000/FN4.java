package p000;

import android.graphics.Bitmap;
import co.bird.android.model.PhotoBannerViewModel;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0007\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0005H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\tH&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000fH&J\b\u0010\u0013\u001a\u00020\u0005H&¨\u0006\u0014"}, m28432d2 = {"LFN4;", "LS74;", "LaM5;", "Lco/bird/android/model/PhotoBannerViewModel;", "photoBannerViewModel", "", "ga", "onResume", "onPause", "Lio/reactivex/Observable;", "C1", "l1", "q8", "U5", "Lio/reactivex/F;", "Landroid/graphics/Bitmap;", "Z", Entry.TYPE_IMAGE, "j7", "nh", "retakeable-photo_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FN4 */
/* loaded from: classes4.dex */
public interface FN4 extends S74, InterfaceC37910aM5 {
    /* renamed from: C1 */
    Observable<Unit> mo105185C1();

    /* renamed from: U5 */
    Observable<Unit> mo105181U5();

    /* renamed from: Z */
    AbstractC23442F<Bitmap> mo105180Z();

    /* renamed from: ga */
    void mo105179ga(PhotoBannerViewModel photoBannerViewModel);

    /* renamed from: j7 */
    void mo105178j7(Bitmap bitmap);

    /* renamed from: l1 */
    Observable<Unit> mo105177l1();

    /* renamed from: nh */
    void mo105176nh();

    void onPause();

    void onResume();

    /* renamed from: q8 */
    Observable<Unit> mo105175q8();
}
