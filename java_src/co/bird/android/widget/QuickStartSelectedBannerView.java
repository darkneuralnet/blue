package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.widget.QuickStartSelectedBannerView;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0012\u0010\u0016B#\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0018J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tJ\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/widget/QuickStartSelectedBannerView;", "Landroidx/cardview/widget/CardView;", "LuS;", "", "priceString", "", "maxLines", "", "setPriceString", "Lio/reactivex/Observable;", "s", "G1", "LXs6;", "k", "LXs6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class QuickStartSelectedBannerView extends CardView implements InterfaceC29196uS {

    /* renamed from: k */
    public final C37163Xs6 f67526k;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.QuickStartSelectedBannerView$a */
    /* loaded from: classes4.dex */
    public static final class C16562a extends Lambda implements Function1<Unit, Unit> {

        /* renamed from: g */
        public static final C16562a f67527g = new C16562a();

        public C16562a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C41318g46.m40163a("clicked on cta", new Object[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickStartSelectedBannerView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        C37163Xs6 m76177c = C37163Xs6.m76177c(C40788fB0.m41772j(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(m76177c, "inflate(context.layoutInflater, this, true)");
        this.f67526k = m76177c;
    }

    /* renamed from: t */
    public static final void m54462t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC29196uS
    /* renamed from: G1 */
    public Observable<Unit> mo10275G1() {
        TextView textView = this.f67526k.f44122e;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.priceString");
        return C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
    }

    /* renamed from: s */
    public final Observable<Unit> m54463s() {
        TextView textView = this.f67526k.f44120c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.callToAction");
        Observable clicksThrottle$default = C44626lf5.clicksThrottle$default(textView, 0L, 1, null);
        final C16562a c16562a = C16562a.f67527g;
        Observable<Unit> doOnNext = clicksThrottle$default.doOnNext(new InterfaceC23484g() { // from class: je4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                QuickStartSelectedBannerView.m54462t(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "binding.callToAction.cli…ber.d(\"clicked on cta\") }");
        return doOnNext;
    }

    @Override // p000.InterfaceC29196uS
    public void setPriceString(String str, int i) {
        boolean z;
        this.f67526k.f44122e.setText(str);
        this.f67526k.f44122e.setMaxLines(i);
        Group group = this.f67526k.f44123f;
        Intrinsics.checkNotNullExpressionValue(group, "binding.priceStringGroup");
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        C49520tu6.show$default(group, z, 0, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickStartSelectedBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        C37163Xs6 m76177c = C37163Xs6.m76177c(C40788fB0.m41772j(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(m76177c, "inflate(context.layoutInflater, this, true)");
        this.f67526k = m76177c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickStartSelectedBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C37163Xs6 m76177c = C37163Xs6.m76177c(C40788fB0.m41772j(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(m76177c, "inflate(context.layoutInflater, this, true)");
        this.f67526k = m76177c;
    }
}
