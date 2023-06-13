package p000;

import android.widget.Button;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireServiceCenterStatus;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.H31;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u001a\u0010\u0016\u001a\u00020\u00128\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, m28432d2 = {"LmE;", "LxE;", "LlE;", "", "LH6;", "adapterSections", "", "b", "Lio/reactivex/Observable;", "c", "Lco/bird/android/model/wire/WireServiceCenterStatus;", "P", "", "z", "", "enabled", "x", "C7", "Lb6;", "Lb6;", "getBinding", "()Lb6;", "binding", "Lpu5;", "Lpu5;", "Pl", "()Lpu5;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lb6;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mE */
/* loaded from: classes3.dex */
public class C26017mE extends AbstractC30071xE implements InterfaceC25660lE {

    /* renamed from: b */
    public final C12291b6 f97677b;

    /* renamed from: c */
    public final C47148pu5 f97678c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26017mE(BaseActivity activity, C12291b6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f97677b = binding;
        C47148pu5 c47148pu5 = new C47148pu5();
        this.f97678c = c47148pu5;
        binding.f56923d.setLayoutManager(new LinearLayoutManager(activity));
        binding.f56923d.setAdapter(c47148pu5);
        binding.f56923d.setItemAnimator(new C11894g());
    }

    @Override // p000.InterfaceC25660lE
    /* renamed from: C7 */
    public void mo25933C7() {
        H31.C3014a.showDialog$default(this, C48334ru5.f107880d, false, false, null, null, null, null, 126, null);
        this.f97678c.m18444v();
    }

    @Override // p000.InterfaceC25660lE
    /* renamed from: P */
    public Observable<WireServiceCenterStatus> mo25932P() {
        return this.f97678c.m18443w();
    }

    /* renamed from: Pl */
    public final C47148pu5 m25931Pl() {
        return this.f97678c;
    }

    @Override // p000.InterfaceC25660lE
    /* renamed from: b */
    public void mo25930b(List<C3023H6> adapterSections) {
        Intrinsics.checkNotNullParameter(adapterSections, "adapterSections");
        this.f97678c.mo24871u(adapterSections);
    }

    @Override // p000.InterfaceC25660lE
    /* renamed from: c */
    public Observable<Unit> mo25929c() {
        Button button = this.f97677b.f56924e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.submitButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC25660lE
    /* renamed from: x */
    public void mo25928x(boolean z) {
        this.f97677b.f56924e.setEnabled(z);
    }

    @Override // p000.InterfaceC25660lE
    /* renamed from: z */
    public Observable<String> mo25927z() {
        return this.f97678c.m18441z();
    }
}
