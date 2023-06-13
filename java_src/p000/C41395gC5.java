package p000;

import android.widget.Button;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\nJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\nR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"LgC5;", "LxE;", "", "enable", "", "L0", "", "LH6;", "sections", "b", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "Pl", "c", "Ld6;", "Ld6;", "binding", "LQB5;", "LQB5;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Ld6;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: gC5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41395gC5 extends AbstractC30071xE {

    /* renamed from: b */
    public final C19674d6 f81776b;

    /* renamed from: c */
    public final QB5 f81777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41395gC5(BaseActivity activity, C19674d6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f81776b = binding;
        QB5 qb5 = new QB5();
        this.f81777c = qb5;
        binding.f76118c.setAdapter(qb5);
    }

    /* renamed from: L0 */
    public final void m39873L0(boolean z) {
        this.f81776b.f76119d.setEnabled(z);
    }

    /* renamed from: Pl */
    public final Observable<Pair<String, String>> m39872Pl() {
        return this.f81777c.m88793v();
    }

    /* renamed from: b */
    public final void m39871b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f81777c.mo24871u(sections);
    }

    /* renamed from: c */
    public final Observable<Unit> m39870c() {
        Button button = this.f81776b.f76119d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.submitReport");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }
}
