package p000;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.persistence.Announcement;
import co.bird.android.model.persistence.nestedstructures.AssetMedia;
import co.bird.android.model.persistence.nestedstructures.LegacyAsset;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u0016\u0010\f\u001a\u00020\u0004*\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010!\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, m28432d2 = {"LYf;", "LxE;", "Lco/bird/android/model/persistence/Announcement;", "announcement", "", "Ql", "Lio/reactivex/Observable;", "W4", "Pl", "Landroid/widget/ImageView;", "Lco/bird/android/model/persistence/nestedstructures/AssetMedia;", "media", "Rl", "Lco/bird/android/core/mvp/BaseActivity;", "b", "Lco/bird/android/core/mvp/BaseActivity;", "getActivity", "()Lco/bird/android/core/mvp/BaseActivity;", "activity", "Landroid/view/View;", "c", "Landroid/view/View;", "banner", DateTokenConverter.CONVERTER_KEY, "closeButton", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "titleText", "f", "bodyText", "g", "Landroid/widget/ImageView;", "iconView", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Landroid/view/View;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Yf */
/* loaded from: classes2.dex */
public final class C9883Yf extends AbstractC30071xE {

    /* renamed from: b */
    public final BaseActivity f46213b;

    /* renamed from: c */
    public final View f46214c;

    /* renamed from: d */
    public final View f46215d;

    /* renamed from: e */
    public final TextView f46216e;

    /* renamed from: f */
    public final TextView f46217f;

    /* renamed from: g */
    public final ImageView f46218g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9883Yf(BaseActivity activity, View banner) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.f46213b = activity;
        this.f46214c = banner;
        this.f46215d = C49520tu6.m11238m(banner, C52955zi4.closeButton);
        this.f46216e = (TextView) C49520tu6.m11238m(banner, C52955zi4.title);
        this.f46217f = (TextView) C49520tu6.m11238m(banner, C52955zi4.body);
        this.f46218g = (ImageView) C49520tu6.m11238m(banner, C52955zi4.icon);
    }

    /* renamed from: Pl */
    public final Observable<Unit> m74610Pl() {
        Observable<Unit> clicksThrottle$default;
        View view = this.f46215d;
        if (view == null || (clicksThrottle$default = C44626lf5.clicksThrottle$default(view, 0L, 1, null)) == null) {
            Observable<Unit> never = Observable.never();
            Intrinsics.checkNotNullExpressionValue(never, "never()");
            return never;
        }
        return clicksThrottle$default;
    }

    /* renamed from: Ql */
    public final void m74609Ql(Announcement announcement) {
        AssetMedia assetMedia;
        boolean z;
        AssetMedia assetMedia2;
        Intrinsics.checkNotNullParameter(announcement, "announcement");
        TextView textView = this.f46216e;
        if (textView != null) {
            textView.setText(announcement.getAuxiliaryTitle());
        }
        TextView textView2 = this.f46217f;
        if (textView2 != null) {
            textView2.setText(announcement.getAuxiliaryBody());
        }
        ImageView imageView = this.f46218g;
        if (imageView != null) {
            LegacyAsset auxiliaryAsset = announcement.getAuxiliaryAsset();
            if (auxiliaryAsset != null) {
                assetMedia2 = auxiliaryAsset.getMedia();
            } else {
                assetMedia2 = null;
            }
            m74608Rl(imageView, assetMedia2);
        }
        ImageView imageView2 = this.f46218g;
        if (imageView2 != null) {
            LegacyAsset auxiliaryAsset2 = announcement.getAuxiliaryAsset();
            if (auxiliaryAsset2 != null) {
                assetMedia = auxiliaryAsset2.getMedia();
            } else {
                assetMedia = null;
            }
            if (assetMedia != null) {
                z = true;
            } else {
                z = false;
            }
            C49520tu6.show$default(imageView2, z, 0, 2, null);
        }
    }

    /* renamed from: Rl */
    public final void m74608Rl(ImageView imageView, AssetMedia assetMedia) {
        String str;
        if (assetMedia != null) {
            str = assetMedia.getMediaUrl();
        } else {
            str = null;
        }
        if (str != null) {
            ComponentCallbacks2C17096a.m53137u(imageView).m81653k(assetMedia.getMediaUrl()).m16096R0(imageView);
        } else {
            imageView.setImageDrawable(null);
        }
    }

    /* renamed from: W4 */
    public final Observable<Unit> m74607W4() {
        return C44626lf5.clicksThrottle$default(this.f46214c, 0L, 1, null);
    }

    @Override // p000.AbstractC30071xE, p000.AbstractC9344XC, p000.InterfaceC44721lp0
    public BaseActivity getActivity() {
        return this.f46213b;
    }
}
