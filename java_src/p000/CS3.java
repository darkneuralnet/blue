package p000;

import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.CallToActionLayout;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u001e"}, m28432d2 = {"LCS3;", "LBS3;", "LxE;", "Lio/reactivex/Observable;", "", "t5", "", "resId", "Ca", "setTitle", "El", "kd", "Lco/bird/android/widget/CallToActionLayout;", "b", "Lco/bird/android/widget/CallToActionLayout;", "container", "Landroid/widget/ImageView;", "c", "Landroid/widget/ImageView;", Entry.TYPE_IMAGE, "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/TextView;", "title", "e", "subtitle", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: CS3 */
/* loaded from: classes2.dex */
public final class CS3 extends AbstractC30071xE implements BS3 {

    /* renamed from: b */
    public final CallToActionLayout f4091b;

    /* renamed from: c */
    public final ImageView f4092c;

    /* renamed from: d */
    public final TextView f4093d;

    /* renamed from: e */
    public final TextView f4094e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CS3(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f4091b = (CallToActionLayout) C40788fB0.m41779c(activity, C36585Vg4.root);
        this.f4092c = (ImageView) C40788fB0.m41779c(activity, C36585Vg4.image);
        this.f4093d = (TextView) C40788fB0.m41779c(activity, C36585Vg4.title);
        this.f4094e = (TextView) C40788fB0.m41779c(activity, C36585Vg4.subtitle);
        ((ProgressBar) C40788fB0.m41779c(activity, C36585Vg4.progressBar)).setVisibility(8);
    }

    @Override // p000.BS3
    /* renamed from: Ca */
    public void mo112229Ca(int i) {
        this.f4092c.setImageResource(i);
    }

    @Override // p000.BS3
    /* renamed from: El */
    public void mo112228El(int i) {
        this.f4094e.setText(i);
    }

    @Override // p000.BS3
    /* renamed from: kd */
    public void mo112227kd(int i) {
        this.f4091b.setButtonText(i);
    }

    @Override // p000.BS3
    public void setTitle(int i) {
        this.f4093d.setText(i);
    }

    @Override // p000.BS3
    /* renamed from: t5 */
    public Observable<Unit> mo112226t5() {
        return this.f4091b.m54693b();
    }
}
