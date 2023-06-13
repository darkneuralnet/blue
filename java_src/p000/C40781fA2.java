package p000;

import co.bird.android.app.feature.longterm.LongTermSetupProductPointView;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LfA2;", "LxE;", "", "resId", "", "Sl", "", "header", "Rl", "point", "Pl", "Lio/reactivex/Observable;", "Ql", "J8", "LKC2;", "b", "LKC2;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LKC2;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: fA2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40781fA2 extends AbstractC30071xE {

    /* renamed from: b */
    public final KC2 f79631b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40781fA2(BaseActivity activity, KC2 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f79631b = binding;
    }

    /* renamed from: J8 */
    public final Observable<Unit> m41788J8() {
        Observable<Unit> throttleFirst = this.f79631b.f19273b.m54687h().throttleFirst(500L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(throttleFirst, "binding.callToActionLayo…0, TimeUnit.MILLISECONDS)");
        return throttleFirst;
    }

    /* renamed from: Pl */
    public final void m41787Pl(String point) {
        Intrinsics.checkNotNullParameter(point, "point");
        LongTermSetupProductPointView longTermSetupProductPointView = new LongTermSetupProductPointView(getActivity(), false, 2, null);
        longTermSetupProductPointView.setText(point);
        this.f79631b.f19276e.addView(longTermSetupProductPointView);
    }

    /* renamed from: Ql */
    public final Observable<Unit> m41786Ql() {
        return this.f79631b.f19273b.m54693b();
    }

    /* renamed from: Rl */
    public final void m41785Rl(String header) {
        Intrinsics.checkNotNullParameter(header, "header");
        this.f79631b.f19274c.setText(header);
    }

    /* renamed from: Sl */
    public final void m41784Sl(int i) {
        this.f79631b.f19275d.setImageResource(i);
    }
}
