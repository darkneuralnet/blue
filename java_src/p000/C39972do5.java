package p000;

import android.widget.Button;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import co.bird.android.model.wire.WireBird;
import co.bird.android.widget.BlockingEnterLocationView;
import co.bird.android.widget.OperatorInfoCard;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.C53094zw3;
import p000.InterfaceC39362co5;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B5\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b%\u0010&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u001a\u0010\"\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010!¨\u0006'"}, m28432d2 = {"Ldo5;", "LxE;", "Lco5;", "Lio/reactivex/Observable;", "", "h", "v0", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/DialogResponse;", "lc", "Nb", "wk", "Lco/bird/android/widget/OperatorInfoCard;", "b", "Lco/bird/android/widget/OperatorInfoCard;", "p1", "()Lco/bird/android/widget/OperatorInfoCard;", "operatorInfoCard", "Lco/bird/android/widget/BlockingEnterLocationView;", "c", "Lco/bird/android/widget/BlockingEnterLocationView;", "P9", "()Lco/bird/android/widget/BlockingEnterLocationView;", "blockingEnterLocationOverlay", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "scan", "e", PaymentMethodOptionsParams.Blik.PARAM_CODE, "f", "Ra", "()Landroid/widget/Button;", "settingsButton", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/widget/OperatorInfoCard;Lco/bird/android/widget/BlockingEnterLocationView;Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/Button;Landroid/widget/Button;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: do5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39972do5 extends AbstractC30071xE implements InterfaceC39362co5 {

    /* renamed from: b */
    public final OperatorInfoCard f77239b;

    /* renamed from: c */
    public final BlockingEnterLocationView f77240c;

    /* renamed from: d */
    public final Button f77241d;

    /* renamed from: e */
    public final Button f77242e;

    /* renamed from: f */
    public final Button f77243f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39972do5(OperatorInfoCard operatorInfoCard, BlockingEnterLocationView blockingEnterLocationOverlay, BaseActivity activity, Button scan, Button code) {
        super(activity);
        Intrinsics.checkNotNullParameter(operatorInfoCard, "operatorInfoCard");
        Intrinsics.checkNotNullParameter(blockingEnterLocationOverlay, "blockingEnterLocationOverlay");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scan, "scan");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f77239b = operatorInfoCard;
        this.f77240c = blockingEnterLocationOverlay;
        this.f77241d = scan;
        this.f77242e = code;
        this.f77243f = mo22205P9().m54752a();
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: D0 */
    public Observable<Unit> mo22210D0() {
        return InterfaceC39362co5.C16792a.m53727a(this);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Df */
    public void mo22209Df(User user) {
        InterfaceC39362co5.C16792a.m53725c(this, user);
    }

    @Override // p000.InterfaceC36740Vx6
    /* renamed from: G9 */
    public Observable<DialogResponse> mo22207G9(Warehouse warehouse, Warehouse warehouse2) {
        return InterfaceC39362co5.C16792a.m53719i(this, warehouse, warehouse2);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: I9 */
    public void mo22206I9(String str) {
        InterfaceC39362co5.C16792a.m53722f(this, str);
    }

    @Override // p000.InterfaceC39362co5
    /* renamed from: Nb */
    public void mo43691Nb(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        C53094zw3.C31593a c31593a = C53094zw3.f122502a;
        BaseActivity activity = getActivity();
        String string = getActivity().getString(C45871nl4.scrap_pending_toast, bird.getCode());
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…pending_toast, bird.code)");
        C53094zw3.C31593a.makeText$default(c31593a, activity, string, 0, 48, null, 16, null).show();
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: P9 */
    public BlockingEnterLocationView mo22205P9() {
        return this.f77240c;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: Ra */
    public Button mo22204Ra() {
        return this.f77243f;
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: S9 */
    public void mo22203S9(Warehouse warehouse) {
        InterfaceC39362co5.C16792a.m53724d(this, warehouse);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: Zd */
    public void mo22202Zd(boolean z) {
        InterfaceC39362co5.C16792a.m53720h(this, z);
    }

    @Override // p000.InterfaceC39362co5
    /* renamed from: h */
    public Observable<Unit> mo43690h() {
        return C44626lf5.clicksThrottle$default(this.f77241d, 0L, 1, null);
    }

    @Override // p000.InterfaceC39362co5
    /* renamed from: lc */
    public Observable<DialogResponse> mo43689lc(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        C32437Dn5 m109938a = C32437Dn5.f6328d.m109938a(bird);
        m109938a.show(getActivity().getSupportFragmentManager(), "ScrapInspectionConfirmationBottomSheet");
        return m109938a.m109940N6();
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: p1 */
    public OperatorInfoCard mo22200p1() {
        return this.f77239b;
    }

    @Override // p000.InterfaceC9073WW
    /* renamed from: rf */
    public void mo22199rf(boolean z) {
        InterfaceC39362co5.C16792a.m53721g(this, z);
    }

    @Override // p000.InterfaceC39362co5
    /* renamed from: v0 */
    public Observable<Unit> mo43688v0() {
        return C44626lf5.clicksThrottle$default(this.f77242e, 0L, 1, null);
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: v1 */
    public Observable<Unit> mo22198v1() {
        return InterfaceC39362co5.C16792a.m53726b(this);
    }

    @Override // p000.InterfaceC39362co5
    /* renamed from: wk */
    public void mo43687wk(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        C53094zw3.C31593a c31593a = C53094zw3.f122502a;
        BaseActivity activity = getActivity();
        String string = getActivity().getString(C45871nl4.scrap_approved_toast, bird.getCode());
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…pproved_toast, bird.code)");
        C53094zw3.C31593a.makeText$default(c31593a, activity, string, 0, 48, null, 16, null).show();
    }

    @Override // p000.InterfaceC35918Sk3
    /* renamed from: z7 */
    public void mo22196z7(String str) {
        InterfaceC39362co5.C16792a.m53723e(this, str);
    }
}
