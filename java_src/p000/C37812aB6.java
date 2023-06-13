package p000;

import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import p000.ZA6;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, m28432d2 = {"LaB6;", "LxE;", "LZA6;", "Lio/reactivex/k;", "", "o1", "Ei", "", "show", "", "hiddenState", "showProgress", "Lw6;", "b", "Lw6;", "binding", "Lco/bird/android/widget/OperatorInfoCard;", "c", "Lco/bird/android/widget/OperatorInfoCard;", "p1", "()Lco/bird/android/widget/OperatorInfoCard;", "operatorInfoCard", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "Ra", "()Landroid/widget/Button;", "settingsButton", "Lco/bird/android/widget/BlockingEnterLocationView;", "e", "Lco/bird/android/widget/BlockingEnterLocationView;", "P9", "()Lco/bird/android/widget/BlockingEnterLocationView;", "blockingEnterLocationOverlay", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lw6;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aB6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37812aB6 extends AbstractC30071xE implements ZA6 {

    /* renamed from: b */
    public final C29759w6 f50055b;

    /* renamed from: c */
    public final OperatorInfoCard f50056c;

    /* renamed from: d */
    public final Button f50057d;

    /* renamed from: e */
    public final BlockingEnterLocationView f50058e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37812aB6(BaseActivity activity, C29759w6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f50055b = binding;
        OperatorInfoCard operatorInfoCard = binding.f115266g;
        Intrinsics.checkNotNullExpressionValue(operatorInfoCard, "binding.operatorInfoCard");
        this.f50056c = operatorInfoCard;
        this.f50057d = binding.f115261b.m54752a();
        BlockingEnterLocationView blockingEnterLocationView = binding.f115261b;
        Intrinsics.checkNotNullExpressionValue(blockingEnterLocationView, "binding.blockEnterLocationOverlay");
        this.f50058e = blockingEnterLocationView;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: D0 */
    public Observable<Unit> mo22210D0() {
        return ZA6.C10123a.m73647a(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Df */
    public void mo22209Df(User user) {
        ZA6.C10123a.m73645c(this, user);
    }

    @Override // p000.ZA6
    /* renamed from: Ei */
    public AbstractC24490k<Unit> mo71796Ei() {
        Button button = this.f50055b.f115262c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.enterImeiButton");
        AbstractC24490k<Unit> m32108t0 = C44626lf5.clicksThrottle$default(button, 0L, 1, null).toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "binding.enterImeiButton\n…s.mainThread(), false, 1)");
        return m32108t0;
    }

    @Override // p000.InterfaceC36740Vx6
    /* renamed from: G9 */
    public Observable<DialogResponse> mo22207G9(Warehouse warehouse, Warehouse warehouse2) {
        return ZA6.C10123a.m73639i(this, warehouse, warehouse2);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: I9 */
    public void mo22206I9(String str) {
        ZA6.C10123a.m73642f(this, str);
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: P9 */
    public BlockingEnterLocationView mo22205P9() {
        return this.f50058e;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: Ra */
    public Button mo22204Ra() {
        return this.f50057d;
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: S9 */
    public void mo22203S9(Warehouse warehouse) {
        ZA6.C10123a.m73644d(this, warehouse);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Zd */
    public void mo22202Zd(boolean z) {
        ZA6.C10123a.m73640h(this, z);
    }

    @Override // p000.ZA6
    /* renamed from: o1 */
    public AbstractC24490k<Unit> mo71795o1() {
        Button button = this.f50055b.f115268i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.scanButton");
        AbstractC24490k<Unit> m32108t0 = C44626lf5.clicksThrottle$default(button, 0L, 1, null).toFlowable(EnumC23460b.DROP).m32108t0(C23454a.m33087a(), false, 1);
        Intrinsics.checkNotNullExpressionValue(m32108t0, "binding.scanButton\n     …s.mainThread(), false, 1)");
        return m32108t0;
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: p1 */
    public OperatorInfoCard mo22200p1() {
        return this.f50056c;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: rf */
    public void mo22199rf(boolean z) {
        ZA6.C10123a.m73641g(this, z);
    }

    @Override // p000.AbstractC9344XC, p000.S74
    public void showProgress(boolean z, int i) {
        ConstraintLayout constraintLayout = this.f50055b.f115265f;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.mainContainer");
        C49520tu6.show$default(constraintLayout, !z, 0, 2, null);
        TextView textView = this.f50055b.f115264e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.loadingOverlay");
        C49520tu6.show$default(textView, z, 0, 2, null);
        super.showProgress(z, i);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: v1 */
    public Observable<Unit> mo22198v1() {
        return ZA6.C10123a.m73646b(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: z7 */
    public void mo22196z7(String str) {
        ZA6.C10123a.m73643e(this, str);
    }
}
