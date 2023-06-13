package p000;

import android.net.Uri;
import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.ScrapRequestReason;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\bH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\bH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, m28432d2 = {"LJp5;", "LxE;", "LIp5;", "", "LH6;", "sections", "", "b", "Lio/reactivex/Observable;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/ScrapRequestReason;", "s", "g", "Landroid/net/Uri;", "wd", "", "l7", "c", "", "enabled", "p", "K", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/Button;", "Landroid/widget/Button;", "submit", "Lan5;", DateTokenConverter.CONVERTER_KEY, "Lan5;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;Lan5;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Jp5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33859Jp5 extends AbstractC30071xE implements InterfaceC33625Ip5 {

    /* renamed from: b */
    public final RecyclerView f18298b;

    /* renamed from: c */
    public final Button f18299c;

    /* renamed from: d */
    public final C38166an5 f18300d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33859Jp5(BaseActivity activity, RecyclerView recyclerView, Button submit, C38166an5 adapter) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(submit, "submit");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f18298b = recyclerView;
        this.f18299c = submit;
        this.f18300d = adapter;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(adapter);
    }

    @Override // p000.InterfaceC33625Ip5
    /* renamed from: K */
    public Observable<Unit> mo99655K() {
        C50634vn5 c50634vn5 = new C50634vn5();
        c50634vn5.show(getActivity().getSupportFragmentManager(), "ScrapInspectionCompleteBottomSheetDialog");
        return c50634vn5.m8031a5();
    }

    @Override // p000.InterfaceC33625Ip5
    /* renamed from: b */
    public void mo99654b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f18300d.mo24871u(sections);
    }

    @Override // p000.InterfaceC33625Ip5
    /* renamed from: c */
    public Observable<Unit> mo99653c() {
        return C44626lf5.clicksThrottle$default(this.f18299c, 0L, 1, null);
    }

    @Override // p000.InterfaceC33625Ip5
    /* renamed from: g */
    public Observable<Unit> mo99652g() {
        return this.f18300d.m70735g();
    }

    @Override // p000.InterfaceC33625Ip5
    /* renamed from: l7 */
    public Observable<Optional<CharSequence>> mo99651l7() {
        return this.f18300d.m70733v();
    }

    @Override // p000.InterfaceC33625Ip5
    /* renamed from: p */
    public void mo99650p(boolean z) {
        this.f18299c.setEnabled(z);
    }

    @Override // p000.InterfaceC33625Ip5
    /* renamed from: s */
    public Observable<Optional<ScrapRequestReason>> mo99649s() {
        return this.f18300d.m70734s();
    }

    @Override // p000.InterfaceC33625Ip5
    /* renamed from: wd */
    public Observable<List<Uri>> mo99648wd() {
        return this.f18300d.m70732w();
    }
}
