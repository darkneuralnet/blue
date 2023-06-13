package p000;

import android.content.DialogInterface;
import android.widget.Button;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B!\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LBn5;", "LxE;", "LAn5;", "Lio/reactivex/Observable;", "", "doneClicks", "dismiss", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "done", "Landroid/content/DialogInterface;", "c", "Landroid/content/DialogInterface;", "dialog", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/Button;Landroid/content/DialogInterface;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Bn5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31969Bn5 extends AbstractC30071xE implements InterfaceC31735An5 {

    /* renamed from: b */
    public final Button f2890b;

    /* renamed from: c */
    public final DialogInterface f2891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31969Bn5(BaseActivity activity, Button done, DialogInterface dialog) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(done, "done");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f2890b = done;
        this.f2891c = dialog;
    }

    @Override // p000.InterfaceC31735An5
    public void dismiss() {
        this.f2891c.dismiss();
    }

    @Override // p000.InterfaceC31735An5
    public Observable<Unit> doneClicks() {
        return C44626lf5.clicksThrottle$default(this.f2890b, 0L, 1, null);
    }
}
