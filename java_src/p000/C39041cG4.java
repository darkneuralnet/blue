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
import p000.InterfaceC38448bG4;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, m28432d2 = {"LcG4;", "LxE;", "LbG4;", "Lio/reactivex/Observable;", "", "h", "n", "d0", "Lm5;", "b", "Lm5;", "binding", "Lco/bird/android/widget/BlockingEnterLocationView;", "c", "Lco/bird/android/widget/BlockingEnterLocationView;", "P9", "()Lco/bird/android/widget/BlockingEnterLocationView;", "blockingEnterLocationOverlay", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "Ra", "()Landroid/widget/Button;", "settingsButton", "Lco/bird/android/widget/OperatorInfoCard;", "e", "Lco/bird/android/widget/OperatorInfoCard;", "p1", "()Lco/bird/android/widget/OperatorInfoCard;", "operatorInfoCard", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lm5;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cG4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39041cG4 extends AbstractC30071xE implements InterfaceC38448bG4 {

    /* renamed from: b */
    public final C25907m5 f60345b;

    /* renamed from: c */
    public final BlockingEnterLocationView f60346c;

    /* renamed from: d */
    public final Button f60347d;

    /* renamed from: e */
    public final OperatorInfoCard f60348e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39041cG4(BaseActivity activity, C25907m5 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f60345b = binding;
        BlockingEnterLocationView blockingEnterLocationView = binding.f97302b;
        Intrinsics.checkNotNullExpressionValue(blockingEnterLocationView, "binding.blockEnterLocationOverlay");
        this.f60346c = blockingEnterLocationView;
        this.f60347d = binding.f97302b.m54752a();
        OperatorInfoCard operatorInfoCard = binding.f97306f;
        Intrinsics.checkNotNullExpressionValue(operatorInfoCard, "binding.operatorInfoCard");
        this.f60348e = operatorInfoCard;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: D0 */
    public Observable<Unit> mo22210D0() {
        return InterfaceC38448bG4.C12345a.m64744a(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Df */
    public void mo22209Df(User user) {
        InterfaceC38448bG4.C12345a.m64742c(this, user);
    }

    @Override // p000.InterfaceC36740Vx6
    /* renamed from: G9 */
    public Observable<DialogResponse> mo22207G9(Warehouse warehouse, Warehouse warehouse2) {
        return InterfaceC38448bG4.C12345a.m64736i(this, warehouse, warehouse2);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: I9 */
    public void mo22206I9(String str) {
        InterfaceC38448bG4.C12345a.m64739f(this, str);
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: P9 */
    public BlockingEnterLocationView mo22205P9() {
        return this.f60346c;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: Ra */
    public Button mo22204Ra() {
        return this.f60347d;
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: S9 */
    public void mo22203S9(Warehouse warehouse) {
        InterfaceC38448bG4.C12345a.m64741d(this, warehouse);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Zd */
    public void mo22202Zd(boolean z) {
        InterfaceC38448bG4.C12345a.m64737h(this, z);
    }

    @Override // p000.InterfaceC38448bG4
    /* renamed from: d0 */
    public Observable<Unit> mo61629d0() {
        Button button = this.f60345b.f97310j;
        Intrinsics.checkNotNullExpressionValue(button, "binding.useBluetoothButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC38448bG4
    /* renamed from: h */
    public Observable<Unit> mo61628h() {
        Button button = this.f60345b.f97308h;
        Intrinsics.checkNotNullExpressionValue(button, "binding.scanButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC38448bG4
    /* renamed from: n */
    public Observable<Unit> mo61627n() {
        Button button = this.f60345b.f97303c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.enterCodeButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: p1 */
    public OperatorInfoCard mo22200p1() {
        return this.f60348e;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: rf */
    public void mo22199rf(boolean z) {
        InterfaceC38448bG4.C12345a.m64738g(this, z);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: v1 */
    public Observable<Unit> mo22198v1() {
        return InterfaceC38448bG4.C12345a.m64743b(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: z7 */
    public void mo22196z7(String str) {
        InterfaceC38448bG4.C12345a.m64740e(this, str);
    }
}
