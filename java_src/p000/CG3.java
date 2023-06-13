package p000;

import android.widget.EditText;
import androidx.recyclerview.widget.C11925l;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.CallToActionLayout;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u001c\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0014\u001a\n \r*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m28432d2 = {"LCG3;", "LBG3;", "LxE;", "Lio/reactivex/Observable;", "", "e", "", "G0", "C5", "", "enabled", "L0", "Lco/bird/android/widget/CallToActionLayout;", "kotlin.jvm.PlatformType", "b", "Lco/bird/android/widget/CallToActionLayout;", "callToActionLayout", "Landroid/widget/EditText;", "c", "Landroid/widget/EditText;", "textBox", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: CG3 */
/* loaded from: classes2.dex */
public final class CG3 extends AbstractC30071xE implements BG3 {

    /* renamed from: b */
    public final CallToActionLayout f3789b;

    /* renamed from: c */
    public final EditText f3790c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CG3(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f3789b = (CallToActionLayout) activity.findViewById(C36585Vg4.root);
        this.f3790c = (EditText) activity.findViewById(C36585Vg4.issueTextBox);
    }

    @Override // p000.BG3
    /* renamed from: C5 */
    public String mo112495C5() {
        return this.f3790c.getText().toString();
    }

    @Override // p000.BG3
    /* renamed from: G0 */
    public Observable<String> mo112494G0() {
        EditText textBox = this.f3790c;
        Intrinsics.checkNotNullExpressionValue(textBox, "textBox");
        return C44626lf5.textChanges$default(textBox, C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION, false, 2, null);
    }

    @Override // p000.BG3
    /* renamed from: L0 */
    public void mo112493L0(boolean z) {
        this.f3789b.setButtonEnabled(z);
    }

    @Override // p000.BG3
    /* renamed from: e */
    public Observable<Unit> mo112492e() {
        return this.f3789b.m54693b();
    }
}
