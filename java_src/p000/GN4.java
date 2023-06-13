package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.PhotoBannerViewModel;
import co.bird.android.widget.CameraxView;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010&\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010!R\u0014\u0010(\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010!R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010/R\u0014\u0010<\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00103R\u0014\u0010>\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00103R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006K"}, m28432d2 = {"LGN4;", "LxE;", "LFN4;", "Lco/bird/android/model/PhotoBannerViewModel;", "photoBannerViewModel", "", "ga", "onResume", "onPause", "Lio/reactivex/Observable;", "C1", "l1", "q8", "U5", "Lio/reactivex/F;", "Landroid/graphics/Bitmap;", "Z", Entry.TYPE_IMAGE, "j7", "nh", "", Entry.TYPE_TEXT, "Pl", "Rl", "Ql", "b", "Lco/bird/android/model/PhotoBannerViewModel;", "Lco/bird/android/widget/CameraxView;", "c", "Lco/bird/android/widget/CameraxView;", "cameraView", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "takePhotoButton", "e", "cancelButton", "f", "retakeButton", "g", "usePhotoButton", "Landroid/widget/ProgressBar;", "h", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ImageView;", "i", "Landroid/widget/ImageView;", "imagePreview", "Landroid/widget/TextView;", "j", "Landroid/widget/TextView;", "infoText", "Landroid/view/View;", "k", "Landroid/view/View;", "infoView", "l", "infoViewIcon", "m", "infoViewTitle", "n", "infoViewBody", "Landroid/widget/LinearLayout;", "o", "Landroid/widget/LinearLayout;", "pictureTaken", "Landroid/widget/RelativeLayout;", "p", "Landroid/widget/RelativeLayout;", "takingPicture", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "retakeable-photo_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GN4 */
/* loaded from: classes4.dex */
public final class GN4 extends AbstractC30071xE implements FN4 {

    /* renamed from: b */
    public PhotoBannerViewModel f11814b;

    /* renamed from: c */
    public final CameraxView f11815c;

    /* renamed from: d */
    public final Button f11816d;

    /* renamed from: e */
    public final Button f11817e;

    /* renamed from: f */
    public final Button f11818f;

    /* renamed from: g */
    public final Button f11819g;

    /* renamed from: h */
    public final ProgressBar f11820h;

    /* renamed from: i */
    public final ImageView f11821i;

    /* renamed from: j */
    public final TextView f11822j;

    /* renamed from: k */
    public final View f11823k;

    /* renamed from: l */
    public final ImageView f11824l;

    /* renamed from: m */
    public final TextView f11825m;

    /* renamed from: n */
    public final TextView f11826n;

    /* renamed from: o */
    public final LinearLayout f11827o;

    /* renamed from: p */
    public final RelativeLayout f11828p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GN4(BaseActivity activity) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f11815c = (CameraxView) C40788fB0.m41779c(activity, C31923Bi4.camera);
        this.f11816d = (Button) C40788fB0.m41779c(activity, C31923Bi4.takePhotoButton);
        this.f11817e = (Button) C40788fB0.m41779c(activity, C31923Bi4.cancelButton);
        this.f11818f = (Button) C40788fB0.m41779c(activity, C31923Bi4.retakeButton);
        this.f11819g = (Button) C40788fB0.m41779c(activity, C31923Bi4.usePhotoButton);
        this.f11820h = (ProgressBar) C40788fB0.m41779c(activity, C31923Bi4.progressBar);
        this.f11821i = (ImageView) C40788fB0.m41779c(activity, C31923Bi4.imagePreview);
        this.f11822j = (TextView) C40788fB0.m41779c(activity, C31923Bi4.infoText);
        this.f11823k = C40788fB0.m41779c(activity, C31923Bi4.infoView);
        this.f11824l = (ImageView) C40788fB0.m41779c(activity, C31923Bi4.infoViewIcon);
        this.f11825m = (TextView) C40788fB0.m41779c(activity, C31923Bi4.infoViewTitle);
        this.f11826n = (TextView) C40788fB0.m41779c(activity, C31923Bi4.infoViewBody);
        this.f11827o = (LinearLayout) C40788fB0.m41779c(activity, C31923Bi4.pictureTaken);
        this.f11828p = (RelativeLayout) C40788fB0.m41779c(activity, C31923Bi4.takingPicture);
    }

    @Override // p000.FN4
    /* renamed from: C1 */
    public Observable<Unit> mo105185C1() {
        return C44626lf5.clicksThrottle$default(this.f11816d, 0L, 1, null);
    }

    /* renamed from: Pl */
    public final void m105184Pl(String str) {
        this.f11822j.setText(str);
        C49520tu6.m11233r(this.f11822j);
    }

    /* renamed from: Ql */
    public final void m105183Ql(PhotoBannerViewModel photoBannerViewModel) {
        boolean z;
        Integer infoViewIconAfter = photoBannerViewModel.getInfoViewIconAfter();
        if (infoViewIconAfter != null) {
            this.f11824l.setImageDrawable(getActivity().getDrawable(infoViewIconAfter.intValue()));
            Unit unit = Unit.INSTANCE;
        }
        Integer infoViewTitleAfter = photoBannerViewModel.getInfoViewTitleAfter();
        if (infoViewTitleAfter != null) {
            this.f11825m.setText(getActivity().getString(infoViewTitleAfter.intValue()));
        }
        Integer infoViewBodyAfter = photoBannerViewModel.getInfoViewBodyAfter();
        if (infoViewBodyAfter != null) {
            this.f11826n.setText(getActivity().getString(infoViewBodyAfter.intValue()));
        }
        View view = this.f11823k;
        if (photoBannerViewModel.getInfoViewIconAfter() == null && photoBannerViewModel.getInfoViewTitleAfter() == null && photoBannerViewModel.getInfoViewBodyAfter() == null) {
            z = false;
        } else {
            z = true;
        }
        C49520tu6.show$default(view, z, 0, 2, null);
    }

    /* renamed from: Rl */
    public final void m105182Rl(PhotoBannerViewModel photoBannerViewModel) {
        boolean z;
        boolean z2;
        boolean z3;
        ImageView imageView = this.f11824l;
        boolean z4 = true;
        if (photoBannerViewModel.getInfoViewIcon() != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(imageView, z, 0, 2, null);
        TextView textView = this.f11825m;
        if (photoBannerViewModel.getInfoViewTitle() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C49520tu6.show$default(textView, z2, 0, 2, null);
        TextView textView2 = this.f11826n;
        if (photoBannerViewModel.getInfoViewBody() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C49520tu6.show$default(textView2, z3, 0, 2, null);
        Integer infoViewIcon = photoBannerViewModel.getInfoViewIcon();
        if (infoViewIcon != null) {
            Drawable drawable = getActivity().getDrawable(infoViewIcon.intValue());
            Integer infoIconTint = photoBannerViewModel.getInfoIconTint();
            if (infoIconTint != null) {
                int intValue = infoIconTint.intValue();
                if (drawable != null) {
                    drawable.setTint(NA0.m94301c(getActivity(), intValue));
                }
            }
            this.f11824l.setImageDrawable(drawable);
            Unit unit = Unit.INSTANCE;
        }
        Integer infoViewTitle = photoBannerViewModel.getInfoViewTitle();
        if (infoViewTitle != null) {
            this.f11825m.setText(getActivity().getString(infoViewTitle.intValue()));
        }
        Integer infoViewBody = photoBannerViewModel.getInfoViewBody();
        if (infoViewBody != null) {
            this.f11826n.setText(getActivity().getString(infoViewBody.intValue()));
        }
        View view = this.f11823k;
        if (photoBannerViewModel.getInfoViewIcon() == null && photoBannerViewModel.getInfoViewTitle() == null && photoBannerViewModel.getInfoViewBody() == null) {
            z4 = false;
        }
        C49520tu6.show$default(view, z4, 0, 2, null);
    }

    @Override // p000.FN4
    /* renamed from: U5 */
    public Observable<Unit> mo105181U5() {
        return C44626lf5.clicksThrottle$default(this.f11819g, 0L, 1, null);
    }

    @Override // p000.FN4
    /* renamed from: Z */
    public AbstractC23442F<Bitmap> mo105180Z() {
        C49520tu6.show$default(this.f11820h, true, 0, 2, null);
        return this.f11815c.m54682A();
    }

    @Override // p000.FN4
    /* renamed from: ga */
    public void mo105179ga(PhotoBannerViewModel photoBannerViewModel) {
        this.f11814b = photoBannerViewModel;
        if (photoBannerViewModel != null) {
            Integer infoText = photoBannerViewModel.getInfoText();
            if (infoText != null) {
                String string = getActivity().getString(infoText.intValue());
                Intrinsics.checkNotNullExpressionValue(string, "activity.getString(res)");
                m105184Pl(string);
            }
            m105182Rl(photoBannerViewModel);
        }
    }

    @Override // p000.FN4
    /* renamed from: j7 */
    public void mo105178j7(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        C49520tu6.show$default(this.f11820h, false, 0, 2, null);
        C49520tu6.m11239l(this.f11815c);
        C49520tu6.m11233r(this.f11827o);
        C49520tu6.m11239l(this.f11828p);
        PhotoBannerViewModel photoBannerViewModel = this.f11814b;
        if (photoBannerViewModel != null) {
            m105183Ql(photoBannerViewModel);
        }
        this.f11821i.setImageBitmap(image);
        C49520tu6.m11233r(this.f11821i);
    }

    @Override // p000.FN4
    /* renamed from: l1 */
    public Observable<Unit> mo105177l1() {
        return C44626lf5.clicksThrottle$default(this.f11817e, 0L, 1, null);
    }

    @Override // p000.FN4
    /* renamed from: nh */
    public void mo105176nh() {
        C49520tu6.m11239l(this.f11827o);
        C49520tu6.m11233r(this.f11828p);
        PhotoBannerViewModel photoBannerViewModel = this.f11814b;
        if (photoBannerViewModel != null) {
            m105182Rl(photoBannerViewModel);
        }
        C49520tu6.m11233r(this.f11815c);
        C49520tu6.m11239l(this.f11821i);
    }

    @Override // p000.FN4
    public void onPause() {
        this.f11815c.m54655z();
    }

    @Override // p000.FN4
    public void onResume() {
        this.f11815c.m54656y();
    }

    @Override // p000.FN4
    /* renamed from: q8 */
    public Observable<Unit> mo105175q8() {
        return C44626lf5.clicksThrottle$default(this.f11818f, 0L, 1, null);
    }
}
