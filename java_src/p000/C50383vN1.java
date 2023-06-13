package p000;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.viewpager.parallax.ParallaxViewPager;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.viewpagerindicator.CirclePageIndicator;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006'"}, m28432d2 = {"LvN1;", "LxE;", "LuN1;", "", "rules", "", "m3", "", "basePrice", "pricePerMinute", "Ljava/util/Currency;", "currency", "A6", "Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;", "b", "Lco/bird/android/widget/viewpager/parallax/ParallaxViewPager;", "viewPager", "Lcom/viewpagerindicator/CirclePageIndicator;", "c", "Lcom/viewpagerindicator/CirclePageIndicator;", "pageIndicator", "Landroid/widget/Button;", DateTokenConverter.CONVERTER_KEY, "Landroid/widget/Button;", "nextButton", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "pricingMessage", "LKa6;", "f", "LKa6;", "Pl", "()LKa6;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: vN1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C50383vN1 extends AbstractC30071xE implements InterfaceC49791uN1 {

    /* renamed from: b */
    public final ParallaxViewPager f113962b;

    /* renamed from: c */
    public final CirclePageIndicator f113963c;

    /* renamed from: d */
    public final Button f113964d;

    /* renamed from: e */
    public final TextView f113965e;

    /* renamed from: f */
    public final C33959Ka6 f113966f;

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\f"}, m28432d2 = {"vN1$a", "Landroidx/viewpager/widget/ViewPager$i;", "", TransferTable.COLUMN_STATE, "", "onPageScrollStateChanged", "position", "", "positionOffset", "positionOffsetPixels", "onPageScrolled", "onPageSelected", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: vN1$a */
    /* loaded from: classes2.dex */
    public static final class C29521a implements ViewPager.InterfaceC12076i {

        /* renamed from: c */
        public final /* synthetic */ BaseActivity f113968c;

        public C29521a(BaseActivity baseActivity) {
            this.f113968c = baseActivity;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC12076i
        public void onPageSelected(int i) {
            if (i == C50383vN1.this.m8769Pl().getCount() - 1) {
                C50383vN1.this.f113964d.setText(this.f113968c.getString(C45871nl4.how_to_ride_ready_to_go));
            } else {
                C50383vN1.this.f113964d.setText(this.f113968c.getString(C45871nl4.general_next_button));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: vN1$b */
    /* loaded from: classes2.dex */
    public static final class C29522b extends Lambda implements Function1<View, Unit> {

        /* renamed from: h */
        public final /* synthetic */ BaseActivity f113970h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29522b(BaseActivity baseActivity) {
            super(1);
            this.f113970h = baseActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View view) {
            int currentItem = C50383vN1.this.f113962b.getCurrentItem();
            if (currentItem < C50383vN1.this.m8769Pl().getCount() - 1) {
                C50383vN1.this.f113962b.setCurrentItem(currentItem + 1);
            } else {
                this.f113970h.finish();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50383vN1(BaseActivity activity) {
        super(activity);
        List listOf;
        Intrinsics.checkNotNullParameter(activity, "activity");
        ParallaxViewPager parallaxViewPager = (ParallaxViewPager) C40788fB0.m41779c(activity, C36585Vg4.viewPager);
        this.f113962b = parallaxViewPager;
        CirclePageIndicator circlePageIndicator = (CirclePageIndicator) C40788fB0.m41779c(activity, C36585Vg4.pageIndicator);
        this.f113963c = circlePageIndicator;
        Button button = (Button) C40788fB0.m41779c(activity, C36585Vg4.nextButton);
        this.f113964d = button;
        this.f113965e = (TextView) C40788fB0.m41779c(activity, C36585Vg4.pricingMessage);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(C52342yg4.tutorial_unlock), Integer.valueOf(C52342yg4.tutorial_helmet), Integer.valueOf(C52342yg4.tutorial_start_bird), Integer.valueOf(C52342yg4.tutorial_foot_replacement), Integer.valueOf(C52342yg4.tutorial_where), Integer.valueOf(C52342yg4.tutorial_brake), Integer.valueOf(C52342yg4.tutorial_parking), Integer.valueOf(C52342yg4.tutorial_end_ride), 0});
        C33959Ka6 c33959Ka6 = new C33959Ka6(activity, listOf);
        this.f113966f = c33959Ka6;
        parallaxViewPager.setAdapter(c33959Ka6);
        parallaxViewPager.setOffscreenPageLimit(3);
        parallaxViewPager.setPageTransformer(false, new C46796pJ6());
        circlePageIndicator.setOnPageChangeListener(parallaxViewPager.m53931g());
        parallaxViewPager.addOnPageChangeListener(new C29521a(activity));
        float f = activity.getResources().getDisplayMetrics().density;
        circlePageIndicator.setStrokeWidth(1.0f);
        circlePageIndicator.setRadius(4 * f);
        circlePageIndicator.setViewPager(parallaxViewPager);
        C34585Ms2.m94661j(button, new C29522b(activity));
    }

    @Override // p000.InterfaceC49791uN1
    /* renamed from: A6 */
    public void mo8770A6(long j, long j2, Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        EnumC36501Ux1 enumC36501Ux1 = EnumC36501Ux1.SHOW_IF_NON_ZERO;
        this.f113965e.setText(getActivity().getResources().getString(C45871nl4.how_to_ride_pricing, c51916xx1.m4408d(j, currency, enumC36501Ux1), c51916xx1.m4408d(j2, currency, enumC36501Ux1)));
    }

    /* renamed from: Pl */
    public final C33959Ka6 m8769Pl() {
        return this.f113966f;
    }

    @Override // p000.InterfaceC49791uN1
    /* renamed from: m3 */
    public void mo8768m3(String rules) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.f113966f.m98724a(rules);
    }
}
