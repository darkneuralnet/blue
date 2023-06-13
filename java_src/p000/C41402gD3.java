package p000;

import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LgD3;", "LxE;", "LfD3;", "", "Lco/bird/android/model/wire/WireBird;", "birds", "", "setBirds", "Lio/reactivex/Observable;", "birdItemClicks", "LG4;", "b", "LG4;", "binding", "LXC3;", "c", "LXC3;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LG4;)V", "ownedbirds_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gD3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41402gD3 extends AbstractC30071xE implements InterfaceC40809fD3 {

    /* renamed from: b */
    public final C2624G4 f81781b;

    /* renamed from: c */
    public final XC3 f81782c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41402gD3(BaseActivity activity, C2624G4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f81781b = binding;
        XC3 xc3 = new XC3();
        this.f81782c = xc3;
        binding.f10860c.setLayoutManager(new LinearLayoutManager(activity));
        binding.f10860c.setItemAnimator(new C11894g());
        binding.f10860c.setAdapter(xc3);
    }

    @Override // p000.InterfaceC40809fD3
    public Observable<WireBird> birdItemClicks() {
        return this.f81782c.m77187o();
    }

    @Override // p000.InterfaceC40809fD3
    public void setBirds(List<WireBird> birds) {
        Intrinsics.checkNotNullParameter(birds, "birds");
        this.f81782c.m77186p(birds);
    }
}
