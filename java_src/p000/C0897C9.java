package p000;

import android.view.View;
import android.view.ViewStub;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WireAlert;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m28432d2 = {"LC9;", "LxE;", "LB9;", "Lco/bird/android/model/wire/WireAlert;", "alert", "", "ha", "rh", "Landroid/view/ViewStub;", "b", "Landroid/view/ViewStub;", "alertViewStub", "Landroid/view/View;", "c", "Landroid/view/View;", "alertView", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/ViewStub;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: C9 */
/* loaded from: classes2.dex */
public final class C0897C9 extends AbstractC30071xE implements InterfaceC0533B9 {

    /* renamed from: b */
    public final ViewStub f3508b;

    /* renamed from: c */
    public View f3509c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0897C9(BaseActivity activity, ViewStub alertViewStub) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(alertViewStub, "alertViewStub");
        this.f3508b = alertViewStub;
    }

    @Override // p000.InterfaceC0533B9
    /* renamed from: ha */
    public void mo112741ha(WireAlert wireAlert) {
        if (wireAlert == null) {
            View view = this.f3509c;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f3509c;
            if (view2 != null) {
                view2.setClickable(false);
                return;
            }
            return;
        }
        if (this.f3509c == null) {
            this.f3509c = this.f3508b.inflate();
        }
        View view3 = this.f3509c;
        if (view3 != null) {
            C31754Ap6 m115130a = C31754Ap6.m115130a(view3);
            Intrinsics.checkNotNullExpressionValue(m115130a, "bind(this)");
            view3.setVisibility(0);
            view3.setClickable(true);
            m115130a.f1192c.setImageResource(C1399D9.m110876c(wireAlert));
            m115130a.f1193d.setText(wireAlert.getTitle());
            m115130a.f1191b.setText(wireAlert.getBody());
            view3.setBackgroundColor(C1399D9.m110878a(wireAlert));
            view3.setAlpha(0.9f);
            int m110874e = C1399D9.m110874e(wireAlert);
            m115130a.f1193d.setTextColor(m110874e);
            m115130a.f1191b.setTextColor(m110874e);
        }
    }

    @Override // p000.InterfaceC0533B9
    /* renamed from: rh */
    public void mo112740rh() {
        mo112741ha(null);
    }
}
