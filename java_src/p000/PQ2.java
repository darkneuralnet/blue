package p000;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireMerchantSite;
import co.bird.android.model.wire.WireMerchantSiteKt;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u001c\u0010\u0019\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u001c\u0010\u001a\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001c\u0010\u001b\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001c\u0010\u001c\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u001c\u0010\u001d\u001a\n \u0017*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u001c\u0010 \u001a\n \u0017*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u001c\u0010$\u001a\n \u0017*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, m28432d2 = {"LPQ2;", "", "Lco/bird/android/model/wire/WireMerchantSite;", "merchantSite", "", "distance", "", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/Observable;", C17296a.f69688o, "", "tapToPay", "b", "c", "visible", "e", "show", "g", "f", "Landroid/view/View;", "Landroid/view/View;", "merchantInfoView", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "Landroid/widget/TextView;", "merchantName", "merchantDetails", "merchantDistance", "learnMore", "merchantActionContainer", "Landroid/widget/Button;", "Landroid/widget/Button;", "merchantActionButton", "Landroid/widget/ImageView;", "h", "Landroid/widget/ImageView;", "merchantPhoto", "<init>", "(Landroid/view/View;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PQ2 */
/* loaded from: classes2.dex */
public final class PQ2 {

    /* renamed from: a */
    public final View f28445a;

    /* renamed from: b */
    public final TextView f28446b;

    /* renamed from: c */
    public final TextView f28447c;

    /* renamed from: d */
    public final TextView f28448d;

    /* renamed from: e */
    public final TextView f28449e;

    /* renamed from: f */
    public final View f28450f;

    /* renamed from: g */
    public final Button f28451g;

    /* renamed from: h */
    public final ImageView f28452h;

    public PQ2(View merchantInfoView) {
        Intrinsics.checkNotNullParameter(merchantInfoView, "merchantInfoView");
        this.f28445a = merchantInfoView;
        this.f28446b = (TextView) merchantInfoView.findViewById(C52955zi4.titleTextView);
        this.f28447c = (TextView) merchantInfoView.findViewById(C52955zi4.notesTextView);
        this.f28448d = (TextView) merchantInfoView.findViewById(C52955zi4.distanceTextView);
        this.f28449e = (TextView) merchantInfoView.findViewById(C52955zi4.learnMoreTextView);
        this.f28450f = merchantInfoView.findViewById(C52955zi4.merchantActionContainer);
        this.f28451g = (Button) merchantInfoView.findViewById(C52955zi4.merchantActionButton);
        this.f28452h = (ImageView) merchantInfoView.findViewById(C52955zi4.image);
    }

    /* renamed from: a */
    public Observable<Unit> m90319a() {
        View merchantActionContainer = this.f28450f;
        Intrinsics.checkNotNullExpressionValue(merchantActionContainer, "merchantActionContainer");
        return C44626lf5.clicksThrottle$default(merchantActionContainer, 0L, 1, null);
    }

    /* renamed from: b */
    public void m90318b(boolean z) {
        this.f28451g.setText(C45871nl4.merchant_info_action);
    }

    /* renamed from: c */
    public Observable<Unit> m90317c() {
        TextView learnMore = this.f28449e;
        Intrinsics.checkNotNullExpressionValue(learnMore, "learnMore");
        return C44626lf5.clicksThrottle$default(learnMore, 0L, 1, null);
    }

    /* renamed from: d */
    public void m90316d(WireMerchantSite merchantSite, double d) {
        Intrinsics.checkNotNullParameter(merchantSite, "merchantSite");
        this.f28446b.setText(merchantSite.getMerchant().getName());
        TextView textView = this.f28448d;
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        Context context = this.f28445a.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "merchantInfoView.context");
        textView.setText(C51916xx1.distance$default(c51916xx1, context, d, 0.0d, false, 12, null));
        String photoUrl = WireMerchantSiteKt.photoUrl(merchantSite);
        this.f28452h.setVisibility(0);
        ComponentCallbacks2C17096a.m53137u(this.f28452h).m81653k(photoUrl).m16096R0(this.f28452h);
    }

    /* renamed from: e */
    public void m90315e(boolean z) {
        C49520tu6.show$default(this.f28445a, z, 0, 2, null);
    }

    /* renamed from: f */
    public void m90314f(boolean z) {
        View merchantActionContainer = this.f28450f;
        Intrinsics.checkNotNullExpressionValue(merchantActionContainer, "merchantActionContainer");
        C49520tu6.show$default(merchantActionContainer, z, 0, 2, null);
    }

    /* renamed from: g */
    public void m90313g(boolean z) {
        int i;
        if (z) {
            i = C45871nl4.merchant_info_learn_more;
        } else {
            i = C45871nl4.merchant_info_available;
        }
        this.f28449e.setText(i);
    }
}
