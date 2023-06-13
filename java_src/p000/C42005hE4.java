package p000;

import android.content.DialogInterface;
import android.widget.Button;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0006\u001a\u00020\u0003R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LhE4;", "LxE;", "Lio/reactivex/Observable;", "", "f", "i2", "dismiss", "Le00;", "b", "Le00;", "binding", "Landroid/content/DialogInterface;", "c", "Landroid/content/DialogInterface;", "dialog", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Le00;Landroid/content/DialogInterface;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hE4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42005hE4 extends AbstractC30071xE {

    /* renamed from: b */
    public final C40086e00 f84902b;

    /* renamed from: c */
    public final DialogInterface f84903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42005hE4(BaseActivity activity, C40086e00 binding, DialogInterface dialog) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f84902b = binding;
        this.f84903c = dialog;
    }

    public final void dismiss() {
        this.f84903c.dismiss();
    }

    /* renamed from: f */
    public final Observable<Unit> m36580f() {
        Button button = this.f84902b.f77529c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.confirm");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: i2 */
    public final Observable<Unit> m36579i2() {
        Button button = this.f84902b.f77528b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.addMoreRepairs");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }
}
