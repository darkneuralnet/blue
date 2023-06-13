package p000;

import android.widget.Button;
import android.widget.FrameLayout;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p000.H31;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\tJ\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006!"}, m28432d2 = {"LPz0;", "LxE;", "LH31;", "", "LH6;", "sections", "", "b", "Lio/reactivex/Observable;", "", "Ul", "Pl", "", "show", "enabled", "Ql", "containerOrderId", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "Sl", "Tl", "Rl", "Lr3;", "Lr3;", "binding", "Lyz0;", "c", "Lyz0;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lr3;)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Pz0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35348Pz0 extends AbstractC30071xE {

    /* renamed from: b */
    public final C27825r3 f29517b;

    /* renamed from: c */
    public final C52528yz0 f29518c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35348Pz0(BaseActivity activity, C27825r3 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f29517b = binding;
        C52528yz0 c52528yz0 = new C52528yz0();
        this.f29518c = c52528yz0;
        binding.f106330d.setAdapter(c52528yz0);
    }

    /* renamed from: Pl */
    public final Observable<Unit> m89201Pl() {
        Button button = this.f29517b.f106328b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.addBol");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Ql */
    public final void m89200Ql(boolean z, boolean z2) {
        FrameLayout frameLayout = this.f29517b.f106329c;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.buttonContainer");
        C49520tu6.show$default(frameLayout, z, 0, 2, null);
        this.f29517b.f106328b.setEnabled(z2);
    }

    /* renamed from: Rl */
    public final AbstractC23442F<DialogResponse> m89199Rl() {
        int i = C45268mk4.dialog_custom_cta;
        int i2 = C52955zi4.primaryButton;
        int i3 = C52955zi4.secondaryButton;
        int i4 = C52955zi4.title;
        int i5 = C52955zi4.body;
        String string = getString(C45871nl4.yes_uppercased, new Object[0]);
        String string2 = getString(C45871nl4.container_order_checked_in_confirmation_dialog_title, new Object[0]);
        String string3 = getString(C45871nl4.container_order_checked_in_confirmation_dialog_description, new Object[0]);
        return H31.C3014a.dialog$default(this, i, Integer.valueOf(i2), Integer.valueOf(i3), null, Integer.valueOf(i4), Integer.valueOf(i5), string, getString(C45871nl4.container_order_in_transit_confirmation_dialog_negative, new Object[0]), null, string2, string3, false, false, false, null, 30984, null);
    }

    /* renamed from: Sl */
    public final AbstractC23442F<DialogResponse> m89198Sl(String containerOrderId) {
        Intrinsics.checkNotNullParameter(containerOrderId, "containerOrderId");
        return H31.C3014a.dialog$default(this, C45268mk4.dialog_custom_cta, Integer.valueOf(C52955zi4.primaryButton), null, null, Integer.valueOf(C52955zi4.title), Integer.valueOf(C52955zi4.body), getString(C45871nl4.general_got_it, new Object[0]), null, null, getString(C45871nl4.container_order_not_booked_dialog_title, new Object[0]), C50976wN1.m6966a(getActivity().getString(C45871nl4.container_order_not_booked_dialog_description, containerOrderId), 0), false, false, false, null, 31116, null);
    }

    /* renamed from: Tl */
    public final AbstractC23442F<DialogResponse> m89197Tl() {
        int i = C45268mk4.dialog_custom_cta;
        int i2 = C52955zi4.primaryButton;
        int i3 = C52955zi4.secondaryButton;
        int i4 = C52955zi4.title;
        int i5 = C52955zi4.body;
        String string = getString(C45871nl4.yes_uppercased, new Object[0]);
        String string2 = getString(C45871nl4.container_order_in_transit_confirmation_dialog_title, new Object[0]);
        String string3 = getString(C45871nl4.container_order_in_transit_confirmation_dialog_description, new Object[0]);
        return H31.C3014a.dialog$default(this, i, Integer.valueOf(i2), Integer.valueOf(i3), null, Integer.valueOf(i4), Integer.valueOf(i5), string, getString(C45871nl4.container_order_in_transit_confirmation_dialog_negative, new Object[0]), null, string2, string3, false, false, false, null, 30984, null);
    }

    /* renamed from: Ul */
    public final Observable<String> m89196Ul() {
        return this.f29518c.m41958x();
    }

    /* renamed from: b */
    public final void m89195b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f29518c.mo24871u(sections);
    }
}
