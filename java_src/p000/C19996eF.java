package p000;

import android.widget.Button;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import co.bird.android.widget.BlockingEnterLocationView;
import co.bird.android.widget.OperatorInfoCard;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC19703dF;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, m28432d2 = {"LeF;", "LxE;", "LdF;", "", "enabled", "", "xf", "B9", "Lio/reactivex/k;", "Tf", "yi", "LX2;", "b", "LX2;", "binding", "Lco/bird/android/widget/OperatorInfoCard;", "c", "Lco/bird/android/widget/OperatorInfoCard;", "p1", "()Lco/bird/android/widget/OperatorInfoCard;", "operatorInfoCard", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "Ra", "()Landroid/widget/Button;", "settingsButton", "Lco/bird/android/widget/BlockingEnterLocationView;", "e", "Lco/bird/android/widget/BlockingEnterLocationView;", "P9", "()Lco/bird/android/widget/BlockingEnterLocationView;", "blockingEnterLocationOverlay", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LX2;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eF */
/* loaded from: classes3.dex */
public final class C19996eF extends AbstractC30071xE implements InterfaceC19703dF {

    /* renamed from: b */
    public final C9285X2 f78157b;

    /* renamed from: c */
    public final OperatorInfoCard f78158c;

    /* renamed from: d */
    public final Button f78159d;

    /* renamed from: e */
    public final BlockingEnterLocationView f78160e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19996eF(BaseActivity activity, C9285X2 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f78157b = binding;
        OperatorInfoCard operatorInfoCard = binding.f42548g;
        Intrinsics.checkNotNullExpressionValue(operatorInfoCard, "binding.operatorInfoCard");
        this.f78158c = operatorInfoCard;
        this.f78159d = binding.f42546e.m54752a();
        BlockingEnterLocationView blockingEnterLocationView = binding.f42546e;
        Intrinsics.checkNotNullExpressionValue(blockingEnterLocationView, "binding.blockEnterLocationOverlay");
        this.f78160e = blockingEnterLocationView;
    }

    @Override // p000.InterfaceC19703dF
    /* renamed from: B9 */
    public void mo43080B9(boolean z) {
        Button button = this.f78157b.f42549h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.searchAllBatchesButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: D0 */
    public Observable<Unit> mo22210D0() {
        return InterfaceC19703dF.C19704a.m44496a(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Df */
    public void mo22209Df(User user) {
        InterfaceC19703dF.C19704a.m44494c(this, user);
    }

    @Override // p000.InterfaceC36740Vx6
    /* renamed from: G9 */
    public Observable<DialogResponse> mo22207G9(Warehouse warehouse, Warehouse warehouse2) {
        return InterfaceC19703dF.C19704a.m44488i(this, warehouse, warehouse2);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: I9 */
    public void mo22206I9(String str) {
        InterfaceC19703dF.C19704a.m44491f(this, str);
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: P9 */
    public BlockingEnterLocationView mo22205P9() {
        return this.f78160e;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: Ra */
    public Button mo22204Ra() {
        return this.f78159d;
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: S9 */
    public void mo22203S9(Warehouse warehouse) {
        InterfaceC19703dF.C19704a.m44493d(this, warehouse);
    }

    @Override // p000.InterfaceC19703dF
    /* renamed from: Tf */
    public AbstractC24490k<Unit> mo43079Tf() {
        Button button = this.f78157b.f42543b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.addToBatchButton");
        AbstractC24490k<Unit> m32108t0 = C44626lf5.clicksThrottle$default(button, 0L, 1, null).toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "binding.addToBatchButton…s.mainThread(), false, 1)");
        return m32108t0;
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Zd */
    public void mo22202Zd(boolean z) {
        InterfaceC19703dF.C19704a.m44489h(this, z);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: p1 */
    public OperatorInfoCard mo22200p1() {
        return this.f78158c;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: rf */
    public void mo22199rf(boolean z) {
        InterfaceC19703dF.C19704a.m44490g(this, z);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: v1 */
    public Observable<Unit> mo22198v1() {
        return InterfaceC19703dF.C19704a.m44495b(this);
    }

    @Override // p000.InterfaceC19703dF
    /* renamed from: xf */
    public void mo43078xf(boolean z) {
        Button button = this.f78157b.f42543b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.addToBatchButton");
        C49520tu6.show$default(button, z, 0, 2, null);
    }

    @Override // p000.InterfaceC19703dF
    /* renamed from: yi */
    public AbstractC24490k<Unit> mo43077yi() {
        Button button = this.f78157b.f42549h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.searchAllBatchesButton");
        AbstractC24490k<Unit> m32108t0 = C44626lf5.clicksThrottle$default(button, 0L, 1, null).toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "binding.searchAllBatches…s.mainThread(), false, 1)");
        return m32108t0;
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: z7 */
    public void mo22196z7(String str) {
        InterfaceC19703dF.C19704a.m44492e(this, str);
    }
}
