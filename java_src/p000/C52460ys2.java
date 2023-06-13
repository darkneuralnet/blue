package p000;

import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.QCInspection;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u001c\u0010\u000e\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b0\bH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, m28432d2 = {"Lys2;", "LPC;", "Lxs2;", "", "LH6;", "sections", "", "b", "Lio/reactivex/Observable;", "i1", "I", "Lkotlin/Pair;", "Lco/bird/android/model/QCInspection;", "", "dk", "LX4;", "LX4;", "binding", "Lhs2;", "c", "Lhs2;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LX4;Lhs2;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ys2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52460ys2 extends AbstractC6295PC implements InterfaceC51867xs2 {

    /* renamed from: b */
    public final C9293X4 f120353b;

    /* renamed from: c */
    public final C42381hs2 f120354c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52460ys2(BaseActivity activity, C9293X4 binding, C42381hs2 adapter) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f120353b = binding;
        this.f120354c = adapter;
        binding.f42598c.setAdapter(adapter);
        binding.f42598c.setLayoutManager(new LinearLayoutManager(activity));
        binding.f42598c.setItemAnimator(new C11894g());
    }

    @Override // p000.InterfaceC51867xs2
    /* renamed from: I */
    public Observable<Unit> mo2358I() {
        return this.f120354c.m35690I();
    }

    @Override // p000.InterfaceC51867xs2
    /* renamed from: b */
    public void mo2357b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f120354c.mo24871u(sections);
    }

    @Override // p000.InterfaceC51867xs2
    /* renamed from: dk */
    public Observable<Pair<QCInspection, Boolean>> mo2356dk() {
        return this.f120354c.m35688w();
    }

    @Override // p000.InterfaceC51867xs2
    /* renamed from: i1 */
    public Observable<Unit> mo2355i1() {
        return this.f120354c.m35689v();
    }
}
