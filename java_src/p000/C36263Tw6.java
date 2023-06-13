package p000;

import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.DialogResponse;
import io.reactivex.AbstractC23442F;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, m28432d2 = {"LTw6;", "LxE;", "LSw6;", "", "count", "", "Ph", "q5", "cl", "woken", "failedToWake", "total", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "wa", "ff", "Lu6;", "b", "Lu6;", "binding", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lu6;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Tw6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36263Tw6 extends AbstractC30071xE implements InterfaceC36029Sw6 {

    /* renamed from: b */
    public final C29054u6 f36485b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36263Tw6(BaseActivity activity, C29054u6 binding) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f36485b = binding;
    }

    @Override // p000.InterfaceC36029Sw6
    /* renamed from: Ph */
    public void mo82231Ph(int i) {
        this.f36485b.f111728c.setText(getActivity().getString(C45871nl4.birds_woken, Integer.valueOf(i)));
    }

    @Override // p000.InterfaceC36029Sw6
    /* renamed from: cl */
    public void mo82230cl(int i) {
        this.f36485b.f111730e.setText(getActivity().getResources().getString(C45871nl4.birds_total, Integer.valueOf(i)));
    }

    @Override // p000.InterfaceC36029Sw6
    /* renamed from: ff */
    public AbstractC23442F<DialogResponse> mo82229ff() {
        return dialog(C50725vw6.f114922d, false, true);
    }

    @Override // p000.InterfaceC36029Sw6
    /* renamed from: q5 */
    public void mo82228q5(int i) {
        this.f36485b.f111727b.setText(getActivity().getResources().getString(C45871nl4.birds_failed_to_wake, Integer.valueOf(i)));
    }

    @Override // p000.InterfaceC36029Sw6
    /* renamed from: wa */
    public AbstractC23442F<DialogResponse> mo82227wa(int i, int i2, int i3) {
        return dialog(new C36497Uw6(i, i2, i3), false, true);
    }
}
