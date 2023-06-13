package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.FrequentFlyerScannerView;
import co.bird.android.widget.RetakeablePhotoView;
import com.airbnb.lottie.LottieAnimationView;
/* renamed from: R5 */
/* loaded from: classes3.dex */
public final class C7063R5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LinearLayout f31485a;

    /* renamed from: b */
    public final LottieAnimationView f31486b;

    /* renamed from: c */
    public final AppCompatTextView f31487c;

    /* renamed from: d */
    public final Barrier f31488d;

    /* renamed from: e */
    public final AppCompatTextView f31489e;

    /* renamed from: f */
    public final AppCompatTextView f31490f;

    /* renamed from: g */
    public final AppCompatTextView f31491g;

    /* renamed from: h */
    public final FrequentFlyerScannerView f31492h;

    /* renamed from: i */
    public final ConstraintLayout f31493i;

    /* renamed from: j */
    public final Button f31494j;

    /* renamed from: k */
    public final ImageView f31495k;

    /* renamed from: l */
    public final TextView f31496l;

    /* renamed from: m */
    public final ImageView f31497m;

    /* renamed from: n */
    public final RatingBar f31498n;

    /* renamed from: o */
    public final LinearLayout f31499o;

    /* renamed from: p */
    public final RetakeablePhotoView f31500p;

    /* renamed from: q */
    public final Button f31501q;

    /* renamed from: r */
    public final TextView f31502r;

    /* renamed from: s */
    public final TextView f31503s;

    /* renamed from: t */
    public final TextView f31504t;

    /* renamed from: u */
    public final AppCompatTextView f31505u;

    /* renamed from: v */
    public final Button f31506v;

    public C7063R5(LinearLayout linearLayout, LottieAnimationView lottieAnimationView, AppCompatTextView appCompatTextView, Barrier barrier, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, FrequentFlyerScannerView frequentFlyerScannerView, ConstraintLayout constraintLayout, Button button, ImageView imageView, TextView textView, ImageView imageView2, RatingBar ratingBar, LinearLayout linearLayout2, RetakeablePhotoView retakeablePhotoView, Button button2, TextView textView2, TextView textView3, TextView textView4, AppCompatTextView appCompatTextView5, Button button3) {
        this.f31485a = linearLayout;
        this.f31486b = lottieAnimationView;
        this.f31487c = appCompatTextView;
        this.f31488d = barrier;
        this.f31489e = appCompatTextView2;
        this.f31490f = appCompatTextView3;
        this.f31491g = appCompatTextView4;
        this.f31492h = frequentFlyerScannerView;
        this.f31493i = constraintLayout;
        this.f31494j = button;
        this.f31495k = imageView;
        this.f31496l = textView;
        this.f31497m = imageView2;
        this.f31498n = ratingBar;
        this.f31499o = linearLayout2;
        this.f31500p = retakeablePhotoView;
        this.f31501q = button2;
        this.f31502r = textView2;
        this.f31503s = textView3;
        this.f31504t = textView4;
        this.f31505u = appCompatTextView5;
        this.f31506v = button3;
    }

    /* renamed from: a */
    public static C7063R5 m87332a(View view) {
        int i = C35892Sh4.animationView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C34328Lp6.m96312a(view, i);
        if (lottieAnimationView != null) {
            i = C35892Sh4.banner;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C34328Lp6.m96312a(view, i);
            if (appCompatTextView != null) {
                i = C35892Sh4.centerImage;
                Barrier barrier = (Barrier) C34328Lp6.m96312a(view, i);
                if (barrier != null) {
                    i = C35892Sh4.cost;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C34328Lp6.m96312a(view, i);
                    if (appCompatTextView2 != null) {
                        i = C35892Sh4.distance;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) C34328Lp6.m96312a(view, i);
                        if (appCompatTextView3 != null) {
                            i = C35892Sh4.duration;
                            AppCompatTextView appCompatTextView4 = (AppCompatTextView) C34328Lp6.m96312a(view, i);
                            if (appCompatTextView4 != null) {
                                i = C35892Sh4.frequentFlyerStatus;
                                FrequentFlyerScannerView frequentFlyerScannerView = (FrequentFlyerScannerView) C34328Lp6.m96312a(view, i);
                                if (frequentFlyerScannerView != null) {
                                    i = C35892Sh4.helmetBanner;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) C34328Lp6.m96312a(view, i);
                                    if (constraintLayout != null) {
                                        i = C35892Sh4.helmetBannerCta;
                                        Button button = (Button) C34328Lp6.m96312a(view, i);
                                        if (button != null) {
                                            i = C35892Sh4.helmetBannerIcon;
                                            ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
                                            if (imageView != null) {
                                                i = C35892Sh4.helmetBannerTitle;
                                                TextView textView = (TextView) C34328Lp6.m96312a(view, i);
                                                if (textView != null) {
                                                    i = C35892Sh4.imageView;
                                                    ImageView imageView2 = (ImageView) C34328Lp6.m96312a(view, i);
                                                    if (imageView2 != null) {
                                                        i = C35892Sh4.ratingBar;
                                                        RatingBar ratingBar = (RatingBar) C34328Lp6.m96312a(view, i);
                                                        if (ratingBar != null) {
                                                            i = C35892Sh4.ratingContainer;
                                                            LinearLayout linearLayout = (LinearLayout) C34328Lp6.m96312a(view, i);
                                                            if (linearLayout != null) {
                                                                i = C35892Sh4.retakeablePhotoView;
                                                                RetakeablePhotoView retakeablePhotoView = (RetakeablePhotoView) C34328Lp6.m96312a(view, i);
                                                                if (retakeablePhotoView != null) {
                                                                    i = C35892Sh4.rideReport;
                                                                    Button button2 = (Button) C34328Lp6.m96312a(view, i);
                                                                    if (button2 != null) {
                                                                        i = C35892Sh4.rideSummarySubText;
                                                                        TextView textView2 = (TextView) C34328Lp6.m96312a(view, i);
                                                                        if (textView2 != null) {
                                                                            i = C35892Sh4.rideSummarySubtitle;
                                                                            TextView textView3 = (TextView) C34328Lp6.m96312a(view, i);
                                                                            if (textView3 != null) {
                                                                                i = C35892Sh4.rideSummaryTitle;
                                                                                TextView textView4 = (TextView) C34328Lp6.m96312a(view, i);
                                                                                if (textView4 != null) {
                                                                                    i = C35892Sh4.strikeThroughCost;
                                                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) C34328Lp6.m96312a(view, i);
                                                                                    if (appCompatTextView5 != null) {
                                                                                        i = C35892Sh4.viewReceiptButton;
                                                                                        Button button3 = (Button) C34328Lp6.m96312a(view, i);
                                                                                        if (button3 != null) {
                                                                                            return new C7063R5((LinearLayout) view, lottieAnimationView, appCompatTextView, barrier, appCompatTextView2, appCompatTextView3, appCompatTextView4, frequentFlyerScannerView, constraintLayout, button, imageView, textView, imageView2, ratingBar, linearLayout, retakeablePhotoView, button2, textView2, textView3, textView4, appCompatTextView5, button3);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C7063R5 m87330c(LayoutInflater layoutInflater) {
        return m87329d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C7063R5 m87329d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C32868Fj4.activity_ride_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87332a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f31485a;
    }
}
