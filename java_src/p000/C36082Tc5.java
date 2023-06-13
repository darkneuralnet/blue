package p000;

import android.widget.Button;
import android.widget.Toast;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.constant.ServiceCenterRoute;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006 "}, m28432d2 = {"LTc5;", "LxE;", "LSc5;", "", "LH6;", "sections", "", "b", "Lio/reactivex/Observable;", "f", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/ServiceCenterRoute;", "r8", "", "enabled", "bd", "r", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroid/widget/Button;", "c", "Landroid/widget/Button;", "confirm", "Llc5;", DateTokenConverter.CONVERTER_KEY, "Llc5;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/Button;)V", "co.bird.android.feature.commandcenter"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Tc5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36082Tc5 extends AbstractC30071xE implements InterfaceC35848Sc5 {

    /* renamed from: b */
    public final RecyclerView f35782b;

    /* renamed from: c */
    public final Button f35783c;

    /* renamed from: d */
    public final C44596lc5 f35784d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36082Tc5(BaseActivity activity, RecyclerView recyclerView, Button confirm) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(confirm, "confirm");
        this.f35782b = recyclerView;
        this.f35783c = confirm;
        C44596lc5 c44596lc5 = new C44596lc5();
        this.f35784d = c44596lc5;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(c44596lc5);
    }

    @Override // p000.InterfaceC35848Sc5
    /* renamed from: b */
    public void mo83314b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f35784d.mo24871u(sections);
    }

    @Override // p000.InterfaceC35848Sc5
    /* renamed from: bd */
    public void mo83313bd(boolean z) {
        this.f35783c.setEnabled(z);
    }

    @Override // p000.InterfaceC35848Sc5
    /* renamed from: f */
    public Observable<Unit> mo83312f() {
        return C44626lf5.clicksThrottle$default(this.f35783c, 0L, 1, null);
    }

    @Override // p000.InterfaceC35848Sc5
    /* renamed from: r */
    public void mo83311r() {
        Toast toast = new Toast(getActivity());
        BaseActivity activity = getActivity();
        int i = C45268mk4.toast_operator;
        String string = getActivity().getString(C45871nl4.routing_on_rails_routing_confirmation);
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…ils_routing_confirmation)");
        C42514i56.m34478a(toast, activity, i, string).show();
    }

    @Override // p000.InterfaceC35848Sc5
    /* renamed from: r8 */
    public Observable<Optional<ServiceCenterRoute>> mo83310r8() {
        return this.f35784d.m27089v();
    }
}
