package p000;

import android.view.View;
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
import p000.D92;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, m28432d2 = {"LE92;", "LxE;", "LD92;", "", "visible", "", "A9", "LZ3;", "b", "LZ3;", "binding", "Lco/bird/android/widget/BlockingEnterLocationView;", "c", "Lco/bird/android/widget/BlockingEnterLocationView;", "P9", "()Lco/bird/android/widget/BlockingEnterLocationView;", "blockingEnterLocationOverlay", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "Ra", "()Landroid/widget/Button;", "settingsButton", "Lco/bird/android/widget/OperatorInfoCard;", "e", "Lco/bird/android/widget/OperatorInfoCard;", "p1", "()Lco/bird/android/widget/OperatorInfoCard;", "operatorInfoCard", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LZ3;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: E92 */
/* loaded from: classes3.dex */
public final class E92 extends AbstractC30071xE implements D92 {

    /* renamed from: b */
    public final C10107Z3 f7025b;

    /* renamed from: c */
    public final BlockingEnterLocationView f7026c;

    /* renamed from: d */
    public final Button f7027d;

    /* renamed from: e */
    public final OperatorInfoCard f7028e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E92(BaseActivity activity, C10107Z3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f7025b = binding;
        BlockingEnterLocationView blockingEnterLocationView = binding.f47784b;
        Intrinsics.checkNotNullExpressionValue(blockingEnterLocationView, "binding.blockEnterLocationOverlay");
        this.f7026c = blockingEnterLocationView;
        this.f7027d = binding.f47784b.m54752a();
        OperatorInfoCard operatorInfoCard = binding.f47786d;
        Intrinsics.checkNotNullExpressionValue(operatorInfoCard, "binding.operatorInfoCard");
        this.f7028e = operatorInfoCard;
    }

    @Override // p000.D92
    /* renamed from: A9 */
    public void mo109341A9(boolean z) {
        View findViewById = getActivity().findViewById(C38115ai4.layoutRoot);
        Intrinsics.checkNotNullExpressionValue(findViewById, "activity.findViewById<ViewGroup>(R.id.layoutRoot)");
        C49520tu6.show$default(findViewById, z, 0, 2, null);
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: D0 */
    public Observable<Unit> mo22210D0() {
        return D92.C1401a.m110868a(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Df */
    public void mo22209Df(User user) {
        D92.C1401a.m110866c(this, user);
    }

    @Override // p000.InterfaceC36740Vx6
    /* renamed from: G9 */
    public Observable<DialogResponse> mo22207G9(Warehouse warehouse, Warehouse warehouse2) {
        return D92.C1401a.m110860i(this, warehouse, warehouse2);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: I9 */
    public void mo22206I9(String str) {
        D92.C1401a.m110863f(this, str);
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: P9 */
    public BlockingEnterLocationView mo22205P9() {
        return this.f7026c;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: Ra */
    public Button mo22204Ra() {
        return this.f7027d;
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: S9 */
    public void mo22203S9(Warehouse warehouse) {
        D92.C1401a.m110865d(this, warehouse);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Zd */
    public void mo22202Zd(boolean z) {
        D92.C1401a.m110861h(this, z);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: p1 */
    public OperatorInfoCard mo22200p1() {
        return this.f7028e;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: rf */
    public void mo22199rf(boolean z) {
        D92.C1401a.m110862g(this, z);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: v1 */
    public Observable<Unit> mo22198v1() {
        return D92.C1401a.m110867b(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: z7 */
    public void mo22196z7(String str) {
        D92.C1401a.m110864e(this, str);
    }
}
