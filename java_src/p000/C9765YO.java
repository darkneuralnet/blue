package p000;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.ridertutorial.widget.CircleIndicatorView;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.wire.configs.BirdPayTutorialStep;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0016R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, m28432d2 = {"LYO;", "LXO;", "Lio/reactivex/Observable;", "", "b", "", "count", "e", "Lco/bird/android/model/wire/configs/BirdPayTutorialStep;", "step", "c", "", "title", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/core/mvp/BaseActivity;", C17296a.f69688o, "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroid/widget/Button;", "Landroid/widget/Button;", "actionButton", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "bodyText", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "imageView", "Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;", "Lco/bird/android/app/feature/ridertutorial/widget/CircleIndicatorView;", "indicator", "Lcom/airbnb/lottie/LottieAnimationView;", "f", "Lcom/airbnb/lottie/LottieAnimationView;", "lottieView", "g", "titleText", "LUI4;", "h", "LUI4;", "glideInstance", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YO */
/* loaded from: classes2.dex */
public final class C9765YO implements InterfaceC9408XO {

    /* renamed from: a */
    public final BaseActivity f45807a;

    /* renamed from: b */
    public final Button f45808b;

    /* renamed from: c */
    public final TextView f45809c;

    /* renamed from: d */
    public final ImageView f45810d;

    /* renamed from: e */
    public CircleIndicatorView f45811e;

    /* renamed from: f */
    public LottieAnimationView f45812f;

    /* renamed from: g */
    public final TextView f45813g;

    /* renamed from: h */
    public final UI4 f45814h;

    public C9765YO(BaseActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f45807a = activity;
        this.f45808b = (Button) C40788fB0.m41779c(activity, C36585Vg4.nextButton);
        this.f45809c = (TextView) C40788fB0.m41779c(activity, C36585Vg4.tutorialStepBody);
        ImageView imageView = (ImageView) C40788fB0.m41779c(activity, C36585Vg4.stepImage);
        this.f45810d = imageView;
        this.f45811e = (CircleIndicatorView) C40788fB0.m41779c(activity, C36585Vg4.indicator);
        this.f45812f = (LottieAnimationView) C40788fB0.m41779c(activity, C36585Vg4.lottieGallery);
        this.f45813g = (TextView) C40788fB0.m41779c(activity, C36585Vg4.tutorialStepTitle);
        UI4 m53136v = ComponentCallbacks2C17096a.m53136v(activity);
        Intrinsics.checkNotNullExpressionValue(m53136v, "with(activity)");
        this.f45814h = m53136v;
        C49520tu6.m11233r(imageView);
        C49520tu6.m11239l(this.f45812f);
    }

    @Override // p000.InterfaceC9408XO
    /* renamed from: b */
    public Observable<Unit> mo75130b() {
        return C44626lf5.clicksThrottle$default(this.f45808b, 0L, 1, null);
    }

    @Override // p000.InterfaceC9408XO
    /* renamed from: c */
    public void mo75129c(BirdPayTutorialStep step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f45808b.setText(step.getActionButtonText());
        this.f45809c.setText(step.getBodyText());
        this.f45813g.setText(step.getTitleText());
        this.f45814h.m81653k(step.getAsset().getMedia().getMediaUrl()).m16096R0(this.f45810d);
        this.f45811e.setSelectedIndex(step.getIndex());
    }

    @Override // p000.InterfaceC9408XO
    /* renamed from: d */
    public void mo75128d(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f45807a.setTitle(title);
    }

    @Override // p000.InterfaceC9408XO
    /* renamed from: e */
    public void mo75127e(int i) {
        this.f45811e.setNumCircles(i);
    }
}
