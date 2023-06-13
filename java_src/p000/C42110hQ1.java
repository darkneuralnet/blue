package p000;

import android.content.DialogInterface;
import android.widget.Button;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B5\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0001\u0010\r\u001a\u00020\n\u0012\b\b\u0001\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m28432d2 = {"LhQ1;", "LxE;", "LgQ1;", "Lio/reactivex/Observable;", "", "h", "", "idToolDisplay", "Ja", "dismiss", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "title", "c", "description", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "scan", "Landroid/content/DialogInterface;", "e", "Landroid/content/DialogInterface;", "dialog", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/content/DialogInterface;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42110hQ1 extends AbstractC30071xE implements InterfaceC41517gQ1 {

    /* renamed from: b */
    public final TextView f85172b;

    /* renamed from: c */
    public final TextView f85173c;

    /* renamed from: d */
    public final Button f85174d;

    /* renamed from: e */
    public final DialogInterface f85175e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42110hQ1(BaseActivity activity, TextView title, TextView description, Button scan, DialogInterface dialog) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(scan, "scan");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f85172b = title;
        this.f85173c = description;
        this.f85174d = scan;
        this.f85175e = dialog;
    }

    @Override // p000.InterfaceC41517gQ1
    /* renamed from: Ja */
    public void mo36437Ja(String idToolDisplay) {
        Intrinsics.checkNotNullParameter(idToolDisplay, "idToolDisplay");
        this.f85172b.setText(getActivity().getString(C45871nl4.repair_id_tools_title_format, idToolDisplay));
        this.f85173c.setText(getActivity().getString(C45871nl4.repair_id_tools_description_format, idToolDisplay));
    }

    @Override // p000.InterfaceC41517gQ1
    public void dismiss() {
        this.f85175e.dismiss();
    }

    @Override // p000.InterfaceC41517gQ1
    /* renamed from: h */
    public Observable<Unit> mo36436h() {
        return C44626lf5.clicksThrottle$default(this.f85174d, 0L, 1, null);
    }
}
