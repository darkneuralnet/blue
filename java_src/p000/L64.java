package p000;

import android.widget.Button;
import co.bird.android.core.base.viewmodel.BillOfLadingReceived;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.H31;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\u000e\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\bJ\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\tJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"LL64;", "LxE;", "Lio/reactivex/Observable;", "", "g", "", "enable", "Rl", "", "", "Sl", "Tl", "LH6;", "sections", "b", "containerOrder", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "Ql", "Pl", "LS4;", "LS4;", "binding", "Lt64;", "c", "Lt64;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LS4;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: L64 */
/* loaded from: classes3.dex */
public final class L64 extends AbstractC30071xE {

    /* renamed from: b */
    public final C7321S4 f20757b;

    /* renamed from: c */
    public final C49044t64 f20758c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L64(BaseActivity activity, C7321S4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f20757b = binding;
        C49044t64 c49044t64 = new C49044t64();
        this.f20758c = c49044t64;
        binding.f33101d.setAdapter(c49044t64);
    }

    /* renamed from: Pl */
    public final AbstractC23442F<DialogResponse> m97770Pl() {
        return H31.C3014a.showBottomSheetAlert$default(this, BillOfLadingReceived.f63045h, null, 2, null);
    }

    /* renamed from: Ql */
    public final AbstractC23442F<DialogResponse> m97769Ql(String containerOrder) {
        Intrinsics.checkNotNullParameter(containerOrder, "containerOrder");
        C41358g86 m39977a = C41358g86.f81675c.m39977a(C45871nl4.process_container_complete_title, C45871nl4.process_container_complete_body, containerOrder);
        m39977a.show(getActivity().getSupportFragmentManager(), "TransferOrderBottomSheet");
        AbstractC23442F<DialogResponse> firstOrError = m39977a.m39978a5().firstOrError();
        Intrinsics.checkNotNullExpressionValue(firstOrError, "dialog.dismisses().firstOrError()");
        return firstOrError;
    }

    /* renamed from: Rl */
    public final void m97768Rl(boolean z) {
        this.f20757b.f33100c.setEnabled(z);
    }

    /* renamed from: Sl */
    public final Observable<List<String>> m97767Sl() {
        return this.f20758c.m13069D8();
    }

    /* renamed from: Tl */
    public final Observable<Unit> m97766Tl() {
        Button button = this.f20757b.f33100c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.processContainerOrderButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: b */
    public final void m97765b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f20758c.mo24871u(sections);
    }

    /* renamed from: g */
    public final Observable<Unit> m97764g() {
        return this.f20758c.m13068g();
    }
}
