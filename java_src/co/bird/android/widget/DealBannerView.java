package co.bird.android.widget;

import android.content.Context;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.Deal;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\u0005B\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000f\u0010\u0013B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/widget/DealBannerView;", "Landroid/widget/RelativeLayout;", "Lco/bird/android/model/Deal;", "deal", "", C17296a.f69688o, "b", "Lio/reactivex/Observable;", "", "c", "LPp6;", "LPp6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDealBannerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DealBannerView.kt\nco/bird/android/widget/DealBannerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,54:1\n177#2,2:55\n*S KotlinDebug\n*F\n+ 1 DealBannerView.kt\nco/bird/android/widget/DealBannerView\n*L\n34#1:55,2\n*E\n"})
/* loaded from: classes4.dex */
public final class DealBannerView extends RelativeLayout {

    /* renamed from: c */
    public static final C16504a f67329c = new C16504a(null);

    /* renamed from: b */
    public final C35264Pp6 f67330b;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/DealBannerView$a;", "", "", "PADDING_DP", "I", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.DealBannerView$a */
    /* loaded from: classes4.dex */
    public static final class C16504a {
        public /* synthetic */ C16504a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16504a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DealBannerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C35264Pp6 m89720b = C35264Pp6.m89720b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m89720b, "inflate(context.layoutInflater, this)");
        this.f67330b = m89720b;
        setBackgroundColor(NA0.m94301c(getContext(), C32364Df4.birdWhite));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        int m12002a = (int) C49347td3.m12002a(8, context3);
        setPadding(m12002a, m12002a, m12002a, m12002a);
    }

    /* renamed from: a */
    public final void m54585a(Deal deal) {
        Intrinsics.checkNotNullParameter(deal, "deal");
        this.f67330b.f29128e.setText(deal.getBannerTitle());
        this.f67330b.f29126c.setText(deal.getBannerSubtitle());
        CountdownView countdownView = this.f67330b.f29125b;
        Intrinsics.checkNotNullExpressionValue(countdownView, "binding.countDown");
        CountdownView.init$default(countdownView, deal.getDuration(), null, null, null, Integer.valueOf(C45871nl4.deal_banner_offer_ends_in), new StyleSpan(1), null, Float.valueOf(16.0f), 78, null);
    }

    /* renamed from: b */
    public final void m54584b() {
        this.f67330b.f29128e.setText((CharSequence) null);
        this.f67330b.f29126c.setText((CharSequence) null);
        this.f67330b.f29125b.m54602x();
        C49520tu6.m11239l(this);
    }

    /* renamed from: c */
    public final Observable<Integer> m54583c() {
        return this.f67330b.f29125b.m54603w();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DealBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C35264Pp6 m89720b = C35264Pp6.m89720b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m89720b, "inflate(context.layoutInflater, this)");
        this.f67330b = m89720b;
        setBackgroundColor(NA0.m94301c(getContext(), C32364Df4.birdWhite));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        int m12002a = (int) C49347td3.m12002a(8, context3);
        setPadding(m12002a, m12002a, m12002a, m12002a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DealBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C35264Pp6 m89720b = C35264Pp6.m89720b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m89720b, "inflate(context.layoutInflater, this)");
        this.f67330b = m89720b;
        setBackgroundColor(NA0.m94301c(getContext(), C32364Df4.birdWhite));
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        int m12002a = (int) C49347td3.m12002a(8, context3);
        setPadding(m12002a, m12002a, m12002a, m12002a);
    }
}
