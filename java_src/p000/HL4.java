package p000;

import android.os.Bundle;
import android.widget.ProgressBar;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.Model_Kt;
import co.bird.android.model.Reservation;
import co.bird.android.widget.BottomModalSheetLayout;
import co.bird.android.widget.BottomModalSheetModel;
import co.bird.android.widget.C16634c;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p000.H31;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH\u0016J.\u0010\u0014\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0007H\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010!\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u00050\u00050\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&"}, m28432d2 = {"LHL4;", "LxE;", "LGL4;", "", "show", "", "k", "", "subtitle", "", "titleRes", "Lio/reactivex/p;", "Lco/bird/android/widget/c$b;", "i4", "Lkotlin/Function0;", "onReportIssueClick", "charged", "applyTax", "Lco/bird/android/model/Reservation;", "reservation", "l6", "bodyText", "qg", "Lio/reactivex/Observable;", "h5", "Landroid/widget/ProgressBar;", "b", "Landroid/widget/ProgressBar;", "progressBar", "Lma4;", "kotlin.jvm.PlatformType", "c", "Lma4;", "reservationBottomModalShownRelay", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/ProgressBar;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HL4 */
/* loaded from: classes2.dex */
public final class HL4 extends AbstractC30071xE implements GL4 {

    /* renamed from: b */
    public final ProgressBar f13295b;

    /* renamed from: c */
    public final C45168ma4<Unit> f13296c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HL4(BaseActivity activity, ProgressBar progressBar) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        this.f13295b = progressBar;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f13296c = m25409g;
    }

    @Override // p000.GL4
    /* renamed from: h5 */
    public Observable<Unit> mo103974h5() {
        Observable<Unit> hide = this.f13296c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "reservationBottomModalShownRelay.hide()");
        return hide;
    }

    @Override // p000.GL4
    /* renamed from: i4 */
    public AbstractC24507p<C16634c.EnumC16636b> mo103973i4(String subtitle, int i) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        C16634c c16634c = new C16634c();
        Bundle bundle = new Bundle();
        bundle.putParcelable("bottom_modal_sheet_model", new BottomModalSheetModel(null, Integer.valueOf(i), subtitle, BottomModalSheetLayout.EnumC16464a.DOUBLE, Integer.valueOf(C45871nl4.reservation_cancel), Integer.valueOf(C45871nl4.reservation_reserve), null, null, Integer.valueOf(C33309Hg4.button_primary), Integer.valueOf(C32364Df4.white), null, null, null, 7361, null));
        c16634c.setArguments(bundle);
        c16634c.show(getActivity().getSupportFragmentManager(), "BottomModalSheetFragment");
        this.f13296c.accept(Unit.INSTANCE);
        return c16634c.m54230B9();
    }

    @Override // p000.GL4
    /* renamed from: k */
    public void mo103972k(boolean z) {
        C49520tu6.show$default(this.f13295b, z, 0, 2, null);
    }

    @Override // p000.GL4
    /* renamed from: l6 */
    public void mo103971l6(Function0<Unit> onReportIssueClick, boolean z, boolean z2, Reservation reservation) {
        String string;
        int m116043a;
        Intrinsics.checkNotNullParameter(onReportIssueClick, "onReportIssueClick");
        Intrinsics.checkNotNullParameter(reservation, "reservation");
        if (z) {
            C51916xx1 c51916xx1 = C51916xx1.f118396a;
            String m4408d = c51916xx1.m4408d(reservation.getPrice(), C45097mS5.m25591o(reservation.getCurrency()), EnumC36501Ux1.SHOW_IF_NON_ZERO);
            Integer billedMinutes = reservation.getBilledMinutes();
            if (billedMinutes != null) {
                m116043a = billedMinutes.intValue();
            } else {
                m116043a = AA1.m116043a(Model_Kt.durationSeconds(reservation));
            }
            String m4401k = c51916xx1.m4401k(getActivity(), m116043a, false);
            if (z2) {
                string = getActivity().getString(C45871nl4.reservation_canceled_charged_with_tax, m4408d, m4401k);
            } else {
                string = getActivity().getString(C45871nl4.reservation_canceled_charged, m4408d, m4401k);
            }
        } else {
            string = getActivity().getString(C45871nl4.reservation_no_charge_new);
        }
        Intrinsics.checkNotNullExpressionValue(string, "if (charged) {\n      val…tion_no_charge_new)\n    }");
        String str = string;
        H31.C3014a.showCustomDialog$default((H31) this, C39311cj4.dialog_reservation_canceled, (Integer) null, (Integer) null, false, false, false, (Integer) null, Integer.valueOf(C36585Vg4.mainText), (CharSequence) null, (CharSequence) str, C36585Vg4.positiveButton, Integer.valueOf(C36585Vg4.negativeButton), (String) null, (String) null, (Function0) null, (Function0) onReportIssueClick, (Function0) null, (Function0) null, false, 487790, (Object) null);
    }

    @Override // p000.GL4
    /* renamed from: qg */
    public void mo103970qg(String bodyText) {
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        H31.C3014a.showCustomDialog$default((H31) this, C39311cj4.dialog_reservation, (Integer) null, (Integer) null, false, false, false, Integer.valueOf(C36585Vg4.header), Integer.valueOf(C36585Vg4.body), (CharSequence) getActivity().getString(C45871nl4.reservation_ended_new), (CharSequence) bodyText, C36585Vg4.primaryButton, (Integer) null, (String) null, (String) null, (Function0) null, (Function0) null, (Function0) null, (Function0) null, false, 522302, (Object) null);
    }
}
