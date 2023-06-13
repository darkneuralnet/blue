package p000;

import android.widget.Button;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.HardCountStatus;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import co.bird.android.widget.BlockingEnterLocationView;
import co.bird.android.widget.OperatorInfoCard;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.UF1;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, m28432d2 = {"LVF1;", "LxE;", "LUF1;", "", "enable", "", "o8", "Lio/reactivex/Observable;", "p8", "ne", "", "expectedCount", "F4", "Lco/bird/android/model/HardCountStatus;", "hardCountStatus", "if", "LI3;", "b", "LI3;", "binding", "Lco/bird/android/widget/BlockingEnterLocationView;", "P9", "()Lco/bird/android/widget/BlockingEnterLocationView;", "blockingEnterLocationOverlay", "Lco/bird/android/widget/OperatorInfoCard;", "p1", "()Lco/bird/android/widget/OperatorInfoCard;", "operatorInfoCard", "Landroid/widget/Button;", "Ra", "()Landroid/widget/Button;", "settingsButton", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LI3;)V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: VF1 */
/* loaded from: classes3.dex */
public final class VF1 extends AbstractC30071xE implements UF1 {

    /* renamed from: b */
    public final C3318I3 f38782b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VF1(BaseActivity activity, C3318I3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f38782b = binding;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: D0 */
    public Observable<Unit> mo22210D0() {
        return UF1.C8245a.m81782a(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Df */
    public void mo22209Df(User user) {
        UF1.C8245a.m81780c(this, user);
    }

    @Override // p000.UF1
    /* renamed from: F4 */
    public void mo80168F4(int i) {
        this.f38782b.f14379e.setText(String.valueOf(i));
    }

    @Override // p000.InterfaceC36740Vx6
    /* renamed from: G9 */
    public Observable<DialogResponse> mo22207G9(Warehouse warehouse, Warehouse warehouse2) {
        return UF1.C8245a.m81774i(this, warehouse, warehouse2);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: I9 */
    public void mo22206I9(String str) {
        UF1.C8245a.m81777f(this, str);
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: P9 */
    public BlockingEnterLocationView mo22205P9() {
        BlockingEnterLocationView blockingEnterLocationView = this.f38782b.f14376b;
        Intrinsics.checkNotNullExpressionValue(blockingEnterLocationView, "binding.blockEnterLocationOverlay");
        return blockingEnterLocationView;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: Ra */
    public Button mo22204Ra() {
        return mo22205P9().m54752a();
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: S9 */
    public void mo22203S9(Warehouse warehouse) {
        UF1.C8245a.m81779d(this, warehouse);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Zd */
    public void mo22202Zd(boolean z) {
        UF1.C8245a.m81775h(this, z);
    }

    @Override // p000.UF1
    /* renamed from: if */
    public void mo80167if(HardCountStatus hardCountStatus) {
        Intrinsics.checkNotNullParameter(hardCountStatus, "hardCountStatus");
        this.f38782b.f14383i.setText(String.valueOf(hardCountStatus.getTotalSuccessScans() + hardCountStatus.getTotalFailedScans()));
    }

    @Override // p000.UF1
    /* renamed from: ne */
    public void mo80166ne() {
        new C45587nH1().show(getActivity().getSupportFragmentManager(), "HardCountSessionCheckerBottomSheet");
    }

    @Override // p000.UF1
    /* renamed from: o8 */
    public void mo80165o8(boolean z) {
        this.f38782b.f14378d.setEnabled(z);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: p1 */
    public OperatorInfoCard mo22200p1() {
        OperatorInfoCard operatorInfoCard = this.f38782b.f14381g;
        Intrinsics.checkNotNullExpressionValue(operatorInfoCard, "binding.operatorInfoCard");
        return operatorInfoCard;
    }

    @Override // p000.UF1
    /* renamed from: p8 */
    public Observable<Unit> mo80164p8() {
        Button button = this.f38782b.f14378d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.enterButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: rf */
    public void mo22199rf(boolean z) {
        UF1.C8245a.m81776g(this, z);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: v1 */
    public Observable<Unit> mo22198v1() {
        return UF1.C8245a.m81781b(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: z7 */
    public void mo22196z7(String str) {
        UF1.C8245a.m81778e(this, str);
    }
}
