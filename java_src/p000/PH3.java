package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.widget.CallToActionBanner;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0016R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LPH3;", "LOH3;", "", "incentive", "Ljava/util/Currency;", "currency", "", "c", "", "subtitle", "b", Entry.TYPE_IMAGE, C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lco/bird/android/widget/CallToActionBanner;", "Lco/bird/android/widget/CallToActionBanner;", "parkingSuccessBannerView", "<init>", "(Landroid/content/Context;Lco/bird/android/widget/CallToActionBanner;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: PH3 */
/* loaded from: classes2.dex */
public final class PH3 implements OH3 {

    /* renamed from: a */
    public final Context f28202a;

    /* renamed from: b */
    public final CallToActionBanner f28203b;

    public PH3(Context context, CallToActionBanner parkingSuccessBannerView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parkingSuccessBannerView, "parkingSuccessBannerView");
        this.f28202a = context;
        this.f28203b = parkingSuccessBannerView;
    }

    @Override // p000.OH3
    /* renamed from: a */
    public void mo90511a(int i) {
        this.f28203b.setImage(i);
    }

    @Override // p000.OH3
    /* renamed from: b */
    public void mo90510b(int i) {
        CallToActionBanner callToActionBanner = this.f28203b;
        String string = this.f28202a.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(subtitle)");
        callToActionBanner.setSubtitle(string);
    }

    @Override // p000.OH3
    /* renamed from: c */
    public void mo90509c(long j, Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        String string = this.f28202a.getString(C45871nl4.parking_nest_success_subtitle, C51916xx1.f118396a.m4408d(j, currency, EnumC36501Ux1.SHOW_IF_NON_ZERO));
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…s_subtitle, incentiveStr)");
        this.f28203b.setSubtitle(string);
    }
}
