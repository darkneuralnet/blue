package p000;

import android.content.DialogInterface;
import android.widget.Button;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.WirePart;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u0006\u0010\t\u001a\u00020\u0004R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m28432d2 = {"LCI3;", "LxE;", "Lco/bird/android/model/wire/WirePart;", "part", "", "Pl", "Lio/reactivex/Observable;", "f", DateTokenConverter.CONVERTER_KEY, "dismiss", "Lb00;", "b", "Lb00;", "binding", "Landroid/content/DialogInterface;", "c", "Landroid/content/DialogInterface;", "dialog", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lb00;Landroid/content/DialogInterface;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: CI3 */
/* loaded from: classes3.dex */
public final class CI3 extends AbstractC30071xE {

    /* renamed from: b */
    public final C38290b00 f3897b;

    /* renamed from: c */
    public final DialogInterface f3898c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CI3(BaseActivity activity, C38290b00 binding, DialogInterface dialog) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f3897b = binding;
        this.f3898c = dialog;
    }

    /* renamed from: Pl */
    public final void m112369Pl(WirePart part) {
        Intrinsics.checkNotNullParameter(part, "part");
        this.f3897b.f56772e.setText(getActivity().getString(C45871nl4.repair_id_tools_confirmation_title, C40854fI3.m41604a(part.getKind(), getActivity()), part.getKey()));
        this.f3897b.f56771d.setText(getActivity().getString(C45871nl4.repair_id_tools_confirmation_instruction, C40854fI3.m41604a(part.getKind(), getActivity())));
    }

    /* renamed from: d */
    public final Observable<Unit> m112368d() {
        Button button = this.f3897b.f56769b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cancel");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    public final void dismiss() {
        this.f3898c.dismiss();
    }

    /* renamed from: f */
    public final Observable<Unit> m112367f() {
        Button button = this.f3897b.f56770c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.confirm");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }
}
