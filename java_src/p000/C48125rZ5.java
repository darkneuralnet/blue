package p000;

import android.widget.Button;
import android.widget.EditText;
import androidx.recyclerview.widget.C11925l;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m28432d2 = {"LrZ5;", "LxE;", "", "Lio/reactivex/Observable;", "", "Sl", "", "Rl", "Ql", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "Pl", "()Landroid/widget/Button;", "submitRequestButton", "Landroid/widget/EditText;", "c", "Landroid/widget/EditText;", "reasonEditText", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rZ5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48125rZ5 extends AbstractC30071xE {

    /* renamed from: b */
    public final Button f107282b;

    /* renamed from: c */
    public final EditText f107283c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48125rZ5(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f107282b = (Button) C40788fB0.m41779c(activity, C36585Vg4.submitButton);
        this.f107283c = (EditText) C40788fB0.m41779c(activity, C36585Vg4.reason);
    }

    /* renamed from: Pl */
    public final Button m15763Pl() {
        return this.f107282b;
    }

    /* renamed from: Ql */
    public String m15762Ql() {
        return this.f107283c.getText().toString();
    }

    /* renamed from: Rl */
    public Observable<String> m15761Rl() {
        return C44626lf5.textChanges$default(this.f107283c, C11925l.AbstractC11930e.DEFAULT_SWIPE_ANIMATION_DURATION, false, 2, null);
    }

    /* renamed from: Sl */
    public Observable<Unit> m15760Sl() {
        return C44626lf5.clicksThrottle$default(this.f107282b, 0L, 1, null);
    }
}
