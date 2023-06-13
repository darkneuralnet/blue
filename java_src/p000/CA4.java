package p000;

import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.Issue;
import co.bird.android.model.LegacyRepair;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.C53094zw3;
import p000.H31;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B5\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\b\b\u0001\u0010$\u001a\u00020!\u0012\b\b\u0001\u0010&\u001a\u00020!¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0017H\u0016R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#¨\u0006+"}, m28432d2 = {"LCA4;", "LxE;", "LBA4;", "", "enabled", "", "ja", "", "LH6;", "sections", "b", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "Si", "Lco/bird/android/model/Issue;", "issues", "Lco/bird/android/model/LegacyRepair;", "repairs", "Lio/reactivex/Observable;", "Y9", "I8", "i2", "ze", "", "repairCount", "o0", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "LKz4;", "c", "LKz4;", "adapter", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "completeRepairs", "e", "addMoreRepairs", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroidx/recyclerview/widget/RecyclerView;LKz4;Landroid/widget/Button;Landroid/widget/Button;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: CA4 */
/* loaded from: classes3.dex */
public final class CA4 extends AbstractC30071xE implements BA4 {

    /* renamed from: b */
    public final RecyclerView f3547b;

    /* renamed from: c */
    public final C34182Kz4 f3548c;

    /* renamed from: d */
    public final Button f3549d;

    /* renamed from: e */
    public final Button f3550e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CA4(BaseActivity activity, RecyclerView recyclerView, C34182Kz4 adapter, Button completeRepairs, Button addMoreRepairs) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(completeRepairs, "completeRepairs");
        Intrinsics.checkNotNullParameter(addMoreRepairs, "addMoreRepairs");
        this.f3547b = recyclerView;
        this.f3548c = adapter;
        this.f3549d = completeRepairs;
        this.f3550e = addMoreRepairs;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setAdapter(adapter);
    }

    @Override // p000.BA4
    /* renamed from: I8 */
    public Observable<Unit> mo112676I8() {
        return C44626lf5.clicksThrottle$default(this.f3549d, 0L, 1, null);
    }

    @Override // p000.BA4
    /* renamed from: Si */
    public AbstractC23442F<DialogResponse> mo112675Si() {
        return H31.C3014a.dialog$default(this, C45268mk4.dialog_custom_cta, Integer.valueOf(C52955zi4.primaryButton), Integer.valueOf(C52955zi4.secondaryButton), null, Integer.valueOf(C52955zi4.title), Integer.valueOf(C52955zi4.body), getString(C45871nl4.operator_dialog_update_inventory_confirm, new Object[0]), getString(C45871nl4.general_not_now, new Object[0]), null, getString(C45871nl4.operator_dialog_update_inventory_title, new Object[0]), getString(C45871nl4.operator_dialog_update_inventory_body, new Object[0]), false, true, false, null, 26888, null);
    }

    @Override // p000.BA4
    /* renamed from: Y9 */
    public Observable<DialogResponse> mo112674Y9(List<Issue> issues, List<LegacyRepair> repairs) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(repairs, "repairs");
        CD4 m112609a = CD4.f3626d.m112609a(issues, repairs);
        m112609a.show(getActivity().getSupportFragmentManager(), "RepairSummaryBottomSheet");
        return m112609a.m112610a5();
    }

    @Override // p000.BA4
    /* renamed from: b */
    public void mo112673b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f3548c.mo24871u(sections);
    }

    @Override // p000.BA4
    /* renamed from: i2 */
    public Observable<Unit> mo112672i2() {
        return C44626lf5.clicksThrottle$default(this.f3550e, 0L, 1, null);
    }

    @Override // p000.BA4
    /* renamed from: ja */
    public void mo112671ja(boolean z) {
        this.f3549d.setEnabled(z);
    }

    @Override // p000.BA4
    /* renamed from: o0 */
    public void mo112670o0(int i) {
        C53094zw3.C31593a c31593a = C53094zw3.f122502a;
        BaseActivity activity = getActivity();
        String string = getActivity().getString(C45871nl4.repair_logged_toast, Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.repai…ogged_toast, repairCount)");
        C53094zw3.C31593a.makeText$default(c31593a, activity, string, 0, 48, null, 16, null).show();
    }

    @Override // p000.BA4
    /* renamed from: ze */
    public Observable<Issue> mo112669ze() {
        return this.f3548c.m98000v();
    }
}
