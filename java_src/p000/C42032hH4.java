package p000;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001a\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"LhH4;", "LxE;", "", "Lio/reactivex/Observable;", "", "Sl", "w0", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "Ql", "()Landroid/widget/TextView;", "infoText", "Landroid/view/View;", "c", "Landroid/view/View;", "Pl", "()Landroid/view/View;", "bottomLayout", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "redrawButton", "e", "Rl", "()Landroid/widget/Button;", "nextButton", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/Button;Landroid/widget/Button;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hH4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42032hH4 extends AbstractC30071xE {

    /* renamed from: b */
    public final TextView f84959b;

    /* renamed from: c */
    public final View f84960c;

    /* renamed from: d */
    public final Button f84961d;

    /* renamed from: e */
    public final Button f84962e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42032hH4(BaseActivity activity, TextView infoText, View bottomLayout, Button redrawButton, Button nextButton) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(infoText, "infoText");
        Intrinsics.checkNotNullParameter(bottomLayout, "bottomLayout");
        Intrinsics.checkNotNullParameter(redrawButton, "redrawButton");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        this.f84959b = infoText;
        this.f84960c = bottomLayout;
        this.f84961d = redrawButton;
        this.f84962e = nextButton;
    }

    /* renamed from: Pl */
    public final View m36566Pl() {
        return this.f84960c;
    }

    /* renamed from: Ql */
    public final TextView m36565Ql() {
        return this.f84959b;
    }

    /* renamed from: Rl */
    public final Button m36564Rl() {
        return this.f84962e;
    }

    /* renamed from: Sl */
    public Observable<Unit> m36563Sl() {
        return C44626lf5.clicksThrottle$default(this.f84961d, 0L, 1, null);
    }

    /* renamed from: w0 */
    public Observable<Unit> m36562w0() {
        return C44626lf5.clicksThrottle$default(this.f84962e, 0L, 1, null);
    }
}
