package p000;

import co.bird.android.feature.birdplus.view.BirdPlusBannerView;
import co.bird.android.model.persistence.BirdPlusView;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\t¨\u0006\r"}, m28432d2 = {"LlP;", "LkP;", "Lio/reactivex/Observable;", "", C17296a.f69688o, "Lco/bird/android/model/persistence/BirdPlusView;", "birdPlusView", "b", "Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;", "Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;", "birdPlusBannerView", "<init>", "(Lco/bird/android/feature/birdplus/view/BirdPlusBannerView;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lP */
/* loaded from: classes3.dex */
public final class C25692lP implements InterfaceC25154kP {

    /* renamed from: a */
    public final BirdPlusBannerView f96157a;

    public C25692lP(BirdPlusBannerView birdPlusBannerView) {
        Intrinsics.checkNotNullParameter(birdPlusBannerView, "birdPlusBannerView");
        this.f96157a = birdPlusBannerView;
    }

    @Override // p000.InterfaceC25154kP
    /* renamed from: a */
    public Observable<Unit> mo27334a() {
        return C44626lf5.clicksThrottle$default(this.f96157a, 0L, 1, null);
    }

    @Override // p000.InterfaceC25154kP
    /* renamed from: b */
    public void mo27333b(BirdPlusView birdPlusView) {
        Intrinsics.checkNotNullParameter(birdPlusView, "birdPlusView");
        C49520tu6.m11233r(this.f96157a);
        this.f96157a.m58679e(birdPlusView);
    }
}
