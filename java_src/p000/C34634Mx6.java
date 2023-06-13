package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireBird;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010.\u001a\u00020\u0003¢\u0006\u0004\b/\u00100J\t\u0010\u0005\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u0006\u001a\u00020\u0004H\u0096\u0001J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0096\u0001J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0007H\u0096\u0001J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H\u0096\u0001J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0096\u0001J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0096\u0001J\t\u0010\u000f\u001a\u00020\u0004H\u0096\u0001J\u0015\u0010\u0011\u001a\u00020\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0096\u0001J\t\u0010\u0012\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u0013\u001a\u00020\u0004H\u0096\u0001J\t\u0010\u0014\u001a\u00020\u0004H\u0096\u0001J\u0011\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001J\u0013\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0001J\u0011\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0096\u0001J\u0019\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0096\u0001J\u001d\u0010%\u001a\u00020 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b2\u0006\u0010$\u001a\u00020 H\u0096\u0001J\u0013\u0010&\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020 H\u0096\u0001J\t\u0010'\u001a\u00020\u0004H\u0096\u0001J\t\u0010(\u001a\u00020\u0004H\u0096\u0001J\t\u0010*\u001a\u00020)H\u0096\u0001J\t\u0010+\u001a\u00020 H\u0096\u0001¨\u00061"}, m28432d2 = {"LMx6;", "LLx6;", "LxE;", "Lhm5;", "", "jl", "n0", "Lio/reactivex/Observable;", "sa", "LXK;", "W3", "", "zc", "z1", "Vg", "u5", PaymentMethodOptionsParams.Blik.PARAM_CODE, "tc", "gk", C9916Yi.f46302c, "c2", "", "length", "d2", "Lfm5;", "resultHandler", "l5", "", "tolerance", "d6", "Lco/bird/android/model/wire/WireBird;", "bird", "", "isHourly", "ec", "copy", "show", "Qa", "w9", "n1", "a1", "Lak5;", "sk", "i", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "delegate", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lhm5;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Mx6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C34634Mx6 extends AbstractC30071xE implements InterfaceC34400Lx6, InterfaceC42324hm5 {

    /* renamed from: b */
    public final /* synthetic */ InterfaceC42324hm5 f23876b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34634Mx6(BaseActivity activity, InterfaceC42324hm5 delegate) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f23876b = delegate;
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Qa */
    public boolean mo7502Qa(String str, boolean z) {
        return this.f23876b.mo7502Qa(str, z);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Vg */
    public Observable<Unit> mo7499Vg() {
        return this.f23876b.mo7499Vg();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: W3 */
    public Observable<C9400XK> mo7497W3() {
        return this.f23876b.mo7497W3();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: Yi */
    public void mo7496Yi() {
        this.f23876b.mo7496Yi();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: a1 */
    public void mo7495a1() {
        this.f23876b.mo7495a1();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: c2 */
    public void mo7493c2() {
        this.f23876b.mo7493c2();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: d2 */
    public void mo7492d2(int i) {
        this.f23876b.mo7492d2(i);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: d6 */
    public void mo7491d6(float f) {
        this.f23876b.mo7491d6(f);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: ec */
    public void mo7488ec(WireBird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f23876b.mo7488ec(bird, z);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: gk */
    public void mo7486gk() {
        this.f23876b.mo7486gk();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: i */
    public boolean mo7485i() {
        return this.f23876b.mo7485i();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: jl */
    public void mo7482jl() {
        this.f23876b.mo7482jl();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: l5 */
    public void mo7481l5(InterfaceC41138fm5 interfaceC41138fm5) {
        this.f23876b.mo7481l5(interfaceC41138fm5);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: n0 */
    public void mo7480n0() {
        this.f23876b.mo7480n0();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: n1 */
    public void mo7479n1() {
        this.f23876b.mo7479n1();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: sa */
    public Observable<Unit> mo7478sa() {
        return this.f23876b.mo7478sa();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: sk */
    public EnumC38136ak5 mo7477sk() {
        return this.f23876b.mo7477sk();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: tc */
    public void mo7476tc(String str) {
        this.f23876b.mo7476tc(str);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: u5 */
    public void mo7475u5() {
        this.f23876b.mo7475u5();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: w9 */
    public void mo7474w9(boolean z) {
        this.f23876b.mo7474w9(z);
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: z1 */
    public Observable<Unit> mo7472z1() {
        return this.f23876b.mo7472z1();
    }

    @Override // p000.InterfaceC42324hm5
    /* renamed from: zc */
    public Observable<String> mo7471zc() {
        return this.f23876b.mo7471zc();
    }
}
