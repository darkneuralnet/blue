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
import p000.InterfaceC45369mu5;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, m28432d2 = {"Lnu5;", "Lmu5;", "LxE;", "Lio/reactivex/Observable;", "", "w", "n", "v1", "E5", "La6;", "b", "La6;", "binding", "Lco/bird/android/widget/OperatorInfoCard;", "c", "Lco/bird/android/widget/OperatorInfoCard;", "p1", "()Lco/bird/android/widget/OperatorInfoCard;", "operatorInfoCard", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "Ra", "()Landroid/widget/Button;", "settingsButton", "Lco/bird/android/widget/BlockingEnterLocationView;", "e", "Lco/bird/android/widget/BlockingEnterLocationView;", "P9", "()Lco/bird/android/widget/BlockingEnterLocationView;", "blockingEnterLocationOverlay", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;La6;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nu5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45962nu5 extends AbstractC30071xE implements InterfaceC45369mu5 {

    /* renamed from: b */
    public final C10570a6 f101015b;

    /* renamed from: c */
    public final OperatorInfoCard f101016c;

    /* renamed from: d */
    public final Button f101017d;

    /* renamed from: e */
    public final BlockingEnterLocationView f101018e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45962nu5(BaseActivity activity, C10570a6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f101015b = binding;
        OperatorInfoCard operatorInfoCard = binding.f49825f;
        Intrinsics.checkNotNullExpressionValue(operatorInfoCard, "binding.operatorInfoCard");
        this.f101016c = operatorInfoCard;
        this.f101017d = binding.f49822c.m54752a();
        BlockingEnterLocationView blockingEnterLocationView = binding.f49822c;
        Intrinsics.checkNotNullExpressionValue(blockingEnterLocationView, "binding.blockEnterLocationOverlay");
        this.f101018e = blockingEnterLocationView;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: D0 */
    public Observable<Unit> mo22210D0() {
        return InterfaceC45369mu5.C26288a.m24728a(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Df */
    public void mo22209Df(User user) {
        InterfaceC45369mu5.C26288a.m24727b(this, user);
    }

    @Override // p000.InterfaceC45369mu5
    /* renamed from: E5 */
    public void mo22208E5() {
        Button button = this.f101015b.f49823d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.enterCodeButton");
        C49520tu6.show$default(button, false, 0, 2, null);
    }

    @Override // p000.InterfaceC36740Vx6
    /* renamed from: G9 */
    public Observable<DialogResponse> mo22207G9(Warehouse warehouse, Warehouse warehouse2) {
        return InterfaceC45369mu5.C26288a.m24721h(this, warehouse, warehouse2);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: I9 */
    public void mo22206I9(String str) {
        InterfaceC45369mu5.C26288a.m24724e(this, str);
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: P9 */
    public BlockingEnterLocationView mo22205P9() {
        return this.f101018e;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: Ra */
    public Button mo22204Ra() {
        return this.f101017d;
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: S9 */
    public void mo22203S9(Warehouse warehouse) {
        InterfaceC45369mu5.C26288a.m24726c(this, warehouse);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Zd */
    public void mo22202Zd(boolean z) {
        InterfaceC45369mu5.C26288a.m24722g(this, z);
    }

    @Override // p000.InterfaceC45369mu5
    /* renamed from: n */
    public Observable<Unit> mo22201n() {
        Button button = this.f101015b.f49823d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.enterCodeButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: p1 */
    public OperatorInfoCard mo22200p1() {
        return this.f101016c;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: rf */
    public void mo22199rf(boolean z) {
        InterfaceC45369mu5.C26288a.m24723f(this, z);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: v1 */
    public Observable<Unit> mo22198v1() {
        OperatorInfoCard operatorInfoCard = this.f101015b.f49825f;
        Intrinsics.checkNotNullExpressionValue(operatorInfoCard, "binding.operatorInfoCard");
        return C44626lf5.clicksThrottle$default(operatorInfoCard, 0L, 1, null);
    }

    @Override // p000.InterfaceC45369mu5
    /* renamed from: w */
    public Observable<Unit> mo22197w() {
        Button button = this.f101015b.f49828i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.scanButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: z7 */
    public void mo22196z7(String str) {
        InterfaceC45369mu5.C26288a.m24725d(this, str);
    }
}
