package p000;

import co.bird.android.widget.CallToActionBanner;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006¨\u0006\n"}, m28432d2 = {"Lyh3;", "Lxh3;", "Lio/reactivex/Observable;", "", C17296a.f69688o, "Lco/bird/android/widget/CallToActionBanner;", "Lco/bird/android/widget/CallToActionBanner;", "banner", "<init>", "(Lco/bird/android/widget/CallToActionBanner;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: yh3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C52351yh3 implements InterfaceC51758xh3 {

    /* renamed from: a */
    public final CallToActionBanner f120018a;

    public C52351yh3(CallToActionBanner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.f120018a = banner;
    }

    @Override // p000.InterfaceC51758xh3
    /* renamed from: a */
    public Observable<Unit> mo2897a() {
        return C44626lf5.clicksThrottle$default(this.f120018a, 0L, 1, null);
    }
}
