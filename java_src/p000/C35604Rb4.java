package p000;

import android.widget.Button;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import co.bird.android.widget.BlockingEnterLocationView;
import co.bird.android.widget.OperatorInfoCard;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC35370Qb4;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, m28432d2 = {"LRb4;", "LxE;", "LQb4;", "Lio/reactivex/Observable;", "", "h", "n", "G", "LW4;", "b", "LW4;", "binding", "Lco/bird/android/widget/OperatorInfoCard;", "c", "Lco/bird/android/widget/OperatorInfoCard;", "p1", "()Lco/bird/android/widget/OperatorInfoCard;", "operatorInfoCard", "Lco/bird/android/widget/BlockingEnterLocationView;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/widget/BlockingEnterLocationView;", "P9", "()Lco/bird/android/widget/BlockingEnterLocationView;", "blockingEnterLocationOverlay", "Landroid/widget/Button;", "e", "Landroid/widget/Button;", "Ra", "()Landroid/widget/Button;", "settingsButton", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LW4;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Rb4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35604Rb4 extends AbstractC30071xE implements InterfaceC35370Qb4 {

    /* renamed from: b */
    public final C8929W4 f32269b;

    /* renamed from: c */
    public final OperatorInfoCard f32270c;

    /* renamed from: d */
    public final BlockingEnterLocationView f32271d;

    /* renamed from: e */
    public final Button f32272e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35604Rb4(BaseActivity activity, C8929W4 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f32269b = binding;
        OperatorInfoCard operatorInfoCard = binding.f40364f;
        Intrinsics.checkNotNullExpressionValue(operatorInfoCard, "binding.operatorInfoCard");
        this.f32270c = operatorInfoCard;
        BlockingEnterLocationView blockingEnterLocationView = binding.f40360b;
        Intrinsics.checkNotNullExpressionValue(blockingEnterLocationView, "binding.blockEnterLocationOverlay");
        this.f32271d = blockingEnterLocationView;
        this.f32272e = binding.f40360b.m54752a();
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: D0 */
    public Observable<Unit> mo22210D0() {
        return InterfaceC35370Qb4.C6808a.m88378a(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Df */
    public void mo22209Df(User user) {
        InterfaceC35370Qb4.C6808a.m88376c(this, user);
    }

    @Override // p000.InterfaceC35370Qb4
    /* renamed from: G */
    public Observable<Unit> mo86573G() {
        Button button = this.f32269b.f40367i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.useBluetoothButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC36740Vx6
    /* renamed from: G9 */
    public Observable<DialogResponse> mo22207G9(Warehouse warehouse, Warehouse warehouse2) {
        return InterfaceC35370Qb4.C6808a.m88370i(this, warehouse, warehouse2);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: I9 */
    public void mo22206I9(String str) {
        InterfaceC35370Qb4.C6808a.m88373f(this, str);
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: P9 */
    public BlockingEnterLocationView mo22205P9() {
        return this.f32271d;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: Ra */
    public Button mo22204Ra() {
        return this.f32272e;
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: S9 */
    public void mo22203S9(Warehouse warehouse) {
        InterfaceC35370Qb4.C6808a.m88375d(this, warehouse);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Zd */
    public void mo22202Zd(boolean z) {
        InterfaceC35370Qb4.C6808a.m88371h(this, z);
    }

    @Override // p000.InterfaceC35370Qb4
    /* renamed from: h */
    public Observable<Unit> mo86572h() {
        Button button = this.f32269b.f40365g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.scanButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC35370Qb4
    /* renamed from: n */
    public Observable<Unit> mo86571n() {
        Button button = this.f32269b.f40361c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.enterCodeButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: p1 */
    public OperatorInfoCard mo22200p1() {
        return this.f32270c;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: rf */
    public void mo22199rf(boolean z) {
        InterfaceC35370Qb4.C6808a.m88372g(this, z);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: v1 */
    public Observable<Unit> mo22198v1() {
        return InterfaceC35370Qb4.C6808a.m88377b(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: z7 */
    public void mo22196z7(String str) {
        InterfaceC35370Qb4.C6808a.m88374e(this, str);
    }
}
