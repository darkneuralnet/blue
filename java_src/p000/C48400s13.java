package p000;

import android.widget.TextView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.CallToActionBanner;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.ble.AbstractC26684u0;
import p000.H31;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u0016J,\u0010\u0012\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006 "}, m28432d2 = {"Ls13;", "LxE;", "Lr13;", "Lio/reactivex/Observable;", "", "Kk", "", "overridable", "tb", "", "distanceStr", AbstractC26684u0.f100690q, "titleStr", "t", "Lkotlin/Function0;", "onPrimary", "onSecondary", "distance", "Kg", "Lco/bird/android/widget/CallToActionBanner;", "b", "Lco/bird/android/widget/CallToActionBanner;", "view", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "c", "Landroid/widget/TextView;", "callToActionBottom", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/CallToActionBanner;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: s13  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C48400s13 extends AbstractC30071xE implements InterfaceC47808r13 {

    /* renamed from: b */
    public final CallToActionBanner f108138b;

    /* renamed from: c */
    public final TextView f108139c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48400s13(BaseActivity activity, CallToActionBanner view) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        this.f108138b = view;
        this.f108139c = (TextView) view.findViewById(C52955zi4.callToActionBottom);
    }

    @Override // p000.InterfaceC47808r13
    /* renamed from: Kg */
    public void mo14880Kg(Function0<Unit> onPrimary, Function0<Unit> onSecondary, String distance) {
        Intrinsics.checkNotNullParameter(onPrimary, "onPrimary");
        Intrinsics.checkNotNullParameter(onSecondary, "onSecondary");
        Intrinsics.checkNotNullParameter(distance, "distance");
        int i = C39311cj4.dialog_no_parking_warning;
        int i2 = C36585Vg4.title;
        String string = getActivity().getString(C45871nl4.parking_nest_almost_dialog_title);
        int i3 = C36585Vg4.body;
        String string2 = getActivity().getString(C45871nl4.parking_nest_almost_dialog_subtitle);
        int i4 = C36585Vg4.positiveButton;
        int i5 = C36585Vg4.negativeButton;
        H31.C3014a.showCustomDialog$default((H31) this, i, (Integer) null, (Integer) null, false, false, false, Integer.valueOf(i2), Integer.valueOf(i3), (CharSequence) string, (CharSequence) string2, i4, Integer.valueOf(i5), getActivity().getString(C45871nl4.parking_nest_almost_dialog_positive_text), getActivity().getString(C45871nl4.parking_nest_almost_dialog_negative_text), (Function0) onPrimary, (Function0) onSecondary, (Function0) null, (Function0) null, false, 458814, (Object) null);
    }

    @Override // p000.InterfaceC47808r13
    /* renamed from: Kk */
    public Observable<Unit> mo14879Kk() {
        TextView callToActionBottom = this.f108139c;
        Intrinsics.checkNotNullExpressionValue(callToActionBottom, "callToActionBottom");
        return C44626lf5.clicksThrottle$default(callToActionBottom, 0L, 1, null);
    }

    @Override // p000.InterfaceC47808r13
    /* renamed from: t */
    public void mo14878t(String titleStr) {
        Intrinsics.checkNotNullParameter(titleStr, "titleStr");
        this.f108138b.setTitle(titleStr);
    }

    @Override // p000.InterfaceC47808r13
    /* renamed from: tb */
    public void mo14877tb(boolean z) {
        this.f108138b.m54702s(z);
    }

    @Override // p000.InterfaceC47808r13
    /* renamed from: u0 */
    public void mo14876u0(String distanceStr) {
        Intrinsics.checkNotNullParameter(distanceStr, "distanceStr");
        this.f108138b.setSubtitle(distanceStr);
    }
}
